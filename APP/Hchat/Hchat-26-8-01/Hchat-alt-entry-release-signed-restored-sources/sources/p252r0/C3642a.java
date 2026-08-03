package p252r0;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3642a {

    /* JADX INFO: renamed from: a */
    public int f11821a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3642a) && this.f11821a == ((C3642a) obj).f11821a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f11821a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3199a.m6841n(new StringBuilder("DeltaCounter(count="), this.f11821a, ')');
    }
}
