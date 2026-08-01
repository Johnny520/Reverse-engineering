package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0008H {

    /* JADX INFO: renamed from: a */
    public final Object f69a;

    /* JADX INFO: renamed from: b */
    public final Object f70b;

    /* JADX INFO: renamed from: c */
    public final int f71c;

    /* JADX INFO: renamed from: d */
    public final String f72d;

    /* JADX INFO: renamed from: e */
    public final long f73e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0008H(List list, List list2, int i2, String str, long j2) {
        this.f69a = list;
        this.f70b = list2;
        this.f71c = i2;
        this.f72d = str;
        this.f73e = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0008H)) {
            return false;
        }
        C0008H c0008h = (C0008H) obj;
        return this.f69a.equals(c0008h.f69a) && this.f70b.equals(c0008h.f70b) && this.f71c == c0008h.f71c && this.f72d.equals(c0008h.f72d) && this.f73e == c0008h.f73e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f73e) + AbstractC0174d.m347c(this.f72d, AbstractC0174d.m345a(this.f71c, AbstractC0174d.m346b(this.f70b, this.f69a.hashCode() * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedSearchCommandHookPoint(searchViewClassNames=" + this.f69a + ", editTextFieldNames=" + this.f70b + ", versionCode=" + this.f71c + ", versionName=" + this.f72d + ", updatedAt=" + this.f73e + ")";
    }
}
