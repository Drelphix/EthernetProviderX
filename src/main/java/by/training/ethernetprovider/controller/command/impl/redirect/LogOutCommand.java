package by.training.ethernetprovider.controller.command.impl.redirect;

import by.training.ethernetprovider.controller.command.AttributeAndParameter;
import by.training.ethernetprovider.controller.command.Command;
import by.training.ethernetprovider.controller.command.PagePath;
import by.training.ethernetprovider.controller.command.Router;
import by.training.ethernetprovider.exception.CommandException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


public class LogOutCommand implements Command {
    @Override
    public Router execute(HttpServletRequest request) throws CommandException {
        var httpSession = request.getSession(true);
        httpSession.removeAttribute(AttributeAndParameter.USERNAME);
        return new ToPreviousPage().execute(request);
    }
}
