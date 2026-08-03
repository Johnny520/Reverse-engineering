package p080fb;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: fb.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1180u0 {

    /* JADX INFO: renamed from: a */
    public final String f3966a;

    /* JADX INFO: renamed from: b */
    public final String f3967b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1180u0(String str, String str2) {
        this.f3966a = str;
        this.f3967b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180u0)) {
            return false;
        }
        C1180u0 c1180u0 = (C1180u0) obj;
        return this.f3966a.equals(c1180u0.f3966a) && this.f3967b.equals(c1180u0.f3967b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3967b.hashCode() + (this.f3966a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("Parts(stable=", this.f3966a, ", runtimeContext=", this.f3967b, ")");
    }
}
