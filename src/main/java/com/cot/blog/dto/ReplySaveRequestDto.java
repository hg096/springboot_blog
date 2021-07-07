package com.cot.blog.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ReplySaveRequestDto {
	private int userId;
	private int boardId;
	private String content;
	
}
