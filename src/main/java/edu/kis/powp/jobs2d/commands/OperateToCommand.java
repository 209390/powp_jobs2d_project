package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    final private int x;
    final private int y;
    final private Job2dDriver driver;

    public OperateToCommand(int x, int y, Job2dDriver driver)
    {
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    @Override
    public void execute()
    {
        driver.operateTo(x, y);
    }
}
