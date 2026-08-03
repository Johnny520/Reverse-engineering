package p009a9;

import gg.AbstractC1416l;
import p365y9.C6010f;

/* JADX INFO: renamed from: a9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0024a {

    /* JADX INFO: renamed from: a */
    public final C6010f f78a;

    /* JADX INFO: renamed from: b */
    public final int f79b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0024a(C6010f c6010f, int i9) {
        this.f78a = c6010f;
        this.f79b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0024a)) {
            return false;
        }
        C0024a c0024a = (C0024a) obj;
        return AbstractC1416l.m3825a(this.f78a, c0024a.f78a) && this.f79b == c0024a.f79b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C6010f c6010f = this.f78a;
        return Integer.hashCode(this.f79b) + ((c6010f == null ? 0 : c6010f.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BaseNameStyle(color=" + this.f78a + ", weight=" + this.f79b + ")";
    }
}
