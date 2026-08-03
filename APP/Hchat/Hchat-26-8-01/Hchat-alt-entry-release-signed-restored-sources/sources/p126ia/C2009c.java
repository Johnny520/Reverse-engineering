package p126ia;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import p136j8.AbstractC2091b;
import tf.C4173t;

/* JADX INFO: renamed from: ia.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2009c {

    /* JADX INFO: renamed from: a */
    public final List f6778a;

    /* JADX INFO: renamed from: b */
    public final List f6779b;

    /* JADX INFO: renamed from: c */
    public final List f6780c;

    /* JADX INFO: renamed from: d */
    public final List f6781d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2009c(List list, List list2, List list3, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f6778a = list;
        this.f6779b = list2;
        this.f6780c = list3;
        this.f6781d = list4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2009c m4961a(List list, List list2, List list3, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new C2009c(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2009c m4962b(C2009c c2009c, List list, List list2, ArrayList arrayList, ArrayList arrayList2, int i9) {
        if ((i9 & 1) != 0) {
            list = c2009c.f6778a;
        }
        if ((i9 & 2) != 0) {
            list2 = c2009c.f6779b;
        }
        List list3 = arrayList;
        if ((i9 & 4) != 0) {
            list3 = c2009c.f6780c;
        }
        List list4 = arrayList2;
        if ((i9 & 8) != 0) {
            list4 = c2009c.f6781d;
        }
        return m4961a(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m4963c() {
        return this.f6778a.isEmpty() && this.f6779b.isEmpty() && this.f6780c.isEmpty() && this.f6781d.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2009c)) {
            return false;
        }
        C2009c c2009c = (C2009c) obj;
        return AbstractC1416l.m3825a(this.f6778a, c2009c.f6778a) && AbstractC1416l.m3825a(this.f6779b, c2009c.f6779b) && AbstractC1416l.m3825a(this.f6780c, c2009c.f6780c) && AbstractC1416l.m3825a(this.f6781d, c2009c.f6781d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6781d.hashCode() + AbstractC2091b.m5158e(this.f6780c, AbstractC2091b.m5158e(this.f6779b, this.f6778a.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FakeSnsInteraction(likes=" + this.f6778a + ", comments=" + this.f6779b + ", pendingLikes=" + this.f6780c + ", pendingComments=" + this.f6781d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2009c(int i9, List list, List list2) {
        int i10 = i9 & 1;
        C4173t c4173t = C4173t.f13710g;
        this(i10 != 0 ? c4173t : list, (i9 & 2) != 0 ? c4173t : list2, c4173t, c4173t);
    }
}
