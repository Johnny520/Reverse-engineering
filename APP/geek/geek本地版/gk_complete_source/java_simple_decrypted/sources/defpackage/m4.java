package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class m4 {
    public static int a(View r0) {
        return r0.getTextAlignment();
    }

    public static int b(View r0) {
        return r0.getTextDirection();
    }

    public static void c(View r0, int r1) {
        r0.setTextAlignment(r1);
    }

    public static void d(View r0, int r1) {
        r0.setTextDirection(r1);
    }
}
