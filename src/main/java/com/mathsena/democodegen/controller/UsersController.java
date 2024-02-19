package com.mathsena.democodegen;

import com.mathsena.democodegen.api.UsersApi;
import com.mathsena.democodegen.model.UsersPost201Response;
import com.mathsena.democodegen.model.UsersPostRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController implements UsersApi{



    @Override
    public ResponseEntity<UsersPost201Response> usersPost(UsersPostRequest usersPostRequest) {
        return UsersApi.super.usersPost(usersPostRequest);
    }
}
