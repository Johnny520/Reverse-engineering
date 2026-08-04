package yyds;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛴᛲᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0803 extends AbstractC2249 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C1213 f3683;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2670 f3684 = new C2670(this);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0407 f3685;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C0407 f3686;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m1847(View view, AbstractC0353 abstractC0353) {
        return ((abstractC0353.mo1040(view) / 2) + abstractC0353.mo1046(view)) - ((abstractC0353.mo1036() / 2) + abstractC0353.mo1038());
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static View m1848(AbstractC2551 abstractC2551, AbstractC0353 abstractC0353) {
        int iM4613 = abstractC2551.m4613();
        View view = null;
        if (iM4613 == 0) {
            return null;
        }
        int iMo1036 = (abstractC0353.mo1036() / 2) + abstractC0353.mo1038();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM4613; i2++) {
            View viewM4614 = abstractC2551.m4614(i2);
            int iAbs = Math.abs(((abstractC0353.mo1040(viewM4614) / 2) + abstractC0353.mo1046(viewM4614)) - iMo1036);
            if (iAbs < i) {
                view = viewM4614;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractC0353 m1849(AbstractC2551 abstractC2551) {
        C0407 c0407 = this.f3686;
        if (c0407 != null && ((AbstractC2551) c0407.f1829) == abstractC2551) {
            return c0407;
        }
        C0407 c04072 = new C0407(abstractC2551, 0);
        this.f3686 = c04072;
        return c04072;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1850(C1213 c1213) {
        C1213 c12132 = this.f3683;
        if (c12132 == c1213) {
            return;
        }
        C2670 c2670 = this.f3684;
        if (c12132 != null) {
            ArrayList arrayList = c12132.f5574;
            if (arrayList != null) {
                arrayList.remove(c2670);
            }
            this.f3683.setOnFlingListener(null);
        }
        this.f3683 = c1213;
        if (c1213 != null) {
            if (c1213.getOnFlingListener() != null) {
                C0188.m800("An instance of OnFlingListener already set.");
                return;
            }
            this.f3683.m2426(c2670);
            this.f3683.setOnFlingListener(this);
            new Scroller(this.f3683.getContext(), new DecelerateInterpolator());
            m1852();
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int[] m1851(AbstractC2551 abstractC2551, View view) {
        int[] iArr = new int[2];
        if (abstractC2551.mo206()) {
            iArr[0] = m1847(view, m1849(abstractC2551));
        } else {
            iArr[0] = 0;
        }
        if (abstractC2551.mo174()) {
            iArr[1] = m1847(view, m1853(abstractC2551));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m1852() {
        AbstractC2551 layoutManager;
        C1213 c1213 = this.f3683;
        if (c1213 == null || (layoutManager = c1213.getLayoutManager()) == null) {
            return;
        }
        View viewM1848 = layoutManager.mo174() ? m1848(layoutManager, m1853(layoutManager)) : layoutManager.mo206() ? m1848(layoutManager, m1849(layoutManager)) : null;
        if (viewM1848 == null) {
            return;
        }
        int[] iArrM1851 = m1851(layoutManager, viewM1848);
        int i = iArrM1851[0];
        if (i == 0 && iArrM1851[1] == 0) {
            return;
        }
        this.f3683.m2434(i, iArrM1851[1], null, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final AbstractC0353 m1853(AbstractC2551 abstractC2551) {
        C0407 c0407 = this.f3685;
        if (c0407 != null && ((AbstractC2551) c0407.f1829) == abstractC2551) {
            return c0407;
        }
        C0407 c04072 = new C0407(abstractC2551, 1);
        this.f3685 = c04072;
        return c04072;
    }
}
