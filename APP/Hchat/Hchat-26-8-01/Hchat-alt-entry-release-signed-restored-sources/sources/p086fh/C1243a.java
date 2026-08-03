package p086fh;

import gh.C1429a;
import gh.C1431c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh.AbstractC2407b;
import p094g6.C1354b;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: fh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1243a extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public C1431c f4088g;

    /* JADX INFO: renamed from: h */
    public C1243a f4089h;

    /* JADX INFO: renamed from: i */
    public C1252j f4090i;

    /* JADX INFO: renamed from: j */
    public C1254l f4091j;

    /* JADX INFO: renamed from: k */
    public ArrayList f4092k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static void m3357r0(C1243a c1243a, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(collection2));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1431c((String) it.next(), 1));
        }
        c1243a.f4092k = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        int iM3634f;
        C1431c c1431c = this.f4088g;
        int iMo1577G = c1431c != null ? c1431c.mo1577G(c1354b) : 0;
        C1243a c1243a = this.f4089h;
        int iMo1577G2 = c1243a != null ? c1243a.mo1577G(c1354b) : 0;
        C1252j c1252j = this.f4090i;
        int iMo1577G3 = c1252j != null ? c1252j.mo1577G(c1354b) : 0;
        C1254l c1254l = this.f4091j;
        int iMo1577G4 = c1254l != null ? c1254l.mo1577G(c1354b) : 0;
        ArrayList arrayList = this.f4092k;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C1431c) it.next()).mo1577G(c1354b)));
            }
            iM3634f = c1354b.m3634f(AbstractC4166m.m8406O1(arrayList2));
        } else {
            iM3634f = 0;
        }
        c1354b.m3642n(9);
        c1354b.m3631c(8, iM3634f);
        c1354b.m3631c(7, iMo1577G4);
        c1354b.m3631c(6, iMo1577G3);
        c1354b.m3631c(5, 0);
        c1354b.m3631c(4, 0);
        c1354b.m3631c(3, iMo1577G2);
        c1354b.m3631c(2, 0);
        c1354b.m3631c(1, iMo1577G);
        c1354b.m3631c(0, 0);
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m3358k0(Class cls) {
        cls.getClass();
        C1252j c1252j = this.f4090i;
        if (c1252j == null) {
            c1252j = new C1252j(0);
        }
        this.f4090i = c1252j;
        C1251i c1251i = new C1251i();
        C1243a c1243a = new C1243a();
        c1243a.m3360m0(5, AbstractC2407b.m5746d(cls));
        c1251i.f4099g = c1243a;
        List arrayList = c1252j.f4101h;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c1252j.f4101h = arrayList;
        arrayList.add(c1251i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m3359l0(C1253k c1253k) {
        C1254l c1254l = this.f4091j;
        if (c1254l == null) {
            c1254l = new C1254l();
        }
        this.f4091j = c1254l;
        c1254l.m3377k0(c1253k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m3360m0(int i9, String str) {
        str.getClass();
        if (i9 == 0) {
            throw null;
        }
        this.f4088g = new C1431c(str, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m3361n0(int i9) {
        C1252j c1252j = this.f4090i;
        if (c1252j == null) {
            c1252j = new C1252j(0);
        }
        this.f4090i = c1252j;
        c1252j.f4102i = new C1429a(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public final void m3362o0(String str) {
        C1243a c1243a = new C1243a();
        c1243a.f4088g = new C1431c(str, 5);
        this.f4089h = c1243a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public final void m3363p0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C1431c(str, 5));
        }
        this.f4092k = new ArrayList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public final void m3364q0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C1431c(str, 1));
        }
        this.f4092k = new ArrayList(arrayList);
    }
}
