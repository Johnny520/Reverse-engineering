package p000;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: xu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0906xu {
    /* JADX INFO: renamed from: a */
    public static void m2635a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m2636b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
