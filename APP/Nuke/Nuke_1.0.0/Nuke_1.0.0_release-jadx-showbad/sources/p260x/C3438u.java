package p260x;

import p000A.C0020K;
import p028F.C0352m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p152e0.InterfaceC1996c;
import p186k.AbstractC2415L;
import p186k.C2408E;
import p255w.C3377h;

/* JADX INFO: renamed from: x.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3438u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1996c f10740a;

    /* JADX INFO: renamed from: b */
    public final C0020K f10741b;

    /* JADX INFO: renamed from: c */
    public final C2408E f10742c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3438u(InterfaceC1996c interfaceC1996c, C0020K c0020k) {
        this.f10740a = interfaceC1996c;
        this.f10741b = c0020k;
        long[] jArr = AbstractC2415L.f7816a;
        this.f10742c = new C2408E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC1603e m5703a(int i5, Object obj, Object obj2) {
        C2408E c2408e = this.f10742c;
        C3437t c3437t = (C3437t) c2408e.m4272g(obj);
        if (c3437t != null && c3437t.f10737c == i5 && AbstractC1665j.m2981a(c3437t.f10736b, obj2)) {
            C1843e c1843e = c3437t.f10738d;
            if (c1843e != null) {
                return c1843e;
            }
            C1843e c1843e2 = new C1843e(818252804, true, new C0352m(13, c3437t.f10739e, c3437t));
            c3437t.f10738d = c1843e2;
            return c1843e2;
        }
        C3437t c3437t2 = new C3437t(this, i5, obj, obj2);
        c2408e.m4278m(obj, c3437t2);
        C1843e c1843e3 = c3437t2.f10738d;
        if (c1843e3 != null) {
            return c1843e3;
        }
        C1843e c1843e4 = new C1843e(818252804, true, new C0352m(13, this, c3437t2));
        c3437t2.f10738d = c1843e4;
        return c1843e4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m5704b(Object obj) {
        if (obj == null) {
            return null;
        }
        C3437t c3437t = (C3437t) this.f10742c.m4272g(obj);
        if (c3437t != null) {
            return c3437t.f10736b;
        }
        C3377h c3377h = (C3377h) this.f10741b.mo6a();
        int iM1343g = c3377h.f10498d.m1343g(obj);
        if (iM1343g != -1) {
            return c3377h.m5610b(iM1343g);
        }
        return null;
    }
}
