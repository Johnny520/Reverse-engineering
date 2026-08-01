package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zn0 implements yd0 {

    /* JADX INFO: renamed from: a */
    public final List f7937a;

    /* JADX INFO: renamed from: b */
    public final int f7938b;

    /* JADX INFO: renamed from: c */
    public final int f7939c;

    /* JADX INFO: renamed from: d */
    public final int f7940d;

    /* JADX INFO: renamed from: e */
    public final um0 f7941e;

    /* JADX INFO: renamed from: f */
    public final int f7942f;

    /* JADX INFO: renamed from: g */
    public final int f7943g;

    /* JADX INFO: renamed from: h */
    public final int f7944h;

    /* JADX INFO: renamed from: i */
    public final ae0 f7945i;

    /* JADX INFO: renamed from: j */
    public final ae0 f7946j;

    /* JADX INFO: renamed from: k */
    public final float f7947k;

    /* JADX INFO: renamed from: l */
    public final int f7948l;

    /* JADX INFO: renamed from: m */
    public final boolean f7949m;

    /* JADX INFO: renamed from: n */
    public final C0496n2 f7950n;

    /* JADX INFO: renamed from: o */
    public final yd0 f7951o;

    /* JADX INFO: renamed from: p */
    public final boolean f7952p;

    /* JADX INFO: renamed from: q */
    public final List f7953q;

    /* JADX INFO: renamed from: r */
    public final List f7954r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0966yk f7955s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC0968ym f7956t;

    /* JADX INFO: renamed from: u */
    public final long f7957u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zn0(List list, int i, int i2, int i3, um0 um0Var, int i4, int i5, int i6, ae0 ae0Var, ae0 ae0Var2, float f, int i7, boolean z, C0496n2 c0496n2, yd0 yd0Var, boolean z2, List list2, List list3, InterfaceC0966yk interfaceC0966yk, InterfaceC0968ym interfaceC0968ym, long j) {
        this.f7937a = list;
        this.f7938b = i;
        this.f7939c = i2;
        this.f7940d = i3;
        this.f7941e = um0Var;
        this.f7942f = i4;
        this.f7943g = i5;
        this.f7944h = i6;
        this.f7945i = ae0Var;
        this.f7946j = ae0Var2;
        this.f7947k = f;
        this.f7948l = i7;
        this.f7949m = z;
        this.f7950n = c0496n2;
        this.f7951o = yd0Var;
        this.f7952p = z2;
        this.f7953q = list2;
        this.f7954r = list3;
        this.f7955s = interfaceC0966yk;
        this.f7956t = interfaceC0968ym;
        this.f7957u = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: a */
    public final Map mo667a() {
        return this.f7951o.mo667a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: b */
    public final void mo668b() {
        this.f7951o.mo668b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: c */
    public final int mo669c() {
        return this.f7951o.mo669c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: d */
    public final InterfaceC0742sw mo1678d() {
        return this.f7951o.mo1678d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd0
    /* JADX INFO: renamed from: e */
    public final int mo670e() {
        return this.f7951o.mo670e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final zn0 m5598f(int i) {
        int i2;
        int i3 = this.f7938b + this.f7939c;
        if (this.f7952p) {
            return null;
        }
        List list = this.f7937a;
        if (list.isEmpty() || this.f7945i == null || (i2 = this.f7948l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.f7947k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.f7946j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        ae0 ae0Var = (ae0) AbstractC0960ye.m5240J(list);
        ae0 ae0Var2 = (ae0) AbstractC0960ye.m5246P(list);
        int i4 = this.f7943g;
        int i5 = this.f7942f;
        if (i < 0) {
            if (Math.min((ae0Var.f142j + i3) - i5, (ae0Var2.f142j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - ae0Var.f142j, i4 - ae0Var2.f142j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((ae0) list.get(i6)).m129a(i);
        }
        List list2 = this.f7953q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((ae0) list2.get(i7)).m129a(i);
        }
        List list3 = this.f7954r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((ae0) list3.get(i8)).m129a(i);
        }
        return new zn0(this.f7937a, this.f7938b, this.f7939c, this.f7940d, this.f7941e, this.f7942f, this.f7943g, this.f7944h, this.f7945i, this.f7946j, f, i2, this.f7949m || i > 0, this.f7950n, this.f7951o, this.f7952p, this.f7953q, this.f7954r, this.f7955s, this.f7956t, this.f7957u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final long m5599g() {
        yd0 yd0Var = this.f7951o;
        return (((long) yd0Var.mo670e()) << 32) | (((long) yd0Var.mo669c()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zn0(int i, int i2, int i3, int i4, int i5, int i6, C0496n2 c0496n2, yd0 yd0Var, InterfaceC0966yk interfaceC0966yk, InterfaceC0968ym interfaceC0968ym, long j) {
        C0294hs c0294hs = C0294hs.f2354d;
        this(c0294hs, i, i2, i3, um0.f6265e, i4, i5, i6, null, null, 0.0f, 0, false, c0496n2, yd0Var, false, c0294hs, c0294hs, interfaceC0966yk, interfaceC0968ym, j);
    }
}
