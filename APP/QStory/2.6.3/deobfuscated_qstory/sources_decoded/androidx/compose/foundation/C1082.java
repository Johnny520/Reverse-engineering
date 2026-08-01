package androidx.compose.foundation;

import android.widget.Magnifier;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1082 implements InterfaceC1080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Magnifier f3212;

    public C1082(Magnifier magnifier) {
        this.f3212 = magnifier;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1998() {
        this.f3212.update();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m1999() {
        return (((long) this.f3212.getWidth()) << 32) | (((long) this.f3212.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2000() {
        this.f3212.dismiss();
    }

    @Override // androidx.compose.foundation.InterfaceC1080
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1949(long j, long j2) {
        this.f3212.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
