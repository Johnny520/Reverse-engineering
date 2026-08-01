package androidx.compose.ui.graphics;

import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1605 extends AbstractC2128 implements InterfaceC1773, InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f4705;

    public C1605(InterfaceC6558 interfaceC6558) {
        this.f4705 = interfaceC6558;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f4705 + ')';
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        InterfaceC1569 interfaceC1569;
        boolean z;
        AbstractC1794 abstractC1794M3348 = AbstractC1785.m3348(this, 2);
        if (abstractC1794M3348.f5262) {
            interfaceC1569 = abstractC1794M3348.f5242;
            z = abstractC1794M3348.f5243;
        } else {
            C1573 c1573 = AbstractC1581.f4663;
            if (c1573 == null) {
                AbstractC1581.f4663 = new C1573();
            } else {
                c1573.m2856();
            }
            C1573 c15732 = AbstractC1581.f4663;
            c15732.getClass();
            c15732.f4643 = abstractC1794M3348.f5259.f5099;
            c15732.f4644 = AbstractC0455.m1140(abstractC1794M3348.f4998);
            AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
            InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
            AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
            try {
                this.f4705.invoke(c15732);
                AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
                interfaceC1569 = c15732.f4634;
                z = c15732.f4633;
            } catch (Throwable th) {
                AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
                throw th;
            }
        }
        if (z) {
            AbstractC1946.m3644(interfaceC1944, interfaceC1569);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                AbstractC1708.m3130(abstractC1708, abstractC1724Mo3055, 0, 0, this.f4705, 4);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo1974() {
        return false;
    }
}
