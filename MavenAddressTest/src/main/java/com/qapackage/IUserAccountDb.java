package com.qapackage;

import java.util.List;

public interface IUserAccountDb {
    /**
     * Retrieves a list of valid city names.
     *
     * @return A List of Strings representing valid city names.
     */
    List<String> getCityNames();
}
