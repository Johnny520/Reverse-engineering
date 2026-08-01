package p006D;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p099y.C1064b;
import p101z.C1102c;
import p101z.C1107h;

/* JADX INFO: renamed from: D.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0082k extends C1064b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1064b
    /* JADX INFO: renamed from: a */
    public final void mo220a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo220a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1064b
    /* JADX INFO: renamed from: b */
    public final void mo221b(View view, C1107h c1107h) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f3692a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1107h.f3750a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1102c.f3744d.f3747a);
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1102c.f3745e.f3747a);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1102c.f3743c.f3747a);
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1102c.f3746f.f3747a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    @Override // p099y.C1064b
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo222c(View view, int i2, Bundle bundle) {
        if (super.mo222c(view, i2, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i2 == 4096) {
                int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.m732v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i2 == 8192 || i2 == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.m732v(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i2 == 16908346) {
            }
        }
        return false;
    }
}
