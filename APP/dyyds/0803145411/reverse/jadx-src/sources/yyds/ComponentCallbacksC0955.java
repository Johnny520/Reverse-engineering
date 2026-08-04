package yyds;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛴᲁᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacksC0955 implements ComponentCallbacks {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f4421;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public WeakReference f4422;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C0912 c0912;
        ViewOnTouchListenerC0565 viewOnTouchListenerC0565;
        C0675 c0675;
        double width;
        C0675 c06752;
        C0675 c06753;
        C0675 c06754;
        C0675 c06755;
        int i = this.f4421;
        int i2 = configuration.orientation;
        if (i == i2) {
            return;
        }
        this.f4421 = i2;
        WeakReference weakReference = this.f4422;
        if (weakReference == null || (c0912 = (C0912) weakReference.get()) == null || !c0912.f4157 || (viewOnTouchListenerC0565 = c0912.f4148) == null || (c0675 = viewOnTouchListenerC0565.f2742) == null) {
            return;
        }
        int i3 = viewOnTouchListenerC0565.f2736 - viewOnTouchListenerC0565.f2731;
        int i4 = viewOnTouchListenerC0565.f2737 - viewOnTouchListenerC0565.f2738;
        float fM1438 = viewOnTouchListenerC0565.m1438();
        float f = i3;
        int height = 0;
        double d = 1.0d;
        if (f <= fM1438) {
            width = 0.0d;
        } else {
            int i5 = viewOnTouchListenerC0565.f2735;
            C0912 c09122 = viewOnTouchListenerC0565.f2739;
            if (Math.abs(i5 - (((c09122 == null || (c06753 = c09122.f4156) == null) ? 0 : c06753.getWidth()) + i3)) < fM1438) {
                width = 1.0d;
            } else {
                C0912 c09123 = viewOnTouchListenerC0565.f2739;
                width = ((double) ((((c09123 == null || (c06752 = c09123.f4156) == null) ? 0 : c06752.getWidth()) / 2.0f) + f)) / ((double) viewOnTouchListenerC0565.f2735);
            }
        }
        if (i4 <= fM1438) {
            d = 0.0d;
        } else {
            int i6 = viewOnTouchListenerC0565.f2729;
            C0912 c09124 = viewOnTouchListenerC0565.f2739;
            if (Math.abs(i6 - (((c09124 == null || (c06755 = c09124.f4156) == null) ? 0 : c06755.getHeight()) + i4)) >= fM1438) {
                double d2 = i4;
                C0912 c09125 = viewOnTouchListenerC0565.f2739;
                if (c09125 != null && (c06754 = c09125.f4156) != null) {
                    height = c06754.getHeight();
                }
                d = ((((double) height) / 2.0d) + d2) / ((double) viewOnTouchListenerC0565.f2729);
            }
        }
        c0675.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1679(viewOnTouchListenerC0565, width, d));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
