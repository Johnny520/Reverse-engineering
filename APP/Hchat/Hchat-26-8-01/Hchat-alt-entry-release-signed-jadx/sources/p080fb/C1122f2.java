package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: fb.f2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1122f2 {

    /* JADX INFO: renamed from: a */
    public final String f3673a;

    /* JADX INFO: renamed from: b */
    public final String f3674b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1122f2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f3673a = str;
        this.f3674b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122f2)) {
            return false;
        }
        C1122f2 c1122f2 = (C1122f2) obj;
        return AbstractC1416l.m3825a(this.f3673a, c1122f2.f3673a) && AbstractC1416l.m3825a(this.f3674b, c1122f2.f3674b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3674b.hashCode() + (this.f3673a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("SearchLink(label=", this.f3673a, ", url=", this.f3674b, ")");
    }
}
