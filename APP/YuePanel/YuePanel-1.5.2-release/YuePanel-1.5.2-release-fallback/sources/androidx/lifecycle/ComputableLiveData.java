package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H%¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u0012\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "LYue/ۥۣۢ۠ۤ;", "invalidate", "()V", "compute", "()Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", "_liveData", "Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing$lifecycle_livedata_release", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
public abstract class ComputableLiveData<T> {

    @Yue.InterfaceC4418
    private final androidx.lifecycle.LiveData<T> _liveData;

    @Yue.InterfaceC4418
    private final java.util.concurrent.atomic.AtomicBoolean computing;

    @Yue.InterfaceC4418
    private final java.util.concurrent.Executor executor;

    @Yue.InterfaceC4418
    private final java.util.concurrent.atomic.AtomicBoolean invalid;

    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final java.lang.Runnable invalidationRunnable;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.LiveData<T> liveData;

    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final java.lang.Runnable refreshRunnable;

    @Yue.InterfaceC3422
    public ComputableLiveData() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    @Yue.InterfaceC3422
    public ComputableLiveData(@Yue.InterfaceC4418 java.util.concurrent.Executor r2) {
            r1 = this;
            java.lang.String r0 = "executor"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.executor = r2
            androidx.lifecycle.ComputableLiveData$_liveData$1 r2 = new androidx.lifecycle.ComputableLiveData$_liveData$1
            r2.<init>(r1)
            r1._liveData = r2
            r1.liveData = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r2.<init>(r0)
            r1.invalid = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.computing = r2
            Yue.ۥ۟ۦۥ۠ r2 = new Yue.ۥ۟ۦۥ۠
            r2.<init>(r1)
            r1.refreshRunnable = r2
            Yue.ۥ۟ۦۥۡ r2 = new Yue.ۥ۟ۦۥۡ
            r2.<init>(r1)
            r1.invalidationRunnable = r2
            return
    }

    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, Yue.C1769 r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = Yue.C0551.m1941()
            java.lang.String r2 = "getIOThreadExecutor()"
            Yue.C3329.m13905(r1, r2)
        Ld:
            r0.<init>(r1)
            return
    }

    @Yue.InterfaceC6959
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
            return
    }

    @Yue.InterfaceC6959
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
            return
    }

    private static final void invalidationRunnable$lambda$1(androidx.lifecycle.ComputableLiveData r4) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r4, r0)
            androidx.lifecycle.LiveData r0 = r4.getLiveData()
            boolean r0 = r0.hasActiveObservers()
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.invalid
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L20
            if (r0 == 0) goto L20
            java.util.concurrent.Executor r0 = r4.executor
            java.lang.Runnable r4 = r4.refreshRunnable
            r0.execute(r4)
        L20:
            return
    }

    private static final void refreshRunnable$lambda$0(androidx.lifecycle.ComputableLiveData r5) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r5, r0)
        L5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L37
            r0 = 0
            r3 = r1
        L11:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.invalid     // Catch: java.lang.Throwable -> L1f
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L21
            java.lang.Object r0 = r5.compute()     // Catch: java.lang.Throwable -> L1f
            r3 = r2
            goto L11
        L1f:
            r0 = move-exception
            goto L31
        L21:
            if (r3 == 0) goto L2a
            androidx.lifecycle.LiveData r2 = r5.getLiveData()     // Catch: java.lang.Throwable -> L1f
            r2.postValue(r0)     // Catch: java.lang.Throwable -> L1f
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r0.set(r1)
            r1 = r3
            goto L37
        L31:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.computing
            r5.set(r1)
            throw r0
        L37:
            if (r1 == 0) goto L41
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.invalid
            boolean r0 = r0.get()
            if (r0 != 0) goto L5
        L41:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29512(androidx.lifecycle.ComputableLiveData r0) {
            refreshRunnable$lambda$0(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m29513(androidx.lifecycle.ComputableLiveData r0) {
            invalidationRunnable$lambda$1(r0)
            return
    }

    @Yue.InterfaceC7131
    public abstract T compute();

    @Yue.InterfaceC4418
    public final java.util.concurrent.atomic.AtomicBoolean getComputing$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.computing
            return r0
    }

    @Yue.InterfaceC4418
    public final java.util.concurrent.Executor getExecutor$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            return r0
    }

    @Yue.InterfaceC4418
    public final java.util.concurrent.atomic.AtomicBoolean getInvalid$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.invalid
            return r0
    }

    @Yue.InterfaceC4418
    public androidx.lifecycle.LiveData<T> getLiveData() {
            r1 = this;
            androidx.lifecycle.LiveData<T> r0 = r1.liveData
            return r0
    }

    public void invalidate() {
            r2 = this;
            Yue.ۥ۟ۡۦۤ r0 = Yue.C0551.m1942()
            java.lang.Runnable r1 = r2.invalidationRunnable
            r0.m22934(r1)
            return
    }
}
