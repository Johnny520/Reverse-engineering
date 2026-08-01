package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends kr implements u4 {
    public CharSequence C;
    public p4 D;
    public final Rect E;
    public int F;
    public final /* synthetic */ v4 G;

    public s4(v4 r3, Context r4, AttributeSet r5) {
        this.G = r3;
        super(r4, r5, R.attr.spinnerStyle, 0);
        this.E = new Rect();
        this.o = r3;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new q4(0, this);
    }

    @Override // defpackage.u4
    public final void e(int r6, int r7) {
        c4 r0 = this.z;
        boolean r1 = r0.isShowing();
        s();
        r0.setInputMethodMode(2);
        f();
        kh r2 = this.c;
        r2.setChoiceMode(1);
        m4.d(r2, r6);
        m4.c(r2, r7);
        v4 r62 = this.G;
        int r72 = r62.getSelectedItemPosition();
        kh r22 = this.c;
        if (r0.isShowing() == false) goto L8;
        if (r22 == null) goto L8;
        r22.setListSelectionHidden(false);
        r22.setSelection(r72);
        if (r22.getChoiceMode() == 0) goto L8;
        r22.setItemChecked(r72, true);
    L8:
        if (r1 == true) goto L15;
        ViewTreeObserver r63 = r62.getViewTreeObserver();
        if (r63 == null) goto L14;
        k4 r73 = new k4(1, this);
        r63.addOnGlobalLayoutListener(r73);
        r0.setOnDismissListener(new r4(this, r73));
        return;
    L14:
        return;
    }

    @Override // defpackage.u4
    public final CharSequence i() {
        return this.C;
    }

    @Override // defpackage.u4
    public final void k(CharSequence r1) {
        this.C = r1;
    }

    @Override // defpackage.kr, defpackage.u4
    public final void n(ListAdapter r1) {
        super.n(r1);
        this.D = (p4) r1;
    }

    @Override // defpackage.u4
    public final void o(int r1) {
        this.F = r1;
    }

    public final void s() {
        v4 r0 = this.G;
        Rect r1 = r0.h;
        c4 r2 = this.z;
        Drawable r3 = r2.getBackground();
        if (r3 == null) goto L8;
        r3.getPadding(r1);
        if (cb0.a(r0) == false) goto L7;
        int r32 = r1.right;
    L9:
        int r4 = r0.getPaddingLeft();
        int r5 = r0.getPaddingRight();
        int r6 = r0.getWidth();
        int r7 = r0.g;
        if (r7 != (-2)) goto L16;
        int r22 = r0.a(this.D, r2.getBackground());
        int r72 = (r0.getContext().getResources().getDisplayMetrics().widthPixels - r1.left) - r1.right;
        if (r22 <= r72) goto L14;
        r22 = r72;
    L14:
        q(Math.max(r22, (r6 - r4) - r5));
    L20:
        if (cb0.a(r0) == false) goto L22;
        int r62 = (((r6 - r5) - this.e) - this.F) + r32;
    L23:
        this.f = r62;
        return;
    L22:
        r62 = (r4 + this.F) + r32;
        goto L23
    L16:
        if (r7 != (-1)) goto L18;
        q((r6 - r4) - r5);
        goto L20
    L18:
        q(r7);
        goto L20
    L7:
        r32 = -r1.left;
        goto L9
    L8:
        r32 = 0;
        r1.right = 0;
        r1.left = 0;
        goto L9
    }
}
