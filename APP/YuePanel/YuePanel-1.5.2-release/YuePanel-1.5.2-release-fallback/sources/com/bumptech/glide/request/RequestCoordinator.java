package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public interface RequestCoordinator {

    public enum RequestState extends java.lang.Enum<com.bumptech.glide.request.RequestCoordinator.RequestState> {
        private static final /* synthetic */ com.bumptech.glide.request.RequestCoordinator.RequestState[] $VALUES = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState CLEARED = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState FAILED = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState PAUSED = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState RUNNING = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState SUCCESS = null;
        private final boolean isComplete;

        private static /* synthetic */ com.bumptech.glide.request.RequestCoordinator.RequestState[] $values() {
                com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING
                com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED
                com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED
                com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS
                com.bumptech.glide.request.RequestCoordinator$RequestState r4 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED
                com.bumptech.glide.request.RequestCoordinator$RequestState[] r0 = new com.bumptech.glide.request.RequestCoordinator.RequestState[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                com.bumptech.glide.request.RequestCoordinator$RequestState r0 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r1 = "RUNNING"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING = r0
                com.bumptech.glide.request.RequestCoordinator$RequestState r0 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r1 = "PAUSED"
                r3 = 1
                r0.<init>(r1, r3, r2)
                com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED = r0
                com.bumptech.glide.request.RequestCoordinator$RequestState r0 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r1 = "CLEARED"
                r4 = 2
                r0.<init>(r1, r4, r2)
                com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED = r0
                com.bumptech.glide.request.RequestCoordinator$RequestState r0 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r1 = "SUCCESS"
                r2 = 3
                r0.<init>(r1, r2, r3)
                com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS = r0
                com.bumptech.glide.request.RequestCoordinator$RequestState r0 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r1 = "FAILED"
                r2 = 4
                r0.<init>(r1, r2, r3)
                com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED = r0
                com.bumptech.glide.request.RequestCoordinator$RequestState[] r0 = $values()
                com.bumptech.glide.request.RequestCoordinator.RequestState.$VALUES = r0
                return
        }

        RequestState(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.isComplete = r3
                return
        }

        public static com.bumptech.glide.request.RequestCoordinator.RequestState valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.request.RequestCoordinator$RequestState> r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.request.RequestCoordinator$RequestState r1 = (com.bumptech.glide.request.RequestCoordinator.RequestState) r1
                return r1
        }

        public static com.bumptech.glide.request.RequestCoordinator.RequestState[] values() {
                com.bumptech.glide.request.RequestCoordinator$RequestState[] r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.request.RequestCoordinator$RequestState[] r0 = (com.bumptech.glide.request.RequestCoordinator.RequestState[]) r0
                return r0
        }

        public boolean isComplete() {
                r1 = this;
                boolean r0 = r1.isComplete
                return r0
        }
    }

    boolean canNotifyCleared(com.bumptech.glide.request.Request r1);

    boolean canNotifyStatusChanged(com.bumptech.glide.request.Request r1);

    boolean canSetImage(com.bumptech.glide.request.Request r1);

    com.bumptech.glide.request.RequestCoordinator getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(com.bumptech.glide.request.Request r1);

    void onRequestSuccess(com.bumptech.glide.request.Request r1);
}
