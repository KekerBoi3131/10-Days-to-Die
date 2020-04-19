import java.util.Random;
public class Attacks {
 public String name;
 public Double strength;
 public Double health;


// UNARMED ATTACKS UNDER
 public void AttackUnarmed(Attacks target) {
 Double damage = this.strength;
 damage=damage*.125;
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
 System.out.println(target.name+" now has "+target.health+" HP.");

 }
// SYRINGE ATTACKS UNDER
 public void AttackSyringe(Attacks target) {
 Random generator=new Random();
 Double damage=this.strength;
 if(generator.nextInt(26)==10) {
 damage=damage*2;
 }
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// GUN ATTACKS UNDER
 public void AttackGun(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*2;
 if(generator.nextInt(6)==3) {
 damage=damage*1.5;
 }
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// ROCK ATTACK UNDER
 public void AttackRock(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 if(generator.nextInt(3)==2){
 damage=damage*1.5;
 }
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// KNIFE ATTACK UNDER
 public void AttackKnife(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*2;
 if(generator.nextInt(3)==2){
 damage=damage*1.5;
 }
  target.health-=damage;
  System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// SCALPEL ATTACK UNDER
 public void AttackScalpel(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*0.5;
 if(generator.nextInt(6)==2) {
 damage = damage * 2;
 }
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// BOMB ATTACK UNDER
 public void AttackBomb(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*5;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
 if(generator.nextInt(3)==2) {
 health-=damage;
 System.out.println("inside the blast radius and received -"+damage+" HP.");
}
 target.health-=damage;
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// MEDICAL SCISSORS ATTACK UNDER
 public void AttackMedicalScissors(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*0.25;
 if(generator.nextInt(8)==2) {
 damage = damage*4;
}
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// TAPE ATTACK UNDER
 public void AttackTape(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*0;
 if(generator.nextInt(11)==2) {
 damage = target.health;
 System.out.println("suffocated "+target.name);
}
 else{System.out.println("attempted to suffocate "+target.name+" but failed! 0 damage dealt.");
}
  target.health-=damage;
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// TABASCO SAUCE ATTACK UNDER
 public void AttackTabascoSauce(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*0.25;
 if(generator.nextInt(8)==2) {
 damage = damage*4;
}
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// PAN ATTACK UNDER
  public void AttackPan(Attacks target){
  Random generator=new Random();
  Double damage=this.strength;
  damage=damage*0.25;
  if(generator.nextInt(3)==2) {
   damage = damage*4;
  }
  target.health-=damage;
  System.out.println("damaged "+target.name+" for "+damage+" HP.");
   System.out.println(target.name+" now has "+target.health+" HP.");
 }
 // SPOON ATTACK UNDER
 public void AttackSpoon(Attacks target){
  Random generator=new Random();
  Double damage=this.strength;
  damage=damage*0.25;
  if(generator.nextInt(8)==2) {
   damage = damage*5;
  }
  target.health-=damage;
  System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
 // CLEAVER ATTACK UNDER
 public void AttackCleaver(Attacks target){
  Random generator=new Random();
  Double damage=this.strength;
  damage=damage*2.5;
  if(generator.nextInt(3)==2) {
   damage = damage*1.5;
  }
  target.health-=damage;
  System.out.println("damaged "+target.name+" for "+damage+" HP.");
  System.out.println(target.name+" now has "+target.health+" HP.");
 }
// FORK ATTACK UNDER
public void AttackFork(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=damage*.125;
 if(generator.nextInt(3)==2) {
  damage = damage*2;
 }
 target.health-=damage;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
 System.out.println(target.name+" now has "+target.health+" HP.");
 }
// GAS BOMB ATTACK UNDER
public void AttackGasBomb(Attacks target){
 Random generator=new Random();
 Double damage=this.strength;
 damage=target.health;
 System.out.println("damaged "+target.name+" for "+damage+" HP.");
 if(generator.nextInt(3)==2) {
  health=health/2;
  System.out.println(" you were inside the bomb's radius and received -"+health/2+" HP.");
 }
 target.health-=damage;
 System.out.println(target.name+" now has "+target.health+" HP.");
}}
