package p086r0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0896e {

    /* JADX INFO: renamed from: a */
    public final long f3152a;

    /* JADX INFO: renamed from: b */
    public final String f3153b;

    /* JADX INFO: renamed from: c */
    public final boolean f3154c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0896e(long j2, String str, boolean z2) {
        this.f3152a = j2;
        this.f3153b = str;
        this.f3154c = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0896e)) {
            return false;
        }
        C0896e c0896e = (C0896e) obj;
        return this.f3152a == c0896e.f3152a && AbstractC0223g.m414a(this.f3153b, c0896e.f3153b) && this.f3154c == c0896e.f3154c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3154c) + AbstractC0174d.m347c(this.f3153b, Long.hashCode(this.f3152a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OriginalMessage(createTime=" + this.f3152a + ", content=" + this.f3153b + ", isSend=" + this.f3154c + ")";
    }
}
