package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge {
    public static final org.luckypray.dexkit.DexKitCacheBridge INSTANCE = null;
    private static final java.util.concurrent.locks.ReentrantReadWriteLock cacheLock = null;
    private static org.luckypray.dexkit.DexKitCacheBridge.CachePolicy cachePolicy;
    private static final java.util.concurrent.atomic.AtomicReference<org.luckypray.dexkit.DexKitCacheBridge.Cache> cacheRef = null;
    private static long idleTimeoutMillis;
    private static final java.util.concurrent.CopyOnWriteArraySet<org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener> listeners = null;
    private static final java.util.concurrent.ScheduledThreadPoolExecutor reaperScheduler = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public interface Cache {
        void clearAll();

        java.util.Collection<java.lang.String> getAllKeys();

        java.lang.String getString(java.lang.String r1, java.lang.String r2);

        java.util.List<java.lang.String> getStringList(java.lang.String r1, java.util.List<java.lang.String> r2);

        void putString(java.lang.String r1, java.lang.String r2);

        void putStringList(java.lang.String r1, java.util.List<java.lang.String> r2);

        void remove(java.lang.String r1);
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static class CacheBridgeListener {
        public CacheBridgeListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onBridgeCreated(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                return
        }

        public void onBridgeDestroyed(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                return
        }

        public void onBridgeReleased(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                return
        }

        public void onQueryFailure(org.luckypray.dexkit.DexKitCacheBridge.QueryFailureEvent r1) {
                r0 = this;
                r1.getClass()
                return
        }

        public void onQuerySuccess(org.luckypray.dexkit.DexKitCacheBridge.QuerySuccessEvent r1) {
                r0 = this;
                r1.getClass()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public enum CacheFailurePolicy extends java.lang.Enum<org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy> {
        private static final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy[] $VALUES = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy ALL = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy NONE = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy QUERY_ONLY = null;

        private static final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy[] $values() {
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r0 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.NONE
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r1 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.QUERY_ONLY
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r2 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.ALL
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy[] r0 = new org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy[]{r0, r1, r2}
                return r0
        }

        static {
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r0 = new org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.NONE = r0
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r0 = new org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy
                java.lang.String r1 = "QUERY_ONLY"
                r2 = 1
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.QUERY_ONLY = r0
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r0 = new org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy
                java.lang.String r1 = "ALL"
                r2 = 2
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.ALL = r0
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy[] r0 = $values()
                org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.$VALUES = r0
                return
        }

        CacheFailurePolicy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy valueOf(java.lang.String r1) {
                java.lang.Class<org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy> r0 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r1 = (org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy) r1
                return r1
        }

        public static org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy[] values() {
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy[] r0 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy[] r0 = (org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy[]) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class CachePolicy {
        private final boolean cacheSuccess;
        private final org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy failurePolicy;

        public CachePolicy() {
                r3 = this;
                r0 = 0
                r1 = 3
                r2 = 0
                r3.<init>(r2, r0, r1, r0)
                return
        }

        public CachePolicy(boolean r1, org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy r2) {
                r0 = this;
                r2.getClass()
                r0.<init>()
                r0.cacheSuccess = r1
                r0.failurePolicy = r2
                return
        }

        public /* synthetic */ CachePolicy(boolean r1, org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy r2, int r3, p000.AbstractC1067zq r4) {
                r0 = this;
                r4 = r3 & 1
                if (r4 == 0) goto L5
                r1 = 1
            L5:
                r3 = r3 & 2
                if (r3 == 0) goto Lb
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r2 = org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy.NONE
            Lb:
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.CachePolicy copy$default(org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r0, boolean r1, org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                boolean r1 = r0.cacheSuccess
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r2 = r0.failurePolicy
            Lc:
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r0 = r0.copy(r1, r2)
                return r0
        }

        public final boolean component1() {
                r0 = this;
                boolean r0 = r0.cacheSuccess
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy component2() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r0 = r0.failurePolicy
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.CachePolicy copy(boolean r1, org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy r2) {
                r0 = this;
                r2.getClass()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r0 = new org.luckypray.dexkit.DexKitCacheBridge$CachePolicy
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof org.luckypray.dexkit.DexKitCacheBridge.CachePolicy
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r5 = (org.luckypray.dexkit.DexKitCacheBridge.CachePolicy) r5
                boolean r1 = r4.cacheSuccess
                boolean r3 = r5.cacheSuccess
                if (r1 == r3) goto L13
                return r2
            L13:
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r4 = r4.failurePolicy
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r5 = r5.failurePolicy
                if (r4 == r5) goto L1a
                return r2
            L1a:
                return r0
        }

        public final boolean getCacheSuccess() {
                r0 = this;
                boolean r0 = r0.cacheSuccess
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.CacheFailurePolicy getFailurePolicy() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r0 = r0.failurePolicy
                return r0
        }

        public int hashCode() {
                r1 = this;
                boolean r0 = r1.cacheSuccess
                int r0 = java.lang.Boolean.hashCode(r0)
                int r0 = r0 * 31
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r1 = r1.failurePolicy
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                boolean r0 = r3.cacheSuccess
                org.luckypray.dexkit.DexKitCacheBridge$CacheFailurePolicy r3 = r3.failurePolicy
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "CachePolicy(cacheSuccess="
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = ", failurePolicy="
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = ")"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                return r3
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class QueryFailureEvent {
        private final java.lang.String appTag;
        private final java.lang.Throwable error;
        private final org.luckypray.dexkit.DexKitCacheBridge.QueryKind queryKind;
        private final java.lang.String requestKey;
        private final org.luckypray.dexkit.DexKitCacheBridge.ResultSource source;

        public QueryFailureEvent(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.QueryKind r2, java.lang.String r3, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r4, java.lang.Throwable r5) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r4.getClass()
                r5.getClass()
                r0.<init>()
                r0.appTag = r1
                r0.queryKind = r2
                r0.requestKey = r3
                r0.source = r4
                r0.error = r5
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.QueryFailureEvent copy$default(org.luckypray.dexkit.DexKitCacheBridge.QueryFailureEvent r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.QueryKind r2, java.lang.String r3, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r4, java.lang.Throwable r5, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                if (r7 == 0) goto L6
                java.lang.String r1 = r0.appTag
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Lc
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r2 = r0.queryKind
            Lc:
                r7 = r6 & 4
                if (r7 == 0) goto L12
                java.lang.String r3 = r0.requestKey
            L12:
                r7 = r6 & 8
                if (r7 == 0) goto L18
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = r0.source
            L18:
                r6 = r6 & 16
                if (r6 == 0) goto L1e
                java.lang.Throwable r5 = r0.error
            L1e:
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r2 = r0
                r3 = r1
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r0 = r2.copy(r3, r4, r5, r6, r7)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.appTag
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.QueryKind component2() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = r0.queryKind
                return r0
        }

        public final java.lang.String component3() {
                r0 = this;
                java.lang.String r0 = r0.requestKey
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource component4() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r0.source
                return r0
        }

        public final java.lang.Throwable component5() {
                r0 = this;
                java.lang.Throwable r0 = r0.error
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.QueryFailureEvent copy(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.QueryKind r2, java.lang.String r3, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r4, java.lang.Throwable r5) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r4.getClass()
                r5.getClass()
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof org.luckypray.dexkit.DexKitCacheBridge.QueryFailureEvent
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r5 = (org.luckypray.dexkit.DexKitCacheBridge.QueryFailureEvent) r5
                java.lang.String r1 = r4.appTag
                java.lang.String r3 = r5.appTag
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = r4.queryKind
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = r5.queryKind
                if (r1 == r3) goto L1e
                return r2
            L1e:
                java.lang.String r1 = r4.requestKey
                java.lang.String r3 = r5.requestKey
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L29
                return r2
            L29:
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = r4.source
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r3 = r5.source
                if (r1 == r3) goto L30
                return r2
            L30:
                java.lang.Throwable r4 = r4.error
                java.lang.Throwable r5 = r5.error
                boolean r4 = p000.ln0.m3626(r4, r5)
                if (r4 != 0) goto L3b
                return r2
            L3b:
                return r0
        }

        public final java.lang.String getAppTag() {
                r0 = this;
                java.lang.String r0 = r0.appTag
                return r0
        }

        public final java.lang.Throwable getError() {
                r0 = this;
                java.lang.Throwable r0 = r0.error
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.QueryKind getQueryKind() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = r0.queryKind
                return r0
        }

        public final java.lang.String getRequestKey() {
                r0 = this;
                java.lang.String r0 = r0.requestKey
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource getSource() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r0.source
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.appTag
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = r2.queryKind
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r2.requestKey
                if (r0 != 0) goto L17
                r0 = 0
                goto L1b
            L17:
                int r0 = r0.hashCode()
            L1b:
                int r1 = r1 + r0
                int r1 = r1 * 31
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r2.source
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Throwable r2 = r2.error
                int r2 = r2.hashCode()
                int r2 = r2 + r0
                return r2
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.String r0 = r6.appTag
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = r6.queryKind
                java.lang.String r2 = r6.requestKey
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r3 = r6.source
                java.lang.Throwable r6 = r6.error
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "QueryFailureEvent(appTag="
                r4.<init>(r5)
                r4.append(r0)
                java.lang.String r0 = ", queryKind="
                r4.append(r0)
                r4.append(r1)
                java.lang.String r0 = ", requestKey="
                r4.append(r0)
                r4.append(r2)
                java.lang.String r0 = ", source="
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = ", error="
                r4.append(r0)
                r4.append(r6)
                java.lang.String r6 = ")"
                r4.append(r6)
                java.lang.String r6 = r4.toString()
                return r6
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public enum QueryKind extends java.lang.Enum<org.luckypray.dexkit.DexKitCacheBridge.QueryKind> {
        private static final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.QueryKind[] $VALUES = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind CLASS_BATCH = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind CLASS_LIST = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind CLASS_SINGLE = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind FIELD_LIST = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind FIELD_SINGLE = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind METHOD_BATCH = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind METHOD_LIST = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.QueryKind METHOD_SINGLE = null;

        private static final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.QueryKind[] $values() {
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_SINGLE
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_SINGLE
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r2 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_SINGLE
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_LIST
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r4 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_LIST
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r5 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_LIST
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r6 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_BATCH
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r7 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_BATCH
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind[] r0 = new org.luckypray.dexkit.DexKitCacheBridge.QueryKind[]{r0, r1, r2, r3, r4, r5, r6, r7}
                return r0
        }

        static {
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "METHOD_SINGLE"
                r2 = 0
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_SINGLE = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "CLASS_SINGLE"
                r2 = 1
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_SINGLE = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "FIELD_SINGLE"
                r2 = 2
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_SINGLE = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "METHOD_LIST"
                r2 = 3
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_LIST = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "CLASS_LIST"
                r2 = 4
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_LIST = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "FIELD_LIST"
                r2 = 5
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_LIST = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "METHOD_BATCH"
                r2 = 6
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_BATCH = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryKind
                java.lang.String r1 = "CLASS_BATCH"
                r2 = 7
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_BATCH = r0
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind[] r0 = $values()
                org.luckypray.dexkit.DexKitCacheBridge.QueryKind.$VALUES = r0
                return
        }

        QueryKind(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.luckypray.dexkit.DexKitCacheBridge.QueryKind valueOf(java.lang.String r1) {
                java.lang.Class<org.luckypray.dexkit.DexKitCacheBridge$QueryKind> r0 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = (org.luckypray.dexkit.DexKitCacheBridge.QueryKind) r1
                return r1
        }

        public static org.luckypray.dexkit.DexKitCacheBridge.QueryKind[] values() {
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind[] r0 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.$VALUES
                java.lang.Object r0 = r0.clone()
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind[] r0 = (org.luckypray.dexkit.DexKitCacheBridge.QueryKind[]) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class QuerySuccessEvent {
        private final java.lang.String appTag;
        private final int matchCount;
        private final org.luckypray.dexkit.DexKitCacheBridge.QueryKind queryKind;
        private final java.lang.String requestKey;
        private final org.luckypray.dexkit.DexKitCacheBridge.ResultSource source;

        public QuerySuccessEvent(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.QueryKind r2, java.lang.String r3, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r4, int r5) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r4.getClass()
                r0.<init>()
                r0.appTag = r1
                r0.queryKind = r2
                r0.requestKey = r3
                r0.source = r4
                r0.matchCount = r5
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.QuerySuccessEvent copy$default(org.luckypray.dexkit.DexKitCacheBridge.QuerySuccessEvent r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.QueryKind r2, java.lang.String r3, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r4, int r5, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                if (r7 == 0) goto L6
                java.lang.String r1 = r0.appTag
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Lc
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r2 = r0.queryKind
            Lc:
                r7 = r6 & 4
                if (r7 == 0) goto L12
                java.lang.String r3 = r0.requestKey
            L12:
                r7 = r6 & 8
                if (r7 == 0) goto L18
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = r0.source
            L18:
                r6 = r6 & 16
                if (r6 == 0) goto L1e
                int r5 = r0.matchCount
            L1e:
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r2 = r0
                r3 = r1
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r0 = r2.copy(r3, r4, r5, r6, r7)
                return r0
        }

        public final java.lang.String component1() {
                r0 = this;
                java.lang.String r0 = r0.appTag
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.QueryKind component2() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = r0.queryKind
                return r0
        }

        public final java.lang.String component3() {
                r0 = this;
                java.lang.String r0 = r0.requestKey
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource component4() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r0.source
                return r0
        }

        public final int component5() {
                r0 = this;
                int r0 = r0.matchCount
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.QuerySuccessEvent copy(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.QueryKind r2, java.lang.String r3, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r4, int r5) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r4.getClass()
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof org.luckypray.dexkit.DexKitCacheBridge.QuerySuccessEvent
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r5 = (org.luckypray.dexkit.DexKitCacheBridge.QuerySuccessEvent) r5
                java.lang.String r1 = r4.appTag
                java.lang.String r3 = r5.appTag
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = r4.queryKind
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = r5.queryKind
                if (r1 == r3) goto L1e
                return r2
            L1e:
                java.lang.String r1 = r4.requestKey
                java.lang.String r3 = r5.requestKey
                boolean r1 = p000.ln0.m3626(r1, r3)
                if (r1 != 0) goto L29
                return r2
            L29:
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = r4.source
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r3 = r5.source
                if (r1 == r3) goto L30
                return r2
            L30:
                int r4 = r4.matchCount
                int r5 = r5.matchCount
                if (r4 == r5) goto L37
                return r2
            L37:
                return r0
        }

        public final java.lang.String getAppTag() {
                r0 = this;
                java.lang.String r0 = r0.appTag
                return r0
        }

        public final int getMatchCount() {
                r0 = this;
                int r0 = r0.matchCount
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.QueryKind getQueryKind() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r0 = r0.queryKind
                return r0
        }

        public final java.lang.String getRequestKey() {
                r0 = this;
                java.lang.String r0 = r0.requestKey
                return r0
        }

        public final org.luckypray.dexkit.DexKitCacheBridge.ResultSource getSource() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r0.source
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.appTag
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = r2.queryKind
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r2.requestKey
                if (r0 != 0) goto L17
                r0 = 0
                goto L1b
            L17:
                int r0 = r0.hashCode()
            L1b:
                int r1 = r1 + r0
                int r1 = r1 * 31
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = r2.source
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r2 = r2.matchCount
                int r2 = java.lang.Integer.hashCode(r2)
                int r2 = r2 + r0
                return r2
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.String r0 = r6.appTag
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = r6.queryKind
                java.lang.String r2 = r6.requestKey
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r3 = r6.source
                int r6 = r6.matchCount
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "QuerySuccessEvent(appTag="
                r4.<init>(r5)
                r4.append(r0)
                java.lang.String r0 = ", queryKind="
                r4.append(r0)
                r4.append(r1)
                java.lang.String r0 = ", requestKey="
                r4.append(r0)
                r4.append(r2)
                java.lang.String r0 = ", source="
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = ", matchCount="
                r4.append(r0)
                java.lang.String r0 = ")"
                java.lang.String r6 = p000.AbstractC0602nx.m4131(r4, r6, r0)
                return r6
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class RecyclableBridge implements java.io.Closeable {
        public static final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.Companion Companion = null;
        private final java.lang.String appTag;
        private final java.lang.ClassLoader classLoader;
        private final byte[][] dexArray;
        private final java.lang.String path;
        private final p000.oq0 runtime$delegate;

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BatchFindClassUsingStringsBuilder {
            void build(org.luckypray.dexkit.query.BatchFindClassUsingStrings r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BatchFindMethodUsingStringsBuilder {
            void build(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BridgeClassBuilder {
            org.luckypray.dexkit.result.ClassData build(org.luckypray.dexkit.DexKitBridge r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BridgeClassesBuilder {
            java.util.List<org.luckypray.dexkit.result.ClassData> build(org.luckypray.dexkit.DexKitBridge r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BridgeFieldBuilder {
            org.luckypray.dexkit.result.FieldData build(org.luckypray.dexkit.DexKitBridge r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BridgeFieldsBuilder {
            java.util.List<org.luckypray.dexkit.result.FieldData> build(org.luckypray.dexkit.DexKitBridge r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BridgeFunction {
            void apply(org.luckypray.dexkit.DexKitBridge r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BridgeMethodBuilder {
            org.luckypray.dexkit.result.MethodData build(org.luckypray.dexkit.DexKitBridge r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface BridgeMethodsBuilder {
            java.util.List<org.luckypray.dexkit.result.MethodData> build(org.luckypray.dexkit.DexKitBridge r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge create$dexkit_android_release(java.lang.String r7, java.lang.ClassLoader r8) {
                    r6 = this;
                    r7.getClass()
                    r8.getClass()
                    org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge
                    r3 = 0
                    r5 = 0
                    r2 = 0
                    r1 = r7
                    r4 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r0
            }

            public final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge create$dexkit_android_release(java.lang.String r7, java.lang.String r8) {
                    r6 = this;
                    r7.getClass()
                    r8.getClass()
                    org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge
                    r4 = 0
                    r5 = 0
                    r3 = 0
                    r1 = r7
                    r2 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r0
            }

            public final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge create$dexkit_android_release(java.lang.String r7, byte[][] r8) {
                    r6 = this;
                    r7.getClass()
                    r8.getClass()
                    org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge
                    r4 = 0
                    r5 = 0
                    r2 = 0
                    r1 = r7
                    r3 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r0
            }
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface FindClassBuilder {
            void build(org.luckypray.dexkit.query.FindClass r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface FindFieldBuilder {
            void build(org.luckypray.dexkit.query.FindField r1);
        }

        /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
        public interface FindMethodBuilder {
            void build(org.luckypray.dexkit.query.FindMethod r1);
        }

        static {
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$Companion r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$Companion
                r1 = 0
                r0.<init>(r1)
                org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.Companion = r0
                return
        }

        private RecyclableBridge(java.lang.String r1, java.lang.String r2, byte[][] r3, java.lang.ClassLoader r4) {
                r0 = this;
                r0.<init>()
                r0.appTag = r1
                r0.path = r2
                r0.dexArray = r3
                r0.classLoader = r4
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2
                r1.<init>(r0)
                qq0 r2 = p000.qq0.f9080
                oq0 r1 = p000.ln0.m3611(r2, r1)
                r0.runtime$delegate = r1
                return
        }

        public /* synthetic */ RecyclableBridge(java.lang.String r2, java.lang.String r3, byte[][] r4, java.lang.ClassLoader r5, int r6, p000.AbstractC1067zq r7) {
                r1 = this;
                r7 = r6 & 2
                r0 = 0
                if (r7 == 0) goto L6
                r3 = r0
            L6:
                r7 = r6 & 4
                if (r7 == 0) goto Lb
                r4 = r0
            Lb:
                r6 = r6 & 8
                if (r6 == 0) goto L10
                r5 = r0
            L10:
                r1.<init>(r2, r3, r4, r5)
                return
        }

        public /* synthetic */ RecyclableBridge(java.lang.String r1, java.lang.String r2, byte[][] r3, java.lang.ClassLoader r4, p000.AbstractC1067zq r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static final /* synthetic */ org.luckypray.dexkit.DexKitBridge access$createBridge(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0) {
                org.luckypray.dexkit.DexKitBridge r0 = r0.createBridge()
                return r0
        }

        public static final /* synthetic */ void access$ensureUsable(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0) {
                r0.ensureUsable()
                return
        }

        public static final /* synthetic */ java.lang.String access$getAppTag$p(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0) {
                java.lang.String r0 = r0.appTag
                return r0
        }

        public static final /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeRuntime access$getRuntime(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0) {
                org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = r0.getRuntime()
                return r0
        }

        private final <R> R acquireBridge(p000.a80 r4) {
                r3 = this;
                org.luckypray.dexkit.cache.CacheBridgeRuntime r3 = access$getRuntime(r3)
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r3)
                java.lang.Object r0 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r3)     // Catch: java.lang.Throwable -> L32
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L32
                org.luckypray.dexkit.DexKitBridge r1 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r3)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                p70 r1 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r3)     // Catch: java.lang.Throwable -> L24
                java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L24
                r2 = r1
                org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2     // Catch: java.lang.Throwable -> L24
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r3, r2)     // Catch: java.lang.Throwable -> L24
                org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1     // Catch: java.lang.Throwable -> L24
                r2 = 1
                goto L27
            L24:
                r4 = move-exception
                goto L3c
            L26:
                r2 = 0
            L27:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                if (r2 == 0) goto L34
                p70 r0 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r3)     // Catch: java.lang.Throwable -> L32
                r0.invoke()     // Catch: java.lang.Throwable -> L32
                goto L34
            L32:
                r4 = move-exception
                goto L3e
            L34:
                java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L32
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r3)
                return r4
            L3c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                throw r4     // Catch: java.lang.Throwable -> L32
            L3e:
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r3)
                throw r4
        }

        private final org.luckypray.dexkit.DexKitBridge createBridge() {
                r2 = this;
                java.lang.String r0 = r2.path
                if (r0 == 0) goto Lb
                org.luckypray.dexkit.DexKitBridge$Companion r2 = org.luckypray.dexkit.DexKitBridge.Companion
                org.luckypray.dexkit.DexKitBridge r2 = r2.create(r0)
                return r2
            Lb:
                byte[][] r0 = r2.dexArray
                if (r0 == 0) goto L16
                org.luckypray.dexkit.DexKitBridge$Companion r2 = org.luckypray.dexkit.DexKitBridge.Companion
                org.luckypray.dexkit.DexKitBridge r2 = r2.create(r0)
                return r2
            L16:
                java.lang.ClassLoader r2 = r2.classLoader
                if (r2 == 0) goto L22
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                r1 = 1
                org.luckypray.dexkit.DexKitBridge r2 = r0.create(r2, r1)
                return r2
            L22:
                java.lang.String r2 = "init fail"
                p000.C1080.m7279(r2)
                r2 = 0
                return r2
        }

        private final void ensureUsable() {
                r0 = this;
                org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = r0.getRuntime()
                r0.ensureUsable()
                return
        }

        public static /* synthetic */ java.util.Map getBatchUsingStringsClasses$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindClassUsingStringsBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.Map r0 = r0.getBatchUsingStringsClasses(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.Map getBatchUsingStringsMethods$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindMethodUsingStringsBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.Map r0 = r0.getBatchUsingStringsMethods(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClass$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexClass r0 = r0.getClass(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClassDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexClass r0 = r0.getClassDirect(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClassDirectOrNull$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexClass r0 = r0.getClassDirectOrNull(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClassOrNull$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexClass r0 = r0.getClassOrNull(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getClasses$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getClasses(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getClassesDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassesBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getClassesDirect(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getClassesDirectOrEmpty$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassesBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getClassesDirectOrEmpty(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getClassesOrEmpty$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getClassesOrEmpty(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: getDirectInternalList-yxL6bBk, reason: not valid java name */
        private final <D, R extends org.luckypray.dexkit.wrap.ISerializable> java.lang.Object m7378getDirectInternalListyxL6bBk(org.luckypray.dexkit.DexKitCacheBridge.QueryKind r18, java.lang.String r19, boolean r20, p000.a80 r21, p000.a80 r22) {
                r17 = this;
                r0 = r17
                r1 = r21
                org.luckypray.dexkit.cache.CacheBridgeKeys r2 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r3 = r0.appTag
                r7 = 8
                r8 = 0
                java.lang.String r4 = "l"
                r6 = 0
                r5 = r19
                java.lang.String r13 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r2, r3, r4, r5, r6, r7, r8)
                if (r1 == 0) goto L20
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1
                r3 = r22
                r2.<init>(r0, r1, r3)
            L1d:
                r16 = r2
                goto L22
            L20:
                r2 = 0
                goto L1d
            L22:
                org.luckypray.dexkit.cache.CacheBridgeStore r9 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r10 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r12 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1 r15 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1
                r15.<init>(r0)
                r14 = r20
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r9.getCachedList(r10, r11, r12, r13, r14, r15, r16)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L7b
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L53:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L53
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L53
                r1 = r7
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L53
                int r6 = r1.size()     // Catch: java.lang.Throwable -> L53
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L53
                r3 = r18
                r4 = r19
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L53
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L53
                goto L53
            L7b:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L83:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L83
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L83
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L83
                r3 = r18
                r4 = r19
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L83
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L83
                goto L83
            La4:
                return r7
        }

        /* JADX INFO: renamed from: getDirectInternalSingle-yxL6bBk, reason: not valid java name */
        private final <D, R extends org.luckypray.dexkit.wrap.ISerializable> java.lang.Object m7379getDirectInternalSingleyxL6bBk(org.luckypray.dexkit.DexKitCacheBridge.QueryKind r19, java.lang.String r20, org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r21, p000.a80 r22, p000.a80 r23) {
                r18 = this;
                r0 = r18
                r1 = r22
                org.luckypray.dexkit.cache.CacheBridgeKeys r2 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r3 = r0.appTag
                r7 = 8
                r8 = 0
                java.lang.String r4 = "s"
                r6 = 0
                r5 = r20
                java.lang.String r13 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r2, r3, r4, r5, r6, r7, r8)
                if (r1 == 0) goto L20
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1
                r3 = r23
                r2.<init>(r0, r1, r3)
            L1d:
                r17 = r2
                goto L22
            L20:
                r2 = 0
                goto L1d
            L22:
                org.luckypray.dexkit.cache.CacheBridgeStore r9 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r10 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r12 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r1 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                r7 = 0
                boolean r15 = r9.shouldCacheFailure(r1, r7)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1
                r1.<init>(r0)
                r14 = r21
                r16 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r9.getCachedSingle(r10, r11, r12, r13, r14, r15, r16, r17)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r8 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r8)
                if (r6 != 0) goto L88
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r9 = r1.iterator()
            L5e:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto Lb1
                java.lang.Object r1 = r9.next()
                r10 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r10 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r10
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r10.getClass()     // Catch: java.lang.Throwable -> L5e
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L5e
                r1 = r8
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1     // Catch: java.lang.Throwable -> L5e
                if (r1 != 0) goto L79
                r6 = r7
                goto L7b
            L79:
                r1 = 1
                r6 = r1
            L7b:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L5e
                r3 = r19
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5e
                r10.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L5e
                goto L5e
            L88:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r7 = r1.iterator()
            L90:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto Lb1
                java.lang.Object r1 = r7.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L90
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L90
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L90
                r3 = r19
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L90
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L90
                goto L90
            Lb1:
                return r8
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexField getField$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexField r0 = r0.getField(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexField getFieldDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexField r0 = r0.getFieldDirect(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexField getFieldDirectOrNull$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexField r0 = r0.getFieldDirectOrNull(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexField getFieldOrNull$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexField r0 = r0.getFieldOrNull(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getFields$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getFields(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getFieldsDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldsBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getFieldsDirect(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getFieldsDirectOrEmpty$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldsBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getFieldsDirectOrEmpty(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getFieldsOrEmpty$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getFieldsOrEmpty(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: getInternalList-hUnOzRk, reason: not valid java name */
        private final <Q extends org.luckypray.dexkit.query.base.BaseFinder, D, R extends org.luckypray.dexkit.wrap.ISerializable> java.lang.Object m7380getInternalListhUnOzRk(org.luckypray.dexkit.DexKitCacheBridge.QueryKind r19, java.lang.String r20, boolean r21, p000.p70 r22, p000.e80 r23, p000.a80 r24) {
                r18 = this;
                r0 = r18
                r1 = 0
                if (r22 == 0) goto Lc
                java.lang.Object r2 = r22.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r2 = (org.luckypray.dexkit.query.base.BaseFinder) r2
                goto Ld
            Lc:
                r2 = r1
            Ld:
                org.luckypray.dexkit.cache.CacheBridgeKeys r3 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r4 = r0.appTag
                java.lang.String r5 = "l"
                r9 = r20
                java.lang.String r14 = r3.cacheKeyOf(r4, r5, r9, r2)
                if (r2 == 0) goto L24
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1
                r3 = r23
                r4 = r24
                r1.<init>(r0, r3, r2, r4)
            L24:
                r17 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore r10 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r13 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1
                r1.<init>(r0)
                r15 = r21
                r16 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r10.getCachedList(r11, r12, r13, r14, r15, r16, r17)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r10 = r1.getSource()
                java.lang.Object r1 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r11 = p000.fo1.m2190(r1)
                if (r11 != 0) goto L80
                java.util.concurrent.CopyOnWriteArraySet r2 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r2 = r2.iterator()
            L59:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto La8
                java.lang.Object r3 = r2.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r3 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r3
                org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r3.getClass()     // Catch: java.lang.Throwable -> L7d
                java.lang.String r7 = r0.appTag     // Catch: java.lang.Throwable -> L7d
                r4 = r1
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L7d
                int r11 = r4.size()     // Catch: java.lang.Throwable -> L7d
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r6 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L7d
                r8 = r19
                r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7d
                r3.onQuerySuccess(r6)     // Catch: java.lang.Throwable -> L7d
            L7d:
                r9 = r20
                goto L59
            L80:
                java.util.concurrent.CopyOnWriteArraySet r2 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r2 = r2.iterator()
            L88:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto La8
                java.lang.Object r3 = r2.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r3 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r3
                org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r3.getClass()     // Catch: java.lang.Throwable -> L88
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r6 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L88
                java.lang.String r7 = r0.appTag     // Catch: java.lang.Throwable -> L88
                r8 = r19
                r9 = r20
                r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L88
                r3.onQueryFailure(r6)     // Catch: java.lang.Throwable -> L88
                goto L88
            La8:
                return r1
        }

        /* JADX INFO: renamed from: getInternalMap-yxL6bBk, reason: not valid java name */
        private final <Q extends org.luckypray.dexkit.query.base.BaseFinder, D, R extends org.luckypray.dexkit.wrap.ISerializable> java.lang.Object m7381getInternalMapyxL6bBk(org.luckypray.dexkit.DexKitCacheBridge.QueryKind r18, java.lang.String r19, p000.p70 r20, p000.e80 r21, p000.a80 r22) {
                r17 = this;
                r0 = r17
                r1 = 0
                if (r20 == 0) goto Lc
                java.lang.Object r2 = r20.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r2 = (org.luckypray.dexkit.query.base.BaseFinder) r2
                goto Ld
            Lc:
                r2 = r1
            Ld:
                org.luckypray.dexkit.cache.CacheBridgeKeys r3 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r4 = r0.appTag
                java.lang.String r5 = "b"
                r9 = r19
                java.lang.String r14 = r3.cacheKeyOf(r4, r5, r9, r2)
                if (r2 == 0) goto L24
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1
                r3 = r21
                r4 = r22
                r1.<init>(r0, r3, r2, r4)
            L24:
                r16 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore r10 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r13 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$1 r15 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$1
                r15.<init>(r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r10.getCachedMap(r11, r12, r13, r14, r15, r16)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r10 = r1.getSource()
                java.lang.Object r1 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r11 = p000.fo1.m2190(r1)
                if (r11 != 0) goto L96
                java.util.concurrent.CopyOnWriteArraySet r2 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r2 = r2.iterator()
            L55:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Lbe
                java.lang.Object r3 = r2.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r3 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r3
                org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r3.getClass()     // Catch: java.lang.Throwable -> L93
                java.lang.String r7 = r0.appTag     // Catch: java.lang.Throwable -> L93
                r4 = r1
                java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L93
                java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L93
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L93
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L93
                r5 = 0
                r11 = r5
            L77:
                boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L93
                if (r5 == 0) goto L89
                java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L93
                java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L93
                int r5 = r5.size()     // Catch: java.lang.Throwable -> L93
                int r11 = r11 + r5
                goto L77
            L89:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r6 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L93
                r8 = r18
                r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L93
                r3.onQuerySuccess(r6)     // Catch: java.lang.Throwable -> L93
            L93:
                r9 = r19
                goto L55
            L96:
                java.util.concurrent.CopyOnWriteArraySet r2 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r2 = r2.iterator()
            L9e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Lbe
                java.lang.Object r3 = r2.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r3 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r3
                org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r3.getClass()     // Catch: java.lang.Throwable -> L9e
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r6 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = r0.appTag     // Catch: java.lang.Throwable -> L9e
                r8 = r18
                r9 = r19
                r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9e
                r3.onQueryFailure(r6)     // Catch: java.lang.Throwable -> L9e
                goto L9e
            Lbe:
                return r1
        }

        /* JADX INFO: renamed from: getInternalSingle-hUnOzRk, reason: not valid java name */
        private final <Q extends org.luckypray.dexkit.query.base.BaseFinder, D, R extends org.luckypray.dexkit.wrap.ISerializable> java.lang.Object m7382getInternalSinglehUnOzRk(org.luckypray.dexkit.DexKitCacheBridge.QueryKind r19, java.lang.String r20, org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode r21, p000.p70 r22, p000.e80 r23, p000.a80 r24) {
                r18 = this;
                r0 = r18
                r4 = r20
                r1 = 0
                if (r22 == 0) goto Le
                java.lang.Object r2 = r22.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r2 = (org.luckypray.dexkit.query.base.BaseFinder) r2
                goto Lf
            Le:
                r2 = r1
            Lf:
                org.luckypray.dexkit.cache.CacheBridgeKeys r3 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r5 = r0.appTag
                java.lang.String r6 = "s"
                java.lang.String r11 = r3.cacheKeyOf(r5, r6, r4, r2)
                if (r2 == 0) goto L24
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1
                r3 = r23
                r5 = r24
                r1.<init>(r0, r3, r2, r5)
            L24:
                r15 = r1
                r16 = 0
                r17 = 1
                if (r4 != 0) goto L30
                if (r2 == 0) goto L30
                r1 = r17
                goto L32
            L30:
                r1 = r16
            L32:
                org.luckypray.dexkit.cache.CacheBridgeStore r7 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r2 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r8 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r2)
                java.util.concurrent.locks.ReentrantReadWriteLock r9 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r10 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r2 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                boolean r13 = r7.shouldCacheFailure(r2, r1)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1 r14 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1
                r14.<init>(r0)
                r12 = r21
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r7.getCachedSingle(r8, r9, r10, r11, r12, r13, r14, r15)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L96
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L6b:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lbf
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L93
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L93
                r1 = r7
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1     // Catch: java.lang.Throwable -> L93
                if (r1 != 0) goto L87
                r6 = r16
                goto L89
            L87:
                r6 = r17
            L89:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L93
                r3 = r19
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L93
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L93
            L93:
                r4 = r20
                goto L6b
            L96:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L9e:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lbf
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L9e
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L9e
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L9e
                r3 = r19
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9e
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L9e
                goto L9e
            Lbf:
                return r7
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethod$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexMethod r0 = r0.getMethod(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethodDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexMethod r0 = r0.getMethodDirect(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethodDirectOrNull$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexMethod r0 = r0.getMethodDirectOrNull(r1, r2)
                return r0
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethodOrNull$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                org.luckypray.dexkit.wrap.DexMethod r0 = r0.getMethodOrNull(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getMethods$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getMethods(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getMethodsDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodsBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getMethodsDirect(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getMethodsDirectOrEmpty$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodsBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getMethodsDirectOrEmpty(r1, r2)
                return r0
        }

        public static /* synthetic */ java.util.List getMethodsOrEmpty$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.List r0 = r0.getMethodsOrEmpty(r1, r2)
                return r0
        }

        private final org.luckypray.dexkit.cache.CacheBridgeRuntime getRuntime() {
                r0 = this;
                oq0 r0 = r0.runtime$delegate
                java.lang.Object r0 = r0.getValue()
                org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = (org.luckypray.dexkit.cache.CacheBridgeRuntime) r0
                return r0
        }

        private final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexClass>> innerGetBatchUsingStringsClasses(java.lang.String r18, org.luckypray.dexkit.query.BatchFindClassUsingStrings r19) {
                r17 = this;
                r0 = r17
                r1 = r19
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_BATCH
                r2 = 0
                if (r1 == 0) goto Lf
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$1$1
                r4.<init>(r1)
                goto L10
            Lf:
                r4 = r2
            L10:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$2 r1 = org.luckypray.dexkit.C0645xd5638d93.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsClasses$3 r5 = org.luckypray.dexkit.C0646xd5638d94.INSTANCE
                if (r4 == 0) goto L1d
                java.lang.Object r4 = r4.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r4 = (org.luckypray.dexkit.query.base.BaseFinder) r4
                goto L1e
            L1d:
                r4 = r2
            L1e:
                org.luckypray.dexkit.cache.CacheBridgeKeys r6 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r7 = r0.appTag
                java.lang.String r8 = "b"
                r9 = r18
                java.lang.String r14 = r6.cacheKeyOf(r7, r8, r9, r4)
                if (r4 == 0) goto L31
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1
                r2.<init>(r0, r1, r4, r5)
            L31:
                r16 = r2
                org.luckypray.dexkit.cache.CacheBridgeStore r10 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r13 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$1 r15 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$1
                r15.<init>(r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r10.getCachedMap(r11, r12, r13, r14, r15, r16)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto La3
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L62:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lca
                java.lang.Object r1 = r8.next()
                r10 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r10 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r10
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r10.getClass()     // Catch: java.lang.Throwable -> La0
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> La0
                r1 = r7
                java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> La0
                java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> La0
                java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> La0
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La0
                r4 = 0
                r6 = r4
            L85:
                boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> La0
                if (r4 == 0) goto L97
                java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> La0
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> La0
                int r4 = r4.size()     // Catch: java.lang.Throwable -> La0
                int r6 = r6 + r4
                goto L85
            L97:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> La0
                r4 = r9
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La0
                r10.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> La0
            La0:
                r9 = r18
                goto L62
            La3:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            Lab:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lca
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> Lab
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> Lab
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> Lab
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lab
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> Lab
                goto Lab
            Lca:
                p000.i81.m2649(r7)
                java.util.Map r7 = (java.util.Map) r7
                return r7
        }

        public static /* synthetic */ java.util.Map innerGetBatchUsingStringsClasses$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.query.BatchFindClassUsingStrings r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.Map r0 = r0.innerGetBatchUsingStringsClasses(r1, r2)
                return r0
        }

        private final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexMethod>> innerGetBatchUsingStringsMethods(java.lang.String r18, org.luckypray.dexkit.query.BatchFindMethodUsingStrings r19) {
                r17 = this;
                r0 = r17
                r1 = r19
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_BATCH
                r2 = 0
                if (r1 == 0) goto Lf
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1
                r4.<init>(r1)
                goto L10
            Lf:
                r4 = r2
            L10:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$2 r1 = org.luckypray.dexkit.C0648xa2ffee1f.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$3 r5 = org.luckypray.dexkit.C0649xa2ffee20.INSTANCE
                if (r4 == 0) goto L1d
                java.lang.Object r4 = r4.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r4 = (org.luckypray.dexkit.query.base.BaseFinder) r4
                goto L1e
            L1d:
                r4 = r2
            L1e:
                org.luckypray.dexkit.cache.CacheBridgeKeys r6 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r7 = r0.appTag
                java.lang.String r8 = "b"
                r9 = r18
                java.lang.String r14 = r6.cacheKeyOf(r7, r8, r9, r4)
                if (r4 == 0) goto L31
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1
                r2.<init>(r0, r1, r4, r5)
            L31:
                r16 = r2
                org.luckypray.dexkit.cache.CacheBridgeStore r10 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r13 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$1 r15 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalMap$1
                r15.<init>(r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r10.getCachedMap(r11, r12, r13, r14, r15, r16)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto La3
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L62:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lca
                java.lang.Object r1 = r8.next()
                r10 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r10 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r10
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r10.getClass()     // Catch: java.lang.Throwable -> La0
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> La0
                r1 = r7
                java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> La0
                java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> La0
                java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> La0
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La0
                r4 = 0
                r6 = r4
            L85:
                boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> La0
                if (r4 == 0) goto L97
                java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> La0
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> La0
                int r4 = r4.size()     // Catch: java.lang.Throwable -> La0
                int r6 = r6 + r4
                goto L85
            L97:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> La0
                r4 = r9
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La0
                r10.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> La0
            La0:
                r9 = r18
                goto L62
            La3:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            Lab:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lca
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> Lab
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> Lab
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> Lab
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lab
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> Lab
                goto Lab
            Lca:
                p000.i81.m2649(r7)
                java.util.Map r7 = (java.util.Map) r7
                return r7
        }

        public static /* synthetic */ java.util.Map innerGetBatchUsingStringsMethods$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                java.util.Map r0 = r0.innerGetBatchUsingStringsMethods(r1, r2)
                return r0
        }

        private final org.luckypray.dexkit.wrap.DexClass innerGetClass(java.lang.String r13, boolean r14, org.luckypray.dexkit.query.FindClass r15) {
                r12 = this;
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r2 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_SINGLE
                if (r14 == 0) goto L8
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r14 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE
            L6:
                r8 = r14
                goto Lb
            L8:
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r14 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED
                goto L6
            Lb:
                r14 = 0
                if (r15 == 0) goto L14
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClass$1$1
                r0.<init>(r15)
                goto L15
            L14:
                r0 = r14
            L15:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClass$2 r15 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClass$2.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClass$3 r1 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClass$3.INSTANCE
                if (r0 == 0) goto L22
                java.lang.Object r0 = r0.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r0 = (org.luckypray.dexkit.query.base.BaseFinder) r0
                goto L23
            L22:
                r0 = r14
            L23:
                org.luckypray.dexkit.cache.CacheBridgeKeys r3 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r4 = r12.appTag
                java.lang.String r5 = "s"
                java.lang.String r7 = r3.cacheKeyOf(r4, r5, r13, r0)
                if (r0 == 0) goto L34
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 r14 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1
                r14.<init>(r12, r15, r0, r1)
            L34:
                r11 = r14
                r14 = 0
                r15 = 1
                if (r13 != 0) goto L3d
                if (r0 == 0) goto L3d
                r0 = r15
                goto L3e
            L3d:
                r0 = r14
            L3e:
                org.luckypray.dexkit.cache.CacheBridgeStore r3 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r4 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r5 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r6 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r1 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                boolean r9 = r3.shouldCacheFailure(r1, r0)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1 r10 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1
                r10.<init>(r12)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = r3.getCachedSingle(r4, r5, r6, r7, r8, r9, r10, r11)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = r0.getSource()
                java.lang.Object r6 = r0.m7395getResultd1pmJ48()
                java.lang.Throwable r5 = p000.fo1.m2190(r6)
                if (r5 != 0) goto L9e
                java.util.concurrent.CopyOnWriteArraySet r0 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r7 = r0.iterator()
            L75:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto Lc3
                java.lang.Object r0 = r7.next()
                r8 = r0
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r8 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r8
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r8.getClass()     // Catch: java.lang.Throwable -> L9b
                java.lang.String r1 = r12.appTag     // Catch: java.lang.Throwable -> L9b
                r0 = r6
                org.luckypray.dexkit.wrap.ISerializable r0 = (org.luckypray.dexkit.wrap.ISerializable) r0     // Catch: java.lang.Throwable -> L9b
                if (r0 != 0) goto L90
                r5 = r14
                goto L91
            L90:
                r5 = r15
            L91:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L9b
                r3 = r13
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9c
                r8.onQuerySuccess(r0)     // Catch: java.lang.Throwable -> L9c
                goto L9c
            L9b:
                r3 = r13
            L9c:
                r13 = r3
                goto L75
            L9e:
                r3 = r13
                java.util.concurrent.CopyOnWriteArraySet r13 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r13 = r13.iterator()
            La7:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto Lc3
                java.lang.Object r14 = r13.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r14 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r14
                org.luckypray.dexkit.DexKitCacheBridge r15 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r14.getClass()     // Catch: java.lang.Throwable -> La7
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> La7
                java.lang.String r1 = r12.appTag     // Catch: java.lang.Throwable -> La7
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
                r14.onQueryFailure(r0)     // Catch: java.lang.Throwable -> La7
                goto La7
            Lc3:
                p000.i81.m2649(r6)
                org.luckypray.dexkit.wrap.DexClass r6 = (org.luckypray.dexkit.wrap.DexClass) r6
                return r6
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexClass innerGetClass$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, java.lang.String r2, boolean r3, org.luckypray.dexkit.query.FindClass r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                r0 = 0
                if (r6 == 0) goto L6
                r2 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClass(r2, r3, r4)
                return r1
        }

        private final org.luckypray.dexkit.wrap.DexClass innerGetClassDirect(java.lang.String r18, boolean r19, p000.a80 r20) {
                r17 = this;
                r0 = r17
                r1 = r20
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_SINGLE
                if (r19 == 0) goto Lc
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r2 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE
            La:
                r9 = r2
                goto Lf
            Lc:
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r2 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED
                goto La
            Lf:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1 r2 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClassDirect$1.INSTANCE
                org.luckypray.dexkit.cache.CacheBridgeKeys r10 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r11 = r0.appTag
                r15 = 8
                r16 = 0
                java.lang.String r12 = "s"
                r14 = 0
                r13 = r18
                java.lang.String r8 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r10, r11, r12, r13, r14, r15, r16)
                if (r1 == 0) goto L2b
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1
                r4.<init>(r0, r1, r2)
            L29:
                r12 = r4
                goto L2d
            L2b:
                r4 = 0
                goto L29
            L2d:
                org.luckypray.dexkit.cache.CacheBridgeStore r4 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r5 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r6 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r7 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r1 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                r13 = 0
                boolean r10 = r4.shouldCacheFailure(r1, r13)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1 r11 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1
                r11.<init>(r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r4.getCachedSingle(r5, r6, r7, r8, r9, r10, r11, r12)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L8d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L65:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L65
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L65
                r1 = r7
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1     // Catch: java.lang.Throwable -> L65
                if (r1 != 0) goto L80
                r6 = r13
                goto L82
            L80:
                r1 = 1
                r6 = r1
            L82:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L65
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L65
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L65
                goto L65
            L8d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L95:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L95
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L95
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L95
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L95
                goto L95
            Lb4:
                p000.i81.m2649(r7)
                org.luckypray.dexkit.wrap.DexClass r7 = (org.luckypray.dexkit.wrap.DexClass) r7
                return r7
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexClass innerGetClassDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, boolean r2, p000.a80 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                org.luckypray.dexkit.wrap.DexClass r0 = r0.innerGetClassDirect(r1, r2, r3)
                return r0
        }

        private final java.util.List<org.luckypray.dexkit.wrap.DexClass> innerGetClasses(java.lang.String r19, boolean r20, org.luckypray.dexkit.query.FindClass r21) {
                r18 = this;
                r0 = r18
                r1 = r21
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_LIST
                r2 = 0
                if (r1 == 0) goto Lf
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$1$1
                r4.<init>(r1)
                goto L10
            Lf:
                r4 = r2
            L10:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$2 r1 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$2.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$3 r5 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClasses$3.INSTANCE
                if (r4 == 0) goto L1d
                java.lang.Object r4 = r4.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r4 = (org.luckypray.dexkit.query.base.BaseFinder) r4
                goto L1e
            L1d:
                r4 = r2
            L1e:
                org.luckypray.dexkit.cache.CacheBridgeKeys r6 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r7 = r0.appTag
                java.lang.String r8 = "l"
                r9 = r19
                java.lang.String r14 = r6.cacheKeyOf(r7, r8, r9, r4)
                if (r4 == 0) goto L31
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1
                r2.<init>(r0, r1, r4, r5)
            L31:
                r17 = r2
                org.luckypray.dexkit.cache.CacheBridgeStore r10 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r13 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1
                r1.<init>(r0)
                r15 = r20
                r16 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r10.getCachedList(r11, r12, r13, r14, r15, r16, r17)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L8d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L66:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r10 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r10 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r10
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r10.getClass()     // Catch: java.lang.Throwable -> L8a
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L8a
                r1 = r7
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L8a
                int r6 = r1.size()     // Catch: java.lang.Throwable -> L8a
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L8a
                r4 = r9
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8a
                r10.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L8a
            L8a:
                r9 = r19
                goto L66
            L8d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L95:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L95
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L95
                r4 = r19
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L95
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L95
                goto L95
            Lb4:
                p000.i81.m2649(r7)
                java.util.List r7 = (java.util.List) r7
                return r7
        }

        public static /* synthetic */ java.util.List innerGetClasses$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, java.lang.String r2, boolean r3, org.luckypray.dexkit.query.FindClass r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                r0 = 0
                if (r6 == 0) goto L6
                r2 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                java.util.List r1 = r1.innerGetClasses(r2, r3, r4)
                return r1
        }

        private final java.util.List<org.luckypray.dexkit.wrap.DexClass> innerGetClassesDirect(java.lang.String r20, boolean r21, p000.a80 r22) {
                r19 = this;
                r0 = r19
                r1 = r22
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.CLASS_LIST
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClassesDirect$1 r2 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetClassesDirect$1.INSTANCE
                org.luckypray.dexkit.cache.CacheBridgeKeys r4 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r5 = r0.appTag
                r9 = 8
                r10 = 0
                java.lang.String r6 = "l"
                r8 = 0
                r7 = r20
                java.lang.String r15 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r4, r5, r6, r7, r8, r9, r10)
                if (r1 == 0) goto L22
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1
                r4.<init>(r0, r1, r2)
            L1f:
                r18 = r4
                goto L24
            L22:
                r4 = 0
                goto L1f
            L24:
                org.luckypray.dexkit.cache.CacheBridgeStore r11 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r13 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r14 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1
                r1.<init>(r0)
                r16 = r21
                r17 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r11.getCachedList(r12, r13, r14, r15, r16, r17, r18)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L7d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L57:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L57
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L57
                r1 = r7
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L57
                int r6 = r1.size()     // Catch: java.lang.Throwable -> L57
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L57
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L57
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L57
                goto L57
            L7d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L85:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L85
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L85
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L85
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L85
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L85
                goto L85
            La4:
                p000.i81.m2649(r7)
                java.util.List r7 = (java.util.List) r7
                return r7
        }

        public static /* synthetic */ java.util.List innerGetClassesDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, boolean r2, p000.a80 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                java.util.List r0 = r0.innerGetClassesDirect(r1, r2, r3)
                return r0
        }

        private final org.luckypray.dexkit.wrap.DexField innerGetField(java.lang.String r13, boolean r14, org.luckypray.dexkit.query.FindField r15) {
                r12 = this;
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r2 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_SINGLE
                if (r14 == 0) goto L8
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r14 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE
            L6:
                r8 = r14
                goto Lb
            L8:
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r14 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED
                goto L6
            Lb:
                r14 = 0
                if (r15 == 0) goto L14
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$1$1 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$1$1
                r0.<init>(r15)
                goto L15
            L14:
                r0 = r14
            L15:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$2 r15 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$2.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$3 r1 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetField$3.INSTANCE
                if (r0 == 0) goto L22
                java.lang.Object r0 = r0.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r0 = (org.luckypray.dexkit.query.base.BaseFinder) r0
                goto L23
            L22:
                r0 = r14
            L23:
                org.luckypray.dexkit.cache.CacheBridgeKeys r3 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r4 = r12.appTag
                java.lang.String r5 = "s"
                java.lang.String r7 = r3.cacheKeyOf(r4, r5, r13, r0)
                if (r0 == 0) goto L34
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 r14 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1
                r14.<init>(r12, r15, r0, r1)
            L34:
                r11 = r14
                r14 = 0
                r15 = 1
                if (r13 != 0) goto L3d
                if (r0 == 0) goto L3d
                r0 = r15
                goto L3e
            L3d:
                r0 = r14
            L3e:
                org.luckypray.dexkit.cache.CacheBridgeStore r3 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r4 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r5 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r6 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r1 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                boolean r9 = r3.shouldCacheFailure(r1, r0)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1 r10 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1
                r10.<init>(r12)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r0 = r3.getCachedSingle(r4, r5, r6, r7, r8, r9, r10, r11)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = r0.getSource()
                java.lang.Object r6 = r0.m7395getResultd1pmJ48()
                java.lang.Throwable r5 = p000.fo1.m2190(r6)
                if (r5 != 0) goto L9e
                java.util.concurrent.CopyOnWriteArraySet r0 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r7 = r0.iterator()
            L75:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto Lc3
                java.lang.Object r0 = r7.next()
                r8 = r0
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r8 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r8
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r8.getClass()     // Catch: java.lang.Throwable -> L9b
                java.lang.String r1 = r12.appTag     // Catch: java.lang.Throwable -> L9b
                r0 = r6
                org.luckypray.dexkit.wrap.ISerializable r0 = (org.luckypray.dexkit.wrap.ISerializable) r0     // Catch: java.lang.Throwable -> L9b
                if (r0 != 0) goto L90
                r5 = r14
                goto L91
            L90:
                r5 = r15
            L91:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L9b
                r3 = r13
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9c
                r8.onQuerySuccess(r0)     // Catch: java.lang.Throwable -> L9c
                goto L9c
            L9b:
                r3 = r13
            L9c:
                r13 = r3
                goto L75
            L9e:
                r3 = r13
                java.util.concurrent.CopyOnWriteArraySet r13 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r13 = r13.iterator()
            La7:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto Lc3
                java.lang.Object r14 = r13.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r14 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r14
                org.luckypray.dexkit.DexKitCacheBridge r15 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r14.getClass()     // Catch: java.lang.Throwable -> La7
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> La7
                java.lang.String r1 = r12.appTag     // Catch: java.lang.Throwable -> La7
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
                r14.onQueryFailure(r0)     // Catch: java.lang.Throwable -> La7
                goto La7
            Lc3:
                p000.i81.m2649(r6)
                org.luckypray.dexkit.wrap.DexField r6 = (org.luckypray.dexkit.wrap.DexField) r6
                return r6
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexField innerGetField$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, java.lang.String r2, boolean r3, org.luckypray.dexkit.query.FindField r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                r0 = 0
                if (r6 == 0) goto L6
                r2 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetField(r2, r3, r4)
                return r1
        }

        private final org.luckypray.dexkit.wrap.DexField innerGetFieldDirect(java.lang.String r18, boolean r19, p000.a80 r20) {
                r17 = this;
                r0 = r17
                r1 = r20
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_SINGLE
                if (r19 == 0) goto Lc
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r2 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE
            La:
                r9 = r2
                goto Lf
            Lc:
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r2 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED
                goto La
            Lf:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1 r2 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldDirect$1.INSTANCE
                org.luckypray.dexkit.cache.CacheBridgeKeys r10 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r11 = r0.appTag
                r15 = 8
                r16 = 0
                java.lang.String r12 = "s"
                r14 = 0
                r13 = r18
                java.lang.String r8 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r10, r11, r12, r13, r14, r15, r16)
                if (r1 == 0) goto L2b
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1
                r4.<init>(r0, r1, r2)
            L29:
                r12 = r4
                goto L2d
            L2b:
                r4 = 0
                goto L29
            L2d:
                org.luckypray.dexkit.cache.CacheBridgeStore r4 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r5 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r6 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r7 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r1 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                r13 = 0
                boolean r10 = r4.shouldCacheFailure(r1, r13)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1 r11 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1
                r11.<init>(r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r4.getCachedSingle(r5, r6, r7, r8, r9, r10, r11, r12)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L8d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L65:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L65
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L65
                r1 = r7
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1     // Catch: java.lang.Throwable -> L65
                if (r1 != 0) goto L80
                r6 = r13
                goto L82
            L80:
                r1 = 1
                r6 = r1
            L82:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L65
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L65
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L65
                goto L65
            L8d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L95:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L95
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L95
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L95
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L95
                goto L95
            Lb4:
                p000.i81.m2649(r7)
                org.luckypray.dexkit.wrap.DexField r7 = (org.luckypray.dexkit.wrap.DexField) r7
                return r7
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexField innerGetFieldDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, boolean r2, p000.a80 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                org.luckypray.dexkit.wrap.DexField r0 = r0.innerGetFieldDirect(r1, r2, r3)
                return r0
        }

        private final java.util.List<org.luckypray.dexkit.wrap.DexField> innerGetFields(java.lang.String r19, boolean r20, org.luckypray.dexkit.query.FindField r21) {
                r18 = this;
                r0 = r18
                r1 = r21
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_LIST
                r2 = 0
                if (r1 == 0) goto Lf
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFields$1$1
                r4.<init>(r1)
                goto L10
            Lf:
                r4 = r2
            L10:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFields$2 r1 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFields$2.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFields$3 r5 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFields$3.INSTANCE
                if (r4 == 0) goto L1d
                java.lang.Object r4 = r4.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r4 = (org.luckypray.dexkit.query.base.BaseFinder) r4
                goto L1e
            L1d:
                r4 = r2
            L1e:
                org.luckypray.dexkit.cache.CacheBridgeKeys r6 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r7 = r0.appTag
                java.lang.String r8 = "l"
                r9 = r19
                java.lang.String r14 = r6.cacheKeyOf(r7, r8, r9, r4)
                if (r4 == 0) goto L31
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1
                r2.<init>(r0, r1, r4, r5)
            L31:
                r17 = r2
                org.luckypray.dexkit.cache.CacheBridgeStore r10 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r13 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1
                r1.<init>(r0)
                r15 = r20
                r16 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r10.getCachedList(r11, r12, r13, r14, r15, r16, r17)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L8d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L66:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r10 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r10 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r10
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r10.getClass()     // Catch: java.lang.Throwable -> L8a
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L8a
                r1 = r7
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L8a
                int r6 = r1.size()     // Catch: java.lang.Throwable -> L8a
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L8a
                r4 = r9
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8a
                r10.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L8a
            L8a:
                r9 = r19
                goto L66
            L8d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L95:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L95
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L95
                r4 = r19
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L95
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L95
                goto L95
            Lb4:
                p000.i81.m2649(r7)
                java.util.List r7 = (java.util.List) r7
                return r7
        }

        public static /* synthetic */ java.util.List innerGetFields$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, java.lang.String r2, boolean r3, org.luckypray.dexkit.query.FindField r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                r0 = 0
                if (r6 == 0) goto L6
                r2 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                java.util.List r1 = r1.innerGetFields(r2, r3, r4)
                return r1
        }

        private final java.util.List<org.luckypray.dexkit.wrap.DexField> innerGetFieldsDirect(java.lang.String r20, boolean r21, p000.a80 r22) {
                r19 = this;
                r0 = r19
                r1 = r22
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.FIELD_LIST
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldsDirect$1 r2 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetFieldsDirect$1.INSTANCE
                org.luckypray.dexkit.cache.CacheBridgeKeys r4 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r5 = r0.appTag
                r9 = 8
                r10 = 0
                java.lang.String r6 = "l"
                r8 = 0
                r7 = r20
                java.lang.String r15 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r4, r5, r6, r7, r8, r9, r10)
                if (r1 == 0) goto L22
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1
                r4.<init>(r0, r1, r2)
            L1f:
                r18 = r4
                goto L24
            L22:
                r4 = 0
                goto L1f
            L24:
                org.luckypray.dexkit.cache.CacheBridgeStore r11 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r13 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r14 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1
                r1.<init>(r0)
                r16 = r21
                r17 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r11.getCachedList(r12, r13, r14, r15, r16, r17, r18)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L7d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L57:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L57
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L57
                r1 = r7
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L57
                int r6 = r1.size()     // Catch: java.lang.Throwable -> L57
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L57
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L57
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L57
                goto L57
            L7d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L85:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L85
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L85
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L85
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L85
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L85
                goto L85
            La4:
                p000.i81.m2649(r7)
                java.util.List r7 = (java.util.List) r7
                return r7
        }

        public static /* synthetic */ java.util.List innerGetFieldsDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, boolean r2, p000.a80 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                java.util.List r0 = r0.innerGetFieldsDirect(r1, r2, r3)
                return r0
        }

        private final org.luckypray.dexkit.wrap.DexMethod innerGetMethod(java.lang.String r18, boolean r19, org.luckypray.dexkit.query.FindMethod r20) {
                r17 = this;
                r0 = r17
                r4 = r18
                r1 = r20
                r2 = 0
                if (r1 == 0) goto Lf
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1 r3 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$buildQuery$1$1
                r3.<init>(r1)
                goto L10
            Lf:
                r3 = r2
            L10:
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r1 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_SINGLE
                if (r19 == 0) goto L18
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r5 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE
            L16:
                r11 = r5
                goto L1b
            L18:
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r5 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED
                goto L16
            L1b:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 r5 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$1.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$2 r6 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethod$2.INSTANCE
                if (r3 == 0) goto L28
                java.lang.Object r3 = r3.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r3 = (org.luckypray.dexkit.query.base.BaseFinder) r3
                goto L29
            L28:
                r3 = r2
            L29:
                org.luckypray.dexkit.cache.CacheBridgeKeys r7 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r8 = r0.appTag
                java.lang.String r9 = "s"
                java.lang.String r10 = r7.cacheKeyOf(r8, r9, r4, r3)
                if (r3 == 0) goto L3a
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1
                r2.<init>(r0, r5, r3, r6)
            L3a:
                r14 = r2
                r15 = 0
                r16 = 1
                if (r4 != 0) goto L45
                if (r3 == 0) goto L45
                r2 = r16
                goto L46
            L45:
                r2 = r15
            L46:
                org.luckypray.dexkit.cache.CacheBridgeStore r6 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r3 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r7 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r3)
                java.util.concurrent.locks.ReentrantReadWriteLock r8 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r9 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r3 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                boolean r12 = r6.shouldCacheFailure(r3, r2)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1 r13 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalSingle$1
                r13.<init>(r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r2 = r6.getCachedSingle(r7, r8, r9, r10, r11, r12, r13, r14)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r2.getSource()
                java.lang.Object r7 = r2.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto Laa
                java.util.concurrent.CopyOnWriteArraySet r2 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r2.iterator()
            L7d:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto Ld2
                java.lang.Object r2 = r8.next()
                r9 = r2
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r2 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> La5
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> La5
                r3 = r7
                org.luckypray.dexkit.wrap.ISerializable r3 = (org.luckypray.dexkit.wrap.ISerializable) r3     // Catch: java.lang.Throwable -> La5
                if (r3 != 0) goto L99
                r6 = r15
            L97:
                r3 = r1
                goto L9c
            L99:
                r6 = r16
                goto L97
            L9c:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> La6
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La6
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> La6
                goto La6
            La5:
                r3 = r1
            La6:
                r4 = r18
                r1 = r3
                goto L7d
            Laa:
                r3 = r1
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            Lb3:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Ld2
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> Lb3
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> Lb3
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> Lb3
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb3
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> Lb3
                goto Lb3
            Ld2:
                p000.i81.m2649(r7)
                org.luckypray.dexkit.wrap.DexMethod r7 = (org.luckypray.dexkit.wrap.DexMethod) r7
                return r7
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexMethod innerGetMethod$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, java.lang.String r2, boolean r3, org.luckypray.dexkit.query.FindMethod r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                r0 = 0
                if (r6 == 0) goto L6
                r2 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethod(r2, r3, r4)
                return r1
        }

        private final org.luckypray.dexkit.wrap.DexMethod innerGetMethodDirect(java.lang.String r18, boolean r19, p000.a80 r20) {
                r17 = this;
                r0 = r17
                r1 = r20
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_SINGLE
                if (r19 == 0) goto Lc
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r2 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.NULLABLE
            La:
                r9 = r2
                goto Lf
            Lc:
                org.luckypray.dexkit.cache.CacheBridgeStore$SingleResolveMode r2 = org.luckypray.dexkit.cache.CacheBridgeStore.SingleResolveMode.REQUIRED
                goto La
            Lf:
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1 r2 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1.INSTANCE
                org.luckypray.dexkit.cache.CacheBridgeKeys r10 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r11 = r0.appTag
                r15 = 8
                r16 = 0
                java.lang.String r12 = "s"
                r14 = 0
                r13 = r18
                java.lang.String r8 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r10, r11, r12, r13, r14, r15, r16)
                if (r1 == 0) goto L2b
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1
                r4.<init>(r0, r1, r2)
            L29:
                r12 = r4
                goto L2d
            L2b:
                r4 = 0
                goto L29
            L2d:
                org.luckypray.dexkit.cache.CacheBridgeStore r4 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r5 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r6 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r7 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r1 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                r13 = 0
                boolean r10 = r4.shouldCacheFailure(r1, r13)
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1 r11 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1
                r11.<init>(r0)
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r4.getCachedSingle(r5, r6, r7, r8, r9, r10, r11, r12)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L8d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L65:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L65
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L65
                r1 = r7
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1     // Catch: java.lang.Throwable -> L65
                if (r1 != 0) goto L80
                r6 = r13
                goto L82
            L80:
                r1 = 1
                r6 = r1
            L82:
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L65
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L65
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L65
                goto L65
            L8d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L95:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lb4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L95
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L95
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L95
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L95
                goto L95
            Lb4:
                p000.i81.m2649(r7)
                org.luckypray.dexkit.wrap.DexMethod r7 = (org.luckypray.dexkit.wrap.DexMethod) r7
                return r7
        }

        public static /* synthetic */ org.luckypray.dexkit.wrap.DexMethod innerGetMethodDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, boolean r2, p000.a80 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                org.luckypray.dexkit.wrap.DexMethod r0 = r0.innerGetMethodDirect(r1, r2, r3)
                return r0
        }

        private final java.util.List<org.luckypray.dexkit.wrap.DexMethod> innerGetMethods(java.lang.String r19, boolean r20, org.luckypray.dexkit.query.FindMethod r21) {
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 0
                if (r1 == 0) goto Ld
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1 r3 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1
                r3.<init>(r1)
                goto Le
            Ld:
                r3 = r2
            Le:
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r6 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_LIST
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$1 r1 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$1.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$2 r4 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$2.INSTANCE
                if (r3 == 0) goto L1d
                java.lang.Object r3 = r3.invoke()
                org.luckypray.dexkit.query.base.BaseFinder r3 = (org.luckypray.dexkit.query.base.BaseFinder) r3
                goto L1e
            L1d:
                r3 = r2
            L1e:
                org.luckypray.dexkit.cache.CacheBridgeKeys r5 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r7 = r0.appTag
                java.lang.String r8 = "l"
                r9 = r19
                java.lang.String r14 = r5.cacheKeyOf(r7, r8, r9, r3)
                if (r3 == 0) goto L31
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1 r2 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$loader$1$1
                r2.<init>(r0, r1, r3, r4)
            L31:
                r17 = r2
                org.luckypray.dexkit.cache.CacheBridgeStore r10 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r11 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r13 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getInternalList$1
                r1.<init>(r0)
                r15 = r20
                r16 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r10.getCachedList(r11, r12, r13, r14, r15, r16, r17)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r8 = r1.getSource()
                java.lang.Object r1 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r9 = p000.fo1.m2190(r1)
                if (r9 != 0) goto L8b
                java.util.concurrent.CopyOnWriteArraySet r2 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r2 = r2.iterator()
            L66:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Lb1
                java.lang.Object r3 = r2.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r3 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r3
                org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r3.getClass()     // Catch: java.lang.Throwable -> L66
                java.lang.String r5 = r0.appTag     // Catch: java.lang.Throwable -> L66
                r4 = r1
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L66
                int r9 = r4.size()     // Catch: java.lang.Throwable -> L66
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r4 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L66
                r7 = r19
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L66
                r3.onQuerySuccess(r4)     // Catch: java.lang.Throwable -> L66
                goto L66
            L8b:
                java.util.concurrent.CopyOnWriteArraySet r2 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r2 = r2.iterator()
            L93:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Lb1
                java.lang.Object r3 = r2.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r3 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r3
                org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r3.getClass()     // Catch: java.lang.Throwable -> L93
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r4 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L93
                java.lang.String r5 = r0.appTag     // Catch: java.lang.Throwable -> L93
                r7 = r19
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L93
                r3.onQueryFailure(r4)     // Catch: java.lang.Throwable -> L93
                goto L93
            Lb1:
                p000.i81.m2649(r1)
                java.util.List r1 = (java.util.List) r1
                return r1
        }

        public static /* synthetic */ java.util.List innerGetMethods$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1, java.lang.String r2, boolean r3, org.luckypray.dexkit.query.FindMethod r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                r0 = 0
                if (r6 == 0) goto L6
                r2 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                java.util.List r1 = r1.innerGetMethods(r2, r3, r4)
                return r1
        }

        private final java.util.List<org.luckypray.dexkit.wrap.DexMethod> innerGetMethodsDirect(java.lang.String r20, boolean r21, p000.a80 r22) {
                r19 = this;
                r0 = r19
                r1 = r22
                org.luckypray.dexkit.DexKitCacheBridge$QueryKind r3 = org.luckypray.dexkit.DexKitCacheBridge.QueryKind.METHOD_LIST
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethodsDirect$1 r2 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethodsDirect$1.INSTANCE
                org.luckypray.dexkit.cache.CacheBridgeKeys r4 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE
                java.lang.String r5 = r0.appTag
                r9 = 8
                r10 = 0
                java.lang.String r6 = "l"
                r8 = 0
                r7 = r20
                java.lang.String r15 = org.luckypray.dexkit.cache.CacheBridgeKeys.cacheKeyOf$default(r4, r5, r6, r7, r8, r9, r10)
                if (r1 == 0) goto L22
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 r4 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1
                r4.<init>(r0, r1, r2)
            L1f:
                r18 = r4
                goto L24
            L22:
                r4 = 0
                goto L1f
            L24:
                org.luckypray.dexkit.cache.CacheBridgeStore r11 = org.luckypray.dexkit.cache.CacheBridgeStore.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$Cache r12 = org.luckypray.dexkit.DexKitCacheBridge.access$getCache(r1)
                java.util.concurrent.locks.ReentrantReadWriteLock r13 = org.luckypray.dexkit.DexKitCacheBridge.access$getCacheLock$p()
                org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r14 = org.luckypray.dexkit.DexKitCacheBridge.getCachePolicy()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$1
                r1.<init>(r0)
                r16 = r21
                r17 = r1
                org.luckypray.dexkit.cache.CacheBridgeStore$LoadResult r1 = r11.getCachedList(r12, r13, r14, r15, r16, r17, r18)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r5 = r1.getSource()
                java.lang.Object r7 = r1.m7395getResultd1pmJ48()
                java.lang.Throwable r6 = p000.fo1.m2190(r7)
                if (r6 != 0) goto L7d
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L57:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L57
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L57
                r1 = r7
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L57
                int r6 = r1.size()     // Catch: java.lang.Throwable -> L57
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L57
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L57
                r9.onQuerySuccess(r1)     // Catch: java.lang.Throwable -> L57
                goto L57
            L7d:
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r8 = r1.iterator()
            L85:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r8.next()
                r9 = r1
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r9 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r9
                org.luckypray.dexkit.DexKitCacheBridge r1 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r9.getClass()     // Catch: java.lang.Throwable -> L85
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r1 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L85
                java.lang.String r2 = r0.appTag     // Catch: java.lang.Throwable -> L85
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L85
                r9.onQueryFailure(r1)     // Catch: java.lang.Throwable -> L85
                goto L85
            La4:
                p000.i81.m2649(r7)
                java.util.List r7 = (java.util.List) r7
                return r7
        }

        public static /* synthetic */ java.util.List innerGetMethodsDirect$default(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r0, java.lang.String r1, boolean r2, p000.a80 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                java.util.List r0 = r0.innerGetMethodsDirect(r1, r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: notifyQueryResult-nnTlf9I, reason: not valid java name */
        private final <T> java.lang.Object m7383notifyQueryResultnnTlf9I(org.luckypray.dexkit.DexKitCacheBridge.QueryKind r10, java.lang.String r11, org.luckypray.dexkit.DexKitCacheBridge.ResultSource r12, java.lang.Object r13, p000.a80 r14) {
                r9 = this;
                java.lang.Throwable r5 = p000.fo1.m2190(r13)
                if (r5 != 0) goto L46
                java.util.concurrent.CopyOnWriteArraySet r0 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6d
                java.lang.Object r1 = r0.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r1 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r1
                org.luckypray.dexkit.DexKitCacheBridge r2 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r1.getClass()     // Catch: java.lang.Throwable -> L3f
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r3 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L3f
                java.lang.String r4 = r9.appTag     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r2 = r14.invoke(r13)     // Catch: java.lang.Throwable -> L3f
                java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L3f
                int r8 = r2.intValue()     // Catch: java.lang.Throwable -> L3f
                r5 = r10
                r6 = r11
                r7 = r12
                r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3b
                r10 = r3
                r2 = r5
                r3 = r6
                r4 = r7
                r1.onQuerySuccess(r10)     // Catch: java.lang.Throwable -> L42
                goto L42
            L3b:
                r2 = r5
                r3 = r6
                r4 = r7
                goto L42
            L3f:
                r2 = r10
                r3 = r11
                r4 = r12
            L42:
                r10 = r2
                r11 = r3
                r12 = r4
                goto Le
            L46:
                r2 = r10
                r3 = r11
                r4 = r12
                java.util.concurrent.CopyOnWriteArraySet r10 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r10 = r10.iterator()
            L51:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L6d
                java.lang.Object r11 = r10.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r11 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r11
                org.luckypray.dexkit.DexKitCacheBridge r12 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r11.getClass()     // Catch: java.lang.Throwable -> L51
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L51
                java.lang.String r1 = r9.appTag     // Catch: java.lang.Throwable -> L51
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L51
                r11.onQueryFailure(r0)     // Catch: java.lang.Throwable -> L51
                goto L51
            L6d:
                return r13
        }

        /* JADX INFO: renamed from: observeLoad-BWLJW6A, reason: not valid java name */
        private final <T> java.lang.Object m7384observeLoadBWLJW6A(org.luckypray.dexkit.DexKitCacheBridge.QueryKind r9, java.lang.String r10, org.luckypray.dexkit.cache.CacheBridgeStore.LoadResult<T> r11, p000.a80 r12) {
                r8 = this;
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r4 = r11.getSource()
                java.lang.Object r11 = r11.m7395getResultd1pmJ48()
                java.lang.Throwable r5 = p000.fo1.m2190(r11)
                if (r5 != 0) goto L44
                java.util.concurrent.CopyOnWriteArraySet r0 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r6 = r0.iterator()
            L16:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L6a
                java.lang.Object r0 = r6.next()
                r7 = r0
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r7 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r7
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r7.getClass()     // Catch: java.lang.Throwable -> L3f
                org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QuerySuccessEvent     // Catch: java.lang.Throwable -> L3f
                java.lang.String r1 = r8.appTag     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r2 = r12.invoke(r11)     // Catch: java.lang.Throwable -> L3f
                java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L3f
                int r5 = r2.intValue()     // Catch: java.lang.Throwable -> L3f
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L41
                r7.onQuerySuccess(r0)     // Catch: java.lang.Throwable -> L41
                goto L41
            L3f:
                r2 = r9
                r3 = r10
            L41:
                r9 = r2
                r10 = r3
                goto L16
            L44:
                r2 = r9
                r3 = r10
                java.util.concurrent.CopyOnWriteArraySet r9 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r9 = r9.iterator()
            L4e:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L6a
                java.lang.Object r10 = r9.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r10 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r10
                org.luckypray.dexkit.DexKitCacheBridge r12 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r10.getClass()     // Catch: java.lang.Throwable -> L4e
                org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent r0 = new org.luckypray.dexkit.DexKitCacheBridge$QueryFailureEvent     // Catch: java.lang.Throwable -> L4e
                java.lang.String r1 = r8.appTag     // Catch: java.lang.Throwable -> L4e
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e
                r10.onQueryFailure(r0)     // Catch: java.lang.Throwable -> L4e
                goto L4e
            L6a:
                return r11
        }

        private final p000.a80 toBridgeQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2
                r0.<init>(r1)
                return r0
        }

        private final p000.a80 toBridgeQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassesBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$5 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$5
                r0.<init>(r1)
                return r0
        }

        private final p000.a80 toBridgeQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3
                r0.<init>(r1)
                return r0
        }

        private final p000.a80 toBridgeQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldsBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$6
                r0.<init>(r1)
                return r0
        }

        private final p000.a80 toBridgeQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$1 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$1
                r0.<init>(r1)
                return r0
        }

        private final p000.a80 toBridgeQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodsBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$toBridgeQuery$4
                r0.<init>(r1)
                return r0
        }

        private final org.luckypray.dexkit.query.BatchFindClassUsingStrings toQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindClassUsingStringsBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings
                r0.<init>()
                r1.build(r0)
                return r0
        }

        private final org.luckypray.dexkit.query.BatchFindMethodUsingStrings toQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindMethodUsingStringsBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
                r0.<init>()
                r1.build(r0)
                return r0
        }

        private final org.luckypray.dexkit.query.FindClass toQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r1.build(r0)
                return r0
        }

        private final org.luckypray.dexkit.query.FindField toQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r1.build(r0)
                return r0
        }

        private final org.luckypray.dexkit.query.FindMethod toQuery(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r1) {
                r0 = this;
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r1.build(r0)
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = r0.getRuntime()
                r0.close()
                return
        }

        public final void destroy() {
                r0 = this;
                org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = r0.getRuntime()
                r0.destroy()
                return
        }

        public final /* synthetic */ java.util.Map getBatchUsingStringsClasses(p000.a80 r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings
                r0.<init>()
                r2.invoke(r0)
                r2 = 0
                java.util.Map r1 = r1.innerGetBatchUsingStringsClasses(r2, r0)
                return r1
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexClass>> getBatchUsingStringsClasses(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.Map r2 = getBatchUsingStringsClasses$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.Map getBatchUsingStringsClasses(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings
                r0.<init>()
                r3.invoke(r0)
                java.util.Map r1 = r1.innerGetBatchUsingStringsClasses(r2, r0)
                return r1
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexClass>> getBatchUsingStringsClasses(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindClassUsingStringsBuilder r2) {
                r0 = this;
                r1.getClass()
                if (r2 == 0) goto La
                org.luckypray.dexkit.query.BatchFindClassUsingStrings r2 = r0.toQuery(r2)
                goto Lb
            La:
                r2 = 0
            Lb:
                java.util.Map r0 = r0.innerGetBatchUsingStringsClasses(r1, r2)
                return r0
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexClass>> getBatchUsingStringsClasses(java.lang.String r1, org.luckypray.dexkit.query.BatchFindClassUsingStrings r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                java.util.Map r0 = r0.innerGetBatchUsingStringsClasses(r1, r2)
                return r0
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexClass>> getBatchUsingStringsClasses(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindClassUsingStringsBuilder r2) {
                r1 = this;
                r2.getClass()
                r0 = 0
                org.luckypray.dexkit.query.BatchFindClassUsingStrings r2 = r1.toQuery(r2)
                java.util.Map r1 = r1.innerGetBatchUsingStringsClasses(r0, r2)
                return r1
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexClass>> getBatchUsingStringsClasses(org.luckypray.dexkit.query.BatchFindClassUsingStrings r2) {
                r1 = this;
                r2.getClass()
                r0 = 0
                java.util.Map r1 = r1.innerGetBatchUsingStringsClasses(r0, r2)
                return r1
        }

        public final /* synthetic */ java.util.Map getBatchUsingStringsMethods(p000.a80 r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
                r0.<init>()
                r2.invoke(r0)
                r2 = 0
                java.util.Map r1 = r1.innerGetBatchUsingStringsMethods(r2, r0)
                return r1
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexMethod>> getBatchUsingStringsMethods(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.Map r2 = getBatchUsingStringsMethods$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.Map getBatchUsingStringsMethods(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
                r0.<init>()
                r3.invoke(r0)
                java.util.Map r1 = r1.innerGetBatchUsingStringsMethods(r2, r0)
                return r1
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexMethod>> getBatchUsingStringsMethods(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindMethodUsingStringsBuilder r2) {
                r0 = this;
                r1.getClass()
                if (r2 == 0) goto La
                org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2 = r0.toQuery(r2)
                goto Lb
            La:
                r2 = 0
            Lb:
                java.util.Map r0 = r0.innerGetBatchUsingStringsMethods(r1, r2)
                return r0
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexMethod>> getBatchUsingStringsMethods(java.lang.String r1, org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                java.util.Map r0 = r0.innerGetBatchUsingStringsMethods(r1, r2)
                return r0
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexMethod>> getBatchUsingStringsMethods(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BatchFindMethodUsingStringsBuilder r2) {
                r1 = this;
                r2.getClass()
                r0 = 0
                org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2 = r1.toQuery(r2)
                java.util.Map r1 = r1.innerGetBatchUsingStringsMethods(r0, r2)
                return r1
        }

        public final java.util.Map<java.lang.String, java.util.List<org.luckypray.dexkit.wrap.DexMethod>> getBatchUsingStringsMethods(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r2) {
                r1 = this;
                r2.getClass()
                r0 = 0
                java.util.Map r1 = r1.innerGetBatchUsingStringsMethods(r0, r2)
                return r1
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClass(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 0
                org.luckypray.dexkit.wrap.DexClass r2 = r2.innerGetClass(r3, r1, r0)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexClass getClass(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexClass r2 = getClass$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClass(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClass(r2, r3, r0)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClass(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindClass r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClass(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClass(java.lang.String r2, org.luckypray.dexkit.query.FindClass r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClass(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClass(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.query.FindClass r3 = r2.toQuery(r3)
                r1 = 0
                org.luckypray.dexkit.wrap.DexClass r2 = r2.innerGetClass(r1, r0, r3)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexClass getClass(org.luckypray.dexkit.query.FindClass r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 0
                org.luckypray.dexkit.wrap.DexClass r2 = r2.innerGetClass(r0, r1, r3)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassDirect(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexClass r2 = getClassDirect$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClassDirect(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClassDirect(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassDirect(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClassDirect(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassDirectOrNull(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexClass r2 = getClassDirectOrNull$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClassDirectOrNull(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClassDirect(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassDirectOrNull(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClassDirect(r2, r0, r3)
                return r1
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClassOrNull(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 1
                org.luckypray.dexkit.wrap.DexClass r2 = r2.innerGetClass(r3, r1, r0)
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassOrNull(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexClass r2 = getClassOrNull$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexClass getClassOrNull(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 1
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClass(r2, r3, r0)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassOrNull(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindClass r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClass(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassOrNull(java.lang.String r2, org.luckypray.dexkit.query.FindClass r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.wrap.DexClass r1 = r1.innerGetClass(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassOrNull(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.query.FindClass r3 = r2.toQuery(r3)
                r1 = 0
                org.luckypray.dexkit.wrap.DexClass r2 = r2.innerGetClass(r1, r0, r3)
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexClass getClassOrNull(org.luckypray.dexkit.query.FindClass r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 1
                org.luckypray.dexkit.wrap.DexClass r2 = r2.innerGetClass(r0, r1, r3)
                return r2
        }

        public final /* synthetic */ java.util.List getClasses(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 0
                java.util.List r2 = r2.innerGetClasses(r3, r1, r0)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClasses(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getClasses$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getClasses(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                java.util.List r1 = r1.innerGetClasses(r2, r3, r0)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClasses(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindClass r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                java.util.List r1 = r1.innerGetClasses(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClasses(java.lang.String r2, org.luckypray.dexkit.query.FindClass r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                java.util.List r1 = r1.innerGetClasses(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClasses(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.query.FindClass r3 = r2.toQuery(r3)
                r1 = 0
                java.util.List r2 = r2.innerGetClasses(r1, r0, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClasses(org.luckypray.dexkit.query.FindClass r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 0
                java.util.List r2 = r2.innerGetClasses(r0, r1, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesDirect(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getClassesDirect$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getClassesDirect(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                java.util.List r1 = r1.innerGetClassesDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesDirect(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassesBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                java.util.List r1 = r1.innerGetClassesDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesDirectOrEmpty(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getClassesDirectOrEmpty$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getClassesDirectOrEmpty(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                java.util.List r1 = r1.innerGetClassesDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesDirectOrEmpty(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeClassesBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                java.util.List r1 = r1.innerGetClassesDirect(r2, r0, r3)
                return r1
        }

        public final /* synthetic */ java.util.List getClassesOrEmpty(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 1
                java.util.List r2 = r2.innerGetClasses(r3, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getClassesOrEmpty(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
                r0.<init>()
                r3.invoke(r0)
                r3 = 1
                java.util.List r1 = r1.innerGetClasses(r2, r3, r0)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesOrEmpty(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindClass r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                java.util.List r1 = r1.innerGetClasses(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesOrEmpty(java.lang.String r2, org.luckypray.dexkit.query.FindClass r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                java.util.List r1 = r1.innerGetClasses(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesOrEmpty(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindClassBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.query.FindClass r3 = r2.toQuery(r3)
                r1 = 0
                java.util.List r2 = r2.innerGetClasses(r1, r0, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexClass> getClassesOrEmpty(org.luckypray.dexkit.query.FindClass r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 1
                java.util.List r2 = r2.innerGetClasses(r0, r1, r3)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexField getField(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 0
                org.luckypray.dexkit.wrap.DexField r2 = r2.innerGetField(r3, r1, r0)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexField getField(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexField r2 = getField$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexField getField(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetField(r2, r3, r0)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getField(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindField r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetField(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getField(java.lang.String r2, org.luckypray.dexkit.query.FindField r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetField(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getField(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.query.FindField r3 = r2.toQuery(r3)
                r1 = 0
                org.luckypray.dexkit.wrap.DexField r2 = r2.innerGetField(r1, r0, r3)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexField getField(org.luckypray.dexkit.query.FindField r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 0
                org.luckypray.dexkit.wrap.DexField r2 = r2.innerGetField(r0, r1, r3)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldDirect(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexField r2 = getFieldDirect$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexField getFieldDirect(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetFieldDirect(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldDirect(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetFieldDirect(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldDirectOrNull(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexField r2 = getFieldDirectOrNull$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexField getFieldDirectOrNull(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetFieldDirect(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldDirectOrNull(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetFieldDirect(r2, r0, r3)
                return r1
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexField getFieldOrNull(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 1
                org.luckypray.dexkit.wrap.DexField r2 = r2.innerGetField(r3, r1, r0)
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldOrNull(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexField r2 = getFieldOrNull$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexField getFieldOrNull(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 1
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetField(r2, r3, r0)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldOrNull(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindField r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetField(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldOrNull(java.lang.String r2, org.luckypray.dexkit.query.FindField r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.wrap.DexField r1 = r1.innerGetField(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldOrNull(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.query.FindField r3 = r2.toQuery(r3)
                r1 = 0
                org.luckypray.dexkit.wrap.DexField r2 = r2.innerGetField(r1, r0, r3)
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexField getFieldOrNull(org.luckypray.dexkit.query.FindField r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 1
                org.luckypray.dexkit.wrap.DexField r2 = r2.innerGetField(r0, r1, r3)
                return r2
        }

        public final /* synthetic */ java.util.List getFields(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 0
                java.util.List r2 = r2.innerGetFields(r3, r1, r0)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFields(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getFields$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getFields(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                java.util.List r1 = r1.innerGetFields(r2, r3, r0)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFields(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindField r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                java.util.List r1 = r1.innerGetFields(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFields(java.lang.String r2, org.luckypray.dexkit.query.FindField r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                java.util.List r1 = r1.innerGetFields(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFields(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.query.FindField r3 = r2.toQuery(r3)
                r1 = 0
                java.util.List r2 = r2.innerGetFields(r1, r0, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFields(org.luckypray.dexkit.query.FindField r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 0
                java.util.List r2 = r2.innerGetFields(r0, r1, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsDirect(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getFieldsDirect$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getFieldsDirect(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                java.util.List r1 = r1.innerGetFieldsDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsDirect(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldsBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                java.util.List r1 = r1.innerGetFieldsDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsDirectOrEmpty(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getFieldsDirectOrEmpty$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getFieldsDirectOrEmpty(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                java.util.List r1 = r1.innerGetFieldsDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsDirectOrEmpty(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFieldsBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                java.util.List r1 = r1.innerGetFieldsDirect(r2, r0, r3)
                return r1
        }

        public final /* synthetic */ java.util.List getFieldsOrEmpty(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 1
                java.util.List r2 = r2.innerGetFields(r3, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getFieldsOrEmpty(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
                r0.<init>()
                r3.invoke(r0)
                r3 = 1
                java.util.List r1 = r1.innerGetFields(r2, r3, r0)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsOrEmpty(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindField r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                java.util.List r1 = r1.innerGetFields(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsOrEmpty(java.lang.String r2, org.luckypray.dexkit.query.FindField r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                java.util.List r1 = r1.innerGetFields(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsOrEmpty(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindFieldBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.query.FindField r3 = r2.toQuery(r3)
                r1 = 0
                java.util.List r2 = r2.innerGetFields(r1, r0, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexField> getFieldsOrEmpty(org.luckypray.dexkit.query.FindField r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 1
                java.util.List r2 = r2.innerGetFields(r0, r1, r3)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethod(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 0
                org.luckypray.dexkit.wrap.DexMethod r2 = r2.innerGetMethod(r3, r1, r0)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethod(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexMethod r2 = getMethod$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethod(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethod(r2, r3, r0)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethod(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindMethod r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethod(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethod(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethod(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethod(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.query.FindMethod r3 = r2.toQuery(r3)
                r1 = 0
                org.luckypray.dexkit.wrap.DexMethod r2 = r2.innerGetMethod(r1, r0, r3)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethod(org.luckypray.dexkit.query.FindMethod r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 0
                org.luckypray.dexkit.wrap.DexMethod r2 = r2.innerGetMethod(r0, r1, r3)
                r2.getClass()
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodDirect(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexMethod r2 = getMethodDirect$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethodDirect(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethodDirect(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodDirect(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethodDirect(r2, r0, r3)
                r1.getClass()
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodDirectOrNull(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexMethod r2 = getMethodDirectOrNull$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethodDirectOrNull(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethodDirect(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodDirectOrNull(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethodDirect(r2, r0, r3)
                return r1
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethodOrNull(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 1
                org.luckypray.dexkit.wrap.DexMethod r2 = r2.innerGetMethod(r3, r1, r0)
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodOrNull(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                org.luckypray.dexkit.wrap.DexMethod r2 = getMethodOrNull$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ org.luckypray.dexkit.wrap.DexMethod getMethodOrNull(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 1
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethod(r2, r3, r0)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodOrNull(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindMethod r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethod(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodOrNull(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.wrap.DexMethod r1 = r1.innerGetMethod(r2, r0, r3)
                return r1
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodOrNull(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.query.FindMethod r3 = r2.toQuery(r3)
                r1 = 0
                org.luckypray.dexkit.wrap.DexMethod r2 = r2.innerGetMethod(r1, r0, r3)
                return r2
        }

        public final org.luckypray.dexkit.wrap.DexMethod getMethodOrNull(org.luckypray.dexkit.query.FindMethod r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 1
                org.luckypray.dexkit.wrap.DexMethod r2 = r2.innerGetMethod(r0, r1, r3)
                return r2
        }

        public final /* synthetic */ java.util.List getMethods(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 0
                java.util.List r2 = r2.innerGetMethods(r3, r1, r0)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethods(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getMethods$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getMethods(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                java.util.List r1 = r1.innerGetMethods(r2, r3, r0)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethods(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindMethod r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                java.util.List r1 = r1.innerGetMethods(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethods(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                java.util.List r1 = r1.innerGetMethods(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethods(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                org.luckypray.dexkit.query.FindMethod r3 = r2.toQuery(r3)
                r1 = 0
                java.util.List r2 = r2.innerGetMethods(r1, r0, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethods(org.luckypray.dexkit.query.FindMethod r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 0
                java.util.List r2 = r2.innerGetMethods(r0, r1, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsDirect(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getMethodsDirect$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getMethodsDirect(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 0
                java.util.List r1 = r1.innerGetMethodsDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsDirect(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodsBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 0
                java.util.List r1 = r1.innerGetMethodsDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsDirectOrEmpty(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 2
                java.util.List r2 = getMethodsDirectOrEmpty$default(r2, r3, r0, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getMethodsDirectOrEmpty(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                java.util.List r1 = r1.innerGetMethodsDirect(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsDirectOrEmpty(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeMethodsBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                a80 r3 = r1.toBridgeQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                java.util.List r1 = r1.innerGetMethodsDirect(r2, r0, r3)
                return r1
        }

        public final /* synthetic */ java.util.List getMethodsOrEmpty(p000.a80 r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 0
                r1 = 1
                java.util.List r2 = r2.innerGetMethods(r3, r1, r0)
                return r2
        }

        public final /* synthetic */ java.util.List getMethodsOrEmpty(java.lang.String r2, p000.a80 r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
                r0.<init>()
                r3.invoke(r0)
                r3 = 1
                java.util.List r1 = r1.innerGetMethods(r2, r3, r0)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsOrEmpty(java.lang.String r2, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r1 = this;
                r2.getClass()
                if (r3 == 0) goto La
                org.luckypray.dexkit.query.FindMethod r3 = r1.toQuery(r3)
                goto Lb
            La:
                r3 = 0
            Lb:
                r0 = 1
                java.util.List r1 = r1.innerGetMethods(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsOrEmpty(java.lang.String r2, org.luckypray.dexkit.query.FindMethod r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r0 = 1
                java.util.List r1 = r1.innerGetMethods(r2, r0, r3)
                return r1
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsOrEmpty(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.FindMethodBuilder r3) {
                r2 = this;
                r3.getClass()
                r0 = 1
                org.luckypray.dexkit.query.FindMethod r3 = r2.toQuery(r3)
                r1 = 0
                java.util.List r2 = r2.innerGetMethods(r1, r0, r3)
                return r2
        }

        public final java.util.List<org.luckypray.dexkit.wrap.DexMethod> getMethodsOrEmpty(org.luckypray.dexkit.query.FindMethod r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
                r1 = 1
                java.util.List r2 = r2.innerGetMethods(r0, r1, r3)
                return r2
        }

        public final boolean isRetired() {
                r0 = this;
                org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = r0.getRuntime()
                boolean r0 = r0.isDestroyed()
                return r0
        }

        public final /* synthetic */ void withBridge(p000.a80 r4) {
                r3 = this;
                r4.getClass()
                org.luckypray.dexkit.cache.CacheBridgeRuntime r3 = access$getRuntime(r3)
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r3)
                java.lang.Object r0 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r3)     // Catch: java.lang.Throwable -> L35
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L35
                org.luckypray.dexkit.DexKitBridge r1 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r3)     // Catch: java.lang.Throwable -> L27
                if (r1 != 0) goto L29
                p70 r1 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r3)     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L27
                r2 = r1
                org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2     // Catch: java.lang.Throwable -> L27
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r3, r2)     // Catch: java.lang.Throwable -> L27
                org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1     // Catch: java.lang.Throwable -> L27
                r2 = 1
                goto L2a
            L27:
                r4 = move-exception
                goto L3e
            L29:
                r2 = 0
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                if (r2 == 0) goto L37
                p70 r0 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r3)     // Catch: java.lang.Throwable -> L35
                r0.invoke()     // Catch: java.lang.Throwable -> L35
                goto L37
            L35:
                r4 = move-exception
                goto L40
            L37:
                r4.invoke(r1)     // Catch: java.lang.Throwable -> L35
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r3)
                return
            L3e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                throw r4     // Catch: java.lang.Throwable -> L35
            L40:
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r3)
                throw r4
        }

        public final void withBridge(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.BridgeFunction r4) {
                r3 = this;
                r4.getClass()
                org.luckypray.dexkit.cache.CacheBridgeRuntime r3 = access$getRuntime(r3)
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$beginUse(r3)
                java.lang.Object r0 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getLifecycleLock$p(r3)     // Catch: java.lang.Throwable -> L35
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L35
                org.luckypray.dexkit.DexKitBridge r1 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getBridge$p(r3)     // Catch: java.lang.Throwable -> L27
                if (r1 != 0) goto L29
                p70 r1 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getCreateBridge$p(r3)     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L27
                r2 = r1
                org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2     // Catch: java.lang.Throwable -> L27
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$setBridge$p(r3, r2)     // Catch: java.lang.Throwable -> L27
                org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1     // Catch: java.lang.Throwable -> L27
                r2 = 1
                goto L2a
            L27:
                r4 = move-exception
                goto L3e
            L29:
                r2 = 0
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                if (r2 == 0) goto L37
                p70 r0 = org.luckypray.dexkit.cache.CacheBridgeRuntime.access$getNotifyBridgeCreated$p(r3)     // Catch: java.lang.Throwable -> L35
                r0.invoke()     // Catch: java.lang.Throwable -> L35
                goto L37
            L35:
                r4 = move-exception
                goto L40
            L37:
                r4.apply(r1)     // Catch: java.lang.Throwable -> L35
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r3)
                return
            L3e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                throw r4     // Catch: java.lang.Throwable -> L35
            L40:
                org.luckypray.dexkit.cache.CacheBridgeRuntime.access$endUse(r3)
                throw r4
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public enum ResultSource extends java.lang.Enum<org.luckypray.dexkit.DexKitCacheBridge.ResultSource> {
        private static final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.ResultSource[] $VALUES = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.ResultSource CACHE = null;
        public static final org.luckypray.dexkit.DexKitCacheBridge.ResultSource QUERY = null;

        private static final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.ResultSource[] $values() {
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource[] r0 = new org.luckypray.dexkit.DexKitCacheBridge.ResultSource[]{r0, r1}
                return r0
        }

        static {
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = new org.luckypray.dexkit.DexKitCacheBridge$ResultSource
                java.lang.String r1 = "CACHE"
                r2 = 0
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.ResultSource.CACHE = r0
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r0 = new org.luckypray.dexkit.DexKitCacheBridge$ResultSource
                java.lang.String r1 = "QUERY"
                r2 = 1
                r0.<init>(r1, r2)
                org.luckypray.dexkit.DexKitCacheBridge.ResultSource.QUERY = r0
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource[] r0 = $values()
                org.luckypray.dexkit.DexKitCacheBridge.ResultSource.$VALUES = r0
                return
        }

        ResultSource(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.luckypray.dexkit.DexKitCacheBridge.ResultSource valueOf(java.lang.String r1) {
                java.lang.Class<org.luckypray.dexkit.DexKitCacheBridge$ResultSource> r0 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource r1 = (org.luckypray.dexkit.DexKitCacheBridge.ResultSource) r1
                return r1
        }

        public static org.luckypray.dexkit.DexKitCacheBridge.ResultSource[] values() {
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource[] r0 = org.luckypray.dexkit.DexKitCacheBridge.ResultSource.$VALUES
                java.lang.Object r0 = r0.clone()
                org.luckypray.dexkit.DexKitCacheBridge$ResultSource[] r0 = (org.luckypray.dexkit.DexKitCacheBridge.ResultSource[]) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06561 extends p000.bp0 implements p000.p70 {
        final /* synthetic */ java.lang.String $appTag;
        final /* synthetic */ java.lang.String $path;

        public C06561(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.$appTag = r1
                r0.$path = r2
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r0.invoke()
                return r0
        }

        @Override // p000.p70
        public final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge invoke() {
                r2 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$Companion r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.Companion
                java.lang.String r1 = r2.$appTag
                java.lang.String r2 = r2.$path
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r0.create$dexkit_android_release(r1, r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$2 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06572 extends p000.bp0 implements p000.p70 {
        final /* synthetic */ java.lang.String $appTag;
        final /* synthetic */ byte[][] $dexArray;

        public C06572(java.lang.String r1, byte[][] r2) {
                r0 = this;
                r0.$appTag = r1
                r0.$dexArray = r2
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r0.invoke()
                return r0
        }

        @Override // p000.p70
        public final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge invoke() {
                r2 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$Companion r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.Companion
                java.lang.String r1 = r2.$appTag
                byte[][] r2 = r2.$dexArray
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r0.create$dexkit_android_release(r1, r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$create$3 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06583 extends p000.bp0 implements p000.p70 {
        final /* synthetic */ java.lang.String $appTag;
        final /* synthetic */ java.lang.ClassLoader $classLoader;

        public C06583(java.lang.String r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.$appTag = r1
                r0.$classLoader = r2
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r0.invoke()
                return r0
        }

        @Override // p000.p70
        public final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge invoke() {
                r2 = this;
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$Companion r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.Companion
                java.lang.String r1 = r2.$appTag
                java.lang.ClassLoader r2 = r2.$classLoader
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r0.create$dexkit_android_release(r1, r2)
                return r2
        }
    }

    static {
            org.luckypray.dexkit.DexKitCacheBridge r0 = new org.luckypray.dexkit.DexKitCacheBridge
            r0.<init>()
            org.luckypray.dexkit.DexKitCacheBridge.INSTANCE = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitCacheBridge.cacheRef = r0
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            aj r2 = new aj
            r3 = 4
            r2.<init>(r3)
            r3 = 1
            r0.<init>(r3, r2)
            r0.setRemoveOnCancelPolicy(r3)
            org.luckypray.dexkit.DexKitCacheBridge.reaperScheduler = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            org.luckypray.dexkit.DexKitCacheBridge.cacheLock = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            org.luckypray.dexkit.DexKitCacheBridge.listeners = r0
            r2 = 5000(0x1388, double:2.4703E-320)
            org.luckypray.dexkit.DexKitCacheBridge.idleTimeoutMillis = r2
            org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r0 = new org.luckypray.dexkit.DexKitCacheBridge$CachePolicy
            r2 = 0
            r3 = 3
            r0.<init>(r2, r1, r3, r1)
            org.luckypray.dexkit.DexKitCacheBridge.cachePolicy = r0
            return
    }

    private DexKitCacheBridge() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.Cache access$getCache(org.luckypray.dexkit.DexKitCacheBridge r0) {
            org.luckypray.dexkit.DexKitCacheBridge$Cache r0 = r0.getCache()
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.locks.ReentrantReadWriteLock access$getCacheLock$p() {
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.luckypray.dexkit.DexKitCacheBridge.cacheLock
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.CopyOnWriteArraySet access$getListeners$p() {
            java.util.concurrent.CopyOnWriteArraySet<org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener> r0 = org.luckypray.dexkit.DexKitCacheBridge.listeners
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.ScheduledThreadPoolExecutor access$getReaperScheduler$p() {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = org.luckypray.dexkit.DexKitCacheBridge.reaperScheduler
            return r0
    }

    public static final void addListener(org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener r1) {
            r1.getClass()
            java.util.concurrent.CopyOnWriteArraySet<org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener> r0 = org.luckypray.dexkit.DexKitCacheBridge.listeners
            r0.add(r1)
            return
    }

    public static final void clearAllCache() {
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.luckypray.dexkit.DexKitCacheBridge.cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.DexKitCacheBridge$Cache r4 = r4.getCache()     // Catch: java.lang.Throwable -> L38
            r4.clearAll()     // Catch: java.lang.Throwable -> L38
        L2c:
            if (r3 >= r2) goto L34
            r1.lock()
            int r3 = r3 + 1
            goto L2c
        L34:
            r0.unlock()
            return
        L38:
            r4 = move-exception
        L39:
            if (r3 >= r2) goto L41
            r1.lock()
            int r3 = r3 + 1
            goto L39
        L41:
            r0.unlock()
            throw r4
    }

    public static final void clearCache(java.lang.String r7) {
            r7.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = org.luckypray.dexkit.DexKitCacheBridge.cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L15
            int r2 = r0.getReadHoldCount()
            goto L16
        L15:
            r2 = r3
        L16:
            r4 = r3
        L17:
            if (r4 >= r2) goto L1f
            r1.unlock()
            int r4 = r4 + 1
            goto L17
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            org.luckypray.dexkit.cache.CacheBridgeKeys r4 = org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r4.cachePrefixOf(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            r4.append(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = ":"
            r4.append(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L69
            org.luckypray.dexkit.DexKitCacheBridge r4 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE     // Catch: java.lang.Throwable -> L69
            org.luckypray.dexkit.DexKitCacheBridge$Cache r4 = r4.getCache()     // Catch: java.lang.Throwable -> L69
            java.util.Collection r4 = r4.getAllKeys()     // Catch: java.lang.Throwable -> L69
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L69
        L4d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L69
            boolean r6 = p000.x02.m6485(r5, r7, r3)     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L4d
            org.luckypray.dexkit.DexKitCacheBridge r6 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE     // Catch: java.lang.Throwable -> L69
            org.luckypray.dexkit.DexKitCacheBridge$Cache r6 = r6.getCache()     // Catch: java.lang.Throwable -> L69
            r6.remove(r5)     // Catch: java.lang.Throwable -> L69
            goto L4d
        L69:
            r7 = move-exception
            goto L77
        L6b:
            if (r3 >= r2) goto L73
            r1.lock()
            int r3 = r3 + 1
            goto L6b
        L73:
            r0.unlock()
            return
        L77:
            if (r3 >= r2) goto L7f
            r1.lock()
            int r3 = r3 + 1
            goto L77
        L7f:
            r0.unlock()
            throw r7
    }

    public static final void clearListeners() {
            java.util.concurrent.CopyOnWriteArraySet<org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener> r0 = org.luckypray.dexkit.DexKitCacheBridge.listeners
            r0.clear()
            return
    }

    public static final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge create(java.lang.String r2, java.lang.ClassLoader r3) {
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
            r0.getCache()
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            org.luckypray.dexkit.DexKitCacheBridge$create$3 r1 = new org.luckypray.dexkit.DexKitCacheBridge$create$3
            r1.<init>(r2, r3)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r0.obtainBridge(r2, r1)
            return r2
    }

    public static final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge create(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
            r0.getCache()
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            org.luckypray.dexkit.DexKitCacheBridge$create$1 r1 = new org.luckypray.dexkit.DexKitCacheBridge$create$1
            r1.<init>(r2, r3)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r0.obtainBridge(r2, r1)
            return r2
    }

    public static final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge create(java.lang.String r2, byte[][] r3) {
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
            r0.getCache()
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            org.luckypray.dexkit.DexKitCacheBridge$create$2 r1 = new org.luckypray.dexkit.DexKitCacheBridge$create$2
            r1.<init>(r2, r3)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r0.obtainBridge(r2, r1)
            return r2
    }

    private final org.luckypray.dexkit.DexKitCacheBridge.Cache getCache() {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference<org.luckypray.dexkit.DexKitCacheBridge$Cache> r0 = org.luckypray.dexkit.DexKitCacheBridge.cacheRef
            java.lang.Object r0 = r0.get()
            org.luckypray.dexkit.DexKitCacheBridge$Cache r0 = (org.luckypray.dexkit.DexKitCacheBridge.Cache) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Wrapper must be init(cache) first"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }

    public static final org.luckypray.dexkit.DexKitCacheBridge.CachePolicy getCachePolicy() {
            org.luckypray.dexkit.DexKitCacheBridge$CachePolicy r0 = org.luckypray.dexkit.DexKitCacheBridge.cachePolicy
            return r0
    }

    public static /* synthetic */ void getCachePolicy$annotations() {
            return
    }

    public static final long getIdleTimeoutMillis() {
            long r0 = org.luckypray.dexkit.DexKitCacheBridge.idleTimeoutMillis
            return r0
    }

    public static /* synthetic */ void getIdleTimeoutMillis$annotations() {
            return
    }

    public static final void init(org.luckypray.dexkit.DexKitCacheBridge.Cache r2) {
            r2.getClass()
            java.util.concurrent.atomic.AtomicReference<org.luckypray.dexkit.DexKitCacheBridge$Cache> r0 = org.luckypray.dexkit.DexKitCacheBridge.cacheRef
        L5:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L14
            goto L5
        L14:
            java.lang.String r2 = "DexKitCacheBridge.init(cache) can only be called once"
            p000.C1080.m7279(r2)
            return
    }

    private final void notifyListeners(p000.a80 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet r1 = access$getListeners$p()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.next()
            org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r0 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r0
            r0.getClass()     // Catch: java.lang.Throwable -> L8
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L8
            goto L8
        L1b:
            return
    }

    private static final java.lang.Thread reaperScheduler$lambda$1(java.lang.Runnable r2) {
            java.lang.String r0 = "DexKit-Reaper"
            r1 = 1
            java.lang.Thread r2 = p000.AbstractC0602nx.m4139(r2, r0, r1)
            return r2
    }

    public static final void removeListener(org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener r1) {
            r1.getClass()
            java.util.concurrent.CopyOnWriteArraySet<org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener> r0 = org.luckypray.dexkit.DexKitCacheBridge.listeners
            r0.remove(r1)
            return
    }

    public static final void setCachePolicy(org.luckypray.dexkit.DexKitCacheBridge.CachePolicy r0) {
            r0.getClass()
            org.luckypray.dexkit.DexKitCacheBridge.cachePolicy = r0
            return
    }

    public static final void setIdleTimeoutMillis(long r0) {
            org.luckypray.dexkit.DexKitCacheBridge.idleTimeoutMillis = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ java.lang.Thread m4259(java.lang.Runnable r0) {
            java.lang.Thread r0 = reaperScheduler$lambda$1(r0)
            return r0
    }
}
