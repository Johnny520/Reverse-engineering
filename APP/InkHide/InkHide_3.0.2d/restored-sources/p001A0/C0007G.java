package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0007G {

    /* JADX INFO: renamed from: a */
    public final Object f62a;

    /* JADX INFO: renamed from: b */
    public final Object f63b;

    /* JADX INFO: renamed from: c */
    public final Object f64c;

    /* JADX INFO: renamed from: d */
    public final Object f65d;

    /* JADX INFO: renamed from: e */
    public final int f66e;

    /* JADX INFO: renamed from: f */
    public final String f67f;

    /* JADX INFO: renamed from: g */
    public final long f68g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0007G(List list, List list2, List list3, List list4, int i2, String str, long j2) {
        this.f62a = list;
        this.f63b = list2;
        this.f64c = list3;
        this.f65d = list4;
        this.f66e = i2;
        this.f67f = str;
        this.f68g = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0007G)) {
            return false;
        }
        C0007G c0007g = (C0007G) obj;
        return this.f62a.equals(c0007g.f62a) && this.f63b.equals(c0007g.f63b) && this.f64c.equals(c0007g.f64c) && this.f65d.equals(c0007g.f65d) && this.f66e == c0007g.f66e && this.f67f.equals(c0007g.f67f) && this.f68g == c0007g.f68g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f68g) + AbstractC0174d.m347c(this.f67f, AbstractC0174d.m345a(this.f66e, AbstractC0174d.m346b(this.f65d, AbstractC0174d.m346b(this.f64c, AbstractC0174d.m346b(this.f63b, this.f62a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedRecentForwardHookPoint(activityClassNames=" + this.f62a + ", adapterClassNames=" + this.f63b + ", dataFieldNames=" + this.f64c + ", recyclerEntryNames=" + this.f65d + ", versionCode=" + this.f66e + ", versionName=" + this.f67f + ", updatedAt=" + this.f68g + ")";
    }
}
