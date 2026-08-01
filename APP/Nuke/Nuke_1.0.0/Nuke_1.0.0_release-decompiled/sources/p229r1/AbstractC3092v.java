package p229r1;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: r1.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3092v {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9811a = 0;

    static {
        new WeakHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5407a(android.view.View r5, int r6) {
        /*
            r0 = -1
            if (r6 != r0) goto L5
            r3 = r0
            goto L30
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L16
            switch(r6) {
                case 21: goto L15;
                case 22: goto L13;
                case 23: goto L15;
                case 24: goto L13;
                case 25: goto L11;
                case 26: goto L15;
                case 27: goto L13;
                default: goto L10;
            }
        L10:
            goto L16
        L11:
            r6 = r4
            goto L16
        L13:
            r6 = 4
            goto L16
        L15:
            r6 = r3
        L16:
            r2 = 30
            if (r1 >= r2) goto L2f
            r1 = 12
            if (r6 == r1) goto L2d
            r1 = 13
            if (r6 == r1) goto L30
            r1 = 16
            if (r6 == r1) goto L2d
            r1 = 17
            if (r6 == r1) goto L2b
            goto L2f
        L2b:
            r3 = r4
            goto L30
        L2d:
            r3 = 1
            goto L30
        L2f:
            r3 = r6
        L30:
            if (r3 != r0) goto L33
            return
        L33:
            r5.performHapticFeedback(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p229r1.AbstractC3092v.m5407a(android.view.View, int):void");
    }

    /* JADX INFO: renamed from: b */
    public static void m5408b(ViewGroup viewGroup, AbstractC3067b abstractC3067b) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC3067b.f9780e);
    }

    /* JADX INFO: renamed from: c */
    public static void m5409c(View view, AbstractC3094x abstractC3094x) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC3094x != null ? new C3043D(abstractC3094x) : null);
            return;
        }
        PathInterpolator pathInterpolator = C3042C.f9728e;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC3041B = abstractC3094x != null ? new ViewOnApplyWindowInsetsListenerC3041B(view, abstractC3094x) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC3041B);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC3041B);
        }
    }
}
