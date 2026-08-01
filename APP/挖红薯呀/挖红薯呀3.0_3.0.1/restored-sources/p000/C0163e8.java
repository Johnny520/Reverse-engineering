package p000;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0163e8 {

    /* JADX INFO: renamed from: a */
    public final Object f1338a;

    /* JADX INFO: renamed from: b */
    public final int f1339b;

    /* JADX INFO: renamed from: c */
    public final int f1340c;

    /* JADX INFO: renamed from: d */
    public final String f1341d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0163e8(Object obj, int i, int i2, String str) {
        this.f1338a = obj;
        this.f1339b = i;
        this.f1340c = i2;
        this.f1341d = str;
        if (i <= i2) {
            return;
        }
        x10.m5082a("Reversed range is not supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0163e8)) {
            return false;
        }
        C0163e8 c0163e8 = (C0163e8) obj;
        return p30.m3002l(this.f1338a, c0163e8.f1338a) && this.f1339b == c0163e8.f1339b && this.f1340c == c0163e8.f1340c && p30.m3002l(this.f1341d, c0163e8.f1341d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f1338a;
        return this.f1341d.hashCode() + AbstractC0748t1.m4144b(this.f1340c, AbstractC0748t1.m4144b(this.f1339b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Range(item=" + this.f1338a + ", start=" + this.f1339b + ", end=" + this.f1340c + ", tag=" + this.f1341d + ')';
    }

    public C0163e8(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
