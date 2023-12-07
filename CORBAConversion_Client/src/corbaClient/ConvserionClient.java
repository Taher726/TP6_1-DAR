// Package "corbaClient"
// Ce package contient la classe "ConvserionClient" qui représente un client pour le serveur CORBA.
package corbaClient;
// Import des classes nécessaires
import corbaConversion.IConversionRemote;
import corbaConversion.IConversionRemoteHelper;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

// Classe "ConvserionClient"
public class ConvserionClient {
    public static void main(String[] args) {
        try {
            // Initialisation du contexte JNDI
            Context ctx = new InitialContext();

            // Recherche de l'objet distant dans le contexte JNDI sous le nom "0D"
            Object ref = ctx.lookup("0D");

            // Conversion de l'objet distant en un stub utilisable via l'interface CORBA
            IConversionRemote stub = IConversionRemoteHelper.narrow((org.omg.CORBA.Object) ref);

            // Appel de la méthode distante et affichage du résultat
            System.out.println(stub.conversionMontant(15));
        } catch (NamingException e) {
            // Gestion des exceptions liées à la recherche dans le contexte JNDI
            System.out.println(e);
        }
    }
}
