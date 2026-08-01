package androidx.compose.animation;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1659;
import androidx.compose.ui.layout.InterfaceC1686;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p112.C7329;
import p205.C7898;
import p253.AbstractC8190;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/飘花落叶言子楪世哲兰苏;", "Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;", "m", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "c", "Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/飘花落叶言子楪世哲兰苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedTransitionScope$skipToLookaheadPosition$4 extends Lambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6543 $enabled;
    final /* synthetic */ InterfaceC0427 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$4(InterfaceC6543 interfaceC6543, InterfaceC0427 interfaceC0427) {
        super(3);
        this.$enabled = interfaceC6543;
        this.this$0 = interfaceC0427;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m918invoke3p2s80s((InterfaceC1686) obj, (InterfaceC1655) obj2, ((C7898) obj3).f21865);
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1657 m918invoke3p2s80s(InterfaceC1686 interfaceC1686, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        final InterfaceC6543 interfaceC6543 = this.$enabled;
        final InterfaceC0427 interfaceC0427 = this.this$0;
        return interfaceC1686.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.animation.SharedTransitionScope$skipToLookaheadPosition$4$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                if (!((Boolean) interfaceC6543.invoke()).booleanValue()) {
                    abstractC1708.m3135(abstractC1724Mo3055, 0, 0, 0.0f);
                    return;
                }
                InterfaceC1695 interfaceC1695Mo3092 = abstractC1708.mo3092();
                if (interfaceC1695Mo3092 == null) {
                    abstractC1708.m3135(abstractC1724Mo3055, 0, 0, 0.0f);
                    return;
                }
                InterfaceC0427 interfaceC04272 = interfaceC0427;
                AbstractC1724 abstractC1724 = abstractC1724Mo3055;
                long jMo1124 = ((C0425) interfaceC04272).mo1124(((C0425) interfaceC04272).f1387.mo1121(abstractC1708), interfaceC1695Mo3092);
                InterfaceC1659 interfaceC1659 = ((C0425) interfaceC04272).f1387;
                AbstractC1708.m3134(abstractC1708, abstractC1724, AbstractC8190.m13681(C7329.m12526(interfaceC1695Mo3092.mo3081(interfaceC1659.mo1121(abstractC1708), C7329.m12526(jMo1124, interfaceC1659.mo1121(abstractC1708).mo3085(interfaceC1695Mo3092, 0L))), interfaceC1695Mo3092.mo3085(interfaceC1659.mo1121(abstractC1708), 0L))));
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }
        });
    }
}
