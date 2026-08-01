package p216p;

import p117X2.AbstractC1665j;
import p211o0.C2743b;
import p211o0.C2747f;
import p211o0.C2750i;
import p222q0.C2901b;

/* JADX INFO: renamed from: p.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2858o {

    /* JADX INFO: renamed from: a */
    public C2747f f8999a = null;

    /* JADX INFO: renamed from: b */
    public C2743b f9000b = null;

    /* JADX INFO: renamed from: c */
    public C2901b f9001c = null;

    /* JADX INFO: renamed from: d */
    public C2750i f9002d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2858o)) {
            return false;
        }
        C2858o c2858o = (C2858o) obj;
        return AbstractC1665j.m2981a(this.f8999a, c2858o.f8999a) && AbstractC1665j.m2981a(this.f9000b, c2858o.f9000b) && AbstractC1665j.m2981a(this.f9001c, c2858o.f9001c) && AbstractC1665j.m2981a(this.f9002d, c2858o.f9002d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2747f c2747f = this.f8999a;
        int iHashCode = (c2747f == null ? 0 : c2747f.hashCode()) * 31;
        C2743b c2743b = this.f9000b;
        int iHashCode2 = (iHashCode + (c2743b == null ? 0 : c2743b.hashCode())) * 31;
        C2901b c2901b = this.f9001c;
        int iHashCode3 = (iHashCode2 + (c2901b == null ? 0 : c2901b.hashCode())) * 31;
        C2750i c2750i = this.f9002d;
        return iHashCode3 + (c2750i != null ? c2750i.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f8999a + ", canvas=" + this.f9000b + ", canvasDrawScope=" + this.f9001c + ", borderPath=" + this.f9002d + ')';
    }
}
