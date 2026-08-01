package p229r1;

import android.view.View;

/* JADX INFO: renamed from: r1.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3089s {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static CharSequence m5402a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m5403b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m5404c(View view) {
        return view.isScreenReaderFocusable();
    }
}
