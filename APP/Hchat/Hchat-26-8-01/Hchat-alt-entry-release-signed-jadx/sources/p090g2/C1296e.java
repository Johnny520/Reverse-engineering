package p090g2;

import p069f.AbstractC0944l;
import p069f.C0965w;
import p293u2.C4240j;

/* JADX INFO: renamed from: g2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1296e {

    /* JADX INFO: renamed from: a */
    public final C0965w f4340a;

    /* JADX INFO: renamed from: b */
    public C1295d f4341b;

    /* JADX INFO: renamed from: c */
    public long f4342c;

    /* JADX INFO: renamed from: d */
    public long f4343d;

    /* JADX INFO: renamed from: e */
    public long f4344e;

    /* JADX INFO: renamed from: f */
    public long f4345f;

    /* JADX INFO: renamed from: g */
    public float[] f4346g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1296e() {
        C0965w c0965w = AbstractC0944l.f2974a;
        this.f4340a = new C0965w();
        this.f4342c = -1L;
        this.f4343d = 0L;
        this.f4344e = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3442a(C1295d c1295d, long j3, long j4, float[] fArr, long j5) {
        long j10 = c1295d.f4338g;
        if (j5 - j10 > 0 || j10 == Long.MIN_VALUE) {
            c1295d.f4338g = j5;
            c1295d.m3440a(c1295d.f4336e, c1295d.f4337f, j3, j4, fArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m3443b(long j3, long j4, float[] fArr, int i9, int i10) {
        boolean z9;
        if (C4240j.m8528b(j4, this.f4343d)) {
            z9 = false;
        } else {
            this.f4343d = j4;
            z9 = true;
        }
        if (!C4240j.m8528b(j3, this.f4344e)) {
            this.f4344e = j3;
            z9 = true;
        }
        if (fArr != null) {
            this.f4346g = fArr;
            z9 = true;
        }
        long j5 = (((long) i9) << 32) | (((long) i10) & 4294967295L);
        if (j5 == this.f4345f) {
            return z9;
        }
        this.f4345f = j5;
        return true;
    }
}
