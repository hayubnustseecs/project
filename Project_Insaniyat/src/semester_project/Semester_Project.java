package semester_project;

import java.sql.*;
import javax.swing.JOptionPane;

public class Semester_Project {

    int age;
    String email;
    boolean b = false;
    public static Connection connectDB(String url){
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    } 
    
    public static void main(String[] args) {
        Sign_In si = new Sign_In();
        si.setVisible(true);
        Semester_Project sempro = new Semester_Project();
        
    }
    public boolean DonorCheck(String name,String fname,String cnic,String age,String mobileNo,String city,String district,
                   String country,String religion,String address ){
        
        if (name.toLowerCase().matches(".*[a-z].*")) {
            if (fname.toLowerCase().matches(".*[a-z].*")) {
                if (cnic.matches("\\d+") && cnic.length() == 13) {
                    if (age.matches("\\d+")) {
                        if (city.toLowerCase().matches(".*[a-z].*")) {
                            if (district.toLowerCase().matches(".*[a-z].*")) {
                                if (country.toLowerCase().matches(".*[a-z].*")) {
                                    if (religion.toLowerCase().matches(".*[a-z].*")) {
                                        b = true;
                                    }else{
                                        JOptionPane.showMessageDialog(null,"Invalid Religion");
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Invalid Country");
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"Invalid District");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Invalid City");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Invalid Age");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid CNIC");
                }    
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Father Name");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Name");
        }
        return b;
    }   

    public boolean checking(String uname, String fname, String ucnic, String uage, String ucity, String ucountry, String udistrict, String upreAddress, String uperAddress, String uemail, String umobileNum, String uphoneNum) {
        b = false;
        if (uname.toLowerCase().matches(".*[a-z].*")) {
            if (fname.toLowerCase().matches(".*[a-z].*")) {
                if (ucnic.matches("\\d+") && ucnic.length() == 13) {
                    if (uage.matches("\\d+") && Integer.parseInt(uage) >= 0 && uage.matches("\\d+") && Integer.parseInt(uage) <= 115) {
                        if (ucity.toLowerCase().matches(".*[a-z].*")) {
                            if (ucountry.toLowerCase().matches(".*[a-z].*")) {
                                if (udistrict.toLowerCase().matches(".*[a-z].*")) {
                                    if (umobileNum.matches("\\d+") && uphoneNum.length() == 11) {
                                        if (uphoneNum.matches("\\d+") && uphoneNum.length() == 11) {
                                            b = true;
                                            

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Invalid Phone Number");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Invalid Mobile Number");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Invalid domicile");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid Country");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid City");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Age");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid CNIC");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Father Name");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Name");
        }
        return b;
    }

    public boolean signUp_ContCheck(String ufmembers, String ufincome, String ufamilySupport, String uplotsCost,
            String ulandArea, String ulandCost, String uvCost, String hsize,
            String hcost, String eUtility, String eMedical, String eEducation, String eAccomodation, String eMisc) {
        boolean bool = false;
        if (ufmembers.matches("\\d+")) {
            if (ufincome.matches("\\d+")) {
                if (ufamilySupport.matches("\\d+")) {
                    if (uplotsCost.matches("\\d+")) {
                        if (ulandArea.matches("\\d+")) {
                            if (ulandCost.matches("\\d+")) {
                                if (uvCost.matches("\\d+")) {
                                    if (hsize.matches("\\d+")) {
                                        if (hcost.matches("\\d+")) {
                                            if (eUtility.matches("\\d+")) {
                                                if (eMedical.matches("\\d+")) {
                                                    if (eEducation.matches("\\d+")) {
                                                        if (eAccomodation.matches("\\d+")) {
                                                            if (eMisc.matches("\\d+")) {
                                                                
                                                                    bool = true;
                                                                
                                                            } else {
                                                                JOptionPane.showMessageDialog(null, "Misc. Expenditures should be an integer value.");
                                                            }
                                                        } else {
                                                            JOptionPane.showMessageDialog(null, "Accomodation Expenditures should be an integer value.");
                                                        }
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Education Expenditures should be an integer value.");
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Medical Expenditures should be an integer value.");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Utility Expenditures should be an integer value.");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "House Cost should be numeric.");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "House Size should be numeric.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Vehicles Cost should be numeric.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Agricultural Land Cost should be numeric.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Agricultural Land Area should be numeric.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Plots Cost should be numeric.");
                    }                                        
                } else {
                    JOptionPane.showMessageDialog(null, "Family Support should be numeric.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Family Income should be numeric.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Family Members should be numeric.");
        }
        return true;
    }
}
