/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package studlist;

/**
 *This class is inherited by student class
 * @author Megha Patel,2022
 */
public class PartTimeStudent extends Student {
    private int numOfCourses;

    /**
     * @return the numOfCourses
     */
    public int getNumOfCourses() {
        return numOfCourses;
    }

    /**
     * @param numOfCourses the numOfCourses to set
     */
    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
}
