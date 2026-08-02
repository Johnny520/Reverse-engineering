package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 implements of1 {

    /* JADX INFO: renamed from: a */
    public final y81 f12874a;

    /* JADX INFO: renamed from: b */
    public final int f12875b;

    /* JADX INFO: renamed from: c */
    public final boolean f12876c;

    /* JADX INFO: renamed from: d */
    public final float f12877d;

    /* JADX INFO: renamed from: e */
    public final of1 f12878e;

    /* JADX INFO: renamed from: f */
    public final float f12879f;

    /* JADX INFO: renamed from: g */
    public final boolean f12880g;

    /* JADX INFO: renamed from: h */
    public final j20 f12881h;

    /* JADX INFO: renamed from: i */
    public final e70 f12882i;

    /* JADX INFO: renamed from: j */
    public final long f12883j;

    /* JADX INFO: renamed from: k */
    public final List f12884k;

    /* JADX INFO: renamed from: l */
    public final int f12885l;

    /* JADX INFO: renamed from: m */
    public final int f12886m;

    /* JADX INFO: renamed from: n */
    public final int f12887n;

    /* JADX INFO: renamed from: o */
    public final qv1 f12888o;

    /* JADX INFO: renamed from: p */
    public final int f12889p;

    /* JADX INFO: renamed from: q */
    public final int f12890q;

    public x81(y81 y81Var, int i, boolean z, float f, of1 of1Var, float f2, boolean z2, j20 j20Var, e70 e70Var, long j, List list, int i2, int i3, int i4, qv1 qv1Var, int i5, int i6) {
        this.f12874a = y81Var;
        this.f12875b = i;
        this.f12876c = z;
        this.f12877d = f;
        this.f12878e = of1Var;
        this.f12879f = f2;
        this.f12880g = z2;
        this.f12881h = j20Var;
        this.f12882i = e70Var;
        this.f12883j = j;
        this.f12884k = list;
        this.f12885l = i2;
        this.f12886m = i3;
        this.f12887n = i4;
        this.f12888o = qv1Var;
        this.f12889p = i5;
        this.f12890q = i6;
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: a */
    public final Map mo104a() {
        return this.f12878e.mo104a();
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: b */
    public final void mo105b() {
        this.f12878e.mo105b();
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: c */
    public final int mo106c() {
        return this.f12878e.mo106c();
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: d */
    public final in0 mo107d() {
        return this.f12878e.mo107d();
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: e */
    public final int mo108e() {
        return this.f12878e.mo108e();
    }

    /* JADX INFO: renamed from: f */
    public final x81 m6046f(int i, boolean z) {
        y81 y81Var;
        if (this.f12880g) {
            return null;
        }
        List list = this.f12884k;
        if (list.isEmpty() || (y81Var = this.f12874a) == null) {
            return null;
        }
        int i2 = y81Var.f13358l;
        int i3 = this.f12875b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        y81 y81Var2 = (y81) AbstractC0142du.m1159o0(list);
        y81 y81Var3 = (y81) AbstractC0142du.m1166v0(list);
        if (y81Var2.f13360n || y81Var3.f13360n) {
            return null;
        }
        int i4 = y81Var2.f13356j;
        int i5 = this.f12886m;
        int i6 = this.f12885l;
        if (i < 0) {
            if (Math.min((i4 + y81Var2.f13358l) - i6, (y81Var3.f13356j + y81Var3.f13358l) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - y81Var3.f13356j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            y81 y81Var4 = (y81) list.get(i7);
            y81Var4.getClass();
            int[] iArr = y81Var4.f13362p;
            if (!y81Var4.f13360n) {
                y81Var4.f13356j += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = y81Var4.f13348b.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        vi0.m5701t(y81Var4.f13355i.f12855a.m4505g(y81Var4.f13353g));
                    }
                }
            }
        }
        return new x81(this.f12874a, i3, this.f12876c || i > 0, i, this.f12878e, this.f12879f, this.f12880g, this.f12881h, this.f12882i, this.f12883j, list, this.f12885l, this.f12886m, this.f12887n, this.f12888o, this.f12889p, this.f12890q);
    }

    /* JADX INFO: renamed from: g */
    public final long m6047g() {
        of1 of1Var = this.f12878e;
        return (((long) of1Var.mo108e()) << 32) | (((long) of1Var.mo106c()) & 4294967295L);
    }
}
