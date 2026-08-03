package p215od;

import be.C0289k;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p096g8.C1367h;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3499c;
import p302ud.C4325u;
import p332wb.AbstractC4855en;
import p351xe.C5796q;

/* JADX INFO: renamed from: od.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3128a implements Comparable {

    /* JADX INFO: renamed from: g */
    public final AbstractC3506j f10138g;

    /* JADX INFO: renamed from: h */
    public String f10139h;

    /* JADX INFO: renamed from: i */
    public String f10140i;

    /* JADX INFO: renamed from: j */
    public String f10141j;

    /* JADX INFO: renamed from: k */
    public C3128a f10142k;

    /* JADX INFO: renamed from: l */
    public C1367h f10143l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3128a(C4325u c4325u, AbstractC3506j abstractC3506j, boolean z9) {
        this.f10138g = abstractC3506j;
        m6652r(c4325u, abstractC3506j, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C3128a m6636d(C4325u c4325u, String str) {
        return m6637e(c4325u, AbstractC3506j.m7360x(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C3128a m6637e(C4325u c4325u, AbstractC3506j abstractC3506j) {
        if (abstractC3506j == null) {
            C0086a.m452k("Null class type");
            return null;
        }
        if (abstractC3506j instanceof C3497a) {
            abstractC3506j = AbstractC3506j.f11394k;
        } else {
            if (!abstractC3506j.mo7351v() || (abstractC3506j instanceof C3499c)) {
                C0086a.m452k("Not class type: ".concat(String.valueOf(abstractC3506j)));
                return null;
            }
            if (abstractC3506j.mo7354t()) {
                abstractC3506j = AbstractC3506j.m7360x(abstractC3506j.mo7350l());
            }
        }
        C3128a c3128a = (C3128a) ((HashMap) c4325u.f14439e.f839b).get(abstractC3506j);
        if (c3128a != null) {
            return c3128a;
        }
        C3128a c3128a2 = new C3128a(c4325u, abstractC3506j, c4325u.f14435a.f753v);
        C0289k c0289k = c4325u.f14439e;
        synchronized (((HashMap) c0289k.f839b)) {
            C3128a c3128a3 = (C3128a) ((HashMap) c0289k.f839b).put(abstractC3506j, c3128a2);
            if (c3128a3 != null) {
                c3128a2 = c3128a3;
            }
        }
        return c3128a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m6638p(String str, String str2, C3128a c3128a, boolean z9, boolean z10) {
        if (c3128a == null) {
            return str.isEmpty() ? str2 : AbstractC4855en.m9264h(str, ".", str2);
        }
        char c10 = z10 ? '$' : '.';
        return (z9 ? z10 ? m6638p(c3128a.m6645j(), c3128a.m6646k(), c3128a.f10142k, true, true) : c3128a.m6642f() : z10 ? c3128a.m6651q() : c3128a.f10141j) + c10 + str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6639a(String str) {
        String strM6645j = m6645j();
        C1367h c1367h = (Objects.equals(this.f10139h, str) || C5796q.m10501g(str)) ? Objects.equals(m6647l(), strM6645j) ? null : new C1367h(strM6645j, this.f10139h) : new C1367h(strM6645j, str);
        if (c1367h != null) {
            m6641c(c1367h);
        }
        this.f10143l = c1367h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3128a c3128a) {
        return this.f10138g.mo7350l().compareTo(c3128a.f10138g.mo7350l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6641c(C1367h c1367h) {
        if (this.f10142k == null) {
            c1367h.f4533d = m6638p(c1367h.f4532c, c1367h.f4531b, null, true, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3128a)) {
            return false;
        }
        return this.f10138g.equals(((C3128a) obj).f10138g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m6642f() {
        C1367h c1367h = this.f10143l;
        if (c1367h != null) {
            String str = c1367h.f4533d;
            return str == null ? m6638p(m6645j(), m6646k(), this.f10142k, true, false) : str;
        }
        C3128a c3128a = this.f10142k;
        return (c3128a == null || !c3128a.m6649n()) ? this.f10141j : m6638p(m6645j(), m6646k(), this.f10142k, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m6643g() {
        String strM6645j = m6645j();
        char c10 = File.separatorChar;
        return strM6645j.replace('.', c10) + c10 + m6644i().replace('.', '_');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10138g.f11410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m6644i() {
        C3128a c3128a = this.f10142k;
        return c3128a == null ? m6646k() : AbstractC4855en.m9264h(c3128a.m6644i(), ".", m6646k());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m6645j() {
        if (m6650o()) {
            return this.f10142k.m6645j();
        }
        C1367h c1367h = this.f10143l;
        return c1367h == null ? m6647l() : c1367h.f4532c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m6646k() {
        C1367h c1367h = this.f10143l;
        return c1367h == null ? this.f10139h : c1367h.f4531b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m6647l() {
        C3128a c3128a = this.f10142k;
        if (c3128a != null) {
            return c3128a.m6647l();
        }
        String str = this.f10140i;
        if (str != null) {
            return str;
        }
        C0086a.m452k("Package is null for not inner class");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C3128a m6648m() {
        C3128a c3128a = this.f10142k;
        if (c3128a == null) {
            return null;
        }
        C3128a c3128aM6648m = c3128a.m6648m();
        return c3128aM6648m != null ? c3128aM6648m : this.f10142k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m6649n() {
        C1367h c1367h = this.f10143l;
        if (c1367h != null && !c1367h.f4531b.equals(this.f10139h)) {
            return true;
        }
        C3128a c3128a = this.f10142k;
        return c3128a != null && c3128a.m6649n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m6650o() {
        return this.f10142k != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m6651q() {
        return m6638p(this.f10140i, this.f10139h, this.f10142k, false, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m6652r(C4325u c4325u, AbstractC3506j abstractC3506j, boolean z9) {
        String str;
        int iLastIndexOf;
        String strMo7350l = abstractC3506j.mo7350l();
        int iLastIndexOf2 = strMo7350l.lastIndexOf(46);
        boolean z10 = true;
        if (iLastIndexOf2 == -1) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            String strSubstring = strMo7350l.substring(0, iLastIndexOf2);
            strMo7350l = strMo7350l.substring(iLastIndexOf2 + 1);
            str = strSubstring;
        }
        if (!z9 || (iLastIndexOf = strMo7350l.lastIndexOf(36)) <= 0 || iLastIndexOf == strMo7350l.length() - 1) {
            z10 = false;
        } else {
            String strM9264h = AbstractC4855en.m9264h(str, ".", strMo7350l.substring(0, iLastIndexOf));
            if (str.isEmpty()) {
                strM9264h = strMo7350l.substring(0, iLastIndexOf);
            }
            this.f10140i = null;
            this.f10142k = m6637e(c4325u, AbstractC3506j.m7360x(strM9264h));
            strMo7350l = strMo7350l.substring(iLastIndexOf + 1);
        }
        if (!z10) {
            this.f10140i = str;
            this.f10142k = null;
        }
        this.f10139h = strMo7350l;
        this.f10141j = m6638p(this.f10140i, strMo7350l, this.f10142k, false, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f10141j;
    }
}
