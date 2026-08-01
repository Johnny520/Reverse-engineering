package androidx.compose.foundation;

import android.widget.Magnifier;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1920 implements InterfaceC1918 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Magnifier f3557;

    public C1920(Magnifier magnifier) {
        this.f3557 = magnifier;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2558() {
        this.f3557.update();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m2559() {
        return (((long) this.f3557.getWidth()) << 32) | (((long) this.f3557.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2560() {
        this.f3557.dismiss();
    }

    @Override // androidx.compose.foundation.InterfaceC1918
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2509(long j, long j2) {
        this.f3557.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
