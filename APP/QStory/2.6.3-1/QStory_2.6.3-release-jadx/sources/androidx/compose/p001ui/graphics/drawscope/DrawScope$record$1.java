package androidx.compose.p001ui.graphics.drawscope;

import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class DrawScope$record$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7387 $block;
    final /* synthetic */ InterfaceC2339 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawScope$record$1(InterfaceC2339 interfaceC2339, InterfaceC7387 interfaceC7387) {
        super(1);
        this.this$0 = interfaceC2339;
        this.$block = interfaceC7387;
    }

    public final void invoke(InterfaceC2339 interfaceC2339) {
        InterfaceC2339 interfaceC23392 = this.this$0;
        InterfaceC8725 interfaceC8725M949 = interfaceC2339.mo3266().m949();
        LayoutDirection layoutDirectionM930 = interfaceC2339.mo3266().m930();
        InterfaceC2436 interfaceC2436M946 = interfaceC2339.mo3266().m946();
        long jM928 = interfaceC2339.mo3266().m928();
        C2351 c2351 = (C2351) interfaceC2339.mo3266().f665;
        InterfaceC7387 interfaceC7387 = this.$block;
        InterfaceC8725 interfaceC8725M9492 = interfaceC23392.mo3266().m949();
        LayoutDirection layoutDirectionM9302 = interfaceC23392.mo3266().m930();
        InterfaceC2436 interfaceC2436M9462 = interfaceC23392.mo3266().m946();
        long jM9282 = interfaceC23392.mo3266().m928();
        C2351 c23512 = (C2351) interfaceC23392.mo3266().f665;
        C0955 c0955Mo3266 = interfaceC23392.mo3266();
        c0955Mo3266.m924(interfaceC8725M949);
        c0955Mo3266.m920(layoutDirectionM930);
        c0955Mo3266.m925(interfaceC2436M946);
        c0955Mo3266.m921(jM928);
        c0955Mo3266.f665 = c2351;
        interfaceC2436M946.mo3237();
        try {
            interfaceC7387.invoke(interfaceC23392);
        } finally {
            interfaceC2436M946.mo3249();
            C0955 c0955Mo32662 = interfaceC23392.mo3266();
            c0955Mo32662.m924(interfaceC8725M9492);
            c0955Mo32662.m920(layoutDirectionM9302);
            c0955Mo32662.m925(interfaceC2436M9462);
            c0955Mo32662.m921(jM9282);
            c0955Mo32662.f665 = c23512;
        }
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2339) obj);
        return C6008.f15084;
    }
}
