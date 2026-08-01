package p001A0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0016P {

    /* JADX INFO: renamed from: a */
    public final String f139a;

    /* JADX INFO: renamed from: b */
    public final String f140b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0016P(String str, String str2) {
        this.f139a = str;
        this.f140b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0016P)) {
            return false;
        }
        C0016P c0016p = (C0016P) obj;
        return AbstractC0223g.m414a(this.f139a, c0016p.f139a) && AbstractC0223g.m414a(this.f140b, c0016p.f140b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f140b.hashCode() + (this.f139a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PopupMethodSpec(popupClassName=" + this.f139a + ", methodName=" + this.f140b + ")";
    }
}
