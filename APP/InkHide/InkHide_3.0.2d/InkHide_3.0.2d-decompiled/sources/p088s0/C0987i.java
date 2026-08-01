package p088s0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0987i {

    /* JADX INFO: renamed from: a */
    public final String f3531a;

    /* JADX INFO: renamed from: b */
    public final String f3532b;

    /* JADX INFO: renamed from: c */
    public final String f3533c;

    /* JADX INFO: renamed from: d */
    public final String f3534d;

    /* JADX INFO: renamed from: e */
    public final String f3535e;

    /* JADX INFO: renamed from: f */
    public final String f3536f;

    /* JADX INFO: renamed from: g */
    public final String f3537g;

    /* JADX INFO: renamed from: h */
    public final String f3538h;

    /* JADX INFO: renamed from: i */
    public final String f3539i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0987i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC0223g.m418e(str3, "subtitle");
        this.f3531a = str;
        this.f3532b = str2;
        this.f3533c = str3;
        this.f3534d = str4;
        this.f3535e = str5;
        this.f3536f = str6;
        this.f3537g = str7;
        this.f3538h = str8;
        this.f3539i = str9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0987i)) {
            return false;
        }
        C0987i c0987i = (C0987i) obj;
        return AbstractC0223g.m414a(this.f3531a, c0987i.f3531a) && AbstractC0223g.m414a(this.f3532b, c0987i.f3532b) && AbstractC0223g.m414a(this.f3533c, c0987i.f3533c) && AbstractC0223g.m414a(this.f3534d, c0987i.f3534d) && AbstractC0223g.m414a(this.f3535e, c0987i.f3535e) && AbstractC0223g.m414a(this.f3536f, c0987i.f3536f) && AbstractC0223g.m414a(this.f3537g, c0987i.f3537g) && AbstractC0223g.m414a(this.f3538h, c0987i.f3538h) && AbstractC0223g.m414a(this.f3539i, c0987i.f3539i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3539i.hashCode() + AbstractC0174d.m347c(this.f3538h, AbstractC0174d.m347c(this.f3537g, AbstractC0174d.m347c(this.f3536f, AbstractC0174d.m347c(this.f3535e, AbstractC0174d.m347c(this.f3534d, AbstractC0174d.m347c(this.f3533c, AbstractC0174d.m347c(this.f3532b, this.f3531a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactRow(wxid=");
        sb.append(this.f3531a);
        sb.append(", displayName=");
        sb.append(this.f3532b);
        sb.append(", subtitle=");
        sb.append(this.f3533c);
        sb.append(", alias=");
        sb.append(this.f3534d);
        sb.append(", remark=");
        sb.append(this.f3535e);
        sb.append(", nickname=");
        sb.append(this.f3536f);
        sb.append(", pyInitial=");
        sb.append(this.f3537g);
        sb.append(", quanPin=");
        sb.append(this.f3538h);
        sb.append(", avatarUrl=");
        return AbstractC0174d.m356l(sb, this.f3539i, ")");
    }
}
