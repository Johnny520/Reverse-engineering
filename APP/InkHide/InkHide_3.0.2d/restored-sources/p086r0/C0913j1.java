package p086r0;

import java.util.List;
import java.util.Set;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913j1 {

    /* JADX INFO: renamed from: a */
    public final Set f3234a;

    /* JADX INFO: renamed from: b */
    public final Set f3235b;

    /* JADX INFO: renamed from: c */
    public final Set f3236c;

    /* JADX INFO: renamed from: d */
    public final List f3237d;

    /* JADX INFO: renamed from: e */
    public final List f3238e;

    /* JADX INFO: renamed from: f */
    public final List f3239f;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r8v0 java.util.Set)
  (r9v0 java.util.Set)
  (r10v0 java.util.Set)
  (r11v0 java.util.List)
  (wrap:java.util.List:0x0000: SGET  A[WRAPPED] (LINE:1) r0.l1.n java.util.List)
  (wrap:java.util.List:0x0002: SGET  A[WRAPPED] (LINE:2) r0.l1.o java.util.List)
 A[MD:(java.util.Set, java.util.Set, java.util.Set, java.util.List, java.util.List, java.util.List):void (m)] (LINE:3) call: r0.j1.<init>(java.util.Set, java.util.Set, java.util.Set, java.util.List, java.util.List, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0913j1(Set set, Set set2, Set set3, List list) {
        this(set, set2, set3, list, C0919l1.f3264n, C0919l1.f3265o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0913j1)) {
            return false;
        }
        C0913j1 c0913j1 = (C0913j1) obj;
        return AbstractC0223g.m414a(this.f3234a, c0913j1.f3234a) && AbstractC0223g.m414a(this.f3235b, c0913j1.f3235b) && AbstractC0223g.m414a(this.f3236c, c0913j1.f3236c) && AbstractC0223g.m414a(this.f3237d, c0913j1.f3237d) && AbstractC0223g.m414a(this.f3238e, c0913j1.f3238e) && AbstractC0223g.m414a(this.f3239f, c0913j1.f3239f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3239f.hashCode() + AbstractC0174d.m349e(this.f3238e, AbstractC0174d.m349e(this.f3237d, (this.f3236c.hashCode() + ((this.f3235b.hashCode() + (this.f3234a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StorageVersionConfig(adapterClassNames=" + this.f3234a + ", itemClassNames=" + this.f3235b + ", fileSortEntryNames=" + this.f3236c + ", refreshMethodNames=" + this.f3237d + ", cleanFilterDelays=" + this.f3238e + ", listRefreshDelays=" + this.f3239f + ")";
    }

    public C0913j1(Set set, Set set2, Set set3, List list, List list2, List list3) {
        AbstractC0223g.m418e(list2, "cleanFilterDelays");
        AbstractC0223g.m418e(list3, "listRefreshDelays");
        this.f3234a = set;
        this.f3235b = set2;
        this.f3236c = set3;
        this.f3237d = list;
        this.f3238e = list2;
        this.f3239f = list3;
    }
}
