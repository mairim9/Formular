/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatie;

/**
 *
 * @author instructor
 */
public class Persoana {

    private String nume;
    private int varsta;
    private Sex sex;
    private boolean casatorit;

    public Persoana(String nume, int varsta, Sex sex, boolean casatorit) {
        this.nume = nume;
        this.varsta = varsta;
        this.sex = sex;
        this.casatorit = casatorit;
    }

    @Override
    public String toString() {
        return nume + ", " + varsta + " ani, " + sex.descriere() + ", " + (casatorit ? "" : "ne") + "casatorit(a)";
    }

}
