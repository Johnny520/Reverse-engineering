package p000;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i02 extends g02 {
    @Override // p000.g02, p000.e02
    /* JADX INFO: renamed from: a */
    public final void mo1213a(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.f3222a.setZoom(Float.NaN);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.f3222a;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
