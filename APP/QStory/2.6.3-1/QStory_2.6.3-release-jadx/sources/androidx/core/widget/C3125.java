package androidx.core.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.view.C3079;
import p166.AbstractC8412;
import p171.C8436;
import p171.C8439;

/* JADX INFO: renamed from: androidx.core.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3125 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f7009;

    public C3125(AbstractC8412 abstractC8412) {
        this.f7009 = 5;
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4151(View view, C8436 c8436) {
        int scrollRange;
        int i = this.f7009;
        View.AccessibilityDelegate accessibilityDelegate = this.f6892;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c8436.m13402(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c8436.m13396(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c8436.m13393(C8439.f20987);
                        c8436.m13393(C8439.f20979);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c8436.m13393(C8439.f20983);
                        c8436.m13393(C8439.f20981);
                    }
                    break;
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
                c8436.m13399(null);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
                c8436.m13396(false);
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
                c8436.m13399(null);
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
                c8436.m13402(AbstractC8412.class.getName());
                c8436.m13396(false);
                break;
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4757(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f7009) {
            case 0:
                super.mo4757(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            case 5:
                super.mo4757(view, accessibilityEvent);
                accessibilityEvent.setClassName(AbstractC8412.class.getName());
                accessibilityEvent.setScrollable(false);
                accessibilityEvent.getEventType();
                break;
            default:
                super.mo4757(view, accessibilityEvent);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo4760(View view, int i, Bundle bundle) {
        switch (this.f7009) {
            case 0:
                if (!super.mo4760(view, i, bundle)) {
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
                                nestedScrollView.m4853(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            }
                            break;
                        } else if (i == 8192 || i == 16908344) {
                            int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (iMax != nestedScrollView.getScrollY()) {
                                nestedScrollView.m4853(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            }
                            break;
                        } else if (i == 16908346) {
                        }
                    }
                    break;
                }
                break;
            case 5:
                break;
        }
        return super.mo4760(view, i, bundle);
    }

    public /* synthetic */ C3125(int i) {
        this.f7009 = i;
    }
}
