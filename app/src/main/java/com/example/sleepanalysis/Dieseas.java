package com.example.sleepanalysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dieseas extends AppCompatActivity implements View.OnClickListener {
    int ImageDetails;
    String diseasesDetails;
    TextView Diesease;
    Button insomnia,apena,RLS,Circadianrhythmdisorders,hypersomnia,sleepWalking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieseas);

        Diesease=findViewById(R.id.SleepDiesease);

        insomnia = findViewById(R.id.insomia);
        apena = findViewById(R.id.apena);
        RLS=findViewById(R.id.restlessLegSyndrome);
        Circadianrhythmdisorders=findViewById(R.id.narcolepsy);
        hypersomnia=findViewById(R.id.hypersomnia);
        sleepWalking=findViewById(R.id.sleepingSickness);

        insomnia.setOnClickListener(this);
        apena.setOnClickListener(this);
        RLS.setOnClickListener(this);
        Circadianrhythmdisorders.setOnClickListener(this);
        hypersomnia.setOnClickListener(this);
        sleepWalking.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent details = new Intent(Dieseas.this,DiseaseDetails.class);


        if(v==insomnia){
            diseasesDetails="Insomnia is difficulty falling asleep or staying asleep, even when a person has the chance to do so. People with insomnia can feel dissatisfied with their sleep and usually experience one or more of the following symptoms: fatigue, low energy, difficulty concentrating, mood disturbances, and decreased performance in work or at school.Insomnia may be characterized based on its duration. Acute insomnia is brief and often happens because of life circumstances (for example, when you can't fall asleep the night before an exam, or after receiving stressful or bad news). Many people may have experienced this type of passing sleep disruption, and it tends to resolve without any treatment.Chronic insomnia is disrupted sleep that occurs at least three nights per week and lasts at least three months. Chronic insomnia disorders can have many causes. Changes in the environment, unhealthy sleep habits, shift work, other clinical disorders, and certain medications could lead to a long-term pattern of insufficient sleep. People with chronic insomnia may benefit from some form of treatment.Here are some remedies to get rid of insomnia.\n" +
                    "Avoid chemicals that disrupt sleep, such as nicotine, caffeine, and alcohol.\n" +"Eat lighter meals at night and at least two hours before bed.\n" +"Stay active, but exercise earlier in the day.\n" +
                    "Take a hot shower or bath at the end of your day.\n" +
                    "Avoid screens one to two hours before bed.\n";
            ImageDetails=1;
            details.putExtra("key",diseasesDetails);
            details.putExtra("imageKey",ImageDetails);
            startActivity(details);
        }
        else if(v==apena){
            diseasesDetails="\"Sleep apnea is a serious sleep disorder that occurs when a person's breathing is interrupted during sleep. People with untreated sleep apnea stop breathing repeatedly during their sleep, sometimes hundreds of times. This means the brain and the rest of the body may not get enough oxygen.\n" +
                    "There are two types of sleep apnea \n Obstructive sleep apnea (OSA) The more common of the two forms of apnea, it is caused by a blockage of the airway, usually when the soft tissue in the back of the throat collapses during sleep.\n" +
                    "Central sleep apnea: Unlike OSA, the airway is not blocked, but the brain fails to signal the muscles to breathe, due to instability in the respiratory control center.The common effects of sleep apnea are High blood pressure,Stroke,Heart failure,irregular heart beats,heart attacks,Diabetes and  Depression.";
            ImageDetails=2;
            details.putExtra("key",diseasesDetails);
            details.putExtra("imageKey",ImageDetails);
            startActivity(details);

        }

        else if(v==hypersomnia){
            diseasesDetails= "Hypersomnia, which refers to either excessive daytime sleepiness or excessive time spent sleeping, is a condition in which a person has trouble staying awake during the day. People who have hypersomnia can fall asleep at any time -- for instance, at work or while they are driving. They may also have other sleep-related problems, including a lack of energy and trouble thinking clearly.\n" +
                    "According to the National Sleep Foundation, up to 40% of people have some symptoms of hypersomnia from time to time.If you are diagnosed with hypersomnia, your doctor can prescribe various drugs to treat it, including stimulants, antidepressants, as well as several newer medications.";
            ImageDetails=3;
            details.putExtra("key",diseasesDetails);
            details.putExtra("imageKey",ImageDetails);
            startActivity(details);

        }

        else if(v==RLS){
            diseasesDetails="Restless legs syndrome is a neurological sleep disorder that make you have an overwhelming urge to move your legs. Restless legs syndrome makes it difficult to get comfortable enough to fall asleep. The symptoms are usually worse at night. The sensation is difficult for some people to describe. You may lie down and begin to feel burning or itching inside your legs. If you move your legs or get up and walk around, these symptoms may go away. The discomfort may return when you try again to go to sleep. \n" +
                    "In some restless legs syndrome cases, you may have trouble sitting still for long periods of time. Long car rides or airplane travel may be difficult.Many people wait years to seek treatment because they do not view it as a serious concern. If left untreated, you may notice that your symptoms become more frequent and severe.\n" +
                    "Restless legs syndrome may cause you to get fewer hours of sleep each night. Many people with severe cases get less than five hours of sleep per night. Milder cases do not disturb your sleep as much, though the sleep may be of poorer quality.\n" +
                    "The accumulated sleep loss from restless legs syndrome can make you excessively sleepy during the daytime, cause you to be irritable and make concentration difficult. This may have a major impact on your professional and personal life. People with restless legs syndrome are more likely to have depression or anxiety.\n" +
                    "Restless legs syndrome is almost always manageable through medication and a number of lifestyle changes.Most people develop restless legs syndrome after age 45. Women are nearly twice as likely as men to develop the disorder. If you have a family member with restless legs syndrome, you are more likely to develop the symptoms before you are 45 years old. More than half of people with restless legs syndrome have a pattern of it in their family, as the risk is about three to six times greater.\n";
            ImageDetails=4;
            details.putExtra("key",diseasesDetails);
            details.putExtra("imageKey",ImageDetails);
            startActivity(details);
        }

        else if(v==Circadianrhythmdisorders){
            diseasesDetails="Circadian rhythm disorders are disruptions in a person’s circadian rhythm—a name given to the \"internal body clock\" that regulates the (approximately) 24-hour cycle of biological processes in animals and plants. The term circadian comes from Latin words that literally mean 'around the day'.The key feature of circadian rhythm disorders is a continuous or occasional disruption of sleep patterns. The disruption results from either a malfunction in the \"internal body clock\" or a mismatch between the \"internal body clock\" and the external environment regarding the timing and duration of sleep. As a result of the circadian mismatch, individuals with these disorders usually complain of insomnia at certain times and excessive sleepiness at other times of the day, resulting in work, school, or social impairment.";
            ImageDetails=5;
            details.putExtra("key",diseasesDetails);
            details.putExtra("imageKey",ImageDetails);
            startActivity(details);
        }

        else if(v==sleepWalking){
            diseasesDetails="Sleepwalking, formally known as somnambulism, is a behavior disorder that originates during deep sleep and results in walking or performing other complex behaviors while asleep. It is much more common in children than adults and is more likely to occur if a person is sleep deprived. Because a sleepwalker typically remains in deep sleep throughout the episode, he or she may be difficult to awaken and will probably not remember the sleepwalking incident.\n" +
                    "Sleepwalking usually involves more than just walking during sleep; it is a series of complex behaviors that are carried out while sleeping, the most obvious of which is walking. Symptoms of sleepwalking disorder range from simply sitting up in bed and looking around, to walking around the room or house, to leaving the house and even driving long distances. It is a common misconception that a sleepwalker should not be awakened. In fact, it can be quite dangerous not to wake a sleepwalker.Probable symptoms are : Sleeptalking,Little or no memory of the event,Difficulty arousing the sleepwalker during an episode,Inappropriate behavior such as urinating in closets (more common in children),creaming (when sleepwalking occurs in conjunction with sleep terrors),Violent attacks on the person trying to awaken the sleepwalker";
            ImageDetails=6;
            details.putExtra("key",diseasesDetails);
            details.putExtra("imageKey",ImageDetails);
            startActivity(details);
        }




    }
}
