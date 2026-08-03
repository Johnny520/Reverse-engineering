package p025bc;

import ae.C0073d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import md.EnumC2824a;
import mh.AbstractC2846d;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;

/* JADX INFO: renamed from: bc.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0262l {

    /* JADX INFO: renamed from: a */
    public final C0261k f776a;

    /* JADX INFO: renamed from: b */
    public final C4309e f777b;

    /* JADX INFO: renamed from: c */
    public final C0262l f778c;

    /* JADX INFO: renamed from: d */
    public List f779d;

    /* JADX INFO: renamed from: e */
    public boolean f780e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0262l.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0262l(C4309e c4309e, C0261k c0261k) {
        this.f779d = Collections.EMPTY_LIST;
        this.f776a = c0261k;
        this.f777b = c4309e;
        this.f778c = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0261k m1043a() {
        C0262l c0262l = this.f778c;
        return c0262l != null ? c0262l.m1043a() : this.f776a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized InterfaceC0254d m1044b() {
        InterfaceC0254d interfaceC0254dM8651V = null;
        if (this.f780e) {
            return null;
        }
        int i9 = this.f777b.f14385y;
        if (!(i9 == 4 || i9 == 5)) {
            interfaceC0254dM8651V = this.f777b.m8651V();
        }
        m1045c();
        return interfaceC0254dM8651V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1045c() {
        C0263m c0263m;
        this.f780e = true;
        C0261k c0261kM1043a = m1043a();
        int size = this.f777b.f14382v.size();
        if (size != 0) {
            ArrayList arrayList = new ArrayList(size);
            for (C4309e c4309e : this.f777b.f14382v) {
                if (!c4309e.f9217g.mo6235a(EnumC2824a.f9166s)) {
                    C0262l c0262lM1039b = c0261kM1043a.m1039b(c4309e);
                    c0262lM1039b.m1045c();
                    arrayList.add(c0262lM1039b);
                }
            }
            Collections.unmodifiableList(arrayList);
        }
        int size2 = this.f777b.f14383w.size();
        if (size2 != 0) {
            ArrayList arrayList2 = new ArrayList(size2);
            Iterator it = this.f777b.f14383w.iterator();
            while (it.hasNext()) {
                C0262l c0262lM1039b2 = c0261kM1043a.m1039b((C4309e) it.next());
                c0262lM1039b2.m1045c();
                arrayList2.add(c0262lM1039b2);
            }
            Collections.unmodifiableList(arrayList2);
        }
        int size3 = this.f777b.f14381u.size();
        if (size3 != 0) {
            ArrayList arrayList3 = new ArrayList(size3);
            for (C4311g c4311g : this.f777b.f14381u) {
                if (!c4311g.f9217g.mo6235a(EnumC2824a.f9166s)) {
                    synchronized (c0261kM1043a) {
                        c0263m = c4311g.f14394p;
                        if (c0263m == null) {
                            c0261kM1043a.m1039b(c4311g.f14389k);
                            c0263m = new C0263m(c4311g);
                            c4311g.f14394p = c0263m;
                        }
                    }
                    arrayList3.add(c0263m);
                }
            }
            Collections.unmodifiableList(arrayList3);
        }
        int size4 = this.f777b.f14380t.size();
        if (size4 != 0) {
            ArrayList arrayList4 = new ArrayList(size4);
            for (C4322r c4322r : this.f777b.f14380t) {
                if (!c4322r.f9217g.mo6235a(EnumC2824a.f9166s)) {
                    arrayList4.add(c0261kM1043a.m1040c(c4322r));
                }
            }
            arrayList4.sort(Comparator.comparing(new C0073d(7)));
            this.f779d = Collections.unmodifiableList(arrayList4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0262l) {
            return this.f777b.equals(((C0262l) obj).f777b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f777b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f777b.f14373m.m6642f();
    }

    public C0262l(C4309e c4309e, C0262l c0262l) {
        this.f779d = Collections.EMPTY_LIST;
        this.f776a = null;
        this.f777b = c4309e;
        this.f778c = c0262l;
    }
}
