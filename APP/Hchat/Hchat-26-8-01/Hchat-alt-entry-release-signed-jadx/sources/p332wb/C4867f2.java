package p332wb;

import gg.AbstractC1416l;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: wb.f2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4867f2 {

    /* JADX INFO: renamed from: a */
    public final List f17044a;

    /* JADX INFO: renamed from: b */
    public final Set f17045b;

    /* JADX INFO: renamed from: c */
    public final Set f17046c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4867f2(List list, Set set, Set set2) {
        list.getClass();
        set.getClass();
        set2.getClass();
        this.f17044a = list;
        this.f17045b = set;
        this.f17046c = set2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4867f2)) {
            return false;
        }
        C4867f2 c4867f2 = (C4867f2) obj;
        return AbstractC1416l.m3825a(this.f17044a, c4867f2.f17044a) && AbstractC1416l.m3825a(this.f17045b, c4867f2.f17045b) && AbstractC1416l.m3825a(this.f17046c, c4867f2.f17046c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17046c.hashCode() + ((this.f17045b.hashCode() + (this.f17044a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConversationGroupPickerData(options=" + this.f17044a + ", friendIds=" + this.f17045b + ", officialIds=" + this.f17046c + ")";
    }
}
