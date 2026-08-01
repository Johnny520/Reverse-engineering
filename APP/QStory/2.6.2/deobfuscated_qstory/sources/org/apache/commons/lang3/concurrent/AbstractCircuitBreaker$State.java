package org.apache.commons.lang3.concurrent;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
