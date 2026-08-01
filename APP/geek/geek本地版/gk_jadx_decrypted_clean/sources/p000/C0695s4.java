package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: s4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0695s4 extends C0421kr implements InterfaceC0769u4 {

    /* JADX INFO: renamed from: C */
    public CharSequence f4382C;

    /* JADX INFO: renamed from: D */
    public C0584p4 f4383D;

    /* JADX INFO: renamed from: E */
    public final Rect f4384E;

    /* JADX INFO: renamed from: F */
    public int f4385F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0806v4 f4386G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0695s4(C0806v4 c0806v4, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f4386G = c0806v4;
        this.f4384E = new Rect();
        this.f2934o = c0806v4;
        this.f2944y = true;
        this.f2945z.setFocusable(true);
        this.f2935p = new C0621q4(0, this);
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: e */
    public final void mo1992e(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0091c4 c0091c4 = this.f2945z;
        boolean zIsShowing = c0091c4.isShowing();
        m2304s();
        c0091c4.setInputMethodMode(2);
        mo1708f();
        C0411kh c0411kh = this.f2922c;
        c0411kh.setChoiceMode(1);
        AbstractC0472m4.m1783d(c0411kh, i);
        AbstractC0472m4.m1782c(c0411kh, i2);
        C0806v4 c0806v4 = this.f4386G;
        int selectedItemPosition = c0806v4.getSelectedItemPosition();
        C0411kh c0411kh2 = this.f2922c;
        if (c0091c4.isShowing() && c0411kh2 != null) {
            c0411kh2.setListSelectionHidden(false);
            c0411kh2.setSelection(selectedItemPosition);
            if (c0411kh2.getChoiceMode() != 0) {
                c0411kh2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0806v4.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0398k4 viewTreeObserverOnGlobalLayoutListenerC0398k4 = new ViewTreeObserverOnGlobalLayoutListenerC0398k4(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0398k4);
        c0091c4.setOnDismissListener(new C0658r4(this, viewTreeObserverOnGlobalLayoutListenerC0398k4));
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: i */
    public final CharSequence mo1995i() {
        return this.f4382C;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: k */
    public final void mo1996k(CharSequence charSequence) {
        this.f4382C = charSequence;
    }

    @Override // p000.C0421kr, p000.InterfaceC0769u4
    /* JADX INFO: renamed from: n */
    public final void mo1714n(ListAdapter listAdapter) {
        super.mo1714n(listAdapter);
        this.f4383D = (C0584p4) listAdapter;
    }

    @Override // p000.InterfaceC0769u4
    /* JADX INFO: renamed from: o */
    public final void mo1999o(int i) {
        this.f4385F = i;
    }

    /* JADX INFO: renamed from: s */
    public final void m2304s() {
        int i;
        C0806v4 c0806v4 = this.f4386G;
        Rect rect = c0806v4.f4806h;
        C0091c4 c0091c4 = this.f2945z;
        Drawable background = c0091c4.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i = cb0.m658a(c0806v4) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c0806v4.getPaddingLeft();
        int paddingRight = c0806v4.getPaddingRight();
        int width = c0806v4.getWidth();
        int i2 = c0806v4.f4805g;
        if (i2 == -2) {
            int iM2488a = c0806v4.m2488a(this.f4383D, c0091c4.getBackground());
            int i3 = (c0806v4.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM2488a > i3) {
                iM2488a = i3;
            }
            m1715q(Math.max(iM2488a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m1715q((width - paddingLeft) - paddingRight);
        } else {
            m1715q(i2);
        }
        this.f2925f = cb0.m658a(c0806v4) ? (((width - paddingRight) - this.f2924e) - this.f4385F) + i : paddingLeft + this.f4385F + i;
    }
}
