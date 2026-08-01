package p086r0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0954x0 {

    /* JADX INFO: renamed from: a */
    public final String f3431a;

    /* JADX INFO: renamed from: b */
    public final String f3432b;

    /* JADX INFO: renamed from: c */
    public final String f3433c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0954x0(String str, String str2, String str3) {
        this.f3431a = str;
        this.f3432b = str2;
        this.f3433c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0954x0)) {
            return false;
        }
        C0954x0 c0954x0 = (C0954x0) obj;
        return AbstractC0223g.m414a(this.f3431a, c0954x0.f3431a) && AbstractC0223g.m414a(this.f3432b, c0954x0.f3432b) && AbstractC0223g.m414a(this.f3433c, c0954x0.f3433c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3433c.hashCode() + AbstractC0174d.m347c(this.f3432b, this.f3431a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationPopupCreateSpec(popupClassName=");
        sb.append(this.f3431a);
        sb.append(", callbackClassName=");
        sb.append(this.f3432b);
        sb.append(", methodName=");
        return AbstractC0174d.m356l(sb, this.f3433c, ")");
    }
}
