package p000;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zu0 {

    /* JADX INFO: renamed from: c */
    public long f14102c;

    /* JADX INFO: renamed from: d */
    public final o52 f14103d;

    /* JADX INFO: renamed from: g */
    public int f14106g;

    /* JADX INFO: renamed from: h */
    public int f14107h;

    /* JADX INFO: renamed from: a */
    public int f14100a = 4096;

    /* JADX INFO: renamed from: b */
    public final ArrayList f14101b = new ArrayList();

    /* JADX INFO: renamed from: e */
    public gs0[] f14104e = new gs0[8];

    /* JADX INFO: renamed from: f */
    public int f14105f = 7;

    public zu0(sv0 sv0Var) {
        this.f14103d = new o52(sv0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m6505a(gs0 gs0Var) {
        this.f14101b.add(gs0Var);
        long jMo3322a = this.f14102c + ((long) (gs0Var.f3693b.mo3322a() + gs0Var.f3692a.mo3322a()));
        this.f14102c = jMo3322a;
        if (jMo3322a <= 262144) {
            return;
        }
        c80.m678v("header byte count limit of 262144 exceeded");
    }

    /* JADX INFO: renamed from: b */
    public final int m6506b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f14104e.length;
            while (true) {
                length--;
                i2 = this.f14105f;
                if (length < i2 || i <= 0) {
                    break;
                }
                gs0 gs0Var = this.f14104e[length];
                gs0Var.getClass();
                int i4 = gs0Var.f3694c;
                i -= i4;
                this.f14107h -= i4;
                this.f14106g--;
                i3++;
            }
            gs0[] gs0VarArr = this.f14104e;
            System.arraycopy(gs0VarArr, i2 + 1, gs0VarArr, i2 + 1 + i3, this.f14106g);
            this.f14105f += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final C0505no m6507c(int i) throws IOException {
        if (i >= 0) {
            gs0[] gs0VarArr = bv0.f1041a;
            if (i <= gs0VarArr.length - 1) {
                return gs0VarArr[i].f3692a;
            }
        }
        int length = this.f14105f + 1 + (i - bv0.f1041a.length);
        if (length >= 0) {
            gs0[] gs0VarArr2 = this.f14104e;
            if (length < gs0VarArr2.length) {
                gs0 gs0Var = gs0VarArr2[length];
                gs0Var.getClass();
                return gs0Var.f3692a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: d */
    public final void m6508d(gs0 gs0Var) {
        m6505a(gs0Var);
        int i = gs0Var.f3694c;
        int i2 = this.f14100a;
        if (i > i2) {
            gs0[] gs0VarArr = this.f14104e;
            AbstractC0460mg.m3094i0(gs0VarArr, 0, gs0VarArr.length);
            this.f14105f = this.f14104e.length - 1;
            this.f14106g = 0;
            this.f14107h = 0;
            return;
        }
        m6506b((this.f14107h + i) - i2);
        int i3 = this.f14106g + 1;
        gs0[] gs0VarArr2 = this.f14104e;
        if (i3 > gs0VarArr2.length) {
            gs0[] gs0VarArr3 = new gs0[gs0VarArr2.length * 2];
            System.arraycopy(gs0VarArr2, 0, gs0VarArr3, gs0VarArr2.length, gs0VarArr2.length);
            this.f14105f = this.f14104e.length - 1;
            this.f14104e = gs0VarArr3;
        }
        int i4 = this.f14105f;
        this.f14105f = i4 - 1;
        this.f14104e[i4] = gs0Var;
        this.f14106g++;
        this.f14107h += i;
    }

    /* JADX INFO: renamed from: e */
    public final C0505no m6509e() {
        o52 o52Var = this.f14103d;
        byte b = o52Var.readByte();
        byte[] bArr = ug3.f11300a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jM6510f = m6510f(i, 127);
        if (this.f14102c + jM6510f > 262144) {
            c80.m678v("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return o52Var.mo1678f(jM6510f);
        }
        C0209fn c0209fn = new C0209fn();
        int[] iArr = ax0.f431a;
        o52Var.getClass();
        C0394ko c0394ko = ax0.f433c;
        C0394ko c0394ko2 = c0394ko;
        int i3 = 0;
        for (long j = 0; j < jM6510f; j++) {
            byte b2 = o52Var.readByte();
            byte[] bArr2 = ug3.f11300a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                C0394ko[] c0394koArr = (C0394ko[]) c0394ko2.f5687j;
                c0394koArr.getClass();
                c0394ko2 = c0394koArr[(i2 >>> (i3 - 8)) & 255];
                c0394ko2.getClass();
                if (((C0394ko[]) c0394ko2.f5687j) == null) {
                    c0209fn.m1670E(c0394ko2.f5685h);
                    i3 -= c0394ko2.f5686i;
                    c0394ko2 = c0394ko;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            C0394ko[] c0394koArr2 = (C0394ko[]) c0394ko2.f5687j;
            c0394koArr2.getClass();
            C0394ko c0394ko3 = c0394koArr2[(i2 << (8 - i3)) & 255];
            c0394ko3.getClass();
            int i4 = c0394ko3.f5686i;
            if (((C0394ko[]) c0394ko3.f5687j) != null || i4 > i3) {
                break;
            }
            c0209fn.m1670E(c0394ko3.f5685h);
            i3 -= i4;
            c0394ko2 = c0394ko;
        }
        return c0209fn.mo1678f(c0209fn.f3068i);
    }

    /* JADX INFO: renamed from: f */
    public final int m6510f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte b = this.f14103d.readByte();
            byte[] bArr = ug3.f11300a;
            i4++;
            long j2 = ((long) (b & 127)) << i5;
            if (j2 > 2147483647L - j) {
                c80.m678v("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((b & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        c80.m678v("HPACK integer overflow");
        return 0;
    }
}
