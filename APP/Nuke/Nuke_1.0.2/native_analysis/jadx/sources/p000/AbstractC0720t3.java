package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0720t3 {

    /* JADX INFO: renamed from: j */
    public static final View.AccessibilityDelegate f10506j = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: h */
    public final View.AccessibilityDelegate f10507h = f10506j;

    /* JADX INFO: renamed from: i */
    public final C0680s3 f10508i = new C0680s3(this);

    /* JADX INFO: renamed from: a */
    public C0485n4 mo2096a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f10507h.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0485n4(0, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void mo4056b(View view, C0411l4 c0411l4) {
        this.f10507h.onInitializeAccessibilityNodeInfo(view, c0411l4.f5914a);
    }
}
