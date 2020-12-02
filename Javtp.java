public class Main {


Public statict void main (String[] args) {
// todo Auto generated method stub

System.out.println("Bonjour");


}

public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
char c ='1';

do {

// Entrer deux valeur 

System.out

hg = sc.nextInt();
 vc = sc.nextInt();
int resultat

afficher("resultat ="+resultat);
System.out.println("Entrer o pour terminer");
afficher (String.valueOf(resultat));
c = sc.next().charArt(0);
} // fonction Main

public static void afficher (String g) {
    system.out.println(g);
}

public static inte some (int it , int j ) {
return i+j
}

COURS DE JAVA

Public class compte

{
private float solde ;
private client client ;

private ArrayList <Mouvement> listMouvement ;



public compte ( float solde , Client client )
{
  this solde = solde;
  this client = client ;
  this.listMouvement = new Arraylist <> ();

// Getter 

public Client getClient()
{
   return this client;
}


public void SetClient (Client client ) 
{
  Thisclient 
}




public void debiter ( float montant )
{
  this.solde =  this.solde - montant ;
  Mouvement mouv = new Mouvement "delete" , montant);
  this.listMouvement.add(mouv);
}