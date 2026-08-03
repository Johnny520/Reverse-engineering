package p176m1;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p068eh.AbstractC0921a;
import p114hg.InterfaceC1711a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: m1.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2733g0 extends AbstractC2737i0 implements Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final String f8879g;

    /* JADX INFO: renamed from: h */
    public final float f8880h;

    /* JADX INFO: renamed from: i */
    public final float f8881i;

    /* JADX INFO: renamed from: j */
    public final float f8882j;

    /* JADX INFO: renamed from: k */
    public final float f8883k;

    /* JADX INFO: renamed from: l */
    public final float f8884l;

    /* JADX INFO: renamed from: m */
    public final float f8885m;

    /* JADX INFO: renamed from: n */
    public final float f8886n;

    /* JADX INFO: renamed from: o */
    public final List f8887o;

    /* JADX INFO: renamed from: p */
    public final List f8888p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2733g0(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.f8879g = str;
        this.f8880h = f3;
        this.f8881i = f10;
        this.f8882j = f11;
        this.f8883k = f12;
        this.f8884l = f13;
        this.f8885m = f14;
        this.f8886n = f15;
        this.f8887o = list;
        this.f8888p = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2733g0)) {
            C2733g0 c2733g0 = (C2733g0) obj;
            return AbstractC1416l.m3825a(this.f8879g, c2733g0.f8879g) && this.f8880h == c2733g0.f8880h && this.f8881i == c2733g0.f8881i && this.f8882j == c2733g0.f8882j && this.f8883k == c2733g0.f8883k && this.f8884l == c2733g0.f8884l && this.f8885m == c2733g0.f8885m && this.f8886n == c2733g0.f8886n && AbstractC1416l.m3825a(this.f8887o, c2733g0.f8887o) && AbstractC1416l.m3825a(this.f8888p, c2733g0.f8888p);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8888p.hashCode() + AbstractC2091b.m5158e(this.f8887o, AbstractC0921a.m2241d(this.f8886n, AbstractC0921a.m2241d(this.f8885m, AbstractC0921a.m2241d(this.f8884l, AbstractC0921a.m2241d(this.f8883k, AbstractC0921a.m2241d(this.f8882j, AbstractC0921a.m2241d(this.f8881i, AbstractC0921a.m2241d(this.f8880h, this.f8879g.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2731f0(this);
    }
}
