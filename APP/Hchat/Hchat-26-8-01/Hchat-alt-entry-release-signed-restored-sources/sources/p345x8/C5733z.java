package p345x8;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: x8.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5733z {

    /* JADX INFO: renamed from: a */
    public final String f23352a;

    /* JADX INFO: renamed from: b */
    public final String f23353b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5733z(String str, String str2) {
        this.f23352a = str;
        this.f23353b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5733z)) {
            return false;
        }
        C5733z c5733z = (C5733z) obj;
        return this.f23352a.equals(c5733z.f23352a) && this.f23353b.equals(c5733z.f23353b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23353b.hashCode() + (this.f23352a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("XiaozhiModelOption(id=", this.f23352a, ", name=", this.f23353b, ")");
    }
}
