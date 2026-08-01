package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.C6181;
import p111.AbstractRunnableC8041;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6228 extends AbstractRunnableC8041 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15376;

    public AbstractC6228(int i) {
        super(0L, false);
        this.f15376 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC5189 interfaceC5189Mo10904 = mo10904();
            interfaceC5189Mo10904.getClass();
            C6181 c6181 = (C6181) interfaceC5189Mo10904;
            ContinuationImpl continuationImpl = c6181.f15261;
            Object obj = c6181.f15264;
            InterfaceC5192 context = continuationImpl.getContext();
            Object objM10927 = AbstractC6185.m10927(context, obj);
            InterfaceC6284 interfaceC6284 = null;
            C6247 c6247M11030 = objM10927 != AbstractC6185.f15273 ? AbstractC6231.m11030(continuationImpl, context, objM10927) : null;
            try {
                InterfaceC5192 context2 = continuationImpl.getContext();
                Object objMo10910 = mo10910();
                Throwable thMo11023 = mo11023(objMo10910);
                if (thMo11023 == null) {
                    int i = this.f15376;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC6284 = (InterfaceC6284) context2.get(C6285.f15450);
                    }
                }
                if (interfaceC6284 != null && !interfaceC6284.mo11121()) {
                    CancellationException cancellationExceptionMo11122 = interfaceC6284.mo11122();
                    mo11024(cancellationExceptionMo11122);
                    continuationImpl.resumeWith(Result.m9304constructorimpl(AbstractC6017.m10770(cancellationExceptionMo11122)));
                } else if (thMo11023 != null) {
                    continuationImpl.resumeWith(Result.m9304constructorimpl(new Result.Failure(thMo11023)));
                } else {
                    continuationImpl.resumeWith(Result.m9304constructorimpl(mo11026(objMo10910)));
                }
                if (c6247M11030 == null || c6247M11030.m11076()) {
                    AbstractC6185.m10930(context, objM10927);
                }
            } catch (Throwable th) {
                if (c6247M11030 == null || c6247M11030.m11076()) {
                    AbstractC6185.m10930(context, objM10927);
                }
                throw th;
            }
        } catch (DispatchException e) {
            AbstractC6231.m11055(mo10904().getContext(), e.getCause());
        } catch (Throwable th2) {
            m11025(th2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Throwable mo11023(Object obj) {
        C6262 c6262 = obj instanceof C6262 ? (C6262) obj : null;
        if (c6262 != null) {
            return c6262.f15420;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract InterfaceC5189 mo10904();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11025(Throwable th) {
        AbstractC6231.m11055(mo10904().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract Object mo10910();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo11024(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object mo11026(Object obj) {
        return obj;
    }
}
