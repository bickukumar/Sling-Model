package com.mysite.core.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.json.JSONException;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

import org.apache.sling.commons.json.JSONObject;
import org.apache.sling.commons.json.JSONTokener;

import javax.jcr.*;
import javax.json.Json;
import javax.json.JsonObject;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class ImportantLinksModel {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @SlingObject
    ResourceResolver rs;

    @ValueMapValue
    private List<LinkModelPojo> links;

    public List<LinkModelPojo> getLinks() {
        return links;
    }

//    public void setLinks(List<LinkModelPojo> links) {
//
//        LOGGER.info("Starting for loop...");
//
//        for(LinkModelPojo linkModelPojo : links){
//
//            LOGGER.info("The current link is {}", links.get(0));
//            String url = linkModelPojo.getLink();
//
//            if(url.startsWith("/content")){
//                Resource resource = rs.getResource(url);
//                if(resource != null){
//                    url += ".html";
//                } else {
//                    url = url;
//                }
//            }
//
//        }
//    }

    @PostConstruct
    public void init(){

        LOGGER.info("Starting the logic...");

//        for(LinkModelPojo linkModelPojo : links){
//
//            LOGGER.info("The current link is {}", links.get(0));
//            String url = linkModelPojo.getLink();
//
//            if(url.startsWith("/content")){
//                Resource resource = rs.getResource(url);
//                if(resource != null){
//                    url += ".html";
//                } else {
//                    url = url;
//                }
//            }
//
//        }
//        LOGGER.info("The links are {} ", links.toString());
        LOGGER.info("Ending the logic");
    }

}













