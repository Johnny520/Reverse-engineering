package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0001A {

    /* JADX INFO: renamed from: a */
    public final String f0a;

    /* JADX INFO: renamed from: b */
    public final String f1b;

    /* JADX INFO: renamed from: c */
    public final String f2c;

    /* JADX INFO: renamed from: d */
    public final String f3d;

    /* JADX INFO: renamed from: e */
    public final String f4e;

    /* JADX INFO: renamed from: f */
    public final Object f5f;

    /* JADX INFO: renamed from: g */
    public final Object f6g;

    /* JADX INFO: renamed from: h */
    public final String f7h;

    /* JADX INFO: renamed from: i */
    public final int f8i;

    /* JADX INFO: renamed from: j */
    public final String f9j;

    /* JADX INFO: renamed from: k */
    public final long f10k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0001A(String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, int i2, String str7, long j2) {
        this.f0a = str;
        this.f1b = str2;
        this.f2c = str3;
        this.f3d = str4;
        this.f4e = str5;
        this.f5f = list;
        this.f6g = list2;
        this.f7h = str6;
        this.f8i = i2;
        this.f9j = str7;
        this.f10k = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0001A)) {
            return false;
        }
        C0001A c0001a = (C0001A) obj;
        return this.f0a.equals(c0001a.f0a) && this.f1b.equals(c0001a.f1b) && this.f2c.equals(c0001a.f2c) && this.f3d.equals(c0001a.f3d) && this.f4e.equals(c0001a.f4e) && this.f5f.equals(c0001a.f5f) && this.f6g.equals(c0001a.f6g) && this.f7h.equals(c0001a.f7h) && this.f8i == c0001a.f8i && this.f9j.equals(c0001a.f9j) && this.f10k == c0001a.f10k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f10k) + AbstractC0174d.m347c(this.f9j, AbstractC0174d.m345a(this.f8i, AbstractC0174d.m347c(this.f7h, AbstractC0174d.m346b(this.f6g, AbstractC0174d.m346b(this.f5f, AbstractC0174d.m347c(this.f4e, AbstractC0174d.m347c(this.f3d, AbstractC0174d.m347c(this.f2c, AbstractC0174d.m347c(this.f1b, this.f0a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedContactHookPoint(mvvmFragmentClassName=" + this.f0a + ", addressLiveListClassName=" + this.f1b + ", liveListSubmitMethodName=" + this.f2c + ", liveListGetterName=" + this.f3d + ", adapterGetterName=" + this.f4e + ", mvvmAdapterClassNames=" + this.f5f + ", mvvmItemClassNames=" + this.f6g + ", refreshSubmitMethodName=" + this.f7h + ", versionCode=" + this.f8i + ", versionName=" + this.f9j + ", updatedAt=" + this.f10k + ")";
    }
}
