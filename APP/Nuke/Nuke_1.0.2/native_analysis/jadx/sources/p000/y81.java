package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y81 {

    /* JADX INFO: renamed from: a */
    public final int f13347a;

    /* JADX INFO: renamed from: b */
    public final List f13348b;

    /* JADX INFO: renamed from: c */
    public final C0583pk f13349c;

    /* JADX INFO: renamed from: d */
    public final d61 f13350d;

    /* JADX INFO: renamed from: e */
    public final int f13351e;

    /* JADX INFO: renamed from: f */
    public final long f13352f;

    /* JADX INFO: renamed from: g */
    public final Object f13353g;

    /* JADX INFO: renamed from: h */
    public final Object f13354h;

    /* JADX INFO: renamed from: i */
    public final x71 f13355i;

    /* JADX INFO: renamed from: j */
    public int f13356j;

    /* JADX INFO: renamed from: k */
    public final int f13357k;

    /* JADX INFO: renamed from: l */
    public final int f13358l;

    /* JADX INFO: renamed from: m */
    public final int f13359m;

    /* JADX INFO: renamed from: n */
    public boolean f13360n;

    /* JADX INFO: renamed from: o */
    public int f13361o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public final int[] f13362p;

    public y81(int i, List list, C0583pk c0583pk, d61 d61Var, int i2, int i3, int i4, long j, Object obj, Object obj2, x71 x71Var, long j2) {
        this.f13347a = i;
        this.f13348b = list;
        this.f13349c = c0583pk;
        this.f13350d = d61Var;
        this.f13351e = i4;
        this.f13352f = j;
        this.f13353g = obj;
        this.f13354h = obj2;
        this.f13355i = x71Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            sz1 sz1Var = (sz1) list.get(i6);
            i5 += sz1Var.f10439i;
            iMax = Math.max(iMax, sz1Var.f10438h);
        }
        this.f13357k = i5;
        int i7 = i5 + this.f13351e;
        this.f13358l = i7 >= 0 ? i7 : 0;
        this.f13359m = iMax;
        this.f13362p = new int[this.f13348b.size() * 2];
    }

    /* JADX INFO: renamed from: a */
    public final long m6225a(int i) {
        if (i == 0 && this.f13348b.size() == 0) {
            return ((long) this.f13356j) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.f13362p;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    /* JADX INFO: renamed from: b */
    public final void m6226b(rz1 rz1Var) {
        oq0 oq0Var = oq0.f7785w;
        if (this.f13361o == Integer.MIN_VALUE) {
            nz0.m3456a("position() should be called first");
        }
        List list = this.f13348b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sz1 sz1Var = (sz1) list.get(i);
            int i2 = sz1Var.f10439i;
            long jM6225a = m6225a(i);
            vi0.m5701t(this.f13355i.f12855a.m4505g(this.f13353g));
            long jM6373c = z01.m6373c(jM6225a, this.f13352f);
            int i3 = tz1.f11011b;
            rz1Var.getClass();
            rz1.m4638a(rz1Var, sz1Var);
            sz1Var.mo2506f0(z01.m6373c(jM6373c, sz1Var.f10442l), 0.0f, oq0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6227c(int i, int i2, int i3) {
        this.f13356j = i;
        this.f13361o = i3;
        List list = this.f13348b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            sz1 sz1Var = (sz1) list.get(i4);
            int i5 = i4 * 2;
            C0583pk c0583pk = this.f13349c;
            if (c0583pk == null) {
                nz0.m3457b("null horizontalAlignment when isVertical == true");
                C0676s.m4644b();
                return;
            }
            int iM3868a = c0583pk.m3868a(sz1Var.f10438h, i2, this.f13350d);
            int[] iArr = this.f13362p;
            iArr[i5] = iM3868a;
            iArr[i5 + 1] = i;
            i += sz1Var.f10439i;
        }
    }
}
