package android.view;

import Yue.C3375;
import Yue.C4335;
import Yue.C4750;
import Yue.C5499;
import Yue.InterfaceC5568;
import Yue.InterfaceC5573;
import Yue.InterfaceC6399;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import Yue.InterfaceC8532;
import android.view.ComputableLiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H%¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u0012\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", C4750.f10502, "", "Ljava/util/concurrent/Executor;", "executor", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/concurrent/Executor;)V", "LYue/ۥۣۢ۠ۤ;", "invalidate", "()V", "compute", "()Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", "_liveData", "Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing$lifecycle_livedata_release", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
public abstract class ComputableLiveData<T> {

    @InterfaceC6399
    private final LiveData<T> _liveData;

    @InterfaceC6399
    private final AtomicBoolean computing;

    @InterfaceC6399
    private final Executor executor;

    @InterfaceC6399
    private final AtomicBoolean invalid;

    @InterfaceC6399
    @InterfaceC5568
    public final Runnable invalidationRunnable;

    @InterfaceC6399
    private final LiveData<T> liveData;

    @InterfaceC6399
    @InterfaceC5568
    public final Runnable refreshRunnable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5573
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC8392
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @InterfaceC8392
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData computableLiveData) {
        C5499.m17103(computableLiveData, "this$0");
        boolean zHasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: androidx.lifecycle.LiveData */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        C5499.m17103(computableLiveData, "this$0");
        do {
            boolean z = false;
            if (computableLiveData.computing.compareAndSet(false, true)) {
                Object objCompute = null;
                boolean z2 = false;
                while (computableLiveData.invalid.compareAndSet(true, false)) {
                    try {
                        objCompute = computableLiveData.compute();
                        z2 = true;
                    } catch (Throwable th) {
                        computableLiveData.computing.set(false);
                        throw th;
                    }
                }
                if (z2) {
                    computableLiveData.getLiveData().postValue(objCompute);
                }
                computableLiveData.computing.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (computableLiveData.invalid.get());
    }

    @InterfaceC8532
    public abstract T compute();

    @InterfaceC6399
    /* JADX INFO: renamed from: getComputing$lifecycle_livedata_release, reason: from getter */
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: getExecutor$lifecycle_livedata_release, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: getInvalid$lifecycle_livedata_release, reason: from getter */
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @InterfaceC6399
    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        C3375.m6925().m3822(this.invalidationRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC5573
    public ComputableLiveData(@InterfaceC6399 Executor executor) {
        C5499.m17103(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.LiveData
            public void onActive() {
                this.this$0.getExecutor().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: Yue.ۥ۟ۦۥ۠
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(this.f8128);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: Yue.ۥ۟ۦۥۡ
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$1(this.f8129);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComputableLiveData(Executor executor, int i, C4335 c4335) {
        if ((i & 1) != 0) {
            executor = C3375.m6924();
            C5499.m17102(executor, "getIOThreadExecutor()");
        }
        this(executor);
    }
}
