package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class DecodeJob<R> implements com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback, java.lang.Runnable, java.lang.Comparable<com.bumptech.glide.load.engine.DecodeJob<?>>, com.bumptech.glide.util.pool.FactoryPools.Poolable {
    private static final java.lang.String TAG = "DecodeJob";
    private com.bumptech.glide.load.engine.DecodeJob.Callback<R> callback;
    private com.bumptech.glide.load.Key currentAttemptingKey;
    private java.lang.Object currentData;
    private com.bumptech.glide.load.DataSource currentDataSource;
    private com.bumptech.glide.load.data.DataFetcher<?> currentFetcher;
    private volatile com.bumptech.glide.load.engine.DataFetcherGenerator currentGenerator;
    private com.bumptech.glide.load.Key currentSourceKey;
    private java.lang.Thread currentThread;
    private final com.bumptech.glide.load.engine.DecodeHelper<R> decodeHelper;
    private final com.bumptech.glide.load.engine.DecodeJob.DeferredEncodeManager<?> deferredEncodeManager;
    private final com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider diskCacheProvider;
    private com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy;
    private com.bumptech.glide.GlideContext glideContext;
    private int height;
    private volatile boolean isCallbackNotified;
    private volatile boolean isCancelled;
    private boolean isLoadingFromAlternateCacheKey;
    private com.bumptech.glide.load.engine.EngineKey loadKey;
    private java.lang.Object model;
    private boolean onlyRetrieveFromCache;
    private com.bumptech.glide.load.Options options;
    private int order;
    private final Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.DecodeJob<?>> pool;
    private com.bumptech.glide.Priority priority;
    private final com.bumptech.glide.load.engine.DecodeJob.ReleaseManager releaseManager;
    private com.bumptech.glide.load.engine.DecodeJob.RunReason runReason;
    private com.bumptech.glide.load.Key signature;
    private com.bumptech.glide.load.engine.DecodeJob.Stage stage;
    private long startFetchTime;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;
    private final java.util.List<java.lang.Throwable> throwables;
    private int width;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy = null;
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason = null;
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage = null;

        static {
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$EncodeStrategy = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$EncodeStrategy     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage = r2
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r2 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage     // Catch: java.lang.NoSuchFieldError -> L38
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch: java.lang.NoSuchFieldError -> L38
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                r2 = 3
                int[] r3 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage     // Catch: java.lang.NoSuchFieldError -> L43
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r3 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage     // Catch: java.lang.NoSuchFieldError -> L4e
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r5 = 4
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r3 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage     // Catch: java.lang.NoSuchFieldError -> L59
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch: java.lang.NoSuchFieldError -> L59
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r5 = 5
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason = r3
                com.bumptech.glide.load.engine.DecodeJob$RunReason r4 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE     // Catch: java.lang.NoSuchFieldError -> L6a
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6a
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L6a
            L6a:
                int[] r1 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason     // Catch: java.lang.NoSuchFieldError -> L74
                com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE     // Catch: java.lang.NoSuchFieldError -> L74
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L74
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L74
            L74:
                int[] r0 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason     // Catch: java.lang.NoSuchFieldError -> L7e
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA     // Catch: java.lang.NoSuchFieldError -> L7e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7e
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7e
            L7e:
                return
        }
    }

    public interface Callback<R> {
        void onLoadFailed(com.bumptech.glide.load.engine.GlideException r1);

        void onResourceReady(com.bumptech.glide.load.engine.Resource<R> r1, com.bumptech.glide.load.DataSource r2, boolean r3);

        void reschedule(com.bumptech.glide.load.engine.DecodeJob<?> r1);
    }

    public final class DecodeCallback<Z> implements com.bumptech.glide.load.engine.DecodePath.DecodeCallback<Z> {
        private final com.bumptech.glide.load.DataSource dataSource;
        final /* synthetic */ com.bumptech.glide.load.engine.DecodeJob this$0;

        public DecodeCallback(com.bumptech.glide.load.engine.DecodeJob r1, com.bumptech.glide.load.DataSource r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.dataSource = r2
                return
        }

        @Override // com.bumptech.glide.load.engine.DecodePath.DecodeCallback
        @Yue.InterfaceC4410
        public com.bumptech.glide.load.engine.Resource<Z> onResourceDecoded(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.Resource<Z> r3) {
                r2 = this;
                com.bumptech.glide.load.engine.DecodeJob r0 = r2.this$0
                com.bumptech.glide.load.DataSource r1 = r2.dataSource
                com.bumptech.glide.load.engine.Resource r3 = r0.onResourceDecoded(r1, r3)
                return r3
        }
    }

    public static class DeferredEncodeManager<Z> {
        private com.bumptech.glide.load.ResourceEncoder<Z> encoder;
        private com.bumptech.glide.load.Key key;
        private com.bumptech.glide.load.engine.LockedResource<Z> toEncode;

        public DeferredEncodeManager() {
                r0 = this;
                r0.<init>()
                return
        }

        public void clear() {
                r1 = this;
                r0 = 0
                r1.key = r0
                r1.encoder = r0
                r1.toEncode = r0
                return
        }

        public void encode(com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider r5, com.bumptech.glide.load.Options r6) {
                r4 = this;
                java.lang.String r0 = "DecodeJob.encode"
                com.bumptech.glide.util.pool.GlideTrace.beginSection(r0)
                com.bumptech.glide.load.engine.cache.DiskCache r5 = r5.getDiskCache()     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.Key r0 = r4.key     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.engine.DataCacheWriter r1 = new com.bumptech.glide.load.engine.DataCacheWriter     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.ResourceEncoder<Z> r2 = r4.encoder     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.engine.LockedResource<Z> r3 = r4.toEncode     // Catch: java.lang.Throwable -> L20
                r1.<init>(r2, r3, r6)     // Catch: java.lang.Throwable -> L20
                r5.put(r0, r1)     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.engine.LockedResource<Z> r5 = r4.toEncode
                r5.unlock()
                com.bumptech.glide.util.pool.GlideTrace.endSection()
                return
            L20:
                r5 = move-exception
                com.bumptech.glide.load.engine.LockedResource<Z> r6 = r4.toEncode
                r6.unlock()
                com.bumptech.glide.util.pool.GlideTrace.endSection()
                throw r5
        }

        public boolean hasResourceToEncode() {
                r1 = this;
                com.bumptech.glide.load.engine.LockedResource<Z> r0 = r1.toEncode
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public <X> void init(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.ResourceEncoder<X> r2, com.bumptech.glide.load.engine.LockedResource<X> r3) {
                r0 = this;
                r0.key = r1
                r0.encoder = r2
                r0.toEncode = r3
                return
        }
    }

    public interface DiskCacheProvider {
        com.bumptech.glide.load.engine.cache.DiskCache getDiskCache();
    }

    public static class ReleaseManager {
        private boolean isEncodeComplete;
        private boolean isFailed;
        private boolean isReleased;

        public ReleaseManager() {
                r0 = this;
                r0.<init>()
                return
        }

        private boolean isComplete(boolean r2) {
                r1 = this;
                boolean r0 = r1.isFailed
                if (r0 != 0) goto La
                if (r2 != 0) goto La
                boolean r2 = r1.isEncodeComplete
                if (r2 == 0) goto L10
            La:
                boolean r2 = r1.isReleased
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        public synchronized boolean onEncodeComplete() {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.isEncodeComplete = r0     // Catch: java.lang.Throwable -> Lb
                r0 = 0
                boolean r0 = r1.isComplete(r0)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return r0
            Lb:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r0
        }

        public synchronized boolean onFailed() {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.isFailed = r0     // Catch: java.lang.Throwable -> Lb
                r0 = 0
                boolean r0 = r1.isComplete(r0)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return r0
            Lb:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r0
        }

        public synchronized boolean release(boolean r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.isReleased = r0     // Catch: java.lang.Throwable -> La
                boolean r2 = r1.isComplete(r2)     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)
                return r2
            La:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                throw r2
        }

        public synchronized void reset() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.isEncodeComplete = r0     // Catch: java.lang.Throwable -> La
                r1.isReleased = r0     // Catch: java.lang.Throwable -> La
                r1.isFailed = r0     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)
                return
            La:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                throw r0
        }
    }

    public enum RunReason extends java.lang.Enum<com.bumptech.glide.load.engine.DecodeJob.RunReason> {
        private static final /* synthetic */ com.bumptech.glide.load.engine.DecodeJob.RunReason[] $VALUES = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.RunReason DECODE_DATA = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.RunReason INITIALIZE = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.RunReason SWITCH_TO_SOURCE_SERVICE = null;

        private static /* synthetic */ com.bumptech.glide.load.engine.DecodeJob.RunReason[] $values() {
                com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE
                com.bumptech.glide.load.engine.DecodeJob$RunReason r2 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r0 = new com.bumptech.glide.load.engine.DecodeJob.RunReason[]{r0, r1, r2}
                return r0
        }

        static {
                com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = new com.bumptech.glide.load.engine.DecodeJob$RunReason
                java.lang.String r1 = "INITIALIZE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE = r0
                com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = new com.bumptech.glide.load.engine.DecodeJob$RunReason
                java.lang.String r1 = "SWITCH_TO_SOURCE_SERVICE"
                r2 = 1
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE = r0
                com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = new com.bumptech.glide.load.engine.DecodeJob$RunReason
                java.lang.String r1 = "DECODE_DATA"
                r2 = 2
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA = r0
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r0 = $values()
                com.bumptech.glide.load.engine.DecodeJob.RunReason.$VALUES = r0
                return
        }

        RunReason(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.load.engine.DecodeJob.RunReason valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.engine.DecodeJob$RunReason> r0 = com.bumptech.glide.load.engine.DecodeJob.RunReason.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = (com.bumptech.glide.load.engine.DecodeJob.RunReason) r1
                return r1
        }

        public static com.bumptech.glide.load.engine.DecodeJob.RunReason[] values() {
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r0 = com.bumptech.glide.load.engine.DecodeJob.RunReason.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r0 = (com.bumptech.glide.load.engine.DecodeJob.RunReason[]) r0
                return r0
        }
    }

    public enum Stage extends java.lang.Enum<com.bumptech.glide.load.engine.DecodeJob.Stage> {
        private static final /* synthetic */ com.bumptech.glide.load.engine.DecodeJob.Stage[] $VALUES = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.Stage DATA_CACHE = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.Stage ENCODE = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.Stage FINISHED = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.Stage INITIALIZE = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.Stage RESOURCE_CACHE = null;
        public static final com.bumptech.glide.load.engine.DecodeJob.Stage SOURCE = null;

        private static /* synthetic */ com.bumptech.glide.load.engine.DecodeJob.Stage[] $values() {
                com.bumptech.glide.load.engine.DecodeJob$Stage r0 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE
                com.bumptech.glide.load.engine.DecodeJob$Stage r1 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE
                com.bumptech.glide.load.engine.DecodeJob$Stage r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE
                com.bumptech.glide.load.engine.DecodeJob$Stage r5 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r0 = new com.bumptech.glide.load.engine.DecodeJob.Stage[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                com.bumptech.glide.load.engine.DecodeJob$Stage r0 = new com.bumptech.glide.load.engine.DecodeJob$Stage
                java.lang.String r1 = "INITIALIZE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE = r0
                com.bumptech.glide.load.engine.DecodeJob$Stage r0 = new com.bumptech.glide.load.engine.DecodeJob$Stage
                java.lang.String r1 = "RESOURCE_CACHE"
                r2 = 1
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE = r0
                com.bumptech.glide.load.engine.DecodeJob$Stage r0 = new com.bumptech.glide.load.engine.DecodeJob$Stage
                java.lang.String r1 = "DATA_CACHE"
                r2 = 2
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE = r0
                com.bumptech.glide.load.engine.DecodeJob$Stage r0 = new com.bumptech.glide.load.engine.DecodeJob$Stage
                java.lang.String r1 = "SOURCE"
                r2 = 3
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE = r0
                com.bumptech.glide.load.engine.DecodeJob$Stage r0 = new com.bumptech.glide.load.engine.DecodeJob$Stage
                java.lang.String r1 = "ENCODE"
                r2 = 4
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE = r0
                com.bumptech.glide.load.engine.DecodeJob$Stage r0 = new com.bumptech.glide.load.engine.DecodeJob$Stage
                java.lang.String r1 = "FINISHED"
                r2 = 5
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED = r0
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r0 = $values()
                com.bumptech.glide.load.engine.DecodeJob.Stage.$VALUES = r0
                return
        }

        Stage(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.load.engine.DecodeJob.Stage valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.engine.DecodeJob$Stage> r0 = com.bumptech.glide.load.engine.DecodeJob.Stage.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.engine.DecodeJob$Stage r1 = (com.bumptech.glide.load.engine.DecodeJob.Stage) r1
                return r1
        }

        public static com.bumptech.glide.load.engine.DecodeJob.Stage[] values() {
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r0 = com.bumptech.glide.load.engine.DecodeJob.Stage.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r0 = (com.bumptech.glide.load.engine.DecodeJob.Stage[]) r0
                return r0
        }
    }

    public DecodeJob(com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider r2, Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.DecodeJob<?>> r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.DecodeHelper r0 = new com.bumptech.glide.load.engine.DecodeHelper
            r0.<init>()
            r1.decodeHelper = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.throwables = r0
            com.bumptech.glide.util.pool.StateVerifier r0 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
            r1.stateVerifier = r0
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager r0 = new com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager
            r0.<init>()
            r1.deferredEncodeManager = r0
            com.bumptech.glide.load.engine.DecodeJob$ReleaseManager r0 = new com.bumptech.glide.load.engine.DecodeJob$ReleaseManager
            r0.<init>()
            r1.releaseManager = r0
            r1.diskCacheProvider = r2
            r1.pool = r3
            return
    }

    private <Data> com.bumptech.glide.load.engine.Resource<R> decodeFromData(com.bumptech.glide.load.data.DataFetcher<?> r4, Data r5, com.bumptech.glide.load.DataSource r6) throws com.bumptech.glide.load.engine.GlideException {
            r3 = this;
            if (r5 != 0) goto L7
            r4.cleanup()
            r4 = 0
            return r4
        L7:
            long r0 = com.bumptech.glide.util.LogTime.getLogTime()     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.load.engine.Resource r5 = r3.decodeFromFetcher(r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "DecodeJob"
            r2 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r2)     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L2f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r6.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Decoded result "
            r6.append(r2)     // Catch: java.lang.Throwable -> L2d
            r6.append(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2d
            r3.logWithTimeAndKey(r6, r0)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r5 = move-exception
            goto L33
        L2f:
            r4.cleanup()
            return r5
        L33:
            r4.cleanup()
            throw r5
    }

    private <Data> com.bumptech.glide.load.engine.Resource<R> decodeFromFetcher(Data r3, com.bumptech.glide.load.DataSource r4) throws com.bumptech.glide.load.engine.GlideException {
            r2 = this;
            com.bumptech.glide.load.engine.DecodeHelper<R> r0 = r2.decodeHelper
            java.lang.Class r1 = r3.getClass()
            com.bumptech.glide.load.engine.LoadPath r0 = r0.getLoadPath(r1)
            com.bumptech.glide.load.engine.Resource r3 = r2.runLoadPath(r3, r4, r0)
            return r3
    }

    private void decodeFromRetrievedData() {
            r4 = this;
            java.lang.String r0 = "DecodeJob"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L37
            long r0 = r4.startFetchTime
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "data: "
            r2.append(r3)
            java.lang.Object r3 = r4.currentData
            r2.append(r3)
            java.lang.String r3 = ", cache key: "
            r2.append(r3)
            com.bumptech.glide.load.Key r3 = r4.currentSourceKey
            r2.append(r3)
            java.lang.String r3 = ", fetcher: "
            r2.append(r3)
            com.bumptech.glide.load.data.DataFetcher<?> r3 = r4.currentFetcher
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Retrieved data"
            r4.logWithTimeAndKey(r3, r0, r2)
        L37:
            com.bumptech.glide.load.data.DataFetcher<?> r0 = r4.currentFetcher     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            java.lang.Object r1 = r4.currentData     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            com.bumptech.glide.load.DataSource r2 = r4.currentDataSource     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            com.bumptech.glide.load.engine.Resource r0 = r4.decodeFromData(r0, r1, r2)     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            goto L50
        L42:
            r0 = move-exception
            com.bumptech.glide.load.Key r1 = r4.currentAttemptingKey
            com.bumptech.glide.load.DataSource r2 = r4.currentDataSource
            r0.setLoggingDetails(r1, r2)
            java.util.List<java.lang.Throwable> r1 = r4.throwables
            r1.add(r0)
            r0 = 0
        L50:
            if (r0 == 0) goto L5a
            com.bumptech.glide.load.DataSource r1 = r4.currentDataSource
            boolean r2 = r4.isLoadingFromAlternateCacheKey
            r4.notifyEncodeAndRelease(r0, r1, r2)
            goto L5d
        L5a:
            r4.runGenerators()
        L5d:
            return
    }

    private com.bumptech.glide.load.engine.DataFetcherGenerator getNextGenerator() {
            r3 = this;
            int[] r0 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = r3.stage
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L41
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 3
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 != r1) goto L18
            r0 = 0
            return r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized stage: "
            r1.append(r2)
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = r3.stage
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L31:
            com.bumptech.glide.load.engine.SourceGenerator r0 = new com.bumptech.glide.load.engine.SourceGenerator
            com.bumptech.glide.load.engine.DecodeHelper<R> r1 = r3.decodeHelper
            r0.<init>(r1, r3)
            return r0
        L39:
            com.bumptech.glide.load.engine.DataCacheGenerator r0 = new com.bumptech.glide.load.engine.DataCacheGenerator
            com.bumptech.glide.load.engine.DecodeHelper<R> r1 = r3.decodeHelper
            r0.<init>(r1, r3)
            return r0
        L41:
            com.bumptech.glide.load.engine.ResourceCacheGenerator r0 = new com.bumptech.glide.load.engine.ResourceCacheGenerator
            com.bumptech.glide.load.engine.DecodeHelper<R> r1 = r3.decodeHelper
            r0.<init>(r1, r3)
            return r0
    }

    private com.bumptech.glide.load.engine.DecodeJob.Stage getNextStage(com.bumptech.glide.load.engine.DecodeJob.Stage r4) {
            r3 = this;
            int[] r0 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L4d
            r1 = 2
            if (r0 == r1) goto L43
            r1 = 3
            if (r0 == r1) goto L40
            r1 = 4
            if (r0 == r1) goto L40
            r1 = 5
            if (r0 != r1) goto L29
            com.bumptech.glide.load.engine.DiskCacheStrategy r4 = r3.diskCacheStrategy
            boolean r4 = r4.decodeCachedResource()
            if (r4 == 0) goto L22
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE
            goto L28
        L22:
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = r3.getNextStage(r4)
        L28:
            return r4
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized stage: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L40:
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED
            return r4
        L43:
            boolean r4 = r3.onlyRetrieveFromCache
            if (r4 == 0) goto L4a
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED
            goto L4c
        L4a:
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE
        L4c:
            return r4
        L4d:
            com.bumptech.glide.load.engine.DiskCacheStrategy r4 = r3.diskCacheStrategy
            boolean r4 = r4.decodeCachedData()
            if (r4 == 0) goto L58
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE
            goto L5e
        L58:
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = r3.getNextStage(r4)
        L5e:
            return r4
    }

    @Yue.InterfaceC4410
    private com.bumptech.glide.load.Options getOptionsWithHardwareConfig(com.bumptech.glide.load.DataSource r4) {
            r3 = this;
            com.bumptech.glide.load.Options r0 = r3.options
            com.bumptech.glide.load.DataSource r1 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            if (r4 == r1) goto L11
            com.bumptech.glide.load.engine.DecodeHelper<R> r4 = r3.decodeHelper
            boolean r4 = r4.isScaleOnlyOrNoTransform()
            if (r4 == 0) goto Lf
            goto L11
        Lf:
            r4 = 0
            goto L12
        L11:
            r4 = 1
        L12:
            com.bumptech.glide.load.Option<java.lang.Boolean> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG
            java.lang.Object r2 = r0.get(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L25
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L24
            if (r4 == 0) goto L25
        L24:
            return r0
        L25:
            com.bumptech.glide.load.Options r0 = new com.bumptech.glide.load.Options
            r0.<init>()
            com.bumptech.glide.load.Options r2 = r3.options
            r0.putAll(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.set(r1, r4)
            return r0
    }

    private int getPriority() {
            r1 = this;
            com.bumptech.glide.Priority r0 = r1.priority
            int r0 = r0.ordinal()
            return r0
    }

    private void logWithTimeAndKey(java.lang.String r2, long r3) {
            r1 = this;
            r0 = 0
            r1.logWithTimeAndKey(r2, r3, r0)
            return
    }

    private void logWithTimeAndKey(java.lang.String r2, long r3, java.lang.String r5) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " in "
            r0.append(r2)
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r3)
            r0.append(r2)
            java.lang.String r2 = ", load key: "
            r0.append(r2)
            com.bumptech.glide.load.engine.EngineKey r2 = r1.loadKey
            r0.append(r2)
            if (r5 == 0) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L34
        L32:
            java.lang.String r2 = ""
        L34:
            r0.append(r2)
            java.lang.String r2 = ", thread: "
            r0.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "DecodeJob"
            android.util.Log.v(r3, r2)
            return
    }

    private void notifyComplete(com.bumptech.glide.load.engine.Resource<R> r2, com.bumptech.glide.load.DataSource r3, boolean r4) {
            r1 = this;
            r1.setNotifiedOrThrow()
            com.bumptech.glide.load.engine.DecodeJob$Callback<R> r0 = r1.callback
            r0.onResourceReady(r2, r3, r4)
            return
    }

    private void notifyEncodeAndRelease(com.bumptech.glide.load.engine.Resource<R> r2, com.bumptech.glide.load.DataSource r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "DecodeJob.notifyEncodeAndRelease"
            com.bumptech.glide.util.pool.GlideTrace.beginSection(r0)
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.Initializable     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            r0 = r2
            com.bumptech.glide.load.engine.Initializable r0 = (com.bumptech.glide.load.engine.Initializable) r0     // Catch: java.lang.Throwable -> L10
            r0.initialize()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L4e
        L12:
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r0 = r1.deferredEncodeManager     // Catch: java.lang.Throwable -> L10
            boolean r0 = r0.hasResourceToEncode()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L20
            com.bumptech.glide.load.engine.LockedResource r2 = com.bumptech.glide.load.engine.LockedResource.obtain(r2)     // Catch: java.lang.Throwable -> L10
            r0 = r2
            goto L21
        L20:
            r0 = 0
        L21:
            r1.notifyComplete(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE     // Catch: java.lang.Throwable -> L10
            r1.stage = r2     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r2 = r1.deferredEncodeManager     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r2.hasResourceToEncode()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3c
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r2 = r1.deferredEncodeManager     // Catch: java.lang.Throwable -> L3a
            com.bumptech.glide.load.engine.DecodeJob$DiskCacheProvider r3 = r1.diskCacheProvider     // Catch: java.lang.Throwable -> L3a
            com.bumptech.glide.load.Options r4 = r1.options     // Catch: java.lang.Throwable -> L3a
            r2.encode(r3, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r2 = move-exception
            goto L48
        L3c:
            if (r0 == 0) goto L41
            r0.unlock()     // Catch: java.lang.Throwable -> L10
        L41:
            r1.onEncodeComplete()     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return
        L48:
            if (r0 == 0) goto L4d
            r0.unlock()     // Catch: java.lang.Throwable -> L10
        L4d:
            throw r2     // Catch: java.lang.Throwable -> L10
        L4e:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r2
    }

    private void notifyFailed() {
            r3 = this;
            r3.setNotifiedOrThrow()
            com.bumptech.glide.load.engine.GlideException r0 = new com.bumptech.glide.load.engine.GlideException
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<java.lang.Throwable> r2 = r3.throwables
            r1.<init>(r2)
            java.lang.String r2 = "Failed to load resource"
            r0.<init>(r2, r1)
            com.bumptech.glide.load.engine.DecodeJob$Callback<R> r1 = r3.callback
            r1.onLoadFailed(r0)
            r3.onLoadFailed()
            return
    }

    private void onEncodeComplete() {
            r1 = this;
            com.bumptech.glide.load.engine.DecodeJob$ReleaseManager r0 = r1.releaseManager
            boolean r0 = r0.onEncodeComplete()
            if (r0 == 0) goto Lb
            r1.releaseInternal()
        Lb:
            return
    }

    private void onLoadFailed() {
            r1 = this;
            com.bumptech.glide.load.engine.DecodeJob$ReleaseManager r0 = r1.releaseManager
            boolean r0 = r0.onFailed()
            if (r0 == 0) goto Lb
            r1.releaseInternal()
        Lb:
            return
    }

    private void releaseInternal() {
            r4 = this;
            com.bumptech.glide.load.engine.DecodeJob$ReleaseManager r0 = r4.releaseManager
            r0.reset()
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r0 = r4.deferredEncodeManager
            r0.clear()
            com.bumptech.glide.load.engine.DecodeHelper<R> r0 = r4.decodeHelper
            r0.clear()
            r0 = 0
            r4.isCallbackNotified = r0
            r1 = 0
            r4.glideContext = r1
            r4.signature = r1
            r4.options = r1
            r4.priority = r1
            r4.loadKey = r1
            r4.callback = r1
            r4.stage = r1
            r4.currentGenerator = r1
            r4.currentThread = r1
            r4.currentSourceKey = r1
            r4.currentData = r1
            r4.currentDataSource = r1
            r4.currentFetcher = r1
            r2 = 0
            r4.startFetchTime = r2
            r4.isCancelled = r0
            r4.model = r1
            java.util.List<java.lang.Throwable> r0 = r4.throwables
            r0.clear()
            Yue.ۥۡۤۤ۠$ۥ<com.bumptech.glide.load.engine.DecodeJob<?>> r0 = r4.pool
            r0.release(r4)
            return
    }

    private void reschedule(com.bumptech.glide.load.engine.DecodeJob.RunReason r1) {
            r0 = this;
            r0.runReason = r1
            com.bumptech.glide.load.engine.DecodeJob$Callback<R> r1 = r0.callback
            r1.reschedule(r0)
            return
    }

    private void runGenerators() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r3.currentThread = r0
            long r0 = com.bumptech.glide.util.LogTime.getLogTime()
            r3.startFetchTime = r0
            r0 = 0
        Ld:
            boolean r1 = r3.isCancelled
            if (r1 != 0) goto L37
            com.bumptech.glide.load.engine.DataFetcherGenerator r1 = r3.currentGenerator
            if (r1 == 0) goto L37
            com.bumptech.glide.load.engine.DataFetcherGenerator r0 = r3.currentGenerator
            boolean r0 = r0.startNext()
            if (r0 != 0) goto L37
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = r3.stage
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = r3.getNextStage(r1)
            r3.stage = r1
            com.bumptech.glide.load.engine.DataFetcherGenerator r1 = r3.getNextGenerator()
            r3.currentGenerator = r1
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = r3.stage
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE
            if (r1 != r2) goto Ld
            com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE
            r3.reschedule(r0)
            return
        L37:
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = r3.stage
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED
            if (r1 == r2) goto L41
            boolean r1 = r3.isCancelled
            if (r1 == 0) goto L46
        L41:
            if (r0 != 0) goto L46
            r3.notifyFailed()
        L46:
            return
    }

    private <Data, ResourceType> com.bumptech.glide.load.engine.Resource<R> runLoadPath(Data r7, com.bumptech.glide.load.DataSource r8, com.bumptech.glide.load.engine.LoadPath<Data, ResourceType, R> r9) throws com.bumptech.glide.load.engine.GlideException {
            r6 = this;
            com.bumptech.glide.load.Options r2 = r6.getOptionsWithHardwareConfig(r8)
            com.bumptech.glide.GlideContext r0 = r6.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            com.bumptech.glide.load.data.DataRewinder r7 = r0.getRewinder(r7)
            int r3 = r6.width     // Catch: java.lang.Throwable -> L21
            int r4 = r6.height     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.load.engine.DecodeJob$DecodeCallback r5 = new com.bumptech.glide.load.engine.DecodeJob$DecodeCallback     // Catch: java.lang.Throwable -> L21
            r5.<init>(r6, r8)     // Catch: java.lang.Throwable -> L21
            r0 = r9
            r1 = r7
            com.bumptech.glide.load.engine.Resource r8 = r0.load(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L21
            r7.cleanup()
            return r8
        L21:
            r8 = move-exception
            r7.cleanup()
            throw r8
    }

    private void runWrapped() {
            r3 = this;
            int[] r0 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason
            com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = r3.runReason
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L30
            r1 = 3
            if (r0 != r1) goto L17
            r3.decodeFromRetrievedData()
            goto L45
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized run reason: "
            r1.append(r2)
            com.bumptech.glide.load.engine.DecodeJob$RunReason r2 = r3.runReason
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L30:
            r3.runGenerators()
            goto L45
        L34:
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = r3.getNextStage(r0)
            r3.stage = r0
            com.bumptech.glide.load.engine.DataFetcherGenerator r0 = r3.getNextGenerator()
            r3.currentGenerator = r0
            r3.runGenerators()
        L45:
            return
    }

    private void setNotifiedOrThrow() {
            r3 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r3.stateVerifier
            r0.throwIfRecycled()
            boolean r0 = r3.isCallbackNotified
            r1 = 1
            if (r0 == 0) goto L29
            java.util.List<java.lang.Throwable> r0 = r3.throwables
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            r0 = 0
            goto L21
        L14:
            java.util.List<java.lang.Throwable> r0 = r3.throwables
            int r2 = r0.size()
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Already notified"
            r1.<init>(r2, r0)
            throw r1
        L29:
            r3.isCallbackNotified = r1
            return
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.isCancelled = r0
            com.bumptech.glide.load.engine.DataFetcherGenerator r0 = r1.currentGenerator
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.DecodeJob<?> r3) {
            r2 = this;
            int r0 = r2.getPriority()
            int r1 = r3.getPriority()
            int r0 = r0 - r1
            if (r0 != 0) goto L10
            int r0 = r2.order
            int r3 = r3.order
            int r0 = r0 - r3
        L10:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.DecodeJob<?> r1) {
            r0 = this;
            com.bumptech.glide.load.engine.DecodeJob r1 = (com.bumptech.glide.load.engine.DecodeJob) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @Yue.InterfaceC4410
    public com.bumptech.glide.util.pool.StateVerifier getVerifier() {
            r1 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            return r0
    }

    public com.bumptech.glide.load.engine.DecodeJob<R> init(com.bumptech.glide.GlideContext r17, java.lang.Object r18, com.bumptech.glide.load.engine.EngineKey r19, com.bumptech.glide.load.Key r20, int r21, int r22, java.lang.Class<?> r23, java.lang.Class<R> r24, com.bumptech.glide.Priority r25, com.bumptech.glide.load.engine.DiskCacheStrategy r26, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r27, boolean r28, boolean r29, boolean r30, com.bumptech.glide.load.Options r31, com.bumptech.glide.load.engine.DecodeJob.Callback<R> r32, int r33) {
            r16 = this;
            r0 = r16
            com.bumptech.glide.load.engine.DecodeHelper<R> r1 = r0.decodeHelper
            com.bumptech.glide.load.engine.DecodeJob$DiskCacheProvider r15 = r0.diskCacheProvider
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r26
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r31
            r12 = r27
            r13 = r28
            r14 = r29
            r1.init(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r17
            r0.glideContext = r1
            r1 = r20
            r0.signature = r1
            r1 = r25
            r0.priority = r1
            r1 = r19
            r0.loadKey = r1
            r1 = r21
            r0.width = r1
            r1 = r22
            r0.height = r1
            r1 = r26
            r0.diskCacheStrategy = r1
            r1 = r30
            r0.onlyRetrieveFromCache = r1
            r1 = r31
            r0.options = r1
            r1 = r32
            r0.callback = r1
            r1 = r33
            r0.order = r1
            com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE
            r0.runReason = r1
            r1 = r18
            r0.model = r1
            return r0
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(com.bumptech.glide.load.Key r3, java.lang.Exception r4, com.bumptech.glide.load.data.DataFetcher<?> r5, com.bumptech.glide.load.DataSource r6) {
            r2 = this;
            r5.cleanup()
            com.bumptech.glide.load.engine.GlideException r0 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r1 = "Fetching data failed"
            r0.<init>(r1, r4)
            java.lang.Class r4 = r5.getDataClass()
            r0.setLoggingDetails(r3, r6, r4)
            java.util.List<java.lang.Throwable> r3 = r2.throwables
            r3.add(r0)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread r4 = r2.currentThread
            if (r3 == r4) goto L24
            com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE
            r2.reschedule(r3)
            goto L27
        L24:
            r2.runGenerators()
        L27:
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(com.bumptech.glide.load.Key r1, java.lang.Object r2, com.bumptech.glide.load.data.DataFetcher<?> r3, com.bumptech.glide.load.DataSource r4, com.bumptech.glide.load.Key r5) {
            r0 = this;
            r0.currentSourceKey = r1
            r0.currentData = r2
            r0.currentFetcher = r3
            r0.currentDataSource = r4
            r0.currentAttemptingKey = r5
            com.bumptech.glide.load.engine.DecodeHelper<R> r2 = r0.decodeHelper
            java.util.List r2 = r2.getCacheKeys()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            if (r1 == r2) goto L18
            r3 = 1
        L18:
            r0.isLoadingFromAlternateCacheKey = r3
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread r2 = r0.currentThread
            if (r1 == r2) goto L28
            com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA
            r0.reschedule(r1)
            goto L33
        L28:
            java.lang.String r1 = "DecodeJob.decodeFromRetrievedData"
            com.bumptech.glide.util.pool.GlideTrace.beginSection(r1)
            r0.decodeFromRetrievedData()     // Catch: java.lang.Throwable -> L34
            com.bumptech.glide.util.pool.GlideTrace.endSection()
        L33:
            return
        L34:
            r1 = move-exception
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r1
    }

    @Yue.InterfaceC4410
    public <Z> com.bumptech.glide.load.engine.Resource<Z> onResourceDecoded(com.bumptech.glide.load.DataSource r12, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.Resource<Z> r13) {
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L20
            com.bumptech.glide.load.engine.DecodeHelper<R> r0 = r11.decodeHelper
            com.bumptech.glide.load.Transformation r0 = r0.getTransformation(r8)
            com.bumptech.glide.GlideContext r2 = r11.glideContext
            int r3 = r11.width
            int r4 = r11.height
            com.bumptech.glide.load.engine.Resource r2 = r0.transform(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L22
        L20:
            r0 = r13
            r7 = r1
        L22:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L2b
            r13.recycle()
        L2b:
            com.bumptech.glide.load.engine.DecodeHelper<R> r13 = r11.decodeHelper
            boolean r13 = r13.isResourceEncoderAvailable(r0)
            if (r13 == 0) goto L41
            com.bumptech.glide.load.engine.DecodeHelper<R> r13 = r11.decodeHelper
            com.bumptech.glide.load.ResourceEncoder r1 = r13.getResultEncoder(r0)
            com.bumptech.glide.load.Options r13 = r11.options
            com.bumptech.glide.load.EncodeStrategy r13 = r1.getEncodeStrategy(r13)
        L3f:
            r10 = r1
            goto L44
        L41:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
            goto L3f
        L44:
            com.bumptech.glide.load.engine.DecodeHelper<R> r1 = r11.decodeHelper
            com.bumptech.glide.load.Key r2 = r11.currentSourceKey
            boolean r1 = r1.isSourceKey(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.engine.DiskCacheStrategy r3 = r11.diskCacheStrategy
            boolean r12 = r3.isResourceCacheable(r1, r12, r13)
            if (r12 == 0) goto Lb4
            if (r10 == 0) goto La6
            int[] r12 = com.bumptech.glide.load.engine.DecodeJob.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$EncodeStrategy
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L93
            r1 = 2
            if (r12 != r1) goto L7c
            com.bumptech.glide.load.engine.ResourceCacheKey r12 = new com.bumptech.glide.load.engine.ResourceCacheKey
            com.bumptech.glide.load.engine.DecodeHelper<R> r13 = r11.decodeHelper
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r13.getArrayPool()
            com.bumptech.glide.load.Key r3 = r11.currentSourceKey
            com.bumptech.glide.load.Key r4 = r11.signature
            int r5 = r11.width
            int r6 = r11.height
            com.bumptech.glide.load.Options r9 = r11.options
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L9c
        L7c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L93:
            com.bumptech.glide.load.engine.DataCacheKey r12 = new com.bumptech.glide.load.engine.DataCacheKey
            com.bumptech.glide.load.Key r13 = r11.currentSourceKey
            com.bumptech.glide.load.Key r1 = r11.signature
            r12.<init>(r13, r1)
        L9c:
            com.bumptech.glide.load.engine.LockedResource r0 = com.bumptech.glide.load.engine.LockedResource.obtain(r0)
            com.bumptech.glide.load.engine.DecodeJob$DeferredEncodeManager<?> r13 = r11.deferredEncodeManager
            r13.init(r12, r10, r0)
            goto Lb4
        La6:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        Lb4:
            return r0
    }

    public void release(boolean r2) {
            r1 = this;
            com.bumptech.glide.load.engine.DecodeJob$ReleaseManager r0 = r1.releaseManager
            boolean r2 = r0.release(r2)
            if (r2 == 0) goto Lb
            r1.releaseInternal()
        Lb:
            return
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
            r1 = this;
            com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE
            r1.reschedule(r0)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.lang.String r0 = "DecodeJob"
            com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = r5.runReason
            java.lang.Object r2 = r5.model
            java.lang.String r3 = "DecodeJob#run(reason=%s, model=%s)"
            com.bumptech.glide.util.pool.GlideTrace.beginSectionFormat(r3, r1, r2)
            com.bumptech.glide.load.data.DataFetcher<?> r1 = r5.currentFetcher
            boolean r2 = r5.isCancelled     // Catch: java.lang.Throwable -> L1d com.bumptech.glide.load.engine.CallbackException -> L1f
            if (r2 == 0) goto L21
            r5.notifyFailed()     // Catch: java.lang.Throwable -> L1d com.bumptech.glide.load.engine.CallbackException -> L1f
            if (r1 == 0) goto L19
            r1.cleanup()
        L19:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return
        L1d:
            r2 = move-exception
            goto L2d
        L1f:
            r0 = move-exception
            goto L6b
        L21:
            r5.runWrapped()     // Catch: java.lang.Throwable -> L1d com.bumptech.glide.load.engine.CallbackException -> L1f
            if (r1 == 0) goto L29
            r1.cleanup()
        L29:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return
        L2d:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "DecodeJob threw unexpectedly, isCancelled: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            boolean r4 = r5.isCancelled     // Catch: java.lang.Throwable -> L55
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = ", stage: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = r5.stage     // Catch: java.lang.Throwable -> L55
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L55
            android.util.Log.d(r0, r3, r2)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r0 = move-exception
            goto L6c
        L57:
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = r5.stage     // Catch: java.lang.Throwable -> L55
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L65
            java.util.List<java.lang.Throwable> r0 = r5.throwables     // Catch: java.lang.Throwable -> L55
            r0.add(r2)     // Catch: java.lang.Throwable -> L55
            r5.notifyFailed()     // Catch: java.lang.Throwable -> L55
        L65:
            boolean r0 = r5.isCancelled     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L6a
            throw r2     // Catch: java.lang.Throwable -> L55
        L6a:
            throw r2     // Catch: java.lang.Throwable -> L55
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L55
        L6c:
            if (r1 == 0) goto L71
            r1.cleanup()
        L71:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r0
    }

    public boolean willDecodeFromCache() {
            r2 = this;
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = r2.getNextStage(r0)
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE
            if (r0 == r1) goto L11
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }
}
