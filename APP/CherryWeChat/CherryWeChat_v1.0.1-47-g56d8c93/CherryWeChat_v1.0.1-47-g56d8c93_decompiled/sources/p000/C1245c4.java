package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: c4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1245c4 extends C0289Go implements InterfaceC1350e4 {

    /* JADX INFO: renamed from: C */
    public CharSequence f4232C;

    /* JADX INFO: renamed from: D */
    public C1078Z3 f4233D;

    /* JADX INFO: renamed from: E */
    public final Rect f4234E;

    /* JADX INFO: renamed from: F */
    public int f4235F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C1394f4 f4236G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245c4(C1394f4 c1394f4, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f4236G = c1394f4;
        this.f4234E = new Rect();
        this.f951o = c1394f4;
        this.f961y = true;
        this.f962z.setFocusable(true);
        this.f952p = new C1122a4(0, this);
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: f */
    public final void mo1974f(CharSequence charSequence) {
        this.f4232C = charSequence;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: k */
    public final void mo1977k(int i) {
        this.f4235F = i;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: m */
    public final void mo1979m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0606O3 c0606o3 = this.f962z;
        boolean zIsShowing = c0606o3.isShowing();
        m2367s();
        c0606o3.setInputMethodMode(2);
        mo577c();
        C0365Ie c0365Ie = this.f939c;
        c0365Ie.setChoiceMode(1);
        c0365Ie.setTextDirection(i);
        c0365Ie.setTextAlignment(i2);
        C1394f4 c1394f4 = this.f4236G;
        int selectedItemPosition = c1394f4.getSelectedItemPosition();
        C0365Ie c0365Ie2 = this.f939c;
        if (c0606o3.isShowing() && c0365Ie2 != null) {
            c0365Ie2.setListSelectionHidden(false);
            c0365Ie2.setSelection(selectedItemPosition);
            if (c0365Ie2.getChoiceMode() != 0) {
                c0365Ie2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1394f4.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0949W3 viewTreeObserverOnGlobalLayoutListenerC0949W3 = new ViewTreeObserverOnGlobalLayoutListenerC0949W3(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0949W3);
        c0606o3.setOnDismissListener(new C1202b4(this, viewTreeObserverOnGlobalLayoutListenerC0949W3));
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: o */
    public final CharSequence mo1981o() {
        return this.f4232C;
    }

    @Override // p000.C0289Go, p000.InterfaceC1350e4
    /* JADX INFO: renamed from: p */
    public final void mo584p(ListAdapter listAdapter) {
        super.mo584p(listAdapter);
        this.f4233D = (C1078Z3) listAdapter;
    }

    /* JADX INFO: renamed from: s */
    public final void m2367s() {
        int i;
        C1394f4 c1394f4 = this.f4236G;
        Rect rect = c1394f4.f4956h;
        C0606O3 c0606o3 = this.f962z;
        Drawable background = c0606o3.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i = c1394f4.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c1394f4.getPaddingLeft();
        int paddingRight = c1394f4.getPaddingRight();
        int width = c1394f4.getWidth();
        int i2 = c1394f4.f4955g;
        if (i2 == -2) {
            int iM2672a = c1394f4.m2672a(this.f4233D, c0606o3.getBackground());
            int i3 = (c1394f4.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM2672a > i3) {
                iM2672a = i3;
            }
            m585r(Math.max(iM2672a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m585r((width - paddingLeft) - paddingRight);
        } else {
            m585r(i2);
        }
        this.f942f = c1394f4.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f941e) - this.f4235F) + i : paddingLeft + this.f4235F + i;
    }
}
