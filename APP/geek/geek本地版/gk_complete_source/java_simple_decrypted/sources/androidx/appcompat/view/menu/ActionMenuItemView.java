package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.d1;
import defpackage.e1;
import defpackage.ev;
import defpackage.g5;
import defpackage.ju;
import defpackage.k1;
import defpackage.ku;
import defpackage.l70;
import defpackage.ou;
import defpackage.xy;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends g5 implements ev, View.OnClickListener, k1 {
    public ou h;
    public CharSequence i;
    public Drawable j;
    public ju k;
    public d1 l;
    public e1 m;
    public boolean n;
    public boolean o;
    public final int p;
    public int q;
    public final int r;

    public ActionMenuItemView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        Resources r1 = r4.getResources();
        this.n = f();
        TypedArray r42 = r4.obtainStyledAttributes(r5, xy.c, 0, 0);
        this.p = r42.getDimensionPixelSize(0, 0);
        r42.recycle();
        this.r = (int) ((r1.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.q = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.k1
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.k1
    public final boolean b() {
        if (TextUtils.isEmpty(getText()) == false) goto L5;
        return false;
    L5:
        if (this.h.getIcon() != null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.ev
    public final void c(ou r2) {
        this.h = r2;
        setIcon(r2.getIcon());
        setTitle(r2.getTitleCondensed());
        setId(r2.a);
        if (r2.isVisible() == false) goto L5;
        int r0 = 0;
    L6:
        setVisibility(r0);
        setEnabled(r2.isEnabled());
        if (r2.hasSubMenu() == true) goto L9;
        return;
    L9:
        if (this.l != null) goto L13;
        this.l = new d1(this);
        return;
    L13:
        return;
    L5:
        r0 = 8;
        goto L6
    }

    public final boolean f() {
        Configuration r0 = getContext().getResources().getConfiguration();
        int r1 = r0.screenWidthDp;
        int r2 = r0.screenHeightDp;
        if (r1 < 480) goto L5;
        return true;
    L5:
        if (r1 < 640) goto L8;
        if (r2 < 480) goto L8;
        return true;
    L8:
        if (r0.orientation == 2) goto L15;
        return false;
    L15:
        return true;
    }

    public final void g() {
        boolean r1 = true;
        boolean r0 = !TextUtils.isEmpty(this.i);
        if (this.j != null) goto L5;
    L12:
        boolean r02 = r0 & r1;
        CharSequence r12 = null;
        if (r02 == false) goto L15;
        CharSequence r2 = this.i;
    L16:
        setText(r2);
        CharSequence r22 = this.h.q;
        if (TextUtils.isEmpty(r22) == false) goto L22;
        if (r02 == false) goto L20;
        CharSequence r23 = null;
    L21:
        setContentDescription(r23);
    L23:
        CharSequence r24 = this.h.r;
        if (TextUtils.isEmpty(r24) == false) goto L30;
        if (r02 == true) goto L28;
        r12 = this.h.e;
    L28:
        l70.a(this, r12);
        return;
    L30:
        l70.a(this, r24);
        return;
    L20:
        r23 = this.h.e;
        goto L21
    L22:
        setContentDescription(r22);
        goto L23
    L15:
        r2 = null;
        goto L16
    L5:
        if ((this.h.y & 4) == 4) goto L7;
    L11:
        r1 = false;
        goto L12
    L7:
        if (this.n == true) goto L12;
        if (this.o == false) goto L11;
        goto L11
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.ev
    public ou getItemData() {
        return this.h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        ju r22 = this.k;
        if (r22 == null) goto L6;
        r22.a(this.h);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        this.n = f();
        g();
    }

    @Override // defpackage.g5, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
        boolean r0 = TextUtils.isEmpty(getText());
        if (r0 == true) goto L7;
        int r1 = this.q;
        if (r1 < 0) goto L7;
        super.setPadding(r1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    L7:
        super.onMeasure(r6, r7);
        int r12 = View.MeasureSpec.getMode(r6);
        int r62 = View.MeasureSpec.getSize(r6);
        int r2 = getMeasuredWidth();
        int r4 = this.p;
        if (r12 != Integer.MIN_VALUE) goto L10;
        int r63 = Math.min(r62, r4);
    L12:
        if (r12 == 1073741824) goto L16;
        if (r4 <= 0) goto L16;
        if (r2 >= r63) goto L16;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r63, 1073741824), r7);
    L16:
        if (r0 == true) goto L18;
        return;
    L18:
        if (this.j == null) goto L22;
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        return;
    L22:
        return;
    L10:
        r63 = r4;
        goto L12
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r1) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent r2) {
        if (this.h.hasSubMenu() == false) goto L11;
        d1 r0 = this.l;
        if (r0 == null) goto L11;
        if (r0.onTouch(this, r2) == false) goto L11;
        return true;
    L11:
        return super.onTouchEvent(r2);
    }

    public void setExpandedFormat(boolean r2) {
        if (this.o == r2) goto L8;
        this.o = r2;
        ou r22 = this.h;
        if (r22 == null) goto L9;
        ku r23 = r22.n;
        r23.k = true;
        r23.p(true);
        return;
    L9:
        return;
    }

    public void setIcon(Drawable r5) {
        this.j = r5;
        if (r5 == null) goto L11;
        int r0 = r5.getIntrinsicWidth();
        int r1 = r5.getIntrinsicHeight();
        int r2 = this.r;
        if (r0 <= r2) goto L7;
        r1 = (int) (r1 * (r2 / r0));
        r0 = r2;
    L7:
        if (r1 <= r2) goto L9;
        r0 = (int) (r0 * (r2 / r1));
    L10:
        r5.setBounds(0, 0, r0, r2);
        goto L11
    L9:
        r2 = r1;
    L11:
        setCompoundDrawables(r5, null, null, null);
        g();
    }

    public void setItemInvoker(ju r1) {
        this.k = r1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
        this.q = r1;
        super.setPadding(r1, r2, r3, r4);
    }

    public void setPopupCallback(e1 r1) {
        this.m = r1;
    }

    public void setTitle(CharSequence r1) {
        this.i = r1;
        g();
    }

    public void setCheckable(boolean r1) {
    }

    public void setChecked(boolean r1) {
    }
}
