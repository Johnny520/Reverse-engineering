package p245u0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p119Y.C1723g;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: u0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C3299F extends AbstractC3301H implements Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final String f10198d;

    /* JADX INFO: renamed from: e */
    public final float f10199e;

    /* JADX INFO: renamed from: f */
    public final float f10200f;

    /* JADX INFO: renamed from: g */
    public final float f10201g;

    /* JADX INFO: renamed from: h */
    public final float f10202h;

    /* JADX INFO: renamed from: i */
    public final float f10203i;

    /* JADX INFO: renamed from: j */
    public final float f10204j;

    /* JADX INFO: renamed from: k */
    public final float f10205k;

    /* JADX INFO: renamed from: l */
    public final List f10206l;

    /* JADX INFO: renamed from: m */
    public final List f10207m;

    public C3299F(String str, float f2, float f5, float f6, float f7, float f8, float f9, float f10, List list, ArrayList arrayList) {
        this.f10198d = str;
        this.f10199e = f2;
        this.f10200f = f5;
        this.f10201g = f6;
        this.f10202h = f7;
        this.f10203i = f8;
        this.f10204j = f9;
        this.f10205k = f10;
        this.f10206l = list;
        this.f10207m = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C3299F)) {
            C3299F c3299f = (C3299F) obj;
            return AbstractC1665j.m2981a(this.f10198d, c3299f.f10198d) && this.f10199e == c3299f.f10199e && this.f10200f == c3299f.f10200f && this.f10201g == c3299f.f10201g && this.f10202h == c3299f.f10202h && this.f10203i == c3299f.f10203i && this.f10204j == c3299f.f10204j && this.f10205k == c3299f.f10205k && AbstractC1665j.m2981a(this.f10206l, c3299f.f10206l) && AbstractC1665j.m2981a(this.f10207m, c3299f.f10207m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10207m.hashCode() + ((this.f10206l.hashCode() + AbstractC0231b.m390a(this.f10205k, AbstractC0231b.m390a(this.f10204j, AbstractC0231b.m390a(this.f10203i, AbstractC0231b.m390a(this.f10202h, AbstractC0231b.m390a(this.f10201g, AbstractC0231b.m390a(this.f10200f, AbstractC0231b.m390a(this.f10199e, this.f10198d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1723g(this);
    }
}
