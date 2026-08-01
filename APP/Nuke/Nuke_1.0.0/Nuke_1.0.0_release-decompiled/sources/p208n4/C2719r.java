package p208n4;

import com.bumptech.glide.AbstractC1926h;
import java.nio.charset.Charset;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p215o4.AbstractC2803b;

/* JADX INFO: renamed from: n4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2719r extends C2709h {

    /* JADX INFO: renamed from: h */
    public final transient byte[][] f8663h;

    /* JADX INFO: renamed from: i */
    public final transient int[] f8664i;

    public C2719r(byte[][] bArr, int[] iArr) {
        super(C2709h.f8630g.f8631d);
        this.f8663h = bArr;
        this.f8664i = iArr;
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: a */
    public final int mo4732a() {
        return this.f8664i[this.f8663h.length - 1];
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: b */
    public final String mo4733b() {
        return new C2709h(m4763l()).mo4733b();
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: c */
    public final byte[] mo4734c() {
        return m4763l();
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: d */
    public final byte mo4735d(int i5) {
        byte[][] bArr = this.f8663h;
        int length = bArr.length - 1;
        int[] iArr = this.f8664i;
        AbstractC1926h.m3564g(iArr[length], i5, 1L);
        int iM4989b = AbstractC2803b.m4989b(this, i5);
        return bArr[iM4989b][(i5 - (iM4989b == 0 ? 0 : iArr[iM4989b - 1])) + iArr[bArr.length + iM4989b]];
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: e */
    public final boolean mo4736e(int i5, byte[] bArr, int i6, int i7) {
        AbstractC1665j.m2985e(bArr, "other");
        if (i5 < 0 || i5 > mo4732a() - i7 || i6 < 0 || i6 > bArr.length - i7) {
            return false;
        }
        int i8 = i7 + i5;
        int iM4989b = AbstractC2803b.m4989b(this, i5);
        while (i5 < i8) {
            int[] iArr = this.f8664i;
            int i9 = iM4989b == 0 ? 0 : iArr[iM4989b - 1];
            int i10 = iArr[iM4989b] - i9;
            byte[][] bArr2 = this.f8663h;
            int i11 = iArr[bArr2.length + iM4989b];
            int iMin = Math.min(i8, i10 + i9) - i5;
            if (!AbstractC1926h.m3562e((i5 - i9) + i11, i6, iMin, bArr2[iM4989b], bArr)) {
                return false;
            }
            i6 += iMin;
            i5 += iMin;
            iM4989b++;
        }
        return true;
    }

    @Override // p208n4.C2709h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2709h)) {
            return false;
        }
        C2709h c2709h = (C2709h) obj;
        return c2709h.mo4732a() == mo4732a() && mo4737f(c2709h, mo4732a());
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: f */
    public final boolean mo4737f(C2709h c2709h, int i5) {
        AbstractC1665j.m2985e(c2709h, "other");
        if (mo4732a() - i5 >= 0) {
            int iM4989b = AbstractC2803b.m4989b(this, 0);
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                int[] iArr = this.f8664i;
                int i8 = iM4989b == 0 ? 0 : iArr[iM4989b - 1];
                int i9 = iArr[iM4989b] - i8;
                byte[][] bArr = this.f8663h;
                int i10 = iArr[bArr.length + iM4989b];
                int iMin = Math.min(i5, i9 + i8) - i6;
                if (c2709h.mo4736e(i7, bArr[iM4989b], (i6 - i8) + i10, iMin)) {
                    i7 += iMin;
                    i6 += iMin;
                    iM4989b++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: g */
    public final String mo4738g(Charset charset) {
        AbstractC1665j.m2985e(charset, "charset");
        return new C2709h(m4763l()).mo4738g(charset);
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: h */
    public final C2709h mo4739h(int i5, int i6) {
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "beginIndex=", " < 0").toString());
        }
        if (i6 > mo4732a()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i6, "endIndex=", " > length(");
            sbM404o.append(mo4732a());
            sbM404o.append(')');
            throw new IllegalArgumentException(sbM404o.toString().toString());
        }
        int i7 = i6 - i5;
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m399j("endIndex=", i6, " < beginIndex=", i5).toString());
        }
        if (i5 == 0 && i6 == mo4732a()) {
            return this;
        }
        if (i5 == i6) {
            return C2709h.f8630g;
        }
        int iM4989b = AbstractC2803b.m4989b(this, i5);
        int iM4989b2 = AbstractC2803b.m4989b(this, i6 - 1);
        byte[][] bArr = this.f8663h;
        byte[][] bArr2 = (byte[][]) AbstractC0972l.m1997U(bArr, iM4989b, iM4989b2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f8664i;
        if (iM4989b <= iM4989b2) {
            int i8 = iM4989b;
            int i9 = 0;
            while (true) {
                iArr[i9] = Math.min(iArr2[i8] - i5, i7);
                int i10 = i9 + 1;
                iArr[i9 + bArr2.length] = iArr2[bArr.length + i8];
                if (i8 == iM4989b2) {
                    break;
                }
                i8++;
                i9 = i10;
            }
        }
        int i11 = iM4989b != 0 ? iArr2[iM4989b - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i5 - i11) + iArr[length];
        return new C2719r(bArr2, iArr);
    }

    @Override // p208n4.C2709h
    public final int hashCode() {
        int i5 = this.f8632e;
        if (i5 != 0) {
            return i5;
        }
        byte[][] bArr = this.f8663h;
        int length = bArr.length;
        int i6 = 0;
        int i7 = 1;
        int i8 = 0;
        while (i6 < length) {
            int[] iArr = this.f8664i;
            int i9 = iArr[length + i6];
            int i10 = iArr[i6];
            byte[] bArr2 = bArr[i6];
            int i11 = (i10 - i8) + i9;
            while (i9 < i11) {
                i7 = (i7 * 31) + bArr2[i9];
                i9++;
            }
            i6++;
            i8 = i10;
        }
        this.f8632e = i7;
        return i7;
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: i */
    public final C2709h mo4740i() {
        return new C2709h(m4763l()).mo4740i();
    }

    @Override // p208n4.C2709h
    /* JADX INFO: renamed from: k */
    public final void mo4742k(C2706e c2706e, int i5) {
        int iM4989b = AbstractC2803b.m4989b(this, 0);
        int i6 = 0;
        while (i6 < i5) {
            int[] iArr = this.f8664i;
            int i7 = iM4989b == 0 ? 0 : iArr[iM4989b - 1];
            int i8 = iArr[iM4989b] - i7;
            byte[][] bArr = this.f8663h;
            int i9 = iArr[bArr.length + iM4989b];
            int iMin = Math.min(i5, i8 + i7) - i6;
            int i10 = (i6 - i7) + i9;
            C2717p c2717p = new C2717p(bArr[iM4989b], i10, i10 + iMin, true);
            C2717p c2717p2 = c2706e.f8628d;
            if (c2717p2 == null) {
                c2717p.f8659g = c2717p;
                c2717p.f8658f = c2717p;
                c2706e.f8628d = c2717p;
            } else {
                C2717p c2717p3 = c2717p2.f8659g;
                AbstractC1665j.m2982b(c2717p3);
                c2717p3.m4758b(c2717p);
            }
            i6 += iMin;
            iM4989b++;
        }
        c2706e.f8629e += (long) i5;
    }

    /* JADX INFO: renamed from: l */
    public final byte[] m4763l() {
        byte[] bArr = new byte[mo4732a()];
        byte[][] bArr2 = this.f8663h;
        int length = bArr2.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f8664i;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            int i10 = i9 - i6;
            AbstractC0972l.m1989M(i7, i8, i8 + i10, bArr2[i5], bArr);
            i7 += i10;
            i5++;
            i6 = i9;
        }
        return bArr;
    }

    @Override // p208n4.C2709h
    public final String toString() {
        return new C2709h(m4763l()).toString();
    }
}
