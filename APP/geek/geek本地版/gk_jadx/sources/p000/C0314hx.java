package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: hx */
/* JADX INFO: loaded from: classes.dex */
public final class C0314hx extends AbstractC0615pz {

    /* JADX INFO: renamed from: a */
    public RecyclerView f2316a;

    /* JADX INFO: renamed from: b */
    public final w30 f2317b = new w30(this);

    /* JADX INFO: renamed from: c */
    public C0203ex f2318c;

    /* JADX INFO: renamed from: d */
    public C0203ex f2319d;

    /* JADX INFO: renamed from: b */
    public static int m1376b(View view, AbstractC0019ai abstractC0019ai) {
        return ((abstractC0019ai.mo99c(view) / 2) + abstractC0019ai.mo101e(view)) - ((abstractC0019ai.mo108l() / 2) + abstractC0019ai.mo107k());
    }

    /* JADX INFO: renamed from: c */
    public static View m1377c(AbstractC0540nz abstractC0540nz, AbstractC0019ai abstractC0019ai) {
        int iM1980v = abstractC0540nz.m1980v();
        View view = null;
        if (iM1980v == 0) {
            return null;
        }
        int iMo108l = (abstractC0019ai.mo108l() / 2) + abstractC0019ai.mo107k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM1980v; i2++) {
            View viewM1978u = abstractC0540nz.m1978u(i2);
            int iAbs = Math.abs(((abstractC0019ai.mo99c(viewM1978u) / 2) + abstractC0019ai.mo101e(viewM1978u)) - iMo108l);
            if (iAbs < i) {
                view = viewM1978u;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m1378a(AbstractC0540nz abstractC0540nz, View view) {
        int[] iArr = new int[2];
        if (abstractC0540nz.mo355d()) {
            iArr[0] = m1376b(view, m1379d(abstractC0540nz));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0540nz.mo356e()) {
            iArr[1] = m1376b(view, m1380e(abstractC0540nz));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0019ai m1379d(AbstractC0540nz abstractC0540nz) {
        C0203ex c0203ex = this.f2319d;
        if (c0203ex == null || ((AbstractC0540nz) c0203ex.f144b) != abstractC0540nz) {
            this.f2319d = new C0203ex(abstractC0540nz, 0);
        }
        return this.f2319d;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0019ai m1380e(AbstractC0540nz abstractC0540nz) {
        C0203ex c0203ex = this.f2318c;
        if (c0203ex == null || ((AbstractC0540nz) c0203ex.f144b) != abstractC0540nz) {
            this.f2318c = new C0203ex(abstractC0540nz, 1);
        }
        return this.f2318c;
    }

    /* JADX INFO: renamed from: f */
    public final void m1381f() {
        AbstractC0540nz layoutManager;
        RecyclerView recyclerView = this.f2316a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewM1377c = layoutManager.mo356e() ? m1377c(layoutManager, m1380e(layoutManager)) : layoutManager.mo355d() ? m1377c(layoutManager, m1379d(layoutManager)) : null;
        if (viewM1377c == null) {
            return;
        }
        int[] iArrM1378a = m1378a(layoutManager, viewM1377c);
        int i = iArrM1378a[0];
        if (i == 0 && iArrM1378a[1] == 0) {
            return;
        }
        this.f2316a.m396Z(i, iArrM1378a[1], false);
    }
}
