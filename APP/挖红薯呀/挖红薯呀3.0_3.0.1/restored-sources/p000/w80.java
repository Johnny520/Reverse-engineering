package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w80 {

    /* JADX INFO: renamed from: a */
    public final int f7031a;

    /* JADX INFO: renamed from: b */
    public final List f7032b;

    /* JADX INFO: renamed from: c */
    public final C0239ga f7033c;

    /* JADX INFO: renamed from: d */
    public final int f7034d;

    /* JADX INFO: renamed from: e */
    public final long f7035e;

    /* JADX INFO: renamed from: f */
    public final Object f7036f;

    /* JADX INFO: renamed from: g */
    public final Object f7037g;

    /* JADX INFO: renamed from: h */
    public final l70 f7038h;

    /* JADX INFO: renamed from: i */
    public int f7039i;

    /* JADX INFO: renamed from: j */
    public final int f7040j;

    /* JADX INFO: renamed from: k */
    public final int f7041k;

    /* JADX INFO: renamed from: l */
    public final int f7042l;

    /* JADX INFO: renamed from: m */
    public boolean f7043m;

    /* JADX INFO: renamed from: n */
    public int f7044n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: o */
    public final int[] f7045o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w80(int i, List list, C0239ga c0239ga, k50 k50Var, int i2, int i3, int i4, long j, Object obj, Object obj2, l70 l70Var, long j2) {
        this.f7031a = i;
        this.f7032b = list;
        this.f7033c = c0239ga;
        this.f7034d = i4;
        this.f7035e = j;
        this.f7036f = obj;
        this.f7037g = obj2;
        this.f7038h = l70Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            xq0 xq0Var = (xq0) list.get(i6);
            i5 += xq0Var.f7400d;
            iMax = Math.max(iMax, xq0Var.f7401e);
        }
        this.f7040j = i5;
        int i7 = i5 + this.f7034d;
        this.f7041k = i7 >= 0 ? i7 : 0;
        this.f7042l = iMax;
        this.f7045o = new int[this.f7032b.size() * 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m4922a(int i) {
        if (i == 0 && this.f7032b.size() == 0) {
            return ((long) this.f7039i) << 32;
        }
        int i2 = i * 2;
        int[] iArr = this.f7045o;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4923b(wq0 wq0Var) {
        if (this.f7044n == Integer.MIN_VALUE) {
            z10.m5361a("position() should be called first");
        }
        List list = this.f7032b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xq0 xq0Var = (xq0) list.get(i);
            int i2 = xq0Var.f7400d;
            long jM4922a = m4922a(i);
            AbstractC0748t1.m4160r(this.f7038h.f3371a.m1701g(this.f7036f));
            wq0.m5019n(wq0Var, xq0Var, w20.m4835c(jM4922a, this.f7035e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4924c(int i, int i2, int i3) {
        this.f7039i = i;
        this.f7044n = i2;
        List list = this.f7032b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            xq0 xq0Var = (xq0) list.get(i4);
            int i5 = i4 * 2;
            int[] iArr = this.f7045o;
            iArr[i5] = i;
            int i6 = i5 + 1;
            C0239ga c0239ga = this.f7033c;
            if (c0239ga == null) {
                z10.m5362b("null verticalAlignment when isVertical == false");
                throw new C0725sg();
            }
            iArr[i6] = c0239ga.m1234a(xq0Var.f7401e, i3);
            i += xq0Var.f7400d;
        }
    }
}
