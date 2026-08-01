package kotlinx.coroutines;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, AbstractC5449.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C5175.f14739;
    }

    public final void invoke(Throwable th) {
        ((AbstractC5449) this.receiver).mo10464(th);
    }
}
