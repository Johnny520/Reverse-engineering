package p245u0;

import java.util.List;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p211o0.AbstractC2758q;

/* JADX INFO: renamed from: u0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C3303J extends AbstractC3301H {

    /* JADX INFO: renamed from: d */
    public final String f10215d;

    /* JADX INFO: renamed from: e */
    public final List f10216e;

    /* JADX INFO: renamed from: f */
    public final int f10217f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2758q f10218g;

    /* JADX INFO: renamed from: h */
    public final float f10219h;

    /* JADX INFO: renamed from: i */
    public final AbstractC2758q f10220i;

    /* JADX INFO: renamed from: j */
    public final float f10221j;

    /* JADX INFO: renamed from: k */
    public final float f10222k;

    /* JADX INFO: renamed from: l */
    public final int f10223l;

    /* JADX INFO: renamed from: m */
    public final int f10224m;

    /* JADX INFO: renamed from: n */
    public final float f10225n;

    /* JADX INFO: renamed from: o */
    public final float f10226o;

    /* JADX INFO: renamed from: p */
    public final float f10227p;

    /* JADX INFO: renamed from: q */
    public final float f10228q;

    public C3303J(String str, List list, int i5, AbstractC2758q abstractC2758q, float f2, AbstractC2758q abstractC2758q2, float f5, float f6, int i6, int i7, float f7, float f8, float f9, float f10) {
        this.f10215d = str;
        this.f10216e = list;
        this.f10217f = i5;
        this.f10218g = abstractC2758q;
        this.f10219h = f2;
        this.f10220i = abstractC2758q2;
        this.f10221j = f5;
        this.f10222k = f6;
        this.f10223l = i6;
        this.f10224m = i7;
        this.f10225n = f7;
        this.f10226o = f8;
        this.f10227p = f9;
        this.f10228q = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3303J.class == obj.getClass()) {
            C3303J c3303j = (C3303J) obj;
            return AbstractC1665j.m2981a(this.f10215d, c3303j.f10215d) && AbstractC1665j.m2981a(this.f10218g, c3303j.f10218g) && this.f10219h == c3303j.f10219h && AbstractC1665j.m2981a(this.f10220i, c3303j.f10220i) && this.f10221j == c3303j.f10221j && this.f10222k == c3303j.f10222k && this.f10223l == c3303j.f10223l && this.f10224m == c3303j.f10224m && this.f10225n == c3303j.f10225n && this.f10226o == c3303j.f10226o && this.f10227p == c3303j.f10227p && this.f10228q == c3303j.f10228q && this.f10217f == c3303j.f10217f && AbstractC1665j.m2981a(this.f10216e, c3303j.f10216e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10216e.hashCode() + (this.f10215d.hashCode() * 31)) * 31;
        AbstractC2758q abstractC2758q = this.f10218g;
        int iM390a = AbstractC0231b.m390a(this.f10219h, (iHashCode + (abstractC2758q != null ? abstractC2758q.hashCode() : 0)) * 31, 31);
        AbstractC2758q abstractC2758q2 = this.f10220i;
        return Integer.hashCode(this.f10217f) + AbstractC0231b.m390a(this.f10228q, AbstractC0231b.m390a(this.f10227p, AbstractC0231b.m390a(this.f10226o, AbstractC0231b.m390a(this.f10225n, AbstractC0231b.m391b(this.f10224m, AbstractC0231b.m391b(this.f10223l, AbstractC0231b.m390a(this.f10222k, AbstractC0231b.m390a(this.f10221j, (iM390a + (abstractC2758q2 != null ? abstractC2758q2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
