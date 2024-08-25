package com.example.movie.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member extends BaseTime{

    @Id @GeneratedValue
    private Long id;

    @NotEmpty
    private String memberId;
    @NotEmpty
    private String password;
    @NotEmpty
    private String userName;
    private String userMovieTag;

    @OneToMany(mappedBy = "member")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MovieInfoEntity> movies = new ArrayList<>();

    public void addReview(Review review){
        reviews.add(review);
        review.setMember(this);
    }
}
