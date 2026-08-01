package p000;

/* JADX INFO: renamed from: di */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0130di {

    /* JADX INFO: renamed from: a */
    public final int f1110a;

    /* JADX INFO: renamed from: b */
    public final Integer f1111b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0130di(int i, z60 z60Var, Integer num) {
        this.f1110a = i;
        this.f1111b = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0130di)) {
            return false;
        }
        C0130di c0130di = (C0130di) obj;
        return this.f1110a == c0130di.f1110a && p30.m3002l(null, null) && p30.m3002l(this.f1111b, c0130di.f1111b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f1110a) * 31) + 0) * 31;
        Integer num = this.f1111b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f1110a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f1111b + ')';
    }
}
