package androidx.compose.runtime.internal;

import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ComposableLambdaImpl$invoke$1 extends AdaptedFunctionReference implements InterfaceC6553 {
    public ComposableLambdaImpl$invoke$1(Object obj) {
        super(2, obj, C1242.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        ((C1242) this.receiver).m2137(interfaceC1373, i);
    }
}
