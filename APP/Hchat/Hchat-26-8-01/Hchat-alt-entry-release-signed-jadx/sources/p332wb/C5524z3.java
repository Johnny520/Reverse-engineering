package p332wb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: wb.z3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5524z3 extends AbstractC4738b4 {

    /* JADX INFO: renamed from: a */
    public final String f22316a;

    /* JADX INFO: renamed from: b */
    public final String f22317b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5524z3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22316a = str;
        this.f22317b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5524z3)) {
            return false;
        }
        C5524z3 c5524z3 = (C5524z3) obj;
        return AbstractC1416l.m3825a(this.f22316a, c5524z3.f22316a) && AbstractC1416l.m3825a(this.f22317b, c5524z3.f22317b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f22317b.hashCode() + (this.f22316a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("GroupEditor(groupId=", this.f22316a, ", label=", this.f22317b, ")");
    }
}
