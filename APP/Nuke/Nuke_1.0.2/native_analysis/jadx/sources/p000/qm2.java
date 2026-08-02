package p000;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qm2 extends C0505no {

    /* JADX INFO: renamed from: l */
    public final transient byte[][] f9043l;

    /* JADX INFO: renamed from: m */
    public final transient int[] f9044m;

    public qm2(byte[][] bArr, int[] iArr) {
        super(C0505no.f7266k.f7267h);
        this.f9043l = bArr;
        this.f9044m = iArr;
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: a */
    public final int mo3322a() {
        return this.f9044m[this.f9043l.length - 1];
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: b */
    public final String mo3323b() {
        return new C0505no(m4198l()).mo3323b();
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: c */
    public final byte[] mo3324c() {
        return m4198l();
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: d */
    public final byte mo3325d(int i) {
        byte[][] bArr = this.f9043l;
        int length = bArr.length - 1;
        int[] iArr = this.f9044m;
        qp0.m4258m(iArr[length], i, 1L);
        int iM3894F = pp0.m3894F(this, i);
        return bArr[iM3894F][(i - (iM3894F == 0 ? 0 : iArr[iM3894F - 1])) + iArr[bArr.length + iM3894F]];
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: e */
    public final boolean mo3326e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= mo3322a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM3894F = pp0.m3894F(this, i);
            while (i < i4) {
                int[] iArr = this.f9044m;
                int i5 = iM3894F == 0 ? 0 : iArr[iM3894F - 1];
                int i6 = iArr[iM3894F] - i5;
                byte[][] bArr2 = this.f9043l;
                int i7 = iArr[bArr2.length + iM3894F];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM3894F];
                bArr3.getClass();
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM3894F++;
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0505no
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0505no)) {
            return false;
        }
        C0505no c0505no = (C0505no) obj;
        return c0505no.mo3322a() == mo3322a() && mo3327f(c0505no, mo3322a());
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: f */
    public final boolean mo3327f(C0505no c0505no, int i) {
        c0505no.getClass();
        if (mo3322a() - i >= 0) {
            int iM3894F = pp0.m3894F(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f9044m;
                int i4 = iM3894F == 0 ? 0 : iArr[iM3894F - 1];
                int i5 = iArr[iM3894F] - i4;
                byte[][] bArr = this.f9043l;
                int i6 = iArr[bArr.length + iM3894F];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (c0505no.mo3326e(i3, bArr[iM3894F], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iM3894F++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: g */
    public final String mo3328g(Charset charset) {
        charset.getClass();
        return new C0505no(m4198l()).mo3328g(charset);
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: h */
    public final C0505no mo3329h(int i, int i2) {
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > mo3322a()) {
            StringBuilder sbM5695n = vi0.m5695n(i2, "endIndex=", " > length(");
            sbM5695n.append(mo3322a());
            sbM5695n.append(')');
            throw new IllegalArgumentException(sbM5695n.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            C0676s.m4645c(vi0.m5689h("endIndex=", i2, " < beginIndex=", i));
            return null;
        }
        if (i == 0 && i2 == mo3322a()) {
            return this;
        }
        if (i == i2) {
            return C0505no.f7266k;
        }
        int iM3894F = pp0.m3894F(this, i);
        int iM3894F2 = pp0.m3894F(this, i2 - 1);
        byte[][] bArr = this.f9043l;
        byte[][] bArr2 = (byte[][]) AbstractC0460mg.m3093h0(bArr, iM3894F, iM3894F2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f9044m;
        if (iM3894F <= iM3894F2) {
            int i4 = iM3894F;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iM3894F2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iM3894F != 0 ? iArr2[iM3894F - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new qm2(bArr2, iArr);
    }

    @Override // p000.C0505no
    public final int hashCode() {
        int i = this.f7268i;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f9043l;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f9044m;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f7268i = i3;
        return i3;
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: i */
    public final C0505no mo3330i() {
        return new C0505no(m4198l()).mo3330i();
    }

    @Override // p000.C0505no
    /* JADX INFO: renamed from: k */
    public final void mo3332k(C0209fn c0209fn, int i) {
        int iM3894F = pp0.m3894F(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f9044m;
            int i3 = iM3894F == 0 ? 0 : iArr[iM3894F - 1];
            int i4 = iArr[iM3894F] - i3;
            byte[][] bArr = this.f9043l;
            int i5 = iArr[bArr.length + iM3894F];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            mm2 mm2Var = new mm2(bArr[iM3894F], i6, i6 + iMin, true);
            mm2 mm2Var2 = c0209fn.f3067h;
            if (mm2Var2 == null) {
                mm2Var.f6727g = mm2Var;
                mm2Var.f6726f = mm2Var;
                c0209fn.f3067h = mm2Var;
            } else {
                mm2 mm2Var3 = mm2Var2.f6727g;
                mm2Var3.getClass();
                mm2Var3.m3134b(mm2Var);
            }
            i2 += iMin;
            iM3894F++;
        }
        c0209fn.f3068i += (long) i;
    }

    /* JADX INFO: renamed from: l */
    public final byte[] m4198l() {
        byte[] bArr = new byte[mo3322a()];
        byte[][] bArr2 = this.f9043l;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f9044m;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC0460mg.m3085Z(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p000.C0505no
    public final String toString() {
        return new C0505no(m4198l()).toString();
    }
}
