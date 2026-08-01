package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0010J {

    /* JADX INFO: renamed from: a */
    public final Object f94a;

    /* JADX INFO: renamed from: b */
    public final Object f95b;

    /* JADX INFO: renamed from: c */
    public final Object f96c;

    /* JADX INFO: renamed from: d */
    public final Object f97d;

    /* JADX INFO: renamed from: e */
    public final Object f98e;

    /* JADX INFO: renamed from: f */
    public final Object f99f;

    /* JADX INFO: renamed from: g */
    public final int f100g;

    /* JADX INFO: renamed from: h */
    public final String f101h;

    /* JADX INFO: renamed from: i */
    public final long f102i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0010J(List list, List list2, List list3, List list4, List list5, List list6, int i2, String str, long j2) {
        this.f94a = list;
        this.f95b = list2;
        this.f96c = list3;
        this.f97d = list4;
        this.f98e = list5;
        this.f99f = list6;
        this.f100g = i2;
        this.f101h = str;
        this.f102i = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0010J)) {
            return false;
        }
        C0010J c0010j = (C0010J) obj;
        return this.f94a.equals(c0010j.f94a) && this.f95b.equals(c0010j.f95b) && this.f96c.equals(c0010j.f96c) && this.f97d.equals(c0010j.f97d) && this.f98e.equals(c0010j.f98e) && this.f99f.equals(c0010j.f99f) && this.f100g == c0010j.f100g && this.f101h.equals(c0010j.f101h) && this.f102i == c0010j.f102i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f102i) + AbstractC0174d.m347c(this.f101h, AbstractC0174d.m345a(this.f100g, AbstractC0174d.m346b(this.f99f, AbstractC0174d.m346b(this.f98e, AbstractC0174d.m346b(this.f97d, AbstractC0174d.m346b(this.f96c, AbstractC0174d.m346b(this.f95b, this.f94a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedStorageHookPoint(adapterClassNames=" + this.f94a + ", itemClassNames=" + this.f95b + ", usernameFieldNames=" + this.f96c + ", refreshMethodNames=" + this.f97d + ", fileSortEntryNames=" + this.f98e + ", fileSortActivityClassNames=" + this.f99f + ", versionCode=" + this.f100g + ", versionName=" + this.f101h + ", updatedAt=" + this.f102i + ")";
    }
}
