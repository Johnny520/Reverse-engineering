package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.AbstractC2580;
import androidx.compose.p001ui.node.AbstractC2629;
import p128.C8157;
import p128.C8158;
import p221.C8737;
import p226.AbstractC8765;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2498 implements InterfaceC2530 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC2580 f5223;

    public C2498(AbstractC2580 abstractC2580) {
        this.f5223 = abstractC2580;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long mo3636(long j) {
        return this.f5223.f5408.mo3636(C8158.m13084(j, m3643()));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo3637(InterfaceC2530 interfaceC2530, float[] fArr) {
        this.f5223.f5408.mo3637(interfaceC2530, fArr);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long mo3638(long j) {
        return C8158.m13084(this.f5223.f5408.mo3638(j), m3643());
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long mo3639(long j) {
        return C8158.m13084(this.f5223.f5408.mo3639(j), m3643());
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC2530 mo3640() {
        AbstractC2580 abstractC2580Mo3845;
        if (!mo3646()) {
            AbstractC8765.m13982("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC2629 abstractC2629 = this.f5223.f5408.f5604.f5439.f5630.f5601;
        if (abstractC2629 == null || (abstractC2580Mo3845 = abstractC2629.mo3845()) == null) {
            return null;
        }
        return abstractC2580Mo3845.f5405;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long mo3641(InterfaceC2530 interfaceC2530, long j) {
        return mo3645(interfaceC2530, j);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo3642(long j) {
        return this.f5223.f5408.mo3642(C8158.m13084(j, m3643()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m3643() {
        AbstractC2580 abstractC2580 = this.f5223;
        AbstractC2580 abstractC2580M3671 = AbstractC2505.m3671(abstractC2580);
        return C8158.m13085(mo3645(abstractC2580M3671.f5405, 0L), abstractC2580.f5408.mo3645(abstractC2580M3671.f5408, 0L));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long mo3644(long j) {
        return this.f5223.f5408.mo3644(C8158.m13084(0L, m3643()));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long mo3645(InterfaceC2530 interfaceC2530, long j) {
        boolean z = interfaceC2530 instanceof C2498;
        AbstractC2580 abstractC2580 = this.f5223;
        if (!z) {
            AbstractC2580 abstractC2580M3671 = AbstractC2505.m3671(abstractC2580);
            AbstractC2629 abstractC2629 = abstractC2580M3671.f5408;
            long jM13085 = C8158.m13085(mo3645(abstractC2580M3671.f5405, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (abstractC2580M3671.f5407 & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!abstractC2629.mo3842().f6624) {
                AbstractC8765.m13982("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC2629.m3943();
            AbstractC2629 abstractC26292 = abstractC2629.f5601;
            if (abstractC26292 != null) {
                abstractC2629 = abstractC26292;
            }
            return C8158.m13084(jM13085, abstractC2629.mo3645(interfaceC2530, 0L));
        }
        AbstractC2580 abstractC25802 = ((C2498) interfaceC2530).f5223;
        AbstractC2629 abstractC26293 = abstractC25802.f5408;
        abstractC26293.m3943();
        AbstractC2580 abstractC2580Mo3845 = abstractC2580.f5408.m3960(abstractC26293).mo3845();
        if (abstractC2580Mo3845 != null) {
            long jM13922 = C8737.m13922(C8737.m13921(abstractC25802.m3769(abstractC2580Mo3845, false), AbstractC9019.m14240(j)), abstractC2580.m3769(abstractC2580Mo3845, false));
            return (((long) Float.floatToRawIntBits((int) (jM13922 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM13922 & 4294967295L))) & 4294967295L);
        }
        AbstractC2580 abstractC2580M36712 = AbstractC2505.m3671(abstractC25802);
        long jM13921 = C8737.m13921(C8737.m13921(abstractC25802.m3769(abstractC2580M36712, false), abstractC2580M36712.f5407), AbstractC9019.m14240(j));
        AbstractC2580 abstractC2580M36713 = AbstractC2505.m3671(abstractC2580);
        long jM139222 = C8737.m13922(jM13921, C8737.m13921(abstractC2580.m3769(abstractC2580M36713, false), abstractC2580M36713.f5407));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM139222 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM139222 & 4294967295L))) & 4294967295L;
        AbstractC2629 abstractC26294 = abstractC2580M36713.f5408.f5601;
        abstractC26294.getClass();
        AbstractC2629 abstractC26295 = abstractC2580M36712.f5408.f5601;
        abstractC26295.getClass();
        return abstractC26294.mo3645(abstractC26295, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo3646() {
        return this.f5223.f5408.mo3842().f6624;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo3647(float[] fArr) {
        this.f5223.f5408.mo3647(fArr);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final long mo3648() {
        AbstractC2580 abstractC2580 = this.f5223;
        return (((long) abstractC2580.f5344) << 32) | (((long) abstractC2580.f5342) & 4294967295L);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2530
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8157 mo3649(InterfaceC2530 interfaceC2530, boolean z) {
        return this.f5223.f5408.mo3649(interfaceC2530, z);
    }
}
