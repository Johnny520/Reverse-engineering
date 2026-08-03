package p215od;

import java.util.Objects;
import p025bc.AbstractC0255e;
import p141jf.C2128d;
import p246qd.AbstractC3506j;
import p302ud.C4325u;
import p302ud.InterfaceC4316l;

/* JADX INFO: renamed from: od.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3130c implements InterfaceC4316l {

    /* JADX INFO: renamed from: g */
    public final C3128a f10146g;

    /* JADX INFO: renamed from: h */
    public final String f10147h;

    /* JADX INFO: renamed from: i */
    public final AbstractC3506j f10148i;

    /* JADX INFO: renamed from: j */
    public String f10149j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3130c(C3128a c3128a, String str, AbstractC3506j abstractC3506j) {
        this.f10146g = c3128a;
        this.f10147h = str;
        this.f10148i = abstractC3506j;
        this.f10149j = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3130c m6654a(C4325u c4325u, C2128d c2128d) {
        return c4325u.f14439e.m1199h(new C3130c(C3128a.m6636d(c4325u, c2128d.f7091b), c2128d.f7093d, AbstractC3506j.m7362z(c2128d.f7092c)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m6655b() {
        return !Objects.equals(this.f10147h, this.f10149j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3130c.class == obj.getClass()) {
            C3130c c3130c = (C3130c) obj;
            if (this.f10147h.equals(c3130c.f10147h) && this.f10148i.equals(c3130c.f10148i) && this.f10146g.equals(c3130c.f10146g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((this.f10147h.hashCode() * 31) + this.f10148i.f11410a) * 31) + this.f10146g.f10138g.f11410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1033v(String.valueOf(this.f10146g), ".", this.f10147h, " ", String.valueOf(this.f10148i));
    }

    @Override // p302ud.InterfaceC4316l
    /* JADX INFO: renamed from: f */
    public final C3130c mo6656f() {
        return this;
    }
}
