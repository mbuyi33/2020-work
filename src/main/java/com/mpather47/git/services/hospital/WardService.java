package com.mpather47.git.services.hospital;

import com.mpather47.git.entity.hospital.Ward;
import com.mpather47.git.services.IService;

import java.util.List;
import java.util.Set;


public interface WardService extends IService<Ward, Integer> {
    List<Ward> getAll();
}
