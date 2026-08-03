package p261rb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: rb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3793i {

    /* JADX INFO: renamed from: a */
    public final String f12437a;

    /* JADX INFO: renamed from: b */
    public final String f12438b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3793i(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f12437a = str;
        this.f12438b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3793i)) {
            return false;
        }
        C3793i c3793i = (C3793i) obj;
        return AbstractC1416l.m3825a(this.f12437a, c3793i.f12437a) && AbstractC1416l.m3825a(this.f12438b, c3793i.f12438b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12438b.hashCode() + (this.f12437a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("DeleteTarget(wxid=", this.f12437a, ", name=", this.f12438b, ")");
    }
}
