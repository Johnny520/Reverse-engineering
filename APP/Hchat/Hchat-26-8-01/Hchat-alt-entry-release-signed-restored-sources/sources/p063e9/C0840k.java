package p063e9;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: e9.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0840k {

    /* JADX INFO: renamed from: a */
    public final String f2552a;

    /* JADX INFO: renamed from: b */
    public final String f2553b;

    /* JADX INFO: renamed from: c */
    public final String f2554c;

    /* JADX INFO: renamed from: d */
    public final String f2555d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0840k(String str, String str2, String str3, String str4) {
        this.f2552a = str;
        this.f2553b = str2;
        this.f2554c = str3;
        this.f2555d = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840k)) {
            return false;
        }
        C0840k c0840k = (C0840k) obj;
        return this.f2552a.equals(c0840k.f2552a) && this.f2553b.equals(c0840k.f2553b) && this.f2554c.equals(c0840k.f2554c) && this.f2555d.equals(c0840k.f2555d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2555d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f2552a.hashCode() * 31, 31, this.f2553b), 31, this.f2554c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("NativeNotifyPayload(title=", this.f2552a, ", text=", this.f2553b, ", summary="), this.f2554c, ", talker=", this.f2555d, ")");
    }
}
