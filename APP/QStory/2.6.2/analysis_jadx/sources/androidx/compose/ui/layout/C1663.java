package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1745;
import androidx.compose.ui.node.AbstractC1794;
import p112.C7327;
import p112.C7328;
import p175.AbstractC7738;
import p205.C7907;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1663 implements InterfaceC1695 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1745 f4877;

    public C1663(AbstractC1745 abstractC1745) {
        this.f4877 = abstractC1745;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long mo3066(long j) {
        return this.f4877.f5062.mo3066(C7328.m12498(j, m3073()));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo3067(InterfaceC1695 interfaceC1695, float[] fArr) {
        this.f4877.f5062.mo3067(interfaceC1695, fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long mo3068(long j) {
        return C7328.m12498(this.f4877.f5062.mo3068(j), m3073());
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long mo3069(long j) {
        return C7328.m12498(this.f4877.f5062.mo3069(j), m3073());
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC1695 mo3070() {
        AbstractC1745 abstractC1745Mo3275;
        if (!mo3076()) {
            AbstractC7935.m13395("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC1794 abstractC1794 = this.f4877.f5062.f5258.f5093.f5284.f5255;
        if (abstractC1794 == null || (abstractC1745Mo3275 = abstractC1794.mo3275()) == null) {
            return null;
        }
        return abstractC1745Mo3275.f5059;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long mo3071(InterfaceC1695 interfaceC1695, long j) {
        return mo3075(interfaceC1695, j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo3072(long j) {
        return this.f4877.f5062.mo3072(C7328.m12498(j, m3073()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m3073() {
        AbstractC1745 abstractC1745 = this.f4877;
        AbstractC1745 abstractC1745M3101 = AbstractC1670.m3101(abstractC1745);
        return C7328.m12499(mo3075(abstractC1745M3101.f5059, 0L), abstractC1745.f5062.mo3075(abstractC1745M3101.f5062, 0L));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long mo3074(long j) {
        return this.f4877.f5062.mo3074(C7328.m12498(0L, m3073()));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long mo3075(InterfaceC1695 interfaceC1695, long j) {
        boolean z = interfaceC1695 instanceof C1663;
        AbstractC1745 abstractC1745 = this.f4877;
        if (!z) {
            AbstractC1745 abstractC1745M3101 = AbstractC1670.m3101(abstractC1745);
            AbstractC1794 abstractC1794 = abstractC1745M3101.f5062;
            long jM12499 = C7328.m12499(mo3075(abstractC1745M3101.f5059, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (abstractC1745M3101.f5061 & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!abstractC1794.mo3272().f6278) {
                AbstractC7935.m13395("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC1794.m3373();
            AbstractC1794 abstractC17942 = abstractC1794.f5255;
            if (abstractC17942 != null) {
                abstractC1794 = abstractC17942;
            }
            return C7328.m12498(jM12499, abstractC1794.mo3075(interfaceC1695, 0L));
        }
        AbstractC1745 abstractC17452 = ((C1663) interfaceC1695).f4877;
        AbstractC1794 abstractC17943 = abstractC17452.f5062;
        abstractC17943.m3373();
        AbstractC1745 abstractC1745Mo3275 = abstractC1745.f5062.m3390(abstractC17943).mo3275();
        if (abstractC1745Mo3275 != null) {
            long jM13335 = C7907.m13335(C7907.m13334(abstractC17452.m3199(abstractC1745Mo3275, false), AbstractC7738.m13022(j)), abstractC1745.m3199(abstractC1745Mo3275, false));
            return (((long) Float.floatToRawIntBits((int) (jM13335 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM13335 & 4294967295L))) & 4294967295L);
        }
        AbstractC1745 abstractC1745M31012 = AbstractC1670.m3101(abstractC17452);
        long jM13334 = C7907.m13334(C7907.m13334(abstractC17452.m3199(abstractC1745M31012, false), abstractC1745M31012.f5061), AbstractC7738.m13022(j));
        AbstractC1745 abstractC1745M31013 = AbstractC1670.m3101(abstractC1745);
        long jM133352 = C7907.m13335(jM13334, C7907.m13334(abstractC1745.m3199(abstractC1745M31013, false), abstractC1745M31013.f5061));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM133352 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM133352 & 4294967295L))) & 4294967295L;
        AbstractC1794 abstractC17944 = abstractC1745M31013.f5062.f5255;
        abstractC17944.getClass();
        AbstractC1794 abstractC17945 = abstractC1745M31012.f5062.f5255;
        abstractC17945.getClass();
        return abstractC17944.mo3075(abstractC17945, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo3076() {
        return this.f4877.f5062.mo3272().f6278;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo3077(float[] fArr) {
        this.f4877.f5062.mo3077(fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final long mo3078() {
        AbstractC1745 abstractC1745 = this.f4877;
        return (((long) abstractC1745.f4998) << 32) | (((long) abstractC1745.f4996) & 4294967295L);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7327 mo3079(InterfaceC1695 interfaceC1695, boolean z) {
        return this.f4877.f5062.mo3079(interfaceC1695, z);
    }
}
