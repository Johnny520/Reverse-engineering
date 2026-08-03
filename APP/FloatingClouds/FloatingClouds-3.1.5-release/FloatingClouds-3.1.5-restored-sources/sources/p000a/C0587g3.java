package p000a;

import java.util.List;

/* JADX INFO: renamed from: a.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0587g3 implements InterfaceC0711md {

    /* JADX INFO: renamed from: a */
    public final String f2184a;

    /* JADX INFO: renamed from: b */
    public final String f2185b;

    /* JADX INFO: renamed from: c */
    public final List<String> f2186c;

    /* JADX INFO: renamed from: d */
    public final String f2187d;

    /* JADX INFO: renamed from: e */
    public final int f2188e;

    public C0587g3() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0587g3(String str, String str2, int i, int i2) {
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        i = (i2 & 16) != 0 ? 0 : i;
        this.f2184a = str;
        this.f2185b = str2;
        this.f2186c = c0439y5;
        this.f2187d = "";
        this.f2188e = i;
    }

    @Override // p000a.InterfaceC0711md
    /* JADX INFO: renamed from: a */
    public final String mo1424a() {
        return this.f2184a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0587g3)) {
            return false;
        }
        C0587g3 c0587g3 = (C0587g3) obj;
        return C0631i9.m1478a(this.f2184a, c0587g3.f2184a) && C0631i9.m1478a(this.f2185b, c0587g3.f2185b) && C0631i9.m1478a(this.f2186c, c0587g3.f2186c) && C0631i9.m1478a(this.f2187d, c0587g3.f2187d) && this.f2188e == c0587g3.f2188e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2188e) + C0944z.m2222b(this.f2187d, (this.f2186c.hashCode() + C0944z.m2222b(this.f2185b, this.f2184a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "ClassRule(ruleId=" + this.f2184a + ", classNameSubstring=" + this.f2185b + ", interfaceNames=" + this.f2186c + ", superClassName=" + this.f2187d + ", priority=" + this.f2188e + ")";
    }
}
