package org.caixuan;

public class DiplomaData {

    private String bilangan;
    private String category;
    private String name;
    private Integer total=0;
    private Integer max=0;
    private Integer min=0;
    private String intake_2014;
    private String intake_2015;
    private String intake_2016;
    private String intake_2017;
    private String intake_2018;
    private String intake_2019;

    public DiplomaData(String bilangan,String category,String name,String intake_2014,String intake_2015,String intake_2016,String intake_2017,String intake_2018,String intake_2019){
        this.bilangan=bilangan;
        this.category=category;
        this.name = name;
        this.intake_2014 = intake_2014;
        this.intake_2015 = intake_2015;
        this.intake_2016 = intake_2016;
        this.intake_2017 = intake_2017;
        this.intake_2018 = intake_2018;
        this.intake_2019 = intake_2019;

    }
    public DiplomaData(String category, String name, int total, int max, int min){
        this.category=category;
        this.name = name;
        this.total=total;
        this.max=max;
        this.min=min;

    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getBilangan() {
        return bilangan;
    }

    public String getIntake_2014() {
        return intake_2014;
    }

    public String getIntake_2015() {
        return intake_2015;
    }

    public String getIntake_2016() {
        return intake_2016;
    }

    public String getIntake_2017() {
        return intake_2017;
    }

    public String getIntake_2018() {
        return intake_2018;
    }

    public String getIntake_2019() {
        return intake_2019;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getTotal() {
        return total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setIntake_2014(String intake_2014) {
        this.intake_2014 = intake_2014;
    }

    public void setIntake_2019(String intake_2019) {
        this.intake_2019 = intake_2019;
    }

    public void setIntake_2017(String intake_2017) {
        this.intake_2017 = intake_2017;
    }

    public void setIntake_2018(String intake_2018) {
        this.intake_2018 = intake_2018;
    }

    public void setIntake_2016(String intake_2016) {
        this.intake_2016 = intake_2016;
    }

    public void setIntake_2015(String intake_2015) {
        this.intake_2015 = intake_2015;
    }

    public void setBilangan(String bilangan) {
        this.bilangan = bilangan;
    }

    @Override
    public String toString() {
        return category+" " +name+" "+ total + " " + max + " "+ min;
    }
}
