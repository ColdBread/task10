@Controller
public class AdminController {

	@Autowired
	private StudentsService studentsService;

	@RequestMapping({ "/admin" })
	public String workWithStudents(Model model) {
		model.addAttribute("mainText", "Admin part of work with students");
		model.addAttribute("studentsList", studentsService.getAllStudents());
		return "/admin/main";
	}
}
