package com.infochimps.storm.testrig;

import java.util.Collection;
import java.util.Map;

import backtype.storm.metric.api.IMetricsConsumer;
import backtype.storm.task.IErrorReporter;
import backtype.storm.task.TopologyContext;

public class MetricsPrinter implements IMetricsConsumer {

    @Override
    public void prepare(Map stormConf, Object registrationArgument,
            TopologyContext context, IErrorReporter errorReporter) {
        // TODO Auto-generated method stub
        System.out.println("Prepare metrics consumer.");
    }

    @Override
    public void handleDataPoints(TaskInfo taskInfo,
            Collection<DataPoint> dataPoints) {

        System.out.println("------------------------------------------------");
        System.out.println(taskInfo.srcComponentId);
        System.out.println(taskInfo.srcTaskId);
        System.out.println(taskInfo.srcWorkerHost);
        System.out.println(taskInfo.timestamp);
        System.out.println(taskInfo.updateIntervalSecs);
        // System.out.println(dataPoints);

        for (DataPoint p : dataPoints) {
            System.out.println(p.name + "=" + p.value);
        }

    }

    @Override
    public void cleanup() {
        // TODO Auto-generated method stub

    }

}
