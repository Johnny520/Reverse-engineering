package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0043b5 implements xd0 {

    /* JADX INFO: renamed from: b */
    public static final C0043b5 f374b = new C0043b5(0);

    /* JADX INFO: renamed from: c */
    public static final C0043b5 f375c = new C0043b5(1);

    /* JADX INFO: renamed from: d */
    public static final C0043b5 f376d = new C0043b5(2);

    /* JADX INFO: renamed from: e */
    public static final C0621pn f377e = new C0621pn(25);

    /* JADX INFO: renamed from: f */
    public static final C0043b5 f378f = new C0043b5(3);

    /* JADX INFO: renamed from: g */
    public static final C0043b5 f379g = new C0043b5(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f380a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b5.<clinit>():void] */
    public /* synthetic */ C0043b5(int i) {
        this.f380a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m252a(ArrayList arrayList, xt0 xt0Var, zd0 zd0Var, ArrayList arrayList2, ArrayList arrayList3, xt0 xt0Var2, ArrayList arrayList4, xt0 xt0Var3, xt0 xt0Var4) {
        if (!arrayList.isEmpty()) {
            xt0Var.f7423d = zd0Var.mo641F(12.0f) + xt0Var.f7423d;
        }
        arrayList.add(0, AbstractC0960ye.m5253W(arrayList2));
        arrayList3.add(Integer.valueOf(xt0Var2.f7423d));
        arrayList4.add(Integer.valueOf(xt0Var.f7423d));
        xt0Var.f7423d += xt0Var2.f7423d;
        xt0Var3.f7423d = Math.max(xt0Var3.f7423d, xt0Var4.f7423d);
        arrayList2.clear();
        xt0Var4.f7423d = 0;
        xt0Var2.f7423d = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(zd0 zd0Var, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = this.f380a;
        C0330is c0330is = C0330is.f2614d;
        switch (i) {
            case 0:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                int iM3139j = 0;
                int iM3138i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    xq0 xq0VarMo184e = ((sd0) list.get(i2)).mo184e(j);
                    iM3139j = Math.max(iM3139j, xq0VarMo184e.f7400d);
                    iM3138i = Math.max(iM3138i, xq0VarMo184e.f7401e);
                    arrayList3.add(xq0VarMo184e);
                }
                if (list.isEmpty()) {
                    iM3139j = C0617pj.m3139j(j);
                    iM3138i = C0617pj.m3138i(j);
                }
                return zd0Var.mo1279Q(iM3139j, iM3138i, c0330is, new C0006a5(0, arrayList3));
            case 1:
                return zd0Var.mo1279Q(C0617pj.m3139j(j), C0617pj.m3138i(j), c0330is, new C0621pn(25));
            case 2:
                return zd0Var.mo1279Q(C0617pj.m3137h(j), C0617pj.m3136g(j), c0330is, f377e);
            case 3:
                return zd0Var.mo1279Q(C0617pj.m3139j(j), C0617pj.m3138i(j), c0330is, new C0621pn(25));
            case 4:
                return zd0Var.mo1279Q(C0617pj.m3135f(j) ? C0617pj.m3137h(j) : 0, C0617pj.m3134e(j) ? C0617pj.m3136g(j) : 0, c0330is, new C0621pn(25));
            default:
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                xt0 xt0Var = new xt0();
                xt0 xt0Var2 = new xt0();
                ArrayList arrayList7 = new ArrayList();
                xt0 xt0Var3 = new xt0();
                int i3 = 0;
                xt0 xt0Var4 = new xt0();
                int size2 = list.size();
                while (i3 < size2) {
                    xq0 xq0VarMo184e2 = ((sd0) list.get(i3)).mo184e(j);
                    int i4 = i3;
                    if (!arrayList7.isEmpty()) {
                        ArrayList arrayList8 = arrayList4;
                        if (zd0Var.mo641F(8.0f) + xt0Var3.f7423d + xq0VarMo184e2.f7400d <= C0617pj.m3137h(j)) {
                            arrayList4 = arrayList8;
                        } else {
                            arrayList4 = arrayList8;
                            m252a(arrayList4, xt0Var2, zd0Var, arrayList7, arrayList5, xt0Var4, arrayList6, xt0Var, xt0Var3);
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = arrayList4;
                        xt0Var3.f7423d = zd0Var.mo641F(8.0f) + xt0Var3.f7423d;
                    }
                    arrayList7.add(xq0VarMo184e2);
                    xt0Var3.f7423d += xq0VarMo184e2.f7400d;
                    xt0Var4.f7423d = Math.max(xt0Var4.f7423d, xq0VarMo184e2.f7401e);
                    i3 = i4 + 1;
                    arrayList4 = arrayList2;
                }
                ArrayList arrayList9 = arrayList4;
                if (arrayList7.isEmpty()) {
                    arrayList = arrayList9;
                } else {
                    arrayList = arrayList9;
                    m252a(arrayList, xt0Var2, zd0Var, arrayList7, arrayList5, xt0Var4, arrayList6, xt0Var, xt0Var3);
                }
                int iMax = Math.max(xt0Var.f7423d, C0617pj.m3139j(j));
                return zd0Var.mo1279Q(iMax, Math.max(xt0Var2.f7423d, C0617pj.m3138i(j)), c0330is, new C0340j2(arrayList, zd0Var, iMax, arrayList6));
        }
    }
}
