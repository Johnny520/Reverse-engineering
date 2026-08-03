package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements com.bumptech.glide.request.Request, com.bumptech.glide.request.target.SizeReadyCallback, com.bumptech.glide.request.ResourceCallback {
    private static final java.lang.String GLIDE_TAG = "Glide";
    private static final boolean IS_VERBOSE_LOGGABLE = false;
    private static final java.lang.String TAG = "GlideRequest";
    private final com.bumptech.glide.request.transition.TransitionFactory<? super R> animationFactory;
    private final java.util.concurrent.Executor callbackExecutor;
    private final android.content.Context context;
    private int cookie;
    private volatile com.bumptech.glide.load.engine.Engine engine;

    @Yue.InterfaceC2947("requestLock")
    @Yue.InterfaceC4544
    private android.graphics.drawable.Drawable errorDrawable;

    @Yue.InterfaceC2947("requestLock")
    @Yue.InterfaceC4544
    private android.graphics.drawable.Drawable fallbackDrawable;
    private final com.bumptech.glide.GlideContext glideContext;

    @Yue.InterfaceC2947("requestLock")
    private int height;

    @Yue.InterfaceC2947("requestLock")
    private boolean isCallingCallbacks;

    @Yue.InterfaceC2947("requestLock")
    private com.bumptech.glide.load.engine.Engine.LoadStatus loadStatus;

    @Yue.InterfaceC4544
    private final java.lang.Object model;
    private final int overrideHeight;
    private final int overrideWidth;

    @Yue.InterfaceC2947("requestLock")
    @Yue.InterfaceC4544
    private android.graphics.drawable.Drawable placeholderDrawable;
    private final com.bumptech.glide.Priority priority;
    private final com.bumptech.glide.request.RequestCoordinator requestCoordinator;

    @Yue.InterfaceC4544
    private final java.util.List<com.bumptech.glide.request.RequestListener<R>> requestListeners;
    private final java.lang.Object requestLock;
    private final com.bumptech.glide.request.BaseRequestOptions<?> requestOptions;

    @Yue.InterfaceC4544
    private java.lang.RuntimeException requestOrigin;

    @Yue.InterfaceC2947("requestLock")
    private com.bumptech.glide.load.engine.Resource<R> resource;

    @Yue.InterfaceC2947("requestLock")
    private long startTime;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;

    @Yue.InterfaceC2947("requestLock")
    private com.bumptech.glide.request.SingleRequest.Status status;

    @Yue.InterfaceC4544
    private final java.lang.String tag;
    private final com.bumptech.glide.request.target.Target<R> target;

    @Yue.InterfaceC4544
    private final com.bumptech.glide.request.RequestListener<R> targetListener;
    private final java.lang.Class<R> transcodeClass;

    @Yue.InterfaceC2947("requestLock")
    private int width;

    public enum Status extends java.lang.Enum<com.bumptech.glide.request.SingleRequest.Status> {
        private static final /* synthetic */ com.bumptech.glide.request.SingleRequest.Status[] $VALUES = null;
        public static final com.bumptech.glide.request.SingleRequest.Status CLEARED = null;
        public static final com.bumptech.glide.request.SingleRequest.Status COMPLETE = null;
        public static final com.bumptech.glide.request.SingleRequest.Status FAILED = null;
        public static final com.bumptech.glide.request.SingleRequest.Status PENDING = null;
        public static final com.bumptech.glide.request.SingleRequest.Status RUNNING = null;
        public static final com.bumptech.glide.request.SingleRequest.Status WAITING_FOR_SIZE = null;

        private static /* synthetic */ com.bumptech.glide.request.SingleRequest.Status[] $values() {
                com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.PENDING
                com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.RUNNING
                com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE
                com.bumptech.glide.request.SingleRequest$Status r3 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
                com.bumptech.glide.request.SingleRequest$Status r4 = com.bumptech.glide.request.SingleRequest.Status.FAILED
                com.bumptech.glide.request.SingleRequest$Status r5 = com.bumptech.glide.request.SingleRequest.Status.CLEARED
                com.bumptech.glide.request.SingleRequest$Status[] r0 = new com.bumptech.glide.request.SingleRequest.Status[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                com.bumptech.glide.request.SingleRequest$Status r0 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r1 = "PENDING"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.request.SingleRequest.Status.PENDING = r0
                com.bumptech.glide.request.SingleRequest$Status r0 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r1 = "RUNNING"
                r2 = 1
                r0.<init>(r1, r2)
                com.bumptech.glide.request.SingleRequest.Status.RUNNING = r0
                com.bumptech.glide.request.SingleRequest$Status r0 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r1 = "WAITING_FOR_SIZE"
                r2 = 2
                r0.<init>(r1, r2)
                com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE = r0
                com.bumptech.glide.request.SingleRequest$Status r0 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r1 = "COMPLETE"
                r2 = 3
                r0.<init>(r1, r2)
                com.bumptech.glide.request.SingleRequest.Status.COMPLETE = r0
                com.bumptech.glide.request.SingleRequest$Status r0 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r1 = "FAILED"
                r2 = 4
                r0.<init>(r1, r2)
                com.bumptech.glide.request.SingleRequest.Status.FAILED = r0
                com.bumptech.glide.request.SingleRequest$Status r0 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r1 = "CLEARED"
                r2 = 5
                r0.<init>(r1, r2)
                com.bumptech.glide.request.SingleRequest.Status.CLEARED = r0
                com.bumptech.glide.request.SingleRequest$Status[] r0 = $values()
                com.bumptech.glide.request.SingleRequest.Status.$VALUES = r0
                return
        }

        Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.request.SingleRequest.Status valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.request.SingleRequest$Status> r0 = com.bumptech.glide.request.SingleRequest.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.request.SingleRequest$Status r1 = (com.bumptech.glide.request.SingleRequest.Status) r1
                return r1
        }

        public static com.bumptech.glide.request.SingleRequest.Status[] values() {
                com.bumptech.glide.request.SingleRequest$Status[] r0 = com.bumptech.glide.request.SingleRequest.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.request.SingleRequest$Status[] r0 = (com.bumptech.glide.request.SingleRequest.Status[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "GlideRequest"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE = r0
            return
    }

    private SingleRequest(android.content.Context r4, com.bumptech.glide.GlideContext r5, @Yue.InterfaceC4410 java.lang.Object r6, @Yue.InterfaceC4544 java.lang.Object r7, java.lang.Class<R> r8, com.bumptech.glide.request.BaseRequestOptions<?> r9, int r10, int r11, com.bumptech.glide.Priority r12, com.bumptech.glide.request.target.Target<R> r13, @Yue.InterfaceC4544 com.bumptech.glide.request.RequestListener<R> r14, @Yue.InterfaceC4544 java.util.List<com.bumptech.glide.request.RequestListener<R>> r15, com.bumptech.glide.request.RequestCoordinator r16, com.bumptech.glide.load.engine.Engine r17, com.bumptech.glide.request.transition.TransitionFactory<? super R> r18, java.util.concurrent.Executor r19) {
            r3 = this;
            r0 = r3
            r3.<init>()
            boolean r1 = com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE
            if (r1 == 0) goto L11
            int r1 = super.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L12
        L11:
            r1 = 0
        L12:
            r0.tag = r1
            com.bumptech.glide.util.pool.StateVerifier r1 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
            r0.stateVerifier = r1
            r1 = r6
            r0.requestLock = r1
            r1 = r4
            r0.context = r1
            r1 = r5
            r0.glideContext = r1
            r2 = r7
            r0.model = r2
            r2 = r8
            r0.transcodeClass = r2
            r2 = r9
            r0.requestOptions = r2
            r2 = r10
            r0.overrideWidth = r2
            r2 = r11
            r0.overrideHeight = r2
            r2 = r12
            r0.priority = r2
            r2 = r13
            r0.target = r2
            r2 = r14
            r0.targetListener = r2
            r2 = r15
            r0.requestListeners = r2
            r2 = r16
            r0.requestCoordinator = r2
            r2 = r17
            r0.engine = r2
            r2 = r18
            r0.animationFactory = r2
            r2 = r19
            r0.callbackExecutor = r2
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.PENDING
            r0.status = r2
            java.lang.RuntimeException r2 = r0.requestOrigin
            if (r2 != 0) goto L6b
            com.bumptech.glide.GlideExperiments r1 = r5.getExperiments()
            java.lang.Class<com.bumptech.glide.GlideBuilder$LogRequestOrigins> r2 = com.bumptech.glide.GlideBuilder.LogRequestOrigins.class
            boolean r1 = r1.isEnabled(r2)
            if (r1 == 0) goto L6b
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Glide request origin trace"
            r1.<init>(r2)
            r0.requestOrigin = r1
        L6b:
            return
    }

    @Yue.InterfaceC2947("requestLock")
    private void assertNotCallingCallbacks() {
            r2 = this;
            boolean r0 = r2.isCallingCallbacks
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean canNotifyCleared() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyCleared(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean canNotifyStatusChanged() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyStatusChanged(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean canSetResource() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto Ld
            boolean r0 = r0.canSetImage(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private void cancel() {
            r1 = this;
            r1.assertNotCallingCallbacks()
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            r0.throwIfRecycled()
            com.bumptech.glide.request.target.Target<R> r0 = r1.target
            r0.removeCallback(r1)
            com.bumptech.glide.load.engine.Engine$LoadStatus r0 = r1.loadStatus
            if (r0 == 0) goto L17
            r0.cancel()
            r0 = 0
            r1.loadStatus = r0
        L17:
            return
    }

    private void experimentalNotifyRequestStarted(java.lang.Object r4) {
            r3 = this;
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r3.requestListeners
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.RequestListener r1 = (com.bumptech.glide.request.RequestListener) r1
            boolean r2 = r1 instanceof com.bumptech.glide.request.ExperimentalRequestListener
            if (r2 == 0) goto L9
            com.bumptech.glide.request.ExperimentalRequestListener r1 = (com.bumptech.glide.request.ExperimentalRequestListener) r1
            r1.onRequestStarted(r4)
            goto L9
        L1f:
            return
    }

    @Yue.InterfaceC2947("requestLock")
    private android.graphics.drawable.Drawable getErrorDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.errorDrawable
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            android.graphics.drawable.Drawable r0 = r0.getErrorPlaceholder()
            r1.errorDrawable = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getErrorId()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getErrorId()
            android.graphics.drawable.Drawable r0 = r1.loadDrawable(r0)
            r1.errorDrawable = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.errorDrawable
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private android.graphics.drawable.Drawable getFallbackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.fallbackDrawable
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            android.graphics.drawable.Drawable r0 = r0.getFallbackDrawable()
            r1.fallbackDrawable = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getFallbackId()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getFallbackId()
            android.graphics.drawable.Drawable r0 = r1.loadDrawable(r0)
            r1.fallbackDrawable = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.fallbackDrawable
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private android.graphics.drawable.Drawable getPlaceholderDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.placeholderDrawable
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            android.graphics.drawable.Drawable r0 = r0.getPlaceholderDrawable()
            r1.placeholderDrawable = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getPlaceholderId()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getPlaceholderId()
            android.graphics.drawable.Drawable r0 = r1.loadDrawable(r0)
            r1.placeholderDrawable = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.placeholderDrawable
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private boolean isFirstReadyResource() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto L11
            com.bumptech.glide.request.RequestCoordinator r0 = r0.getRoot()
            boolean r0 = r0.isAnyResourceSet()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Yue.InterfaceC2947("requestLock")
    private android.graphics.drawable.Drawable loadDrawable(@Yue.InterfaceC2004 int r3) {
            r2 = this;
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r2.requestOptions
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto Lf
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r2.requestOptions
            android.content.res.Resources$Theme r0 = r0.getTheme()
            goto L15
        Lf:
            android.content.Context r0 = r2.context
            android.content.res.Resources$Theme r0 = r0.getTheme()
        L15:
            android.content.Context r1 = r2.context
            android.graphics.drawable.Drawable r3 = com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.getDrawable(r1, r3, r0)
            return r3
    }

    private void logV(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " this: "
            r0.append(r2)
            java.lang.String r2 = r1.tag
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "GlideRequest"
            android.util.Log.v(r0, r2)
            return
    }

    private static int maybeApplySizeMultiplier(int r1, float r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L5
            goto Lb
        L5:
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
        Lb:
            return r1
    }

    @Yue.InterfaceC2947("requestLock")
    private void notifyRequestCoordinatorLoadFailed() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto L7
            r0.onRequestFailed(r1)
        L7:
            return
    }

    @Yue.InterfaceC2947("requestLock")
    private void notifyRequestCoordinatorLoadSucceeded() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto L7
            r0.onRequestSuccess(r1)
        L7:
            return
    }

    public static <R> com.bumptech.glide.request.SingleRequest<R> obtain(android.content.Context r18, com.bumptech.glide.GlideContext r19, java.lang.Object r20, java.lang.Object r21, java.lang.Class<R> r22, com.bumptech.glide.request.BaseRequestOptions<?> r23, int r24, int r25, com.bumptech.glide.Priority r26, com.bumptech.glide.request.target.Target<R> r27, com.bumptech.glide.request.RequestListener<R> r28, @Yue.InterfaceC4544 java.util.List<com.bumptech.glide.request.RequestListener<R>> r29, com.bumptech.glide.request.RequestCoordinator r30, com.bumptech.glide.load.engine.Engine r31, com.bumptech.glide.request.transition.TransitionFactory<? super R> r32, java.util.concurrent.Executor r33) {
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r33
            com.bumptech.glide.request.SingleRequest r17 = new com.bumptech.glide.request.SingleRequest
            r0 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r17
    }

    private void onLoadFailed(com.bumptech.glide.load.engine.GlideException r9, int r10) {
            r8 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r8.stateVerifier
            r0.throwIfRecycled()
            java.lang.Object r0 = r8.requestLock
            monitor-enter(r0)
            java.lang.RuntimeException r1 = r8.requestOrigin     // Catch: java.lang.Throwable -> L4f
            r9.setOrigin(r1)     // Catch: java.lang.Throwable -> L4f
            com.bumptech.glide.GlideContext r1 = r8.glideContext     // Catch: java.lang.Throwable -> L4f
            int r1 = r1.getLogLevel()     // Catch: java.lang.Throwable -> L4f
            if (r1 > r10) goto L51
            java.lang.String r10 = "Glide"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "Load failed for ["
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r3 = r8.model     // Catch: java.lang.Throwable -> L4f
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "] with dimensions ["
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            int r3 = r8.width     // Catch: java.lang.Throwable -> L4f
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            int r3 = r8.height     // Catch: java.lang.Throwable -> L4f
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            android.util.Log.w(r10, r2, r9)     // Catch: java.lang.Throwable -> L4f
            r10 = 4
            if (r1 > r10) goto L51
            java.lang.String r10 = "Glide"
            r9.logRootCauses(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r9 = move-exception
            goto Lae
        L51:
            r10 = 0
            r8.loadStatus = r10     // Catch: java.lang.Throwable -> L4f
            com.bumptech.glide.request.SingleRequest$Status r10 = com.bumptech.glide.request.SingleRequest.Status.FAILED     // Catch: java.lang.Throwable -> L4f
            r8.status = r10     // Catch: java.lang.Throwable -> L4f
            r8.notifyRequestCoordinatorLoadFailed()     // Catch: java.lang.Throwable -> L4f
            r10 = 1
            r8.isCallingCallbacks = r10     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r2 = r8.requestListeners     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L84
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L82
            r3 = r1
        L68:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L85
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.request.RequestListener r4 = (com.bumptech.glide.request.RequestListener) r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r8.model     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.request.target.Target<R> r6 = r8.target     // Catch: java.lang.Throwable -> L82
            boolean r7 = r8.isFirstReadyResource()     // Catch: java.lang.Throwable -> L82
            boolean r4 = r4.onLoadFailed(r9, r5, r6, r7)     // Catch: java.lang.Throwable -> L82
            r3 = r3 | r4
            goto L68
        L82:
            r9 = move-exception
            goto Lab
        L84:
            r3 = r1
        L85:
            com.bumptech.glide.request.RequestListener<R> r2 = r8.targetListener     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L98
            java.lang.Object r4 = r8.model     // Catch: java.lang.Throwable -> L82
            com.bumptech.glide.request.target.Target<R> r5 = r8.target     // Catch: java.lang.Throwable -> L82
            boolean r6 = r8.isFirstReadyResource()     // Catch: java.lang.Throwable -> L82
            boolean r9 = r2.onLoadFailed(r9, r4, r5, r6)     // Catch: java.lang.Throwable -> L82
            if (r9 == 0) goto L98
            goto L99
        L98:
            r10 = r1
        L99:
            r9 = r3 | r10
            if (r9 != 0) goto La0
            r8.setErrorPlaceholder()     // Catch: java.lang.Throwable -> L82
        La0:
            r8.isCallingCallbacks = r1     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = "GlideRequest"
            int r10 = r8.cookie     // Catch: java.lang.Throwable -> L4f
            com.bumptech.glide.util.pool.GlideTrace.endSectionAsync(r9, r10)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        Lab:
            r8.isCallingCallbacks = r1     // Catch: java.lang.Throwable -> L4f
            throw r9     // Catch: java.lang.Throwable -> L4f
        Lae:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r9
    }

    @Yue.InterfaceC2947("requestLock")
    private void onResourceReady(com.bumptech.glide.load.engine.Resource<R> r16, R r17, com.bumptech.glide.load.DataSource r18, boolean r19) {
            r15 = this;
            r1 = r15
            r0 = r18
            boolean r9 = r15.isFirstReadyResource()
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
            r1.status = r2
            r2 = r16
            r1.resource = r2
            com.bumptech.glide.GlideContext r2 = r1.glideContext
            int r2 = r2.getLogLevel()
            r3 = 3
            if (r2 > r3) goto L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Finished loading "
            r2.append(r3)
            java.lang.Class r3 = r17.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " from "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " for "
            r2.append(r3)
            java.lang.Object r3 = r1.model
            r2.append(r3)
            java.lang.String r3 = " with size ["
            r2.append(r3)
            int r3 = r1.width
            r2.append(r3)
            java.lang.String r3 = "x"
            r2.append(r3)
            int r3 = r1.height
            r2.append(r3)
            java.lang.String r3 = "] in "
            r2.append(r3)
            long r3 = r1.startTime
            double r3 = com.bumptech.glide.util.LogTime.getElapsedMillis(r3)
            r2.append(r3)
            java.lang.String r3 = " ms"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Glide"
            android.util.Log.d(r3, r2)
        L6f:
            r15.notifyRequestCoordinatorLoadSucceeded()
            r10 = 1
            r1.isCallingCallbacks = r10
            r11 = 0
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r2 = r1.requestListeners     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto Lb9
            java.util.Iterator r12 = r2.iterator()     // Catch: java.lang.Throwable -> Lb5
            r8 = r11
        L7f:
            boolean r2 = r12.hasNext()     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r12.next()     // Catch: java.lang.Throwable -> Lb5
            r13 = r2
            com.bumptech.glide.request.RequestListener r13 = (com.bumptech.glide.request.RequestListener) r13     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r1.model     // Catch: java.lang.Throwable -> Lb5
            com.bumptech.glide.request.target.Target<R> r5 = r1.target     // Catch: java.lang.Throwable -> Lb5
            r2 = r13
            r3 = r17
            r6 = r18
            r7 = r9
            boolean r2 = r2.onResourceReady(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb5
            r14 = r8 | r2
            boolean r2 = r13 instanceof com.bumptech.glide.request.ExperimentalRequestListener     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto Lb7
            r2 = r13
            com.bumptech.glide.request.ExperimentalRequestListener r2 = (com.bumptech.glide.request.ExperimentalRequestListener) r2     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r1.model     // Catch: java.lang.Throwable -> Lb5
            com.bumptech.glide.request.target.Target<R> r5 = r1.target     // Catch: java.lang.Throwable -> Lb5
            r3 = r17
            r6 = r18
            r7 = r9
            r8 = r19
            boolean r2 = r2.onResourceReady(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb5
            r2 = r2 | r14
            r8 = r2
            goto L7f
        Lb5:
            r0 = move-exception
            goto Lea
        Lb7:
            r8 = r14
            goto L7f
        Lb9:
            r8 = r11
        Lba:
            com.bumptech.glide.request.RequestListener<R> r2 = r1.targetListener     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto Lce
            java.lang.Object r4 = r1.model     // Catch: java.lang.Throwable -> Lb5
            com.bumptech.glide.request.target.Target<R> r5 = r1.target     // Catch: java.lang.Throwable -> Lb5
            r3 = r17
            r6 = r18
            r7 = r9
            boolean r2 = r2.onResourceReady(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto Lce
            goto Lcf
        Lce:
            r10 = r11
        Lcf:
            r2 = r8 | r10
            if (r2 != 0) goto Le0
            com.bumptech.glide.request.transition.TransitionFactory<? super R> r2 = r1.animationFactory     // Catch: java.lang.Throwable -> Lb5
            com.bumptech.glide.request.transition.Transition r0 = r2.build(r0, r9)     // Catch: java.lang.Throwable -> Lb5
            com.bumptech.glide.request.target.Target<R> r2 = r1.target     // Catch: java.lang.Throwable -> Lb5
            r3 = r17
            r2.onResourceReady(r3, r0)     // Catch: java.lang.Throwable -> Lb5
        Le0:
            r1.isCallingCallbacks = r11
            java.lang.String r0 = "GlideRequest"
            int r2 = r1.cookie
            com.bumptech.glide.util.pool.GlideTrace.endSectionAsync(r0, r2)
            return
        Lea:
            r1.isCallingCallbacks = r11
            throw r0
    }

    @Yue.InterfaceC2947("requestLock")
    private void setErrorPlaceholder() {
            r2 = this;
            boolean r0 = r2.canNotifyStatusChanged()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.Object r0 = r2.model
            if (r0 != 0) goto L10
            android.graphics.drawable.Drawable r0 = r2.getFallbackDrawable()
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = r2.getErrorDrawable()
        L17:
            if (r0 != 0) goto L1d
            android.graphics.drawable.Drawable r0 = r2.getPlaceholderDrawable()
        L1d:
            com.bumptech.glide.request.target.Target<R> r1 = r2.target
            r1.onLoadFailed(r0)
            return
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
            r5 = this;
            java.lang.Object r0 = r5.requestLock
            monitor-enter(r0)
            r5.assertNotCallingCallbacks()     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.util.pool.StateVerifier r1 = r5.stateVerifier     // Catch: java.lang.Throwable -> L28
            r1.throwIfRecycled()     // Catch: java.lang.Throwable -> L28
            long r1 = com.bumptech.glide.util.LogTime.getLogTime()     // Catch: java.lang.Throwable -> L28
            r5.startTime = r1     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r5.model     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L40
            int r1 = r5.overrideWidth     // Catch: java.lang.Throwable -> L28
            int r2 = r5.overrideHeight     // Catch: java.lang.Throwable -> L28
            boolean r1 = com.bumptech.glide.util.Util.isValidDimensions(r1, r2)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2b
            int r1 = r5.overrideWidth     // Catch: java.lang.Throwable -> L28
            r5.width = r1     // Catch: java.lang.Throwable -> L28
            int r1 = r5.overrideHeight     // Catch: java.lang.Throwable -> L28
            r5.height = r1     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r1 = move-exception
            goto Lb7
        L2b:
            android.graphics.drawable.Drawable r1 = r5.getFallbackDrawable()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L33
            r1 = 5
            goto L34
        L33:
            r1 = 3
        L34:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L28
            r5.onLoadFailed(r2, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L40:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.status     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.request.SingleRequest$Status r3 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> L28
            if (r2 == r3) goto Laf
            com.bumptech.glide.request.SingleRequest$Status r4 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> L28
            if (r2 != r4) goto L54
            com.bumptech.glide.load.engine.Resource<R> r1 = r5.resource     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch: java.lang.Throwable -> L28
            r3 = 0
            r5.onResourceReady(r1, r2, r3)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L54:
            r5.experimentalNotifyRequestStarted(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "GlideRequest"
            int r1 = com.bumptech.glide.util.pool.GlideTrace.beginSectionAsync(r1)     // Catch: java.lang.Throwable -> L28
            r5.cookie = r1     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L28
            r5.status = r1     // Catch: java.lang.Throwable -> L28
            int r2 = r5.overrideWidth     // Catch: java.lang.Throwable -> L28
            int r4 = r5.overrideHeight     // Catch: java.lang.Throwable -> L28
            boolean r2 = com.bumptech.glide.util.Util.isValidDimensions(r2, r4)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L75
            int r2 = r5.overrideWidth     // Catch: java.lang.Throwable -> L28
            int r4 = r5.overrideHeight     // Catch: java.lang.Throwable -> L28
            r5.onSizeReady(r2, r4)     // Catch: java.lang.Throwable -> L28
            goto L7a
        L75:
            com.bumptech.glide.request.target.Target<R> r2 = r5.target     // Catch: java.lang.Throwable -> L28
            r2.getSize(r5)     // Catch: java.lang.Throwable -> L28
        L7a:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.status     // Catch: java.lang.Throwable -> L28
            if (r2 == r3) goto L80
            if (r2 != r1) goto L8f
        L80:
            boolean r1 = r5.canNotifyStatusChanged()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L8f
            com.bumptech.glide.request.target.Target<R> r1 = r5.target     // Catch: java.lang.Throwable -> L28
            android.graphics.drawable.Drawable r2 = r5.getPlaceholderDrawable()     // Catch: java.lang.Throwable -> L28
            r1.onLoadStarted(r2)     // Catch: java.lang.Throwable -> L28
        L8f:
            boolean r1 = com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            long r2 = r5.startTime     // Catch: java.lang.Throwable -> L28
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            r5.logV(r1)     // Catch: java.lang.Throwable -> L28
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        Laf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        Lb7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
            r5 = this;
            java.lang.Object r0 = r5.requestLock
            monitor-enter(r0)
            r5.assertNotCallingCallbacks()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.util.pool.StateVerifier r1 = r5.stateVerifier     // Catch: java.lang.Throwable -> L13
            r1.throwIfRecycled()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.status     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            goto L42
        L15:
            r5.cancel()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.load.engine.Resource<R> r1 = r5.resource     // Catch: java.lang.Throwable -> L13
            r3 = 0
            if (r1 == 0) goto L20
            r5.resource = r3     // Catch: java.lang.Throwable -> L13
            goto L21
        L20:
            r1 = r3
        L21:
            boolean r3 = r5.canNotifyCleared()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L30
            com.bumptech.glide.request.target.Target<R> r3 = r5.target     // Catch: java.lang.Throwable -> L13
            android.graphics.drawable.Drawable r4 = r5.getPlaceholderDrawable()     // Catch: java.lang.Throwable -> L13
            r3.onLoadCleared(r4)     // Catch: java.lang.Throwable -> L13
        L30:
            java.lang.String r3 = "GlideRequest"
            int r4 = r5.cookie     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.util.pool.GlideTrace.endSectionAsync(r3, r4)     // Catch: java.lang.Throwable -> L13
            r5.status = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L41
            com.bumptech.glide.load.engine.Engine r0 = r5.engine
            r0.release(r1)
        L41:
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public java.lang.Object getLock() {
            r1 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            r0.throwIfRecycled()
            java.lang.Object r0 = r1.requestLock
            return r0
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof com.bumptech.glide.request.SingleRequest
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.requestLock
            monitor-enter(r2)
            int r4 = r1.overrideWidth     // Catch: java.lang.Throwable -> L22
            int r5 = r1.overrideHeight     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r1.model     // Catch: java.lang.Throwable -> L22
            java.lang.Class<R> r7 = r1.transcodeClass     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.request.BaseRequestOptions<?> r8 = r1.requestOptions     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.Priority r9 = r1.priority     // Catch: java.lang.Throwable -> L22
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r10 = r1.requestListeners     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L24
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            goto L64
        L24:
            r10 = r3
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.request.SingleRequest r0 = (com.bumptech.glide.request.SingleRequest) r0
            java.lang.Object r11 = r0.requestLock
            monitor-enter(r11)
            int r2 = r0.overrideWidth     // Catch: java.lang.Throwable -> L40
            int r12 = r0.overrideHeight     // Catch: java.lang.Throwable -> L40
            java.lang.Object r13 = r0.model     // Catch: java.lang.Throwable -> L40
            java.lang.Class<R> r14 = r0.transcodeClass     // Catch: java.lang.Throwable -> L40
            com.bumptech.glide.request.BaseRequestOptions<?> r15 = r0.requestOptions     // Catch: java.lang.Throwable -> L40
            com.bumptech.glide.Priority r3 = r0.priority     // Catch: java.lang.Throwable -> L40
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r0.requestListeners     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L42
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
            goto L62
        L42:
            r0 = 0
        L43:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L40
            if (r4 != r2) goto L60
            if (r5 != r12) goto L60
            boolean r2 = com.bumptech.glide.util.Util.bothModelsNullEquivalentOrEquals(r6, r13)
            if (r2 == 0) goto L60
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L60
            boolean r2 = com.bumptech.glide.util.Util.bothBaseRequestOptionsNullEquivalentOrEquals(r8, r15)
            if (r2 == 0) goto L60
            if (r9 != r3) goto L60
            if (r10 != r0) goto L60
            r3 = 1
            goto L61
        L60:
            r3 = 0
        L61:
            return r3
        L62:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L40
            throw r0
        L64:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> L10
            if (r1 == r2) goto L12
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto Le
            goto L12
        Le:
            r1 = 0
            goto L13
        L10:
            r1 = move-exception
            goto L15
        L12:
            r1 = 1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(com.bumptech.glide.load.engine.GlideException r2) {
            r1 = this;
            r0 = 5
            r1.onLoadFailed(r2, r0)
            return
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onResourceReady(com.bumptech.glide.load.engine.Resource<?> r6, com.bumptech.glide.load.DataSource r7, boolean r8) {
            r5 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r5.stateVerifier
            r0.throwIfRecycled()
            r0 = 0
            java.lang.Object r1 = r5.requestLock     // Catch: java.lang.Throwable -> Lbe
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lbe
            r5.loadStatus = r0     // Catch: java.lang.Throwable -> L2f
            if (r6 != 0) goto L32
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r7.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "Expected to receive a Resource<R> with an object of "
            r7.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<R> r8 = r5.transcodeClass     // Catch: java.lang.Throwable -> L2f
            r7.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = " inside, but instead got null."
            r7.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            r5.onLoadFailed(r6)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r6 = move-exception
            goto Lbc
        L32:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L68
            java.lang.Class<R> r3 = r5.transcodeClass     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L45
            goto L68
        L45:
            boolean r3 = r5.canSetResource()     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L63
            r5.resource = r0     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.request.SingleRequest$Status r7 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> L5f
            r5.status = r7     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = "GlideRequest"
            int r8 = r5.cookie     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.util.pool.GlideTrace.endSectionAsync(r7, r8)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r6)
            return
        L5f:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto Lbc
        L63:
            r5.onResourceReady(r6, r2, r7, r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L68:
            r5.resource = r0     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r8.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "Expected to receive an object of "
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class<R> r0 = r5.transcodeClass     // Catch: java.lang.Throwable -> L5f
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = " but instead got "
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L87
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L5f
            goto L89
        L87:
            java.lang.String r0 = ""
        L89:
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "{"
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            r8.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "} inside Resource{"
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            r8.append(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "}."
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto La6
            java.lang.String r0 = ""
            goto La8
        La6:
            java.lang.String r0 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        La8:
            r8.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L5f
            r5.onLoadFailed(r7)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r6)
            return
        Lbc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r6 = move-exception
            if (r0 == 0) goto Lc6
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r0)
        Lc6:
            throw r6
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int r25, int r26) {
            r24 = this;
            r15 = r24
            com.bumptech.glide.util.pool.StateVerifier r0 = r15.stateVerifier
            r0.throwIfRecycled()
            java.lang.Object r14 = r15.requestLock
            monitor-enter(r14)
            boolean r0 = com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "Got onSizeReady in "
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            long r2 = r15.startTime     // Catch: java.lang.Throwable -> L29
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r15.logV(r1)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            r0 = move-exception
            r23 = r14
            r1 = r15
            goto L114
        L2f:
            com.bumptech.glide.request.SingleRequest$Status r1 = r15.status     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L29
            if (r1 == r2) goto L37
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L29
            return
        L37:
            com.bumptech.glide.request.SingleRequest$Status r13 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> L29
            r15.status = r13     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.BaseRequestOptions<?> r1 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            float r1 = r1.getSizeMultiplier()     // Catch: java.lang.Throwable -> L29
            r2 = r25
            int r2 = maybeApplySizeMultiplier(r2, r1)     // Catch: java.lang.Throwable -> L29
            r15.width = r2     // Catch: java.lang.Throwable -> L29
            r2 = r26
            int r1 = maybeApplySizeMultiplier(r2, r1)     // Catch: java.lang.Throwable -> L29
            r15.height = r1     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "finished setup for calling load in "
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            long r2 = r15.startTime     // Catch: java.lang.Throwable -> L29
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r15.logV(r1)     // Catch: java.lang.Throwable -> L29
        L6d:
            com.bumptech.glide.load.engine.Engine r1 = r15.engine     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.GlideContext r2 = r15.glideContext     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r15.model     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.BaseRequestOptions<?> r4 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.Key r4 = r4.getSignature()     // Catch: java.lang.Throwable -> L29
            int r5 = r15.width     // Catch: java.lang.Throwable -> L29
            int r6 = r15.height     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.BaseRequestOptions<?> r7 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            java.lang.Class r7 = r7.getResourceClass()     // Catch: java.lang.Throwable -> L29
            java.lang.Class<R> r8 = r15.transcodeClass     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.Priority r9 = r15.priority     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.BaseRequestOptions<?> r10 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.engine.DiskCacheStrategy r10 = r10.getDiskCacheStrategy()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.BaseRequestOptions<?> r11 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            java.util.Map r11 = r11.getTransformations()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.BaseRequestOptions<?> r12 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            boolean r12 = r12.isTransformationRequired()     // Catch: java.lang.Throwable -> L29
            r16 = r13
            com.bumptech.glide.request.BaseRequestOptions<?> r13 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            boolean r13 = r13.isScaleOnlyOrNoTransform()     // Catch: java.lang.Throwable -> L29
            r21 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.Options r0 = r0.getOptions()     // Catch: java.lang.Throwable -> L29
            r25 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.isMemoryCacheable()     // Catch: java.lang.Throwable -> L29
            r26 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.getUseUnlimitedSourceGeneratorsPool()     // Catch: java.lang.Throwable -> L29
            r17 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.getUseAnimationPool()     // Catch: java.lang.Throwable -> L29
            r18 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.getOnlyRetrieveFromCache()     // Catch: java.lang.Throwable -> L29
            r19 = r0
            java.util.concurrent.Executor r0 = r15.callbackExecutor     // Catch: java.lang.Throwable -> L29
            r22 = r16
            r23 = r14
            r14 = r25
            r15 = r26
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r24
            r20 = r0
            com.bumptech.glide.load.engine.Engine$LoadStatus r0 = r1.load(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L111
            r1 = r24
            r1.loadStatus = r0     // Catch: java.lang.Throwable -> Lf1
            com.bumptech.glide.request.SingleRequest$Status r0 = r1.status     // Catch: java.lang.Throwable -> Lf1
            r2 = r22
            if (r0 == r2) goto Lf3
            r0 = 0
            r1.loadStatus = r0     // Catch: java.lang.Throwable -> Lf1
            goto Lf3
        Lf1:
            r0 = move-exception
            goto L114
        Lf3:
            if (r21 == 0) goto L10f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r0.<init>()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf1
            long r2 = r1.startTime     // Catch: java.lang.Throwable -> Lf1
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> Lf1
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf1
            r1.logV(r0)     // Catch: java.lang.Throwable -> Lf1
        L10f:
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lf1
            return
        L111:
            r0 = move-exception
            r1 = r24
        L114:
            monitor-exit(r23)     // Catch: java.lang.Throwable -> Lf1
            throw r0
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.isRunning()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            r2.clear()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.Object r0 = r4.requestLock
            monitor-enter(r0)
            java.lang.Object r1 = r4.model     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<R> r2 = r4.transcodeClass     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = super.toString()
            r0.append(r3)
            java.lang.String r3 = "[model="
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", transcodeClass="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
    }
}
