import eu.iamgio.pokedex.connection.HttpConnection;
import eu.iamgio.pokedex.pokedex.Pokedex;
import eu.iamgio.pokedex.pokemon.Pokemon;
import eu.iamgio.pokedex.pokemon.PokemonType;
import eu.iamgio.pokedex.util.Pair;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PokedexDatabase {

    private static final String DB_CONNECTION_URL = "jdbc:sqlite:dex.sqlite";

    private static String DEX_NUM = "dexnum";
    private static String POKE_NAME = "pokeName";
    private static String TYPE_1 = "type1";
    private static String TYPE_2 = "type2";

    PokedexDatabase() {

        try (Connection conn = DriverManager.getConnection(DB_CONNECTION_URL);
             Statement statement = conn.createStatement()) {

            // Create a table in the database, if it does not exist already
            String createTableSQL = "CREATE TABLE IF NOT EXISTS dex " + "(dexnum INTEGER PRIMARY KEY, pokeName TEXT, type1 TEXT, type2 TEXT)";
            statement.executeUpdate(createTableSQL);

            String insertDataSql = "INSERT INTO dex VALUES (retrieveInfo(int dex, String pN, String t1, String t2))";
            statement.execute(insertDataSql);

        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }

    }

    public static void retrieveInfo(int dex, String pN, String t1, String t2) {

        List<Pokemon> allPokemon;

        //

        String testy = "";

        Pokemon pokemonName = Pokemon.fromName(testy);
        Pair<PokemonType, PokemonType> types = pokemonName.getTypes();

        dex = pokemonName.getId();
        pN = pokemonName.getName();
        t1 = String.valueOf(types.getFirst());
        t2 = String.valueOf(types.getFirst());

    }


}
