package androidx.compose.animation;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p205.C7897;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;", "measurable", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "constraints", "Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends Lambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC0380 $onLookaheadMeasured;

    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(InterfaceC0380 interfaceC0380) {
        super(3);
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m892invoke3p2s80s((InterfaceC1653) obj, (InterfaceC1655) obj2, ((C7897) obj3).f21868);
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1657 m892invoke3p2s80s(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        boolean zMo1487 = interfaceC1653.mo1487();
        int i = abstractC1724Mo3045.f4998;
        if (zMo1487) {
            throw null;
        }
        return interfaceC1653.mo1485(i, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                abstractC1708.m3125(abstractC1724Mo3045, 0, 0, 0.0f);
            }
        });
    }
}
