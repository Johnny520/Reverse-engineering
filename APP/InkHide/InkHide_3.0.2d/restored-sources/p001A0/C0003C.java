package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0003C {

    /* JADX INFO: renamed from: a */
    public final Object f24a;

    /* JADX INFO: renamed from: b */
    public final Object f25b;

    /* JADX INFO: renamed from: c */
    public final Object f26c;

    /* JADX INFO: renamed from: d */
    public final int f27d;

    /* JADX INFO: renamed from: e */
    public final String f28e;

    /* JADX INFO: renamed from: f */
    public final long f29f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0003C(List list, List list2, List list3, int i2, String str, long j2) {
        this.f24a = list;
        this.f25b = list2;
        this.f26c = list3;
        this.f27d = i2;
        this.f28e = str;
        this.f29f = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0003C)) {
            return false;
        }
        C0003C c0003c = (C0003C) obj;
        return this.f24a.equals(c0003c.f24a) && this.f25b.equals(c0003c.f25b) && this.f26c.equals(c0003c.f26c) && this.f27d == c0003c.f27d && this.f28e.equals(c0003c.f28e) && this.f29f == c0003c.f29f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f29f) + AbstractC0174d.m347c(this.f28e, AbstractC0174d.m345a(this.f27d, AbstractC0174d.m346b(this.f26c, AbstractC0174d.m346b(this.f25b, this.f24a.hashCode() * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedGroupCreateContactHookPoint(activityClassNames=" + this.f24a + ", adapterClassNames=" + this.f25b + ", listEntryNames=" + this.f26c + ", versionCode=" + this.f27d + ", versionName=" + this.f28e + ", updatedAt=" + this.f29f + ")";
    }
}
