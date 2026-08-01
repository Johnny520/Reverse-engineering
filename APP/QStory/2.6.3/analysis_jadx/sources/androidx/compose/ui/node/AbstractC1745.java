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
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1745 extends AbstractC1754 implements InterfaceC1655 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C0252 f5058;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1657 f5059;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public LinkedHashMap f5061;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC1794 f5063;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public long f5062 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1663 f5060 = new C1663(this);

    public AbstractC1745(AbstractC1794 abstractC1794) {
        this.f5063 = abstractC1794;
        C0252 c0252 = AbstractC0234.f874;
        this.f5058 = new C0252();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static final void m3199(AbstractC1745 abstractC1745, InterfaceC1657 interfaceC1657) {
        LinkedHashMap linkedHashMap;
        if (interfaceC1657 != null) {
            abstractC1745.m3141((((long) interfaceC1657.mo1474()) & 4294967295L) | (((long) interfaceC1657.mo1473()) << 32));
        } else {
            abstractC1745.m3141(0L);
        }
        if (!AbstractC4395.m8907(abstractC1745.f5059, interfaceC1657) && interfaceC1657 != null && ((((linkedHashMap = abstractC1745.f5061) != null && !linkedHashMap.isEmpty()) || !interfaceC1657.mo1472().isEmpty()) && !AbstractC4395.m8907(interfaceC1657.mo1472(), abstractC1745.f5061))) {
            C1747 c1747 = abstractC1745.f5063.f5259.f5132.f5165;
            c1747.getClass();
            c1747.f5083.m3324();
            LinkedHashMap linkedHashMap2 = abstractC1745.f5061;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC1745.f5061 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC1657.mo1472());
        }
        abstractC1745.f5059 = interfaceC1657;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f5063.f5259.f5100;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724, androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Object mo3056() {
        return this.f5063.mo3056();
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final AbstractC1754 mo3200() {
        AbstractC1794 abstractC1794 = this.f5063.f5256;
        if (abstractC1794 != null) {
            return abstractC1794.mo3285();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final InterfaceC1657 mo3201() {
        InterfaceC1657 interfaceC1657 = this.f5059;
        if (interfaceC1657 != null) {
            return interfaceC1657;
        }
        throw AbstractC0053.m139("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final long mo3202() {
        return this.f5062;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final AbstractC1754 mo3203() {
        AbstractC1794 abstractC1794 = this.f5063.f5257;
        if (abstractC1794 != null) {
            return abstractC1794.mo3285();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final C1748 mo3204() {
        return this.f5063.f5259;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final InterfaceC1695 mo3205() {
        return this.f5060;
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean mo3206() {
        return this.f5059 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public void mo3207() {
        mo3201().mo1471();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final long m3208() {
        return (((long) this.f4999) << 32) | (((long) this.f4997) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final long m3209(AbstractC1745 abstractC1745, boolean z) {
        long jM13362 = 0;
        while (!this.equals(abstractC1745)) {
            if (!this.f5150 || !z) {
                jM13362 = C7908.m13362(jM13362, this.f5062);
            }
            AbstractC1794 abstractC1794 = this.f5063.f5256;
            abstractC1794.getClass();
            this = abstractC1794.mo3285();
            this.getClass();
        }
        return jM13362;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void m3210(long j) {
        if (!C7908.m13364(this.f5062, j)) {
            this.f5062 = j;
            AbstractC1794 abstractC1794 = this.f5063;
            C1747 c1747 = abstractC1794.f5259.f5132.f5165;
            if (c1747 != null) {
                c1747.m3217();
            }
            AbstractC1754.m3288(abstractC1794);
        }
        if (this.f5147) {
            return;
        }
        m3293(mo3201());
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final void mo3211() {
        mo3128(this.f5062, 0.0f, null);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f5063.mo1256();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f5063.mo1257();
    }

    @Override // androidx.compose.ui.node.AbstractC1754, androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1497() {
        return true;
    }

    @Override // androidx.compose.ui.layout.AbstractC1724
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3128(long j, float f, InterfaceC6558 interfaceC6558) {
        m3210(j);
        if (this.f5148) {
            return;
        }
        mo3207();
    }
}
