package springboot.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String topic;
    private String description;
    private String location;
    private String jobType;
    private boolean active;
    private String imgName;

    public Post(){}
    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<Candidacy> candidacyList;

    @ManyToOne
    @JoinColumn
    private User user;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String Id(){ return  id.toString();}

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<Candidacy> getCandidacyList() {
        return candidacyList;
    }

    public void setCandidacyList(List<Candidacy> candidacyList) {
        this.candidacyList = candidacyList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString(){
        return "Post{" +
                "id=" + id +
                ", topic=" + topic +
                ", description=" + description + '\'' +
                '}';
    }
}
