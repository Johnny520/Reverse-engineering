package p144k;

import android.widget.Magnifier;

/* JADX INFO: renamed from: k.r1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2206r1 extends C2200p1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.C2200p1, p144k.InterfaceC2194n1
    /* JADX INFO: renamed from: a */
    public final void mo5447a(long j3, long j4) {
        if (!Float.isNaN(Float.NaN)) {
            this.f7292a.setZoom(Float.NaN);
        }
        long j5 = 9223372034707292159L & j4;
        Magnifier magnifier = this.f7292a;
        if (j5 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }
}
