package com.example.tracker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.tracker.dto.UserDto;
import com.example.tracker.entity.UserEntity;


@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity mapperDtoToEntity(UserDto userDto);
    UserDto mapperEntityToDto(UserEntity userEntity);
}

