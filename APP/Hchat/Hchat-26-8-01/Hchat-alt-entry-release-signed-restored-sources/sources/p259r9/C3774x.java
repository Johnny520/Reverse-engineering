package p259r9;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: r9.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3774x {

    /* JADX INFO: renamed from: a */
    public final Object f12346a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3774x(Object obj) {
        this.f12346a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3774x) && AbstractC1416l.m3825a(this.f12346a, ((C3774x) obj).f12346a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f12346a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageDetailsBindState(holder=" + this.f12346a + ")";
    }
}
