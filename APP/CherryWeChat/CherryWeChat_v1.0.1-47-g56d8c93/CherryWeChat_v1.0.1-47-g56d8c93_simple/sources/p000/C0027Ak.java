package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: Ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0027Ak extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f60g;

    public /* synthetic */ C0027Ak(int r1) {
        this.f60g = r1;
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: n */
    public final int mo36n(View r2, ViewGroup.MarginLayoutParams r3) {
        switch(this.f60g) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        int r22 = r2.getMeasuredWidth();
        int r32 = r3.rightMargin;
    L6:
        return r22 + r32;
    L7:
        r22 = r2.getMeasuredWidth();
        r32 = r3.leftMargin;
        goto L6
    L8:
        r22 = r2.getMeasuredHeight();
        r32 = r3.bottomMargin;
        goto L6
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: p */
    public final int mo37p() {
        switch(this.f60g) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 2;
    L8:
        return 1;
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: q */
    public final ViewPropertyAnimator mo38q(View r2, int r3) {
        switch(this.f60g) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return r2.animate().translationX(r3);
    L7:
        return r2.animate().translationX(-r3);
    L9:
        return r2.animate().translationY(r3);
    }
}
