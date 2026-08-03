package p230p8;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p218og.AbstractC3149m;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: p8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3350d {

    /* JADX INFO: renamed from: a */
    public final String f10775a;

    /* JADX INFO: renamed from: b */
    public final String f10776b;

    /* JADX INFO: renamed from: c */
    public final int f10777c;

    /* JADX INFO: renamed from: d */
    public final int f10778d;

    /* JADX INFO: renamed from: e */
    public final int f10779e;

    /* JADX INFO: renamed from: f */
    public final long f10780f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3350d(String str, String str2, int i9, int i10, int i11, long j3, int i12) {
        str2 = (i12 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        i9 = (i12 & 4) != 0 ? 0 : i9;
        i10 = (i12 & 8) != 0 ? 0 : i10;
        i11 = (i12 & 16) != 0 ? 0 : i11;
        j3 = (i12 & 32) != 0 ? 0L : j3;
        str.getClass();
        this.f10775a = str;
        this.f10776b = str2;
        this.f10777c = i9;
        this.f10778d = i10;
        this.f10779e = i11;
        this.f10780f = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m7066a() {
        return !AbstractC3149m.m6721t0(this.f10776b) && this.f10777c > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3350d)) {
            return false;
        }
        C3350d c3350d = (C3350d) obj;
        return AbstractC1416l.m3825a(this.f10775a, c3350d.f10775a) && this.f10776b.equals(c3350d.f10776b) && this.f10777c == c3350d.f10777c && this.f10778d == c3350d.f10778d && this.f10779e == c3350d.f10779e && this.f10780f == c3350d.f10780f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(0L) + AbstractC0921a.m2243f(AbstractC0921a.m2242e(this.f10779e, AbstractC0921a.m2242e(this.f10778d, AbstractC0921a.m2242e(this.f10777c, AbstractC0921a.m2244g(this.f10775a.hashCode() * 31, 31, this.f10776b), 31), 31), 31), 31, this.f10780f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PreparedSnsImage(imagePath=", this.f10775a, ", liveVideoPath=", this.f10776b, ", liveVideoDurationMillis=");
        AbstractC4855en.m9272p(sbM1027p, this.f10777c, ", liveVideoWidth=", this.f10778d, ", liveVideoHeight=");
        sbM1027p.append(this.f10779e);
        sbM1027p.append(", liveVideoSizeBytes=");
        sbM1027p.append(this.f10780f);
        sbM1027p.append(", liveVideoCoverTimeMillis=0)");
        return sbM1027p.toString();
    }
}
