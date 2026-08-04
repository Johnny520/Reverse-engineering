package yyds;

import android.view.View;

/* JADX INFO: renamed from: yyds.ᲁᛷᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2278 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static CharSequence m4286(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static boolean m4287(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m4288(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m4289(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
