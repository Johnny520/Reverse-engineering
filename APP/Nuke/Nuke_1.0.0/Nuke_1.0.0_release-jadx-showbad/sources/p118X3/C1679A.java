package p118X3;

import p014C1.C0240b;
import p056K2.C0882h;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p123Y3.C1770a;
import p128a.AbstractC1785a;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: X3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1679A {

    /* JADX INFO: renamed from: a */
    public final C1709s f5712a;

    /* JADX INFO: renamed from: b */
    public final String f5713b;

    /* JADX INFO: renamed from: c */
    public final C1707q f5714c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1682D f5715d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1785a f5716e;

    /* JADX INFO: renamed from: f */
    public C1693c f5717f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1679A(C0240b c0240b) {
        AbstractC1665j.m2985e(c0240b, "builder");
        C1709s c1709s = (C1709s) c0240b.f808a;
        if (c1709s == null) {
            throw new IllegalStateException("url == null");
        }
        this.f5712a = c1709s;
        this.f5713b = (String) c0240b.f809b;
        this.f5714c = ((C1706p) c0240b.f810c).m3024c();
        this.f5715d = (AbstractC1682D) c0240b.f811d;
        this.f5716e = (AbstractC1785a) c0240b.f812e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0240b m3001a() {
        C0240b c0240b = new C0240b();
        c0240b.f808a = this.f5712a;
        c0240b.f809b = this.f5713b;
        c0240b.f811d = this.f5715d;
        c0240b.f812e = this.f5716e;
        c0240b.f810c = this.f5714c.m3040c();
        return c0240b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f5713b);
        sb.append(", url=");
        sb.append(this.f5712a);
        C1707q c1707q = this.f5714c;
        if (c1707q.size() != 0) {
            sb.append(", headers=[");
            int i5 = 0;
            for (Object obj : c1707q) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    AbstractC2352g.m4187J();
                    throw null;
                }
                C0882h c0882h = (C0882h) obj;
                String str = (String) c0882h.f2769d;
                String str2 = (String) c0882h.f2770e;
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (AbstractC1774e.m3169j(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i5 = i6;
            }
            sb.append(']');
        }
        C1770a c1770a = C1770a.f6065h;
        AbstractC1785a abstractC1785a = this.f5716e;
        if (!AbstractC1665j.m2981a(abstractC1785a, c1770a)) {
            sb.append(", tags=");
            sb.append(abstractC1785a);
        }
        sb.append('}');
        return sb.toString();
    }
}
