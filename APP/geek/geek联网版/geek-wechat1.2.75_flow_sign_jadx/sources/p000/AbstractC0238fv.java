package p000;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: fv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0238fv {
    /* JADX INFO: renamed from: a */
    public static void m1113a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m1114b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
