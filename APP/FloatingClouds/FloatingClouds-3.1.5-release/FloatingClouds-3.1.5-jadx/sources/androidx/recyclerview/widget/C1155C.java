package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p000a.C0051Cc;
import p000a.C0371U9;
import p000a.C0598ge;

/* JADX INFO: renamed from: androidx.recyclerview.widget.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1155C {

    /* JADX INFO: renamed from: a */
    public final C0598ge<RecyclerView.AbstractC1163A, a> f4751a = new C0598ge<>();

    /* JADX INFO: renamed from: b */
    public final C0371U9<RecyclerView.AbstractC1163A> f4752b = new C0371U9<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.C$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static final C0051Cc f4753d = new C0051Cc(20);

        /* JADX INFO: renamed from: a */
        public int f4754a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC1172i.b f4755b;

        /* JADX INFO: renamed from: c */
        public RecyclerView.AbstractC1172i.b f4756c;

        /* JADX INFO: renamed from: a */
        public static a m2646a() {
            a aVar = (a) f4753d.mo128a();
            return aVar == null ? new a() : aVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2642a(RecyclerView.AbstractC1163A abstractC1163A, RecyclerView.AbstractC1172i.b bVar) {
        C0598ge<RecyclerView.AbstractC1163A, a> c0598ge = this.f4751a;
        a orDefault = c0598ge.getOrDefault(abstractC1163A, null);
        if (orDefault == null) {
            orDefault = a.m2646a();
            c0598ge.put(abstractC1163A, orDefault);
        }
        orDefault.f4756c = bVar;
        orDefault.f4754a |= 8;
    }

    /* JADX INFO: renamed from: b */
    public final RecyclerView.AbstractC1172i.b m2643b(RecyclerView.AbstractC1163A abstractC1163A, int i) {
        a aVarM1438j;
        RecyclerView.AbstractC1172i.b bVar;
        C0598ge<RecyclerView.AbstractC1163A, a> c0598ge = this.f4751a;
        int iM1433e = c0598ge.m1433e(abstractC1163A);
        if (iM1433e >= 0 && (aVarM1438j = c0598ge.m1438j(iM1433e)) != null) {
            int i2 = aVarM1438j.f4754a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                aVarM1438j.f4754a = i3;
                if (i == 4) {
                    bVar = aVarM1438j.f4755b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVarM1438j.f4756c;
                }
                if ((i3 & 12) == 0) {
                    c0598ge.m1437i(iM1433e);
                    aVarM1438j.f4754a = 0;
                    aVarM1438j.f4755b = null;
                    aVarM1438j.f4756c = null;
                    a.f4753d.mo130c(aVarM1438j);
                }
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2644c(RecyclerView.AbstractC1163A abstractC1163A) {
        a orDefault = this.f4751a.getOrDefault(abstractC1163A, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f4754a &= -2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2645d(RecyclerView.AbstractC1163A abstractC1163A) {
        C0371U9<RecyclerView.AbstractC1163A> c0371u9 = this.f4752b;
        int iM992e = c0371u9.m992e() - 1;
        while (true) {
            if (iM992e < 0) {
                break;
            }
            if (abstractC1163A == c0371u9.m993f(iM992e)) {
                Object[] objArr = c0371u9.f1389c;
                Object obj = objArr[iM992e];
                Object obj2 = C0371U9.f1386e;
                if (obj != obj2) {
                    objArr[iM992e] = obj2;
                    c0371u9.f1387a = true;
                }
            } else {
                iM992e--;
            }
        }
        a aVarRemove = this.f4751a.remove(abstractC1163A);
        if (aVarRemove != null) {
            aVarRemove.f4754a = 0;
            aVarRemove.f4755b = null;
            aVarRemove.f4756c = null;
            a.f4753d.mo130c(aVarRemove);
        }
    }
}
