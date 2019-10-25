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
public enum Sex {

    FEMININ,
    MASCULIN;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    public String descriere() {
        return ordinal() == 0 ? "fata" : "baiat";
    }
}
