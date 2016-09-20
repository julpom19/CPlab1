/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalcrud;

import dbhelpers.DoctorHelper;
import dbhelpers.PatientHelper;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.*;

/**
 *
 * @author Интернет
 */
public class HospitalCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PatientHelper helper = PatientHelper.getInstance();
//        List<Patient> listOfPatients = helper.selectPatients();
//        if(listOfPatients != null) {
//            for(Patient patient: listOfPatients) {
//                System.out.println(patient);
//            }
//        }
//
//        Patient patient = new Patient("Ivan", "Smith", "11.09.1995", "strSovetkay133", "myopia");
//
//        helper.addPatient(patient);
//        patient.setName("Vasya");
//        helper.updatePatient(patient);
        
        DoctorHelper doctorHelper = DoctorHelper.getInstance();
        Doctor d = new Doctor("Kate", "Johnson", "pediatr");
        doctorHelper.addDoctor(d);
        doctorHelper.addDoctor(d);
        d.setName("Mila");
        doctorHelper.updateDoctor(d);
        doctorHelper.deleteDoctor(d);
        List<Doctor> list = doctorHelper.selectDoctors();
        for(Doctor doctor: list) {
            System.out.println(doctor);
        }
        
        
        
        
    }
    
}
