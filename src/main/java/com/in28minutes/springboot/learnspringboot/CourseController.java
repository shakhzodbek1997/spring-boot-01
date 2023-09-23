package com.in28minutes.springboot.learnspringboot;

// /courses
// course details: ID, Name, Author

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/ ")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "AWS", "in28minutes"),
                new Course(2, "DevOps", "in28minutes")
        );
    }
}
