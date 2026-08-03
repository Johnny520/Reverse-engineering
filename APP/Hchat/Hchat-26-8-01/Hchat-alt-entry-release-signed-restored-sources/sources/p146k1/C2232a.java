package p146k1;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.C1003g;
import p071f1.C1017n;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p136j8.C2104o;
import p259r9.AbstractC3754e0;
import p293u2.C4240j;
import p293u2.C4242l;
import p339x1.C5610h0;

/* JADX INFO: renamed from: k1.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2232a extends AbstractC2233b {

    /* JADX INFO: renamed from: e */
    public final C1003g f7394e;

    /* JADX INFO: renamed from: f */
    public final long f7395f;

    /* JADX INFO: renamed from: g */
    public int f7396g = 1;

    /* JADX INFO: renamed from: h */
    public final long f7397h;

    /* JADX INFO: renamed from: i */
    public float f7398i;

    /* JADX INFO: renamed from: j */
    public C1017n f7399j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2232a(C1003g c1003g, long j3) {
        int i9;
        int i10;
        this.f7394e = c1003g;
        this.f7395f = j3;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i9 = (int) (j3 >> 32)) < 0 || (i10 = (int) (4294967295L & j3)) < 0 || i9 > c1003g.f3179a.getWidth() || i10 > c1003g.f3179a.getHeight()) {
            C2104o.m5294t("Failed requirement.");
            throw null;
        }
        this.f7397h = j3;
        this.f7398i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: a */
    public final void mo5467a(float f3) {
        this.f7398i = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: b */
    public final void mo5468b(C1017n c1017n) {
        this.f7399j = c1017n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: d */
    public final long mo5469d() {
        return AbstractC3754e0.m7908q0(this.f7397h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p146k1.AbstractC2233b
    /* JADX INFO: renamed from: e */
    public final void mo5470e(C5610h0 c5610h0) {
        C1565b c1565b = c5610h0.f22833g;
        int iRound = Math.round(Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32)));
        InterfaceC1567d.m4085U0(c5610h0, this.f7394e, this.f7395f, (((long) Math.round(Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32), this.f7398i, this.f7399j, this.f7396g, 328);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2232a)) {
            return false;
        }
        C2232a c2232a = (C2232a) obj;
        return AbstractC1416l.m3825a(this.f7394e, c2232a.f7394e) && C4240j.m8528b(0L, 0L) && C4242l.m8534a(this.f7395f, c2232a.f7395f) && this.f7396g == c2232a.f7396g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7396g) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(this.f7394e.hashCode() * 31, 31, 0L), 31, this.f7395f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f7394e);
        sb2.append(", srcOffset=");
        sb2.append((Object) C4240j.m8531e(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) C4242l.m8535b(this.f7395f));
        sb2.append(", filterQuality=");
        int i9 = this.f7396g;
        sb2.append((Object) (i9 == 0 ? "None" : i9 == 1 ? "Low" : i9 == 2 ? "Medium" : i9 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
