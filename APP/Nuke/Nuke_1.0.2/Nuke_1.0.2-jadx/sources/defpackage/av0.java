package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class av0 {
    public final fn a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public gs0[] e = new gs0[8];
    public int f = 7;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public av0(fn fnVar) {
        this.a = fnVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                gs0 gs0Var = this.e[length];
                gs0Var.getClass();
                i -= gs0Var.c;
                int i4 = this.h;
                gs0 gs0Var2 = this.e[length];
                gs0Var2.getClass();
                this.h = i4 - gs0Var2.c;
                this.g--;
                i3++;
                length--;
            }
            gs0[] gs0VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(gs0VarArr, i5, gs0VarArr, i5 + i3, this.g);
            gs0[] gs0VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(gs0VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(gs0 gs0Var) {
        int i = gs0Var.c;
        int i2 = this.d;
        if (i > i2) {
            gs0[] gs0VarArr = this.e;
            mg.i0(gs0VarArr, 0, gs0VarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        gs0[] gs0VarArr2 = this.e;
        if (i3 > gs0VarArr2.length) {
            gs0[] gs0VarArr3 = new gs0[gs0VarArr2.length * 2];
            System.arraycopy(gs0VarArr2, 0, gs0VarArr3, gs0VarArr2.length, gs0VarArr2.length);
            this.f = this.e.length - 1;
            this.e = gs0VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = gs0Var;
        this.g++;
        this.h += i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(no noVar) throws EOFException {
        noVar.getClass();
        int[] iArr = ax0.a;
        int iA = noVar.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iA; i++) {
            byte bD = noVar.d(i);
            byte[] bArr = ug3.a;
            j2 += (long) ax0.b[bD & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iA2 = noVar.a();
        fn fnVar = this.a;
        if (i2 >= iA2) {
            e(noVar.a(), 127, 0);
            fnVar.B(noVar);
            return;
        }
        fn fnVar2 = new fn();
        int[] iArr2 = ax0.a;
        int iA3 = noVar.a();
        int i3 = 0;
        for (int i4 = 0; i4 < iA3; i4++) {
            byte bD2 = noVar.d(i4);
            byte[] bArr2 = ug3.a;
            int i5 = bD2 & 255;
            int i6 = ax0.a[i5];
            byte b = ax0.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                fnVar2.E((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            fnVar2.E((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        no noVarF = fnVar2.f(fnVar2.i);
        e(noVarF.a(), 127, 128);
        fnVar.B(noVarF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gs0 gs0Var = (gs0) arrayList.get(i2);
            no noVarI = gs0Var.a.i();
            no noVar = gs0Var.b;
            Integer num = (Integer) bv0.b.get(noVarI);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    gs0[] gs0VarArr = bv0.a;
                    if (t11.l(gs0VarArr[iIntValue].b, noVar)) {
                        length = length2;
                    } else if (t11.l(gs0VarArr[length2].b, noVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i3 = this.f + 1;
                int length3 = this.e.length;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    gs0 gs0Var2 = this.e[i3];
                    gs0Var2.getClass();
                    if (t11.l(gs0Var2.a, noVarI)) {
                        gs0 gs0Var3 = this.e[i3];
                        gs0Var3.getClass();
                        if (t11.l(gs0Var3.b, noVar)) {
                            length2 = bv0.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + bv0.a.length;
                        }
                    }
                    i3++;
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.E(64);
                c(noVarI);
                c(noVar);
                b(gs0Var);
            } else {
                no noVar2 = gs0.d;
                noVarI.getClass();
                noVar2.getClass();
                if (!noVarI.f(noVar2, noVar2.a()) || t11.l(gs0.i, noVarI)) {
                    e(length, 63, 64);
                    c(noVar);
                    b(gs0Var);
                } else {
                    e(length, 15, 0);
                    c(noVar);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, int i2, int i3) {
        fn fnVar = this.a;
        if (i < i2) {
            fnVar.E(i | i3);
            return;
        }
        fnVar.E(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fnVar.E(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fnVar.E(i4);
    }
}
