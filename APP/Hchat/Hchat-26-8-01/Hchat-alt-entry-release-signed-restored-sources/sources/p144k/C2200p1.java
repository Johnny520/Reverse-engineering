package p144k;

import android.widget.Magnifier;

/* JADX INFO: renamed from: k.p1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2200p1 implements InterfaceC2194n1 {

    /* JADX INFO: renamed from: a */
    public final Magnifier f7292a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2200p1(Magnifier magnifier) {
        this.f7292a = magnifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2194n1
    /* JADX INFO: renamed from: a */
    public void mo5447a(long j3, long j4) {
        this.f7292a.show(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5450b() {
        this.f7292a.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m5451c() {
        return (((long) this.f7292a.getHeight()) & 4294967295L) | (((long) this.f7292a.getWidth()) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5452d() {
        this.f7292a.update();
    }
}
