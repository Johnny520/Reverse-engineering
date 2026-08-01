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
public final class C0694s4 extends C0569or implements InterfaceC0768u4 {

    /* JADX INFO: renamed from: C */
    public CharSequence f4202C;

    /* JADX INFO: renamed from: D */
    public C0583p4 f4203D;

    /* JADX INFO: renamed from: E */
    public final Rect f4204E;

    /* JADX INFO: renamed from: F */
    public int f4205F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0805v4 f4206G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0694s4(C0805v4 c0805v4, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f4206G = c0805v4;
        this.f4204E = new Rect();
        this.f3531o = c0805v4;
        this.f3541y = true;
        this.f3542z.setFocusable(true);
        this.f3532p = new C0620q4(0, this);
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: e */
    public final void mo1975e(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0091c4 c0091c4 = this.f3542z;
        boolean zIsShowing = c0091c4.isShowing();
        m2304s();
        c0091c4.setInputMethodMode(2);
        mo976f();
        C0485mh c0485mh = this.f3519c;
        c0485mh.setChoiceMode(1);
        AbstractC0472m4.m1806d(c0485mh, i);
        AbstractC0472m4.m1805c(c0485mh, i2);
        C0805v4 c0805v4 = this.f4206G;
        int selectedItemPosition = c0805v4.getSelectedItemPosition();
        C0485mh c0485mh2 = this.f3519c;
        if (c0091c4.isShowing() && c0485mh2 != null) {
            c0485mh2.setListSelectionHidden(false);
            c0485mh2.setSelection(selectedItemPosition);
            if (c0485mh2.getChoiceMode() != 0) {
                c0485mh2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0805v4.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0398k4 viewTreeObserverOnGlobalLayoutListenerC0398k4 = new ViewTreeObserverOnGlobalLayoutListenerC0398k4(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0398k4);
        c0091c4.setOnDismissListener(new C0657r4(this, viewTreeObserverOnGlobalLayoutListenerC0398k4));
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: i */
    public final CharSequence mo1978i() {
        return this.f4202C;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: k */
    public final void mo1979k(CharSequence charSequence) {
        this.f4202C = charSequence;
    }

    @Override // p000.C0569or, p000.InterfaceC0768u4
    /* JADX INFO: renamed from: n */
    public final void mo1982n(ListAdapter listAdapter) {
        super.mo1982n(listAdapter);
        this.f4203D = (C0583p4) listAdapter;
    }

    @Override // p000.InterfaceC0768u4
    /* JADX INFO: renamed from: o */
    public final void mo1983o(int i) {
        this.f4205F = i;
    }

    /* JADX INFO: renamed from: s */
    public final void m2304s() {
        int i;
        C0805v4 c0805v4 = this.f4206G;
        Rect rect = c0805v4.f4896h;
        C0091c4 c0091c4 = this.f3542z;
        Drawable background = c0091c4.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i = hb0.m1385a(c0805v4) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c0805v4.getPaddingLeft();
        int paddingRight = c0805v4.getPaddingRight();
        int width = c0805v4.getWidth();
        int i2 = c0805v4.f4895g;
        if (i2 == -2) {
            int iM2542a = c0805v4.m2542a(this.f4203D, c0091c4.getBackground());
            int i3 = (c0805v4.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM2542a > i3) {
                iM2542a = i3;
            }
            m2058q(Math.max(iM2542a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m2058q((width - paddingLeft) - paddingRight);
        } else {
            m2058q(i2);
        }
        this.f3522f = hb0.m1385a(c0805v4) ? (((width - paddingRight) - this.f3521e) - this.f4205F) + i : paddingLeft + this.f4205F + i;
    }
}
