import java.util.Random;
import java.util.Scanner;
public class GamePlay {
    public static void main(String[] args) {
   Attacks player=new Attacks();
   Scanner playerInput=new Scanner(System.in);
        int Day=0;
        Attacks enemy=new Attacks();
        enemy.name="enemy";
        enemy.health=30.0;
        enemy.strength=3.0;
        player.strength=4.0;
        player.health=175.0;
        Double CureResearch=0.0;
        String PlayerChoice;
    System.out.println("Day number 1.");                                                                                    //DAY ONE UNDER
     Day=Day+1;
        System.out.println("Hello Doctor- ahem. What was your name again?");
        player.name=playerInput.nextLine();
    System.out.println("Oh yes. I forgot, pardon me. Doctor "+player.name+", we have great news! Your cure for cancer is complete. We will be deploying it this very day!");
    System.out.println("Please come by your office tomorrow.");
    System.out.println("we will have a huge meeting regarding your accomplishment! It's time to go home. type 'Car' when you are ready to head back home.");
             PlayerChoice=playerInput.nextLine();
    while(!PlayerChoice.equalsIgnoreCase("Car")) {
        System.out.println("Hurry up "+player.name+", we got to get home!");
        PlayerChoice=playerInput.nextLine();
    }
        if (PlayerChoice.equalsIgnoreCase("Car")) {
            System.out.println("You make It home. You smell the warm air of food as you enter the kitchen.");
            System.out.println("What's your favorite food again?");
            PlayerChoice = playerInput.nextLine();
            System.out.println("Well luckily for you, your wife is cooking just that!");
            System.out.println("'Like the smell? I made your favorite, " +PlayerChoice+ "! Make sure you have your suit ready for tomorrow. I got an email from your boss, It must be important.");
            System.out.println("I bet hes going to award you for your work with a nobel prize or something!'");
            System.out.println("You feel great, and you know it. You just solved one of the world's most important problems of all time. What's not to love?");
            System.out.println("You are wondering what she meant by the 'email' your boss sent. ''Why would he sent it to your wife? Maybe he didn't want to congratulate me up front.''");
            System.out.println("As you head to your bed, you wonder how many times your name will be addressed in the future. You drift asleep.");
            System.out.println("                                                    ");
            System.out.println("                                                    ");
            System.out.println("                                                    ");
            System.out.println("Welcome "+player.name+", to 10 Days to Die." );
            System.out.println("                                                    ");                                     // DAY TWO UNDER
            System.out.println("                                                    ");
            System.out.println("Day number 2.");
            Day=Day+1;
            System.out.println("As you rise from your bed, you remember your meeting with your boss. You remember what you did, what you accomplished.");
            System.out.println("You get dressed, eat a breakfast of eggs and bacon, and head out to your car.");
            System.out.println("As you head to work, you notice very abnormal things. For one, many people are outside of buildings with signs.");
            System.out.println("You figure they realised what you did and they are celebrating, what you did not know was that those same people are dying.");
            System.out.println("As you make it work, you head to your sector, A14, as you always do. You see your boss, along with some other important people sitting down.");
            System.out.println("'Well "+player.name+", we have some bad news. It appears your cure isn't much of a cure at all. It's a murder weapon.'");
            System.out.println("                                                   ");
            System.out.println("                                                   ");
            System.out.println("                                                   ");
            System.out.println("Before you can respond, the other men next your boss, in black, speak up.");
            System.out.println("'Your 'Cure', that you suggested and deployed is not a cure at all.'");
            System.out.println("'From several subjects and further testing done, we concluded your cure 100% lethal to all life.'");
            System.out.println("'We have found a new lead; however, and we need you to come in every day to potentialy fix this disaster before the public finds out. Are you willing to help work today? We can't force you by law to, and we screwed up big time trusting an idiot like you. We should have never released it so soon...'");
            System.out.println("Please type 'Work' or 'Home' to decide.");
            PlayerChoice = playerInput.nextLine();
            while(!PlayerChoice.equalsIgnoreCase("Work")&&(!PlayerChoice.equalsIgnoreCase("Home"))){
                System.out.println("Hurry up and decide "+player.name+", you have to chose one of them!");
                PlayerChoice=playerInput.nextLine();}
            if (PlayerChoice.equalsIgnoreCase("Home")) {
                System.out.println("You decide to go home. The news is too much for you, and you ignore your job for the day. You are too depressed.");
            }
            else if(PlayerChoice.equalsIgnoreCase("Work")) {
                System.out.println("You listen to your boss and the mens' warnings and decide to start inspecting your 'disease'. Surley they don't know what they're talking about right? With much suprise, you find that they are completely correct. Your cure is lethal.");
                System.out.println("You go to your lab station to began your work immediately.");
                Random generator=new Random();
                CureResearch=CureResearch+generator.nextInt(11)*2.5;
                System.out.println("You research in the lab all day. You now have "+CureResearch+"% of the cure complete.");
                System.out.println("After a hard day of work, you decide to go home.");
            }
            System.out.println("After driving home, you see more of what you can only assume to be petitioners standing outside. Some are on the ground. 'Are they dead?', you mutter half heartedly.");
            System.out.println("You open the door to your house and walk to your kitchen as usual. Your wife is there.");
            System.out.println("'Whats wrong? Why aren't you making food?'");
            System.out.println("'What's the point. Aren't we all going to die soon anyway?'");
            System.out.println("You feel overwhelmed, 'how does she know?' you ponder.");
            System.out.println("She seemed to know what you were thinking. 'The news. It played all day today. Everyone is in shock.'");
            System.out.println("'Did you at least pick up- uh.' What was your daughters name again?");
            String Daughter = playerInput.nextLine();
            System.out.println("'Oh, right, "+Daughter+". Is she in her room?'");
            System.out.println("'Of course I picked her up, and yes.'");
            System.out.println("You head to your room with an empty stomach and try to sleep it off, it's nearly impossible.");
            System.out.println("You stair through your window at the stars, and pray this won't be humanity's last week of life.");
            System.out.println("                                          ");
            System.out.println("                                          ");
            System.out.println("                                          ");
                                                                                        //DAY THREE UNDER
            System.out.println("Day number 3.");
            Day=Day+1;
            System.out.println("As usual, you get out of bed, go downstairs, get ready, and eat eggs and bacon.");
            System.out.println("You see that you're out of both; however, and you're forced to eat a meal of bread and butter.");
            System.out.println("'The stores must be closing' You assume, as you walk outside to your car.");
            System.out.println("As you walk along your driveway, you wonder how horrible life would be if you were forced to live on Earth alone.");
            System.out.println("Sadly you're not alone right now, and two people, both armed, are walking towards you.");
            System.out.println("                                ");
            System.out.println("                                ");
            System.out.println("                                ");
            System.out.println("You are quick to run to your car, and see two weapon-like objects.");
            System.out.println("You see a 'Syringe'and a 'Scalpel'.");
            System.out.println("They are coming, and they are coming quick, type one of the options.");
            System.out.println("If you want to attack with your fists, type anything but the two options given.");
            System.out.println("Your health is "+player.health+".");
            System.out.println("Each enemy has "+enemy.health+" health.");
            PlayerChoice = playerInput.nextLine();
            if(PlayerChoice.equalsIgnoreCase("Syringe")) {
                System.out.println("You grab your Syringe in your car right as the two men approach you.");
                System.out.println("You also see that the first man, along with his friend, is wielding a knife.");

               System.out.println("You "); player.AttackSyringe(enemy);
                while (enemy.health > 0){
                    System.out.println("He does not fall.");
                    System.out.println("The first enemy"); enemy.AttackKnife(player);
                    if(player.health<=0){
                        System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                        System.exit(6);
                    }
                    System.out.println("You "); player.AttackSyringe(enemy);


                }
            if(player.health>0){
                System.out.println("After you knock out the first man, the other approaches. You battle him next.");
               enemy.health=30.0;
                player.AttackSyringe(enemy);
               while (enemy.health > 0){
                    System.out.println("He does not fall.");
                    System.out.println("The second enemy"); enemy.AttackKnife(player);
                   if(player.health<=0){
                       System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                       System.exit(6);
                   }
                    System.out.println("You "); player.AttackSyringe(enemy);

            }
            System.out.println("Finally, after knocking out the second fighter, you brush yourself off and look around.");
                System.out.println("Silence is around you. You are surprised nobody came to your aid. Seems like the disease really has spread.");
                System.out.println("After the brawl, you end out with "+player.health+" health remaining.");
                System.out.println("You then get inside your car");
            }
            }
            else if(PlayerChoice.equalsIgnoreCase("Scalpel")){System.out.println("You grab your Scalpel in your car right as the two men approach you.");
                System.out.println("You also see that the first man, along with his friend, is wielding a knife.");

                System.out.println("You "); player.AttackScalpel(enemy);
                while (enemy.health > 0){
                    System.out.println("He does not fall.");
                    System.out.println("The first enemy"); enemy.AttackKnife(player);
                    if(player.health<=0){
                        System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                        System.exit(6);
                    }
                    System.out.println("You "); player.AttackScalpel(enemy);


                }
                if(player.health>0){System.out.println("After you knock out the first man, the other approaches. You battle him next.");
                    enemy.health=30.0;
                    player.AttackScalpel(enemy);
                    while (enemy.health > 0){
                        System.out.println("He does not fall.");
                        System.out.println("The second enemy"); enemy.AttackKnife(player);
                        if(player.health<=0){
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You "); player.AttackScalpel(enemy);

                    }
                    System.out.println("Finally, after knocking out the second fighter, you brush yourself off and look around.");
                    System.out.println("Silence is around you. You are surprised nobody came to your aid. Seems like the disease really has spread.");
                    System.out.println("After the brawl, you end out with "+player.health+" health remaining.");
                    System.out.println("You then get inside your car");
                }
            }
            else{System.out.println("You chose to grab nothing as the two men approach you.");
                System.out.println("You also see that the first man, along with his friend, is wielding a knife.");

                System.out.println("You "); player.AttackUnarmed(enemy);
                while (enemy.health > 0){
                    System.out.println("He does not fall.");
                    System.out.println("The first enemy"); enemy.AttackKnife(player);
                    if(player.health<=0){
                        System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                        System.exit(6);
                    }
                    System.out.println("You "); player.AttackUnarmed(enemy);


                }
                if(player.health>0){
                    System.out.println("After you knock out the first man, the other approaches. You battle him next.");
                    enemy.health=30.0;
                    player.AttackScalpel(enemy);
                    while (enemy.health > 0){
                        System.out.println("He does not fall.");
                        System.out.println("The second enemy"); enemy.AttackKnife(player);
                        if(player.health<=0){
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You "); player.AttackUnarmed(enemy);

                    }
                    System.out.println("Finally, after knocking out the second fighter, you brush yourself off and look around.");
                    System.out.println("Silence is around you. You are surprised nobody came to your aid. Seems like the disease really has spread.");
                    System.out.println("After the brawl, you end out with "+player.health+" health remaining.");
                    System.out.println("You then get inside your car");
                }
            }

                System.out.println("After knocking the two attackers down, you feel shaken up. 'They had knifes' you pondered. 'They wanted me dead.'");
            System.out.println("You look around as you drive, very cautiously, if people are going crazy now, it will get far worse later.");
            System.out.println("As you make your way to your office building, you ponder over a decision.");
            System.out.println("You can either go straight to work, 'Work', or try to heal yourself, 'Heal'.");
            System.out.println("Please chose 'Work' or 'Heal'.");
            PlayerChoice = playerInput.nextLine();
            while(!PlayerChoice.equalsIgnoreCase("Work")&&(!PlayerChoice.equalsIgnoreCase("Heal"))){
                System.out.println("Hurry up and decide "+player.name+", you have to chose one of the options!");
                PlayerChoice=playerInput.nextLine();}
            if (PlayerChoice.equalsIgnoreCase("Heal")) {
                Random generator = new Random();
                int Medic13 = generator.nextInt(91) + 10;
                System.out.println("You decide healing yourself is more of a priority for now. You look inside your office for medical supplies.");
                if (Medic13 < 31) {
                System.out.println("After looking around in your office, you find a pack of bandages.");
                player.health=player.health+Medic13;
                System.out.println("After using the bandages, you now have "+player.health+" Health.");
                }
                else if (Medic13 < 61) {
                System.out.println("After looking around in your office, you find a huge medicine case.");
                player.health=player.health+Medic13;
                System.out.println("After using the huge medicine case, you now have "+player.health+" Health.");
                }
                else{
                System.out.println("After looking around in your office, you find a pack of medical drugs.");
                player.health=player.health+Medic13;
                System.out.println("After using the medical drugs, you now have "+player.health+" Health.");
            }
            System.out.println("After healing up your wounds, you get a great idea for the cure and spend a couple hours on it.");
            CureResearch=CureResearch+9;
            System.out.println("You now have "+CureResearch+"% of the cure complete.");
            System.out.println("After finishing up your work, you decide to go home.");
            }
            else if(PlayerChoice.equalsIgnoreCase("Work")) {
                System.out.println("You go to your research station to began your work immediately.");
                Random generator=new Random();
                CureResearch=CureResearch+generator.nextInt(11)*2.5;
                System.out.println("You research in the lab all day. You now have "+CureResearch+"% of the cure complete.");
                System.out.println("After a hard day of work, you decide to go home.");
            }
                System.out.println("As you make your way home, you look around paranoid. You don't want another encounter.");
            System.out.println("You go inside your home, praying nobody's hurt. You squint your eyes as you walk into the kitchen.");
            System.out.println("Luckily, as you open them, you see your wife and daughter perfectly sound and healthy.");
            System.out.println("'Did you make any progress with the cure?'");
            System.out.println("'Yes yes,' you say, slightly agitated.");
            System.out.println("'Whats wrong?', your daughter asks, 'nothing "+Daughter+", nothing.'");
            System.out.println("As you head up to your room, you ponder what will happen tomorrow. Today was horrible.");
            System.out.println("You stare at the stars once more as you drift silently to sleep.");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("                               ");
                                                                                                                //DAY FOUR UNDER
            Day=Day+1;
            System.out.println("Day number 4.");
            System.out.println("Your health is "+player.health+".");
            System.out.println("The cure is "+CureResearch+"% complete.");
            System.out.println("You wake up determined today. You will not allow yesterday's event to happen again. You must prepare.");
            System.out.println("As you walk down stairs, you grab a 'Gun' a 'Knife' and a 'Syringe'.");
            System.out.println("As you walk outside, tucking all your new weapons neatly awat, you think you hear something walking close to you. 'A bush maybe'. You continue on.");
            System.out.println("After driving to work, you need to decide what to do with your time.");
            System.out.println("Please chose 'Work' or 'Heal'.");
            PlayerChoice = playerInput.nextLine();
            while(!PlayerChoice.equalsIgnoreCase("Work")&&(!PlayerChoice.equalsIgnoreCase("Heal"))){
                System.out.println("Hurry up and decide "+player.name+", you have to chose one of the options!");
                PlayerChoice=playerInput.nextLine();}
            if (PlayerChoice.equalsIgnoreCase("Heal")) {
                Random generator = new Random();
                int Medic14 = generator.nextInt(91) + 10;
                System.out.println("You decide healing yourself is more of a priority for now. You look inside your office for medical supplies.");
                if (Medic14 < 31) {
                    System.out.println("After looking around in your office, you find a pack of bandages.");
                    player.health=player.health+Medic14;
                    System.out.println("After using the bandages, you now have "+player.health+" Health.");
                }
                else if (Medic14 < 61) {
                    System.out.println("After looking around in your office, you find a huge medicine case.");
                    player.health=player.health+Medic14;
                    System.out.println("After using the huge medicine case, you now have "+player.health+" Health.");
                }
                else{
                    System.out.println("After looking around in your office, you find a pack of medical drugs.");
                    player.health=player.health+Medic14;
                    System.out.println("After using the medical drugs, you now have "+player.health+" Health.");
                }
                System.out.println("After finishing up healing, you decide to start work.");
                System.out.println("You go to your research station to began.");
                Double Research4= generator.nextInt(16)*2.5;
                CureResearch=CureResearch+Research4;
                System.out.println("You research in the lab all day. You now have "+CureResearch+"% of the cure complete.");
            }
            else if(PlayerChoice.equalsIgnoreCase("Work")) {
                System.out.println("You go to your research station to began your work.");
                Random generator = new Random();
                CureResearch = CureResearch + generator.nextInt(16) * 2.5;
                System.out.println("You research in the lab all day. You now have " + CureResearch + "% of the cure complete.");
            }
                System.out.println("After wrapping up your work for the day, you head back to your car.");
                System.out.println("You see less people driving than usual. You worry what will happen if you don't make this cure.");
                System.out.println("Before you get in your car, you are startled. A man has grabbed your shoulder!!");
                System.out.println("Before you can lash out, the man, surprisingly calm, began talking to you. It was only your boss.");
                System.out.println("'How has your research been going? I hope you are at least half way done?'");
                System.out.println("'Yeah yeah I'm working really hard on it believe me. I got jumped the other day, so I'm kind of startled, sorry.'");
                System.out.println("'Just remember', he said very calmly, 'only you can destroy the plague you have created.'");
                System.out.println("                          ");
                System.out.println("                          ");
                System.out.println("                          ");
                System.out.println("You make it back home without any further incidents. You walk inside your kitchen, nervous as before.");
                System.out.println("Luckily for you, your family is just fine. They don't say a word as you eat dinner and head up stairs, as they are nervous.");
                System.out.println("You look up once more, at the stars above, and pray that you can take this damn virus down.");
                System.out.println("                               ");
                System.out.println("                               ");
                System.out.println("                               ");
            if(CureResearch>=100) {
                System.out.println("Cure Research is complete. The cure for your disease has been deployed all across the world. It was a miracle you cured it so soon. Everyone is impressed.");
                System.out.println("They are also disappointed. Your lack luster care for inspecting your cure before sending it out killed 11% of humanity.");
                System.out.println("You are sentenced to 10 years in prison for your disease. It took you 5 days to cure your disease.");
                System.exit(5);
            }
                                                                                        //DAY FIVE UNDER
                Day=Day+1;
                System.out.println("Day number 5.");
                System.out.println("Your health is "+player.health+".");
                System.out.println("The cure is "+CureResearch+"% complete.");
                System.out.println("                            ");
                System.out.println("                            ");
                System.out.println("                            ");
                System.out.println("As usual, you look around your bedroom. You take a few moments to look outside the window.");
                System.out.println("The sight you see is shocking. Three people, none armed, are beating down your door.");
                System.out.println("'they've got it..', you mumble, as you approach your front door.");
                System.out.println("Their banging gets louder, they are trying to break in. How should you defend yourself this time?");
                System.out.println("You realise there is a big kitchen right behind you, wielding decent, adjustable weapons. 'A spoon' you chuckle, 'Perhaps..'");
            System.out.println("Please type 'Spoon' or 'Cleaver'.");
                System.out.println("If you want to attack with your fists, type anything but the two options given.");
                System.out.println("Your health is "+player.health+".");
                enemy.health=30.0;
                System.out.println("Each enemy has "+enemy.health+" health.");
                PlayerChoice = playerInput.nextLine();
                if(PlayerChoice.equalsIgnoreCase("Spoon")) {
                    System.out.println("You grab a Spoon in your kitchen and open up your front door.");
                    System.out.println("You see that the three men are almost green. They are severely ill.");
                    System.out.println("You "); player.AttackSpoon(enemy);
                    while (enemy.health > 0){
                        System.out.println("He does not fall.");
                        System.out.println("The first enemy"); enemy.AttackUnarmed(player);
                        if(player.health<=0){
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You "); player.AttackSpoon(enemy);


                    }
                    if(player.health>0){
                        System.out.println("After you knock out the first man, the other two approach together. You battle them both next.");
                        enemy.health=70.0;
                       enemy.strength=6.0;
                        player.AttackSpoon(enemy);
                        while (enemy.health > 0){
                            System.out.println("They do not fall.");
                            System.out.println("The two enemies"); enemy.AttackUnarmed(player);
                            if(player.health<=0){
                                System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                                System.exit(6);
                            }
                            System.out.println("You "); player.AttackSpoon(enemy);

                        }
                    }
                }
                else if(PlayerChoice.equalsIgnoreCase("Cleaver")){System.out.println("You grab a Clever in your kitchen as the trio continue to bang on your door.");
                    System.out.println("You also can see the desperation in their eyes as you open your front door.");
                    enemy.health=30.0;
                    enemy.strength=3.0;
                    System.out.println("You "); player.AttackCleaver(enemy);
                    while (enemy.health > 0){
                        System.out.println("He does not fall.");
                        System.out.println("The first enemy"); enemy.AttackUnarmed(player);
                        if(player.health<=0){
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You "); player.AttackCleaver(enemy);


                    }
                    if(player.health>0){System.out.println("After you knock out the first man, the other two approach. You battle them next.");
                        enemy.health=70.0;
                        enemy.strength=6.0;
                        player.AttackCleaver(enemy);
                        while (enemy.health > 0){
                            System.out.println("They do not fall.");
                            System.out.println("The two enemies"); enemy.AttackUnarmed(player);
                            if(player.health<=0){
                                System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                                System.exit(6);
                            }
                            System.out.println("You "); player.AttackCleaver(enemy);

                        }}}
                else{System.out.println("You chose to grab nothing as you approach your front door.");
                    System.out.println("You see that all three men are slightly green, and very ill.");
                    enemy.health=30.0;
                    enemy.strength=3.0;
                    System.out.println("You "); player.AttackUnarmed(enemy);
                    while (enemy.health > 0){
                        System.out.println("He does not fall.");
                        System.out.println("The first enemy"); enemy.AttackUnarmed(player);
                        if(player.health<=0){
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You "); player.AttackUnarmed(enemy);


                    }
                    if(player.health>0){
                        System.out.println("After you knock out the first man, the other two approach. You battle them both next.");
                        enemy.health=70.0;
                        enemy.strength=6.0;
                        player.AttackUnarmed(enemy);
                        while (enemy.health > 0){
                            System.out.println("they do not fall.");
                            System.out.println("The two enemies"); enemy.AttackUnarmed(player);
                            if(player.health<=0){
                                System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                                System.exit(6);
                            }
                            System.out.println("You "); player.AttackUnarmed(enemy);

                        }
                        System.out.println("Finally, after knocking out the second fighter, you brush yourself off and look around.");
                        System.out.println("'They must have really wanted to die.' You wonder how horrible they must have felt.");
                        System.out.println("After the brawl, you end out with "+player.health+" health remaining.");
                    }
                }
            enemy.strength=3.0;
            System.out.println("Finally, after knocking out the other two fighters, you brush yourself off and look around.");
            System.out.println("'Can't believe they didn't try to sneak in, although they probably lost their minds anyway.'");
            System.out.println("After the brawl, you end out with "+player.health+" health remaining.");
            System.out.println("You then get inside your car and head to work.");






            System.out.println("After driving to work, you need to decide what to do with your time.");
           System.out.println("You also see to your left, a big park, maybe it's time for a break?");
            System.out.println("Please chose 'Work' or 'Park'.");
            PlayerChoice = playerInput.nextLine();
            while(!PlayerChoice.equalsIgnoreCase("Work")&&(!PlayerChoice.equalsIgnoreCase("Park"))){
                System.out.println(player.name+", you have to chose one of the options.");
                PlayerChoice=playerInput.nextLine();}
           if(PlayerChoice.equalsIgnoreCase("Park")) {
               System.out.println("You decide a break is what you need. As you drive past your office, you notice less and less people driving.");
               System.out.println("You contemplate your options, maybe this was a waste of time, but you don't care. Your sick of the attacks.");
               System.out.println("After your 3 hour long break, you decide to head back to your office to work a little.");
               Random generator = new Random();
               CureResearch = CureResearch + generator.nextInt(6) * 2.5;
               System.out.println("You research in the lab for part of the day. You now have " + CureResearch + "% of the cure complete.");

           }
            else if(PlayerChoice.equalsIgnoreCase("Work")) {
                System.out.println("You go to your research station to began your work.");
                Random generator = new Random();
                CureResearch = CureResearch + generator.nextInt(16) * 2.5;
                System.out.println("You research in the lab all day. You now have " + CureResearch + "% of the cure complete.");
            }
                System.out.println("After the long day, you decide that the streets are not safe to trot. Who knows who will strike?");
            System.out.println("You search for your wife and daughter and ask them what happened.");
            System.out.println("You find them in the living room, and begin speaking with them both.");
            System.out.println("'Attacked? When?' 'It was just this morning, you were taking "+Daughter+" to preschool.");
            System.out.println("After telling your wife about the attack, she agrees for you to arm yourself again, 'make sure your armed, but don't just stay here'.");
            System.out.println("                               ");
            System.out.println("Your the only one who can save us.");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("After you get in your bed, as always, you stare up at the stars above.");
            System.out.println("You have an idea, however, and you realise, there is still a chance...");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("                               ");
                                                                                // DAY 6 UNDER
            Day=Day+1;
            System.out.println("Day number 6.");
            System.out.println("You wake up very excited to work, you have an amazing idea for a cure.");
            System.out.println("There isn't much time left, an estimated 4 days says the news.");
            System.out.println("'Boss is wrong,' You ponder, 'I'm not the ONLY one who can save us.' ");
            System.out.println("You quickly get ready, and began your trek to work, every day the drive is harder.");
            System.out.println("When you reach work, you see many people with signs");
            System.out.println("WE'RE ALL GOING TO DIE!");
            System.out.println("HE TRIED TO KILL US!");
            System.out.println("They are massing an army against the cooperation. As if that would help.");
            System.out.println("You ignore them as you dip into your office, listening for others.");
            System.out.println("Your old office friend comes up to you.");
            System.out.println("'Hey "+player.name+"! Found any new leads? We need you, you know.'");
            System.out.println("You explain your idea to him and you both start work right there.");
            Random generator = new Random();
            CureResearch = CureResearch + generator.nextInt(21) * 2.5;
            System.out.println("After working for hours and hours, you both sum up the progress.");
           if(CureResearch>=75){
           System.out.println("'"+CureResearch+"%. That's insane! We can do it! We're so close!");
                System.out.println("After you and your old friend wrap things up, you decide to head to your car.");
           }
          else if(CureResearch>=50){
               System.out.println("'"+CureResearch+"%. That really good! We are on track of completion.'");
               System.out.println("After you both view the progress, you both feel relaxed knowing there is still a chance.");
           }
           else if(CureResearch>=25){

               System.out.println("'" + CureResearch + "%. This is not good. We need to work overtime if we want a chance.");
               System.out.println("You both feel dread, overtime wouldn't describe the progress further needed for a chance.");

           }
            else if(CureResearch<25) {
            System.out.println("'"+CureResearch+"%. This can't be true. We have hardly any scraps of data to use.'");
            System.out.println("'We need a miracle if this is going to work. Just don't tell the others.'");
            }
            System.out.println("You decide to head home after a long day of work. The cure is not done, but your just too tired.");
            System.out.println("When you make it home, you see your wife, and she looks slightly pale.");
            System.out.println("'Honey? Are you alright?' You grimace when she opens her mouth.");
            System.out.println("'I'm not feeling too great, but I'm not going to die yet.'");
            System.out.println("'You have a little time left.'");
            System.out.println("Her voice is raspy, and you can't stand it. You can't stand what you have done, so you go to your bed room and try to sleep.");
            System.out.println("You haven't seen your daughter yet, perhaps she's as depressed as you are.");
            System.out.println("                             ");
            System.out.println("                             ");
            System.out.println("                             ");
            System.out.println("You stare at the stars as usual, and wonder what planet Earth might become.");
            if(CureResearch>=100) {
                System.out.println("Cure Research is complete. The cure for your disease has been deployed, but not without harm.");
                System.out.println("73% of the world has survived your disease. Your disease has been removed.");
                System.out.println("You have petrified the world, and economy has never been so slow.");
                System.out.println(" You were sentenced to 15 years in prison for your disease. It took you 6 days to cure your disease.");
                System.exit(4);
            }
                                                                    //DAY 7 UNDER
            Day=Day+1;
            
            System.out.println("Day number 7.");
            
            System.out.println("You get out of bed and oddly change schedule. Considering your OCD, that itself is a miracle.");
            System.out.println("You go to "+Daughter+"'s room to check on her.");
            System.out.println("As expected, she doesn't feel too well. She seems a little off, emotionally at least.");
            System.out.println("'"+Daughter+"? Are you ok?'");
            System.out.println("'I'm fine, just fine.'");
            System.out.println("You go down stairs and get ready for work. Your worried.");
            System.out.println("'Honey where are you going?' What does she mean by that?");
            System.out.println("'Where do you think I'm going? Work.'");
            System.out.println("'There's no use. We're all going to die-' 'NO', you yell.");
            System.out.println("You approach the door and turn around.");
           
            System.out.println("'This cure will be made.'");
            System.out.println("                          ");
            System.out.println("                          ");
            System.out.println("                          ");
            System.out.println("You get to your job location and notice a fight going on.");
            System.out.println("Out of all the things to glance at, the only thing you see is vivid and clear.");
            System.out.println("Only the sick are out there today, only the one's who have nothing to lose.");
            System.out.println("You head up to your office and wonder what you should do.");
            System.out.println("You see your friend sitting there, obviously waiting on you. He tries so hard.");
            System.out.println("'He should be given this chance, not me.'");
            System.out.println("Your health is "+player.health);
            System.out.println("Please chose 'Work' or 'Heal'.");
            PlayerChoice = playerInput.nextLine();
            while(!PlayerChoice.equalsIgnoreCase("Work")&&(!PlayerChoice.equalsIgnoreCase("Heal"))){
                System.out.println("Hurry up and decide "+player.name+", you have to chose one of the options!");
                PlayerChoice=playerInput.nextLine();}
            if (PlayerChoice.equalsIgnoreCase("Heal")) {
                generator = new Random();
                int Medic14 = generator.nextInt(91) + 10;
                System.out.println("You decide healing yourself is more of a priority for now. You look inside your office for medical supplies.");
                if (Medic14 < 31) {
                    System.out.println("After looking around in your office, you find a pack of bandages.");
                    player.health=player.health+Medic14;
                    System.out.println("After using the bandages, you now have "+player.health+" Health.");
                }
                else if (Medic14 < 61) {
                    System.out.println("After looking around in your office, you find a huge medicine case.");
                    player.health=player.health+Medic14;
                    System.out.println("After using the huge medicine case, you now have "+player.health+" Health.");
                }
                else{
                    System.out.println("After looking around in your office, you find a pack of medical drugs.");
                    player.health=player.health+Medic14;
                    System.out.println("After using the medical drugs, you now have "+player.health+" Health.");
                }
                System.out.println("After finishing up healing, you decide to start work.");
                System.out.println("You go to your research station to began.");
                Double Research4= generator.nextInt(6)*2.5;
                CureResearch=CureResearch+Research4;
                System.out.println("You research in the lab all day. You now have "+CureResearch+"% of the cure complete.");
            }
            else if(PlayerChoice.equalsIgnoreCase("Work")) {
                System.out.println("You go to your research station to began your work.");
                generator = new Random();
                CureResearch = CureResearch + generator.nextInt(16) * 2.5;
                System.out.println("You research in the lab all day. You now have " + CureResearch + "% of the cure complete.");
            }
            if(CureResearch>=100){
            	System.out.println("'Holy shit... I DID IT! Or rather we did it!'");
            	
            
            }
            if(CureResearch>=75){
                System.out.println("'"+CureResearch+"%. That's insane! We can do it! We're so close!");
                System.out.println("After you and your old friend wrap things up, you decide to head to your car.");
            }
            else if(CureResearch>=50){
                System.out.println("'"+CureResearch+"%. That really good! We are on track of completion.'");
                System.out.println("After you both view the progress, you both feel relaxed knowing there is still a chance.");
            }
            else if(CureResearch>=25){

                System.out.println("'" + CureResearch + "%. This is not good. We need to work over time if we want a chance.");
                System.out.println("You both feel dread, over time wouldn't describe the progress further needed for a chance.");

            }
            else if(CureResearch<25) {
                System.out.println("'"+CureResearch+"%. This can't be true. We have hardly any scraps of data to use.'");
                System.out.println("'We need a miracle if this is going to work. Just don't tell the others.'");
            }
            System.out.println("After yet another day of work, you decide to head home. Further cure research has been obtained.");
            System.out.println("You make it home without incidence. When you close and lock the door, your wife goes up to you.");
            System.out.println("'Your boss called me again today, said to tell you to call him when you get the chance. Here.'");
            System.out.println("She hands you the phone and you begin chatting with your boss.");
            System.out.println("'Yes It's going good. Ye-. Yes of course I have the cure 75% or more done.'");
            if(CureResearch>=75) {
                System.out.println("'Yes I promise, you can look at the file, you can see the data all aligned, at least mainly.'");
                System.out.println("'Thank you, you too.'");
            }
           else if(CureResearch<75) {
                System.out.println("'Uh- W-Well yeah. What? No I do. Fine ok, I don't.'");
                System.out.println("'I promise I will work over time tomorrow. I promise.");
                System.out.println("'Ok, y-. Yes alright, bye, yes, you too.");
            }
            System.out.println("You head to your bed as usual, and fall asleep. You peek at the sky through your window first.");
            System.out.println("'I promise, It will be done.'");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("                               ");
            System.out.println("                               ");
            if(CureResearch>=100){
                System.out.println("Cure Research is complete. The cure for your disease has been deployed, but half of the world is gone.");
               System.out.println(" Many families have crumbled, many countries are gone.");
                System.out.println("The world is forever changed, and will be crippled for centuries to come. Because of your disease, your wife is dead.");
                System.out.println("It took you 7 days to cure your disease");
                System.exit(3);
            }
                                                                                         // DAY 8 UNDER
            Day=Day+1;
            System.out.println("Day number 8.");
            System.out.println("You get out of bed, chug your food down, and sprint to your car.");
            System.out.println("Before you can drive away, you see your daughter walk out.");
            System.out.println("'"+Daughter+"? What are you doing out of bed?'");
            System.out.println("'I want to come!'");
            System.out.println("'No! It's just too dangerous.'");
            System.out.println("'Please. If the world is going to end, I want to at least be with you.'");
            System.out.println("'Shouldn't you be in school?'");
            System.out.println("'School was canceled two days ago. They said we won't be going back there again.'");
            System.out.println("Looks like news really does fly fast.");
            System.out.println("'Alright fine, you can come.'");
            System.out.println("You drive to a cross section as usual, but the decision is not clear.");
            System.out.println("Usually work is were you go, but something compels you. Should you end it here?");
            System.out.println("You could spend your last two days on earth with your Daughter, go left to the park.");
            System.out.println("Please chose 'Work' or 'Park'.");
            PlayerChoice = playerInput.nextLine();
            while(!PlayerChoice.equalsIgnoreCase("Work")&&(!PlayerChoice.equalsIgnoreCase("Park"))){
                System.out.println(player.name+", you have to chose one of the options.");
                PlayerChoice=playerInput.nextLine();}
            if(PlayerChoice.equalsIgnoreCase("Park")) {
                System.out.println("You decide that the world's fate is inevitable. No point in trying to fix it.");
                System.out.println("Your daughter seems happy with the decision, and you do too.");
                System.out.println("After spending the entire day in the park, you feel like nothing is wrong.");
                System.out.println("As if none of the deaths and evils in the world are no longer. You had a good day with your Daughter.");

            }
            else if(PlayerChoice.equalsIgnoreCase("Work")) {
                System.out.println("You go to your research station to began your work with your daughter at your side.");
                System.out.println("'It's take your child to work day,"+Daughter+"! I'll be over here, don't mess with anything.'");
                System.out.println("'Can I watch?' 'Of course you can!'.");
                System.out.println("Today was a typical day for you, just a simple, unimportant day of work to save the world.");
                System.out.println("With your daughter by your side, you felt more motivated. Ready to work.");
                generator = new Random();
                CureResearch = CureResearch + generator.nextInt(16) * 2.5;
                System.out.println("You now have " + CureResearch + "% of the cure complete.");
            }
            System.out.println("You head home with your daughter by your side. You both make it home, something is off.");
            System.out.println("'Stay here "+Daughter+".' You say, not wanting her to go down with you. Your nervous.");
            System.out.println("You equip a 'Gun' from your car. You open the front door and peer inside.");
            System.out.println("'Honey?' You yell, without yielding a response.");
            System.out.println("When you go to the kitchen, you see something you never wanted to see, something you couldn't bare.");
            System.out.println("Your wife, alone, on the ground dead.");
            System.out.println("That night, after the horrors you saw were somehow disguised from your daughter, you cried.");
            System.out.println("You couldn't help but look out your mirror, into the sky light as you always do.");
            System.out.println("                        ");
            System.out.println("                        ");
            System.out.println("                        ");
            if(CureResearch>=100) {
                System.out.println("Cure Research is complete. The cure for your disease has been deployed, but many lives were lost.");
                System.out.println("with only 39% of humanity remaining, it will be hard to move on");
                System.out.println("You caused humanity's biggest set back, in hopes for the biggest jump forward.");
                System.out.println("Humanity has been harmed because of you. It took you 8 days to cure your disease.");
                System.exit(2);
            }
                                                                                    //DAY 9 UNDER
           Day=Day+1;
            System.out.println("Day number 9.");
            System.out.println("You wake up the next day, the TV does not exist. No channels obviously.");
            System.out.println("No news is reported, for just under 10% of the world still draws breath.");
            System.out.println("You have "+CureResearch+"% of the cure complete.");
            System.out.println("You go downstairs and eat a meal. You moved your wife into a closet. It won't matter anyway.");
            System.out.println("'You can't think like that!' You say to yourself, as you open your daughters room.");
            System.out.println("You flinch as the door creaks open, but luckily for you, she is still alive. Pale though.");
            System.out.println("Neither of you speak as you hold her hand to your car. You reach the same intersection as before.");
            System.out.println("Please type either 'Work' or 'Park'.");
                    PlayerChoice = playerInput.nextLine();
            while(!PlayerChoice.equalsIgnoreCase("Work")&&(!PlayerChoice.equalsIgnoreCase("Park"))){
                System.out.println(player.name+", you have to chose one of the options.");
                PlayerChoice=playerInput.nextLine();}
            if(PlayerChoice.equalsIgnoreCase("Park")) {
                System.out.println("You decide to take a day off at the park. Your chance to save the world is slim.");
                System.out.println("Your daughter seems happy with the decision, and you do too.");
                System.out.println("Your wife would have done the same with you. There just simply is no chance.");
                System.out.println("Today was, without a doubt, one of the best days you have ever had.");
                System.out.println("After spending the entire day with your daughter, you both decide to go home.");
            }
            else if(PlayerChoice.equalsIgnoreCase("Work")) {
                System.out.println("You go to your research station to began your work with your daughter at your side.");
                System.out.println("'It's take your child to work day number two,"+Daughter+"! I'll be over here, don't mess with anything.'");
                System.out.println("'I don't feel too good' 'Just try to hang on! We don't have too much time'.");
                System.out.println("With your daughter by your side, you felt more motivated. Ready to work.");
                generator = new Random();
                CureResearch = CureResearch + generator.nextInt(16) * 2.5;
                System.out.println("You now have " + CureResearch + "% of the cure complete.");
                System.out.println("After a day of work, you and your daughter decide to head home.");
            }
            System.out.println("After you both make it home, "+Daughter+" tells you she doesn't feel too good.");
            System.out.println("'Just sleep it off "+Daughter+", It's ok. It's ok.");
            System.out.println("You head to your room and stare up at your ceiling, then at your window.");
            System.out.println("Your eyes close as you drift to sleep.");
            System.out.println("                        ");
            System.out.println("                        ");
            System.out.println("                        ");
            if(CureResearch>=100) {
                System.out.println("Cure Research is complete. The cure for your disease has been deployed, but not without heavy implications.");
                System.out.println("Most of the world is dead because of your disease, and you are to be blamed. However, the other 18% can rebuild, thanks to you, humanity can move forward.");
                System.out.println("It took you 9 days to cure your disease.");
                System.exit(1);
            }
                                                                                                        //DAY 10 UNDER
            Day=Day+1;
            System.out.println("Day number 10.");
            System.out.println("You wake up very subtle. You get out of bed and check on your daughter first.");
            System.out.println("You shake her but she is unresponsive. She is dead.");
            System.out.println("You aren't too distraught, as you expected this. At least you both had a good time.");
            System.out.println("You drive straight to work today.");
            System.out.println("There is one final day to make a cure. you make it to your office room, but not alone.");
            System.out.println("There are five people 'With' you, but not for the same reason.");
            System.out.println("You address the situation, and spot out 2 real weapons.");



            System.out.println("Please type 'Scalpel' or 'GasBomb'.");
            System.out.println("If you want to attack with your fists, type anything but the two options given.");
            System.out.println("Your health is "+player.health+".");
            enemy.strength=6.0;
            enemy.health=60.0;
            System.out.println("Each enemy has 30 health.");
            PlayerChoice = playerInput.nextLine();
            if(PlayerChoice.equalsIgnoreCase("Scalpel")) {
                System.out.println("You grab a Scalpel next to your desk.");
                System.out.println("You see that, like the men before, They are all severely ill.");
                System.out.println("Two of the men attack you first.");
                enemy.strength=6.0;
                System.out.println("You "); player.AttackScalpel(enemy);
                while (enemy.health > 0){
                    System.out.println("They do not fall.");
                    System.out.println("The two enemies"); enemy.AttackUnarmed(player);
                    if(player.health<=0){
                        System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                        System.exit(6);
                    }
                    System.out.println("You "); player.AttackScalpel(enemy);


                }
                if(player.health>0){
                    System.out.println("After you knock out the first two men, the other three approach together. You battle them next.");
                    enemy.health=90.0;
                    enemy.strength=9.0;
                    player.AttackScalpel(enemy);
                    while (enemy.health > 0){
                        System.out.println("They do not fall.");
                        System.out.println("The three enemies"); enemy.AttackUnarmed(player);
                        if(player.health<=0){
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You "); player.AttackScalpel(enemy);

                    }
                }
            }
            else if(PlayerChoice.equalsIgnoreCase("GasBomb")){System.out.println("You grab a Bomb next to the testing area. 'GasBomb' it says.");
                enemy.health=60.0;
                enemy.strength=6.0;
                System.out.println("You "); player.AttackGasBomb(enemy);
                while (enemy.health > 0){
                    System.out.println("They do not fall.");
                    System.out.println("The first two enemies"); enemy.AttackUnarmed(player);
                    if(player.health<=0){
                        System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                        System.exit(6);
                    }
                }
                while (enemy.health > 0){System.out.println("You "); player.AttackGasBomb(enemy);}



                if(player.health>0){System.out.println("After you knock out the first two men, the other three approach. You battle them next.");
                    enemy.health=90.0;
                    enemy.strength=9.0;
                    player.AttackGasBomb(enemy);
                    while (enemy.health > 0){
                        System.out.println("They do not fall.");
                        System.out.println("The three enemies"); enemy.AttackUnarmed(player);
                        if(player.health<=0){
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You "); player.AttackGasBomb(enemy);

                    }
                    while (enemy.health > 0){ System.out.println("You "); player.AttackGasBomb(enemy);}

                }}
            else{System.out.println("You chose to grab nothing as the five men approach you.");
                enemy.health=60.0;
                enemy.strength=6.0;
                System.out.println("You see that all five men are slightly green, and very ill.");
                System.out.println("You "); player.AttackUnarmed(enemy);
                while (enemy.health > 0){
                    System.out.println("They do not fall.");
                    System.out.println("The first two enemies"); enemy.AttackUnarmed(player);
                    if(player.health<=0){
                        System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day "+Day+", you have died. Humanity has perished forever.");
                        System.exit(6);
                    }
                    System.out.println("You "); player.AttackUnarmed(enemy);


                }
                if(player.health>0){
                    System.out.println("After you knock out the first two men, the other three approach. You battle them next.");
                    enemy.health=90.0;
                    enemy.strength=9.0;
                    player.AttackUnarmed(enemy);
                    while (enemy.health > 0) {
                        System.out.println("They does not fall.");
                        System.out.println("The three enemies");
                        enemy.AttackUnarmed(player);
                        if (player.health <= 0) {
                            System.out.println("Suffering many blows, you finally collapse on the ground, dead. On day " + Day + ", you have died. Humanity has perished forever.");
                            System.exit(6);
                        }
                        System.out.println("You ");
                        player.AttackUnarmed(enemy);
                    }
                    }}
                System.out.println("After knocking out all 5 men, you decide to continue working on the cure.");
                    generator = new Random();
                    CureResearch = CureResearch + generator.nextInt(16) * 2.5;
                    System.out.println("You now have " + CureResearch + "% of the cure complete.");
                    if(CureResearch<100) {
                        System.out.println("After working for an entire day, you look at the cure progress.");
                        System.out.println("'"+CureResearch+"&. I failed.' You slump to the ground.");
                        System.out.println("The world has ended. You close your eyes and look upwards.");
                        System.out.println("There is no mirror to look outside.");
                        System.exit(7);
                    }

            if(CureResearch>=100) {
                    System.out.println("Cure Research is complete. the cure for your disease was made, but only you still stand. You inject the shot, but feel no better.");
                    System.out.println("You are why humanity dies, but you are the one who survives. Humanity will end with you, for you have survived, for now.");
                    System.out.println("It took you 10 days to cure your disease.");
                    System.exit(0);
                }}}}
