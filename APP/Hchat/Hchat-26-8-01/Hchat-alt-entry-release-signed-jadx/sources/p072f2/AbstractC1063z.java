package p072f2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p000a.AbstractC0000a;
import p016b1.C0166f;
import p036c9.C0415a0;
import p038ce.C0549b;
import p057e1.C0808c;
import p069f.AbstractC0944l;
import p069f.C0965w;
import p276sf.C3958e;
import p293u2.EnumC4243m;
import tf.AbstractC4170q;

/* JADX INFO: renamed from: f2.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1063z {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f3408a;

    /* JADX INFO: renamed from: b */
    public static final C1048k f3409b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i9 = 0;
        while (i9 < 2) {
            comparatorArr[i9] = new C0415a0(new C0415a0(i9 == 0 ? C1044g.f3280i : C1044g.f3279h), 9);
            i9++;
        }
        f3408a = comparatorArr;
        f3409b = C1048k.f3291B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2684a(C1054q c1054q, ArrayList arrayList, C0166f c0166f, C0166f c0166f2, C0965w c0965w) {
        C1050m c1050m = c1054q.f3350d;
        Object objM2320g = c1050m.f3341g.m2320g(AbstractC1058u.f3388m);
        if (objM2320g == null) {
            objM2320g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM2320g).booleanValue();
        if ((zBooleanValue || ((Boolean) c0166f2.invoke(c1054q)).booleanValue()) && ((Boolean) c0166f.invoke(c1054q)).booleanValue()) {
            arrayList.add(c1054q);
        }
        if (zBooleanValue) {
            c0965w.m2379h(c1054q.f3352f, m2685b(c1054q, c0166f, c0166f2, C1054q.m2649j(7, c1054q)));
            return;
        }
        List listM2649j = C1054q.m2649j(7, c1054q);
        int size = listM2649j.size();
        for (int i9 = 0; i9 < size; i9++) {
            m2684a((C1054q) listM2649j.get(i9), arrayList, c0166f, c0166f2, c0965w);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m2685b(C1054q c1054q, C0166f c0166f, C0166f c0166f2, List list) {
        int i9;
        C0965w c0965w = AbstractC0944l.f2974a;
        C0965w c0965w2 = new C0965w();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m2684a((C1054q) list.get(i10), arrayList, c0166f, c0166f2, c0965w2);
        }
        int i11 = 1;
        char c10 = c1054q.f3349c.f22772F == EnumC4243m.f13920h ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i12 = 0;
            while (true) {
                C1054q c1054q2 = (C1054q) arrayList.get(i12);
                if (i12 != 0) {
                    float f3 = c1054q2.m2657h().f2417b;
                    float f10 = c1054q2.m2657h().f2419d;
                    int i13 = f3 >= f10 ? i11 : 0;
                    int size3 = arrayList2.size() - i11;
                    if (size3 >= 0) {
                        int i14 = 0;
                        while (true) {
                            C0808c c0808c = (C0808c) ((C3958e) arrayList2.get(i14)).f12961g;
                            float f11 = c0808c.f2417b;
                            i9 = i11;
                            float f12 = c0808c.f2419d;
                            int i15 = f11 >= f12 ? i9 : 0;
                            if (i13 == 0 && i15 == 0 && Math.max(f3, f11) < Math.min(f10, f12)) {
                                arrayList2.set(i14, new C3958e(new C0808c(Math.max(c0808c.f2416a, 0.0f), Math.max(c0808c.f2417b, f3), Math.min(c0808c.f2418c, Float.POSITIVE_INFINITY), Math.min(f12, f10)), ((C3958e) arrayList2.get(i14)).f12962h));
                                ((List) ((C3958e) arrayList2.get(i14)).f12962h).add(c1054q2);
                                break;
                            }
                            if (i14 == size3) {
                                break;
                            }
                            i14++;
                            i11 = i9;
                        }
                    } else {
                        i9 = i11;
                    }
                    arrayList2.add(new C3958e(c1054q2.m2657h(), AbstractC0000a.m5C0(c1054q2)));
                    if (i12 == size2) {
                        break;
                    }
                    i12++;
                    i11 = i9;
                }
            }
        } else {
            i9 = 1;
        }
        AbstractC4170q.m8431g1(arrayList2, C1044g.f3281j);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f3408a[c10 ^ 1];
        int size4 = arrayList2.size();
        for (int i16 = 0; i16 < size4; i16++) {
            C3958e c3958e = (C3958e) arrayList2.get(i16);
            AbstractC4170q.m8431g1((List) c3958e.f12962h, comparator);
            arrayList3.addAll((Collection) c3958e.f12962h);
        }
        int i17 = i9;
        AbstractC4170q.m8431g1(arrayList3, new C0549b(f3409b, i17));
        int size5 = 0;
        while (size5 <= arrayList3.size() - i17) {
            List list2 = (List) c0965w2.m2313b(((C1054q) arrayList3.get(size5)).f3352f);
            if (list2 != null) {
                if (((Boolean) c0166f2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
