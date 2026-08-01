package p225p5;

import bsh.C1259t2;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import p254r5.C6496e0;
import p309v5.AbstractC8834p;
import p376zd.C9993h;

/* JADX INFO: renamed from: p5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5955c extends AbstractC8834p implements Comparable {

    /* JADX INFO: renamed from: s */
    public static final C5955c f18883s;

    /* JADX INFO: renamed from: r */
    public final TreeMap f18884r = new TreeMap();

    static {
        C5955c c5955c = new C5955c();
        f18883s = c5955c;
        c5955c.mo6829t();
    }

    /* JADX INFO: renamed from: y */
    public static C5955c m23934y(C5955c c5955c, C5953a c5953a) {
        C5955c c5955c2 = new C5955c();
        c5955c2.m23939x(c5955c);
        c5955c2.m23938w(c5953a);
        c5955c2.mo6829t();
        return c5955c2;
    }

    /* JADX INFO: renamed from: z */
    public static C5955c m23935z(C5955c c5955c, C5955c c5955c2) {
        C5955c c5955c3 = new C5955c();
        c5955c3.m23939x(c5955c);
        c5955c3.m23939x(c5955c2);
        c5955c3.mo6829t();
        return c5955c3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5955c c5955c) {
        Iterator it = this.f18884r.values().iterator();
        Iterator it2 = c5955c.f18884r.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM23931x = ((C5953a) it.next()).compareTo((C5953a) it2.next());
            if (iM23931x != 0) {
                return iM23931x;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX INFO: renamed from: B */
    public Collection m23937B() {
        return Collections.unmodifiableCollection(this.f18884r.values());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5955c) {
            return this.f18884r.equals(((C5955c) obj).f18884r);
        }
        return false;
    }

    public int hashCode() {
        return this.f18884r.hashCode();
    }

    public int size() {
        return this.f18884r.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("annotations{");
        boolean z10 = true;
        for (C5953a c5953a : this.f18884r.values()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(c5953a.mo6828g());
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public void m23938w(C5953a c5953a) {
        m33929u();
        if (c5953a == null) {
            C1259t2.m5095a("annotation == null");
            return;
        }
        C6496e0 c6496e0M23933z = c5953a.m23933z();
        if (this.f18884r.containsKey(c6496e0M23933z)) {
            C9993h.m38666a("duplicate type: ", c6496e0M23933z.mo6828g());
        } else {
            this.f18884r.put(c6496e0M23933z, c5953a);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m23939x(C5955c c5955c) {
        m33929u();
        if (c5955c == null) {
            C1259t2.m5095a("toAdd == null");
            return;
        }
        Iterator it = c5955c.f18884r.values().iterator();
        while (it.hasNext()) {
            m23938w((C5953a) it.next());
        }
    }
}
