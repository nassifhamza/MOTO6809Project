/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moto;

/**
 *
 * @author admin
 */
public class VALUES {
  private  String STFX;
 private  int VA;
    public VALUES(String STFX,int VA)
    {
        this.STFX=STFX;
        this.VA=VA;
    }
    
    public void setVA(int VA)
    {
        this.VA=VA;
        
    }
    public int getVA()
    {
        return VA;
    }
    public void setSTFX(String STFX)
    {
        this.STFX=STFX;
    }
    public String getSTFX()
    {
        return STFX;
    }
}
