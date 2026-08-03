package p332wb;

import gg.AbstractC1416l;
import java.util.List;
import tf.C4173t;

/* JADX INFO: renamed from: wb.j5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5000j5 {

    /* JADX INFO: renamed from: a */
    public final List f18047a;

    /* JADX INFO: renamed from: b */
    public final List f18048b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5000j5(List list, List list2) {
        this.f18047a = list;
        this.f18048b = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5000j5)) {
            return false;
        }
        C5000j5 c5000j5 = (C5000j5) obj;
        return AbstractC1416l.m3825a(this.f18047a, c5000j5.f18047a) && AbstractC1416l.m3825a(this.f18048b, c5000j5.f18048b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18048b.hashCode() + (this.f18047a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageBlockContactData(contacts=" + this.f18047a + ", labels=" + this.f18048b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5000j5() {
        C4173t c4173t = C4173t.f13710g;
        this(c4173t, c4173t);
    }
}
