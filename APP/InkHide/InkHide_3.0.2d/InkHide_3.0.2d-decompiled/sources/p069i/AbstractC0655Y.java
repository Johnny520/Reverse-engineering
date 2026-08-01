package p069i;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: renamed from: i.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0655Y {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Drawable[] m1268a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1269b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1270c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
