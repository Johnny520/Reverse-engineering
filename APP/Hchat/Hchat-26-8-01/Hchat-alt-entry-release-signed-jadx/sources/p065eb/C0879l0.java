package p065eb;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: eb.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0879l0 {

    /* JADX INFO: renamed from: a */
    public final String f2697a;

    /* JADX INFO: renamed from: b */
    public final String f2698b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0879l0(String str, String str2) {
        this.f2697a = str;
        this.f2698b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0879l0)) {
            return false;
        }
        C0879l0 c0879l0 = (C0879l0) obj;
        return this.f2697a.equals(c0879l0.f2697a) && this.f2698b.equals(c0879l0.f2698b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2698b.hashCode() + (this.f2697a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("TextDecoration(prefix=", this.f2697a, ", suffix=", this.f2698b, ")");
    }
}
