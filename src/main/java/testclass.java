import eu.iamgio.pokedex.pokemon.Pokemon;
import eu.iamgio.pokedex.pokemon.PokemonType;
import eu.iamgio.pokedex.pokemon.Sprite;
import eu.iamgio.pokedex.pokemon.move.PokemonMove;
import eu.iamgio.pokedex.pokemon.move.PokemonPersonalMove;
import eu.iamgio.pokedex.util.Pair;

import java.util.List;

import static input.InputUtils.stringInput;

public class testclass {

    public static void main(String[] args) {

        String userInput = stringInput("What pokemon would you like to search for?");

        Pokemon pokemon = Pokemon.fromName(userInput);
        Pair<PokemonType, PokemonType> types = pokemon.getTypes();
        System.out.println(types.getFirst());
        System.out.println(types.getSecond());


        List<PokemonPersonalMove> moves = pokemon.getMoves();

        for(int i = 0; i < moves.size(); i++) {
            String noDash = moves.get(i).getName().replace("-", " ");

            String uppercase = noDash.substring(0,1).toUpperCase() + noDash.substring(1);
            System.out.println(uppercase);

        //    String[] splitString = noDash.split(" ");
         /*   for (int x = 0; x < splitString.length; x++) {

                System.out.println(splitString[x]); */

          /*      String uppercase = splitString[x].substring(0,1).toUpperCase() + splitString[x].substring(1);
                String testy = uppercase.concat(uppercase.substring(1));
                System.out.println(testy); */
            }
        //    String uppercase = noDash.substring(0,1).toUpperCase() + noDash.substring(1);
       //     System.out.println(uppercase);


        Pokemon allPokemon = Pokemon


        }

      //  System.out.println(moves);
      //  System.out.println(pokemon.getSprite(Sprite.Type.FRONT_DEFAULT));

    }


