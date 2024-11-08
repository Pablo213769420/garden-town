package org.commontech.gardentown.finance;

import java.time.LocalDate;

record Event(Type type, LocalDate date, Operation operation, Balance balance, Event previous) {
    public enum Type {START, FEES, PAYMENT, REBALANCE}
}
