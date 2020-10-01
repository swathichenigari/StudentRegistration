package com.student.registration.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.student.registration.bo.Student;
import com.student.registration.dto.StudentDTO;

@Mapper(imports = { AddressMapper.class })
public interface StudentMapper {
	
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
	@Mappings({
	@Mapping(target="employeeName", source="entity.name")
	})

	public Student dtotoentity(StudentDTO studentDto);
	
	public StudentDTO entityToDto(Student student);
	
}
