package p000;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: renamed from: z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0954z4 {
    /* JADX INFO: renamed from: a */
    public static Drawable[] m2792a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: b */
    public static void m2793b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: c */
    public static void m2794c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
