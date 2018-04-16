@Controller
public class HomeController {
	public static final int STUDENTS_ON_THE_PAGE = 25;
	@Autowired
	private StudentsService studentsService;

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Model model) {
		model.addAttribute("mainText", "Hello World");
		model.addAttribute("studentsList", studentsService.getAllStudents());
		return "home";
	}
}
