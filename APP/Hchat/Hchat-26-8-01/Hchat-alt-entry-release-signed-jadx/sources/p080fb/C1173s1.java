package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.s1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1173s1 {

    /* JADX INFO: renamed from: a */
    public final String f3917a;

    /* JADX INFO: renamed from: b */
    public final String f3918b;

    /* JADX INFO: renamed from: c */
    public final String f3919c;

    /* JADX INFO: renamed from: d */
    public final int f3920d;

    /* JADX INFO: renamed from: e */
    public final boolean f3921e;

    /* JADX INFO: renamed from: f */
    public final int f3922f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1173s1(String str, String str2, String str3, int i9, boolean z9, int i10) {
        str.getClass();
        str2.getClass();
        this.f3917a = str;
        this.f3918b = str2;
        this.f3919c = str3;
        this.f3920d = i9;
        this.f3921e = z9;
        this.f3922f = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m2989a() {
        return this.f3918b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2990b() {
        return this.f3921e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1173s1)) {
            return false;
        }
        C1173s1 c1173s1 = (C1173s1) obj;
        return AbstractC1416l.m3825a(this.f3917a, c1173s1.f3917a) && AbstractC1416l.m3825a(this.f3918b, c1173s1.f3918b) && this.f3919c.equals(c1173s1.f3919c) && this.f3920d == c1173s1.f3920d && this.f3921e == c1173s1.f3921e && this.f3922f == c1173s1.f3922f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3922f) + AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f3920d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3917a.hashCode() * 31, 31, this.f3918b), 31, this.f3919c), 31), 31, this.f3921e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("StoredResult(preview=", this.f3917a, ", modelContent=", this.f3918b, ", handle=");
        sbM1027p.append(this.f3919c);
        sbM1027p.append(", totalChars=");
        sbM1027p.append(this.f3920d);
        sbM1027p.append(", truncated=");
        sbM1027p.append(this.f3921e);
        sbM1027p.append(", nextOffset=");
        sbM1027p.append(this.f3922f);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
