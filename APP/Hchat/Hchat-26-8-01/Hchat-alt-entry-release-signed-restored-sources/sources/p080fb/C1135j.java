package p080fb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1135j {

    /* JADX INFO: renamed from: a */
    public final String f3724a;

    /* JADX INFO: renamed from: b */
    public final String f3725b;

    /* JADX INFO: renamed from: c */
    public final String f3726c;

    /* JADX INFO: renamed from: d */
    public final String f3727d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1135j(String str, String str2, String str3, String str4) {
        this.f3724a = str;
        this.f3725b = str2;
        this.f3726c = str3;
        this.f3727d = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1135j)) {
            return false;
        }
        C1135j c1135j = (C1135j) obj;
        return this.f3724a.equals(c1135j.f3724a) && this.f3725b.equals(c1135j.f3725b) && this.f3726c.equals(c1135j.f3726c) && this.f3727d.equals(c1135j.f3727d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3727d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3724a.hashCode() * 31, 31, this.f3725b), 31, this.f3726c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("NativeToolCallBuilder(id=", this.f3724a, ", name=", this.f3725b, ", arguments="), this.f3726c, ", providerMetadata=", this.f3727d, ")");
    }
}
