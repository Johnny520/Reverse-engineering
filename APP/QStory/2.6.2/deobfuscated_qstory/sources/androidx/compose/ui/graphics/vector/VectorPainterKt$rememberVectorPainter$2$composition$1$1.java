package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6551;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class VectorPainterKt$rememberVectorPainter$2$composition$1$1 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6551 $content;
    final /* synthetic */ long $viewport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$2$composition$1$1(InterfaceC6551 interfaceC6551, long j) {
        super(2);
        this.$content = interfaceC6551;
        this.$viewport = j;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2333(i & 1, (i & 3) != 2)) {
            this.$content.invoke(Float.valueOf(Float.intBitsToFloat((int) (this.$viewport >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.$viewport & 4294967295L))), c1324, 0);
        } else {
            c1324.m2329();
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
