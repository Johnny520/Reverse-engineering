package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0013M {

    /* JADX INFO: renamed from: a */
    public final String f120a;

    /* JADX INFO: renamed from: b */
    public final String f121b;

    /* JADX INFO: renamed from: c */
    public final String f122c;

    /* JADX INFO: renamed from: d */
    public final String f123d;

    /* JADX INFO: renamed from: e */
    public final int f124e;

    /* JADX INFO: renamed from: f */
    public final String f125f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0013M(String str, String str2, String str3, String str4, int i2, String str5) {
        this.f120a = str;
        this.f121b = str2;
        this.f122c = str3;
        this.f123d = str4;
        this.f124e = i2;
        this.f125f = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0013M)) {
            return false;
        }
        C0013M c0013m = (C0013M) obj;
        return AbstractC0223g.m414a(this.f120a, c0013m.f120a) && AbstractC0223g.m414a(this.f121b, c0013m.f121b) && AbstractC0223g.m414a(this.f122c, c0013m.f122c) && AbstractC0223g.m414a(this.f123d, c0013m.f123d) && this.f124e == c0013m.f124e && AbstractC0223g.m414a(this.f125f, c0013m.f125f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f125f.hashCode() + AbstractC0174d.m345a(this.f124e, AbstractC0174d.m347c(this.f123d, AbstractC0174d.m347c(this.f122c, AbstractC0174d.m347c(this.f121b, this.f120a.hashCode() * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyConversationHookPoint(adapterClassName=");
        sb.append(this.f120a);
        sb.append(", itemClassName=");
        sb.append(this.f121b);
        sb.append(", getItemMethodName=");
        sb.append(this.f122c);
        sb.append(", usernameMethodName=");
        sb.append(this.f123d);
        sb.append(", versionCode=");
        sb.append(this.f124e);
        sb.append(", versionName=");
        return AbstractC0174d.m356l(sb, this.f125f, ")");
    }
}
