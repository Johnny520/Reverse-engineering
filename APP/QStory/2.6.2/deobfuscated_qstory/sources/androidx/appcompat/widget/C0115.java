package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0115 extends C0182 implements InterfaceC0228 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f533;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final /* synthetic */ C0227 f534;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public CharSequence f535;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Rect f536;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C0119 f537;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115(C0227 c0227, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f534 = c0227;
        this.f536 = new Rect();
        this.f714 = c0227;
        this.f712 = true;
        this.f709.setFocusable(true);
        setOnItemClickListener(new C0118(this, 0));
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo511(CharSequence charSequence) {
        this.f535 = charSequence;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final CharSequence mo512() {
        return this.f535;
    }

    @Override // androidx.appcompat.widget.C0182, androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo513(ListAdapter listAdapter) {
        super.mo513(listAdapter);
        this.f537 = (C0119) listAdapter;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m514() {
        int i;
        C0134 c0134 = this.f709;
        Drawable background = c0134.getBackground();
        C0227 c0227 = this.f534;
        Rect rect = c0227.f854;
        if (background != null) {
            background.getPadding(rect);
            i = c0227.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c0227.getPaddingLeft();
        int paddingRight = c0227.getPaddingRight();
        int width = c0227.getWidth();
        int i2 = c0227.f856;
        if (i2 == -2) {
            int iM730 = c0227.m730(this.f537, c0134.getBackground());
            int i3 = (c0227.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM730 > i3) {
                iM730 = i3;
            }
            m646(Math.max(iM730, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m646((width - paddingLeft) - paddingRight);
        } else {
            m646(i2);
        }
        this.f730 = c0227.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f726) - this.f533) + i : paddingLeft + this.f533 + i;
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo515(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0134 c0134 = this.f709;
        boolean zIsShowing = c0134.isShowing();
        m514();
        c0134.setInputMethodMode(2);
        show();
        C0177 c0177 = this.f733;
        c0177.setChoiceMode(1);
        c0177.setTextDirection(i);
        c0177.setTextAlignment(i2);
        C0227 c0227 = this.f534;
        int selectedItemPosition = c0227.getSelectedItemPosition();
        C0177 c01772 = this.f733;
        if (c0134.isShowing() && c01772 != null) {
            c01772.setListSelectionHidden(false);
            c01772.setSelection(selectedItemPosition);
            if (c01772.getChoiceMode() != 0) {
                c01772.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0227.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0121 viewTreeObserverOnGlobalLayoutListenerC0121 = new ViewTreeObserverOnGlobalLayoutListenerC0121(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0121);
        setOnDismissListener(new C0114(this, viewTreeObserverOnGlobalLayoutListenerC0121));
    }

    @Override // androidx.appcompat.widget.InterfaceC0228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo516(int i) {
        this.f533 = i;
    }
}
