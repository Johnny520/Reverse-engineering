package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class k60 {
    public static Drawable[] a(TextView r0) {
        return r0.getCompoundDrawablesRelative();
    }

    public static int b(View r0) {
        return r0.getLayoutDirection();
    }

    public static int c(View r0) {
        return r0.getTextDirection();
    }

    public static Locale d(TextView r0) {
        return r0.getTextLocale();
    }

    public static void e(TextView r0, Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        r0.setCompoundDrawablesRelative(r1, r2, r3, r4);
    }

    public static void f(TextView r0, int r1, int r2, int r3, int r4) {
        r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
    }

    public static void g(TextView r0, Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
    }

    public static void h(View r0, int r1) {
        r0.setTextDirection(r1);
    }
}
