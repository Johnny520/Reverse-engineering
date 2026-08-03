package p086fh;

import gh.C1429a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p094g6.C1354b;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: fh.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1252j extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4100g;

    /* JADX INFO: renamed from: h */
    public List f4101h;

    /* JADX INFO: renamed from: i */
    public C1429a f4102i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ac.p.G(r8.g, java.lang.reflect.Method, fg.p):java.lang.reflect.Method, fh.a.k0(java.lang.Class):void, fh.a.n0(int):void, fh.k.<init>(java.lang.reflect.Method):void, fh.k.k0(java.lang.Class):void, fh.k.m0(int):void, fh.k.n0(java.lang.Class[]):void, fh.k.o0(java.lang.String[]):void, h.Hchat.dexkit.DexFinder.findConfigBuilderClass(java.lang.Class<?>):java.lang.Class<?>, h.Hchat.dexkit.DexFinder.findGenericRespClass():java.lang.Class<?>, z8.d.e():java.lang.reflect.Method] */
    public /* synthetic */ C1252j(int i9) {
        this.f4100g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        int iM3634f;
        int iM3634f2;
        switch (this.f4100g) {
            case 0:
                List list = this.f4101h;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C1251i) it.next()).mo1577G(c1354b)));
                    }
                    iM3634f = c1354b.m3634f(AbstractC4166m.m8406O1(arrayList));
                } else {
                    iM3634f = 0;
                }
                C1429a c1429a = this.f4102i;
                int iMo1577G = c1429a != null ? c1429a.mo1577G(c1354b) : 0;
                c1354b.m3642n(3);
                c1354b.m3631c(2, iMo1577G);
                c1354b.m3631c(0, iM3634f);
                int iM3635g = c1354b.m3635g();
                c1354b.m3637i(iM3635g);
                return iM3635g;
            default:
                List<C1255m> list2 = this.f4101h;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list2));
                    for (C1255m c1255m : list2) {
                        if (c1255m == null) {
                            c1255m = new C1255m();
                        }
                        arrayList2.add(Integer.valueOf(c1255m.mo1577G(c1354b)));
                    }
                    iM3634f2 = c1354b.m3634f(AbstractC4166m.m8406O1(arrayList2));
                } else {
                    iM3634f2 = 0;
                }
                C1429a c1429a2 = this.f4102i;
                int iMo1577G2 = c1429a2 != null ? c1429a2.mo1577G(c1354b) : 0;
                c1354b.m3642n(2);
                c1354b.m3631c(1, iMo1577G2);
                c1354b.m3631c(0, iM3634f2);
                int iM3635g2 = c1354b.m3635g();
                c1354b.m3637i(iM3635g2);
                return iM3635g2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public void m3365k0(C1255m c1255m) {
        List arrayList = this.f4101h;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f4101h = arrayList;
        arrayList.add(c1255m);
    }
}
