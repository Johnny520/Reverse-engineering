package p036c9;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: c9.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0440g1 extends AbstractC0473o2 {

    /* JADX INFO: renamed from: b */
    public final String f1296b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0440g1(String str) {
        str.getClass();
        this.f1296b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0440g1) && AbstractC1416l.m3825a(this.f1296b, ((C0440g1) obj).f1296b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1296b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2251n("Group(groupId=", this.f1296b, ")");
    }
}
