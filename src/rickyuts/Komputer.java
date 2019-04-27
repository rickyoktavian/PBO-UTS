/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rickyuts;

/**
 *
 * @author User
 */
public class Komputer {
    protected CPU cpu = new CPU();
    
        Komputer(CPU cpu){
        this.cpu = cpu;
    }

   

    Komputer(){}

    public void memasang(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU: " + cpu.getCPUData() + " GHz dipasang");
    }
    public void mencabut(){
        System.out.println("CPU: " + this.cpu.getCPUData() + " GHz dicabut");
    }
    public void cetakInfo(){
        System.out.println("Spesifikasi : CPU: " + cpu.getCPUData() + " GHz");
    }
    
}
