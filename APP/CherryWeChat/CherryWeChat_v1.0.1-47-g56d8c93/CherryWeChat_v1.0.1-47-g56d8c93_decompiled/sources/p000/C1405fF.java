package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: fF */
/* JADX INFO: loaded from: classes.dex */
public final class C1405fF {

    /* JADX INFO: renamed from: f */
    public static int f4977f;

    /* JADX INFO: renamed from: a */
    public ArrayList f4978a;

    /* JADX INFO: renamed from: b */
    public int f4979b;

    /* JADX INFO: renamed from: c */
    public int f4980c;

    /* JADX INFO: renamed from: d */
    public ArrayList f4981d;

    /* JADX INFO: renamed from: e */
    public int f4982e;

    /* JADX INFO: renamed from: a */
    public final void m2677a(ArrayList arrayList) {
        int size = this.f4978a.size();
        if (this.f4982e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1405fF c1405fF = (C1405fF) arrayList.get(i);
                if (this.f4982e == c1405fF.f4979b) {
                    m2679c(this.f4980c, c1405fF);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2678b(C2244mo c2244mo, int i) {
        int iM4561n;
        int iM4561n2;
        ArrayList arrayList = this.f4978a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C2497sb c2497sb = (C2497sb) ((C2454rb) arrayList.get(0)).f8599T;
        c2244mo.m4580t();
        c2497sb.mo813b(c2244mo, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C2454rb) arrayList.get(i2)).mo813b(c2244mo, false);
        }
        if (i == 0 && c2497sb.f8783z0 > 0) {
            AbstractC1406fG.m2681F(c2497sb, c2244mo, arrayList, 0);
        }
        if (i == 1 && c2497sb.f8762A0 > 0) {
            AbstractC1406fG.m2681F(c2497sb, c2244mo, arrayList, 1);
        }
        try {
            c2244mo.m4576p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f4981d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C2454rb c2454rb = (C2454rb) arrayList.get(i3);
            C1517hw c1517hw = new C1517hw(25);
            new WeakReference(c2454rb);
            C2244mo.m4561n(c2454rb.f8588I);
            C2244mo.m4561n(c2454rb.f8589J);
            C2244mo.m4561n(c2454rb.f8590K);
            C2244mo.m4561n(c2454rb.f8591L);
            C2244mo.m4561n(c2454rb.f8592M);
            this.f4981d.add(c1517hw);
        }
        if (i == 0) {
            iM4561n = C2244mo.m4561n(c2497sb.f8588I);
            iM4561n2 = C2244mo.m4561n(c2497sb.f8590K);
            c2244mo.m4580t();
        } else {
            iM4561n = C2244mo.m4561n(c2497sb.f8589J);
            iM4561n2 = C2244mo.m4561n(c2497sb.f8591L);
            c2244mo.m4580t();
        }
        return iM4561n2 - iM4561n;
    }

    /* JADX INFO: renamed from: c */
    public final void m2679c(int i, C1405fF c1405fF) {
        int i2 = c1405fF.f4979b;
        for (C2454rb c2454rb : this.f4978a) {
            ArrayList arrayList = c1405fF.f4978a;
            if (!arrayList.contains(c2454rb)) {
                arrayList.add(c2454rb);
            }
            if (i == 0) {
                c2454rb.f8633n0 = i2;
            } else {
                c2454rb.f8635o0 = i2;
            }
        }
        this.f4982e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f4980c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strM409g = AbstractC0213Ey.m409g(sb, this.f4979b, "] <");
        Iterator it = this.f4978a.iterator();
        while (it.hasNext()) {
            strM409g = strM409g + " " + ((C2454rb) it.next()).f8621h0;
        }
        return AbstractC0213Ey.m407e(strM409g, " >");
    }
}
