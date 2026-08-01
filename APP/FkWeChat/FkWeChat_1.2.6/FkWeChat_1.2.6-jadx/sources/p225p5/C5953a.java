package p225p5;

import ae.C0307f;
import bsh.C1259t2;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p309v5.AbstractC8834p;
import p309v5.InterfaceC8837s;

/* JADX INFO: renamed from: p5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5953a extends AbstractC8834p implements Comparable, InterfaceC8837s {

    /* JADX INFO: renamed from: r */
    public final C6496e0 f18874r;

    /* JADX INFO: renamed from: s */
    public final EnumC5954b f18875s;

    /* JADX INFO: renamed from: t */
    public final TreeMap f18876t;

    public C5953a(C6496e0 c6496e0, EnumC5954b enumC5954b) {
        if (c6496e0 == null) {
            C1259t2.m5095a("type == null");
            throw null;
        }
        if (enumC5954b == null) {
            C1259t2.m5095a("visibility == null");
            throw null;
        }
        this.f18874r = c6496e0;
        this.f18875s = enumC5954b;
        this.f18876t = new TreeMap();
    }

    /* JADX INFO: renamed from: A */
    public EnumC5954b m23928A() {
        return this.f18875s;
    }

    /* JADX INFO: renamed from: B */
    public void m23929B(C5957e c5957e) {
        m33929u();
        if (c5957e != null) {
            this.f18876t.put(c5957e.m23944c(), c5957e);
        } else {
            C1259t2.m5095a("pair == null");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5953a)) {
            return false;
        }
        C5953a c5953a = (C5953a) obj;
        if (this.f18874r.equals(c5953a.f18874r) && this.f18875s == c5953a.f18875s) {
            return this.f18876t.equals(c5953a.f18876t);
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18875s.mo6828g());
        sb2.append("-annotation ");
        sb2.append(this.f18874r.mo6828g());
        sb2.append(" {");
        boolean z10 = true;
        for (C5957e c5957e : this.f18876t.values()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(c5957e.m23944c().mo6828g());
            sb2.append(": ");
            sb2.append(c5957e.m23945g().mo6828g());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public int hashCode() {
        return (((this.f18874r.hashCode() * 31) + this.f18876t.hashCode()) * 31) + this.f18875s.hashCode();
    }

    public String toString() {
        return mo6828g();
    }

    /* JADX INFO: renamed from: w */
    public void m23930w(C5957e c5957e) {
        m33929u();
        if (c5957e == null) {
            C1259t2.m5095a("pair == null");
            return;
        }
        C6492c0 c6492c0M23944c = c5957e.m23944c();
        if (this.f18876t.get(c6492c0M23944c) == null) {
            this.f18876t.put(c6492c0M23944c, c5957e);
        } else {
            C0307f.m923a("name already added: ", c6492c0M23944c);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5953a c5953a) {
        int iCompareTo = this.f18874r.compareTo(c5953a.f18874r);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f18875s.compareTo(c5953a.f18875s);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        Iterator it = this.f18876t.values().iterator();
        Iterator it2 = c5953a.f18876t.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo3 = ((C5957e) it.next()).compareTo((C5957e) it2.next());
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX INFO: renamed from: y */
    public Collection m23932y() {
        return Collections.unmodifiableCollection(this.f18876t.values());
    }

    /* JADX INFO: renamed from: z */
    public C6496e0 m23933z() {
        return this.f18874r;
    }
}
