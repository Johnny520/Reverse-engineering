package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.C5349;
import p095.AbstractRunnableC7212;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5396 extends AbstractRunnableC7212 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15031;

    public AbstractC5396(int i) {
        super(0L, false);
        this.f15031 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC4357 interfaceC4357Mo10345 = mo10345();
            interfaceC4357Mo10345.getClass();
            C5349 c5349 = (C5349) interfaceC4357Mo10345;
            ContinuationImpl continuationImpl = c5349.f14916;
            Object obj = c5349.f14919;
            InterfaceC4360 context = continuationImpl.getContext();
            Object objM10368 = AbstractC5353.m10368(context, obj);
            InterfaceC5452 interfaceC5452 = null;
            C5415 c5415M10471 = objM10368 != AbstractC5353.f14928 ? AbstractC5399.m10471(continuationImpl, context, objM10368) : null;
            try {
                InterfaceC4360 context2 = continuationImpl.getContext();
                Object objMo10351 = mo10351();
                Throwable thMo10464 = mo10464(objMo10351);
                if (thMo10464 == null) {
                    int i = this.f15031;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC5452 = (InterfaceC5452) context2.get(C5453.f15105);
                    }
                }
                if (interfaceC5452 != null && !interfaceC5452.mo10562()) {
                    CancellationException cancellationExceptionMo10563 = interfaceC5452.mo10563();
                    mo10465(cancellationExceptionMo10563);
                    continuationImpl.resumeWith(Result.m8745constructorimpl(AbstractC5185.m10211(cancellationExceptionMo10563)));
                } else if (thMo10464 != null) {
                    continuationImpl.resumeWith(Result.m8745constructorimpl(new Result.Failure(thMo10464)));
                } else {
                    continuationImpl.resumeWith(Result.m8745constructorimpl(mo10467(objMo10351)));
                }
                if (c5415M10471 == null || c5415M10471.m10517()) {
                    AbstractC5353.m10371(context, objM10368);
                }
            } catch (Throwable th) {
                if (c5415M10471 == null || c5415M10471.m10517()) {
                    AbstractC5353.m10371(context, objM10368);
                }
                throw th;
            }
        } catch (DispatchException e) {
            AbstractC5399.m10496(mo10345().getContext(), e.getCause());
        } catch (Throwable th2) {
            m10466(th2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Throwable mo10464(Object obj) {
        C5430 c5430 = obj instanceof C5430 ? (C5430) obj : null;
        if (c5430 != null) {
            return c5430.f15075;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract InterfaceC4357 mo10345();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m10466(Throwable th) {
        AbstractC5399.m10496(mo10345().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract Object mo10351();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo10465(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object mo10467(Object obj) {
        return obj;
    }
}
