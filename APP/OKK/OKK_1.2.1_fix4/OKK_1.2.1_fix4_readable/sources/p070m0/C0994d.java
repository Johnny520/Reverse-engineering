package p070m0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p006D.C0091b;
import p008E.C0155i;
import p008E.C0156j;

/* JADX INFO: renamed from: m0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0994d extends C0091b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3550d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f3551e;

    public /* synthetic */ C0994d(View view, int i2) {
        this.f3550d = i2;
        this.f3551e = view;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3550d) {
            case 1:
                super.mo315c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3551e).f2393d);
                break;
            default:
                super.mo315c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View view, C0156j c0156j) {
        View view2 = this.f3551e;
        View.AccessibilityDelegate accessibilityDelegate = this.f243a;
        switch (this.f3550d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0156j.f357a);
                int i2 = MaterialButtonToggleGroup.f2353k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                materialButtonToggleGroup.getClass();
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.m1860c(i4)) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                c0156j.m511h(C0155i.m503a(((MaterialButton) view).f2350o, 0, 1, i3, 1));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2394e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2393d);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0156j.f357a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) view2).f2405x);
                break;
        }
    }
}
