package p282t4;

import bsh.C0353j;
import java.util.Iterator;
import java.util.TreeMap;
import p136j8.C2104o;
import p311v4.C4453d0;
import p376z4.AbstractC6096j;

/* JADX INFO: renamed from: t4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4115b extends AbstractC6096j implements Comparable {

    /* JADX INFO: renamed from: i */
    public static final C4115b f13616i;

    /* JADX INFO: renamed from: h */
    public final TreeMap f13617h = new TreeMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C4115b c4115b = new C4115b();
        f13616i = c4115b;
        c4115b.f24613g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C4115b m8312n(C4115b c4115b, C4114a c4114a) {
        C4115b c4115b2 = new C4115b();
        c4115b2.m8314m(c4115b);
        c4115b2.m8313l(c4114a);
        c4115b2.f24613g = false;
        return c4115b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4115b) {
            return this.f13617h.equals(((C4115b) obj).f13617h);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13617h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m8313l(C4114a c4114a) {
        m10855j();
        if (c4114a == null) {
            C0353j.m1305c("annotation == null");
            return;
        }
        C4453d0 c4453d0 = c4114a.f13613h;
        TreeMap treeMap = this.f13617h;
        if (treeMap.containsKey(c4453d0)) {
            C2104o.m5298x(c4453d0.f14784g.mo4901a(), "duplicate type: ");
        } else {
            treeMap.put(c4453d0, c4114a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m8314m(C4115b c4115b) {
        m10855j();
        if (c4115b == null) {
            C0353j.m1305c("toAdd == null");
            return;
        }
        Iterator it = c4115b.f13617h.values().iterator();
        while (it.hasNext()) {
            m8313l((C4114a) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4115b c4115b) {
        Iterator it = this.f13617h.values().iterator();
        Iterator it2 = c4115b.f13617h.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM8310m = ((C4114a) it.next()).compareTo((C4114a) it2.next());
            if (iM8310m != 0) {
                return iM8310m;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("annotations{");
        boolean z9 = true;
        for (C4114a c4114a : this.f13617h.values()) {
            if (z9) {
                z9 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(c4114a.mo4901a());
        }
        sb2.append("}");
        return sb2.toString();
    }
}
