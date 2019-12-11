import javax.swing.*;
import java.awt.*;

import static input.InputUtils.stringInput;

public class pokemonInfo extends JFrame {

    private JPanel mainPanel;
    private JLabel pokemonSprite;
    private JLabel selectedPokemon;

    pokemonInfo() {

        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300, 150));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }



}
