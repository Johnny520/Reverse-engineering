package p000;

import android.view.View;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gc1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1236a(View view, rk0 rk0Var) {
        fc1 fc1Var = rk0Var != null ? new fc1(view, rk0Var) : null;
        if (view.getTag(C0587R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (fc1Var != null) {
            view.setOnApplyWindowInsetsListener(fc1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0587R.id.tag_window_insets_animation_callback));
        }
    }
}
