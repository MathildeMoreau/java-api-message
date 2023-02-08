package com.tutoderien.DemoSpringBoot.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.tutoderien.DemoSpringBoot.model.Message;

@Service
public interface MessageDAO extends JpaRepository<Message, Long>{

}
