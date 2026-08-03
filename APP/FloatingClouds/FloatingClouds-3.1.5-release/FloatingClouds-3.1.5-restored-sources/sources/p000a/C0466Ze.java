package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/* JADX INFO: renamed from: a.Ze */
/* JADX INFO: loaded from: classes.dex */
public final class C0466Ze {

    /* JADX INFO: renamed from: a.Ze$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m1122a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m1123b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* JADX INFO: renamed from: c */
        public static PorterDuff.Mode m1124c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* JADX INFO: renamed from: d */
        public static int m1125d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* JADX INFO: renamed from: e */
        public static void m1126e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* JADX INFO: renamed from: f */
        public static void m1127f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* JADX INFO: renamed from: g */
        public static void m1128g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* JADX INFO: renamed from: h */
        public static void m1129h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: renamed from: a.Ze$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static CharSequence m1130a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        /* JADX INFO: renamed from: b */
        public static String[] m1131b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* JADX INFO: renamed from: c */
        public static PrecomputedText.Params m1132c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* JADX INFO: renamed from: d */
        public static void m1133d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: a.Ze$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static void m1134a(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    /* JADX INFO: renamed from: a.Ze$d */
    public static class d implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1120a(TextView textView, int i) {
        C0726n9.m1664g(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ActionMode.Callback m1121b(ActionMode.Callback callback) {
        if (!(callback instanceof d)) {
            return callback;
        }
        throw null;
    }
}
