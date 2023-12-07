package service;
// Package "service"
// Ce package contient la classe "ConversionImpl" qui implémente l'interface "IConversionRemotePOA" du module "corbaConversion".

// Import de l'interface générée par CORBA
import corbaConversion.IConversionRemotePOA;
// Classe "ConversionImpl"
// Cette classe hérite de l'interface abstraite générée par CORBA, précédée du suffixe "POA" (Portable Object Adapter).
public class ConversionImpl extends IConversionRemotePOA{
    // Méthode "conversionMontant"
    // Cette méthode implémente la conversion de montant spécifiée dans l'interface.
    // Elle prend un montant en entrée (mt) de type float et renvoie le montant converti de type double.
    public double conversionMontant(float mt){
        // La conversion consiste à multiplier le montant par 3.2 (exemple arbitraire).
        return mt * 3.2;
    }
}
