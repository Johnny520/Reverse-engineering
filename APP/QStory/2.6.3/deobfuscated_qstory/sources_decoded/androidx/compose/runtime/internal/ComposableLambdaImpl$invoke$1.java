package androidx.compose.runtime.internal;

import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ComposableLambdaImpl$invoke$1 extends AdaptedFunctionReference implements InterfaceC6554 {
    public ComposableLambdaImpl$invoke$1(Object obj) {
        super(2, obj, C1242.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        ((C1242) this.receiver).m2147(interfaceC1373, i);
    }
}
