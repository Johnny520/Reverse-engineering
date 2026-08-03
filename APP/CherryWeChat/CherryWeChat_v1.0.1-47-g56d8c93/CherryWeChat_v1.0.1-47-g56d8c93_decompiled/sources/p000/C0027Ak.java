package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: Ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0027Ak extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f60g;

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: n */
    public final int mo36n(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.f60g) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: p */
    public final int mo37p() {
        switch (this.f60g) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: q */
    public final ViewPropertyAnimator mo38q(View view, int i) {
        switch (this.f60g) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
