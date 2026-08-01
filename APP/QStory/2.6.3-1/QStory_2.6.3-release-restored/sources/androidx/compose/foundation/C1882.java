package androidx.compose.foundation;

import android.widget.Magnifier;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1882 extends C1920 {
    @Override // androidx.compose.foundation.C1920, androidx.compose.foundation.InterfaceC1918
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2509(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.f3557.setZoom(Float.NaN);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.f3557;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
