package com.arab_developers_apps.theqah.models;

import java.io.Serializable;

public class AboutAppModel implements Serializable {
    //whats app
    private String phone_number;
    private String mobile_number;
    private String contact_email;
    private String facebook;
    private String twitter;
    private String instagram;
    private String linkedin;
    private String video_link;
    private String about_us;
    private String terms;
    private String guarantees;
    private int per;
    private int thiqah_rate;
    private int thiqah_average_amount;
    private int thiqah_average_value;


    public String getPhone_number() {
        return phone_number;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getContact_email() {
        return contact_email;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getVideo_link() {
        return video_link;
    }

    public String getAbout_us() {
        return about_us;
    }

    public String getTerms() {
        return terms;
    }

    public String getGuarantees() {
        return guarantees;
    }

    public int getThiqah_rate() {
        return thiqah_rate;
    }

    public int getThiqah_average_amount() {
        return thiqah_average_amount;
    }

    public int getThiqah_average_value() {
        return thiqah_average_value;
    }

    public int getPer() {
        return per;
    }
}
