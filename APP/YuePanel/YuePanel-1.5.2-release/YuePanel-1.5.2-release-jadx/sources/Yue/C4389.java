package Yue;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۠۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4389 {

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠۠$ۥ */
    @InterfaceC7113(28)
    public static class C0394 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T> T m1339(Dialog dialog, int i) {
            return (T) dialog.requireViewById(i);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static View m1338(@InterfaceC6391 Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C0394.m1339(dialog, i);
        }
        View viewFindViewById = dialog.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
