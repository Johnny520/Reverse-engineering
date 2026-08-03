package p002a1;

import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: a1.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0012j {

    /* JADX INFO: renamed from: a */
    public final int f42a;

    /* JADX INFO: renamed from: b */
    public final long f43b;

    /* JADX INFO: renamed from: c */
    public final EnumC0013k f44c;

    /* JADX INFO: renamed from: d */
    public final C0119x f45d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0012j(int i9, long j3, EnumC0013k enumC0013k, C0119x c0119x) {
        this.f42a = i9;
        this.f43b = j3;
        this.f44c = enumC0013k;
        this.f45d = c0119x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0012j)) {
            return false;
        }
        C0012j c0012j = (C0012j) obj;
        return this.f42a == c0012j.f42a && this.f43b == c0012j.f43b && this.f44c == c0012j.f44c && AbstractC1416l.m3825a(this.f45d, c0012j.f45d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f44c.hashCode() + AbstractC0921a.m2243f(Integer.hashCode(this.f42a) * 31, 31, this.f43b)) * 31;
        C0119x c0119x = this.f45d;
        return iHashCode + (c0119x == null ? 0 : c0119x.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f42a + ", timestamp=" + this.f43b + ", type=" + this.f44c + ", structureCompat=" + this.f45d + ')';
    }
}
