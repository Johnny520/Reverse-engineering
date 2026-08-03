package p057g;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: g.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0923q0 {
    /* JADX INFO: renamed from: a */
    public static void m2251a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m2252b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
