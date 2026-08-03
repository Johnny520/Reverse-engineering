package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: Iq */
/* JADX INFO: loaded from: classes.dex */
public final class C0377Iq extends C0645P {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1308d;

    public /* synthetic */ C0377Iq(int i) {
        this.f1308d = i;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    public void mo318c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1308d) {
            case 3:
                super.mo318c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo318c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View view, C1118a0 c1118a0) {
        int scrollRange;
        switch (this.f1308d) {
            case 0:
                this.f2082a.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
                c1118a0.m2047i(null);
                break;
            case 1:
                this.f2082a.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
                c1118a0.m2048j(false);
                break;
            case 2:
                this.f2082a.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
                c1118a0.m2047i(null);
                break;
            case 3:
                this.f2082a.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c1118a0.m2046h(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c1118a0.m2048j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c1118a0.m2041b(C0902V.f2804g);
                        c1118a0.m2041b(C0902V.f2808k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c1118a0.m2041b(C0902V.f2803f);
                        c1118a0.m2041b(C0902V.f2809l);
                    }
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
                this.f2082a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo322g(View view, int i, Bundle bundle) {
        switch (this.f1308d) {
            case 3:
                if (super.mo322g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m2160v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m2160v(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                    }
                }
                return false;
            default:
                return super.mo322g(view, i, bundle);
        }
    }
}
