package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kv1 extends p7 {
    public int n;
    public int p;
    public int r;
    public iv1[] m = new iv1[16];
    public int[] o = new int[16];
    public Object[] q = new Object[16];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U() {
        this.n = 0;
        this.p = 0;
        Arrays.fill(this.q, 0, this.r, (Object) null);
        this.r = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void V(rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        if (this.n != 0) {
            bo0 bo0Var = new bo0(this);
            kv1 kv1Var = (kv1) bo0Var.e;
            while (true) {
                iv1 iv1Var = kv1Var.m[bo0Var.b];
                ao0 ao0VarB = iv1Var.b(bo0Var);
                rf rfVar2 = rfVar;
                tr2 tr2Var2 = tr2Var;
                z72 z72Var2 = z72Var;
                jv1 jv1Var2 = jv1Var;
                try {
                    iv1Var.a(bo0Var, rfVar2, tr2Var2, z72Var2, jv1Var2);
                    int i = bo0Var.b;
                    int i2 = kv1Var.n;
                    if (i < i2) {
                        iv1 iv1Var2 = kv1Var.m[i];
                        bo0Var.c += iv1Var2.a;
                        bo0Var.d += iv1Var2.b;
                        int i3 = i + 1;
                        bo0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        rfVar = rfVar2;
                        tr2Var = tr2Var2;
                        z72Var = z72Var2;
                        jv1Var = jv1Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean W() {
        return this.n == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(iv1 iv1Var) {
        int i = this.n;
        iv1[] iv1VarArr = this.m;
        if (i == iv1VarArr.length) {
            iv1[] iv1VarArr2 = new iv1[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(iv1VarArr, 0, iv1VarArr2, 0, i);
            this.m = iv1VarArr2;
        }
        int i2 = this.p;
        int i3 = iv1Var.a;
        int i4 = iv1Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.o;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            mg.a0(iArr, iArr2, 0, 0, length);
            this.o = iArr2;
        }
        int i7 = this.r + i4;
        Object[] objArr = this.q;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.q = objArr2;
        }
        iv1[] iv1VarArr3 = this.m;
        int i9 = this.n;
        this.n = i9 + 1;
        iv1VarArr3[i9] = iv1Var;
        this.p += iv1Var.a;
        this.r += i4;
    }
}
