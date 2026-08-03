package p080fb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: fb.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1185v1 {

    /* JADX INFO: renamed from: a */
    public final EnumC1181u1 f3989a;

    /* JADX INFO: renamed from: b */
    public final String f3990b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1185v1(EnumC1181u1 enumC1181u1, String str) {
        str.getClass();
        this.f3989a = enumC1181u1;
        this.f3990b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185v1)) {
            return false;
        }
        C1185v1 c1185v1 = (C1185v1) obj;
        return this.f3989a == c1185v1.f3989a && AbstractC1416l.m3825a(this.f3990b, c1185v1.f3990b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3990b.hashCode() + (this.f3989a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Operation(kind=" + this.f3989a + ", text=" + this.f3990b + ")";
    }
}
