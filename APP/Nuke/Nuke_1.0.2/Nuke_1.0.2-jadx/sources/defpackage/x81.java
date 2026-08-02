package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 implements of1 {
    public final y81 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final of1 e;
    public final float f;
    public final boolean g;
    public final j20 h;
    public final e70 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final qv1 o;
    public final int p;
    public final int q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x81(y81 y81Var, int i, boolean z, float f, of1 of1Var, float f2, boolean z2, j20 j20Var, e70 e70Var, long j, List list, int i2, int i3, int i4, qv1 qv1Var, int i5, int i6) {
        this.a = y81Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = of1Var;
        this.f = f2;
        this.g = z2;
        this.h = j20Var;
        this.i = e70Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = qv1Var;
        this.p = i5;
        this.q = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final Map a() {
        return this.e.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final void b() {
        this.e.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final int c() {
        return this.e.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final in0 d() {
        return this.e.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.of1
    public final int e() {
        return this.e.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x81 f(int i, boolean z) {
        y81 y81Var;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (y81Var = this.a) == null) {
            return null;
        }
        int i2 = y81Var.l;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        y81 y81Var2 = (y81) du.o0(list);
        y81 y81Var3 = (y81) du.v0(list);
        if (y81Var2.n || y81Var3.n) {
            return null;
        }
        int i4 = y81Var2.j;
        int i5 = this.m;
        int i6 = this.l;
        if (i < 0) {
            if (Math.min((i4 + y81Var2.l) - i6, (y81Var3.j + y81Var3.l) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - y81Var3.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            y81 y81Var4 = (y81) list.get(i7);
            y81Var4.getClass();
            int[] iArr = y81Var4.p;
            if (!y81Var4.n) {
                y81Var4.j += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = y81Var4.b.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        vi0.t(y81Var4.i.a.g(y81Var4.g));
                    }
                }
            }
        }
        return new x81(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long g() {
        of1 of1Var = this.e;
        return (((long) of1Var.e()) << 32) | (((long) of1Var.c()) & 4294967295L);
    }
}
