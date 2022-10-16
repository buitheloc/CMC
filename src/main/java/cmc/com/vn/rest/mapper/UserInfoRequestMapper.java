package cmc.com.vn.rest.mapper;


import cmc.com.vn.model.entity.UserInfoEntity;
import cmc.com.vn.rest.request.UserInfoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserInfoRequestMapper extends LcMapper<UserInfoEntity, UserInfoRequest> {
}

