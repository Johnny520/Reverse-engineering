package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y73 extends xs1 {

    /* JADX INFO: renamed from: l */
    public final g21 f13339l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f13340m;

    /* JADX WARN: Illegal instructions before constructor call */
    public y73(g21 g21Var, ArrayList arrayList) {
        int iM6224l = m6224l(arrayList);
        xs1 xs1Var = (xs1) arrayList.get(0);
        super(iM6224l, m6224l(arrayList) + (xs1Var.mo70c() * arrayList.size()));
        if (g21Var == null) {
            um2.m5516f("itemType == null");
            throw null;
        }
        this.f13340m = arrayList;
        this.f13339l = g21Var;
    }

    /* JADX INFO: renamed from: l */
    public static int m6224l(ArrayList arrayList) {
        try {
            return Math.max(4, ((xs1) arrayList.get(0)).f13158h);
        } catch (IndexOutOfBoundsException unused) {
            C0676s.m4651j("items.size() == 0");
            return 0;
        } catch (NullPointerException unused2) {
            um2.m5516f("items == null");
            return 0;
        }
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        Iterator it = this.f13340m.iterator();
        while (it.hasNext()) {
            ((xs1) it.next()).mo68a(z70Var);
        }
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return this.f13339l;
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: i */
    public final void mo4438i(eh1 eh1Var, int i) {
        int iM6179h = i + this.f13158h;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        for (xs1 xs1Var : this.f13340m) {
            int iMo70c = xs1Var.mo70c();
            int i4 = xs1Var.f13158h;
            if (z) {
                z = false;
                i2 = iMo70c;
                i3 = i4;
            } else if (iMo70c != i2) {
                c80.m676t("item size mismatch");
                return;
            } else if (i4 != i3) {
                c80.m676t("item alignment mismatch");
                return;
            }
            iM6179h = xs1Var.m6179h(eh1Var, iM6179h) + iMo70c;
        }
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: k */
    public final void mo1532k(z70 z70Var, C0929yn c0929yn) {
        ArrayList arrayList = this.f13340m;
        int size = arrayList.size();
        if (c0929yn.m6293d()) {
            c0929yn.m6292c(m6178g() + " " + this.f13339l.f3284j, 0);
            c0929yn.m6292c("  size: ".concat(pp0.m3899K(size)), 4);
        }
        c0929yn.m6298j(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xs1) it.next()).mo71d(z70Var, c0929yn);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(y73.class.getName());
        sb.append(this.f13340m);
        return sb.toString();
    }
}
