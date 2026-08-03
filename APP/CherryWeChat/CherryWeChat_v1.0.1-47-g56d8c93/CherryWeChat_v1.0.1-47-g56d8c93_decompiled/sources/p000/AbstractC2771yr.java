package p000;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: yr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2771yr {
    /* JADX INFO: renamed from: a */
    public static void m5341a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m5342b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
