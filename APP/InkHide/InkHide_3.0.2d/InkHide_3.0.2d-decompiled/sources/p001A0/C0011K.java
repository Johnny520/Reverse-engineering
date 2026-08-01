package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0011K {

    /* JADX INFO: renamed from: a */
    public final Object f103a;

    /* JADX INFO: renamed from: b */
    public final Object f104b;

    /* JADX INFO: renamed from: c */
    public final Object f105c;

    /* JADX INFO: renamed from: d */
    public final int f106d;

    /* JADX INFO: renamed from: e */
    public final String f107e;

    /* JADX INFO: renamed from: f */
    public final long f108f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0011K(List list, List list2, List list3, int i2, String str, long j2) {
        this.f103a = list;
        this.f104b = list2;
        this.f105c = list3;
        this.f106d = i2;
        this.f107e = str;
        this.f108f = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0011K)) {
            return false;
        }
        C0011K c0011k = (C0011K) obj;
        return this.f103a.equals(c0011k.f103a) && this.f104b.equals(c0011k.f104b) && this.f105c.equals(c0011k.f105c) && this.f106d == c0011k.f106d && this.f107e.equals(c0011k.f107e) && this.f108f == c0011k.f108f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f108f) + AbstractC0174d.m347c(this.f107e, AbstractC0174d.m345a(this.f106d, AbstractC0174d.m346b(this.f105c, AbstractC0174d.m346b(this.f104b, this.f103a.hashCode() * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedTagContactHookPoint(activityClassNames=" + this.f103a + ", adapterClassNames=" + this.f104b + ", recyclerEntryNames=" + this.f105c + ", versionCode=" + this.f106d + ", versionName=" + this.f107e + ", updatedAt=" + this.f108f + ")";
    }
}
