package ru.practicum.shareit.user.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class UserDto {

    private Long id;
    @NotNull
    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;
}
