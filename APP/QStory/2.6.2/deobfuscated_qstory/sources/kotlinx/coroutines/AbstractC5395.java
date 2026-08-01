package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.C5348;
import p095.AbstractRunnableC7211;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5395 extends AbstractRunnableC7211 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15031;

    public AbstractC5395(int i) {
        super(0L, false);
        this.f15031 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC4356 interfaceC4356Mo10341 = mo10341();
            interfaceC4356Mo10341.getClass();
            C5348 c5348 = (C5348) interfaceC4356Mo10341;
            ContinuationImpl continuationImpl = c5348.f14916;
            Object obj = c5348.f14919;
            InterfaceC4359 context = continuationImpl.getContext();
            Object objM10364 = AbstractC5352.m10364(context, obj);
            InterfaceC5451 interfaceC5451 = null;
            C5414 c5414M10467 = objM10364 != AbstractC5352.f14928 ? AbstractC5398.m10467(continuationImpl, context, objM10364) : null;
            try {
                InterfaceC4359 context2 = continuationImpl.getContext();
                Object objMo10347 = mo10347();
                Throwable thMo10460 = mo10460(objMo10347);
                if (thMo10460 == null) {
                    int i = this.f15031;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC5451 = (InterfaceC5451) context2.get(C5452.f15105);
                    }
                }
                if (interfaceC5451 != null && !interfaceC5451.mo10557()) {
                    CancellationException cancellationExceptionMo10559 = interfaceC5451.mo10559();
                    mo10461(cancellationExceptionMo10559);
                    continuationImpl.resumeWith(Result.m8755constructorimpl(AbstractC5184.m10207(cancellationExceptionMo10559)));
                } else if (thMo10460 != null) {
                    continuationImpl.resumeWith(Result.m8755constructorimpl(new Result.Failure(thMo10460)));
                } else {
                    continuationImpl.resumeWith(Result.m8755constructorimpl(mo10463(objMo10347)));
                }
                if (c5414M10467 == null || c5414M10467.m10513()) {
                    AbstractC5352.m10367(context, objM10364);
                }
            } catch (Throwable th) {
                if (c5414M10467 == null || c5414M10467.m10513()) {
                    AbstractC5352.m10367(context, objM10364);
                }
                throw th;
            }
        } catch (DispatchException e) {
            AbstractC5398.m10492(mo10341().getContext(), e.getCause());
        } catch (Throwable th2) {
            m10462(th2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Throwable mo10460(Object obj) {
        C5429 c5429 = obj instanceof C5429 ? (C5429) obj : null;
        if (c5429 != null) {
            return c5429.f15075;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract InterfaceC4356 mo10341();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m10462(Throwable th) {
        AbstractC5398.m10492(mo10341().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract Object mo10347();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo10461(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object mo10463(Object obj) {
        return obj;
    }
}
