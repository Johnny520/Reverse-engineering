package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0011aa extends C0875x {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f100d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f101e;

    public /* synthetic */ C0011aa(int i, Object obj) {
        this.f100d = i;
        this.f101e = obj;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: c */
    public void mo65c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f100d) {
            case Base64.DEFAULT /* 0 */:
                super.mo65c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f101e).f1129d);
                break;
            default:
                super.mo65c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo66d(View view, C0357j0 c0357j0) {
        int i = this.f100d;
        Object obj = this.f101e;
        View.AccessibilityDelegate accessibilityDelegate = this.f5076a;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1130e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f1129d);
                break;
            case Base64.NO_PADDING /* 1 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0357j0.f2513a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.f1085k;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.m740c(i4)) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                c0357j0.m1538f(C0318i0.m1382a(((MaterialButton) view).f1082o, 0, 1, i3, 1));
                break;
            case Base64.NO_WRAP /* 2 */:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0357j0.f2513a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                C0794ut c0794ut = (C0794ut) obj;
                accessibilityNodeInfo2.setHintText(c0794ut.f4770c0.getVisibility() == 0 ? c0794ut.m1848z().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c0794ut.m1848z().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0357j0.f2513a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f1141x);
                break;
        }
    }
}
