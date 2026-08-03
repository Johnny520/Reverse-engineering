package p282t4;

import bsh.C0353j;
import java.util.Iterator;
import java.util.TreeMap;
import p089g1.C1275d;
import p222p.AbstractC3199a;
import p281t3.AbstractC4106c;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p376z4.AbstractC6096j;
import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: t4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4114a extends AbstractC6096j implements Comparable, InterfaceC6097k {

    /* JADX INFO: renamed from: h */
    public final C4453d0 f13613h;

    /* JADX INFO: renamed from: i */
    public final int f13614i;

    /* JADX INFO: renamed from: j */
    public final TreeMap f13615j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4114a(C4453d0 c4453d0, int i9) {
        if (c4453d0 == null) {
            C0353j.m1305c("type == null");
            throw null;
        }
        if (i9 == 0) {
            C0353j.m1305c("visibility == null");
            throw null;
        }
        this.f13613h = c4453d0;
        this.f13614i = i9;
        this.f13615j = new TreeMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC3199a.m6830c(this.f13614i));
        sb2.append("-annotation ");
        sb2.append(this.f13613h.f14784g.mo4901a());
        sb2.append(" {");
        boolean z9 = true;
        for (C4117d c4117d : this.f13615j.values()) {
            if (z9) {
                z9 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(c4117d.f13619g.mo4901a());
            sb2.append(": ");
            sb2.append(c4117d.f13620h.mo4901a());
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4114a)) {
            return false;
        }
        C4114a c4114a = (C4114a) obj;
        if (this.f13613h.equals(c4114a.f13613h) && this.f13614i == c4114a.f13614i) {
            return this.f13615j.equals(c4114a.f13615j);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC4106c.m8279b(this.f13614i) + ((this.f13615j.hashCode() + (this.f13613h.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m8309l(C4117d c4117d) {
        m10855j();
        C4451c0 c4451c0 = c4117d.f13619g;
        TreeMap treeMap = this.f13615j;
        if (treeMap.get(c4451c0) == null) {
            treeMap.put(c4451c0, c4117d);
        } else {
            C1275d.m3412f(c4451c0, "name already added: ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4114a c4114a) {
        int iCompareTo = this.f13613h.compareTo(c4114a.f13613h);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i9 = c4114a.f13614i;
        int i10 = this.f13614i;
        if (i10 == 0 || i9 == 0) {
            throw null;
        }
        int i11 = i10 - i9;
        if (i11 != 0) {
            return i11;
        }
        Iterator it = this.f13615j.values().iterator();
        Iterator it2 = c4114a.f13615j.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            C4117d c4117d = (C4117d) it.next();
            C4117d c4117d2 = (C4117d) it2.next();
            int iCompareTo2 = c4117d.f13619g.compareTo(c4117d2.f13619g);
            if (iCompareTo2 == 0) {
                iCompareTo2 = c4117d.f13620h.compareTo(c4117d2.f13620h);
            }
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m8311n(C4117d c4117d) {
        m10855j();
        this.f13615j.put(c4117d.f13619g, c4117d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return mo4901a();
    }
}
