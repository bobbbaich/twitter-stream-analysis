package com.bobbbaich.fb.bot.service;

import com.bobbbaich.fb.bot.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    Long create(User user);
}
