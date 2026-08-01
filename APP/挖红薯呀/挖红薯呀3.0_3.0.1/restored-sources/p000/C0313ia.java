package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: ia */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0313ia extends ro0 {

    /* JADX INFO: renamed from: e */
    public final C0752t5 f2492e;

    /* JADX INFO: renamed from: f */
    public final long f2493f;

    /* JADX INFO: renamed from: g */
    public int f2494g;

    /* JADX INFO: renamed from: h */
    public final long f2495h;

    /* JADX INFO: renamed from: i */
    public float f2496i;

    /* JADX INFO: renamed from: j */
    public C0348ja f2497j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0313ia(C0752t5 c0752t5, long j) {
        int i;
        Bitmap bitmap = c0752t5.f5913a;
        this.f2492e = c0752t5;
        this.f2493f = j;
        this.f2494g = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > bitmap.getWidth() || i > bitmap.getHeight()) {
            C0921xc.m5131l("Failed requirement.");
            throw null;
        }
        this.f2495h = j;
        this.f2496i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: a */
    public final void mo1566a(float f) {
        this.f2496i = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: b */
    public final void mo1567b(C0348ja c0348ja) {
        this.f2497j = c0348ja;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: d */
    public final long mo1568d() {
        return o30.m2759C(this.f2495h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: e */
    public final void mo1569e(d60 d60Var) {
        C0125dd c0125dd = d60Var.f976d;
        InterfaceC0812uq.m4334H(d60Var, this.f2492e, this.f2493f, (((long) Math.round(Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L)))) & 4294967295L), this.f2496i, this.f2497j, this.f2494g, 328);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0313ia)) {
            return false;
        }
        C0313ia c0313ia = (C0313ia) obj;
        return p30.m3002l(this.f2492e, c0313ia.f2492e) && w20.m4833a(0L, 0L) && d30.m628a(this.f2493f, c0313ia.f2493f) && this.f2494g == c0313ia.f2494g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2494g) + AbstractC0748t1.m4146d(this.f2493f, AbstractC0748t1.m4146d(0L, this.f2492e.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f2492e);
        sb.append(", srcOffset=");
        sb.append((Object) w20.m4836d(0L));
        sb.append(", srcSize=");
        sb.append((Object) d30.m629b(this.f2493f));
        sb.append(", filterQuality=");
        int i = this.f2494g;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
