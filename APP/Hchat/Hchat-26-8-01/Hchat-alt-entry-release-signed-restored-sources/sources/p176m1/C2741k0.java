package p176m1;

import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1027s;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: m1.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2741k0 extends AbstractC2737i0 {

    /* JADX INFO: renamed from: g */
    public final String f8930g;

    /* JADX INFO: renamed from: h */
    public final List f8931h;

    /* JADX INFO: renamed from: i */
    public final int f8932i;

    /* JADX INFO: renamed from: j */
    public final AbstractC1027s f8933j;

    /* JADX INFO: renamed from: k */
    public final float f8934k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1027s f8935l;

    /* JADX INFO: renamed from: m */
    public final float f8936m;

    /* JADX INFO: renamed from: n */
    public final float f8937n;

    /* JADX INFO: renamed from: o */
    public final int f8938o;

    /* JADX INFO: renamed from: p */
    public final int f8939p;

    /* JADX INFO: renamed from: q */
    public final float f8940q;

    /* JADX INFO: renamed from: r */
    public final float f8941r;

    /* JADX INFO: renamed from: s */
    public final float f8942s;

    /* JADX INFO: renamed from: t */
    public final float f8943t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2741k0(String str, List list, int i9, AbstractC1027s abstractC1027s, float f3, AbstractC1027s abstractC1027s2, float f10, float f11, int i10, int i11, float f12, float f13, float f14, float f15) {
        this.f8930g = str;
        this.f8931h = list;
        this.f8932i = i9;
        this.f8933j = abstractC1027s;
        this.f8934k = f3;
        this.f8935l = abstractC1027s2;
        this.f8936m = f10;
        this.f8937n = f11;
        this.f8938o = i10;
        this.f8939p = i11;
        this.f8940q = f12;
        this.f8941r = f13;
        this.f8942s = f14;
        this.f8943t = f15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2741k0.class == obj.getClass()) {
            C2741k0 c2741k0 = (C2741k0) obj;
            return AbstractC1416l.m3825a(this.f8930g, c2741k0.f8930g) && AbstractC1416l.m3825a(this.f8933j, c2741k0.f8933j) && this.f8934k == c2741k0.f8934k && AbstractC1416l.m3825a(this.f8935l, c2741k0.f8935l) && this.f8936m == c2741k0.f8936m && this.f8937n == c2741k0.f8937n && this.f8938o == c2741k0.f8938o && this.f8939p == c2741k0.f8939p && this.f8940q == c2741k0.f8940q && this.f8941r == c2741k0.f8941r && this.f8942s == c2741k0.f8942s && this.f8943t == c2741k0.f8943t && this.f8932i == c2741k0.f8932i && AbstractC1416l.m3825a(this.f8931h, c2741k0.f8931h);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM5158e = AbstractC2091b.m5158e(this.f8931h, this.f8930g.hashCode() * 31, 31);
        AbstractC1027s abstractC1027s = this.f8933j;
        int iM2241d = AbstractC0921a.m2241d(this.f8934k, (iM5158e + (abstractC1027s != null ? abstractC1027s.hashCode() : 0)) * 31, 31);
        AbstractC1027s abstractC1027s2 = this.f8935l;
        return Integer.hashCode(this.f8932i) + AbstractC0921a.m2241d(this.f8943t, AbstractC0921a.m2241d(this.f8942s, AbstractC0921a.m2241d(this.f8941r, AbstractC0921a.m2241d(this.f8940q, AbstractC0921a.m2242e(this.f8939p, AbstractC0921a.m2242e(this.f8938o, AbstractC0921a.m2241d(this.f8937n, AbstractC0921a.m2241d(this.f8936m, (iM2241d + (abstractC1027s2 != null ? abstractC1027s2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
