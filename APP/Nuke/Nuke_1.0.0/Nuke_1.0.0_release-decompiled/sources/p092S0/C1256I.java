package p092S0;

import java.util.List;
import p011B4.AbstractC0231b;
import p110W0.InterfaceC1580e;
import p117X2.AbstractC1665j;
import p153e1.C2005a;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: S0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1256I {

    /* JADX INFO: renamed from: a */
    public final C1269g f4516a;

    /* JADX INFO: renamed from: b */
    public final C1260M f4517b;

    /* JADX INFO: renamed from: c */
    public final List f4518c;

    /* JADX INFO: renamed from: d */
    public final int f4519d;

    /* JADX INFO: renamed from: e */
    public final boolean f4520e;

    /* JADX INFO: renamed from: f */
    public final int f4521f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2007c f4522g;

    /* JADX INFO: renamed from: h */
    public final EnumC2017m f4523h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1580e f4524i;

    /* JADX INFO: renamed from: j */
    public final long f4525j;

    public C1256I(C1269g c1269g, C1260M c1260m, List list, int i5, boolean z5, int i6, InterfaceC2007c interfaceC2007c, EnumC2017m enumC2017m, InterfaceC1580e interfaceC1580e, long j5) {
        this.f4516a = c1269g;
        this.f4517b = c1260m;
        this.f4518c = list;
        this.f4519d = i5;
        this.f4520e = z5;
        this.f4521f = i6;
        this.f4522g = interfaceC2007c;
        this.f4523h = enumC2017m;
        this.f4524i = interfaceC1580e;
        this.f4525j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1256I)) {
            return false;
        }
        C1256I c1256i = (C1256I) obj;
        return AbstractC1665j.m2981a(this.f4516a, c1256i.f4516a) && AbstractC1665j.m2981a(this.f4517b, c1256i.f4517b) && AbstractC1665j.m2981a(this.f4518c, c1256i.f4518c) && this.f4519d == c1256i.f4519d && this.f4520e == c1256i.f4520e && this.f4521f == c1256i.f4521f && AbstractC1665j.m2981a(this.f4522g, c1256i.f4522g) && this.f4523h == c1256i.f4523h && AbstractC1665j.m2981a(this.f4524i, c1256i.f4524i) && C2005a.m3674b(this.f4525j, c1256i.f4525j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4525j) + ((this.f4524i.hashCode() + ((this.f4523h.hashCode() + ((this.f4522g.hashCode() + AbstractC0231b.m391b(this.f4521f, AbstractC0231b.m395f((((this.f4518c.hashCode() + AbstractC0231b.m393d(this.f4516a.hashCode() * 31, 31, this.f4517b)) * 31) + this.f4519d) * 31, 31, this.f4520e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f4516a);
        sb.append(", style=");
        sb.append(this.f4517b);
        sb.append(", placeholders=");
        sb.append(this.f4518c);
        sb.append(", maxLines=");
        sb.append(this.f4519d);
        sb.append(", softWrap=");
        sb.append(this.f4520e);
        sb.append(", overflow=");
        int i5 = this.f4521f;
        sb.append((Object) (i5 == 1 ? "Clip" : i5 == 2 ? "Ellipsis" : i5 == 5 ? "MiddleEllipsis" : i5 == 3 ? "Visible" : i5 == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f4522g);
        sb.append(", layoutDirection=");
        sb.append(this.f4523h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f4524i);
        sb.append(", constraints=");
        sb.append((Object) C2005a.m3683k(this.f4525j));
        sb.append(')');
        return sb.toString();
    }
}
