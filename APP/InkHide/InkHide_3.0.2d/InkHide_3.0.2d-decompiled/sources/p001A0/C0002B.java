package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0002B {

    /* JADX INFO: renamed from: a */
    public final Object f11a;

    /* JADX INFO: renamed from: b */
    public final Object f12b;

    /* JADX INFO: renamed from: c */
    public final Object f13c;

    /* JADX INFO: renamed from: d */
    public final Object f14d;

    /* JADX INFO: renamed from: e */
    public final Object f15e;

    /* JADX INFO: renamed from: f */
    public final Object f16f;

    /* JADX INFO: renamed from: g */
    public final String f17g;

    /* JADX INFO: renamed from: h */
    public final String f18h;

    /* JADX INFO: renamed from: i */
    public final String f19i;

    /* JADX INFO: renamed from: j */
    public final String f20j;

    /* JADX INFO: renamed from: k */
    public final int f21k;

    /* JADX INFO: renamed from: l */
    public final String f22l;

    /* JADX INFO: renamed from: m */
    public final long f23m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0002B(List list, List list2, List list3, List list4, List list5, List list6, String str, String str2, String str3, String str4, int i2, String str5, long j2) {
        this.f11a = list;
        this.f12b = list2;
        this.f13c = list3;
        this.f14d = list4;
        this.f15e = list5;
        this.f16f = list6;
        this.f17g = str;
        this.f18h = str2;
        this.f19i = str3;
        this.f20j = str4;
        this.f21k = i2;
        this.f22l = str5;
        this.f23m = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0002B)) {
            return false;
        }
        C0002B c0002b = (C0002B) obj;
        return this.f11a.equals(c0002b.f11a) && this.f12b.equals(c0002b.f12b) && this.f13c.equals(c0002b.f13c) && this.f14d.equals(c0002b.f14d) && this.f15e.equals(c0002b.f15e) && this.f16f.equals(c0002b.f16f) && this.f17g.equals(c0002b.f17g) && this.f18h.equals(c0002b.f18h) && this.f19i.equals(c0002b.f19i) && this.f20j.equals(c0002b.f20j) && this.f21k == c0002b.f21k && this.f22l.equals(c0002b.f22l) && this.f23m == c0002b.f23m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f23m) + AbstractC0174d.m347c(this.f22l, AbstractC0174d.m345a(this.f21k, AbstractC0174d.m347c(this.f20j, AbstractC0174d.m347c(this.f19i, AbstractC0174d.m347c(this.f18h, AbstractC0174d.m347c(this.f17g, AbstractC0174d.m346b(this.f16f, AbstractC0174d.m346b(this.f15e, AbstractC0174d.m346b(this.f14d, AbstractC0174d.m346b(this.f13c, AbstractC0174d.m346b(this.f12b, this.f11a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedConversationHookPoint(adapterClassNames=" + this.f11a + ", dataSourceClassNames=" + this.f12b + ", itemClassNames=" + this.f13c + ", holderClassNames=" + this.f14d + ", requestClassNames=" + this.f15e + ", storageClassNames=" + this.f16f + ", getDataSourceMethodName=" + this.f17g + ", getConversationListMethodName=" + this.f18h + ", requestRefreshMethodName=" + this.f19i + ", submitListMethodName=" + this.f20j + ", versionCode=" + this.f21k + ", versionName=" + this.f22l + ", updatedAt=" + this.f23m + ")";
    }
}
