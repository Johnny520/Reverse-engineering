package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class k60 {
    /* JADX INFO: renamed from: a */
    public static Drawable[] m1632a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: b */
    public static int m1633b(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: c */
    public static int m1634c(View view) {
        return view.getTextDirection();
    }

    /* JADX INFO: renamed from: d */
    public static Locale m1635d(TextView textView) {
        return textView.getTextLocale();
    }

    /* JADX INFO: renamed from: e */
    public static void m1636e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: f */
    public static void m1637f(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static void m1638g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: h */
    public static void m1639h(View view, int i) {
        view.setTextDirection(i);
    }
}
