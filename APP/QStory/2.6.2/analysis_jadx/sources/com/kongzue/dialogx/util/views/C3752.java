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
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3089;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3744;
import java.util.WeakHashMap;
import p164.C7664;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3752 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C3753 f11654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ViewOnLayoutChangeListenerC3089 f11655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC3737 f11656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2242 f11657;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f11658;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f11659;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f11660;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f11661;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC3754 f11662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m8090() {
        AbstractC3737 abstractC3737 = this.f11656;
        Activity activityM8045 = abstractC3737 == null ? AbstractC3737.m8045() : abstractC3737.m8071();
        if (activityM8045 == null) {
            return false;
        }
        return ((activityM8045.getWindow().getAttributes().flags & 1024) == 0 && (activityM8045.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m8091() {
        if (m8090() || m8093() == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowInsetsController windowInsetsController = i >= 30 ? m8093().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 8192) == 0) {
            return 0;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11658;
        Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f11658.getContext().getResources();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m8092() {
        if (!m8090() && m8093() != null) {
            int i = Build.VERSION.SDK_INT;
            WindowInsetsController windowInsetsController = i >= 30 ? m8093().getWindowInsetsController() : null;
            if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
                int i2 = DialogXBaseRelativeLayout.f11618;
                return 0;
            }
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11658;
            Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f11658.getContext().getResources();
            int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return system.getDimensionPixelSize(identifier);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m8093() {
        AbstractC3737 abstractC3737 = this.f11656;
        Activity activityM8045 = abstractC3737 == null ? AbstractC3737.m8045() : abstractC3737.m8071();
        if (activityM8045 == null) {
            return null;
        }
        return activityM8045.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8094(C2225 c2225, C3753 c3753) {
        int iM4207;
        int iM4206;
        int iM4208;
        int iM42072;
        int rotation;
        if (this.f11658 == null || c2225 == null) {
            return;
        }
        C2238 c2238 = c2225.f6520;
        this.f11654 = c3753;
        C2254 c2254Mo4012 = c2238.mo4012();
        if (c2254Mo4012 != null) {
            int i = Build.VERSION.SDK_INT;
            iM4206 = i >= 28 ? AbstractC2262.m4206(c2254Mo4012.f6560) : 0;
            iM4208 = i >= 28 ? AbstractC2262.m4208(c2254Mo4012.f6560) : 0;
            iM42072 = i >= 28 ? AbstractC2262.m4207(c2254Mo4012.f6560) : 0;
            iM4207 = i >= 28 ? AbstractC2262.m4207(c2254Mo4012.f6560) : 0;
        } else {
            iM4207 = 0;
            iM4206 = 0;
            iM4208 = 0;
            iM42072 = 0;
        }
        C7664 c7664Mo4042 = c2238.mo4042(527);
        int i2 = c7664Mo4042.f20815;
        int i3 = c7664Mo4042.f20814;
        int i4 = c7664Mo4042.f20812;
        int i5 = c7664Mo4042.f20813;
        int windowSystemUiVisibility = this.f11658.getRootView().getWindowSystemUiVisibility();
        int i6 = Build.VERSION.SDK_INT;
        boolean z = i6 >= 30 || (windowSystemUiVisibility & 4) == 0;
        int i7 = ((i6 >= 30 || (windowSystemUiVisibility & 2) == 0) && (c2238.mo4035(8) || c2238.mo4035(2))) ? i4 : 0;
        int i8 = (z && c2238.mo4035(1)) ? i3 : 0;
        if (i3 == 0 && i4 == 0 && c7664Mo4042.f20815 == 0 && i5 == 0) {
            int i9 = DialogXBaseRelativeLayout.f11618;
            AbstractC3737 abstractC3737 = this.f11656;
            Activity activityM8045 = abstractC3737 == null ? AbstractC3737.m8045() : abstractC3737.m8071();
            if (activityM8045 != null && activityM8045.getResources().getConfiguration().orientation == 2 && (rotation = activityM8045.getWindowManager().getDefaultDisplay().getRotation()) != 1 && rotation == 3) {
                c3753.f11664 = m8091();
                c3753.f11666 = m8092();
            } else {
                c3753.f11665 = m8091();
                c3753.f11663 = m8092();
            }
            this.f11660 = true;
            View viewM8093 = m8093();
            if (viewM8093 != null) {
                if (this.f11662 != null) {
                    viewM8093.getViewTreeObserver().removeOnGlobalLayoutListener(this.f11662);
                }
                ViewTreeObserver viewTreeObserver = viewM8093.getViewTreeObserver();
                ViewTreeObserverOnGlobalLayoutListenerC3754 viewTreeObserverOnGlobalLayoutListenerC3754 = new ViewTreeObserverOnGlobalLayoutListenerC3754(this, viewM8093);
                this.f11662 = viewTreeObserverOnGlobalLayoutListenerC3754;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3754);
            }
        } else {
            this.f11660 = false;
            C2242 c2242 = this.f11657;
            FitSystemBarUtils$Orientation fitSystemBarUtils$Orientation = FitSystemBarUtils$Orientation.Start;
            c2242.getClass();
            c3753.f11665 = Math.max(i8, iM4206) + c3753.f11665;
            this.f11657.getClass();
            c3753.f11663 = Math.max(i7, iM4207) + c3753.f11663;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11658;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            boolean z2 = dialogXBaseRelativeLayout.getLayoutDirection() == 1;
            this.f11657.getClass();
            int i10 = c3753.f11666;
            if (z2) {
                c3753.f11666 = Math.max(i5, iM42072) + i10;
            } else {
                c3753.f11666 = Math.max(i2, iM4208) + i10;
            }
            this.f11657.getClass();
            int i11 = c3753.f11664;
            if (z2) {
                c3753.f11664 = Math.max(i2, iM4208) + i11;
            } else {
                c3753.f11664 = Math.max(i5, iM42072) + i11;
            }
        }
        m8095(c3753);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8095(C3753 c3753) {
        C2242 c2242 = this.f11657;
        if (c2242 == null) {
            return;
        }
        c3753.f11666 = c2242.m4137(FitSystemBarUtils$Orientation.Start) + c3753.f11666;
        c3753.f11665 = this.f11657.m4137(FitSystemBarUtils$Orientation.Top) + c3753.f11665;
        c3753.f11664 = this.f11657.m4137(FitSystemBarUtils$Orientation.End) + c3753.f11664;
        int iM4137 = this.f11657.m4137(FitSystemBarUtils$Orientation.Bottom) + c3753.f11663;
        c3753.f11663 = iM4137;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f11658;
        if (dialogXBaseRelativeLayout == null) {
            int i = c3753.f11666;
            int i2 = c3753.f11665;
            int i3 = c3753.f11664;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            dialogXBaseRelativeLayout.setPaddingRelative(i, i2, i3, iM4137);
        }
        int i4 = c3753.f11666;
        int i5 = c3753.f11665;
        int i6 = c3753.f11664;
        int i7 = c3753.f11663;
        boolean z = this.f11660;
        int i8 = this.f11661;
        int i9 = DialogXBaseRelativeLayout.f11618;
        C2242 c22422 = this.f11657;
        if (!z) {
            i8 = 0;
        }
        int i10 = i7 + i8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = (DialogXBaseRelativeLayout) c22422.f6536;
        if (dialogXBaseRelativeLayout2.f11620 == null) {
            dialogXBaseRelativeLayout2.f11620 = new Rect();
        }
        C7664 c7664 = null;
        if (dialogXBaseRelativeLayout2.getRootWindowInsets() != null) {
            C2238 c2238 = C2225.m4053(null, dialogXBaseRelativeLayout2.getRootWindowInsets()).f6520;
            boolean zMo4035 = c2238.mo4035(2);
            if (!c2238.mo4035(8) && zMo4035) {
                C7664 c7664Mo4042 = c2238.mo4042(519);
                if (c7664Mo4042.f20812 != i10 || c7664Mo4042.f20814 != i5 || c7664Mo4042.f20815 != i4 || c7664Mo4042.f20813 != i6) {
                    c7664 = c7664Mo4042;
                }
            }
        }
        Rect rect = dialogXBaseRelativeLayout2.f11620;
        if (c7664 != null) {
            rect.left = Math.max(c7664.f20815, i4);
            dialogXBaseRelativeLayout2.f11620.top = Math.max(c7664.f20814, i5);
            dialogXBaseRelativeLayout2.f11620.right = Math.max(c7664.f20813, i6);
            dialogXBaseRelativeLayout2.f11620.bottom = Math.max(c7664.f20812, i10);
        } else {
            rect.left = i4;
            rect.top = i5;
            rect.right = i6;
            rect.bottom = i10;
        }
        InterfaceC3744 interfaceC3744 = dialogXBaseRelativeLayout2.f11635;
        if (interfaceC3744 != null) {
            interfaceC3744.mo8076(dialogXBaseRelativeLayout2.f11620);
        }
        Rect rect2 = dialogXBaseRelativeLayout2.f11620;
        dialogXBaseRelativeLayout2.m8084(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }
}
