package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0962 extends C1029 implements InterfaceC1075 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f878;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final /* synthetic */ C1074 f879;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public CharSequence f880;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Rect f881;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public C0966 f882;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0962(C1074 c1074, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.spinnerStyle, 0);
        this.f879 = c1074;
        this.f881 = new Rect();
        this.f1059 = c1074;
        this.f1057 = true;
        this.f1054.setFocusable(true);
        setOnItemClickListener(new C0965(this, 0));
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo1072(CharSequence charSequence) {
        this.f880 = charSequence;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final CharSequence mo1073() {
        return this.f880;
    }

    @Override // androidx.appcompat.widget.C1029, androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo1074(ListAdapter listAdapter) {
        super.mo1074(listAdapter);
        this.f882 = (C0966) listAdapter;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m1075() {
        int i;
        C0981 c0981 = this.f1054;
        Drawable background = c0981.getBackground();
        C1074 c1074 = this.f879;
        Rect rect = c1074.f1199;
        if (background != null) {
            background.getPadding(rect);
            i = c1074.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c1074.getPaddingLeft();
        int paddingRight = c1074.getPaddingRight();
        int width = c1074.getWidth();
        int i2 = c1074.f1201;
        if (i2 == -2) {
            int iM1291 = c1074.m1291(this.f882, c0981.getBackground());
            int i3 = (c1074.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM1291 > i3) {
                iM1291 = i3;
            }
            m1207(Math.max(iM1291, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m1207((width - paddingLeft) - paddingRight);
        } else {
            m1207(i2);
        }
        this.f1075 = c1074.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f1071) - this.f878) + i : paddingLeft + this.f878 + i;
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo1076(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0981 c0981 = this.f1054;
        boolean zIsShowing = c0981.isShowing();
        m1075();
        c0981.setInputMethodMode(2);
        show();
        C1024 c1024 = this.f1078;
        c1024.setChoiceMode(1);
        c1024.setTextDirection(i);
        c1024.setTextAlignment(i2);
        C1074 c1074 = this.f879;
        int selectedItemPosition = c1074.getSelectedItemPosition();
        C1024 c10242 = this.f1078;
        if (c0981.isShowing() && c10242 != null) {
            c10242.setListSelectionHidden(false);
            c10242.setSelection(selectedItemPosition);
            if (c10242.getChoiceMode() != 0) {
                c10242.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1074.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0968 viewTreeObserverOnGlobalLayoutListenerC0968 = new ViewTreeObserverOnGlobalLayoutListenerC0968(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0968);
        setOnDismissListener(new C0961(this, viewTreeObserverOnGlobalLayoutListenerC0968));
    }

    @Override // androidx.appcompat.widget.InterfaceC1075
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo1077(int i) {
        this.f878 = i;
    }
}
