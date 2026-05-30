package ru.practicum.main_service.comment.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main_service.MainConstants;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class NewCommentDto {
    @NotBlank
    @Size(min = MainConstants.MIN_LENGTH_COMMENT_TEXT, max = MainConstants.MAX_LENGTH_COMMENT_TEXT)
    String text;
}
