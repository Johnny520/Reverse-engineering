package com.kongzue.dialogx.util.views;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import androidx.core.view.AbstractC3095;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.C3071;
import androidx.core.view.C3075;
import androidx.core.view.C3087;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3922;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4577;
import java.util.WeakHashMap;
import p180.C8494;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4585 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C4586 f12004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ViewOnLayoutChangeListenerC3922 f12005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC4570 f12006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3075 f12007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f12008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f12009;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f12010;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f12011;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC4587 f12012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m8636() {
        AbstractC4570 abstractC4570 = this.f12006;
        Activity activityM8591 = abstractC4570 == null ? AbstractC4570.m8591() : abstractC4570.m8617();
        if (activityM8591 == null) {
            return false;
        }
        return ((activityM8591.getWindow().getAttributes().flags & 1024) == 0 && (activityM8591.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m8637() {
        if (m8636() || m8639() == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowInsetsController windowInsetsController = i >= 30 ? m8639().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 8192) == 0) {
            return 0;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f12008;
        Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f12008.getContext().getResources();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m8638() {
        if (!m8636() && m8639() != null) {
            int i = Build.VERSION.SDK_INT;
            WindowInsetsController windowInsetsController = i >= 30 ? m8639().getWindowInsetsController() : null;
            if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
                int i2 = DialogXBaseRelativeLayout.f11968;
                return 0;
            }
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f12008;
            Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f12008.getContext().getResources();
            int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return system.getDimensionPixelSize(identifier);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m8639() {
        AbstractC4570 abstractC4570 = this.f12006;
        Activity activityM8591 = abstractC4570 == null ? AbstractC4570.m8591() : abstractC4570.m8617();
        if (activityM8591 == null) {
            return null;
        }
        return activityM8591.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8640(C3058 c3058, C4586 c4586) {
        int iM4777;
        int iM4776;
        int iM4778;
        int iM47772;
        int rotation;
        if (this.f12008 == null || c3058 == null) {
            return;
        }
        C3071 c3071 = c3058.f6866;
        this.f12004 = c4586;
        C3087 c3087Mo4582 = c3071.mo4582();
        if (c3087Mo4582 != null) {
            int i = Build.VERSION.SDK_INT;
            iM4776 = i >= 28 ? AbstractC3095.m4776(c3087Mo4582.f6906) : 0;
            iM4778 = i >= 28 ? AbstractC3095.m4778(c3087Mo4582.f6906) : 0;
            iM47772 = i >= 28 ? AbstractC3095.m4777(c3087Mo4582.f6906) : 0;
            iM4777 = i >= 28 ? AbstractC3095.m4777(c3087Mo4582.f6906) : 0;
        } else {
            iM4777 = 0;
            iM4776 = 0;
            iM4778 = 0;
            iM47772 = 0;
        }
        C8494 c8494Mo4612 = c3071.mo4612(527);
        int i2 = c8494Mo4612.f21155;
        int i3 = c8494Mo4612.f21154;
        int i4 = c8494Mo4612.f21152;
        int i5 = c8494Mo4612.f21153;
        int windowSystemUiVisibility = this.f12008.getRootView().getWindowSystemUiVisibility();
        int i6 = Build.VERSION.SDK_INT;
        boolean z = i6 >= 30 || (windowSystemUiVisibility & 4) == 0;
        int i7 = ((i6 >= 30 || (windowSystemUiVisibility & 2) == 0) && (c3071.mo4605(8) || c3071.mo4605(2))) ? i4 : 0;
        int i8 = (z && c3071.mo4605(1)) ? i3 : 0;
        if (i3 == 0 && i4 == 0 && c8494Mo4612.f21155 == 0 && i5 == 0) {
            int i9 = DialogXBaseRelativeLayout.f11968;
            AbstractC4570 abstractC4570 = this.f12006;
            Activity activityM8591 = abstractC4570 == null ? AbstractC4570.m8591() : abstractC4570.m8617();
            if (activityM8591 != null && activityM8591.getResources().getConfiguration().orientation == 2 && (rotation = activityM8591.getWindowManager().getDefaultDisplay().getRotation()) != 1 && rotation == 3) {
                c4586.f12014 = m8637();
                c4586.f12016 = m8638();
            } else {
                c4586.f12015 = m8637();
                c4586.f12013 = m8638();
            }
            this.f12010 = true;
            View viewM8639 = m8639();
            if (viewM8639 != null) {
                if (this.f12012 != null) {
                    viewM8639.getViewTreeObserver().removeOnGlobalLayoutListener(this.f12012);
                }
                ViewTreeObserver viewTreeObserver = viewM8639.getViewTreeObserver();
                ViewTreeObserverOnGlobalLayoutListenerC4587 viewTreeObserverOnGlobalLayoutListenerC4587 = new ViewTreeObserverOnGlobalLayoutListenerC4587(this, viewM8639);
                this.f12012 = viewTreeObserverOnGlobalLayoutListenerC4587;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4587);
            }
        } else {
            this.f12010 = false;
            C3075 c3075 = this.f12007;
            FitSystemBarUtils$Orientation fitSystemBarUtils$Orientation = FitSystemBarUtils$Orientation.Start;
            c3075.getClass();
            c4586.f12015 = Math.max(i8, iM4776) + c4586.f12015;
            this.f12007.getClass();
            c4586.f12013 = Math.max(i7, iM4777) + c4586.f12013;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f12008;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            boolean z2 = dialogXBaseRelativeLayout.getLayoutDirection() == 1;
            this.f12007.getClass();
            int i10 = c4586.f12016;
            if (z2) {
                c4586.f12016 = Math.max(i5, iM47772) + i10;
            } else {
                c4586.f12016 = Math.max(i2, iM4778) + i10;
            }
            this.f12007.getClass();
            int i11 = c4586.f12014;
            if (z2) {
                c4586.f12014 = Math.max(i2, iM4778) + i11;
            } else {
                c4586.f12014 = Math.max(i5, iM47772) + i11;
            }
        }
        m8641(c4586);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8641(C4586 c4586) {
        C3075 c3075 = this.f12007;
        if (c3075 == null) {
            return;
        }
        c4586.f12016 = c3075.m4707(FitSystemBarUtils$Orientation.Start) + c4586.f12016;
        c4586.f12015 = this.f12007.m4707(FitSystemBarUtils$Orientation.Top) + c4586.f12015;
        c4586.f12014 = this.f12007.m4707(FitSystemBarUtils$Orientation.End) + c4586.f12014;
        int iM4707 = this.f12007.m4707(FitSystemBarUtils$Orientation.Bottom) + c4586.f12013;
        c4586.f12013 = iM4707;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f12008;
        if (dialogXBaseRelativeLayout == null) {
            int i = c4586.f12016;
            int i2 = c4586.f12015;
            int i3 = c4586.f12014;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            dialogXBaseRelativeLayout.setPaddingRelative(i, i2, i3, iM4707);
        }
        int i4 = c4586.f12016;
        int i5 = c4586.f12015;
        int i6 = c4586.f12014;
        int i7 = c4586.f12013;
        boolean z = this.f12010;
        int i8 = this.f12011;
        int i9 = DialogXBaseRelativeLayout.f11968;
        C3075 c30752 = this.f12007;
        if (!z) {
            i8 = 0;
        }
        int i10 = i7 + i8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = (DialogXBaseRelativeLayout) c30752.f6882;
        if (dialogXBaseRelativeLayout2.f11970 == null) {
            dialogXBaseRelativeLayout2.f11970 = new Rect();
        }
        C8494 c8494 = null;
        if (dialogXBaseRelativeLayout2.getRootWindowInsets() != null) {
            C3071 c3071 = C3058.m4623(null, dialogXBaseRelativeLayout2.getRootWindowInsets()).f6866;
            boolean zMo4605 = c3071.mo4605(2);
            if (!c3071.mo4605(8) && zMo4605) {
                C8494 c8494Mo4612 = c3071.mo4612(519);
                if (c8494Mo4612.f21152 != i10 || c8494Mo4612.f21154 != i5 || c8494Mo4612.f21155 != i4 || c8494Mo4612.f21153 != i6) {
                    c8494 = c8494Mo4612;
                }
            }
        }
        Rect rect = dialogXBaseRelativeLayout2.f11970;
        if (c8494 != null) {
            rect.left = Math.max(c8494.f21155, i4);
            dialogXBaseRelativeLayout2.f11970.top = Math.max(c8494.f21154, i5);
            dialogXBaseRelativeLayout2.f11970.right = Math.max(c8494.f21153, i6);
            dialogXBaseRelativeLayout2.f11970.bottom = Math.max(c8494.f21152, i10);
        } else {
            rect.left = i4;
            rect.top = i5;
            rect.right = i6;
            rect.bottom = i10;
        }
        InterfaceC4577 interfaceC4577 = dialogXBaseRelativeLayout2.f11985;
        if (interfaceC4577 != null) {
            interfaceC4577.mo8622(dialogXBaseRelativeLayout2.f11970);
        }
        Rect rect2 = dialogXBaseRelativeLayout2.f11970;
        dialogXBaseRelativeLayout2.m8630(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }
}
