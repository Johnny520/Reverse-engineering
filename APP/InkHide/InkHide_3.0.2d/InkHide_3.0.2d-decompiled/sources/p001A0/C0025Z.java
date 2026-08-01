package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0025Z {

    /* JADX INFO: renamed from: a */
    public final List f197a;

    /* JADX INFO: renamed from: b */
    public final List f198b;

    /* JADX INFO: renamed from: c */
    public final List f199c;

    /* JADX INFO: renamed from: d */
    public final List f200d;

    /* JADX INFO: renamed from: e */
    public final List f201e;

    /* JADX INFO: renamed from: f */
    public final List f202f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0025Z(List list, List list2, List list3, List list4, List list5, List list6) {
        this.f197a = list;
        this.f198b = list2;
        this.f199c = list3;
        this.f200d = list4;
        this.f201e = list5;
        this.f202f = list6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0025Z m5a(C0025Z c0025z, List list, List list2, int i2) {
        List list3 = c0025z.f197a;
        if ((i2 & 2) != 0) {
            list = c0025z.f198b;
        }
        List list4 = list;
        List list5 = c0025z.f199c;
        List list6 = c0025z.f200d;
        if ((i2 & 16) != 0) {
            list2 = c0025z.f201e;
        }
        List list7 = c0025z.f202f;
        c0025z.getClass();
        return new C0025Z(list3, list4, list5, list6, list2, list7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0025Z)) {
            return false;
        }
        C0025Z c0025z = (C0025Z) obj;
        return AbstractC0223g.m414a(this.f197a, c0025z.f197a) && AbstractC0223g.m414a(this.f198b, c0025z.f198b) && AbstractC0223g.m414a(this.f199c, c0025z.f199c) && AbstractC0223g.m414a(this.f200d, c0025z.f200d) && AbstractC0223g.m414a(this.f201e, c0025z.f201e) && AbstractC0223g.m414a(this.f202f, c0025z.f202f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f202f.hashCode() + AbstractC0174d.m349e(this.f201e, AbstractC0174d.m349e(this.f200d, AbstractC0174d.m349e(this.f199c, AbstractC0174d.m349e(this.f198b, this.f197a.hashCode() * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HookPoint(adapterClassNames=" + this.f197a + ", itemClassNames=" + this.f198b + ", usernameFieldNames=" + this.f199c + ", refreshMethodNames=" + this.f200d + ", fileSortEntryNames=" + this.f201e + ", fileSortActivityClassNames=" + this.f202f + ")";
    }
}
