package p000;

/* JADX INFO: renamed from: oa */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0543oa {

    /* JADX INFO: renamed from: a */
    public C0752t5 f4490a = null;

    /* JADX INFO: renamed from: b */
    public C0041b3 f4491b = null;

    /* JADX INFO: renamed from: c */
    public C0125dd f4492c = null;

    /* JADX INFO: renamed from: d */
    public C0118d6 f4493d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0543oa)) {
            return false;
        }
        C0543oa c0543oa = (C0543oa) obj;
        return p30.m3002l(this.f4490a, c0543oa.f4490a) && p30.m3002l(this.f4491b, c0543oa.f4491b) && p30.m3002l(this.f4492c, c0543oa.f4492c) && p30.m3002l(this.f4493d, c0543oa.f4493d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C0752t5 c0752t5 = this.f4490a;
        int iHashCode = (c0752t5 == null ? 0 : c0752t5.hashCode()) * 31;
        C0041b3 c0041b3 = this.f4491b;
        int iHashCode2 = (iHashCode + (c0041b3 == null ? 0 : c0041b3.hashCode())) * 31;
        C0125dd c0125dd = this.f4492c;
        int iHashCode3 = (iHashCode2 + (c0125dd == null ? 0 : c0125dd.hashCode())) * 31;
        C0118d6 c0118d6 = this.f4493d;
        return iHashCode3 + (c0118d6 != null ? c0118d6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f4490a + ", canvas=" + this.f4491b + ", canvasDrawScope=" + this.f4492c + ", borderPath=" + this.f4493d + ')';
    }
}
