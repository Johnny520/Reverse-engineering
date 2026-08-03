package p119i2;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i2.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1929h0 implements InterfaceC1916b {

    /* JADX INFO: renamed from: a */
    public final String f6537a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1929h0) {
            return AbstractC1416l.m3825a(this.f6537a, ((C1929h0) obj).f6537a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6537a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StringAnnotation(value=" + this.f6537a + ')';
    }
}
