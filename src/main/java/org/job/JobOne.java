package org.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;


/**
 * Created by Wanglei on 15/11/2.
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class JobOne extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Job Running....");
    }
}
