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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new WeakHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5407a(View view, int i5) {
        int i6;
        if (i5 == -1) {
            i6 = -1;
        } else {
            int i7 = Build.VERSION.SDK_INT;
            i6 = 6;
            if (i7 < 34) {
                switch (i5) {
                    case 21:
                    case 23:
                    case 26:
                        i5 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i5 = 4;
                        break;
                    case 25:
                        i5 = 0;
                        break;
                }
            }
            if (i7 >= 30) {
                i6 = i5;
            } else if (i5 == 12) {
                i6 = 1;
            } else if (i5 != 13) {
                if (i5 != 16) {
                    if (i5 == 17) {
                        i6 = 0;
                    }
                }
            }
        }
        if (i6 == -1) {
            return;
        }
        view.performHapticFeedback(i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5408b(ViewGroup viewGroup, AbstractC3067b abstractC3067b) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC3067b.f9780e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
