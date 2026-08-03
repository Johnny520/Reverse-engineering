package p215od;

import be.C0289k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mc.InterfaceC2823a;
import me.C2833a;
import p068eh.AbstractC0921a;
import p082fd.AbstractC1213j;
import p141jf.C2132h;
import p246qd.AbstractC3506j;
import p302ud.C4325u;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: od.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3131d implements Comparable {

    /* JADX INFO: renamed from: g */
    public final String f10150g;

    /* JADX INFO: renamed from: h */
    public final AbstractC3506j f10151h;

    /* JADX INFO: renamed from: i */
    public final List f10152i;

    /* JADX INFO: renamed from: j */
    public final C3128a f10153j;

    /* JADX INFO: renamed from: k */
    public final String f10154k;

    /* JADX INFO: renamed from: l */
    public final String f10155l;

    /* JADX INFO: renamed from: m */
    public final int f10156m;

    /* JADX INFO: renamed from: n */
    public String f10157n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3131d(C3128a c3128a, String str, List list, AbstractC3506j abstractC3506j) {
        this.f10150g = str;
        this.f10157n = str;
        this.f10153j = c3128a;
        this.f10152i = list;
        this.f10151h = abstractC3506j;
        String strM6660i = m6660i(str, list, abstractC3506j);
        this.f10154k = strM6660i;
        this.f10155l = AbstractC4855en.m9264h(c3128a.m6651q(), ".", strM6660i);
        this.f10156m = (c3128a.f10138g.f11410a * 31) + strM6660i.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3131d m6657b(C4325u c4325u, C3128a c3128a, String str, List list, AbstractC3506j abstractC3506j) {
        return c4325u.f14439e.m1206o(new C3131d(c3128a, str, list, abstractC3506j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C3131d m6658c(C4325u c4325u, C3128a c3128a, String str, InterfaceC2823a interfaceC2823a) {
        return m6657b(c4325u, c3128a, str, AbstractC5798s.m10509c(interfaceC2823a.mo5353c(), new C2833a(6)), AbstractC3506j.m7362z(interfaceC2823a.mo5354e()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C3131d m6659d(C4325u c4325u, C2132h c2132h) {
        C3131d c3131d;
        C0289k c0289k = c4325u.f14439e;
        int i9 = c2132h.f7114a;
        if (i9 != 0) {
            synchronized (((HashMap) c0289k.f841d)) {
                c3131d = (C3131d) ((HashMap) c0289k.f841d).get(Integer.valueOf(i9));
            }
            if (c3131d != null) {
                return c3131d;
            }
        }
        c2132h.m5355a();
        C3128a c3128aM6637e = C3128a.m6637e(c4325u, AbstractC3506j.m7362z(c2132h.f7116c));
        AbstractC3506j abstractC3506jM7362z = AbstractC3506j.m7362z(c2132h.f7117d);
        C3131d c3131dM1206o = c0289k.m1206o(new C3131d(c3128aM6637e, c2132h.f7115b, AbstractC5798s.m10509c(c2132h.f7118e, new C2833a(6)), abstractC3506jM7362z));
        if (i9 == 0) {
            return c3131dM1206o;
        }
        synchronized (((HashMap) c0289k.f841d)) {
            ((HashMap) c0289k.f841d).put(Integer.valueOf(i9), c3131dM1206o);
        }
        return c3131dM1206o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m6660i(String str, List list, AbstractC3506j abstractC3506j) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append(AbstractC1213j.m3333b((AbstractC3506j) it.next()));
        }
        sb2.append(')');
        if (abstractC3506j != null) {
            sb2.append(AbstractC1213j.m3333b(abstractC3506j));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3131d c3131d) {
        int iCompareTo = this.f10153j.compareTo(c3131d.f10153j);
        return iCompareTo != 0 ? iCompareTo : this.f10154k.compareTo(c3131d.f10154k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m6662e() {
        return this.f10150g.equals("<clinit>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3131d)) {
            return false;
        }
        C3131d c3131d = (C3131d) obj;
        return this.f10154k.equals(c3131d.f10154k) && this.f10153j.equals(c3131d.f10153j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m6663f() {
        return this.f10150g.equals("<init>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m6664g(C3131d c3131d) {
        return this.f10152i.size() == c3131d.f10152i.size() && this.f10150g.equals(c3131d.f10150g) && !Objects.equals(this.f10154k, c3131d.f10154k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10156m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m6665j(boolean z9, boolean z10) {
        return m6660i(z9 ? this.f10157n : this.f10150g, this.f10152i, z10 ? this.f10151h : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f10153j.f10141j;
        String strM10516j = AbstractC5798s.m10516j(this.f10152i, ", ");
        String strValueOf = String.valueOf(this.f10151h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".");
        sb2.append(this.f10150g);
        sb2.append("(");
        sb2.append(strM10516j);
        return AbstractC0921a.m2255r(sb2, "):", strValueOf);
    }
}
