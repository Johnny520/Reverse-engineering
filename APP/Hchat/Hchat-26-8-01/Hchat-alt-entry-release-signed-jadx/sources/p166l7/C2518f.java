package p166l7;

import java.util.Iterator;
import okhttp3.internal.http2.Settings;
import okio.C3193a;
import p038ce.C0561n;
import p075f6.C1075b;
import p135j7.C2085a;
import p135j7.C2088d;
import p152k7.AbstractC2331a;
import p209o7.C3072f;
import p209o7.C3076j;
import p229p7.C3336f;
import p257r7.C3727q;
import p285t7.C4135b;
import p298u7.AbstractC4280c;
import p298u7.C4279b;
import p298u7.C4281d;
import p314v7.AbstractC4501i0;
import p314v7.C4490d;
import p314v7.C4495f0;
import p314v7.C4499h0;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: l7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2518f extends AbstractC2513a implements InterfaceC2519g, Comparable {

    /* JADX INFO: renamed from: o */
    public final C4281d f8145o;

    /* JADX INFO: renamed from: p */
    public final C4279b f8146p;

    /* JADX INFO: renamed from: q */
    public final C3072f f8147q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2518f() {
        C3336f c3336f = new C3336f();
        super(c3336f, 3);
        C4281d c4281d = new C4281d(c3336f.f10738y);
        this.f8145o = c4281d;
        C4279b c4279b = new C4279b(true, true, new C3193a(17), 0);
        this.f8146p = c4279b;
        C3072f c3072f = new C3072f();
        this.f8147q = c3072f;
        m6539P(c4281d);
        m6539P(c4279b);
        m6539P(c3072f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        C2088d c2088d = this.f8147q.f9934m;
        Iterator itM10866b = c2088d.f9926k.m10866b();
        while (itM10866b.hasNext()) {
            C3076j c3076j = (C3076j) itM10866b.next();
            c3076j.f9949m.removeIf(new C0561n(8));
            if (c3076j.isEmpty()) {
                c2088d.m6531a0(c3076j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
        C4281d c4281d = this.f8145o;
        C1075b c1075b = new C1075b(c4281d);
        mo5556z(c1075b);
        int i9 = c1075b.f3460c;
        C3336f c3336f = (C3336f) this.f8138m;
        c3336f.f10733t.mo633k(i9);
        c3336f.f10734u.mo633k(c4281d.size());
        C4279b c4279b = this.f8146p;
        C1075b c1075b2 = new C1075b(c4279b);
        mo5556z(c1075b2);
        c3336f.f10735v.mo633k(c1075b2.f3460c);
        c3336f.f10736w.mo633k(c4279b.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public int mo5913U() {
        return ((C3336f) this.f8138m).f10731r.f12083n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public String mo5914V() {
        return ((C3336f) this.f8138m).f10732s.f12101m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final C4135b m5917W(int i9) {
        int iM7718O;
        C4135b c4135bM5918X;
        int i10 = (i9 >> 24) & 255;
        if (i10 == 0) {
            return null;
        }
        if (i10 == mo5913U() && (c4135bM5918X = m5918X((i9 >> 16) & 255, i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != null) {
            return c4135bM5918X;
        }
        C4495f0 c4495f0M5920a0 = m5920a0(i9);
        if (c4495f0M5920a0 == null || (iM7718O = c4495f0M5920a0.m7718O(4)) == 0 || iM7718O == i9 || ((iM7718O >> 24) & 255) != mo5913U()) {
            return null;
        }
        return m5918X((iM7718O >> 16) & 255, iM7718O & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final C4135b m5918X(int i9, int i10) {
        C3076j c3076jM5144k0 = this.f8147q.f9934m.m5144k0((byte) i9);
        if (c3076jM5144k0 != null) {
            short s10 = (short) i10;
            Iterator it = c3076jM5144k0.f9949m.f9926k.iterator();
            C4490d c4490d = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4490d c4490dM8124m0 = ((C2525m) it.next()).f8159o.m8124m0(s10);
                if (c4490dM8124m0 != null) {
                    if (!c4490dM8124m0.mo5555y()) {
                        c4490d = c4490dM8124m0;
                        break;
                    }
                    if (c4490d == null) {
                        c4490d = c4490dM8124m0;
                    }
                }
            }
            if (c4490d != null) {
                return new C4135b(this, c4490d.m8926M());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public C2524l mo5915Y() {
        for (AbstractC2331a abstractC2331a = this.f7658h; abstractC2331a != null; abstractC2331a = abstractC2331a.f7658h) {
            if (abstractC2331a instanceof C2524l) {
                return (C2524l) abstractC2331a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final void m5919Z(C4279b c4279b) {
        Iterator it = this.f8147q.f9934m.f9926k.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C3076j) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator itM8125n0 = ((C2525m) it2.next()).f8159o.m8125n0(true);
                while (itM8125n0.hasNext()) {
                    AbstractC4501i0 abstractC4501i0 = ((C4490d) itM8125n0.next()).f14846k.f14849k;
                    C3727q c3727q = (C3727q) c4279b.m8600V(abstractC4501i0.m8934N());
                    if (c3727q == null) {
                        abstractC4501i0.f14855m = null;
                    } else {
                        C4499h0 c4499h0 = abstractC4501i0.f14855m;
                        if (c4499h0 != null) {
                            c3727q.m7745a0(c4499h0);
                        }
                        C4499h0 c4499h02 = new C4499h0(abstractC4501i0, 0);
                        abstractC4501i0.f14855m = c4499h02;
                        c3727q.m7743P(c4499h02);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public AbstractC4280c mo5916a() {
        return this.f8146p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final C4495f0 m5920a0(int i9) {
        C4495f0 c4495f0;
        Iterator it = this.f8147q.f9936o.f9926k.iterator();
        do {
            c4495f0 = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator it2 = ((C2523k) it.next()).f8153o.f9926k.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C4495f0 c4495f02 = (C4495f0) it2.next();
                if (i9 == c4495f02.m7718O(0)) {
                    c4495f0 = c4495f02;
                    break;
                }
            }
        } while (c4495f0 == null);
        return c4495f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int compareTo(Object obj) {
        return Integer.compare(mo5913U(), ((C2518f) obj).mo5913U());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isEmpty() {
        if (mo5913U() != 0) {
            return false;
        }
        C3072f c3072f = this.f8147q;
        Iterator itM5558j0 = c3072f.f9934m.m5558j0(true);
        while (itM5558j0.hasNext()) {
            if (!((C3076j) itM5558j0.next()).isEmpty()) {
                return false;
            }
        }
        return !c3072f.f9935n.iterator().hasNext() && c3072f.f9936o.f9926k.size() == 0 && c3072f.f9937p.f9926k.size() == 0 && c3072f.f9939r.f9926k.size() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id=");
        sb2.append(AbstractC5999a.m10751n((byte) mo5913U()));
        sb2.append(", name=");
        sb2.append(mo5914V());
        int size = ((C2085a) this.f8147q.f9935n.f8142p).f9926k.size();
        if (size > 0) {
            sb2.append(", libraries=");
            sb2.append(size);
        }
        return sb2.toString();
    }

    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: R */
    public final void mo5906R() {
    }

    @Override // p166l7.InterfaceC2519g
    /* JADX INFO: renamed from: i */
    public final C2518f mo5921i() {
        return this;
    }
}
