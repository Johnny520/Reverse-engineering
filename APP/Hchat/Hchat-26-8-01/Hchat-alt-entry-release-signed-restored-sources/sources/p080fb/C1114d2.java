package p080fb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: fb.d2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1114d2 {

    /* JADX INFO: renamed from: a */
    public final String f3652a;

    /* JADX INFO: renamed from: b */
    public final String f3653b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1114d2(String str, String str2) {
        str.getClass();
        this.f3652a = str;
        this.f3653b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1114d2)) {
            return false;
        }
        C1114d2 c1114d2 = (C1114d2) obj;
        return AbstractC1416l.m3825a(this.f3652a, c1114d2.f3652a) && this.f3653b.equals(c1114d2.f3653b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3653b.hashCode() + (this.f3652a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("GitHubRepository(owner=", this.f3652a, ", name=", this.f3653b, ")");
    }
}
