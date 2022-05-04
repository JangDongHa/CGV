package com.kit.cgv.jpa.domain.movieposter;

import com.kit.cgv.jpa.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name="MOVIEPOSTER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MoviePoster extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MOVIE_POSTER")
    private Long id;

    @Column(name="PATH", nullable = false)
    private String path;

    @Column(name="TYPE", nullable = false)
    private String type;

}
