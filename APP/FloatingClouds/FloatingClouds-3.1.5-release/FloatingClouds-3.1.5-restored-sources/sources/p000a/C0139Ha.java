package p000a;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.C1247R;
import com.google.android.material.datepicker.C1284c;

/* JADX INFO: renamed from: a.Ha */
/* JADX INFO: loaded from: classes.dex */
public final class C0139Ha extends C0038C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1284c f488d;

    public C0139Ha(C1284c c1284c) {
        this.f488d = c1284c;
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: d */
    public final void mo115d(View view, C0146I c0146i) {
        String string;
        View.AccessibilityDelegate accessibilityDelegate = this.f137a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        C1284c c1284c = this.f488d;
        if (c1284c.f5703i0.getVisibility() == 0) {
            string = c1284c.m2524A().getResources().getString(C1247R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            string = c1284c.m2524A().getResources().getString(C1247R.string.mtrl_picker_toggle_to_day_selection);
        }
        accessibilityNodeInfo.setHintText(string);
    }
}
