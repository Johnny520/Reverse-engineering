package p119i2;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: i2.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1943o0 implements InterfaceC1916b {

    /* JADX INFO: renamed from: a */
    public final String f6591a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1943o0(String str) {
        this.f6591a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1943o0) {
            return this.f6591a.equals(((C1943o0) obj).f6591a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6591a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2254q(new StringBuilder("UrlAnnotation(url="), this.f6591a, ')');
    }
}
