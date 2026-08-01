package p229r1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import p121Y1.C1753n;
import p234s1.C3175g;

/* JADX INFO: renamed from: r1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3067b {

    /* JADX INFO: renamed from: f */
    public static final View.AccessibilityDelegate f9778f = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: d */
    public final View.AccessibilityDelegate f9779d = f9778f;

    /* JADX INFO: renamed from: e */
    public final C3065a f9780e = new C3065a(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C1753n mo1144a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f9779d.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1753n(25, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo1270b(View view, C3175g c3175g) {
        this.f9779d.onInitializeAccessibilityNodeInfo(view, c3175g.f9931a);
    }
}
