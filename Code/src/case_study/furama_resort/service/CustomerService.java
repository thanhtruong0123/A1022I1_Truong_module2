package case_study.furama_resort.service;

public interface CustomerService extends Service {
    @Override
    void display();

    @Override
    void addNew();

    @Override
    void editService();
}