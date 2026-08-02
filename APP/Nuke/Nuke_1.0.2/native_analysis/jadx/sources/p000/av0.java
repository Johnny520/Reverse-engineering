package p000;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class av0 {

    /* JADX INFO: renamed from: a */
    public final C0209fn f402a;

    /* JADX INFO: renamed from: c */
    public boolean f404c;

    /* JADX INFO: renamed from: g */
    public int f408g;

    /* JADX INFO: renamed from: h */
    public int f409h;

    /* JADX INFO: renamed from: b */
    public int f403b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f405d = 4096;

    /* JADX INFO: renamed from: e */
    public gs0[] f406e = new gs0[8];

    /* JADX INFO: renamed from: f */
    public int f407f = 7;

    public av0(C0209fn c0209fn) {
        this.f402a = c0209fn;
    }

    /* JADX INFO: renamed from: a */
    public final void m291a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f406e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f407f;
                if (length < i2 || i <= 0) {
                    break;
                }
                gs0 gs0Var = this.f406e[length];
                gs0Var.getClass();
                i -= gs0Var.f3694c;
                int i4 = this.f409h;
                gs0 gs0Var2 = this.f406e[length];
                gs0Var2.getClass();
                this.f409h = i4 - gs0Var2.f3694c;
                this.f408g--;
                i3++;
                length--;
            }
            gs0[] gs0VarArr = this.f406e;
            int i5 = i2 + 1;
            System.arraycopy(gs0VarArr, i5, gs0VarArr, i5 + i3, this.f408g);
            gs0[] gs0VarArr2 = this.f406e;
            int i6 = this.f407f + 1;
            Arrays.fill(gs0VarArr2, i6, i6 + i3, (Object) null);
            this.f407f += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m292b(gs0 gs0Var) {
        int i = gs0Var.f3694c;
        int i2 = this.f405d;
        if (i > i2) {
            gs0[] gs0VarArr = this.f406e;
            AbstractC0460mg.m3094i0(gs0VarArr, 0, gs0VarArr.length);
            this.f407f = this.f406e.length - 1;
            this.f408g = 0;
            this.f409h = 0;
            return;
        }
        m291a((this.f409h + i) - i2);
        int i3 = this.f408g + 1;
        gs0[] gs0VarArr2 = this.f406e;
        if (i3 > gs0VarArr2.length) {
            gs0[] gs0VarArr3 = new gs0[gs0VarArr2.length * 2];
            System.arraycopy(gs0VarArr2, 0, gs0VarArr3, gs0VarArr2.length, gs0VarArr2.length);
            this.f407f = this.f406e.length - 1;
            this.f406e = gs0VarArr3;
        }
        int i4 = this.f407f;
        this.f407f = i4 - 1;
        this.f406e[i4] = gs0Var;
        this.f408g++;
        this.f409h += i;
    }

    /* JADX INFO: renamed from: c */
    public final void m293c(C0505no c0505no) throws EOFException {
        c0505no.getClass();
        int[] iArr = ax0.f431a;
        int iMo3322a = c0505no.mo3322a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iMo3322a; i++) {
            byte bMo3325d = c0505no.mo3325d(i);
            byte[] bArr = ug3.f11300a;
            j2 += (long) ax0.f432b[bMo3325d & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iMo3322a2 = c0505no.mo3322a();
        C0209fn c0209fn = this.f402a;
        if (i2 >= iMo3322a2) {
            m295e(c0505no.mo3322a(), 127, 0);
            c0209fn.m1667B(c0505no);
            return;
        }
        C0209fn c0209fn2 = new C0209fn();
        int[] iArr2 = ax0.f431a;
        int iMo3322a3 = c0505no.mo3322a();
        int i3 = 0;
        for (int i4 = 0; i4 < iMo3322a3; i4++) {
            byte bMo3325d2 = c0505no.mo3325d(i4);
            byte[] bArr2 = ug3.f11300a;
            int i5 = bMo3325d2 & 255;
            int i6 = ax0.f431a[i5];
            byte b = ax0.f432b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                c0209fn2.m1670E((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c0209fn2.m1670E((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        C0505no c0505noMo1678f = c0209fn2.mo1678f(c0209fn2.f3068i);
        m295e(c0505noMo1678f.mo3322a(), 127, 128);
        c0209fn.m1667B(c0505noMo1678f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m294d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f404c) {
            int i = this.f403b;
            if (i < this.f405d) {
                m295e(i, 31, 32);
            }
            this.f404c = false;
            this.f403b = Integer.MAX_VALUE;
            m295e(this.f405d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gs0 gs0Var = (gs0) arrayList.get(i2);
            C0505no c0505noMo3330i = gs0Var.f3692a.mo3330i();
            C0505no c0505no = gs0Var.f3693b;
            Integer num = (Integer) bv0.f1042b.get(c0505noMo3330i);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    gs0[] gs0VarArr = bv0.f1041a;
                    if (t11.m5086l(gs0VarArr[iIntValue].f3693b, c0505no)) {
                        length = length2;
                    } else if (t11.m5086l(gs0VarArr[length2].f3693b, c0505no)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i3 = this.f407f + 1;
                int length3 = this.f406e.length;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    gs0 gs0Var2 = this.f406e[i3];
                    gs0Var2.getClass();
                    if (t11.m5086l(gs0Var2.f3692a, c0505noMo3330i)) {
                        gs0 gs0Var3 = this.f406e[i3];
                        gs0Var3.getClass();
                        if (t11.m5086l(gs0Var3.f3693b, c0505no)) {
                            length2 = bv0.f1041a.length + (i3 - this.f407f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f407f) + bv0.f1041a.length;
                        }
                    }
                    i3++;
                }
            }
            if (length2 != -1) {
                m295e(length2, 127, 128);
            } else if (length == -1) {
                this.f402a.m1670E(64);
                m293c(c0505noMo3330i);
                m293c(c0505no);
                m292b(gs0Var);
            } else {
                C0505no c0505no2 = gs0.f3686d;
                c0505noMo3330i.getClass();
                c0505no2.getClass();
                if (!c0505noMo3330i.mo3327f(c0505no2, c0505no2.mo3322a()) || t11.m5086l(gs0.f3691i, c0505noMo3330i)) {
                    m295e(length, 63, 64);
                    m293c(c0505no);
                    m292b(gs0Var);
                } else {
                    m295e(length, 15, 0);
                    m293c(c0505no);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m295e(int i, int i2, int i3) {
        C0209fn c0209fn = this.f402a;
        if (i < i2) {
            c0209fn.m1670E(i | i3);
            return;
        }
        c0209fn.m1670E(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c0209fn.m1670E(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c0209fn.m1670E(i4);
    }
}
