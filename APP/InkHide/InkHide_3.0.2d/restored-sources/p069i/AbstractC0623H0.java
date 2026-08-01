package p069i;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: i.H0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0623H0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1230a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1231b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
