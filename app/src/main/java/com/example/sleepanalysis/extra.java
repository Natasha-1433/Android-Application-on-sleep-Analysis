package com.example.sleepanalysis;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class extra extends AppCompatActivity implements View.OnClickListener {

    TextView AgeSelection;
    Button tood, preSchooler, schoolAge, Teen, young, Adult;
    ImageView tod, pre, school, teen, youngA, Adull;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex);
        AgeSelection = findViewById(R.id.textView);

        tod = findViewById(R.id.image1);
        pre = findViewById(R.id.image2);
        school = findViewById(R.id.image3);
        teen = findViewById(R.id.image4);
        youngA = findViewById(R.id.image5);
        Adull = findViewById(R.id.image6);

        tod.setImageResource(R.drawable.toddller);
        pre.setImageResource(R.drawable.pre);
        school.setImageResource(R.drawable.schoolgoing);
        teen.setImageResource(R.drawable.treeee);
        youngA.setImageResource(R.drawable.ad);
        Adull.setImageResource(R.drawable.adult);


        tood = findViewById(R.id.buttonToddler);
        preSchooler = findViewById(R.id.buttonPreSchooler);
        schoolAge = findViewById(R.id.buttonSchoolGoing);
        Teen = findViewById(R.id.buttonTeen);
        young = findViewById(R.id.buttonYoung);
        Adult = findViewById(R.id.buttonAdult);
        ///button clicks
        tood.setOnClickListener(this);
        preSchooler.setOnClickListener(this);
        schoolAge.setOnClickListener(this);
        Teen.setOnClickListener(this);
        young.setOnClickListener(this);
        Adult.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(this,Toddler.class);


        if(v==tood){
            s="Sleep is an essential part of your toddler's brain development. He's learning so much that he has a lot of experiences to file away at the end of each day. If your toddler is sleep-deprived, he may have trouble processing all this new information and understanding it, just as we all do after a night of broken sleep.Toodler needs 11 to 12 hours of sleep.While sleeping toddler's body is busy producing hormones that help to stimulate growth and appetite. Sleep-deprivation can affect the balance of these hormones, which may contribute to him being out of sorts the next day.It’s good to know that most toddlers will catch up on sleep after a night or two, so don’t worry too much about any long-term effects. It’s likely that any sleep disruption is just a phase, and will pass before long.for more information and effects go through: https://www.babycentre.co.uk/a558729/sleep-deprivation-in-toddlers";
            i.putExtra("key",s);
            startActivity(i);

        }

        else if(v==preSchooler){

            s="In this age Your child is advancing from infancy toward and into the preschool years. During this time, his physical growth and motor development will slow, but you can expect to see some tremendous intellectual, social, and emotional changes.he needs about 10 to 13 hours of sleep per day good sleep is vital for a child’s well-being and can cause more than just tiredness in the morning.Inadequate sleep – whether too short or poor quality – causes specific changes in mood and thinking, says Dr. Dean Beebe, director of the neuropsychology program at Cincinnati Children’s Hospital Medical Center.First, inadequate sleep causes everyone, including children, to be biased towards seeing the world in a more negative light and less in a positive one,” he says. Even more,inadequate sleep causes children (perhaps even more than adults) to have problems regulating the ups and downs in their moods, leading to wider and more rapid reactions to relatively minor events. Children who don’t get enough sleep also don’t pay attention as well, are less likely to think before they act, and don’t seem able to solve problems as well.In fact, not getting enough sleep really affects every aspect of a child’s well-being and functioning:http://sleepeducation.org/news/2012/10/29/sleep-problems-may-affect-children's-behavior\"";

            i.putExtra("key",s);
            startActivity(i);
        }

        else if(v==schoolAge){
            s="School going childern needs 9 to 12 hours of sleep per day.Getting too little sleep in early childhood is linked to cognitive and behavioral problems years later. Parents and teachers reported more problems in 7-year-olds who didn’t get enough sleep during their toddler and preschool years, compared to peers who got an age-appropriate amount of sleep during those early years.Children who aren’t getting the recommended amount of sleep have more difficulties with attention, with emotional control, with reasoning, with problem-solving, and also have behavioral problems,What we found was that insufficient sleep in children was associated with poorer executive function and behavior,said Taveras, who is chief of general pediatrics at Massachusetts General Hospital for Children in Boston. Executive function is basically the brain’s ability to process incoming information and respond to that information,So inorder to make your child behave normally and lively parent should concern about their sleep times. for more details visit https://www.reuters.com/article/us-health-sleep-children-behavior/lack-of-sleep-linked-to-behavioral-problems-in-kids";
            i.putExtra("key",s);
            startActivity(i);

        }
        else if(v==Teen){
            s="The developing brain of a teenager needs between 8 and 10 hours of sleep every night.Regularly not getting enough sleep leads to chronic sleep deprivation. This can have dramatic effects on a teenager’s life, impacting their mental wellbeing, increasing their risk of depression, anxiety and low self-esteem. It can also affect academic performance at school. The effects of chronic (ongoing) sleep deprivation may include: concentration difficulties mentally ‘drifting off’ in class shortened attention span,memory impairment,poor decision making,lack of enthusiasm,moodiness and aggression, depression,risk-taking behaviour,slower physical reflexes,clumsiness, which may result in physical injuries,reduced sporting performance,reduced academic performance increased number of ‘sick days’ from school because of tiredness truancy.for more visit:https://www.betterhealth.vic.gov.au/health/healthyliving/teenagers-and-sleep";
            i.putExtra("key",s);
            startActivity(i);

        }

        else if(v==young){
            s="Some groups of people may consider sleep as wasted time and purposely deprive themselves of sleep to pursue other things such as entertainment, educational goals, or money-making pursuits. This intentional sleep deprivation is most likely to be seen in teenagers and young adults.The main symptom of ongoing sleep loss is excessive daytime sleepiness, but other symptoms include: yawning,moodiness ,fatigue ,irritability ,depressed mood ,difficulty learning new concepts ,forgetfulness ,inability to concentrate or a fuzzy head ,lack of motivation ,clumsiness ,increased appetite and carbohydrate cravings Sleep deprivation can negatively affect a range of systems in the body.It can have the following impact:Not getting enough sleep prevents the body from strengthening the immune system and producing more cytokines to fight infection. This can mean a person can take longer to recover from illness as well as having an increased risk of chronic illness. Sleep deprivation can also result in an increased risk of new and advanced respiratory diseases. A lack of sleep can affect body weight. Two hormones in the body, leptin and ghrelin, control feelings of hunger and satiety, or fullness. The levels of these hormones are affected by sleep. Sleep deprivation also causes the release of insulin, which leads to increased fat storage and a higher risk of type 2 diabetes. Sleep helps the heart vessels to heal and rebuild as well as affecting processes that maintain blood pressure and sugar levels as well as inflammation control. Not sleeping enough increases the risk of cardiovascular disease. Insufficient sleep can affect hormone production, including growth hormones and testosterone in men. Researchers have found that sleep-deprived young adults are less likely to connect socially with other people, and that people who report poor sleep also tend to say they're lonelier. To make things worse, people who feel lonely don't tend to sleep as well, which can lead to a sort of vicious cycle. for more https://www.medicalnewstoday.com/articles/307334.php";
            i.putExtra("key",s);
            startActivity(i);

        }


       else if(v==Adult){
            s="adults needs about 7-9 hours of sleep  per day sleep deprivation has serious consequences for your brain and body.Many people think they can get by on less than seven to nine hours a night — the amount of sleep doctors recommend for most adults — or say they need to sleep less because of work or family obligations. Sleep deprivation and disrupted sleep schedules have been linked to increased risk for several cancers, most notably colon and breast cancers. Poor sleep quality is strongly correlated with chronic skin problems, according to research from the University of Wisconsin. Studies have also found that when skin is damaged by the sun or other factors, it doesn't heal as well in poor sleepers, so those people wind up showing more signs of skin aging. People who don't get enough sleep have more cravings for unhealthy meals, a harder time resisting high-calorie foods, and difficulty controlling their impulses. Researchers think hormonal imbalances that result from sleep deprivation are responsible for this, since those imbalances are linked to a high body-mass index and obesity.Sleep disruptions for elderly people can lead to structural changes in the brain associated with impaired long-term memory. Sleep-related memory deficits have been observed in the general adult population as well — as early as 1924, researchers noticed that people who slept more forgot less.for more https://www.businessinsider.com/sleep-deprivation-effects-on-your-body-brain-2018-8#long-term-sleep-deprivation-also-seems-to-damage-long-term-memory-6";
            i.putExtra("key",s);
            startActivity(i);

        }


    }
}
