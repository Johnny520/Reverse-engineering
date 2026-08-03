package p000a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: a.pb */
/* JADX INFO: loaded from: classes.dex */
public final class C0766pb extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public C0549e3 f3029a;

    /* JADX INFO: renamed from: b */
    public C0549e3 f3030b;

    /* JADX INFO: renamed from: c */
    public C0767pc f3031c;

    /* JADX INFO: renamed from: d */
    public List<C0883ve> f3032d;

    /* JADX INFO: renamed from: g */
    public static void m1802g(C0766pb c0766pb, String str) {
        C0631i9.m1482e(str, "usingString");
        C0944z.m2230j("matchType", 1);
        List<C0883ve> arrayList = c0766pb.f3032d;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        c0766pb.f3032d = arrayList;
        arrayList.add(new C0883ve(str, 1, false));
    }

    /* JADX INFO: renamed from: h */
    public static void m1803h(C0766pb c0766pb, String str) {
        C0631i9.m1482e(str, "className");
        C0944z.m2230j("matchType", 5);
        C0549e3 c0549e3 = new C0549e3();
        c0549e3.m1324h(str, 5, false);
        c0766pb.f3029a = c0549e3;
    }

    /* JADX INFO: renamed from: j */
    public static void m1804j(C0766pb c0766pb, String str) {
        C0631i9.m1482e(str, "typeName");
        C0944z.m2230j("matchType", 5);
        C0549e3 c0549e3 = new C0549e3();
        c0549e3.m1324h(str, 5, false);
        c0766pb.f3030b = c0549e3;
    }

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: b */
    public final int mo1150b(C0026B6 c0026b6) {
        int iM63d;
        C0549e3 c0549e3 = this.f3029a;
        int iMo1150b = c0549e3 != null ? c0549e3.mo1150b(c0026b6) : 0;
        C0549e3 c0549e32 = this.f3030b;
        int iMo1150b2 = c0549e32 != null ? c0549e32.mo1150b(c0026b6) : 0;
        C0767pc c0767pc = this.f3031c;
        int iMo1150b3 = c0767pc != null ? c0767pc.mo1150b(c0026b6) : 0;
        List<C0883ve> list = this.f3032d;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(list, 10));
            for (C0883ve c0883ve : list) {
                c0883ve.getClass();
                arrayList.add(Integer.valueOf(c0883ve.mo1150b(c0026b6)));
            }
            iM63d = c0026b6.m63d(C0834t3.m1958v0(arrayList));
        } else {
            iM63d = 0;
        }
        c0026b6.m68i(17);
        c0026b6.m60a(16, 0);
        c0026b6.m60a(15, 0);
        c0026b6.m60a(14, 0);
        c0026b6.m60a(13, 0);
        c0026b6.m60a(12, 0);
        c0026b6.m60a(11, 0);
        c0026b6.m60a(10, 0);
        c0026b6.m60a(9, 0);
        c0026b6.m60a(8, 0);
        c0026b6.m60a(7, iM63d);
        c0026b6.m60a(6, 0);
        c0026b6.m60a(5, 0);
        c0026b6.m60a(4, iMo1150b3);
        c0026b6.m60a(3, iMo1150b2);
        c0026b6.m60a(2, iMo1150b);
        c0026b6.m60a(1, 0);
        c0026b6.m60a(0, 0);
        int iM64e = c0026b6.m64e();
        c0026b6.m65f(iM64e);
        return iM64e;
    }

    /* JADX INFO: renamed from: i */
    public final void m1805i(Collection collection) {
        C0748oc c0748oc;
        C0631i9.m1482e(collection, "paramTypes");
        C0767pc c0767pc = new C0767pc();
        c0767pc.f3033a = C0834t3.m1961y0(C0439Y5.f1645a);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                c0748oc = new C0748oc();
                C0549e3 c0549e3 = new C0549e3();
                c0549e3.m1324h(str, 5, false);
                c0748oc.f2953a = c0549e3;
            } else {
                c0748oc = null;
            }
            List<C0748oc> arrayList = c0767pc.f3033a;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            c0767pc.f3033a = arrayList;
            arrayList.add(c0748oc);
        }
        this.f3031c = c0767pc;
    }
}
