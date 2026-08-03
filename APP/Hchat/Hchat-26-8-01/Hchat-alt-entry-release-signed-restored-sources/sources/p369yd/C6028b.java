package p369yd;

import ae.C0076g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import md.AbstractC2828e;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p233pd.C3390a;
import p233pd.C3398i;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3510n;
import p281t3.AbstractC4106c;
import p302ud.C4320p;
import p332wb.AbstractC4855en;
import p351xe.C5784e;

/* JADX INFO: renamed from: yd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6028b extends AbstractC2828e {

    /* JADX INFO: renamed from: i */
    public final int f24477i;

    /* JADX INFO: renamed from: j */
    public final List f24478j;

    /* JADX INFO: renamed from: k */
    public final C5784e f24479k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6028b(C6028b c6028b) {
        this.f24477i = c6028b.f24477i;
        this.f24479k = c6028b.f24479k;
        if (c6028b.f24477i == 1) {
            this.f24478j = Collections.EMPTY_LIST;
        } else {
            this.f24478j = new ArrayList(c6028b.f24478j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static C6028b m10790K(C6028b c6028b) {
        int i9 = c6028b.f24477i;
        List list = c6028b.f24478j;
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 0) {
            C5784e c5784e = c6028b.f24479k;
            ((C3398i) c5784e.f23527b).m7176l0();
            return new C6028b(c5784e);
        }
        if (iM8279b == 1) {
            return new C6028b(2, Arrays.asList(c6028b.m10793H(), m10791M((C6028b) list.get(1)), m10791M((C6028b) list.get(2))));
        }
        if (iM8279b == 2) {
            return c6028b.m10793H();
        }
        if (iM8279b != 3 && iM8279b != 4) {
            C0086a.m452k("Unknown mode for invert: ".concat(AbstractC4855en.m9273q(i9)));
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m10790K((C6028b) it.next()));
        }
        return new C6028b(i9 == 4 ? 5 : 4, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static C6028b m10791M(C6028b c6028b) {
        if (c6028b.f24477i == 3) {
            return c6028b.m10793H();
        }
        C5784e c5784e = c6028b.f24479k;
        if (c5784e == null) {
            return new C6028b(3, Collections.singletonList(c6028b));
        }
        ((C3398i) c5784e.f23527b).m7176l0();
        return new C6028b(c5784e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6028b m10792O(C6028b c6028b) {
        C6028b c6028bM10790K;
        int size;
        int i9;
        C6028b c6028b2;
        int i10 = 0;
        if (c6028b.m10796L()) {
            c6028bM10790K = c6028b;
            C5784e c5784e = c6028bM10790K.f24479k;
            C3398i c3398i = (C3398i) c5784e.f23527b;
            C3398i c3398i2 = (C3398i) c5784e.f23527b;
            AbstractC3508l abstractC3508lMo7179S = c3398i.mo7179S(0);
            abstractC3508lMo7179S.getClass();
            if (abstractC3508lMo7179S instanceof C3509m) {
                AbstractC3508l abstractC3508lM10466a = c5784e.m10466a();
                abstractC3508lM10466a.getClass();
                if (abstractC3508lM10466a instanceof C3510n) {
                    long j3 = ((C3510n) c5784e.m10466a()).f11422l;
                    if (j3 == 0 || j3 == 1) {
                        C4320p c4320p = ((C3509m) c3398i2.mo7179S(0)).f11421l;
                        int iOrdinal = c4320p.f14396k.ordinal();
                        if (iOrdinal == 3) {
                            AbstractC3506j abstractC3506jMo7375I = c5784e.m10466a().mo7375I();
                            C3503g c3503g = AbstractC3506j.f11386c;
                            if (abstractC3506jMo7375I == c3503g && ((i9 = ((C3390a) c4320p).f10928o) == 7 || i9 == 6)) {
                                int i11 = c3398i2.f10945p;
                                boolean z9 = (i11 == 2 && j3 == 0) || (i11 == 1 && j3 == 1);
                                int i12 = z9 ? 2 : 1;
                                c6028b2 = new C6028b((!(z9 && i9 == 7) && (z9 || i9 != 6)) ? 4 : 5, Arrays.asList(new C6028b(new C5784e(new C3398i(i12, c4320p.mo7179S(0), new C3510n(0L, c3503g)))), new C6028b(new C5784e(new C3398i(i12, c4320p.mo7179S(1), new C3510n(0L, c3503g))))));
                            }
                            if (c6028b2 != null) {
                            }
                        } else if ((iOrdinal == 13 || iOrdinal == 14) && j3 == 0) {
                            int i13 = c3398i2.f10945p;
                            AbstractC3508l abstractC3508lMo7179S2 = c4320p.mo7179S(0);
                            AbstractC3508l abstractC3508lMo7179S3 = c4320p.mo7179S(1);
                            c3398i2.f10945p = i13;
                            c3398i2.mo7182c0(0, abstractC3508lMo7179S2);
                            c3398i2.mo7182c0(1, abstractC3508lMo7179S3);
                        }
                        c6028b2 = null;
                        if (c6028b2 != null) {
                        }
                    }
                }
            } else {
                c6028b2 = null;
                if (c6028b2 != null) {
                    return c6028b2;
                }
                if (c3398i2.f10945p == 1 && c5784e.m10466a().m7378L()) {
                    c3398i2.m7176l0();
                    c6028bM10790K = new C6028b(3, Collections.singletonList(new C6028b(c5784e)));
                } else {
                    c3398i2.m7177m0();
                }
            }
        } else {
            c6028bM10790K = c6028b;
        }
        List list = c6028bM10790K.f24478j;
        ArrayList arrayList = null;
        for (int i14 = 0; i14 < list.size(); i14++) {
            C6028b c6028b3 = (C6028b) list.get(i14);
            C6028b c6028bM10792O = m10792O(c6028b3);
            if (c6028bM10792O != c6028b3) {
                if (arrayList == null) {
                    arrayList = new ArrayList(list);
                }
                arrayList.set(i14, c6028bM10792O);
            }
        }
        if (arrayList != null) {
            c6028bM10790K = new C6028b(c6028bM10790K.f24477i, arrayList);
        }
        if (c6028bM10790K.f24477i == 3 && c6028bM10790K.m10793H().f24477i == 3) {
            c6028bM10790K = m10790K(c6028bM10790K.m10793H());
        }
        if (c6028bM10790K.f24477i == 2 && c6028bM10790K.m10793H().f24477i == 3) {
            c6028bM10790K = m10790K(c6028bM10790K);
        }
        int i15 = c6028bM10790K.f24477i;
        List<C6028b> list2 = c6028bM10790K.f24478j;
        if ((i15 != 5 && i15 != 4) || (size = list2.size()) <= 1) {
            return c6028bM10790K;
        }
        for (C6028b c6028b4 : list2) {
            if (c6028b4.f24477i == 3 || (c6028b4.m10796L() && ((C3398i) c6028b4.f24479k.f23527b).f10945p == 2)) {
                i10++;
            }
        }
        return i10 > size / 2 ? m10791M(m10790K(c6028bM10790K)) : c6028bM10790K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final C6028b m10793H() {
        return (C6028b) this.f24478j.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final C4320p m10794I() {
        return this.f24477i == 1 ? (C3398i) this.f24479k.f23527b : ((C6028b) this.f24478j.get(0)).m10794I();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final ArrayList m10795J() {
        ArrayList arrayList = new ArrayList();
        if (this.f24477i == 1) {
            ((C3398i) this.f24479k.f23527b).mo8340U(arrayList);
            return arrayList;
        }
        Iterator it = this.f24478j.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C6028b) it.next()).m10795J());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final boolean m10796L() {
        return this.f24477i == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final boolean m10797N(AbstractC3508l abstractC3508l, AbstractC3508l abstractC3508l2) {
        if (this.f24477i == 1) {
            return ((C3398i) this.f24479k.f23527b).mo7181b0(abstractC3508l, abstractC3508l2);
        }
        Iterator it = this.f24478j.iterator();
        while (it.hasNext()) {
            if (((C6028b) it.next()).m10797N(abstractC3508l, abstractC3508l2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m10798P(Consumer consumer) {
        if (this.f24477i == 1) {
            ((C3398i) this.f24479k.f23527b).mo8342h0(consumer);
        } else {
            this.f24478j.forEach(new C0076g(consumer, 23));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6028b)) {
            return false;
        }
        C6028b c6028b = (C6028b) obj;
        return this.f24477i == c6028b.f24477i && Objects.equals(this.f24478j, c6028b.f24478j) && Objects.equals(this.f24479k, c6028b.f24479k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f24478j.hashCode() + ((AbstractC4106c.m8279b(this.f24477i) + (super.hashCode() * 31)) * 31)) * 31;
        C5784e c5784e = this.f24479k;
        return iHashCode + (c5784e != null ? c5784e.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f24477i;
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 0) {
            return this.f24479k.toString();
        }
        List list = this.f24478j;
        if (iM8279b == 1) {
            return AbstractC0255e.m1033v(String.valueOf(m10793H()), " ? ", String.valueOf((C6028b) list.get(1)), " : ", String.valueOf((C6028b) list.get(2)));
        }
        if (iM8279b == 2) {
            return AbstractC0921a.m2251n("!(", String.valueOf(m10793H()), ")");
        }
        if (iM8279b != 3 && iM8279b != 4) {
            return "??";
        }
        String str = i9 == 5 ? " || " : " && ";
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append((C6028b) it.next());
            if (it.hasNext()) {
                sb2.append(str);
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public C6028b(int i9, List list) {
        this.f24477i = i9;
        this.f24478j = list;
        this.f24479k = null;
    }

    public C6028b(C5784e c5784e) {
        this.f24477i = 1;
        this.f24479k = c5784e;
        this.f24478j = Collections.EMPTY_LIST;
    }
}
