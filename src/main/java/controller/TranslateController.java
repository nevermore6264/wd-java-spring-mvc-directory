package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/home/")
public class TranslateController {

    @RequestMapping("")
    public String loadIndex() {
        return "index";
    }

    @RequestMapping(value = "translate", method = RequestMethod.GET)
    public String translate(
            @RequestParam(value = "keyword", required = false) String key,
            ModelMap modelMap
    ) {


        Map<String, String> maps = new HashMap<>();
        maps.put("love", "Yêu");
        maps.put("want", "Muốn");
        maps.put("like", "Thích");
        maps.put("hate", "Ghét");
        maps.put("bike", "Xe đạp");
        maps.put("motobike", "Xe máy");
        if (maps.containsKey(key)) {
            modelMap.addAttribute("result", maps.get(key));
        } else {
            modelMap.addAttribute("message", "Not found");
        }
        return "index";
    }
}
