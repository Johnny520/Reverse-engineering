package p029F0;

import com.bumptech.glide.AbstractC1926h;
import p112W2.InterfaceC1601c;
import p153e1.C2005a;
import p153e1.C2016l;

/* JADX INFO: renamed from: F0.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0391b0 {

    /* JADX INFO: renamed from: d */
    public int f1206d;

    /* JADX INFO: renamed from: e */
    public int f1207e;

    /* JADX INFO: renamed from: f */
    public long f1208f;

    /* JADX INFO: renamed from: g */
    public long f1209g = AbstractC0395d0.f1217a;

    /* JADX INFO: renamed from: h */
    public long f1210h = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0391b0() {
        long j5 = 0;
        this.f1208f = (j5 & 4294967295L) | (j5 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public int mo663d0() {
        return (int) (this.f1208f & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public int mo664g0() {
        return (int) (this.f1208f >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final void m665h0() {
        this.f1206d = AbstractC1926h.m3568k((int) (this.f1208f >> 32), C2005a.m3682j(this.f1209g), C2005a.m3680h(this.f1209g));
        int iM3568k = AbstractC1926h.m3568k((int) (this.f1208f & 4294967295L), C2005a.m3681i(this.f1209g), C2005a.m3679g(this.f1209g));
        this.f1207e = iM3568k;
        int i5 = this.f1206d;
        long j5 = this.f1208f;
        this.f1210h = (((long) ((i5 - ((int) (j5 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM3568k - ((int) (j5 & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo666i0(long j5, float f2, InterfaceC1601c interfaceC1601c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public final void m667j0(long j5) {
        if (C2016l.m3704a(this.f1208f, j5)) {
            return;
        }
        this.f1208f = j5;
        m665h0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public Object mo650l() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m668l0(long j5) {
        if (C2005a.m3674b(this.f1209g, j5)) {
            return;
        }
        this.f1209g = j5;
        m665h0();
    }
}
