package yyds;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲈᛱᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2600 extends AbstractC2352 implements InterfaceC1710 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public C0223 f12797;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public CharSequence f12798;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final Rect f12799;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public int f12800;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1921 f12801;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2600(C1921 c1921, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f12801 = c1921;
        this.f12799 = new Rect();
        this.f11550 = c1921;
        this.f11548 = true;
        this.f11541.setFocusable(true);
        this.f11547 = new C2075(0, this);
    }

    @Override // yyds.AbstractC2352, yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo2569(ListAdapter listAdapter) {
        super.mo2569(listAdapter);
        this.f12797 = (C0223) listAdapter;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final CharSequence mo2571() {
        return this.f12798;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo2572(int i) {
        this.f12800 = i;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m4679() {
        int i;
        C1000 c1000 = this.f11541;
        Drawable background = c1000.getBackground();
        C1921 c1921 = this.f12801;
        Rect rect = c1921.f9677;
        if (background != null) {
            background.getPadding(rect);
            i = AbstractC1603.m3289(c1921) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c1921.getPaddingLeft();
        int paddingRight = c1921.getPaddingRight();
        int width = c1921.getWidth();
        int i2 = c1921.f9674;
        if (i2 == -2) {
            int iM3713 = c1921.m3713(this.f12797, c1000.getBackground());
            int i3 = (c1921.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM3713 > i3) {
                iM3713 = i3;
            }
            m4375(Math.max(iM3713, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m4375((width - paddingLeft) - paddingRight);
        } else {
            m4375(i2);
        }
        this.f11539 = AbstractC1603.m3289(c1921) ? (((width - paddingRight) - this.f11551) - this.f12800) + i : paddingLeft + this.f12800 + i;
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo2576(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C1000 c1000 = this.f11541;
        boolean zIsShowing = c1000.isShowing();
        m4679();
        c1000.setInputMethodMode(2);
        show();
        C2045 c2045 = this.f11543;
        c2045.setChoiceMode(1);
        AbstractC0162.m730(c2045, i);
        AbstractC0162.m729(c2045, i2);
        C1921 c1921 = this.f12801;
        int selectedItemPosition = c1921.getSelectedItemPosition();
        C2045 c20452 = this.f11543;
        if (c1000.isShowing() && c20452 != null) {
            c20452.setListSelectionHidden(false);
            c20452.setSelection(selectedItemPosition);
            if (c20452.getChoiceMode() != 0) {
                c20452.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1921.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0562 viewTreeObserverOnGlobalLayoutListenerC0562 = new ViewTreeObserverOnGlobalLayoutListenerC0562(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0562);
        c1000.setOnDismissListener(new C2168(this, viewTreeObserverOnGlobalLayoutListenerC0562));
    }

    @Override // yyds.InterfaceC1710
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo2580(CharSequence charSequence) {
        this.f12798 = charSequence;
    }
}
