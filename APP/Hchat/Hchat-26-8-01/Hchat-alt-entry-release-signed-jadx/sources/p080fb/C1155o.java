package p080fb;

import gg.AbstractC1416l;
import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1155o {

    /* JADX INFO: renamed from: a */
    public final String f3830a;

    /* JADX INFO: renamed from: b */
    public final String f3831b;

    /* JADX INFO: renamed from: c */
    public final List f3832c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1155o(String str, String str2, List list) {
        list.getClass();
        this.f3830a = str;
        this.f3831b = str2;
        this.f3832c = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155o)) {
            return false;
        }
        C1155o c1155o = (C1155o) obj;
        return this.f3830a.equals(c1155o.f3830a) && this.f3831b.equals(c1155o.f3831b) && AbstractC1416l.m3825a(this.f3832c, c1155o.f3832c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3832c.hashCode() + AbstractC0921a.m2244g(this.f3830a.hashCode() * 31, 31, this.f3831b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("StreamCapture(content=", this.f3830a, ", reasoning=", this.f3831b, ", nativeToolCalls=");
        sbM1027p.append(this.f3832c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
