package p123Y3;

import java.util.Collections;
import java.util.List;
import p000A.C0099z;
import p061L2.AbstractC0973m;
import p092S0.C1286x;
import p117X2.AbstractC1665j;
import p117X2.C1660e;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p143c3.AbstractC1907i;
import p143c3.C1904f;

/* JADX INFO: renamed from: Y3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1771b extends AbstractC1785a {

    /* JADX INFO: renamed from: h */
    public final C1660e f6066h;

    /* JADX INFO: renamed from: i */
    public final Object f6067i;

    /* JADX INFO: renamed from: j */
    public final AbstractC1785a f6068j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1771b(C1660e c1660e, Object obj, AbstractC1785a abstractC1785a) {
        AbstractC1665j.m2985e(obj, "value");
        AbstractC1665j.m2985e(abstractC1785a, "next");
        this.f6066h = c1660e;
        this.f6067i = obj;
        this.f6068j = abstractC1785a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p128a.AbstractC1785a
    /* JADX INFO: renamed from: k */
    public final Object mo3155k(C1660e c1660e) {
        return c1660e.equals(this.f6066h) ? AbstractC1784a.m3238x(c1660e).cast(this.f6067i) : this.f6068j.mo3155k(c1660e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p128a.AbstractC1785a
    /* JADX INFO: renamed from: p */
    public final AbstractC1785a mo3156p(C1660e c1660e, Object obj) {
        C1660e c1660e2 = this.f6066h;
        boolean zEquals = c1660e.equals(c1660e2);
        AbstractC1785a c1771b = this.f6068j;
        if (!zEquals) {
            AbstractC1785a abstractC1785aMo3156p = c1771b.mo3156p(c1660e, null);
            c1771b = abstractC1785aMo3156p == c1771b ? this : new C1771b(c1660e2, this.f6067i, abstractC1785aMo3156p);
        }
        return obj != null ? new C1771b(c1660e, obj, c1771b) : c1771b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        List listM2027h0;
        List listM3392v = AbstractC1907i.m3392v(new C1904f(new C0099z(17, this), new C1286x(18), 1));
        if (listM3392v.size() <= 1) {
            listM2027h0 = AbstractC0973m.m2024e0(listM3392v);
        } else {
            listM2027h0 = AbstractC0973m.m2027h0(listM3392v);
            Collections.reverse(listM2027h0);
        }
        return AbstractC0973m.m2016W(listM2027h0, null, "{", "}", new C1286x(19), 25);
    }
}
