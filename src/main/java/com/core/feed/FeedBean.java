
package com.core.feed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


 
@ManagedBean(name="feedBean")
@RequestScoped
public class FeedBean {

    public String imageOf(String link){
        String ytimgLink = "https://i.ytimg.com/vi/";
        String image = "/hqdefault.jpg";
        
        return ytimgLink + link.split("v=")[1] + image;
    }
}
