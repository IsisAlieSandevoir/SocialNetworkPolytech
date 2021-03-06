package com.polytech.web;

import com.polytech.services.FeedService;
import com.polytech.services.PublicationService;
import com.polytech.services.Story;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FeedController {

    private PublicationService publicationService;
    private FeedService feedService;

    public FeedController(PublicationService publicationService, FeedService feedService){
        this.publicationService = publicationService;
        this.feedService = feedService;
    }

    @RequestMapping(value="/share", method = RequestMethod.POST)
    public String post(String story) {
        publicationService.share(new Story(story));
        return "redirect:/feed";
    }

    @RequestMapping(value="/feed", method=RequestMethod.GET)
    //pour afficher
    public String feed(Model model) {
        List<Story> stories = feedService.findAll();
        model.addAttribute("stories", stories);
        return "feed";
    }
}
