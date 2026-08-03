package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Tr */
/* JADX INFO: loaded from: classes.dex */
public final class C0850Tr extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public C2435qz f2697l;

    /* JADX INFO: renamed from: m */
    public C0182E9 f2698m;

    /* JADX INFO: renamed from: n */
    public C0182E9 f2699n;

    /* JADX INFO: renamed from: o */
    public C0294Gt f2700o;

    /* JADX INFO: renamed from: p */
    public ArrayList f2701p;

    /* JADX INFO: renamed from: N */
    public final void m1683N(int i) {
        if (this.f2700o == null) {
            this.f2700o = new C0294Gt();
        }
        C0294Gt c0294Gt = this.f2700o;
        c0294Gt.getClass();
        c0294Gt.f995m = new C0243Fl(i);
    }

    /* JADX INFO: renamed from: O */
    public final void m1684O(List list) {
        C0251Ft c0251Ft;
        C0294Gt c0294Gt = new C0294Gt();
        c0294Gt.f994l = new ArrayList(C0452Kf.f1484a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                c0251Ft = new C0251Ft();
                C0182E9 c0182e9 = new C0182E9();
                c0182e9.f536l = new C2435qz(str, 5);
                c0251Ft.f818l = c0182e9;
            } else {
                c0251Ft = null;
            }
            List arrayList = c0294Gt.f994l;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c0294Gt.f994l = arrayList;
            arrayList.add(c0251Ft);
        }
        this.f2700o = c0294Gt;
    }

    /* JADX INFO: renamed from: P */
    public final void m1685P(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2435qz(str, 5));
        }
        this.f2701p = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: Q */
    public final void m1686Q(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2435qz(str, 1));
        }
        this.f2701p = new ArrayList(arrayList);
    }
}
