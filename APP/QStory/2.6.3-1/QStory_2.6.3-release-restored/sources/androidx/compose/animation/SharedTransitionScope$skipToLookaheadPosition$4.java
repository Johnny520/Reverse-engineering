package androidx.compose.animation;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2494;
import androidx.compose.p001ui.layout.InterfaceC2521;
import androidx.compose.p001ui.layout.InterfaceC2530;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p128.C8158;
import p221.C8727;
import p269.AbstractC9019;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"Landroidx/compose/ui/layout/飘花落叶言子楪世哲兰苏;", "Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;", "m", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "c", "Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/飘花落叶言子楪世哲兰苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class SharedTransitionScope$skipToLookaheadPosition$4 extends Lambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7372 $enabled;
    final /* synthetic */ InterfaceC1273 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$4(InterfaceC7372 interfaceC7372, InterfaceC1273 interfaceC1273) {
        super(3);
        this.$enabled = interfaceC7372;
        this.this$0 = interfaceC1273;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1478invoke3p2s80s((InterfaceC2521) obj, (InterfaceC2490) obj2, ((C8727) obj3).f22210);
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC2492 m1478invoke3p2s80s(InterfaceC2521 interfaceC2521, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        final InterfaceC7372 interfaceC7372 = this.$enabled;
        final InterfaceC1273 interfaceC1273 = this.this$0;
        return interfaceC2521.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.SharedTransitionScope$skipToLookaheadPosition$4$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                if (!((Boolean) interfaceC7372.invoke()).booleanValue()) {
                    abstractC2543.m3695(abstractC2559Mo3615, 0, 0, 0.0f);
                    return;
                }
                InterfaceC2530 interfaceC2530Mo3652 = abstractC2543.mo3652();
                if (interfaceC2530Mo3652 == null) {
                    abstractC2543.m3695(abstractC2559Mo3615, 0, 0, 0.0f);
                    return;
                }
                InterfaceC1273 interfaceC12732 = interfaceC1273;
                AbstractC2559 abstractC2559 = abstractC2559Mo3615;
                long jMo1684 = ((C1271) interfaceC12732).mo1684(((C1271) interfaceC12732).f1732.mo1681(abstractC2543), interfaceC2530Mo3652);
                InterfaceC2494 interfaceC2494 = ((C1271) interfaceC12732).f1732;
                AbstractC2543.m3694(abstractC2543, abstractC2559, AbstractC9019.m14240(C8158.m13085(interfaceC2530Mo3652.mo3641(interfaceC2494.mo1681(abstractC2543), C8158.m13085(jMo1684, interfaceC2494.mo1681(abstractC2543).mo3645(interfaceC2530Mo3652, 0L))), interfaceC2530Mo3652.mo3645(interfaceC2494.mo1681(abstractC2543), 0L))));
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }
}
