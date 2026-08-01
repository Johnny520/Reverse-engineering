package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class z4 {
    public static Drawable[] a(TextView r0) {
        return r0.getCompoundDrawablesRelative();
    }

    public static void b(TextView r0, Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
    }

    public static void c(TextView r0, Locale r1) {
        r0.setTextLocale(r1);
    }
}
