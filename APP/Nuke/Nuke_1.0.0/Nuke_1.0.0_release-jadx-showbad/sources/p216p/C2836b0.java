package p216p;

import android.widget.Magnifier;

/* JADX INFO: renamed from: p.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C2836b0 implements InterfaceC2832Z {

    /* JADX INFO: renamed from: a */
    public final Magnifier f8913a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2836b0(Magnifier magnifier) {
        this.f8913a = magnifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p216p.InterfaceC2832Z
    /* JADX INFO: renamed from: a */
    public void mo5026a(long j5, long j6) {
        this.f8913a.show(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5029b() {
        this.f8913a.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final long m5030c() {
        return (((long) this.f8913a.getHeight()) & 4294967295L) | (((long) this.f8913a.getWidth()) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5031d() {
        this.f8913a.update();
    }
}
