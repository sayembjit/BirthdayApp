package com.mottakin.birthdayReminder.service;

import com.mottakin.birthdayReminder.model.Birthday;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BirthdayService {
    /*List<Birthday> birthdayList = new ArrayList<>();
    @PostConstruct
    public void init()
    {
        birthdayList.add(new Birthday(1, "Sayem","November 28th"));
        birthdayList.add(new Birthday(2, "Ifran","November 23th"));
        birthdayList.add(new Birthday(3, "Maruf","November 25th"));

    }

    public Birthday findById(Integer id) {
        for (Birthday b : birthdayList) {
            if (Objects.equals(b.getId(), id))
                return b;
        }
        return null;
    }

    public List<Birthday> getAllCandidate() {
        return birthdayList;
    }

    public void addCandidate(Birthday birthday) {
        birthdayList.add(birthday);
    }*/
}
