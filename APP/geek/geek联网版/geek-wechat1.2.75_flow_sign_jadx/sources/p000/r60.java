package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class r60 {
    /* JADX INFO: renamed from: a */
    public static int m2256a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2257b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m2258c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* JADX INFO: renamed from: d */
    public static int m2259d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: e */
    public static void m2260e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m2261f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX INFO: renamed from: g */
    public static void m2262g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* JADX INFO: renamed from: h */
    public static void m2263h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
