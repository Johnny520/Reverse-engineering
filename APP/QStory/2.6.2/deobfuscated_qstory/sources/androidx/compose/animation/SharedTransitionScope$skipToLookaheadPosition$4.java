package androidx.compose.animation;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1659;
import androidx.compose.ui.layout.InterfaceC1686;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p112.C7328;
import p175.AbstractC7738;
import p205.C7897;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/飘花落叶言子楪世哲兰苏;", "Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;", "m", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "c", "Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/飘花落叶言子楪世哲兰苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedTransitionScope$skipToLookaheadPosition$4 extends Lambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6542 $enabled;
    final /* synthetic */ InterfaceC0427 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$4(InterfaceC6542 interfaceC6542, InterfaceC0427 interfaceC0427) {
        super(3);
        this.$enabled = interfaceC6542;
        this.this$0 = interfaceC0427;
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m917invoke3p2s80s((InterfaceC1686) obj, (InterfaceC1655) obj2, ((C7897) obj3).f21868);
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1657 m917invoke3p2s80s(InterfaceC1686 interfaceC1686, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        final InterfaceC6542 interfaceC6542 = this.$enabled;
        final InterfaceC0427 interfaceC0427 = this.this$0;
        return interfaceC1686.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.animation.SharedTransitionScope$skipToLookaheadPosition$4$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                if (!((Boolean) interfaceC6542.invoke()).booleanValue()) {
                    abstractC1708.m3125(abstractC1724Mo3045, 0, 0, 0.0f);
                    return;
                }
                InterfaceC1695 interfaceC1695Mo3082 = abstractC1708.mo3082();
                if (interfaceC1695Mo3082 == null) {
                    abstractC1708.m3125(abstractC1724Mo3045, 0, 0, 0.0f);
                    return;
                }
                InterfaceC0427 interfaceC04272 = interfaceC0427;
                AbstractC1724 abstractC1724 = abstractC1724Mo3045;
                long jMo1123 = ((C0425) interfaceC04272).mo1123(((C0425) interfaceC04272).f1387.mo1120(abstractC1708), interfaceC1695Mo3082);
                InterfaceC1659 interfaceC1659 = ((C0425) interfaceC04272).f1387;
                AbstractC1708.m3124(abstractC1708, abstractC1724, AbstractC7738.m13022(C7328.m12499(interfaceC1695Mo3082.mo3071(interfaceC1659.mo1120(abstractC1708), C7328.m12499(jMo1123, interfaceC1659.mo1120(abstractC1708).mo3075(interfaceC1695Mo3082, 0L))), interfaceC1695Mo3082.mo3075(interfaceC1659.mo1120(abstractC1708), 0L))));
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }
        });
    }
}
