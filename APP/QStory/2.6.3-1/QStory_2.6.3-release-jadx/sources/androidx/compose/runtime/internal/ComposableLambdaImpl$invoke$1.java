package androidx.compose.runtime.internal;

import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class ComposableLambdaImpl$invoke$1 extends AdaptedFunctionReference implements InterfaceC7383 {
    public ComposableLambdaImpl$invoke$1(Object obj) {
        super(2, obj, C2077.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        ((C2077) this.receiver).m2707(interfaceC2208, i);
    }
}
