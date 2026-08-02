package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ga3 {
    /* JADX INFO: renamed from: a */
    public static final void m1816a(hh1 hh1Var, o12 o12Var, long j) {
        m60 m60Var = (m60) hh1Var.f4019i;
        m60Var.getClass();
        bb2 bb2Var = m60Var.f6486b;
        bb2 bb2Var2 = m60Var.f6485a;
        boolean zM5367o = tp0.m5367o(o12Var);
        long j2 = o12Var.f7421b;
        if (zM5367o) {
            i40[] i40VarArr = (i40[]) bb2Var2.f764e;
            AbstractC0460mg.m3094i0(i40VarArr, 0, i40VarArr.length);
            bb2Var2.f762c = 0;
            i40[] i40VarArr2 = (i40[]) bb2Var.f764e;
            AbstractC0460mg.m3094i0(i40VarArr2, 0, i40VarArr2.length);
            bb2Var.f762c = 0;
            m60Var.f6487c = 0L;
        }
        if (!tp0.m5369q(o12Var)) {
            List list = o12Var.f7432m;
            if (list == null) {
                list = be0.f819h;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                ts0 ts0Var = (ts0) list.get(i);
                m60Var.m3032a(ts0Var.f10941a, rs1.m4612e(ts0Var.f10945e, j));
                i++;
            }
            m60Var.m3032a(j2, rs1.m4612e(o12Var.f7433n, j));
        }
        if (tp0.m5369q(o12Var) && j2 - m60Var.f6487c > 40) {
            i40[] i40VarArr3 = (i40[]) bb2Var2.f764e;
            AbstractC0460mg.m3094i0(i40VarArr3, 0, i40VarArr3.length);
            bb2Var2.f762c = 0;
            i40[] i40VarArr4 = (i40[]) bb2Var.f764e;
            AbstractC0460mg.m3094i0(i40VarArr4, 0, i40VarArr4.length);
            bb2Var.f762c = 0;
            m60Var.f6487c = 0L;
        }
        m60Var.f6487c = j2;
    }

    /* JADX INFO: renamed from: b */
    public static final float m1817b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1818c(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            kz0.m2763a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fM1817b = m1817b(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fM1817b);
                }
            }
            float fSqrt = (float) Math.sqrt(m1817b(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : m1817b(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM1817b2 = m1817b(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM1817b2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM1817b2 / fArr11[i14];
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m1819d(q23 q23Var, mn0 mn0Var) {
        xe1.m6090H(q23Var, true, new fa0(0, AbstractC0179eu.m1430K(q23Var.f3961k.mo2508f()).mo2605g(q23Var.f8711l, q23Var, q23Var.f7930j)));
        return ze3.m6410b(q23Var, false, q23Var, mn0Var);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m1820e(long j, C0793v0 c0793v0, dw0 dw0Var) {
        if (j > 0) {
            return m1819d(new q23(j, dw0Var), c0793v0);
        }
        throw new p23("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1821f(long j, mn0 mn0Var, u00 u00Var) {
        r23 r23Var;
        o72 o72Var;
        if (u00Var instanceof r23) {
            r23Var = (r23) u00Var;
            int i = r23Var.f9334m;
            if ((i & Integer.MIN_VALUE) != 0) {
                r23Var.f9334m = i - Integer.MIN_VALUE;
            } else {
                r23Var = new r23(u00Var);
            }
        }
        Object obj = r23Var.f9333l;
        int i2 = r23Var.f9334m;
        if (i2 == 0) {
            fg1.m1627T(obj);
            if (j > 0) {
                o72 o72Var2 = new o72();
                try {
                    r23Var.f9332k = o72Var2;
                    r23Var.f9334m = 1;
                    q23 q23Var = new q23(j, r23Var);
                    o72Var2.f7574i = q23Var;
                    Object objM1819d = m1819d(q23Var, mn0Var);
                    k20 k20Var = k20.f5323h;
                    return objM1819d == k20Var ? k20Var : objM1819d;
                } catch (p23 e) {
                    e = e;
                    o72Var = o72Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o72Var = r23Var.f9332k;
        try {
            fg1.m1627T(obj);
            return obj;
        } catch (p23 e2) {
            e = e2;
        }
        if (e.f7954h != o72Var.f7574i) {
            throw e;
        }
        return null;
    }
}
