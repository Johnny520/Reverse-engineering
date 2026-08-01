package p086r0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0957y0 {

    /* JADX INFO: renamed from: a */
    public final String f3443a;

    /* JADX INFO: renamed from: b */
    public final String f3444b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0957y0(String str, String str2) {
        AbstractC0223g.m418e(str, "popupClassName");
        AbstractC0223g.m418e(str2, "methodName");
        this.f3443a = str;
        this.f3444b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0957y0)) {
            return false;
        }
        C0957y0 c0957y0 = (C0957y0) obj;
        return AbstractC0223g.m414a(this.f3443a, c0957y0.f3443a) && AbstractC0223g.m414a(this.f3444b, c0957y0.f3444b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3444b.hashCode() + (this.f3443a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConversationPopupMethodSpec(popupClassName=" + this.f3443a + ", methodName=" + this.f3444b + ")";
    }
}
