package p239t0;

import com.bumptech.glide.AbstractC1925g;
import p011B4.AbstractC0231b;
import p041H0.C0566K;
import p117X2.AbstractC1665j;
import p153e1.C2014j;
import p153e1.C2016l;
import p211o0.C2747f;
import p211o0.C2753l;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: t0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3206a extends AbstractC3207b {

    /* JADX INFO: renamed from: e */
    public final C2747f f9978e;

    /* JADX INFO: renamed from: f */
    public final long f9979f;

    /* JADX INFO: renamed from: g */
    public final int f9980g;

    /* JADX INFO: renamed from: h */
    public final long f9981h;

    /* JADX INFO: renamed from: i */
    public float f9982i;

    /* JADX INFO: renamed from: j */
    public C2753l f9983j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3206a(C2747f c2747f) {
        int i5;
        int i6;
        long width = (((long) c2747f.f8734a.getWidth()) << 32) | (((long) c2747f.f8734a.getHeight()) & 4294967295L);
        this.f9978e = c2747f;
        this.f9979f = width;
        this.f9980g = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i5 = (int) (width >> 32)) < 0 || (i6 = (int) (width & 4294967295L)) < 0 || i5 > c2747f.f8734a.getWidth() || i6 > c2747f.f8734a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f9981h = width;
        this.f9982i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: a */
    public final void mo5481a(float f2) {
        this.f9982i = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: b */
    public final void mo5482b(C2753l c2753l) {
        this.f9983j = c2753l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: d */
    public final long mo5483d() {
        return AbstractC1925g.m3523F(this.f9981h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239t0.AbstractC3207b
    /* JADX INFO: renamed from: e */
    public final void mo5484e(C0566K c0566k) {
        C2901b c2901b = c0566k.f1742d;
        int iRound = Math.round(Float.intBitsToFloat((int) (c2901b.mo859c() >> 32)));
        InterfaceC2903d.m5102b0(c0566k, this.f9978e, this.f9979f, (((long) Math.round(Float.intBitsToFloat((int) (c2901b.mo859c() & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32), this.f9982i, this.f9983j, this.f9980g, 328);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3206a)) {
            return false;
        }
        C3206a c3206a = (C3206a) obj;
        return AbstractC1665j.m2981a(this.f9978e, c3206a.f9978e) && C2014j.m3700a(0L, 0L) && C2016l.m3704a(this.f9979f, c3206a.f9979f) && this.f9980g == c3206a.f9980g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9980g) + AbstractC0231b.m392c(AbstractC0231b.m392c(this.f9978e.hashCode() * 31, 31, 0L), 31, this.f9979f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f9978e);
        sb.append(", srcOffset=");
        sb.append((Object) C2014j.m3703d(0L));
        sb.append(", srcSize=");
        sb.append((Object) C2016l.m3705b(this.f9979f));
        sb.append(", filterQuality=");
        int i5 = this.f9980g;
        sb.append((Object) (i5 == 0 ? "None" : i5 == 1 ? "Low" : i5 == 2 ? "Medium" : i5 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
