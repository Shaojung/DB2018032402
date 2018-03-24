package com.example.student.db2018032402;

import java.util.List;

/**
 * Created by student on 2018/3/24.
 */

public interface StudentDAO {
    List<String> getList();
    void AddPhone(Phone p);
}
