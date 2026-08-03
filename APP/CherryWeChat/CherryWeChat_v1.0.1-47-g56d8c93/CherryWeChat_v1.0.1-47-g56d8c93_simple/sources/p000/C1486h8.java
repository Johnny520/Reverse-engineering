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

    public /* synthetic */ C1486h8(int r1, Object r2) {
        this.f5256d = r1;
        this.f5257e = r2;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    public void mo318c(View r3, AccessibilityEvent r4) {
        switch(this.f5256d) {
            case 0: goto L18;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        super.mo318c(r3, r4);
        return;
    L6:
        C0230FE r0 = (C0230FE) this.f5257e;
        super.mo318c(r3, r4);
        r4.setClassName(C0230FE.class.getName());
        AbstractC0036At r32 = r0.f709e;
        if (r32 == null) goto L11;
        boolean r1 = true;
        if (((C0355IA) r32).f1191b.size() <= 1) goto L11;
    L12:
        r4.setScrollable(r1);
        if (r4.getEventType() != 4096) goto L20;
        AbstractC0036At r33 = r0.f709e;
        if (r33 == null) goto L21;
        r4.setItemCount(((C0355IA) r33).f1191b.size());
        r4.setFromIndex(r0.f710f);
        r4.setToIndex(r0.f710f);
        return;
    L21:
        return;
    L20:
        return;
    L11:
        r1 = false;
        goto L12
    L18:
        super.mo318c(r3, r4);
        r4.setChecked(((CheckableImageButton) this.f5257e).f4545d);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View r11, C1118a0 r12) {
        int r0 = this.f5256d;
        int r2 = 0;
        boolean r22 = false;
        r22 = false;
        Object r3 = this.f5257e;
        View.AccessibilityDelegate r4 = this.f2082a;
        switch(r0) {
            case 0: goto L41;
            case 1: goto L24;
            case 2: goto L18;
            case 3: goto L16;
            default: goto L4;
        };
    L4:
        r4.onInitializeAccessibilityNodeInfo(r11, r12.f3530a);
        r12.m2046h(C0230FE.class.getName());
        C0230FE r32 = (C0230FE) r3;
        AbstractC0036At r112 = r32.f709e;
        if (r112 != null) goto L7;
    L9:
        r12.m2048j(r22);
        if (r32.canScrollHorizontally(1) == false) goto L13;
        r12.m2040a(4096);
    L13:
        if (r32.canScrollHorizontally(-1) == false) goto L48;
        r12.m2040a(8192);
        return;
    L48:
        return;
    L7:
        if (((C0355IA) r112).f1191b.size() <= 1) goto L9;
        r22 = true;
        goto L9
    L16:
        AccessibilityNodeInfo r122 = r12.f3530a;
        r4.onInitializeAccessibilityNodeInfo(r11, r122);
        r122.setCheckable(((NavigationMenuItemView) r3).f4558x);
        return;
    L18:
        r4.onInitializeAccessibilityNodeInfo(r11, r12.f3530a);
        C0549Mq r33 = (C0549Mq) r3;
        if (r33.f1784e0.getVisibility() != 0) goto L21;
        String r113 = r33.m2878y().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection);
    L22:
        r12.m2041b(new C0902V(16, r113));
        return;
    L21:
        r113 = r33.m2878y().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection);
        goto L22
    L24:
        AccessibilityNodeInfo r123 = r12.f3530a;
        r4.onInitializeAccessibilityNodeInfo(r11, r123);
        MaterialButtonToggleGroup r34 = (MaterialButtonToggleGroup) r3;
        int r02 = MaterialButtonToggleGroup.f4498q;
        if ((r11 instanceof MaterialButton) == true) goto L27;
    L26:
        int r6 = -1;
    L39:
        r123.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, r6, 1, false, ((MaterialButton) r11).f4486o));
        return;
    L27:
        int r03 = 0;
    L29:
        if (r2 >= r34.getChildCount()) goto L26;
        if (r34.getChildAt(r2) == r11) goto L32;
        if ((r34.getChildAt(r2) instanceof MaterialButton) == false) goto L38;
        if (r34.getChildAt(r2).getVisibility() == 8) goto L38;
        r03 = r03 + 1;
    L38:
        r2 = r2 + 1;
        goto L29
    L32:
        r6 = r03;
        goto L39
    L41:
        AccessibilityNodeInfo r124 = r12.f3530a;
        r4.onInitializeAccessibilityNodeInfo(r11, r124);
        CheckableImageButton r35 = (CheckableImageButton) r3;
        r124.setCheckable(r35.f4546e);
        r124.setChecked(r35.f4545d);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public boolean mo322g(View r3, int r4, Bundle r5) {
        switch(this.f5256d) {
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        C0230FE r0 = (C0230FE) this.f5257e;
        if (super.mo322g(r3, r4, r5) == false) goto L10;
        return true;
    L10:
        if (r4 == 4096) goto L18;
        if (r4 == 8192) goto L15;
    L21:
        return false;
    L15:
        if (r0.canScrollHorizontally(-1) == false) goto L21;
        r0.setCurrentItem(r0.f710f - 1);
        return true;
    L18:
        if (r0.canScrollHorizontally(1) == false) goto L21;
        r0.setCurrentItem(r0.f710f + 1);
        return true;
    L5:
        return super.mo322g(r3, r4, r5);
    }
}
