package com.kongzue.dialogx.util.views;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import androidx.core.view.AbstractC2262;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.C2238;
import androidx.core.view.C2242;
import androidx.core.view.C2254;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3090;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import java.util.WeakHashMap;
import p164.C7665;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3753 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C3754 f11659;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ViewOnLayoutChangeListenerC3090 f11660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC3738 f11661;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2242 f11662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f11663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f11664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f11665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f11666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC3755 f11667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m8077() {
        AbstractC3738 abstractC3738 = this.f11661;
        Activity activityM8032 = abstractC3738 == null ? AbstractC3738.m8032() : abstractC3738.m8058();
        if (activityM8032 == null) {
            return false;
        }
        return ((activityM8032.getWindow().getAttributes().flags & 1024) == 0 && (activityM8032.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m8078() {
        if (m8077() || m8080() == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowInsetsController windowInsetsController = i >= 30 ? m8080().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 8192) == 0) {
            return 0;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11663;
        Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f11663.getContext().getResources();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m8079() {
        if (!m8077() && m8080() != null) {
            int i = Build.VERSION.SDK_INT;
            WindowInsetsController windowInsetsController = i >= 30 ? m8080().getWindowInsetsController() : null;
            if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
                int i2 = DialogXBaseRelativeLayout.f11623;
                return 0;
            }
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11663;
            Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f11663.getContext().getResources();
            int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return system.getDimensionPixelSize(identifier);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m8080() {
        AbstractC3738 abstractC3738 = this.f11661;
        Activity activityM8032 = abstractC3738 == null ? AbstractC3738.m8032() : abstractC3738.m8058();
        if (activityM8032 == null) {
            return null;
        }
        return activityM8032.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8081(C2225 c2225, C3754 c3754) {
        int iM4217;
        int iM4216;
        int iM4218;
        int iM42172;
        int rotation;
        if (this.f11663 == null || c2225 == null) {
            return;
        }
        C2238 c2238 = c2225.f6521;
        this.f11659 = c3754;
        C2254 c2254Mo4022 = c2238.mo4022();
        if (c2254Mo4022 != null) {
            int i = Build.VERSION.SDK_INT;
            iM4216 = i >= 28 ? AbstractC2262.m4216(c2254Mo4022.f6561) : 0;
            iM4218 = i >= 28 ? AbstractC2262.m4218(c2254Mo4022.f6561) : 0;
            iM42172 = i >= 28 ? AbstractC2262.m4217(c2254Mo4022.f6561) : 0;
            iM4217 = i >= 28 ? AbstractC2262.m4217(c2254Mo4022.f6561) : 0;
        } else {
            iM4217 = 0;
            iM4216 = 0;
            iM4218 = 0;
            iM42172 = 0;
        }
        C7665 c7665Mo4052 = c2238.mo4052(527);
        int i2 = c7665Mo4052.f20810;
        int i3 = c7665Mo4052.f20809;
        int i4 = c7665Mo4052.f20807;
        int i5 = c7665Mo4052.f20808;
        int windowSystemUiVisibility = this.f11663.getRootView().getWindowSystemUiVisibility();
        int i6 = Build.VERSION.SDK_INT;
        boolean z = i6 >= 30 || (windowSystemUiVisibility & 4) == 0;
        int i7 = ((i6 >= 30 || (windowSystemUiVisibility & 2) == 0) && (c2238.mo4045(8) || c2238.mo4045(2))) ? i4 : 0;
        int i8 = (z && c2238.mo4045(1)) ? i3 : 0;
        if (i3 == 0 && i4 == 0 && c7665Mo4052.f20810 == 0 && i5 == 0) {
            int i9 = DialogXBaseRelativeLayout.f11623;
            AbstractC3738 abstractC3738 = this.f11661;
            Activity activityM8032 = abstractC3738 == null ? AbstractC3738.m8032() : abstractC3738.m8058();
            if (activityM8032 != null && activityM8032.getResources().getConfiguration().orientation == 2 && (rotation = activityM8032.getWindowManager().getDefaultDisplay().getRotation()) != 1 && rotation == 3) {
                c3754.f11669 = m8078();
                c3754.f11671 = m8079();
            } else {
                c3754.f11670 = m8078();
                c3754.f11668 = m8079();
            }
            this.f11665 = true;
            View viewM8080 = m8080();
            if (viewM8080 != null) {
                if (this.f11667 != null) {
                    viewM8080.getViewTreeObserver().removeOnGlobalLayoutListener(this.f11667);
                }
                ViewTreeObserver viewTreeObserver = viewM8080.getViewTreeObserver();
                ViewTreeObserverOnGlobalLayoutListenerC3755 viewTreeObserverOnGlobalLayoutListenerC3755 = new ViewTreeObserverOnGlobalLayoutListenerC3755(this, viewM8080);
                this.f11667 = viewTreeObserverOnGlobalLayoutListenerC3755;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3755);
            }
        } else {
            this.f11665 = false;
            C2242 c2242 = this.f11662;
            FitSystemBarUtils$Orientation fitSystemBarUtils$Orientation = FitSystemBarUtils$Orientation.Start;
            c2242.getClass();
            c3754.f11670 = Math.max(i8, iM4216) + c3754.f11670;
            this.f11662.getClass();
            c3754.f11668 = Math.max(i7, iM4217) + c3754.f11668;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11663;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            boolean z2 = dialogXBaseRelativeLayout.getLayoutDirection() == 1;
            this.f11662.getClass();
            int i10 = c3754.f11671;
            if (z2) {
                c3754.f11671 = Math.max(i5, iM42172) + i10;
            } else {
                c3754.f11671 = Math.max(i2, iM4218) + i10;
            }
            this.f11662.getClass();
            int i11 = c3754.f11669;
            if (z2) {
                c3754.f11669 = Math.max(i2, iM4218) + i11;
            } else {
                c3754.f11669 = Math.max(i5, iM42172) + i11;
            }
        }
        m8082(c3754);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8082(C3754 c3754) {
        C2242 c2242 = this.f11662;
        if (c2242 == null) {
            return;
        }
        c3754.f11671 = c2242.m4147(FitSystemBarUtils$Orientation.Start) + c3754.f11671;
        c3754.f11670 = this.f11662.m4147(FitSystemBarUtils$Orientation.Top) + c3754.f11670;
        c3754.f11669 = this.f11662.m4147(FitSystemBarUtils$Orientation.End) + c3754.f11669;
        int iM4147 = this.f11662.m4147(FitSystemBarUtils$Orientation.Bottom) + c3754.f11668;
        c3754.f11668 = iM4147;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11663;
        if (dialogXBaseRelativeLayout == null) {
            int i = c3754.f11671;
            int i2 = c3754.f11670;
            int i3 = c3754.f11669;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            dialogXBaseRelativeLayout.setPaddingRelative(i, i2, i3, iM4147);
        }
        int i4 = c3754.f11671;
        int i5 = c3754.f11670;
        int i6 = c3754.f11669;
        int i7 = c3754.f11668;
        boolean z = this.f11665;
        int i8 = this.f11666;
        int i9 = DialogXBaseRelativeLayout.f11623;
        C2242 c22422 = this.f11662;
        if (!z) {
            i8 = 0;
        }
        int i10 = i7 + i8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = (DialogXBaseRelativeLayout) c22422.f6537;
        if (dialogXBaseRelativeLayout2.f11625 == null) {
            dialogXBaseRelativeLayout2.f11625 = new Rect();
        }
        C7665 c7665 = null;
        if (dialogXBaseRelativeLayout2.getRootWindowInsets() != null) {
            C2238 c2238 = C2225.m4063(null, dialogXBaseRelativeLayout2.getRootWindowInsets()).f6521;
            boolean zMo4045 = c2238.mo4045(2);
            if (!c2238.mo4045(8) && zMo4045) {
                C7665 c7665Mo4052 = c2238.mo4052(519);
                if (c7665Mo4052.f20807 != i10 || c7665Mo4052.f20809 != i5 || c7665Mo4052.f20810 != i4 || c7665Mo4052.f20808 != i6) {
                    c7665 = c7665Mo4052;
                }
            }
        }
        Rect rect = dialogXBaseRelativeLayout2.f11625;
        if (c7665 != null) {
            rect.left = Math.max(c7665.f20810, i4);
            dialogXBaseRelativeLayout2.f11625.top = Math.max(c7665.f20809, i5);
            dialogXBaseRelativeLayout2.f11625.right = Math.max(c7665.f20808, i6);
            dialogXBaseRelativeLayout2.f11625.bottom = Math.max(c7665.f20807, i10);
        } else {
            rect.left = i4;
            rect.top = i5;
            rect.right = i6;
            rect.bottom = i10;
        }
        InterfaceC3745 interfaceC3745 = dialogXBaseRelativeLayout2.f11640;
        if (interfaceC3745 != null) {
            interfaceC3745.mo8063(dialogXBaseRelativeLayout2.f11625);
        }
        Rect rect2 = dialogXBaseRelativeLayout2.f11625;
        dialogXBaseRelativeLayout2.m8071(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }
}
