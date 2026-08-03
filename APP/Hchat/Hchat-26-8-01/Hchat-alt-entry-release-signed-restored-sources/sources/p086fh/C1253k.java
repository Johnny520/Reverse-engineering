package p086fh;

import gh.C1429a;
import gh.C1430b;
import gh.C1431c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh.AbstractC2407b;
import p094g6.C1354b;
import p173lh.C2570d;
import p276sf.C3965l;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: fh.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1253k extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public C1431c f4103g;

    /* JADX INFO: renamed from: h */
    public C1243a f4104h;

    /* JADX INFO: renamed from: i */
    public C1243a f4105i;

    /* JADX INFO: renamed from: j */
    public C1252j f4106j;

    /* JADX INFO: renamed from: k */
    public List f4107k;

    /* JADX INFO: renamed from: l */
    public ArrayList f4108l;

    /* JADX INFO: renamed from: m */
    public C1254l f4109m;

    /* JADX INFO: renamed from: n */
    public C1254l f4110n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1253k(Method method) {
        C1255m c1255m;
        C2570d c2570d = new C2570d(AbstractC2407b.m5744b(method));
        String str = c2570d.f8334h;
        str.getClass();
        this.f4103g = new C1431c(str, 5);
        m3369l0((6 & 2) != 0 ? 5 : 0, c2570d.f8333g);
        m3366q0(this, c2570d.f8336j);
        ArrayList<String> arrayList = c2570d.f8335i;
        arrayList.getClass();
        C1252j c1252j = new C1252j(1);
        c1252j.f4101h = new ArrayList(C4173t.f13710g);
        for (String str2 : arrayList) {
            if (str2 != null) {
                c1255m = new C1255m();
                C1255m.m3378k0(c1255m, str2);
            } else {
                c1255m = null;
            }
            c1252j.m3365k0(c1255m);
        }
        this.f4106j = c1252j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static void m3366q0(C1253k c1253k, String str) {
        str.getClass();
        C1243a c1243a = new C1243a();
        c1243a.m3360m0(5, str);
        c1253k.f4105i = c1243a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static void m3367u0(C1253k c1253k, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(collection2));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1431c((String) it.next(), 1));
        }
        c1253k.f4107k = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        int iM3634f;
        int iM3636h;
        int iM3636h2;
        byte b10;
        C1431c c1431c = this.f4103g;
        int iMo1577G = c1431c != null ? c1431c.mo1577G(c1354b) : 0;
        C1243a c1243a = this.f4104h;
        int iMo1577G2 = c1243a != null ? c1243a.mo1577G(c1354b) : 0;
        C1243a c1243a2 = this.f4105i;
        int iMo1577G3 = c1243a2 != null ? c1243a2.mo1577G(c1354b) : 0;
        C1252j c1252j = this.f4106j;
        int iMo1577G4 = c1252j != null ? c1252j.mo1577G(c1354b) : 0;
        List list = this.f4107k;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C1431c) it.next()).mo1577G(c1354b)));
            }
            iM3634f = c1354b.m3634f(AbstractC4166m.m8406O1(arrayList));
        } else {
            iM3634f = 0;
        }
        ArrayList arrayList2 = this.f4108l;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                int i9 = ((C1430b) it2.next()).f4743b;
                if (i9 == 0) {
                    throw null;
                }
                switch (i9) {
                    case 1:
                        b10 = 1;
                        break;
                    case 2:
                        b10 = 2;
                        break;
                    case 3:
                        b10 = 3;
                        break;
                    case 4:
                        b10 = 4;
                        break;
                    case 5:
                        b10 = 5;
                        break;
                    case 6:
                        b10 = 6;
                        break;
                    default:
                        throw null;
                }
                arrayList3.add(new C3965l(b10));
            }
            int size = arrayList3.size();
            byte[] bArr = new byte[size];
            Iterator it3 = arrayList3.iterator();
            int i10 = 0;
            while (it3.hasNext()) {
                bArr[i10] = ((C3965l) it3.next()).f12974g;
                i10++;
            }
            c1354b.m3643o(1, size, 1);
            for (int i11 = size - 1; -1 < i11; i11--) {
                c1354b.m3629a(bArr[i11]);
            }
            iM3636h = c1354b.m3636h();
        } else {
            iM3636h = 0;
        }
        ArrayList arrayList4 = this.f4108l;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(arrayList4));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                AbstractC1244b abstractC1244b = ((C1430b) it4.next()).f4742a;
                abstractC1244b.getClass();
                arrayList5.add(Integer.valueOf(abstractC1244b.mo1577G(c1354b)));
            }
            int[] iArrM8406O1 = AbstractC4166m.m8406O1(arrayList5);
            c1354b.m3643o(4, iArrM8406O1.length, 4);
            for (int length = iArrM8406O1.length - 1; -1 < length; length--) {
                c1354b.m3630b(iArrM8406O1[length]);
            }
            iM3636h2 = c1354b.m3636h();
        } else {
            iM3636h2 = 0;
        }
        C1254l c1254l = this.f4109m;
        int iMo1577G5 = c1254l != null ? c1254l.mo1577G(c1354b) : 0;
        C1254l c1254l2 = this.f4110n;
        int iMo1577G6 = c1254l2 != null ? c1254l2.mo1577G(c1354b) : 0;
        c1354b.m3642n(13);
        c1354b.m3631c(12, iMo1577G6);
        c1354b.m3631c(11, iMo1577G5);
        c1354b.m3631c(10, iM3636h2);
        c1354b.m3631c(9, iM3636h);
        c1354b.m3631c(8, 0);
        c1354b.m3631c(7, iM3634f);
        c1354b.m3631c(6, 0);
        c1354b.m3631c(5, 0);
        c1354b.m3631c(4, iMo1577G4);
        c1354b.m3631c(3, iMo1577G3);
        c1354b.m3631c(2, iMo1577G2);
        c1354b.m3631c(1, 0);
        c1354b.m3631c(0, iMo1577G);
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m3368k0(Class cls) {
        C1255m c1255m;
        C1252j c1252j = this.f4106j;
        if (c1252j == null) {
            c1252j = new C1252j(1);
        }
        this.f4106j = c1252j;
        if (cls != null) {
            c1255m = new C1255m();
            C1243a c1243a = new C1243a();
            c1243a.m3360m0(5, AbstractC2407b.m5746d(cls));
            c1255m.f4112g = c1243a;
        } else {
            c1255m = null;
        }
        c1252j.m3365k0(c1255m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m3369l0(int i9, String str) {
        str.getClass();
        if (i9 == 0) {
            throw null;
        }
        C1243a c1243a = new C1243a();
        c1243a.m3360m0(i9, str);
        this.f4104h = c1243a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m3370m0(int i9) {
        if (this.f4106j == null) {
            this.f4106j = new C1252j(1);
        }
        C1252j c1252j = this.f4106j;
        c1252j.getClass();
        c1252j.f4102i = new C1429a(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m3371n0(Class... clsArr) {
        C1255m c1255m;
        C1252j c1252j = new C1252j(1);
        c1252j.f4101h = new ArrayList(C4173t.f13710g);
        for (Class cls : clsArr) {
            if (cls != null) {
                c1255m = new C1255m();
                C1243a c1243a = new C1243a();
                c1243a.m3360m0(5, AbstractC2407b.m5746d(cls));
                c1255m.f4112g = c1243a;
            } else {
                c1255m = null;
            }
            c1252j.m3365k0(c1255m);
        }
        this.f4106j = c1252j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public final void m3372o0(String... strArr) {
        C1255m c1255m;
        C1252j c1252j = new C1252j(1);
        c1252j.f4101h = new ArrayList(C4173t.f13710g);
        for (String str : strArr) {
            if (str != null) {
                c1255m = new C1255m();
                C1255m.m3378k0(c1255m, str);
            } else {
                c1255m = null;
            }
            c1252j.m3365k0(c1255m);
        }
        this.f4106j = c1252j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public final void m3373p0(Class cls) {
        cls.getClass();
        C1243a c1243a = new C1243a();
        c1243a.m3360m0(5, AbstractC2407b.m5746d(cls));
        this.f4105i = c1243a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public final void m3374r0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C1431c(str, 5));
        }
        this.f4107k = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public final void m3375s0(Number... numberArr) {
        ArrayList arrayList = new ArrayList(numberArr.length);
        for (Number number : numberArr) {
            C1430b c1430b = new C1430b();
            number.getClass();
            if (number instanceof Byte) {
                c1430b.f4742a = new C1245c(number.byteValue());
                c1430b.f4743b = 1;
            } else if (number instanceof Short) {
                c1430b.f4742a = new C1250h(number.shortValue());
                c1430b.f4743b = 2;
            } else if (number instanceof Integer) {
                c1430b.f4742a = new C1248f(number.intValue());
                c1430b.f4743b = 3;
            } else if (number instanceof Long) {
                c1430b.f4742a = new C1249g(number.longValue());
                c1430b.f4743b = 4;
            } else if (number instanceof Float) {
                c1430b.f4742a = new C1247e(number.floatValue());
                c1430b.f4743b = 5;
            } else if (number instanceof Double) {
                c1430b.f4742a = new C1246d(number.doubleValue());
                c1430b.f4743b = 6;
            }
            arrayList.add(c1430b);
        }
        this.f4108l = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public final void m3376t0(List list) {
        list.getClass();
        m3367u0(this, list);
    }
}
