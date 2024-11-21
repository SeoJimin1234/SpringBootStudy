package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import validation.annotation.ExistCategories;

import java.util.List;

public class UserRequestDTO {
    @Getter
    public static class JoinDto{
        @NotBlank
        String name;
        @NotNull
        Integer gender;
        @NotNull
        Integer birthYear;
        @NotNull
        Integer birthMonth;
        @NotNull
        Integer birthDay;
        @Size(min = 5, max=22)
        String address;
        @ExistCategories
        List<Long> preferCategory;
        @NotNull
        String phone;
        @NotNull
        String email;
    }
}
