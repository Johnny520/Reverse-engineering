package p230p8;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: p8.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3367s {

    /* JADX INFO: renamed from: a */
    public final String f10865a;

    /* JADX INFO: renamed from: b */
    public final int f10866b;

    /* JADX INFO: renamed from: c */
    public final String f10867c;

    /* JADX INFO: renamed from: d */
    public final String f10868d;

    /* JADX INFO: renamed from: e */
    public final Object f10869e;

    /* JADX INFO: renamed from: f */
    public final C3367s f10870f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3367s(String str, int i9, String str2, String str3, Object obj, C3367s c3367s) {
        obj.getClass();
        this.f10865a = str;
        this.f10866b = i9;
        this.f10867c = str2;
        this.f10868d = str3;
        this.f10869e = obj;
        this.f10870f = c3367s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3367s)) {
            return false;
        }
        C3367s c3367s = (C3367s) obj;
        return this.f10865a.equals(c3367s.f10865a) && this.f10866b == c3367s.f10866b && this.f10867c.equals(c3367s.f10867c) && this.f10868d.equals(c3367s.f10868d) && AbstractC1416l.m3825a(this.f10869e, c3367s.f10869e) && AbstractC1416l.m3825a(this.f10870f, c3367s.f10870f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f10869e.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f10866b, this.f10865a.hashCode() * 31, 31), 31, this.f10867c), 31, this.f10868d)) * 31;
        C3367s c3367s = this.f10870f;
        return iHashCode + (c3367s == null ? 0 : c3367s.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2258u = AbstractC0921a.m2258u(this.f10866b, "SnsForwardMedia(id=", this.f10865a, ", type=", ", url=");
        AbstractC2091b.m5173t(sbM2258u, this.f10867c, ", thumbUrl=", this.f10868d, ", nativeObject=");
        sbM2258u.append(this.f10869e);
        sbM2258u.append(", livePhotoVideo=");
        sbM2258u.append(this.f10870f);
        sbM2258u.append(")");
        return sbM2258u.toString();
    }
}
