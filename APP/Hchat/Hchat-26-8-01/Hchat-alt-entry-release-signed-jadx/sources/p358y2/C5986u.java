package p358y2;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: y2.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5986u {

    /* JADX INFO: renamed from: a */
    public final boolean f24307a;

    /* JADX INFO: renamed from: b */
    public final boolean f24308b;

    /* JADX INFO: renamed from: c */
    public final boolean f24309c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5986u(boolean z9, EnumC5969d0 enumC5969d0, boolean z10, boolean z11) {
        this.f24307a = z9;
        this.f24308b = z10;
        this.f24309c = z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5986u)) {
            return false;
        }
        C5986u c5986u = (C5986u) obj;
        return this.f24307a == c5986u.f24307a && this.f24308b == c5986u.f24308b && this.f24309c == c5986u.f24309c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((Boolean.hashCode(this.f24309c) + AbstractC0921a.m2245h((EnumC5969d0.f24261g.hashCode() + AbstractC0921a.m2245h(Boolean.hashCode(this.f24307a) * 31, 31, true)) * 31, 31, this.f24308b)) * 31) + 2) * 31;
    }
}
