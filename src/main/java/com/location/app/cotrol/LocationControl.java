package com.location.app.cotrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.location.app.entities.Location;
import com.location.app.repository.LocationRepository;

@Controller
public class LocationControl {
	
	@Autowired
	private LocationRepository locationRepo;
	
	@RequestMapping("/showLocation")
public String showLocation()
{
	return "showLocation";
}
	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelMap)
	{
		locationRepo.save(location);
		modelMap.addAttribute("msg", "location saved !!");
		return "showLocation";
		
	}
	
}
