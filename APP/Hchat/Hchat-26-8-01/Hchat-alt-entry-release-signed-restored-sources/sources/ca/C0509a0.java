package ca;

import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ca.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0509a0 {

    /* JADX INFO: renamed from: a */
    public final String f1557a;

    /* JADX INFO: renamed from: b */
    public final String f1558b;

    /* JADX INFO: renamed from: c */
    public final List f1559c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0509a0(String str, String str2, List list) {
        this.f1557a = str;
        this.f1558b = str2;
        this.f1559c = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0509a0)) {
            return false;
        }
        C0509a0 c0509a0 = (C0509a0) obj;
        return this.f1557a.equals(c0509a0.f1557a) && this.f1558b.equals(c0509a0.f1558b) && this.f1559c.equals(c0509a0.f1559c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1559c.hashCode() + AbstractC0921a.m2244g(this.f1557a.hashCode() * 31, 31, this.f1558b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("LabelTargets(title=", this.f1557a, ", summary=", this.f1558b, ", targetIds=");
        sbM1027p.append(this.f1559c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
