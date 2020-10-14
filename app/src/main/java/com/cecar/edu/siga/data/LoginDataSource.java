package com.cecar.edu.siga.data;

import com.cecar.edu.siga.data.model.LoggedInUser;

import java.io.IOException;


public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "---");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error al iniciar sesión", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
