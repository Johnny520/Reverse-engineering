package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0015O {

    /* JADX INFO: renamed from: a */
    public final String f136a;

    /* JADX INFO: renamed from: b */
    public final String f137b;

    /* JADX INFO: renamed from: c */
    public final String f138c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0015O(String str, String str2, String str3) {
        this.f136a = str;
        this.f137b = str2;
        this.f138c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0015O)) {
            return false;
        }
        C0015O c0015o = (C0015O) obj;
        return AbstractC0223g.m414a(this.f136a, c0015o.f136a) && AbstractC0223g.m414a(this.f137b, c0015o.f137b) && AbstractC0223g.m414a(this.f138c, c0015o.f138c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f138c.hashCode() + AbstractC0174d.m347c(this.f137b, this.f136a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupCreateSpec(popupClassName=");
        sb.append(this.f136a);
        sb.append(", callbackClassName=");
        sb.append(this.f137b);
        sb.append(", methodName=");
        return AbstractC0174d.m356l(sb, this.f138c, ")");
    }
}
