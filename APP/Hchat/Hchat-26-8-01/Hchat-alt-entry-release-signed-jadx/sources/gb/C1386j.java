package gb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: gb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1386j {

    /* JADX INFO: renamed from: a */
    public final String f4605a;

    /* JADX INFO: renamed from: b */
    public final String f4606b;

    /* JADX INFO: renamed from: c */
    public final String f4607c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1386j(String str, String str2, String str3) {
        this.f4605a = str;
        this.f4606b = str2;
        this.f4607c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1386j)) {
            return false;
        }
        C1386j c1386j = (C1386j) obj;
        return this.f4605a.equals(c1386j.f4605a) && this.f4606b.equals(c1386j.f4606b) && this.f4607c.equals(c1386j.f4607c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4607c.hashCode() + AbstractC0921a.m2244g(this.f4605a.hashCode() * 31, 31, this.f4606b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("UploaderIdentity(wxId=", this.f4605a, ", weChatId=", this.f4606b, ", nickname="), this.f4607c, ")");
    }
}
