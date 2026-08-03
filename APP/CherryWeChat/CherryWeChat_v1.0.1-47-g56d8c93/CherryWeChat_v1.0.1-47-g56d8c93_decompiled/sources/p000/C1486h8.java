package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: h8 */
/* JADX INFO: loaded from: classes.dex */
public final class C1486h8 extends C0645P {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5256d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5257e;

    public /* synthetic */ C1486h8(int i, Object obj) {
        this.f5256d = i;
        this.f5257e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo318c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        AbstractC0036At abstractC0036At;
        switch (this.f5256d) {
            case 0:
                super.mo318c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f5257e).f4545d);
                break;
            case 4:
                C0230FE c0230fe = (C0230FE) this.f5257e;
                super.mo318c(view, accessibilityEvent);
                accessibilityEvent.setClassName(C0230FE.class.getName());
                AbstractC0036At abstractC0036At2 = c0230fe.f709e;
                if (abstractC0036At2 != null) {
                    z = ((C0355IA) abstractC0036At2).f1191b.size() > 1;
                }
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (abstractC0036At = c0230fe.f709e) != null) {
                    accessibilityEvent.setItemCount(((C0355IA) abstractC0036At).f1191b.size());
                    accessibilityEvent.setFromIndex(c0230fe.f710f);
                    accessibilityEvent.setToIndex(c0230fe.f710f);
                    break;
                }
                break;
            default:
                super.mo318c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View view, C1118a0 c1118a0) {
        int i;
        int i2 = this.f5256d;
        z = false;
        boolean z = false;
        Object obj = this.f5257e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2082a;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f4546e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f4545d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1118a0.f3530a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.f4498q;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f4486o));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
                C0549Mq c0549Mq = (C0549Mq) obj;
                c1118a0.m2041b(new C0902V(16, c0549Mq.f1784e0.getVisibility() == 0 ? c0549Mq.m2878y().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c0549Mq.m2878y().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1118a0.f3530a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f4558x);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
                c1118a0.m2046h(C0230FE.class.getName());
                C0230FE c0230fe = (C0230FE) obj;
                AbstractC0036At abstractC0036At = c0230fe.f709e;
                if (abstractC0036At != null && ((C0355IA) abstractC0036At).f1191b.size() > 1) {
                    z = true;
                }
                c1118a0.m2048j(z);
                if (c0230fe.canScrollHorizontally(1)) {
                    c1118a0.m2040a(4096);
                }
                if (c0230fe.canScrollHorizontally(-1)) {
                    c1118a0.m2040a(8192);
                }
                break;
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public boolean mo322g(View view, int i, Bundle bundle) {
        switch (this.f5256d) {
            case 4:
                C0230FE c0230fe = (C0230FE) this.f5257e;
                if (super.mo322g(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && c0230fe.canScrollHorizontally(-1)) {
                        c0230fe.setCurrentItem(c0230fe.f710f - 1);
                        return true;
                    }
                } else if (c0230fe.canScrollHorizontally(1)) {
                    c0230fe.setCurrentItem(c0230fe.f710f + 1);
                    return true;
                }
                return false;
            default:
                return super.mo322g(view, i, bundle);
        }
    }
}
