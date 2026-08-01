package androidx.compose.ui.node;

import androidx.activity.AbstractC0053;
import androidx.collection.AbstractC0234;
import androidx.collection.C0252;
import androidx.compose.ui.layout.C1663;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1745 extends AbstractC1754 implements InterfaceC1655 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C0252 f5057;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1657 f5058;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public LinkedHashMap f5060;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC1794 f5062;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public long f5061 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1663 f5059 = new C1663(this);

    public AbstractC1745(AbstractC1794 abstractC1794) {
        this.f5062 = abstractC1794;
        C0252 c0252 = AbstractC0234.f874;
        this.f5057 = new C0252();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static final void m3189(AbstractC1745 abstractC1745, InterfaceC1657 interfaceC1657) {
        LinkedHashMap linkedHashMap;
        if (interfaceC1657 != null) {
            abstractC1745.m3131((((long) interfaceC1657.mo1464()) & 4294967295L) | (((long) interfaceC1657.mo1463()) << 32));
        } else {
            abstractC1745.m3131(0L);
        }
        if (!AbstractC4394.m8917(abstractC1745.f5058, interfaceC1657) && interfaceC1657 != null && ((((linkedHashMap = abstractC1745.f5060) != null && !linkedHashMap.isEmpty()) || !interfaceC1657.mo1462().isEmpty()) && !AbstractC4394.m8917(interfaceC1657.mo1462(), abstractC1745.f5060))) {
            C1747 c1747 = abstractC1745.f5062.f5258.f5131.f5164;
            c1747.getClass();
            c1747.f5082.m3314();
            LinkedHashMap linkedHashMap2 = abstractC1745.f5060;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC1745.f5060 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC1657.mo1462());
        }
        abstractC1745.f5058 = interfaceC1657;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f5062.f5258.f5099;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724, androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3046() {
        return this.f5062.mo3046();
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final AbstractC1754 mo3190() {
        AbstractC1794 abstractC1794 = this.f5062.f5255;
        if (abstractC1794 != null) {
            return abstractC1794.mo3275();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final InterfaceC1657 mo3191() {
        InterfaceC1657 interfaceC1657 = this.f5058;
        if (interfaceC1657 != null) {
            return interfaceC1657;
        }
        throw AbstractC0053.m139("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final long mo3192() {
        return this.f5061;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final AbstractC1754 mo3193() {
        AbstractC1794 abstractC1794 = this.f5062.f5256;
        if (abstractC1794 != null) {
            return abstractC1794.mo3275();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final C1748 mo3194() {
        return this.f5062.f5258;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final InterfaceC1695 mo3195() {
        return this.f5059;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean mo3196() {
        return this.f5058 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public void mo3197() {
        mo3191().mo1461();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final long m3198() {
        return (((long) this.f4998) << 32) | (((long) this.f4996) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final long m3199(AbstractC1745 abstractC1745, boolean z) {
        long jM13334 = 0;
        while (!this.equals(abstractC1745)) {
            if (!this.f5149 || !z) {
                jM13334 = C7907.m13334(jM13334, this.f5061);
            }
            AbstractC1794 abstractC1794 = this.f5062.f5255;
            abstractC1794.getClass();
            this = abstractC1794.mo3275();
            this.getClass();
        }
        return jM13334;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void m3200(long j) {
        if (!C7907.m13336(this.f5061, j)) {
            this.f5061 = j;
            AbstractC1794 abstractC1794 = this.f5062;
            C1747 c1747 = abstractC1794.f5258.f5131.f5164;
            if (c1747 != null) {
                c1747.m3207();
            }
            AbstractC1754.m3278(abstractC1794);
        }
        if (this.f5146) {
            return;
        }
        m3283(mo3191());
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo3201() {
        mo3118(this.f5061, 0.0f, null);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f5062.mo1246();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f5062.mo1247();
    }

    @Override // androidx.compose.ui.node.AbstractC1754, androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1487() {
        return true;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3118(long j, float f, InterfaceC6557 interfaceC6557) {
        m3200(j);
        if (this.f5147) {
            return;
        }
        mo3197();
    }
}
