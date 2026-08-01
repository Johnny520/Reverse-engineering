package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0012L {

    /* JADX INFO: renamed from: a */
    public final Object f109a;

    /* JADX INFO: renamed from: b */
    public final Object f110b;

    /* JADX INFO: renamed from: c */
    public final Object f111c;

    /* JADX INFO: renamed from: d */
    public final Object f112d;

    /* JADX INFO: renamed from: e */
    public final Object f113e;

    /* JADX INFO: renamed from: f */
    public final Object f114f;

    /* JADX INFO: renamed from: g */
    public final Object f115g;

    /* JADX INFO: renamed from: h */
    public final Object f116h;

    /* JADX INFO: renamed from: i */
    public final int f117i;

    /* JADX INFO: renamed from: j */
    public final String f118j;

    /* JADX INFO: renamed from: k */
    public final long f119k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0012L(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i2, String str, long j2) {
        this.f109a = list;
        this.f110b = list2;
        this.f111c = list3;
        this.f112d = list4;
        this.f113e = list5;
        this.f114f = list6;
        this.f115g = list7;
        this.f116h = list8;
        this.f117i = i2;
        this.f118j = str;
        this.f119k = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0012L)) {
            return false;
        }
        C0012L c0012l = (C0012L) obj;
        return this.f109a.equals(c0012l.f109a) && this.f110b.equals(c0012l.f110b) && this.f111c.equals(c0012l.f111c) && this.f112d.equals(c0012l.f112d) && this.f113e.equals(c0012l.f113e) && this.f114f.equals(c0012l.f114f) && this.f115g.equals(c0012l.f115g) && this.f116h.equals(c0012l.f116h) && this.f117i == c0012l.f117i && this.f118j.equals(c0012l.f118j) && this.f119k == c0012l.f119k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f119k) + AbstractC0174d.m347c(this.f118j, AbstractC0174d.m345a(this.f117i, AbstractC0174d.m346b(this.f116h, AbstractC0174d.m346b(this.f115g, AbstractC0174d.m346b(this.f114f, AbstractC0174d.m346b(this.f113e, AbstractC0174d.m346b(this.f112d, AbstractC0174d.m346b(this.f111c, AbstractC0174d.m346b(this.f110b, this.f109a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedTextStatusHookPoint(activityClassNames=" + this.f109a + ", adapterClassNames=" + this.f110b + ", dataFieldNames=" + this.f111c + ", groupItemClassNames=" + this.f112d + ", titleItemClassNames=" + this.f113e + ", mainRecyclerEntryNames=" + this.f114f + ", titleEntryNames=" + this.f115g + ", avatarContainerEntryNames=" + this.f116h + ", versionCode=" + this.f117i + ", versionName=" + this.f118j + ", updatedAt=" + this.f119k + ")";
    }
}
