package androidx.compose.animation;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p205.C7898;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;", "measurable", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "constraints", "Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends Lambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC0380 $onLookaheadMeasured;

    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(InterfaceC0380 interfaceC0380) {
        super(3);
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m893invoke3p2s80s((InterfaceC1653) obj, (InterfaceC1655) obj2, ((C7898) obj3).f21865);
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1657 m893invoke3p2s80s(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        boolean zMo1497 = interfaceC1653.mo1497();
        int i = abstractC1724Mo3055.f4999;
        if (zMo1497) {
            throw null;
        }
        return interfaceC1653.mo1495(i, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                abstractC1708.m3135(abstractC1724Mo3055, 0, 0, 0.0f);
            }
        });
    }
}
