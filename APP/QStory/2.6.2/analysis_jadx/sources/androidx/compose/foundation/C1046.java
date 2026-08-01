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
import kotlin.collections.AbstractC4338;
import kotlin.reflect.InterfaceC5087;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1046 extends AbstractC2128 implements InterfaceC1773, InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1040 f3086;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3087;

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        AbstractC1946.m3633(interfaceC1944);
        final int i = 0;
        final int i2 = 1;
        C1958 c1958 = new C1958(new InterfaceC6542(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪苏兰世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1046 f3094;

            {
                this.f3094 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int iM1935;
                int i3 = i;
                C1046 c1046 = this.f3094;
                switch (i3) {
                    case 0:
                        iM1935 = c1046.f3086.m1935();
                        break;
                    default:
                        iM1935 = ((AbstractC1346) c1046.f3086.f3056).m2422();
                        break;
                }
                return Float.valueOf(iM1935);
            }
        }, new InterfaceC6542(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪苏兰世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1046 f3094;

            {
                this.f3094 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int iM1935;
                int i3 = i2;
                C1046 c1046 = this.f3094;
                switch (i3) {
                    case 0:
                        iM1935 = c1046.f3086.m1935();
                        break;
                    default:
                        iM1935 = ((AbstractC1346) c1046.f3086.f3056).m2422();
                        break;
                }
                return Float.valueOf(iM1935);
            }
        });
        if (this.f3087) {
            C1947 c1947 = AbstractC1943.f5736;
            InterfaceC5087 interfaceC5087 = AbstractC1946.f5754[13];
            c1947.getClass();
            interfaceC1944.mo3580(c1947, c1958);
            return;
        }
        C1947 c19472 = AbstractC1943.f5739;
        InterfaceC5087 interfaceC50872 = AbstractC1946.f5754[12];
        c19472.getClass();
        interfaceC1944.mo3580(c19472, c1958);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1073(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!this.f3087) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3047(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (this.f3087) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3048(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!this.f3087) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3044(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (this.f3087) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1698.mo3049(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        AbstractC1072.m1969(j, this.f3087 ? Orientation.Vertical : Orientation.Horizontal);
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(C7897.m13308(0, this.f3087 ? C7897.m13309(j) : Integer.MAX_VALUE, 0, this.f3087 ? Integer.MAX_VALUE : C7897.m13310(j), 5, j));
        int i = abstractC1724Mo3045.f4998;
        int iM13309 = C7897.m13309(j);
        if (i > iM13309) {
            i = iM13309;
        }
        int i2 = abstractC1724Mo3045.f4996;
        int iM13310 = C7897.m13310(j);
        if (i2 > iM13310) {
            i2 = iM13310;
        }
        int i3 = abstractC1724Mo3045.f4996 - i2;
        int i4 = abstractC1724Mo3045.f4998 - i;
        if (!this.f3087) {
            i3 = i4;
        }
        C1040 c1040 = this.f3086;
        ((AbstractC1346) c1040.f3056).m2423(i3);
        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
        try {
            if (c1040.m1935() > i3) {
                ((AbstractC1346) c1040.f3060).m2423(i3);
            }
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            ((AbstractC1346) this.f3086.f3059).m2423(this.f3087 ? i2 : i);
            ((AbstractC1346) this.f3086.f3058).m2423(this.f3087 ? abstractC1724Mo3045.f4996 : abstractC1724Mo3045.f4998);
            return interfaceC1653.mo1485(i, i2, AbstractC4338.m8781(), new C1048(i3, 0, this, abstractC1724Mo3045));
        } catch (Throwable th) {
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            throw th;
        }
    }
}
