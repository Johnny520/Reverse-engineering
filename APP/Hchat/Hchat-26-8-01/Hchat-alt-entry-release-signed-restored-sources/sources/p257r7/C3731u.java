package p257r7;

import androidx.lifecycle.C0119x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import okio.C3193a;
import p020b5.C0184c;
import p023b8.C0207e;
import p136j8.C2104o;
import p209o7.AbstractC3071e;
import p209o7.C3068b;
import p241q7.C3445b;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3731u extends AbstractC3071e implements Comparable, Iterable {

    /* JADX INFO: renamed from: q */
    public static final C3193a f12109q = new C3193a(13);

    /* JADX INFO: renamed from: m */
    public final C3068b f12110m;

    /* JADX INFO: renamed from: n */
    public final C3716f f12111n;

    /* JADX INFO: renamed from: o */
    public C3730t f12112o;

    /* JADX INFO: renamed from: p */
    public AbstractC3729s f12113p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3731u() {
        super(2);
        C3068b c3068b = new C3068b(null);
        this.f12110m = c3068b;
        C3716f c3716f = new C3716f(false);
        this.f12111n = c3716f;
        m6540P(0, c3068b);
        m6540P(1, c3716f);
        c3716f.mo633k(-1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        while (true) {
            int i9 = c3445b.f11162k;
            byte[] bArr = new byte[4];
            c3445b.m7229e(bArr, 4);
            c3445b.m7230g(i9);
            if (((bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24)) == -1) {
                this.f12111n.mo1893B(c3445b);
                return;
            } else {
                C3733w c3733w = new C3733w();
                this.f12110m.mo6519M(c3733w);
                c3733w.mo1893B(c3445b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: I */
    public final void mo5547I(boolean z9) {
        if (z9) {
            m7747R();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final String m7746Q(String str, boolean z9) {
        C0207e c0207e = null;
        if (str == null) {
            return null;
        }
        try {
            C0119x[] c0119xArrM569k = C0119x.m569k(str, this);
            C0207e c0207e2 = new C0207e();
            C0184c c0184c = new C0184c();
            c0184c.f469a = c0207e2;
            new HashMap();
            new HashMap();
            new HashMap();
            for (C0119x c0119x : c0119xArrM569k) {
                c0119x.m590V(c0184c);
            }
            c0207e = c0207e2;
        } catch (IOException unused) {
        }
        return c0207e == null ? str : c0207e.m890i(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m7747R() {
        C3731u c3731u;
        AbstractC3729s abstractC3729s = this.f12113p;
        if (abstractC3729s != null && (c3731u = abstractC3729s.f12106q) != null) {
            if (this != c3731u) {
                C2104o.m5276A("Wrong style item");
                return;
            } else {
                abstractC3729s.f12106q = null;
                m7748S(null);
            }
        }
        if (this.f7658h == null) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            C3732v c3732v = ((C3733w) it.next()).f12114m;
            AbstractC3729s abstractC3729sM7749a = c3732v.m7749a();
            if (abstractC3729sM7749a != null) {
                abstractC3729sM7749a.m7745a0(c3732v);
            }
            c3732v.mo633k(-1);
        }
        this.f12110m.m6521N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m7748S(AbstractC3729s abstractC3729s) {
        AbstractC3729s abstractC3729s2 = this.f12113p;
        if (abstractC3729s == null) {
            this.f12113p = null;
            InterfaceC3723m interfaceC3723m = this.f12112o;
            if (interfaceC3723m == null) {
                return;
            }
            this.f12112o = null;
            if (abstractC3729s2 == null) {
                return;
            }
            abstractC3729s2.m7745a0(interfaceC3723m);
            return;
        }
        if (abstractC3729s2 != null) {
            if (abstractC3729s == abstractC3729s2) {
                return;
            }
            C2104o.m5276A("Different string item");
        } else {
            this.f12113p = abstractC3729s;
            C3730t c3730t = new C3730t(this);
            abstractC3729s.m7743P(c3730t);
            this.f12112o = c3730t;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3731u c3731u = (C3731u) obj;
        if (c3731u == this) {
            return 0;
        }
        if (c3731u == null) {
            return -1;
        }
        AbstractC3729s abstractC3729s = this.f12113p;
        AbstractC3729s abstractC3729s2 = c3731u.f12113p;
        int iM10741d = AbstractC5999a.m10741d(abstractC3729s == null, abstractC3729s2 == null);
        return (iM10741d != 0 || abstractC3729s == null || abstractC3729s2 == null) ? iM10741d : AbstractC5999a.m10742e(abstractC3729s.f7657g, abstractC3729s2.f7657g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12110m.f9926k.m10866b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Spans count = " + this.f12110m.f9926k.size();
    }
}
