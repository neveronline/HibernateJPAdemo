package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Leo
 * Email: haojun02@meituan.com
 * Date:4/7/18
 * Time:12:05 AM
 * ------------------------------------
 * Desc:
 */
@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping(name = "/authors")
    public String getAuthors(Model model){
        // 在html中通过attribute 名称来调用数据
        model.addAttribute("authors", authorRepository.findAll());
        //返回值对应templates 中html名称
        return "authors";
    }
}
