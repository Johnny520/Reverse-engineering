package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1216u extends AbstractC1153A {

    /* JADX INFO: renamed from: c */
    public C1213r f5195c;

    /* JADX INFO: renamed from: d */
    public C1212q f5196d;

    /* JADX INFO: renamed from: c */
    public static int m2994c(View view, AbstractC1214s abstractC1214s) {
        return ((abstractC1214s.mo2980c(view) / 2) + abstractC1214s.mo2982e(view)) - ((abstractC1214s.mo2989l() / 2) + abstractC1214s.mo2988k());
    }

    /* JADX INFO: renamed from: d */
    public static View m2995d(RecyclerView.AbstractC1175l abstractC1175l, AbstractC1214s abstractC1214s) {
        int iM2860v = abstractC1175l.m2860v();
        View view = null;
        if (iM2860v == 0) {
            return null;
        }
        int iMo2989l = (abstractC1214s.mo2989l() / 2) + abstractC1214s.mo2988k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM2860v; i2++) {
            View viewM2858u = abstractC1175l.m2858u(i2);
            int iAbs = Math.abs(((abstractC1214s.mo2980c(viewM2858u) / 2) + abstractC1214s.mo2982e(viewM2858u)) - iMo2989l);
            if (iAbs < i) {
                view = viewM2858u;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC1153A
    /* JADX INFO: renamed from: a */
    public final int[] mo2632a(RecyclerView.AbstractC1175l abstractC1175l, View view) {
        int[] iArr = new int[2];
        if (abstractC1175l.mo2714d()) {
            iArr[0] = m2994c(view, m2996e(abstractC1175l));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1175l.mo2716e()) {
            iArr[1] = m2994c(view, m2997f(abstractC1175l));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC1214s m2996e(RecyclerView.AbstractC1175l abstractC1175l) {
        C1212q c1212q = this.f5196d;
        if (c1212q == null || c1212q.f5191a != abstractC1175l) {
            this.f5196d = new C1212q(abstractC1175l);
        }
        return this.f5196d;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1214s m2997f(RecyclerView.AbstractC1175l abstractC1175l) {
        C1213r c1213r = this.f5195c;
        if (c1213r == null || c1213r.f5191a != abstractC1175l) {
            this.f5195c = new C1213r(abstractC1175l);
        }
        return this.f5195c;
    }
}
