package deployment.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiagramController {

	@RequestMapping("/diagram")
	public String diagram(Model model) {
		model.addAttribute("servers", "ser");
		return "diagram";
	}
}
