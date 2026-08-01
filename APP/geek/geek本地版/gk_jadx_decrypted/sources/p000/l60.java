package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class l60 {
    /* JADX INFO: renamed from: a */
    public static int m1744a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m1745b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m1746c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* JADX INFO: renamed from: d */
    public static int m1747d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: e */
    public static void m1748e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m1749f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX INFO: renamed from: g */
    public static void m1750g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* JADX INFO: renamed from: h */
    public static void m1751h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
