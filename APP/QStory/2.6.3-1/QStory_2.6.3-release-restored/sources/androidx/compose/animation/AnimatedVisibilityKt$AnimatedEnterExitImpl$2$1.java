package androidx.compose.animation;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p221.C8727;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;", "measurable", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "constraints", "Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends Lambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC1226 $onLookaheadMeasured;

    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(InterfaceC1226 interfaceC1226) {
        super(3);
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1453invoke3p2s80s((InterfaceC2488) obj, (InterfaceC2490) obj2, ((C8727) obj3).f22210);
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC2492 m1453invoke3p2s80s(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        boolean zMo2057 = interfaceC2488.mo2057();
        int i = abstractC2559Mo3615.f5344;
        if (zMo2057) {
            throw null;
        }
        return interfaceC2488.mo2055(i, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                abstractC2543.m3695(abstractC2559Mo3615, 0, 0, 0.0f);
            }
        });
    }
}
