package p069i;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.p055lu.wxmask272.R;
import p068h.ViewTreeObserverOnGlobalLayoutListenerC0585d;

/* JADX INFO: renamed from: i.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0640Q extends AbstractC0619F0 implements InterfaceC0645T {

    /* JADX INFO: renamed from: C */
    public CharSequence f2194C;

    /* JADX INFO: renamed from: D */
    public C0634N f2195D;

    /* JADX INFO: renamed from: E */
    public final Rect f2196E;

    /* JADX INFO: renamed from: F */
    public int f2197F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0647U f2198G;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640Q(C0647U c0647u, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2198G = c0647u;
        this.f2196E = new Rect();
        this.f2142p = c0647u;
        this.f2151y = true;
        this.f2152z.setFocusable(true);
        this.f2143q = new C0636O(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: b */
    public final CharSequence mo1241b() {
        return this.f2194C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: e */
    public final void mo1244e(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        C0610B c0610b = this.f2152z;
        boolean zIsShowing = c0610b.isShowing();
        m1259q();
        this.f2152z.setInputMethodMode(2);
        mo1146h();
        C0717t0 c0717t0 = this.f2130d;
        c0717t0.setChoiceMode(1);
        AbstractC0628K.m1238d(c0717t0, i2);
        AbstractC0628K.m1237c(c0717t0, i3);
        C0647U c0647u = this.f2198G;
        int selectedItemPosition = c0647u.getSelectedItemPosition();
        C0717t0 c0717t02 = this.f2130d;
        if (c0610b.isShowing() && c0717t02 != null) {
            c0717t02.setListSelectionHidden(false);
            c0717t02.setSelection(selectedItemPosition);
            if (c0717t02.getChoiceMode() != 0) {
                c0717t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0647u.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0585d viewTreeObserverOnGlobalLayoutListenerC0585d = new ViewTreeObserverOnGlobalLayoutListenerC0585d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0585d);
        this.f2152z.setOnDismissListener(new C0638P(this, viewTreeObserverOnGlobalLayoutListenerC0585d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: g */
    public final void mo1245g(CharSequence charSequence) {
        this.f2194C = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0619F0, p069i.InterfaceC0645T
    /* JADX INFO: renamed from: m */
    public final void mo1225m(ListAdapter listAdapter) {
        super.mo1225m(listAdapter);
        this.f2195D = (C0634N) listAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0645T
    /* JADX INFO: renamed from: n */
    public final void mo1250n(int i2) {
        this.f2197F = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m1259q() {
        int i2;
        C0610B c0610b = this.f2152z;
        Drawable background = c0610b.getBackground();
        C0647U c0647u = this.f2198G;
        if (background != null) {
            background.getPadding(c0647u.f2213i);
            boolean zM1366a = AbstractC0718t1.m1366a(c0647u);
            Rect rect = c0647u.f2213i;
            i2 = zM1366a ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0647u.f2213i;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = c0647u.getPaddingLeft();
        int paddingRight = c0647u.getPaddingRight();
        int width = c0647u.getWidth();
        int i3 = c0647u.f2212h;
        if (i3 == -2) {
            int iM1264a = c0647u.m1264a(this.f2195D, c0610b.getBackground());
            int i4 = c0647u.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0647u.f2213i;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iM1264a > i5) {
                iM1264a = i5;
            }
            m1227p(Math.max(iM1264a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m1227p((width - paddingLeft) - paddingRight);
        } else {
            m1227p(i3);
        }
        this.f2133g = AbstractC0718t1.m1366a(c0647u) ? (((width - paddingRight) - this.f2132f) - this.f2197F) + i2 : paddingLeft + this.f2197F + i2;
    }
}
