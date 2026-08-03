package wf;

import gg.AbstractC1416l;
import java.io.Serializable;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1235p;
import p332wb.C5094m0;

/* JADX INFO: renamed from: wf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5556b implements InterfaceC5561g, Serializable {

    /* JADX INFO: renamed from: g */
    public final InterfaceC5561g f22658g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5559e f22659h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5556b(InterfaceC5559e interfaceC5559e, InterfaceC5561g interfaceC5561g) {
        interfaceC5561g.getClass();
        interfaceC5559e.getClass();
        this.f22658g = interfaceC5561g;
        this.f22659h = interfaceC5559e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: e */
    public final InterfaceC5561g mo2059e(InterfaceC5561g interfaceC5561g) {
        interfaceC5561g.getClass();
        return interfaceC5561g == C5562h.f22661g ? this : (InterfaceC5561g) interfaceC5561g.mo2061k(new C5094m0(10), this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        boolean zM3825a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5556b) {
            C5556b c5556b = (C5556b) obj;
            int i9 = 2;
            C5556b c5556b2 = c5556b;
            int i10 = 2;
            while (true) {
                InterfaceC5561g interfaceC5561g = c5556b2.f22658g;
                c5556b2 = interfaceC5561g instanceof C5556b ? (C5556b) interfaceC5561g : null;
                if (c5556b2 == null) {
                    break;
                }
                i10++;
            }
            C5556b c5556b3 = this;
            while (true) {
                InterfaceC5561g interfaceC5561g2 = c5556b3.f22658g;
                c5556b3 = interfaceC5561g2 instanceof C5556b ? (C5556b) interfaceC5561g2 : null;
                if (c5556b3 == null) {
                    break;
                }
                i9++;
            }
            if (i10 == i9) {
                C5556b c5556b4 = this;
                while (true) {
                    InterfaceC5559e interfaceC5559e = c5556b4.f22659h;
                    if (!AbstractC1416l.m3825a(c5556b.mo2062s(interfaceC5559e.getKey()), interfaceC5559e)) {
                        zM3825a = false;
                        break;
                    }
                    InterfaceC5561g interfaceC5561g3 = c5556b4.f22658g;
                    if (!(interfaceC5561g3 instanceof C5556b)) {
                        interfaceC5561g3.getClass();
                        InterfaceC5559e interfaceC5559e2 = (InterfaceC5559e) interfaceC5561g3;
                        zM3825a = AbstractC1416l.m3825a(c5556b.mo2062s(interfaceC5559e2.getKey()), interfaceC5559e2);
                        break;
                    }
                    c5556b4 = (C5556b) interfaceC5561g3;
                }
                if (zM3825a) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f22659h.hashCode() + this.f22658g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: k */
    public final Object mo2061k(InterfaceC1235p interfaceC1235p, Object obj) {
        return interfaceC1235p.invoke(this.f22658g.mo2061k(interfaceC1235p, obj), this.f22659h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public final InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        interfaceC5560f.getClass();
        C5556b c5556b = this;
        while (true) {
            InterfaceC5559e interfaceC5559eMo2062s = c5556b.f22659h.mo2062s(interfaceC5560f);
            if (interfaceC5559eMo2062s != null) {
                return interfaceC5559eMo2062s;
            }
            InterfaceC5561g interfaceC5561g = c5556b.f22658g;
            if (!(interfaceC5561g instanceof C5556b)) {
                return interfaceC5561g.mo2062s(interfaceC5560f);
            }
            c5556b = (C5556b) interfaceC5561g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    public final InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        interfaceC5560f.getClass();
        InterfaceC5559e interfaceC5559e = this.f22659h;
        InterfaceC5559e interfaceC5559eMo2062s = interfaceC5559e.mo2062s(interfaceC5560f);
        InterfaceC5561g interfaceC5561g = this.f22658g;
        if (interfaceC5559eMo2062s != null) {
            return interfaceC5561g;
        }
        InterfaceC5561g interfaceC5561gMo2063t = interfaceC5561g.mo2063t(interfaceC5560f);
        return interfaceC5561gMo2063t == interfaceC5561g ? this : interfaceC5561gMo2063t == C5562h.f22661g ? interfaceC5559e : new C5556b(interfaceC5559e, interfaceC5561gMo2063t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2254q(new StringBuilder("["), (String) mo2061k(new C5094m0(9), HttpUrl.FRAGMENT_ENCODE_SET), ']');
    }
}
