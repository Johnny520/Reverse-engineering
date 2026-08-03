package th;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p116i.C1746e0;
import p320vh.C4579f;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: th.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C4210b extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4209a f13804a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1220a f13805b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1231l f13806c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1231l f13807d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1231l f13808e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1235p f13809f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1231l f13810g;

    /* JADX INFO: renamed from: h */
    public final boolean f13811h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4210b(InterfaceC4209a interfaceC4209a, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l4, boolean z9) {
        interfaceC4209a.getClass();
        interfaceC1220a.getClass();
        interfaceC1231l.getClass();
        this.f13804a = interfaceC4209a;
        this.f13805b = interfaceC1220a;
        this.f13806c = interfaceC1231l;
        this.f13807d = interfaceC1231l2;
        this.f13808e = interfaceC1231l3;
        this.f13809f = interfaceC1235p;
        this.f13810g = interfaceC1231l4;
        this.f13811h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4210b)) {
            return false;
        }
        C4210b c4210b = (C4210b) obj;
        return AbstractC1416l.m3825a(this.f13804a, c4210b.f13804a) && AbstractC1416l.m3825a(this.f13805b, c4210b.f13805b) && AbstractC1416l.m3825a(this.f13806c, c4210b.f13806c) && AbstractC1416l.m3825a(this.f13807d, c4210b.f13807d) && AbstractC1416l.m3825a(this.f13808e, c4210b.f13808e) && this.f13809f.equals(c4210b.f13809f) && AbstractC1416l.m3825a(this.f13810g, c4210b.f13810g) && this.f13811h == c4210b.f13811h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C4217i(this.f13804a, this.f13805b, this.f13806c, this.f13807d, this.f13808e, this.f13809f, this.f13810g, this.f13811h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C4217i c4217i = (C4217i) abstractC5852n;
        c4217i.getClass();
        boolean z9 = c4217i.f13863A;
        boolean z10 = this.f13811h;
        boolean z11 = z9 != z10;
        InterfaceC4209a interfaceC4209a = this.f13804a;
        interfaceC4209a.getClass();
        c4217i.f13874u = interfaceC4209a;
        InterfaceC1220a interfaceC1220a = this.f13805b;
        interfaceC1220a.getClass();
        C4579f c4579f = c4217i.f13864B;
        c4579f.getClass();
        c4579f.f15084c = interfaceC1220a;
        InterfaceC1231l interfaceC1231l = this.f13806c;
        interfaceC1231l.getClass();
        c4217i.f13875v = interfaceC1231l;
        c4217i.f13876w = this.f13807d;
        c4217i.f13877x = this.f13808e;
        c4217i.f13878y = this.f13809f;
        c4217i.f13879z = this.f13810g;
        c4217i.f13863A = z10;
        if (z11) {
            if (!z10) {
                c4217i.m8487o1();
            }
            AbstractC5618k.m10157m(c4217i);
        }
        AbstractC5618k.m10162r(c4217i, new C1746e0(c4217i, 26));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f13806c.hashCode() + ((this.f13805b.hashCode() + (this.f13804a.hashCode() * 31)) * 31)) * 31;
        InterfaceC1231l interfaceC1231l = this.f13807d;
        int iHashCode2 = (iHashCode + (interfaceC1231l != null ? interfaceC1231l.hashCode() : 0)) * 31;
        InterfaceC1231l interfaceC1231l2 = this.f13808e;
        int iHashCode3 = (this.f13809f.hashCode() + ((iHashCode2 + (interfaceC1231l2 != null ? interfaceC1231l2.hashCode() : 0)) * 961)) * 31;
        InterfaceC1231l interfaceC1231l3 = this.f13810g;
        return Boolean.hashCode(this.f13811h) + AbstractC0921a.m2242e(3, (iHashCode3 + (interfaceC1231l3 != null ? interfaceC1231l3.hashCode() : 0)) * 961, 31);
    }
}
