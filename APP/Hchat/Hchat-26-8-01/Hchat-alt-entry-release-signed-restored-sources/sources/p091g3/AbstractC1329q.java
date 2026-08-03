package p091g3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import java.util.WeakHashMap;
import p099h.Hchat.R;

/* JADX INFO: renamed from: g3.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1329q {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4395a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new WeakHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m3554a(ViewGroup viewGroup, AbstractC1299b abstractC1299b) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC1299b.f4354h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m3555b(View view, AbstractC1333s abstractC1333s) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC1333s != null ? new C1339y(abstractC1333s) : null);
            return;
        }
        PathInterpolator pathInterpolator = C1338x.f4415e;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC1337w = abstractC1333s != null ? new ViewOnApplyWindowInsetsListenerC1337w(view, abstractC1333s) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC1337w);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC1337w);
        }
    }
}
