package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wa3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f12444a = 0;

    static {
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m5862a(ViewGroup viewGroup, AbstractC0720t3 abstractC0720t3) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC0720t3.f10508i);
    }

    /* JADX INFO: renamed from: b */
    public static void m5863b(View view, wd3 wd3Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(wd3Var != null ? new de3(wd3Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = be3.f824e;
        View.OnApplyWindowInsetsListener ae3Var = wd3Var != null ? new ae3(view, wd3Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, ae3Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(ae3Var);
        }
    }
}
