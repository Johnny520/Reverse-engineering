package p119i2;

import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p177m2.InterfaceC2760d;
import p293u2.C4231a;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: i2.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1933j0 {

    /* JADX INFO: renamed from: a */
    public final C1926g f6549a;

    /* JADX INFO: renamed from: b */
    public final C1941n0 f6550b;

    /* JADX INFO: renamed from: c */
    public final List f6551c;

    /* JADX INFO: renamed from: d */
    public final int f6552d;

    /* JADX INFO: renamed from: e */
    public final boolean f6553e;

    /* JADX INFO: renamed from: f */
    public final int f6554f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4233c f6555g;

    /* JADX INFO: renamed from: h */
    public final EnumC4243m f6556h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2760d f6557i;

    /* JADX INFO: renamed from: j */
    public final long f6558j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1933j0(C1926g c1926g, C1941n0 c1941n0, List list, int i9, boolean z9, int i10, InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m, InterfaceC2760d interfaceC2760d, long j3) {
        this.f6549a = c1926g;
        this.f6550b = c1941n0;
        this.f6551c = list;
        this.f6552d = i9;
        this.f6553e = z9;
        this.f6554f = i10;
        this.f6555g = interfaceC4233c;
        this.f6556h = enumC4243m;
        this.f6557i = interfaceC2760d;
        this.f6558j = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1933j0)) {
            return false;
        }
        C1933j0 c1933j0 = (C1933j0) obj;
        return AbstractC1416l.m3825a(this.f6549a, c1933j0.f6549a) && AbstractC1416l.m3825a(this.f6550b, c1933j0.f6550b) && AbstractC1416l.m3825a(this.f6551c, c1933j0.f6551c) && this.f6552d == c1933j0.f6552d && this.f6553e == c1933j0.f6553e && this.f6554f == c1933j0.f6554f && AbstractC1416l.m3825a(this.f6555g, c1933j0.f6555g) && this.f6556h == c1933j0.f6556h && AbstractC1416l.m3825a(this.f6557i, c1933j0.f6557i) && C4231a.m8498b(this.f6558j, c1933j0.f6558j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f6558j) + ((this.f6557i.hashCode() + ((this.f6556h.hashCode() + ((this.f6555g.hashCode() + AbstractC0921a.m2242e(this.f6554f, AbstractC0921a.m2245h((AbstractC2091b.m5158e(this.f6551c, (this.f6550b.hashCode() + (this.f6549a.hashCode() * 31)) * 31, 31) + this.f6552d) * 31, 31, this.f6553e), 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f6549a);
        sb2.append(", style=");
        sb2.append(this.f6550b);
        sb2.append(", placeholders=");
        sb2.append(this.f6551c);
        sb2.append(", maxLines=");
        sb2.append(this.f6552d);
        sb2.append(", softWrap=");
        sb2.append(this.f6553e);
        sb2.append(", overflow=");
        int i9 = this.f6554f;
        sb2.append((Object) (i9 == 1 ? "Clip" : i9 == 2 ? "Ellipsis" : i9 == 5 ? "MiddleEllipsis" : i9 == 3 ? "Visible" : i9 == 4 ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.f6555g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f6556h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f6557i);
        sb2.append(", constraints=");
        sb2.append((Object) C4231a.m8507k(this.f6558j));
        sb2.append(')');
        return sb2.toString();
    }
}
