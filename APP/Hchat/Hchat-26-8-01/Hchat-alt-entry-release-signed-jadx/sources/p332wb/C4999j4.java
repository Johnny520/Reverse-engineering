package p332wb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: wb.j4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4999j4 extends AbstractC5065l4 {

    /* JADX INFO: renamed from: a */
    public final String f18045a;

    /* JADX INFO: renamed from: b */
    public final String f18046b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4999j4(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f18045a = str;
        this.f18046b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4999j4)) {
            return false;
        }
        C4999j4 c4999j4 = (C4999j4) obj;
        return AbstractC1416l.m3825a(this.f18045a, c4999j4.f18045a) && AbstractC1416l.m3825a(this.f18046b, c4999j4.f18046b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18046b.hashCode() + (this.f18045a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("GroupEditor(groupId=", this.f18045a, ", label=", this.f18046b, ")");
    }
}
