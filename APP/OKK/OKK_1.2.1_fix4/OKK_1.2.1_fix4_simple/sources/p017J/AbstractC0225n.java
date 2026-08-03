package p017J;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: renamed from: J.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0225n {
    /* JADX INFO: renamed from: a */
    public static int m616a(TextView r02) {
        return r02.getBreakStrategy();
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m617b(TextView r02) {
        return r02.getCompoundDrawableTintList();
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m618c(TextView r02) {
        return r02.getCompoundDrawableTintMode();
    }

    /* JADX INFO: renamed from: d */
    public static int m619d(TextView r02) {
        return r02.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: e */
    public static void m620e(TextView r02, int r1) {
        r02.setBreakStrategy(r1);
    }

    /* JADX INFO: renamed from: f */
    public static void m621f(TextView r02, ColorStateList r1) {
        r02.setCompoundDrawableTintList(r1);
    }

    /* JADX INFO: renamed from: g */
    public static void m622g(TextView r02, PorterDuff.Mode r1) {
        r02.setCompoundDrawableTintMode(r1);
    }

    /* JADX INFO: renamed from: h */
    public static void m623h(TextView r02, int r1) {
        r02.setHyphenationFrequency(r1);
    }
}
