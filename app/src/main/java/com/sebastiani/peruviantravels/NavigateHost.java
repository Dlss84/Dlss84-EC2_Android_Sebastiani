package com.sebastiani.peruviantravels;

import androidx.fragment.app.Fragment;

public interface NavigateHost{

    void navigateTo(Fragment fragment, boolean addToBackstack);
}