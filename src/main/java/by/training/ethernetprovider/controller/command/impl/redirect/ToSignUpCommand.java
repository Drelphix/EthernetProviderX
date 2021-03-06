package by.training.ethernetprovider.controller.command.impl.redirect;

import by.training.ethernetprovider.controller.command.Command;
import by.training.ethernetprovider.controller.command.PagePath;
import by.training.ethernetprovider.controller.command.Router;
import jakarta.servlet.http.HttpServletRequest;

public class ToSignUpCommand implements Command {
    @Override
    public Router execute(HttpServletRequest request) {
        return new Router(PagePath.REGISTRATION, Router.RouterType.REDIRECT);
    }
}
