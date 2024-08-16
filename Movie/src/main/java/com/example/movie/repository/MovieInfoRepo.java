package com.example.movie.repository;

import com.example.movie.Entity.MovieInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 첫번째 인자 : 어떤 Entity인지, 두번째 인자 : pk 어떤 타입인지
public interface MovieInfoRepo extends JpaRepository<MovieInfoEntity, Long>
{
}
