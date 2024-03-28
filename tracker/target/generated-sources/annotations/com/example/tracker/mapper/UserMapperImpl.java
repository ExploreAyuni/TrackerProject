package com.example.tracker.mapper;

import com.example.tracker.dto.UserDto;
import com.example.tracker.entity.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-28T20:26:56+0800",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity mapperDtoToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userDto.getId() );
        userEntity.setEmail( userDto.getEmail() );
        userEntity.setPassword( userDto.getPassword() );
        userEntity.setFirstName( userDto.getFirstName() );
        userEntity.setLastName( userDto.getLastName() );
        userEntity.setIsActive( userDto.getIsActive() );

        return userEntity;
    }

    @Override
    public UserDto mapperEntityToDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userEntity.getId() );
        userDto.setEmail( userEntity.getEmail() );
        userDto.setPassword( userEntity.getPassword() );
        userDto.setFirstName( userEntity.getFirstName() );
        userDto.setLastName( userEntity.getLastName() );
        userDto.setIsActive( userEntity.getIsActive() );

        return userDto;
    }
}
