package p086r0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0868S {

    /* JADX INFO: renamed from: a */
    public final String f2987a;

    /* JADX INFO: renamed from: b */
    public final String f2988b;

    /* JADX INFO: renamed from: c */
    public final String f2989c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0868S(String str, String str2, String str3) {
        this.f2987a = str;
        this.f2988b = str2;
        this.f2989c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0868S)) {
            return false;
        }
        C0868S c0868s = (C0868S) obj;
        return AbstractC0223g.m414a(this.f2987a, c0868s.f2987a) && AbstractC0223g.m414a(this.f2988b, c0868s.f2988b) && AbstractC0223g.m414a(this.f2989c, c0868s.f2989c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2989c.hashCode() + AbstractC0174d.m347c(this.f2988b, this.f2987a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPopupCreateSpec(popupClassName=");
        sb.append(this.f2987a);
        sb.append(", callbackClassName=");
        sb.append(this.f2988b);
        sb.append(", methodName=");
        return AbstractC0174d.m356l(sb, this.f2989c, ")");
    }
}
