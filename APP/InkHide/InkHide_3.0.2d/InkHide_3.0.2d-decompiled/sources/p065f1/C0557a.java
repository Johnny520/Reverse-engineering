package p065f1;

import p027N0.AbstractC0223g;
import p063e1.AbstractC0553a;

/* JADX INFO: renamed from: f1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0557a {

    /* JADX INFO: renamed from: a */
    public final String f1863a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0557a(String str) {
        AbstractC0223g.m418e(str, "descriptor");
        this.f1863a = AbstractC0553a.m1127a(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0557a)) {
            return false;
        }
        return AbstractC0223g.m414a(this.f1863a, ((C0557a) obj).f1863a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1863a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0553a.m1128b(this.f1863a);
    }
}
