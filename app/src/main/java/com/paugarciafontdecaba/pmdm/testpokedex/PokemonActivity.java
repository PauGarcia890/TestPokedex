package com.paugarciafontdecaba.pmdm.testpokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonActivity extends AppCompatActivity {
    private Pokemon SentPokemon;
    private TextView PokeDescription;
    private TextView PokeType;
    private TextView PokeWeak;
    private TextView PokeName;
    private ImageView PokeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        PokeName = (TextView) findViewById(R.id.NamePokemon);
        PokeDescription = (TextView) findViewById(R.id.DescriptionPokemon);
        PokeType = (TextView) findViewById(R.id.TypePokemon);
        PokeWeak = (TextView) findViewById(R.id.WeakPokemon);
        PokeImage = (ImageView) findViewById(R.id.PicturePokemon);

        Intent pokemonIntent = getIntent();
        SentPokemon = (Pokemon) pokemonIntent.getSerializableExtra(MainActivity.EXTRA_POKEMON);

        if (SentPokemon != null) {
            PokeName.setText(SentPokemon.GetName());
            PokeDescription.setText(SentPokemon.GetDescription());
            PokeType.setText(GetPokemonTypes());
            PokeWeak.setText(GetPokemonWeakness());
            PokeImage.setImageDrawable(getDrawable(SentPokemon.GetImageName()));
        }
    }

    private String GetPokemonTypes() {
        StringBuilder text = new StringBuilder();
        text.append(PokeType.getText());
        text.append("\n");
        for (String types : SentPokemon.GetType()) {
            text.append("- " + types + "\n");
        }
        return text.toString();
    }

    private String GetPokemonWeakness() {
        StringBuilder text = new StringBuilder();
        text.append(PokeWeak.getText());
        text.append("\n");
        for (String weak : SentPokemon.GetWeaknesses()) {
            text.append("- " + weak + "\n");
        }
        return text.toString();
    }
}