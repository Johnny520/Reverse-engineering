package qa;

/* JADX INFO: renamed from: qa.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3473a {

    /* JADX INFO: renamed from: a */
    public final EnumC3474b f11267a;

    /* JADX INFO: renamed from: b */
    public final String f11268b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3473a(EnumC3474b enumC3474b, String str) {
        this.f11267a = enumC3474b;
        this.f11268b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3473a)) {
            return false;
        }
        C3473a c3473a = (C3473a) obj;
        return this.f11267a == c3473a.f11267a && this.f11268b.equals(c3473a.f11268b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11268b.hashCode() + (this.f11267a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AmountOverride(target=" + this.f11267a + ", original=" + this.f11268b + ")";
    }
}
