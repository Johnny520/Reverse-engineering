package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y81 {
    public final int a;
    public final List b;
    public final pk c;
    public final d61 d;
    public final int e;
    public final long f;
    public final Object g;
    public final Object h;
    public final x71 i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;
    public int o = Integer.MIN_VALUE;
    public final int[] p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y81(int i, List list, pk pkVar, d61 d61Var, int i2, int i3, int i4, long j, Object obj, Object obj2, x71 x71Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = pkVar;
        this.d = d61Var;
        this.e = i4;
        this.f = j;
        this.g = obj;
        this.h = obj2;
        this.i = x71Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            sz1 sz1Var = (sz1) list.get(i6);
            i5 += sz1Var.i;
            iMax = Math.max(iMax, sz1Var.h);
        }
        this.k = i5;
        int i7 = i5 + this.e;
        this.l = i7 >= 0 ? i7 : 0;
        this.m = iMax;
        this.p = new int[this.b.size() * 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(int i) {
        if (i == 0 && this.b.size() == 0) {
            return ((long) this.j) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.p;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(rz1 rz1Var) {
        oq0 oq0Var = oq0.w;
        if (this.o == Integer.MIN_VALUE) {
            nz0.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sz1 sz1Var = (sz1) list.get(i);
            int i2 = sz1Var.i;
            long jA = a(i);
            vi0.t(this.i.a.g(this.g));
            long jC = z01.c(jA, this.f);
            int i3 = tz1.b;
            rz1Var.getClass();
            rz1.a(rz1Var, sz1Var);
            sz1Var.f0(z01.c(jC, sz1Var.l), 0.0f, oq0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, int i2, int i3) {
        this.j = i;
        this.o = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            sz1 sz1Var = (sz1) list.get(i4);
            int i5 = i4 * 2;
            pk pkVar = this.c;
            if (pkVar == null) {
                nz0.b("null horizontalAlignment when isVertical == true");
                s.b();
                return;
            }
            int iA = pkVar.a(sz1Var.h, i2, this.d);
            int[] iArr = this.p;
            iArr[i5] = iA;
            iArr[i5 + 1] = i;
            i += sz1Var.i;
        }
    }
}
