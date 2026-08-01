package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: px */
/* JADX INFO: loaded from: classes.dex */
public final class C0612px extends AbstractC0874wz {

    /* JADX INFO: renamed from: a */
    public RecyclerView f3758a;

    /* JADX INFO: renamed from: b */
    public final d40 f3759b = new d40(this);

    /* JADX INFO: renamed from: c */
    public C0501mx f3760c;

    /* JADX INFO: renamed from: d */
    public C0501mx f3761d;

    /* JADX INFO: renamed from: b */
    public static int m2097b(View view, AbstractC0105ci abstractC0105ci) {
        return ((abstractC0105ci.mo637c(view) / 2) + abstractC0105ci.mo639e(view)) - ((abstractC0105ci.mo646l() / 2) + abstractC0105ci.mo645k());
    }

    /* JADX INFO: renamed from: c */
    public static View m2098c(AbstractC0799uz abstractC0799uz, AbstractC0105ci abstractC0105ci) {
        int iM2528v = abstractC0799uz.m2528v();
        View view = null;
        if (iM2528v == 0) {
            return null;
        }
        int iMo646l = (abstractC0105ci.mo646l() / 2) + abstractC0105ci.mo645k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM2528v; i2++) {
            View viewM2526u = abstractC0799uz.m2526u(i2);
            int iAbs = Math.abs(((abstractC0105ci.mo637c(viewM2526u) / 2) + abstractC0105ci.mo639e(viewM2526u)) - iMo646l);
            if (iAbs < i) {
                view = viewM2526u;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m2099a(AbstractC0799uz abstractC0799uz, View view) {
        int[] iArr = new int[2];
        if (abstractC0799uz.mo340d()) {
            iArr[0] = m2097b(view, m2100d(abstractC0799uz));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0799uz.mo341e()) {
            iArr[1] = m2097b(view, m2101e(abstractC0799uz));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0105ci m2100d(AbstractC0799uz abstractC0799uz) {
        C0501mx c0501mx = this.f3761d;
        if (c0501mx == null || ((AbstractC0799uz) c0501mx.f897b) != abstractC0799uz) {
            this.f3761d = new C0501mx(abstractC0799uz, 0);
        }
        return this.f3761d;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0105ci m2101e(AbstractC0799uz abstractC0799uz) {
        C0501mx c0501mx = this.f3760c;
        if (c0501mx == null || ((AbstractC0799uz) c0501mx.f897b) != abstractC0799uz) {
            this.f3760c = new C0501mx(abstractC0799uz, 1);
        }
        return this.f3760c;
    }

    /* JADX INFO: renamed from: f */
    public final void m2102f() {
        AbstractC0799uz layoutManager;
        RecyclerView recyclerView = this.f3758a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewM2098c = layoutManager.mo341e() ? m2098c(layoutManager, m2101e(layoutManager)) : layoutManager.mo340d() ? m2098c(layoutManager, m2100d(layoutManager)) : null;
        if (viewM2098c == null) {
            return;
        }
        int[] iArrM2099a = m2099a(layoutManager, viewM2098c);
        int i = iArrM2099a[0];
        if (i == 0 && iArrM2099a[1] == 0) {
            return;
        }
        this.f3758a.m381Z(i, iArrM2099a[1], false);
    }
}
