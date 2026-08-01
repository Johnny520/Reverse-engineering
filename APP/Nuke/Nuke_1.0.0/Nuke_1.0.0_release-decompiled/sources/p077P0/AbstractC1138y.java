package p077P0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p007B0.C0172E;
import p186k.C2439u;

/* JADX INFO: renamed from: P0.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1138y {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f3772a;

    /* JADX INFO: renamed from: b */
    public static final C1123j f3773b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i5 = 0;
        while (i5 < 2) {
            comparatorArr[i5] = new C1137x(new C1137x(i5 == 0 ? C1119f.f3642c : C1119f.f3641b));
            i5++;
        }
        f3772a = comparatorArr;
        f3773b = C1123j.f3671z;
    }

    /* JADX INFO: renamed from: a */
    public static final void m2191a(C1128o c1128o, ArrayList arrayList, C0172E c0172e, C0172E c0172e2, C2439u c2439u) {
        C1125l c1125l = c1128o.f3711d;
        Object objM4272g = c1125l.f3702d.m4272g(AbstractC1132s.f3750m);
        if (objM4272g == null) {
            objM4272g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM4272g).booleanValue();
        if ((zBooleanValue || ((Boolean) c0172e2.mo1h(c1128o)).booleanValue()) && ((Boolean) c0172e.mo1h(c1128o)).booleanValue()) {
            arrayList.add(c1128o);
        }
        if (zBooleanValue) {
            c2439u.m4344h(c1128o.f3714g, m2192b(c1128o, c0172e, c0172e2, C1128o.m2163j(7, c1128o)));
            return;
        }
        List listM2163j = C1128o.m2163j(7, c1128o);
        int size = listM2163j.size();
        for (int i5 = 0; i5 < size; i5++) {
            m2191a((C1128o) listM2163j.get(i5), arrayList, c0172e, c0172e2, c2439u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList m2192b(p077P0.C1128o r17, p007B0.C0172E r18, p007B0.C0172E r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p077P0.AbstractC1138y.m2192b(P0.o, B0.E, B0.E, java.util.List):java.util.ArrayList");
    }
}
