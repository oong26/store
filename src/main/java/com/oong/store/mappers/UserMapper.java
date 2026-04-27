package com.oong.store.mappers;

import com.oong.store.dtos.RegisterUserRequest;
import com.oong.store.dtos.UpdateUserRequest;
import com.oong.store.dtos.UserDto;
import com.oong.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
