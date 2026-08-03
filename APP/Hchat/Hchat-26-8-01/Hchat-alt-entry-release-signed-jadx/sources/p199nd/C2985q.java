package p199nd;

import p025bc.AbstractC0255e;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: nd.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2985q {

    /* JADX INFO: renamed from: a */
    public final int f9750a;

    /* JADX INFO: renamed from: b */
    public final int f9751b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2985q(int i9, int i10) {
        this.f9750a = i9;
        this.f9751b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2985q.class != obj.getClass()) {
            return false;
        }
        C2985q c2985q = (C2985q) obj;
        return this.f9751b == c2985q.f9751b && this.f9750a == c2985q.f9750a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9751b * 31) + this.f9750a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1021j("JUMP: ", AbstractC5792m.m10487d(this.f9750a), " -> ", AbstractC5792m.m10487d(this.f9751b));
    }
}
