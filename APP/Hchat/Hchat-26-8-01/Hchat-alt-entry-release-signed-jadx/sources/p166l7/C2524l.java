package p166l7;

import java.io.IOException;
import java.util.Iterator;
import okio.C3193a;
import p007a7.C0020c;
import p038ce.C0561n;
import p135j7.C2086b;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p209o7.C3076j;
import p229p7.C3332b;
import p229p7.C3340j;
import p241q7.C3445b;
import p285t7.C4135b;
import p298u7.AbstractC4280c;
import p298u7.C4279b;
import p314v7.C4490d;
import p314v7.C4495f0;
import p344x7.C5705b;
import p379z7.C6107c;
import p379z7.C6110f;
import p379z7.C6112h;
import p379z7.C6114j;
import p379z7.C6121q;

/* JADX INFO: renamed from: l7.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2524l extends AbstractC2513a implements InterfaceC2514b, Iterable {

    /* JADX INFO: renamed from: o */
    public final C4279b f8154o;

    /* JADX INFO: renamed from: p */
    public final C2086b f8155p;

    /* JADX INFO: renamed from: q */
    public final C6107c f8156q;

    /* JADX INFO: renamed from: r */
    public C0020c f8157r;

    /* JADX INFO: renamed from: s */
    public C2517e f8158s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2524l() {
        C3340j c3340j = new C3340j();
        super(c3340j, 2);
        C4279b c4279b = new C4279b(true, true, new C3193a(18), 1);
        this.f8154o = c4279b;
        C2086b c2086b = new C2086b(c3340j.f10750r);
        this.f8155p = c2086b;
        this.f8156q = new C6107c(0);
        m6539P(c4279b);
        m6539P(c2086b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a, p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        C4279b c4279b;
        if (c3445b.available() == 0) {
            this.f7659i = true;
            return;
        }
        C3340j c3340j = (C3340j) this.f8138m;
        c3340j.m5545G(c3445b);
        if (c3340j.m7051Q() != 3) {
            C2104o.m5285j(c3340j, "Not resource table: ");
            return;
        }
        C3332b c3332bM7054T = C3332b.m7054T(c3445b);
        C2086b c2086b = this.f8155p;
        c2086b.m6521N();
        boolean z9 = false;
        while (true) {
            c4279b = this.f8154o;
            if (c3332bM7054T == null || !c3445b.m7227b()) {
                break;
            }
            int iM7051Q = c3332bM7054T.m7051Q();
            if (iM7051Q == 2) {
                if (!z9) {
                    c4279b.m5545G(c3445b);
                    z9 = true;
                }
            } else if (iM7051Q == 12) {
                ((C2518f) c2086b.m6523P()).m5545G(c3445b);
            } else {
                C2522j c2522j = new C2522j(1);
                c2522j.m5545G(c3445b);
                m6539P(c2522j);
            }
            c3332bM7054T = C3332b.m7054T(c3445b);
        }
        c3445b.close();
        m5929Y(c4279b);
        Iterator it = iterator();
        while (it.hasNext()) {
            C2518f c2518f = (C2518f) it.next();
            c2518f.m5919Z(c2518f.f8146p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        this.f8155p.removeIf(new C0561n(15));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
        ((C3340j) this.f8138m).f10750r.mo633k(this.f8155p.f9926k.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final boolean m5925U(C2524l c2524l) {
        if (c2524l != null) {
            C2086b c2086b = c2524l.f8155p;
            if (c2524l == this) {
                return true;
            }
            C2086b c2086b2 = this.f8155p;
            int size = c2086b2.f9926k.size();
            if (size == c2086b.f9926k.size()) {
                for (int i9 = 0; i9 < size; i9++) {
                    C2518f c2518f = (C2518f) c2086b2.m6524Q(i9);
                    C2518f c2518f2 = (C2518f) c2086b.m6524Q(i9);
                    c2518f.getClass();
                    if (c2518f2 == c2518f || (c2518f2 != null && c2518f.mo5913U() == c2518f2.mo5913U() && c2518f.mo5914V().equals(c2518f2.mo5914V()) && c2518f.f8145o.size() == c2518f2.f8145o.size() && c2518f.f8146p.size() == c2518f2.f8146p.size())) {
                    }
                }
                return true;
            }
            Iterator it = this.f8156q.iterator();
            while (it.hasNext()) {
                if (((C2524l) it.next()).m5925U(c2524l)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final C6110f m5926V(C2518f c2518f) {
        Iterator itM5927W = m5927W(c2518f);
        C6107c c6107c = this.f8156q;
        return new C6110f(itM5927W, new C2516d(c6107c.f24644i == 0 ? C6112h.f24664g : c6107c.iterator(), 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final Iterator m5927W(C2518f c2518f) {
        if (c2518f == null) {
            c2518f = null;
        }
        Iterator it = iterator();
        return c2518f == null ? it : new C6110f(C6121q.m10883a(c2518f), new C6114j(it, c2518f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final C4135b m5928X(C2518f c2518f, int i9) {
        if (i9 == 0) {
            return null;
        }
        C6110f c6110fM5926V = m5926V(c2518f);
        while (c6110fM5926V.hasNext()) {
            C4135b c4135bM5917W = ((C2518f) c6110fM5926V.next()).m5917W(i9);
            if (c4135bM5917W != null) {
                return c4135bM5917W;
            }
        }
        int iM5931a0 = m5931a0(i9);
        if (iM5931a0 == 0 || iM5931a0 == i9) {
            return null;
        }
        C6110f c6110fM5926V2 = m5926V(c2518f);
        while (c6110fM5926V2.hasNext()) {
            C4135b c4135bM5917W2 = ((C2518f) c6110fM5926V2.next()).m5917W(iM5931a0);
            if (c4135bM5917W2 != null) {
                return c4135bM5917W2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final void m5929Y(C4279b c4279b) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C2518f) it.next()).f8147q.f9934m.f9926k.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C3076j) it2.next()).iterator();
                while (it3.hasNext()) {
                    Iterator itM8125n0 = ((C2525m) it3.next()).f8159o.m8125n0(true);
                    while (itM8125n0.hasNext()) {
                        ((C4490d) itM8125n0.next()).f14846k.mo8920L(c4279b);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final C2518f m5930Z() {
        return C2086b.m5142k0(this.f8155p.f9926k, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final int m5931a0(int i9) {
        C4495f0 c4495f0 = null;
        C6110f c6110fM5926V = m5926V(null);
        while (true) {
            if (!c6110fM5926V.hasNext()) {
                break;
            }
            C4495f0 c4495f0M5920a0 = ((C2518f) c6110fM5926V.next()).m5920a0(i9);
            if (c4495f0M5920a0 != null) {
                c4495f0 = c4495f0M5920a0;
                break;
            }
        }
        if (c4495f0 != null) {
            return c4495f0.m7718O(4);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.InterfaceC2514b
    /* JADX INFO: renamed from: g */
    public final AbstractC4280c mo5909g() {
        return this.f8154o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8155p.f9926k.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        C5705b c5705b = new C5705b(((C3340j) this.f8138m).f10723o.f12083n);
        try {
            m5549K(c5705b);
            c5705b.close();
        } catch (IOException unused) {
        }
        return c5705b.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(": packages = ");
        sb2.append(this.f8155p.f9926k.size());
        sb2.append(", size = ");
        return AbstractC2091b.m5163j(sb2, ((C3340j) this.f8138m).f10723o.f12083n, " bytes");
    }
}
