package p110W0;

import android.graphics.Typeface;
import com.bumptech.glide.AbstractC1926h;
import java.util.LinkedHashMap;
import p000A.C0038T0;
import p000A.C0049a;
import p000A.C0066i0;
import p002A1.C0115D;
import p074O2.C1052j;
import p121Y1.C1753n;
import p128a.AbstractC1785a;
import p130a1.AbstractC1795h;
import p160f3.AbstractC2162v;
import p160f3.C2140i0;
import p166g3.C2187d;
import p186k.C2435q;

/* JADX INFO: renamed from: W0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1581f implements InterfaceC1580e {

    /* JADX INFO: renamed from: a */
    public final C0115D f5492a;

    /* JADX INFO: renamed from: b */
    public final C1576a f5493b;

    /* JADX INFO: renamed from: c */
    public final C0038T0 f5494c;

    /* JADX INFO: renamed from: d */
    public final C1584i f5495d;

    /* JADX INFO: renamed from: e */
    public final C0066i0 f5496e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1581f(C0115D c0115d, C1576a c1576a) {
        C0038T0 c0038t0 = AbstractC1582g.f5497a;
        C0038T0 c0038t02 = AbstractC1582g.f5497a;
        C1584i c1584i = new C1584i();
        C1583h c1583h = C1584i.f5498a;
        C2187d c2187d = AbstractC1795h.f6130a;
        c1583h.getClass();
        AbstractC2162v.m3979a(AbstractC1785a.m3254o(c1583h, c2187d).mo1168m(C1052j.f3286d).mo1168m(new C2140i0(null)));
        C0066i0 c0066i0 = new C0066i0(25);
        this.f5492a = c0115d;
        this.f5493b = c1576a;
        this.f5494c = c0038t0;
        this.f5495d = c1584i;
        this.f5496e = c0066i0;
        new C0049a(15, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: Exception -> 0x00a8, TRY_ENTER, TryCatch #1 {Exception -> 0x00a8, blocks: (B:25:0x0042, B:27:0x0055, B:30:0x005a, B:32:0x005e, B:38:0x0077, B:55:0x00a0, B:56:0x00a7, B:34:0x0067, B:35:0x0069, B:36:0x006c, B:37:0x0072), top: B:64:0x0042 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1594s m2853a(C1593r c1593r) {
        Typeface typefaceM2846o;
        C1594s c1594s;
        Object objRemove;
        C0038T0 c0038t0 = this.f5494c;
        synchronized (((C1577b) c0038t0.f169e)) {
            try {
                C1594s c1594s2 = (C1594s) ((C2435q) c0038t0.f170f).m4326a(c1593r);
                if (c1594s2 != null) {
                    if (c1594s2.f5521e) {
                        return c1594s2;
                    }
                    C2435q c2435q = (C2435q) c0038t0.f170f;
                    synchronized (c2435q.f7863c) {
                        C1753n c1753n = c2435q.f7862b;
                        c1753n.getClass();
                        objRemove = ((LinkedHashMap) c1753n.f6028e).remove(c1593r);
                        if (objRemove != null) {
                            c2435q.f7864d--;
                        }
                    }
                }
                try {
                    this.f5495d.getClass();
                    AbstractC1592q abstractC1592q = c1593r.f5515a;
                    C1577b c1577b = (C1577b) this.f5496e.f297e;
                    int i5 = c1593r.f5517c;
                    C1587l c1587l = c1593r.f5516b;
                    if (abstractC1592q == null || (abstractC1592q instanceof C1578c)) {
                        switch (c1577b.f5491d) {
                            case 2:
                                typefaceM2846o = C1577b.m2846o(null, c1587l, i5);
                                break;
                            default:
                                typefaceM2846o = C1577b.m2847q(null, c1587l, i5);
                                break;
                        }
                    } else {
                        if (!(abstractC1592q instanceof C1589n)) {
                            c1594s = null;
                            if (c1594s != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((C1577b) c0038t0.f169e)) {
                                if (((C2435q) c0038t0.f170f).m4326a(c1593r) == null && c1594s.f5521e) {
                                    ((C2435q) c0038t0.f170f).m4327b(c1593r, c1594s);
                                }
                            }
                            return c1594s;
                        }
                        typefaceM2846o = c1577b.m2851r((C1589n) abstractC1592q, c1587l, i5);
                    }
                    c1594s = new C1594s(typefaceM2846o);
                    if (c1594s != null) {
                    }
                } catch (Exception e5) {
                    throw new IllegalStateException("Could not load font", e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1594s m2854b(AbstractC1592q abstractC1592q, C1587l c1587l, int i5, int i6) {
        C1576a c1576a = this.f5493b;
        c1576a.getClass();
        int i7 = c1576a.f5490d;
        C1587l c1587l2 = (i7 == 0 || i7 == Integer.MAX_VALUE) ? c1587l : new C1587l(AbstractC1926h.m3568k(c1587l.f5507d + i7, 1, 1000));
        this.f5492a.getClass();
        return m2853a(new C1593r(abstractC1592q, c1587l2, i5, i6, null));
    }
}
