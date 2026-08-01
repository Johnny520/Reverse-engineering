package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0047t {

    /* JADX INFO: renamed from: a */
    public final boolean f279a;

    /* JADX INFO: renamed from: b */
    public final String f280b;

    /* JADX INFO: renamed from: c */
    public final boolean f281c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0047t(boolean z2, String str, boolean z3) {
        AbstractC0223g.m418e(str, "message");
        this.f279a = z2;
        this.f280b = str;
        this.f281c = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0047t)) {
            return false;
        }
        C0047t c0047t = (C0047t) obj;
        return this.f279a == c0047t.f279a && AbstractC0223g.m414a(this.f280b, c0047t.f280b) && this.f281c == c0047t.f281c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f281c) + AbstractC0174d.m347c(this.f280b, Boolean.hashCode(this.f279a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScanResult(success=" + this.f279a + ", message=" + this.f280b + ", retryable=" + this.f281c + ")";
    }
}
