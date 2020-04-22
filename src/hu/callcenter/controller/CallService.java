package hu.callcenter.controller;

import hu.callcenter.domain.model.CallLog;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CallService {

    private final List<CallLog> callLogs;

    public CallService(List<CallLog> callLogs) {
        this.callLogs = callLogs;
    }

    public String getCallStatisticByHour() {
        return null;
    }

//    private Map<Integer, Long> callBeginCountMap() {
//        return callLogs.stream()
//                .collect(Collectors.groupingBy(i -> i.))
    }

    public List<String> getSpeakersList() {
        return callLogs.stream()
                .filter(i -> i.couldSpeak())
                .map(i -> i.toString())
                .collect(Collectors.toList());
    }
}
