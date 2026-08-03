package p065eb;

import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: eb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0858c {

    /* JADX INFO: renamed from: a */
    public final String f2624a;

    /* JADX INFO: renamed from: b */
    public final List f2625b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0858c(String str, List list) {
        str.getClass();
        this.f2624a = str;
        this.f2625b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0858c)) {
            return false;
        }
        C0858c c0858c = (C0858c) obj;
        return AbstractC1416l.m3825a(this.f2624a, c0858c.f2624a) && this.f2625b.equals(c0858c.f2625b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2625b.hashCode() + AbstractC0921a.m2244g(101304342, 31, this.f2624a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MemberNotice(type=join, groupWxid=" + this.f2624a + ", members=" + this.f2625b + ")";
    }
}
