package p000a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a.e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0549e3 extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public C0883ve f2035a;

    /* JADX INFO: renamed from: b */
    public C0612h9 f2036b;

    /* JADX INFO: renamed from: c */
    public List<C0883ve> f2037c;

    /* JADX INFO: renamed from: g */
    public static void m1322g(C0549e3 c0549e3, String str) {
        C0631i9.m1482e(str, "usingString");
        C0944z.m2230j("matchType", 1);
        C0883ve c0883ve = new C0883ve(str, 1, false);
        List<C0883ve> arrayList = c0549e3.f2037c;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        c0549e3.f2037c = arrayList;
        arrayList.add(c0883ve);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m1323i(C0549e3 c0549e3, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        c0549e3.m1324h(str, i, false);
    }

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: b */
    public final int mo1150b(C0026B6 c0026b6) {
        int iM63d;
        C0883ve c0883ve = this.f2035a;
        int iMo1150b = c0883ve != null ? c0883ve.mo1150b(c0026b6) : 0;
        C0612h9 c0612h9 = this.f2036b;
        int iMo1150b2 = c0612h9 != null ? c0612h9.mo1150b(c0026b6) : 0;
        List<C0883ve> list = this.f2037c;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(list, 10));
            for (C0883ve c0883ve2 : list) {
                c0883ve2.getClass();
                arrayList.add(Integer.valueOf(c0883ve2.mo1150b(c0026b6)));
            }
            iM63d = c0026b6.m63d(C0834t3.m1958v0(arrayList));
        } else {
            iM63d = 0;
        }
        c0026b6.m68i(12);
        c0026b6.m60a(11, 0);
        c0026b6.m60a(10, 0);
        c0026b6.m60a(9, 0);
        c0026b6.m60a(8, iM63d);
        c0026b6.m60a(7, 0);
        c0026b6.m60a(6, 0);
        c0026b6.m60a(5, 0);
        c0026b6.m60a(4, iMo1150b2);
        c0026b6.m60a(3, 0);
        c0026b6.m60a(2, 0);
        c0026b6.m60a(1, iMo1150b);
        c0026b6.m60a(0, 0);
        int iM64e = c0026b6.m64e();
        c0026b6.m65f(iM64e);
        return iM64e;
    }

    /* JADX INFO: renamed from: h */
    public final void m1324h(String str, int i, boolean z) {
        C0631i9.m1482e(str, "className");
        C0944z.m2230j("matchType", i);
        this.f2035a = new C0883ve(str, i, z);
    }
}
