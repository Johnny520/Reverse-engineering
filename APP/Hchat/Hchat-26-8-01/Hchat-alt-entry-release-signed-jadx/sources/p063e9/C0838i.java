package p063e9;

import p167l8.EnumC2528c;

/* JADX INFO: renamed from: e9.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838i {

    /* JADX INFO: renamed from: a */
    public final EnumC2528c f2548a;

    /* JADX INFO: renamed from: b */
    public final long f2549b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0838i(EnumC2528c enumC2528c, long j3) {
        this.f2548a = enumC2528c;
        this.f2549b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0838i)) {
            return false;
        }
        C0838i c0838i = (C0838i) obj;
        return this.f2548a == c0838i.f2548a && this.f2549b == c0838i.f2549b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2549b) + (this.f2548a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NativeMentionRecord(type=" + this.f2548a + ", createdAt=" + this.f2549b + ")";
    }
}
