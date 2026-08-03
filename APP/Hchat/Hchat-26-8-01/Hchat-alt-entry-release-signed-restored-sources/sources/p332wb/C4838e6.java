package p332wb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.e6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4838e6 {

    /* JADX INFO: renamed from: a */
    public final String f16756a;

    /* JADX INFO: renamed from: b */
    public final String f16757b;

    /* JADX INFO: renamed from: c */
    public final String f16758c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4838e6(String str, String str2, String str3) {
        this.f16756a = str;
        this.f16757b = str2;
        this.f16758c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4838e6)) {
            return false;
        }
        C4838e6 c4838e6 = (C4838e6) obj;
        return this.f16756a.equals(c4838e6.f16756a) && this.f16757b.equals(c4838e6.f16757b) && this.f16758c.equals(c4838e6.f16758c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16758c.hashCode() + AbstractC0921a.m2244g(this.f16756a.hashCode() * 31, 31, this.f16757b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("MessageBlockTypeOption(key=", this.f16756a, ", title=", this.f16757b, ", summary="), this.f16758c, ")");
    }
}
