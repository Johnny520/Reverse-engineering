package p345x8;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: x8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5712e {

    /* JADX INFO: renamed from: a */
    public final String f23228a;

    /* JADX INFO: renamed from: b */
    public final String f23229b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5712e(String str, String str2) {
        str2.getClass();
        this.f23228a = str;
        this.f23229b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5712e)) {
            return false;
        }
        C5712e c5712e = (C5712e) obj;
        return this.f23228a.equals(c5712e.f23228a) && AbstractC1416l.m3825a(this.f23229b, c5712e.f23229b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23229b.hashCode() + (this.f23228a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("AiMessage(role=", this.f23228a, ", content=", this.f23229b, ")");
    }
}
