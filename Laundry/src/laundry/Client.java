/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;


import java.util.ArrayList;

public class Client implements User {
  private ArrayList<String> namaClient = new ArrayList<String>();
  private ArrayList<String> alamat = new ArrayList<String>();
  private ArrayList<String> telepon = new ArrayList<String>();
  private ArrayList<Integer> saldo = new ArrayList<Integer>();
  private ArrayList<String> email = new ArrayList<String>();
  
  public int size(){
     return this.namaClient.size();
  }
  
  public Client(){
     this.namaClient.add("Talitha");
     this.alamat.add("Kediri");
     this.telepon.add("082143655328");
     this.saldo.add(100000);
     this.email.add("ttalithasahdaaa@gmail.com");
             
     this.namaClient.add("Tasara");
     this.alamat.add("Kandat");
     this.telepon.add("08125905433");
     this.saldo.add(150000);
     this.email.add("talitha_rahima@gmail.com");
    }
    public int getId(String nama){
        return this.namaClient.indexOf(nama);
    }
    
    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public void addSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public void setSaldo(int id,int saldo){
        this.saldo.set(id, saldo);
    }
    
    @Override
    public void setEmail(String email){
        this.email.add(email);
    }
        

    @Override
    public String getNama(int id) {
        return this.namaClient.get(id);
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
    public String getEmail(int id){
        return this.email.get(id);
    }
    
    public int getSaldo(int id){
        return this.saldo.get(id);
    }
    
    public void tampilClient(){
        int n = this.namaClient.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Saldo   = "+getSaldo(i));
            System.out.println("Email   = "+getEmail(i));
        }
    }

   

   
    }


  
