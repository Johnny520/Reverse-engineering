package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qm2 extends no {
    public final transient byte[][] l;
    public final transient int[] m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qm2(byte[][] bArr, int[] iArr) {
        super(no.k.h);
        this.l = bArr;
        this.m = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final int a() {
        return this.m[this.l.length - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final String b() {
        return new no(l()).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final byte[] c() {
        return l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final byte d(int i) {
        byte[][] bArr = this.l;
        int length = bArr.length - 1;
        int[] iArr = this.m;
        qp0.m(iArr[length], i, 1L);
        int iF = pp0.F(this, i);
        return bArr[iF][(i - (iF == 0 ? 0 : iArr[iF - 1])) + iArr[bArr.length + iF]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iF = pp0.F(this, i);
            while (i < i4) {
                int[] iArr = this.m;
                int i5 = iF == 0 ? 0 : iArr[iF - 1];
                int i6 = iArr[iF] - i5;
                byte[][] bArr2 = this.l;
                int i7 = iArr[bArr2.length + iF];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iF];
                bArr3.getClass();
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iF++;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof no)) {
            return false;
        }
        no noVar = (no) obj;
        return noVar.a() == a() && f(noVar, a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final boolean f(no noVar, int i) {
        noVar.getClass();
        if (a() - i >= 0) {
            int iF = pp0.F(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.m;
                int i4 = iF == 0 ? 0 : iArr[iF - 1];
                int i5 = iArr[iF] - i4;
                byte[][] bArr = this.l;
                int i6 = iArr[bArr.length + iF];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (noVar.e(i3, bArr[iF], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iF++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final String g(Charset charset) {
        charset.getClass();
        return new no(l()).g(charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final no h(int i, int i2) {
        if (i < 0) {
            s.c(hk1.g(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > a()) {
            StringBuilder sbN = vi0.n(i2, "endIndex=", " > length(");
            sbN.append(a());
            sbN.append(')');
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            s.c(vi0.h("endIndex=", i2, " < beginIndex=", i));
            return null;
        }
        if (i == 0 && i2 == a()) {
            return this;
        }
        if (i == i2) {
            return no.k;
        }
        int iF = pp0.F(this, i);
        int iF2 = pp0.F(this, i2 - 1);
        byte[][] bArr = this.l;
        byte[][] bArr2 = (byte[][]) mg.h0(bArr, iF, iF2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.m;
        if (iF <= iF2) {
            int i4 = iF;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iF2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iF != 0 ? iArr2[iF - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new qm2(bArr2, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.l;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.m;
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
        this.i = i3;
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final no i() {
        return new no(l()).i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final void k(fn fnVar, int i) {
        int iF = pp0.F(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.m;
            int i3 = iF == 0 ? 0 : iArr[iF - 1];
            int i4 = iArr[iF] - i3;
            byte[][] bArr = this.l;
            int i5 = iArr[bArr.length + iF];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            mm2 mm2Var = new mm2(bArr[iF], i6, i6 + iMin, true);
            mm2 mm2Var2 = fnVar.h;
            if (mm2Var2 == null) {
                mm2Var.g = mm2Var;
                mm2Var.f = mm2Var;
                fnVar.h = mm2Var;
            } else {
                mm2 mm2Var3 = mm2Var2.g;
                mm2Var3.getClass();
                mm2Var3.b(mm2Var);
            }
            i2 += iMin;
            iF++;
        }
        fnVar.i += (long) i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] l() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.l;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.m;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            mg.Z(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.no
    public final String toString() {
        return new no(l()).toString();
    }
}
