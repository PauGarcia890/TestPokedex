package com.paugarciafontdecaba.pmdm.testpokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_POKEMON = "SEND_POKEMON";
    public static final String EXTRA_IMAGE = "POKEMON_IMAGE";
    private ImageButton BulbasurButton;
    private ImageButton CharmanderButton;
    private ImageButton SquirtleButton;
    private ImageButton PikachuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BulbasurButton = (ImageButton) findViewById(R.id.iBulbasur);
        CharmanderButton = (ImageButton) findViewById(R.id.iCharmander);
        SquirtleButton = (ImageButton) findViewById(R.id.iSquirtle);
        PikachuButton = (ImageButton) findViewById(R.id.iPikachu);
    }

    public void PokemonButtonClick(View view) {
        int buttonId = view.getId();
        Intent openPokemonIntent = new Intent(this, PokemonActivity.class);
        switch (buttonId) {
            case R.id.iBulbasur:
                Pokemon bulbasur = new Pokemon("Bulbasur",
                        "001",
                        "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.",
                        new String[]{"Planta", "Veneno"},
                        new String[]{"Fuego", "Volador"},
                        R.drawable.ic_bulbasur);
                openPokemonIntent.putExtra(EXTRA_POKEMON, bulbasur);
                startActivity(openPokemonIntent);
                break;

            case R.id.iCharmander:
                Pokemon charmander = new Pokemon("Charmander",
                        "004",
                        "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola.",
                        new String[]{"Fuego"},
                        new String[]{"Agua", "Tierra", "Roca"},
                        R.drawable.ic_charmander);
                openPokemonIntent.putExtra(EXTRA_POKEMON, charmander);
                startActivity(openPokemonIntent);
                break;

            case R.id.iSquirtle:
                Pokemon squirtle = new Pokemon("Squirtle",
                        "007",
                        "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.",
                        new String[]{"Agua"},
                        new String[]{"Planta", "Electrico"},
                        R.drawable.ic_squirtle);
                openPokemonIntent.putExtra(EXTRA_POKEMON, squirtle);
                startActivity(openPokemonIntent);
                break;

            case R.id.iPikachu:
                Pokemon pikachu = new Pokemon("Pikachu ",
                        "025",
                        "Cuanto más potente es la energía eléctrica que genera este Pokémon, más suaves y elásticas se vuelven las bolsas de sus mejillas.",
                        new String[]{"Electrico"},
                        new String[]{"Tierra", "Roca"},
                        R.drawable.ic_pikachu);
                openPokemonIntent.putExtra(EXTRA_POKEMON, pikachu);
                startActivity(openPokemonIntent);
                break;
        }
    }
}