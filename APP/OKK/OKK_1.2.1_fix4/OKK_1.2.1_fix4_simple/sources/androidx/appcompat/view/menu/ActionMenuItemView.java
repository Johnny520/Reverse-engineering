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
import p048b.AbstractC0550a;
import p055f.AbstractC0771b;
import p055f.InterfaceC0778i;
import p055f.InterfaceC0786q;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p055f.ViewOnTouchListenerC0770a;
import p057g.AbstractC0875N0;
import p057g.C0868K;
import p057g.InterfaceC0908j;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0868K implements InterfaceC0786q, View.OnClickListener, InterfaceC0908j {

    /* JADX INFO: renamed from: h */
    public MenuItemC0780k f1063h;

    /* JADX INFO: renamed from: i */
    public CharSequence f1064i;

    /* JADX INFO: renamed from: j */
    public Drawable f1065j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0778i f1066k;

    /* JADX INFO: renamed from: l */
    public ViewOnTouchListenerC0770a f1067l;

    /* JADX INFO: renamed from: m */
    public AbstractC0771b f1068m;

    /* JADX INFO: renamed from: n */
    public boolean f1069n;

    /* JADX INFO: renamed from: o */
    public boolean f1070o;

    /* JADX INFO: renamed from: p */
    public final int f1071p;

    /* JADX INFO: renamed from: q */
    public int f1072q;

    /* JADX INFO: renamed from: r */
    public final int f1073r;

    public ActionMenuItemView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        Resources r1 = r4.getResources();
        this.f1069n = m1114h();
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0550a.f1618c, 0, 0);
        this.f1071p = r42.getDimensionPixelSize(0, 0);
        r42.recycle();
        this.f1073r = (int) ((r1.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1072q = -1;
        setSaveEnabled(false);
    }

    @Override // p057g.InterfaceC0908j
    /* JADX INFO: renamed from: a */
    public final boolean mo1111a() {
        if ((!TextUtils.isEmpty(getText())) == true) goto L5;
    L7:
        return false;
    L5:
        if (this.f1063h.getIcon() != null) goto L7;
        return true;
    }

    @Override // p057g.InterfaceC0908j
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p055f.InterfaceC0786q
    /* JADX INFO: renamed from: c */
    public final void mo1113c(MenuItemC0780k r2) {
        this.f1063h = r2;
        setIcon(r2.getIcon());
        setTitle(r2.getTitleCondensed());
        setId(r2.f2807a);
        if (r2.isVisible() == false) goto L5;
        int r02 = 0;
    L6:
        setVisibility(r02);
        setEnabled(r2.isEnabled());
        if (r2.hasSubMenu() == true) goto L9;
        return;
    L9:
        if (this.f1067l != null) goto L13;
        this.f1067l = new ViewOnTouchListenerC0770a(this);
        return;
    L13:
        return;
    L5:
        r02 = 8;
        goto L6
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p055f.InterfaceC0786q
    public MenuItemC0780k getItemData() {
        return this.f1063h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1114h() {
        Configuration r02 = getContext().getResources().getConfiguration();
        int r1 = r02.screenWidthDp;
        int r2 = r02.screenHeightDp;
        if (r1 < 480) goto L5;
    L11:
        return true;
    L5:
        if (r1 < 640) goto L8;
        if (r2 >= 480) goto L11;
    L8:
        if (r02.orientation == 2) goto L11;
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m1115i() {
        boolean r1 = true;
        boolean r02 = !TextUtils.isEmpty(this.f1064i);
        if (this.f1065j != null) goto L5;
    L12:
        boolean r03 = r02 & r1;
        CharSequence r12 = null;
        if (r03 == false) goto L15;
        CharSequence r2 = this.f1064i;
    L16:
        setText(r2);
        CharSequence r22 = this.f1063h.f2823q;
        if (TextUtils.isEmpty(r22) == false) goto L22;
        if (r03 == false) goto L20;
        CharSequence r23 = null;
    L21:
        setContentDescription(r23);
    L23:
        CharSequence r24 = this.f1063h.f2824r;
        if (TextUtils.isEmpty(r24) == false) goto L29;
        if (r03 == true) goto L28;
        r12 = this.f1063h.f2811e;
    L28:
        AbstractC0875N0.m2199a(this, r12);
        return;
    L29:
        AbstractC0875N0.m2199a(this, r24);
        return;
    L20:
        r23 = this.f1063h.f2811e;
        goto L21
    L22:
        setContentDescription(r22);
        goto L23
    L15:
        r2 = null;
        goto L16
    L5:
        if ((this.f1063h.f2831y & 4) == 4) goto L7;
    L11:
        r1 = false;
        goto L12
    L7:
        if (this.f1069n == true) goto L12;
        if (this.f1070o == false) goto L11;
        goto L11
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        InterfaceC0778i r22 = this.f1066k;
        if (r22 == null) goto L6;
        r22.mo1116a(this.f1063h);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        this.f1069n = m1114h();
        m1115i();
    }

    @Override // p057g.C0868K, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
        boolean r02 = !TextUtils.isEmpty(getText());
        if (r02 == false) goto L7;
        int r1 = this.f1072q;
        if (r1 < 0) goto L7;
        super.setPadding(r1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    L7:
        super.onMeasure(r6, r7);
        int r12 = View.MeasureSpec.getMode(r6);
        int r62 = View.MeasureSpec.getSize(r6);
        int r2 = getMeasuredWidth();
        int r3 = this.f1071p;
        if (r12 != Integer.MIN_VALUE) goto L10;
        int r63 = Math.min(r62, r3);
    L12:
        if (r12 == 1073741824) goto L16;
        if (r3 <= 0) goto L16;
        if (r2 >= r63) goto L16;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r63, 1073741824), r7);
    L16:
        if (r02 == false) goto L18;
        return;
    L18:
        if (this.f1065j == null) goto L22;
        super.setPadding((getMeasuredWidth() - this.f1065j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        return;
    L22:
        return;
    L10:
        r63 = r3;
        goto L12
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r1) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent r2) {
        if (this.f1063h.hasSubMenu() == false) goto L11;
        ViewOnTouchListenerC0770a r02 = this.f1067l;
        if (r02 == null) goto L11;
        if (r02.onTouch(this, r2) == false) goto L11;
        return true;
    L11:
        return super.onTouchEvent(r2);
    }

    public void setCheckable(boolean r1) {
    }

    public void setChecked(boolean r1) {
    }

    public void setExpandedFormat(boolean r2) {
        if (this.f1070o == r2) goto L8;
        this.f1070o = r2;
        MenuItemC0780k r22 = this.f1063h;
        if (r22 == null) goto L9;
        MenuC0779j r23 = r22.f2820n;
        r23.f2795k = true;
        r23.m2009o(true);
        return;
    L9:
        return;
    }

    public void setIcon(Drawable r5) {
        this.f1065j = r5;
        if (r5 == null) goto L11;
        int r02 = r5.getIntrinsicWidth();
        int r1 = r5.getIntrinsicHeight();
        int r2 = this.f1073r;
        if (r02 <= r2) goto L7;
        r1 = (int) (r1 * (r2 / r02));
        r02 = r2;
    L7:
        if (r1 <= r2) goto L9;
        r02 = (int) (r02 * (r2 / r1));
    L10:
        r5.setBounds(0, 0, r02, r2);
        goto L11
    L9:
        r2 = r1;
    L11:
        setCompoundDrawables(r5, null, null, null);
        m1115i();
    }

    public void setItemInvoker(InterfaceC0778i r1) {
        this.f1066k = r1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
        this.f1072q = r1;
        super.setPadding(r1, r2, r3, r4);
    }

    public void setPopupCallback(AbstractC0771b r1) {
        this.f1068m = r1;
    }

    public void setTitle(CharSequence r1) {
        this.f1064i = r1;
        m1115i();
    }
}
