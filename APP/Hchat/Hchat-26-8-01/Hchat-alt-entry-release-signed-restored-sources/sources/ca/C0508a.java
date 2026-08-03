package ca;

import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ca.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0508a {

    /* JADX INFO: renamed from: a */
    public final String f1552a;

    /* JADX INFO: renamed from: b */
    public final int f1553b;

    /* JADX INFO: renamed from: c */
    public final int f1554c;

    /* JADX INFO: renamed from: d */
    public final int f1555d;

    /* JADX INFO: renamed from: e */
    public final long f1556e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0508a(int i9, int i10, String str, long j3, int i11) {
        this.f1552a = str;
        this.f1553b = i9;
        this.f1554c = i10;
        this.f1555d = i11;
        this.f1556e = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0508a)) {
            return false;
        }
        C0508a c0508a = (C0508a) obj;
        return this.f1552a.equals(c0508a.f1552a) && this.f1553b == c0508a.f1553b && this.f1554c == c0508a.f1554c && this.f1555d == c0508a.f1555d && this.f1556e == c0508a.f1556e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f1556e) + AbstractC0921a.m2242e(this.f1555d, AbstractC0921a.m2242e(this.f1554c, AbstractC0921a.m2242e(this.f1553b, this.f1552a.hashCode() * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2258u = AbstractC0921a.m2258u(this.f1553b, "ChatLivePhotoMedia(videoPath=", this.f1552a, ", durationMillis=", ", width=");
        AbstractC4855en.m9272p(sbM2258u, this.f1554c, ", height=", this.f1555d, ", sizeBytes=");
        return AbstractC0921a.m2253p(sbM2258u, this.f1556e, ")");
    }
}
