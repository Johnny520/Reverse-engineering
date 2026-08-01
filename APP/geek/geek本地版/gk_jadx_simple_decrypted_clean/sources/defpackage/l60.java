package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class l60 {
    public static int a(TextView r0) {
        return r0.getBreakStrategy();
    }

    public static ColorStateList b(TextView r0) {
        return r0.getCompoundDrawableTintList();
    }

    public static PorterDuff.Mode c(TextView r0) {
        return r0.getCompoundDrawableTintMode();
    }

    public static int d(TextView r0) {
        return r0.getHyphenationFrequency();
    }

    public static void e(TextView r0, int r1) {
        r0.setBreakStrategy(r1);
    }

    public static void f(TextView r0, ColorStateList r1) {
        r0.setCompoundDrawableTintList(r1);
    }

    public static void g(TextView r0, PorterDuff.Mode r1) {
        r0.setCompoundDrawableTintMode(r1);
    }

    public static void h(TextView r0, int r1) {
        r0.setHyphenationFrequency(r1);
    }
}
