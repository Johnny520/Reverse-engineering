package org.apache.commons.lang3.concurrent;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum AbstractCircuitBreaker$State {
    CLOSED { // from class: org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State.1
        @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State
        public AbstractCircuitBreaker$State oppositeState() {
            return AbstractCircuitBreaker$State.OPEN;
        }
    },
    OPEN { // from class: org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State.2
        @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State
        public AbstractCircuitBreaker$State oppositeState() {
            return AbstractCircuitBreaker$State.CLOSED;
        }
    };

    public abstract AbstractCircuitBreaker$State oppositeState();
}
