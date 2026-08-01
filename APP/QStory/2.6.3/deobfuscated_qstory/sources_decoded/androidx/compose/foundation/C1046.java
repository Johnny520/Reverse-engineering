package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1958;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.InterfaceC5088;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1046 extends AbstractC2128 implements InterfaceC1773, InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1040 f3087;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3088;

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        AbstractC1946.m3643(interfaceC1944);
        final int i = 0;
        final int i2 = 1;
        C1958 c1958 = new C1958(new InterfaceC6543(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪苏兰世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1046 f3095;

            {
                this.f3095 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int iM1945;
                int i3 = i;
                C1046 c1046 = this.f3095;
                switch (i3) {
                    case 0:
                        iM1945 = c1046.f3087.m1945();
                        break;
                    default:
                        iM1945 = ((AbstractC1346) c1046.f3087.f3057).m2432();
                        break;
                }
                return Float.valueOf(iM1945);
            }
        }, new InterfaceC6543(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪苏兰世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1046 f3095;

            {
                this.f3095 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int iM1945;
                int i3 = i2;
                C1046 c1046 = this.f3095;
                switch (i3) {
                    case 0:
                        iM1945 = c1046.f3087.m1945();
                        break;
                    default:
                        iM1945 = ((AbstractC1346) c1046.f3087.f3057).m2432();
                        break;
                }
                return Float.valueOf(iM1945);
            }
        });
        if (this.f3088) {
            C1947 c1947 = AbstractC1943.f5737;
            InterfaceC5088 interfaceC5088 = AbstractC1946.f5755[13];
            c1947.getClass();
            interfaceC1944.mo3590(c1947, c1958);
            return;
        }
        C1947 c19472 = AbstractC1943.f5740;
        InterfaceC5088 interfaceC50882 = AbstractC1946.f5755[12];
        c19472.getClass();
        interfaceC1944.mo3590(c19472, c1958);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!this.f3088) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3057(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (this.f3088) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3058(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!this.f3088) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3054(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1077(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (this.f3088) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3059(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        AbstractC1072.m1979(j, this.f3088 ? Orientation.Vertical : Orientation.Horizontal);
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(C7898.m13336(0, this.f3088 ? C7898.m13337(j) : Integer.MAX_VALUE, 0, this.f3088 ? Integer.MAX_VALUE : C7898.m13338(j), 5, j));
        int i = abstractC1724Mo3055.f4999;
        int iM13337 = C7898.m13337(j);
        if (i > iM13337) {
            i = iM13337;
        }
        int i2 = abstractC1724Mo3055.f4997;
        int iM13338 = C7898.m13338(j);
        if (i2 > iM13338) {
            i2 = iM13338;
        }
        int i3 = abstractC1724Mo3055.f4997 - i2;
        int i4 = abstractC1724Mo3055.f4999 - i;
        if (!this.f3088) {
            i3 = i4;
        }
        C1040 c1040 = this.f3087;
        ((AbstractC1346) c1040.f3057).m2433(i3);
        AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
        InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
        AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
        try {
            if (c1040.m1945() > i3) {
                ((AbstractC1346) c1040.f3061).m2433(i3);
            }
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
            ((AbstractC1346) this.f3087.f3060).m2433(this.f3088 ? i2 : i);
            ((AbstractC1346) this.f3087.f3059).m2433(this.f3088 ? abstractC1724Mo3055.f4997 : abstractC1724Mo3055.f4999);
            return interfaceC1653.mo1495(i, i2, AbstractC4339.m8776(), new C1048(i3, 0, this, abstractC1724Mo3055));
        } catch (Throwable th) {
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
            throw th;
        }
    }
}
