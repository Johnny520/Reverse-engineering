package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zu0 {
    public long c;
    public final o52 d;
    public int g;
    public int h;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public gs0[] e = new gs0[8];
    public int f = 7;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zu0(sv0 sv0Var) {
        this.d = new o52(sv0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(gs0 gs0Var) {
        this.b.add(gs0Var);
        long jA = this.c + ((long) (gs0Var.b.a() + gs0Var.a.a()));
        this.c = jA;
        if (jA <= 262144) {
            return;
        }
        c80.v("header byte count limit of 262144 exceeded");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                gs0 gs0Var = this.e[length];
                gs0Var.getClass();
                int i4 = gs0Var.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            gs0[] gs0VarArr = this.e;
            System.arraycopy(gs0VarArr, i2 + 1, gs0VarArr, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final no c(int i) throws IOException {
        if (i >= 0) {
            gs0[] gs0VarArr = bv0.a;
            if (i <= gs0VarArr.length - 1) {
                return gs0VarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - bv0.a.length);
        if (length >= 0) {
            gs0[] gs0VarArr2 = this.e;
            if (length < gs0VarArr2.length) {
                gs0 gs0Var = gs0VarArr2[length];
                gs0Var.getClass();
                return gs0Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(gs0 gs0Var) {
        a(gs0Var);
        int i = gs0Var.c;
        int i2 = this.a;
        if (i > i2) {
            gs0[] gs0VarArr = this.e;
            mg.i0(gs0VarArr, 0, gs0VarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
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
    public final no e() {
        o52 o52Var = this.d;
        byte b = o52Var.readByte();
        byte[] bArr = ug3.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jF = f(i, 127);
        if (this.c + jF > 262144) {
            c80.v("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return o52Var.f(jF);
        }
        fn fnVar = new fn();
        int[] iArr = ax0.a;
        o52Var.getClass();
        ko koVar = ax0.c;
        ko koVar2 = koVar;
        int i3 = 0;
        for (long j = 0; j < jF; j++) {
            byte b2 = o52Var.readByte();
            byte[] bArr2 = ug3.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                ko[] koVarArr = (ko[]) koVar2.j;
                koVarArr.getClass();
                koVar2 = koVarArr[(i2 >>> (i3 - 8)) & 255];
                koVar2.getClass();
                if (((ko[]) koVar2.j) == null) {
                    fnVar.E(koVar2.h);
                    i3 -= koVar2.i;
                    koVar2 = koVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            ko[] koVarArr2 = (ko[]) koVar2.j;
            koVarArr2.getClass();
            ko koVar3 = koVarArr2[(i2 << (8 - i3)) & 255];
            koVar3.getClass();
            int i4 = koVar3.i;
            if (((ko[]) koVar3.j) != null || i4 > i3) {
                break;
            }
            fnVar.E(koVar3.h);
            i3 -= i4;
            koVar2 = koVar;
        }
        return fnVar.f(fnVar.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte b = this.d.readByte();
            byte[] bArr = ug3.a;
            i4++;
            long j2 = ((long) (b & 127)) << i5;
            if (j2 > 2147483647L - j) {
                c80.v("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((b & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        c80.v("HPACK integer overflow");
        return 0;
    }
}
