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

/* JADX INFO: renamed from: ia */
/* JADX INFO: loaded from: classes.dex */
public final class C0328ia extends C0875x {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2359d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2360e;

    public /* synthetic */ C0328ia(int i, Object obj) {
        this.f2359d = i;
        this.f2360e = obj;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: c */
    public void mo1490c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2359d) {
            case Base64.DEFAULT /* 0 */:
                super.mo1490c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f2360e).f1054d);
                break;
            default:
                super.mo1490c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo760d(View view, C0357j0 c0357j0) {
        int i = this.f2359d;
        Object obj = this.f2360e;
        View.AccessibilityDelegate accessibilityDelegate = this.f5147a;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1055e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f1054d);
                break;
            case Base64.NO_PADDING /* 1 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0357j0.f2619a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.f1010k;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.m698c(i4)) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                c0357j0.m1552f(C0318i0.m1418a(((MaterialButton) view).f1007o, 0, 1, i3, 1));
                break;
            case Base64.NO_WRAP /* 2 */:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0357j0.f2619a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                C0942yt c0942yt = (C0942yt) obj;
                accessibilityNodeInfo2.setHintText(c0942yt.f5502c0.getVisibility() == 0 ? c0942yt.m2050z().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c0942yt.m2050z().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0357j0.f2619a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f1066x);
                break;
        }
    }
}
