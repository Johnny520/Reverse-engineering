package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t3 {
    public static final View.AccessibilityDelegate j = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate h = j;
    public final s3 i = new s3(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n4 a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.h.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new n4(0, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(View view, l4 l4Var) {
        this.h.onInitializeAccessibilityNodeInfo(view, l4Var.a);
    }
}
