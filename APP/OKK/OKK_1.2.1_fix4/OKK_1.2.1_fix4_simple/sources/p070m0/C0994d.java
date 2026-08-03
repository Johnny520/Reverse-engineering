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

    public /* synthetic */ C0994d(View r1, int r2) {
        this.f3550d = r2;
        this.f3551e = r1;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public void mo315c(View r2, AccessibilityEvent r3) {
        switch(this.f3550d) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.mo315c(r2, r3);
        return;
    L6:
        super.mo315c(r2, r3);
        r3.setChecked(((CheckableImageButton) this.f3551e).f2393d);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View r8, C0156j r9) {
        View r1 = this.f3551e;
        View.AccessibilityDelegate r2 = this.f243a;
        switch(this.f3550d) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        AccessibilityNodeInfo r92 = r9.f357a;
        r2.onInitializeAccessibilityNodeInfo(r8, r92);
        r92.setCheckable(((NavigationMenuItemView) r1).f2405x);
        return;
    L6:
        AccessibilityNodeInfo r93 = r9.f357a;
        r2.onInitializeAccessibilityNodeInfo(r8, r93);
        CheckableImageButton r12 = (CheckableImageButton) r1;
        r93.setCheckable(r12.f2394e);
        r93.setChecked(r12.f2393d);
        return;
    L8:
        r2.onInitializeAccessibilityNodeInfo(r8, r9.f357a);
        int r22 = MaterialButtonToggleGroup.f2353k;
        MaterialButtonToggleGroup r13 = (MaterialButtonToggleGroup) r1;
        r13.getClass();
        int r4 = -1;
        if ((r8 instanceof MaterialButton) == false) goto L23;
        int r23 = 0;
        int r5 = 0;
    L13:
        if (r23 >= r13.getChildCount()) goto L23;
        if (r13.getChildAt(r23) == r8) goto L16;
        if ((r13.getChildAt(r23) instanceof MaterialButton) == false) goto L22;
        if (r13.m1860c(r23) == false) goto L22;
        r5 = r5 + 1;
    L22:
        r23 = r23 + 1;
        goto L13
    L16:
        r4 = r5;
    L23:
        r9.m511h(C0155i.m503a(((MaterialButton) r8).f2350o, 0, 1, r4, 1));
    }
}
