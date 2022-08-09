package org.springboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String weight;
    private String cat_id;
    private String name;
    private String temperament;
    private String origin;
    private String description;
    private String life_span;
    private int adaptability;
    private int energy_level;
    private int grooming;
    private int health_issues;
    private String wikipedia_url;
    private String image_id;
    private int image_width;
    private int image_height;
    private String image_url;

    public cats() {}

    public cats(String weight, String cat_id, String name, String temperament, String origin, String description,
    String life_span,
    int adaptability,
    int energy_level,
    int grooming,
    int health_issues,
    String wikipedia_url,
    String image_id,
    int image_width,
    int image_height,
    String image_url) {
        this.weight = weight;
        this.cat_id = cat_id;
        this.name = name;
        this.temperament = temperament;
        this.origin = origin;
        this.description = description;
        this.life_span = life_span;
        this.adaptability = adaptability;
        this.energy_level = energy_level;
        this.grooming = grooming;
        this.health_issues = health_issues;
        this.wikipedia_url = wikipedia_url;
        this.image_id = image_id;
        this.image_width = image_width;
        this.image_height = image_height;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLife_span() {
        return life_span;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    public int getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(int adaptability) {
        this.adaptability = adaptability;
    }

    public int getEnergy_level() {
        return energy_level;
    }

    public void setEnergy_level(int energy_level) {
        this.energy_level = energy_level;
    }

    public int getGrooming() {
        return grooming;
    }

    public void setGrooming(int grooming) {
        this.grooming = grooming;
    }

    public int getHealth_issues() {
        return health_issues;
    }

    public void setHealth_issues(int health_issues) {
        this.health_issues = health_issues;
    }

    public String getWikipedia_url() {
        return wikipedia_url;
    }

    public void setWikipedia_url(String wikipedia_url) {
        this.wikipedia_url = wikipedia_url;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public int getImage_width() {
        return image_width;
    }

    public void setImage_width(int image_width) {
        this.image_width = image_width;
    }

    public int getImage_height() {
        return image_height;
    }

    public void setImage_height(int image_height) {
        this.image_height = image_height;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}