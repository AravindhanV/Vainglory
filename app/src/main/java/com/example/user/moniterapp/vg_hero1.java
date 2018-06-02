package com.example.user.moniterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;


public class vg_hero1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vg_hero1);
        setTheme(R.style.vg_theme);

        Intent intent = getIntent();
        ListView buildsListView = findViewById(R.id.builds);
        ListView countersListView = findViewById(R.id.counters);
        int heroIndex = intent.getIntExtra("HeroName",-1);

        ArrayList<Hero_Builds> required = new ArrayList<>();
        ArrayList<Hero_Builds> ar = new ArrayList<>();

        ar.add(new Hero_Builds(0,R.drawable.alternating_current,R.drawable.dragon_eye,R.drawable.aegis,R.drawable.broken_myth,R.drawable.journey_boots,R.drawable.metal_jacket));
        ar.add(new Hero_Builds(0,R.drawable.sorrowblade,R.drawable.tornado_trigger,R.drawable.tyrants_monocle,R.drawable.aegis,R.drawable.tyrants_monocle,R.drawable.metal_jacket));
        ar.add(new Hero_Builds(0,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.war_treads,R.drawable.clockwork,R.drawable.metal_jacket,R.drawable.shatterglass));

        ar.add(new Hero_Builds(1,R.drawable.aftershock,R.drawable.shatterglass,R.drawable.aegis,R.drawable.dragon_eye,R.drawable.journey_boots,R.drawable.metal_jacket));
        ar.add(new Hero_Builds(1,R.drawable.spellsword,R.drawable.breaking_point,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.sorrowblade,R.drawable.journey_boots));

        ar.add(new Hero_Builds(2,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.war_treads,R.drawable.atlas_pauldron,R.drawable.echo,R.drawable.contraption));
        ar.add(new Hero_Builds(2,R.drawable.sorrowblade,R.drawable.shiversteel,R.drawable.breaking_point,R.drawable.aegis,R.drawable.war_treads,R.drawable.bonesaw));
        ar.add(new Hero_Builds(2,R.drawable.stormcrown,R.drawable.fountain_of_renewal,R.drawable.clockwork,R.drawable.crucible,R.drawable.war_treads,R.drawable.aftershock));

        ar.add(new Hero_Builds(3,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.clockwork,R.drawable.war_treads,R.drawable.atlas_pauldron,R.drawable.dragon_eye));
        ar.add(new Hero_Builds(3,R.drawable.serpant_mask,R.drawable.breaking_point,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.bonesaw,R.drawable.journey_boots));
        ar.add(new Hero_Builds(3,R.drawable.dragon_eye,R.drawable.clockwork,R.drawable.broken_myth,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.journey_boots));

        ar.add(new Hero_Builds(4,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.tyrants_monocle,R.drawable.aegis,R.drawable.journey_boots,R.drawable.metal_jacket));
        ar.add(new Hero_Builds(4,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.tyrants_monocle,R.drawable.tyrants_monocle,R.drawable.tornado_trigger,R.drawable.journey_boots));
        ar.add(new Hero_Builds(4,R.drawable.sorrowblade,R.drawable.clockwork,R.drawable.broken_myth,R.drawable.aegis,R.drawable.dragon_eye,R.drawable.journey_boots));

        ar.add(new Hero_Builds(5,R.drawable.aftershock,R.drawable.stormcrown,R.drawable.dragon_eye,R.drawable.aegis,R.drawable.journey_boots,R.drawable.broken_myth));
        ar.add(new Hero_Builds(5,R.drawable.shatterglass,R.drawable.clockwork,R.drawable.broken_myth,R.drawable.dragon_eye,R.drawable.halcyon_chargers,R.drawable.alternating_current));
        ar.add(new Hero_Builds(5,R.drawable.serpant_mask,R.drawable.breaking_point,R.drawable.aegis,R.drawable.shiversteel,R.drawable.journey_boots,R.drawable.metal_jacket));

        ar.add(new Hero_Builds(6,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.stormcrown,R.drawable.war_treads,R.drawable.aftershock,R.drawable.atlas_pauldron));
        ar.add(new Hero_Builds(6,R.drawable.fountain_of_renewal,R.drawable.stormcrown,R.drawable.crucible,R.drawable.aftershock,R.drawable.war_treads,R.drawable.clockwork));

        ar.add(new Hero_Builds(7,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.broken_myth,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(7,R.drawable.dragon_eye,R.drawable.broken_myth,R.drawable.clockwork,R.drawable.frostburn,R.drawable.aegis,R.drawable.journey_boots));

        ar.add(new Hero_Builds(8,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.war_treads,R.drawable.metal_jacket,R.drawable.clockwork,R.drawable.nullwave_gauntlet));
        ar.add(new Hero_Builds(8,R.drawable.fountain_of_renewal,R.drawable.nullwave_gauntlet,R.drawable.war_treads,R.drawable.crucible,R.drawable.atlas_pauldron,R.drawable.aftershock));

        ar.add(new Hero_Builds(9,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.shiversteel,R.drawable.stormcrown,R.drawable.war_treads,R.drawable.atlas_pauldron));
        ar.add(new Hero_Builds(9,R.drawable.stormcrown,R.drawable.fountain_of_renewal,R.drawable.aftershock,R.drawable.war_treads,R.drawable.clockwork,R.drawable.slumbering_husk));

        ar.add(new Hero_Builds(10,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.war_treads,R.drawable.atlas_pauldron,R.drawable.stormcrown,R.drawable.aftershock));
        ar.add(new Hero_Builds(10,R.drawable.stormcrown,R.drawable.aftershock,R.drawable.aegis,R.drawable.clockwork,R.drawable.war_treads,R.drawable.metal_jacket));

        ar.add(new Hero_Builds(11,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.stormcrown,R.drawable.war_treads,R.drawable.aftershock,R.drawable.clockwork));
        ar.add(new Hero_Builds(11,R.drawable.tension_bow,R.drawable.sorrowblade,R.drawable.aegis,R.drawable.breaking_point,R.drawable.journey_boots,R.drawable.metal_jacket));

        ar.add(new Hero_Builds(12,R.drawable.fountain_of_renewal,R.drawable.dragon_eye,R.drawable.war_treads,R.drawable.crucible,R.drawable.aftershock,R.drawable.clockwork));
        ar.add(new Hero_Builds(12,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.shatterglass,R.drawable.war_treads,R.drawable.atlas_pauldron,R.drawable.clockwork));
        ar.add(new Hero_Builds(12,R.drawable.tension_bow,R.drawable.sorrowblade,R.drawable.tyrants_monocle,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.journey_boots));

        ar.add(new Hero_Builds(13,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.war_treads,R.drawable.aftershock,R.drawable.atlas_pauldron,R.drawable.clockwork));
        ar.add(new Hero_Builds(13,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.poisoned_shiv,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.journey_boots));
        ar.add(new Hero_Builds(13,R.drawable.stormcrown,R.drawable.aftershock,R.drawable.aegis,R.drawable.journey_boots,R.drawable.metal_jacket,R.drawable.dragon_eye));

        ar.add(new Hero_Builds(14,R.drawable.tension_bow,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.aegis,R.drawable.journey_boots,R.drawable.metal_jacket));
        ar.add(new Hero_Builds(14,R.drawable.shatterglass,R.drawable.broken_myth,R.drawable.broken_myth,R.drawable.slumbering_husk,R.drawable.dragon_eye,R.drawable.journey_boots));

        ar.add(new Hero_Builds(15,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.poisoned_shiv,R.drawable.aegis,R.drawable.journey_boots,R.drawable.metal_jacket));
        ar.add(new Hero_Builds(15,R.drawable.alternating_current,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.broken_myth,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(15,R.drawable.aftershock,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.broken_myth,R.drawable.journey_boots,R.drawable.shatterglass));

        ar.add(new Hero_Builds(39,R.drawable.poisoned_shiv,R.drawable.breaking_point,R.drawable.sorrowblade,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(39,R.drawable.alternating_current,R.drawable.dragon_eye,R.drawable.broken_myth,R.drawable.eve_of_harvest,R.drawable.aegis,R.drawable.journey_boots));

     
        ar.add(new Hero_Builds(38,R.drawable.alternating_current,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(38,R.drawable.shatterglass,R.drawable.dragon_eye,R.drawable.clockwork,R.drawable.spellfire,R.drawable.broken_myth,R.drawable.journey_boots));
        ar.add(new Hero_Builds(37,R.drawable.tension_bow,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(37,R.drawable.fountain_of_renewal,R.drawable.crucible,R.drawable.atlas_pauldron,R.drawable.war_treads,R.drawable.shiversteel,R.drawable.slumbering_husk));
        ar.add(new Hero_Builds(36,R.drawable.tension_bow,R.drawable.spellsword,R.drawable.breaking_point,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.journey_boots));
        ar.add(new Hero_Builds(36,R.drawable.aftershock,R.drawable.clockwork,R.drawable.broken_myth,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(36,R.drawable.aftershock,R.drawable.clockwork,R.drawable.tension_bow,R.drawable.spellsword,R.drawable.aegis,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(35,R.drawable.frostburn,R.drawable.eve_of_harvest,R.drawable.spellfire,R.drawable.aegis,R.drawable.shatterglass,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(35,R.drawable.poisoned_shiv,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(34,R.drawable.eve_of_harvest,R.drawable.frostburn,R.drawable.spellfire,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(34,R.drawable.shatterglass,R.drawable.spellfire,R.drawable.broken_myth,R.drawable.halcyon_chargers,R.drawable.aegis,R.drawable.slumbering_husk));
        ar.add(new Hero_Builds(33,R.drawable.serpant_mask,R.drawable.breaking_point,R.drawable.tyrants_monocle,R.drawable.aegis,R.drawable.metal_jacket,R.drawable.journey_boots));
        ar.add(new Hero_Builds(33,R.drawable.serpant_mask,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.slumbering_husk,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(33,R.drawable.shatterglass,R.drawable.eve_of_harvest,R.drawable.broken_myth,R.drawable.spellfire,R.drawable.halcyon_chargers,R.drawable.slumbering_husk));
        ar.add(new Hero_Builds(32,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.clockwork,R.drawable.broken_myth,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(32,R.drawable.dragon_eye,R.drawable.eve_of_harvest,R.drawable.broken_myth,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(31,R.drawable.serpant_mask,R.drawable.breaking_point,R.drawable.sorrowblade,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(31,R.drawable.alternating_current,R.drawable.shatterglass,R.drawable.broken_myth,R.drawable.slumbering_husk,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(30,R.drawable.spellsword,R.drawable.sorrowblade,R.drawable.breaking_point,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.journey_boots));
        ar.add(new Hero_Builds(30,R.drawable.spellsword,R.drawable.breaking_point,R.drawable.tyrants_monocle,R.drawable.tornado_trigger,R.drawable.slumbering_husk,R.drawable.journey_boots));
        ar.add(new Hero_Builds(30,R.drawable.alternating_current,R.drawable.shatterglass,R.drawable.dragon_eye,R.drawable.aegis,R.drawable.broken_myth,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(29,R.drawable.aftershock,R.drawable.stormcrown,R.drawable.clockwork,R.drawable.aegis,R.drawable.broken_myth,R.drawable.journey_boots));
        ar.add(new Hero_Builds(28,R.drawable.eve_of_harvest,R.drawable.dragon_eye,R.drawable.broken_myth,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.halcyon_chargers));
        ar.add(new Hero_Builds(28,R.drawable.eve_of_harvest,R.drawable.dragon_eye,R.drawable.clockwork,R.drawable.metal_jacket,R.drawable.aegis,R.drawable.halcyon_chargers));


        for(int i=0;i<ar.size();i++){
            if(ar.get(i).getHeroIndex()==heroIndex){
                required.add(new Hero_Builds(heroIndex,ar.get(i).getHeroImage1(),ar.get(i).getHeroImage2(),ar.get(i).getHeroImage3(),ar.get(i).getHeroImage4(),ar.get(i).getHeroImage5(),ar.get(i).getHeroImage6()));
            }
        }

        buildsAdapter adapter = new buildsAdapter(this,required);
        buildsListView.setAdapter(adapter);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return(super.onOptionsItemSelected(item));
    }
}
