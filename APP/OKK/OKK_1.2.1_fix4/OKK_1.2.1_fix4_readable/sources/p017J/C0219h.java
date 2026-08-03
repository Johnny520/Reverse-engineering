package p017J;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p006D.C0091b;
import p008E.C0151e;
import p008E.C0156j;

/* JADX INFO: renamed from: J.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0219h extends C0091b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f462d;

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f462d) {
            case 0:
                super.mo315c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo315c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View view, C0156j c0156j) {
        int scrollRange;
        switch (this.f462d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f243a;
                AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0156j.m506b(C0151e.f346g);
                        c0156j.m506b(C0151e.f350k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0156j.m506b(C0151e.f345f);
                        c0156j.m506b(C0151e.f351l);
                    }
                    break;
                }
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f243a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0156j.f357a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo317g(View view, int i2, Bundle bundle) {
        switch (this.f462d) {
            case 0:
                if (super.mo317g(view, i2, bundle)) {
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
                            nestedScrollView.m1192t(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i2 == 8192 || i2 == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m1192t(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i2 == 16908346) {
                    }
                }
                return false;
            default:
                return super.mo317g(view, i2, bundle);
        }
    }
}
