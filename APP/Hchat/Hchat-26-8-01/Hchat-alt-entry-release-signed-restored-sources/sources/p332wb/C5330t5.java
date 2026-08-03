package p332wb;

import gg.AbstractC1416l;
import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.t5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5330t5 {

    /* JADX INFO: renamed from: a */
    public final String f20751a;

    /* JADX INFO: renamed from: b */
    public final String f20752b;

    /* JADX INFO: renamed from: c */
    public final List f20753c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5330t5(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        this.f20751a = str;
        this.f20752b = str2;
        this.f20753c = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5330t5)) {
            return false;
        }
        C5330t5 c5330t5 = (C5330t5) obj;
        return AbstractC1416l.m3825a(this.f20751a, c5330t5.f20751a) && AbstractC1416l.m3825a(this.f20752b, c5330t5.f20752b) && this.f20753c.equals(c5330t5.f20753c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20753c.hashCode() + AbstractC0921a.m2244g(this.f20751a.hashCode() * 31, 31, this.f20752b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("MessageBlockLabelOption(id=", this.f20751a, ", name=", this.f20752b, ", contactIds=");
        sbM1027p.append(this.f20753c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
