package p259r9;

import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: r9.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3773w {

    /* JADX INFO: renamed from: a */
    public final Class f12342a;

    /* JADX INFO: renamed from: b */
    public final String f12343b;

    /* JADX INFO: renamed from: c */
    public final String f12344c;

    /* JADX INFO: renamed from: d */
    public final String f12345d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3773w(Class cls, String str, String str2, String str3) {
        this.f12342a = cls;
        this.f12343b = str;
        this.f12344c = str2;
        this.f12345d = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3773w)) {
            return false;
        }
        C3773w c3773w = (C3773w) obj;
        return this.f12342a.equals(c3773w.f12342a) && this.f12343b.equals(c3773w.f12343b) && this.f12344c.equals(c3773w.f12344c) && this.f12345d.equals(c3773w.f12345d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12345d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f12342a.hashCode() * 31, 31, this.f12343b), 31, this.f12344c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageAccessorKey(type=");
        sb2.append(this.f12342a);
        sb2.append(", getter=");
        sb2.append(this.f12343b);
        sb2.append(", primaryField=");
        return AbstractC2091b.m5164k(sb2, this.f12344c, ", fallbackField=", this.f12345d, ")");
    }
}
