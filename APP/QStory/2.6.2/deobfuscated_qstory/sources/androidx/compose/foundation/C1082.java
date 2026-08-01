package androidx.compose.foundation;

import android.widget.Magnifier;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C1082 implements InterfaceC1080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Magnifier f3211;

    public C1082(Magnifier magnifier) {
        this.f3211 = magnifier;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1988() {
        this.f3211.update();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m1989() {
        return (((long) this.f3211.getWidth()) << 32) | (((long) this.f3211.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1990() {
        this.f3211.dismiss();
    }

    @Override // androidx.compose.foundation.InterfaceC1080
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1939(long j, long j2) {
        this.f3211.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
