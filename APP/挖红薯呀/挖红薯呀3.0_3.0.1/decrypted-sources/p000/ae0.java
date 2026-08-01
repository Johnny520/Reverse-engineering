package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ae0 {

    /* JADX INFO: renamed from: a */
    public final int f133a;

    /* JADX INFO: renamed from: b */
    public final List f134b;

    /* JADX INFO: renamed from: c */
    public final long f135c;

    /* JADX INFO: renamed from: d */
    public final Object f136d;

    /* JADX INFO: renamed from: e */
    public final C0239ga f137e;

    /* JADX INFO: renamed from: f */
    public final k50 f138f;

    /* JADX INFO: renamed from: g */
    public final boolean f139g = false;

    /* JADX INFO: renamed from: h */
    public final int f140h;

    /* JADX INFO: renamed from: i */
    public final int[] f141i;

    /* JADX INFO: renamed from: j */
    public int f142j;

    /* JADX INFO: renamed from: k */
    public int f143k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ae0(int i, int i2, List list, long j, Object obj, C0239ga c0239ga, k50 k50Var) {
        this.f133a = i;
        this.f134b = list;
        this.f135c = j;
        this.f136d = obj;
        this.f137e = c0239ga;
        this.f138f = k50Var;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            xq0 xq0Var = (xq0) list.get(i3);
            iMax = Math.max(iMax, !this.f139g ? xq0Var.f7401e : xq0Var.f7400d);
        }
        this.f140h = iMax;
        this.f141i = new int[this.f134b.size() * 2];
        this.f143k = Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m129a(int i) {
        this.f142j += i;
        int[] iArr = this.f141i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.f139g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m130b(int i, int i2, int i3) {
        int i4;
        this.f142j = i;
        boolean z = this.f139g;
        this.f143k = z ? i3 : i2;
        List list = this.f134b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            xq0 xq0Var = (xq0) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.f141i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f138f != k50.f3015d ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - xq0Var.f7400d) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = xq0Var.f7401e;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                C0239ga c0239ga = this.f137e;
                if (c0239ga == null) {
                    z10.m5362b("null verticalAlignment");
                    throw new C0725sg();
                }
                iArr[i7] = c0239ga.m1234a(xq0Var.f7401e, i3);
                i4 = xq0Var.f7400d;
            }
            i += i4;
        }
    }
}
