package androidx.compose.ui.graphics;

import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1605 extends AbstractC2128 implements InterfaceC1773, InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6557 f4704;

    public C1605(InterfaceC6557 interfaceC6557) {
        this.f4704 = interfaceC6557;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f4704 + ')';
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        InterfaceC1569 interfaceC1569;
        boolean z;
        AbstractC1794 abstractC1794M3338 = AbstractC1785.m3338(this, 2);
        if (abstractC1794M3338.f5261) {
            interfaceC1569 = abstractC1794M3338.f5241;
            z = abstractC1794M3338.f5242;
        } else {
            C1573 c1573 = AbstractC1581.f4662;
            if (c1573 == null) {
                AbstractC1581.f4662 = new C1573();
            } else {
                c1573.m2846();
            }
            C1573 c15732 = AbstractC1581.f4662;
            c15732.getClass();
            c15732.f4642 = abstractC1794M3338.f5258.f5098;
            c15732.f4643 = AbstractC8189.m13654(abstractC1794M3338.f4997);
            AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
            InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            try {
                this.f4704.invoke(c15732);
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                interfaceC1569 = c15732.f4633;
                z = c15732.f4632;
            } catch (Throwable th) {
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                throw th;
            }
        }
        if (z) {
            AbstractC1946.m3634(interfaceC1944, interfaceC1569);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                AbstractC1708.m3120(abstractC1708, abstractC1724Mo3045, 0, 0, this.f4704, 4);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo1964() {
        return false;
    }
}
