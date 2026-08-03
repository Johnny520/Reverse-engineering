package p211o9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: o9.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3096i {

    /* JADX INFO: renamed from: a */
    public final String f9999a;

    /* JADX INFO: renamed from: b */
    public final String f10000b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3096i(String str, String str2) {
        str2.getClass();
        this.f9999a = str;
        this.f10000b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3096i)) {
            return false;
        }
        C3096i c3096i = (C3096i) obj;
        return this.f9999a.equals(c3096i.f9999a) && AbstractC1416l.m3825a(this.f10000b, c3096i.f10000b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10000b.hashCode() + (this.f9999a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("InviteMember(wxid=", this.f9999a, ", name=", this.f10000b, ")");
    }
}
