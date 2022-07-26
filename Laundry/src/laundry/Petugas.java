/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> email = new ArrayList<String>();

    public Petugas(){
       this.namaPetugas.add("Administrator X");
       this.alamat.add("Doko");
       this.telepon.add("081*********");
       this.email.add("tttalithasahdaaa@gmail.com");

       this.namaPetugas.add("Administrator Y");
       this.alamat.add("Ngasem");
       this.telepon.add("088*********");
       this.email.add("talitha_rahima@gmail.com");
    } 

    @Override
    public void setNama(String nama) {
       this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon) {
         this.telepon.add(telepon);
    }

    @Override
    public void setEmail(String email) {
         this.email.add(email);
    }
    
    @Override
    public String getNama(int id) {
         return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
          return this.alamat.get(id);
    }
     
     @Override
    public String getTelepon(int id) {
          return this.telepon.get(id);
    }
    
     @Override
    public String getEmail(int id) {
          return this.email.get(id);
    }

    public void tampilPetugas(){
       int n = this.namaPetugas.size();
       for(int i=0;i<n;i++){
           System.out.println("--------------------");
           System.out.println("Nama    = "+getNama(i));
           System.out.println("Alamat  = "+getAlamat(i));
           System.out.println("Telepon = "+getTelepon(i));
           System.out.println("Email   = "+getEmail(i));
       }
    }

   
    }
   
  
     

    
    


