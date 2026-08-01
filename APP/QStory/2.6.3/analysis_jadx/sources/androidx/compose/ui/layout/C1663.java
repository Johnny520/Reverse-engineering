package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1745;
import androidx.compose.ui.node.AbstractC1794;
import p112.C7328;
import p112.C7329;
import p205.C7908;
import p210.AbstractC7936;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1663 implements InterfaceC1695 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1745 f4878;

    public C1663(AbstractC1745 abstractC1745) {
        this.f4878 = abstractC1745;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long mo3076(long j) {
        return this.f4878.f5063.mo3076(C7329.m12525(j, m3083()));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo3077(InterfaceC1695 interfaceC1695, float[] fArr) {
        this.f4878.f5063.mo3077(interfaceC1695, fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long mo3078(long j) {
        return C7329.m12525(this.f4878.f5063.mo3078(j), m3083());
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long mo3079(long j) {
        return C7329.m12525(this.f4878.f5063.mo3079(j), m3083());
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC1695 mo3080() {
        AbstractC1745 abstractC1745Mo3285;
        if (!mo3086()) {
            AbstractC7936.m13423("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC1794 abstractC1794 = this.f4878.f5063.f5259.f5094.f5285.f5256;
        if (abstractC1794 == null || (abstractC1745Mo3285 = abstractC1794.mo3285()) == null) {
            return null;
        }
        return abstractC1745Mo3285.f5060;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long mo3081(InterfaceC1695 interfaceC1695, long j) {
        return mo3085(interfaceC1695, j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo3082(long j) {
        return this.f4878.f5063.mo3082(C7329.m12525(j, m3083()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m3083() {
        AbstractC1745 abstractC1745 = this.f4878;
        AbstractC1745 abstractC1745M3111 = AbstractC1670.m3111(abstractC1745);
        return C7329.m12526(mo3085(abstractC1745M3111.f5060, 0L), abstractC1745.f5063.mo3085(abstractC1745M3111.f5063, 0L));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long mo3084(long j) {
        return this.f4878.f5063.mo3084(C7329.m12525(0L, m3083()));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long mo3085(InterfaceC1695 interfaceC1695, long j) {
        boolean z = interfaceC1695 instanceof C1663;
        AbstractC1745 abstractC1745 = this.f4878;
        if (!z) {
            AbstractC1745 abstractC1745M3111 = AbstractC1670.m3111(abstractC1745);
            AbstractC1794 abstractC1794 = abstractC1745M3111.f5063;
            long jM12526 = C7329.m12526(mo3085(abstractC1745M3111.f5060, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (abstractC1745M3111.f5062 & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!abstractC1794.mo3282().f6279) {
                AbstractC7936.m13423("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC1794.m3383();
            AbstractC1794 abstractC17942 = abstractC1794.f5256;
            if (abstractC17942 != null) {
                abstractC1794 = abstractC17942;
            }
            return C7329.m12525(jM12526, abstractC1794.mo3085(interfaceC1695, 0L));
        }
        AbstractC1745 abstractC17452 = ((C1663) interfaceC1695).f4878;
        AbstractC1794 abstractC17943 = abstractC17452.f5063;
        abstractC17943.m3383();
        AbstractC1745 abstractC1745Mo3285 = abstractC1745.f5063.m3400(abstractC17943).mo3285();
        if (abstractC1745Mo3285 != null) {
            long jM13363 = C7908.m13363(C7908.m13362(abstractC17452.m3209(abstractC1745Mo3285, false), AbstractC8190.m13681(j)), abstractC1745.m3209(abstractC1745Mo3285, false));
            return (((long) Float.floatToRawIntBits((int) (jM13363 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM13363 & 4294967295L))) & 4294967295L);
        }
        AbstractC1745 abstractC1745M31112 = AbstractC1670.m3111(abstractC17452);
        long jM13362 = C7908.m13362(C7908.m13362(abstractC17452.m3209(abstractC1745M31112, false), abstractC1745M31112.f5062), AbstractC8190.m13681(j));
        AbstractC1745 abstractC1745M31113 = AbstractC1670.m3111(abstractC1745);
        long jM133632 = C7908.m13363(jM13362, C7908.m13362(abstractC1745.m3209(abstractC1745M31113, false), abstractC1745M31113.f5062));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM133632 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM133632 & 4294967295L))) & 4294967295L;
        AbstractC1794 abstractC17944 = abstractC1745M31113.f5063.f5256;
        abstractC17944.getClass();
        AbstractC1794 abstractC17945 = abstractC1745M31112.f5063.f5256;
        abstractC17945.getClass();
        return abstractC17944.mo3085(abstractC17945, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo3086() {
        return this.f4878.f5063.mo3282().f6279;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo3087(float[] fArr) {
        this.f4878.f5063.mo3087(fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final long mo3088() {
        AbstractC1745 abstractC1745 = this.f4878;
        return (((long) abstractC1745.f4999) << 32) | (((long) abstractC1745.f4997) & 4294967295L);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1695
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7328 mo3089(InterfaceC1695 interfaceC1695, boolean z) {
        return this.f4878.f5063.mo3089(interfaceC1695, z);
    }
}
