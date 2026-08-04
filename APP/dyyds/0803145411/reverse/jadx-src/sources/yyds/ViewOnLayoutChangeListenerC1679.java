package yyds;

import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: yyds.ᛷᲈᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1679 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ double f8564;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ double f8565;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC0565 f8566;

    public ViewOnLayoutChangeListenerC1679(ViewOnTouchListenerC0565 viewOnTouchListenerC0565, double d, double d2) {
        this.f8566 = viewOnTouchListenerC0565;
        this.f8564 = d;
        this.f8565 = d2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(final View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        final double d = this.f8564;
        final double d2 = this.f8565;
        view.postDelayed(new Runnable() { // from class: yyds.ᛴᛸᲁᛵ
            @Override // java.lang.Runnable
            public final void run() {
                C0675 c0675;
                C0675 c06752;
                ViewOnLayoutChangeListenerC1679 viewOnLayoutChangeListenerC1679 = this.f4240;
                ViewOnTouchListenerC0565 viewOnTouchListenerC0565 = viewOnLayoutChangeListenerC1679.f8566;
                viewOnTouchListenerC0565.m1436();
                viewOnTouchListenerC0565.m1437();
                double d3 = ((double) viewOnTouchListenerC0565.f2735) * d;
                C0912 c0912 = viewOnTouchListenerC0565.f2739;
                int iMax = Math.max((int) (d3 - (((double) ((c0912 == null || (c06752 = c0912.f4156) == null) ? 0 : c06752.getWidth())) / 2.0d)), 0);
                double d4 = ((double) viewOnTouchListenerC0565.f2729) * d2;
                C0912 c09122 = viewOnTouchListenerC0565.f2739;
                int i9 = iMax;
                C0912 c09123 = viewOnTouchListenerC0565.f2739;
                if (c09123 != null) {
                    WindowManager.LayoutParams layoutParams = c09123.f4149;
                    if (layoutParams.gravity != 51 || layoutParams.x != i9 || layoutParams.y != iMax) {
                        layoutParams.x = i9;
                        layoutParams.y = iMax;
                        layoutParams.gravity = 51;
                        c09123.m2030();
                        viewOnTouchListenerC0565.m1435();
                    }
                }
                view.post(new RunnableC0309(1, viewOnLayoutChangeListenerC1679));
            }
        }, 100L);
    }
}
