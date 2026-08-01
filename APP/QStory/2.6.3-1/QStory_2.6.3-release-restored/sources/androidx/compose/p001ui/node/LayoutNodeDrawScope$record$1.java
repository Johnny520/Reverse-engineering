package androidx.compose.p001ui.node;

import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
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
final class LayoutNodeDrawScope$record$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7387 $block;
    final /* synthetic */ InterfaceC2616 $currentDrawNode;
    final /* synthetic */ C2593 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeDrawScope$record$1(C2593 c2593, InterfaceC2616 interfaceC2616, InterfaceC7387 interfaceC7387) {
        super(1);
        this.this$0 = c2593;
        this.$currentDrawNode = interfaceC2616;
        this.$block = interfaceC7387;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.node.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.node.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.appcompat.app.飘花落叶言子苏楪世兰哲] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final void invoke(InterfaceC2339 interfaceC2339) throws Throwable {
        C2593 c2593 = this.this$0;
        ?? Mo3266 = c2593.f5520;
        c2593.f5520 = this.$currentDrawNode;
        try {
            InterfaceC8725 interfaceC8725M949 = interfaceC2339.mo3266().m949();
            LayoutDirection layoutDirectionM930 = interfaceC2339.mo3266().m930();
            InterfaceC2436 interfaceC2436M946 = interfaceC2339.mo3266().m946();
            long jM928 = interfaceC2339.mo3266().m928();
            C2351 c2351 = (C2351) interfaceC2339.mo3266().f665;
            InterfaceC7387 interfaceC7387 = this.$block;
            InterfaceC8725 interfaceC8725M9492 = c2593.mo3266().m949();
            LayoutDirection layoutDirectionM9302 = c2593.mo3266().m930();
            InterfaceC2436 interfaceC2436M9462 = c2593.mo3266().m946();
            long jM9282 = c2593.mo3266().m928();
            C2351 c23512 = (C2351) c2593.mo3266().f665;
            try {
                Mo3266 = c2593.mo3266();
                Mo3266.m924(interfaceC8725M949);
                Mo3266.m920(layoutDirectionM930);
                Mo3266.m925(interfaceC2436M946);
                Mo3266.m921(jM928);
                Mo3266.f665 = c2351;
                interfaceC2436M946.mo3237();
                try {
                    interfaceC7387.invoke(c2593);
                    interfaceC2436M946.mo3249();
                    C0955 c0955Mo3266 = c2593.mo3266();
                    c0955Mo3266.m924(interfaceC8725M9492);
                    c0955Mo3266.m920(layoutDirectionM9302);
                    c0955Mo3266.m925(interfaceC2436M9462);
                    c0955Mo3266.m921(jM9282);
                    c0955Mo3266.f665 = c23512;
                    this.this$0.f5520 = Mo3266;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                Mo3266 = Mo3266;
                this.this$0.f5520 = Mo3266;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.this$0.f5520 = Mo3266;
            throw th;
        }
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
        invoke((InterfaceC2339) obj);
        return C6008.f15084;
    }
}
