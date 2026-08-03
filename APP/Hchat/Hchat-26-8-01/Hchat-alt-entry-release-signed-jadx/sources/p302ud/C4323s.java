package p302ud;

import java.util.ArrayList;
import java.util.Objects;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p096g8.C1367h;
import p110hc.InterfaceC1706c;
import p199nd.AbstractC2986r;
import p215od.C3128a;
import p215od.C3132e;

/* JADX INFO: renamed from: ud.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4323s extends AbstractC2986r implements InterfaceC4315k, InterfaceC1706c, Comparable {

    /* JADX INFO: renamed from: k */
    public final C4325u f14426k;

    /* JADX INFO: renamed from: l */
    public final C3132e f14427l;

    /* JADX INFO: renamed from: m */
    public final C4323s f14428m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f14429n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ArrayList f14430o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public C3132e f14431p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4323s(C4325u c4325u, C4323s c4323s, C3132e c3132e) {
        this.f14426k = c4325u;
        this.f14428m = c4323s;
        this.f14427l = c3132e;
        this.f14431p = c3132e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static C4323s m8708I(C4325u c4325u, String str) {
        C4323s c4323s = (C4323s) c4325u.f14449o.get(str);
        if (c4323s != null) {
            return c4323s;
        }
        C3132e c3132eM6666a = C3132e.m6666a(c4325u, str);
        C3132e c3132e = c3132eM6666a.f10158a;
        C4323s c4323sM8708I = c3132e == null ? null : m8708I(c4325u, c3132e.f10159b);
        C4323s c4323s2 = new C4323s(c4325u, c4323sM8708I, c3132eM6666a);
        if (c4323sM8708I != null) {
            c4323sM8708I.f14429n.add(c4323s2);
        }
        c4325u.f14449o.put(c4323s2.f14427l.f10159b, c4323s2);
        c4325u.f14450p.add(c4323s2);
        return c4323s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m8709J() {
        for (C4323s c4323s : this.f14429n) {
            C4325u c4325u = c4323s.f14426k;
            C4323s c4323s2 = c4323s.f14428m;
            c4323s.f14431p = C3132e.m6667b(c4325u, c4323s2 == null ? null : c4323s2.f14431p, c4323s.f14431p.f10160c);
            c4323s.m8709J();
        }
        for (C4309e c4309e : this.f14430o) {
            C3128a c3128a = c4309e.f14373m;
            if (!c3128a.m6650o()) {
                String str = c4309e.f14374n.f14431p.f10159b;
                if (c3128a.m6650o()) {
                    C0086a.m452k("Can't change package for inner class: ".concat(String.valueOf(c3128a)));
                    return;
                } else if (!Objects.equals(c3128a.m6645j(), str)) {
                    C1367h c1367h = new C1367h(str, c3128a.m6646k());
                    c3128a.m6641c(c1367h);
                    c3128a.f10143l = c1367h;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14427l.f10159b.compareTo(((C4323s) obj).f14427l.f10159b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4323s)) {
            return false;
        }
        return this.f14427l.equals(((C4323s) obj).f14427l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14427l.f10159b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: m */
    public final String mo8666m() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: n */
    public final C4325u mo8668n() {
        return this.f14426k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14427l.f10159b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    public final String typeName() {
        return "package";
    }
}
