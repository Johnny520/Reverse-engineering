package yyds;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲁᛲᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2173 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f10647;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC0987 f10648;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public ViewOnLayoutChangeListenerC0926 f10649;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f10650;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f10651;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f10652;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0052 f10653;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2542 f10654;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public AbstractC0041 f10655;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int m4139() {
        if (m4143() || m4142() == null) {
            return 0;
        }
        WindowInsetsController windowInsetsController = m4142().getWindowInsetsController();
        if (windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 8192) == 0) {
            return 0;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f10651;
        Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f10651.getContext().getResources();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4140(C2542 c2542) {
        C0052 c0052 = this.f10653;
        if (c0052 == null) {
            return;
        }
        c2542.f12524 = c0052.m386(1) + c2542.f12524;
        c2542.f12525 = this.f10653.m386(2) + c2542.f12525;
        c2542.f12526 = this.f10653.m386(3) + c2542.f12526;
        int iM386 = this.f10653.m386(4) + c2542.f12527;
        c2542.f12527 = iM386;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f10651;
        if (dialogXBaseRelativeLayout == null) {
            int i = c2542.f12524;
            int i2 = c2542.f12525;
            int i3 = c2542.f12526;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            dialogXBaseRelativeLayout.setPaddingRelative(i, i2, i3, iM386);
        }
        int i4 = c2542.f12524;
        int i5 = c2542.f12525;
        int i6 = c2542.f12526;
        int i7 = c2542.f12527;
        boolean z = this.f10647;
        int i8 = this.f10652;
        int i9 = DialogXBaseRelativeLayout.f416;
        C0052 c00522 = this.f10653;
        if (!z) {
            i8 = 0;
        }
        int i10 = i7 + i8;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = (DialogXBaseRelativeLayout) c00522.f551;
        if (dialogXBaseRelativeLayout2.f424 == null) {
            dialogXBaseRelativeLayout2.f424 = new Rect();
        }
        C1870 c1870 = null;
        if (dialogXBaseRelativeLayout2.getRootWindowInsets() != null) {
            C2610 c2610 = C2693.m4783(null, dialogXBaseRelativeLayout2.getRootWindowInsets()).f13242;
            boolean zMo2803 = c2610.mo2803(2);
            if (!c2610.mo2803(8) && zMo2803) {
                C1870 c1870Mo2800 = c2610.mo2800(519);
                if (c1870Mo2800.f9416 != i10 || c1870Mo2800.f9414 != i5 || c1870Mo2800.f9413 != i4 || c1870Mo2800.f9415 != i6) {
                    c1870 = c1870Mo2800;
                }
            }
        }
        Rect rect = dialogXBaseRelativeLayout2.f424;
        if (c1870 != null) {
            rect.left = Math.max(c1870.f9413, i4);
            dialogXBaseRelativeLayout2.f424.top = Math.max(c1870.f9414, i5);
            dialogXBaseRelativeLayout2.f424.right = Math.max(c1870.f9415, i6);
            dialogXBaseRelativeLayout2.f424.bottom = Math.max(c1870.f9416, i10);
        } else {
            rect.left = i4;
            rect.top = i5;
            rect.right = i6;
            rect.bottom = i10;
        }
        Rect rect2 = dialogXBaseRelativeLayout2.f424;
        dialogXBaseRelativeLayout2.m298(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4141(C2693 c2693, C2542 c2542) {
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetLeft;
        int safeInsetRight2;
        int rotation;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f10651;
        if (dialogXBaseRelativeLayout != null) {
            C2610 c2610 = c2693.f13242;
            dialogXBaseRelativeLayout.f426 = c2610.mo2803(8) && c2610.mo2800(8).f9416 > 0;
            this.f10654 = c2542;
            C0515 c0515Mo4694 = c2610.mo4694();
            if (c0515Mo4694 != null) {
                DisplayCutout displayCutout = c0515Mo4694.f2468;
                safeInsetTop = displayCutout.getSafeInsetTop();
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                safeInsetRight2 = displayCutout.getSafeInsetRight();
                safeInsetRight = displayCutout.getSafeInsetRight();
            } else {
                safeInsetRight = 0;
                safeInsetTop = 0;
                safeInsetLeft = 0;
                safeInsetRight2 = 0;
            }
            C1870 c1870Mo2800 = c2610.mo2800(527);
            int i = c1870Mo2800.f9413;
            int i2 = c1870Mo2800.f9414;
            int i3 = c1870Mo2800.f9416;
            int i4 = c1870Mo2800.f9415;
            this.f10651.getRootView().getWindowSystemUiVisibility();
            int i5 = (c2610.mo2803(8) || c2610.mo2803(2)) ? i3 : 0;
            int i6 = c2610.mo2803(1) ? i2 : 0;
            if (i2 == 0 && i3 == 0 && c1870Mo2800.f9413 == 0 && i4 == 0) {
                int i7 = DialogXBaseRelativeLayout.f416;
                AbstractC0041 abstractC0041 = this.f10655;
                Activity activityM264 = abstractC0041 == null ? AbstractC0041.m264() : abstractC0041.m282();
                if (activityM264 != null && activityM264.getResources().getConfiguration().orientation == 2 && (rotation = activityM264.getWindowManager().getDefaultDisplay().getRotation()) != 1 && rotation == 3) {
                    c2542.f12526 = m4139();
                    c2542.f12524 = m4144();
                } else {
                    c2542.f12525 = m4139();
                    c2542.f12527 = m4144();
                }
                this.f10647 = true;
                View viewM4142 = m4142();
                if (viewM4142 != null) {
                    if (this.f10648 != null) {
                        viewM4142.getViewTreeObserver().removeOnGlobalLayoutListener(this.f10648);
                    }
                    ViewTreeObserver viewTreeObserver = viewM4142.getViewTreeObserver();
                    ViewTreeObserverOnGlobalLayoutListenerC0987 viewTreeObserverOnGlobalLayoutListenerC0987 = new ViewTreeObserverOnGlobalLayoutListenerC0987(this, viewM4142);
                    this.f10648 = viewTreeObserverOnGlobalLayoutListenerC0987;
                    viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0987);
                }
            } else {
                this.f10647 = false;
                this.f10653.getClass();
                c2542.f12525 = Math.max(i6, safeInsetTop) + c2542.f12525;
                this.f10653.getClass();
                c2542.f12527 = Math.max(i5, safeInsetRight) + c2542.f12527;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = this.f10651;
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                boolean z = dialogXBaseRelativeLayout2.getLayoutDirection() == 1;
                this.f10653.getClass();
                int i8 = c2542.f12524;
                if (z) {
                    c2542.f12524 = Math.max(i4, safeInsetRight2) + i8;
                } else {
                    c2542.f12524 = Math.max(i, safeInsetLeft) + i8;
                }
                this.f10653.getClass();
                int i9 = c2542.f12526;
                if (z) {
                    c2542.f12526 = Math.max(i, safeInsetLeft) + i9;
                } else {
                    c2542.f12526 = Math.max(i4, safeInsetRight2) + i9;
                }
            }
            m4140(c2542);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final View m4142() {
        AbstractC0041 abstractC0041 = this.f10655;
        Activity activityM264 = abstractC0041 == null ? AbstractC0041.m264() : abstractC0041.m282();
        if (activityM264 == null) {
            return null;
        }
        return activityM264.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean m4143() {
        AbstractC0041 abstractC0041 = this.f10655;
        Activity activityM264 = abstractC0041 == null ? AbstractC0041.m264() : abstractC0041.m282();
        if (activityM264 == null) {
            return false;
        }
        return ((activityM264.getWindow().getAttributes().flags & 1024) == 0 && (activityM264.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m4144() {
        if (!m4143() && m4142() != null) {
            WindowInsetsController windowInsetsController = m4142().getWindowInsetsController();
            if (windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
                int i = DialogXBaseRelativeLayout.f416;
                return 0;
            }
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f10651;
            Resources system = (dialogXBaseRelativeLayout == null || dialogXBaseRelativeLayout.getContext() == null) ? Resources.getSystem() : this.f10651.getContext().getResources();
            int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return system.getDimensionPixelSize(identifier);
            }
        }
        return 0;
    }
}
