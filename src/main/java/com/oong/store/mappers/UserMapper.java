package com.oong.store.mappers;

import com.oong.store.dtos.UserDto;
import com.oong.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
