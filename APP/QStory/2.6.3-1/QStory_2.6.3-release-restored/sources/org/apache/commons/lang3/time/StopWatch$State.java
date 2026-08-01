package org.apache.commons.lang3.time;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
enum StopWatch$State {
    RUNNING { // from class: org.apache.commons.lang3.time.StopWatch$State.1
        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStarted() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStopped() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isSuspended() {
            return false;
        }
    },
    STOPPED { // from class: org.apache.commons.lang3.time.StopWatch$State.2
        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStarted() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStopped() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isSuspended() {
            return false;
        }
    },
    SUSPENDED { // from class: org.apache.commons.lang3.time.StopWatch$State.3
        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStarted() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStopped() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isSuspended() {
            return true;
        }
    },
    UNSTARTED { // from class: org.apache.commons.lang3.time.StopWatch$State.4
        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStarted() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isStopped() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.StopWatch$State
        public boolean isSuspended() {
            return false;
        }
    };

    public abstract boolean isStarted();

    public abstract boolean isStopped();

    public abstract boolean isSuspended();
}
