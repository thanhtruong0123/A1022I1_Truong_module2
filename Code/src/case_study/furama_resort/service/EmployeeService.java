package case_study.furama_resort.service;

import java.io.IOException;

public interface EmployeeService extends Service {
    @Override
    void display() throws IOException;

    @Override
    void addNew() throws IOException;

    @Override
    void editService() throws IOException;
}
