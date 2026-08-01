package defpackage;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class xu {
    public static void a(PopupWindow r0, Transition r1) {
        r0.setEnterTransition(r1);
    }

    public static void b(PopupWindow r0, Transition r1) {
        r0.setExitTransition(r1);
    }
}
