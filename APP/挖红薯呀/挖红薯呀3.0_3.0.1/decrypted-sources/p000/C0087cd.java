package p000;

/* JADX INFO: renamed from: cd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0087cd {

    /* JADX INFO: renamed from: a */
    public InterfaceC0968ym f787a;

    /* JADX INFO: renamed from: b */
    public k50 f788b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0051bd f789c;

    /* JADX INFO: renamed from: d */
    public long f790d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0087cd)) {
            return false;
        }
        C0087cd c0087cd = (C0087cd) obj;
        return p30.m3002l(this.f787a, c0087cd.f787a) && this.f788b == c0087cd.f788b && p30.m3002l(this.f789c, c0087cd.f789c) && q11.m3185a(this.f790d, c0087cd.f790d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f790d) + ((this.f789c.hashCode() + ((this.f788b.hashCode() + (this.f787a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DrawParams(density=" + this.f787a + ", layoutDirection=" + this.f788b + ", canvas=" + this.f789c + ", size=" + ((Object) q11.m3188d(this.f790d)) + ')';
    }
}
