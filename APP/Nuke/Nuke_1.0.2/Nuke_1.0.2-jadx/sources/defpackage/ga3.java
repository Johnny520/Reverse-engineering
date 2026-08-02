package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ga3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(hh1 hh1Var, o12 o12Var, long j) {
        m60 m60Var = (m60) hh1Var.i;
        m60Var.getClass();
        bb2 bb2Var = m60Var.b;
        bb2 bb2Var2 = m60Var.a;
        boolean zO = tp0.o(o12Var);
        long j2 = o12Var.b;
        if (zO) {
            i40[] i40VarArr = (i40[]) bb2Var2.e;
            mg.i0(i40VarArr, 0, i40VarArr.length);
            bb2Var2.c = 0;
            i40[] i40VarArr2 = (i40[]) bb2Var.e;
            mg.i0(i40VarArr2, 0, i40VarArr2.length);
            bb2Var.c = 0;
            m60Var.c = 0L;
        }
        if (!tp0.q(o12Var)) {
            List list = o12Var.m;
            if (list == null) {
                list = be0.h;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                ts0 ts0Var = (ts0) list.get(i);
                m60Var.a(ts0Var.a, rs1.e(ts0Var.e, j));
                i++;
            }
            m60Var.a(j2, rs1.e(o12Var.n, j));
        }
        if (tp0.q(o12Var) && j2 - m60Var.c > 40) {
            i40[] i40VarArr3 = (i40[]) bb2Var2.e;
            mg.i0(i40VarArr3, 0, i40VarArr3.length);
            bb2Var2.c = 0;
            i40[] i40VarArr4 = (i40[]) bb2Var.e;
            mg.i0(i40VarArr4, 0, i40VarArr4.length);
            bb2Var.c = 0;
            m60Var.c = 0L;
        }
        m60Var.c = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            kz0.a("At least one point must be provided");
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
                float fB = b(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(b(fArr7, fArr7));
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
                fArr10[i13] = i13 < i9 ? 0.0f : b(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fB2 = b(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fB2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fB2 / fArr11[i14];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object d(q23 q23Var, mn0 mn0Var) {
        xe1.H(q23Var, true, new fa0(0, eu.K(q23Var.k.f()).g(q23Var.l, q23Var, q23Var.j)));
        return ze3.b(q23Var, false, q23Var, mn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object e(long j, v0 v0Var, dw0 dw0Var) {
        if (j > 0) {
            return d(new q23(j, dw0Var), v0Var);
        }
        throw new p23("Timed out immediately", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(long j, mn0 mn0Var, u00 u00Var) {
        r23 r23Var;
        o72 o72Var;
        if (u00Var instanceof r23) {
            r23Var = (r23) u00Var;
            int i = r23Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                r23Var.m = i - Integer.MIN_VALUE;
            } else {
                r23Var = new r23(u00Var);
            }
        }
        Object obj = r23Var.l;
        int i2 = r23Var.m;
        if (i2 == 0) {
            fg1.T(obj);
            if (j > 0) {
                o72 o72Var2 = new o72();
                try {
                    r23Var.k = o72Var2;
                    r23Var.m = 1;
                    q23 q23Var = new q23(j, r23Var);
                    o72Var2.i = q23Var;
                    Object objD = d(q23Var, mn0Var);
                    k20 k20Var = k20.h;
                    return objD == k20Var ? k20Var : objD;
                } catch (p23 e) {
                    e = e;
                    o72Var = o72Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o72Var = r23Var.k;
        try {
            fg1.T(obj);
            return obj;
        } catch (p23 e2) {
            e = e2;
        }
        if (e.h != o72Var.i) {
            throw e;
        }
        return null;
    }
}
