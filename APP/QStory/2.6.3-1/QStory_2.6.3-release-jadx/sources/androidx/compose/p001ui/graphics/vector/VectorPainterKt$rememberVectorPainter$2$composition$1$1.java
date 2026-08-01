package androidx.compose.p001ui.graphics.vector;

import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7381;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class VectorPainterKt$rememberVectorPainter$2$composition$1$1 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7381 $content;
    final /* synthetic */ long $viewport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$2$composition$1$1(InterfaceC7381 interfaceC7381, long j) {
        super(2);
        this.$content = interfaceC7381;
        this.$viewport = j;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        if (c2159.m2903(i & 1, (i & 3) != 2)) {
            this.$content.invoke(Float.valueOf(Float.intBitsToFloat((int) (this.$viewport >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.$viewport & 4294967295L))), c2159, 0);
        } else {
            c2159.m2899();
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
