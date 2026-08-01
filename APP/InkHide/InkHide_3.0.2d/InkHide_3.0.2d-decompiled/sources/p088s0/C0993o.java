package p088s0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: s0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0993o {

    /* JADX INFO: renamed from: a */
    public final List f3568a;

    /* JADX INFO: renamed from: b */
    public final String f3569b;

    /* JADX INFO: renamed from: c */
    public final String f3570c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0993o(String str, String str2, List list) {
        AbstractC0223g.m418e(list, "keys");
        this.f3568a = list;
        this.f3569b = str;
        this.f3570c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0993o)) {
            return false;
        }
        C0993o c0993o = (C0993o) obj;
        return AbstractC0223g.m414a(this.f3568a, c0993o.f3568a) && AbstractC0223g.m414a(this.f3569b, c0993o.f3569b) && AbstractC0223g.m414a(this.f3570c, c0993o.f3570c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3570c.hashCode() + AbstractC0174d.m347c(this.f3569b, this.f3568a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("HiddenSelfSnsPostItem(keys=");
        sb.append(this.f3568a);
        sb.append(", summary=");
        sb.append(this.f3569b);
        sb.append(", imagePath=");
        return AbstractC0174d.m356l(sb, this.f3570c, ")");
    }
}
