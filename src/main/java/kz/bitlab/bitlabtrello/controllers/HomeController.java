package kz.bitlab.bitlabtrello.controllers;

import kz.bitlab.bitlabtrello.db.Folder;
import kz.bitlab.bitlabtrello.db.FolderRepository;
import kz.bitlab.bitlabtrello.db.Task;
import kz.bitlab.bitlabtrello.db.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private FolderRepository folderRepository;

    @GetMapping("/home")
    public String getHome(Model model){

        Task task = taskRepository.findById(1);

        Iterable<Folder> folderList = folderRepository.findAll();
//        for(Folder folder : folderList)
        model.addAttribute("folderList", folderList);

        model.addAttribute("task", task);

        return "index";
    }
}
