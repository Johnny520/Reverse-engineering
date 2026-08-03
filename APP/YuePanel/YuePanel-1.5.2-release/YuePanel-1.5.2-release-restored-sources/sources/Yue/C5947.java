package Yue;

import Yue.C8336;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5947 implements C8336.InterfaceC8348 {

    /* JADX INFO: renamed from: ۥ */
    public final int f1790;

    public C5947(@InterfaceC6844 int i) {
        C6740.m21413(i, "Margin must be non-negative");
        this.f1790 = i;
    }

    @Override // Yue.C8336.InterfaceC8348
    /* JADX INFO: renamed from: ۥ */
    public void mo1019(@InterfaceC6391 View view, float f) {
        C8336 c8336M2610 = m2610(view);
        float f2 = this.f1790 * f;
        if (c8336M2610.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (c8336M2610.m27795()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final C8336 m2610(@InterfaceC6391 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof C8336)) {
            return (C8336) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
