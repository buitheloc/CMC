package cmc.com.vn.repository;

import cmc.com.vn.model.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
    List<UserInfoEntity> findByUserId(String userId);
}
