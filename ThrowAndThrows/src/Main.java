import java.util.*;

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

class UserService {
    private Set<String> users = new HashSet<>();

    public void registerUser(String username) throws UserAlreadyExistsException {
        if (users.contains(username)) {
            throw new UserAlreadyExistsException("User already exists: " + username);
        }
        users.add(username);
    }

    public void checkUserExistence(String username) throws UserNotFoundException {
        if (!users.contains(username)) {
            throw new UserNotFoundException("User not found: " + username);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.registerUser("harsha");
            userService.checkUserExistence("harsha");
            userService.registerUser("harsha");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
