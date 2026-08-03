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
import p000.AbstractC0982Wu;
import p000.AbstractC2706xB;
import p000.AbstractC2738y0;
import p000.C2304o4;
import p000.C2427qr;
import p000.C2695x0;
import p000.InterfaceC0173E0;
import p000.InterfaceC0249Fr;
import p000.InterfaceC2161kr;
import p000.MenuC2204lr;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C2304o4 implements InterfaceC0249Fr, View.OnClickListener, InterfaceC0173E0 {

    /* JADX INFO: renamed from: g */
    public C2427qr f3686g;

    /* JADX INFO: renamed from: h */
    public CharSequence f3687h;

    /* JADX INFO: renamed from: i */
    public Drawable f3688i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2161kr f3689j;

    /* JADX INFO: renamed from: k */
    public C2695x0 f3690k;

    /* JADX INFO: renamed from: l */
    public AbstractC2738y0 f3691l;

    /* JADX INFO: renamed from: m */
    public boolean f3692m;

    /* JADX INFO: renamed from: n */
    public boolean f3693n;

    /* JADX INFO: renamed from: o */
    public final int f3694o;

    /* JADX INFO: renamed from: p */
    public int f3695p;

    /* JADX INFO: renamed from: q */
    public final int f3696q;

    public ActionMenuItemView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        Resources r1 = r4.getResources();
        this.f3692m = m2072g();
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0982Wu.f3068c, 0, 0);
        this.f3694o = r42.getDimensionPixelSize(0, 0);
        r42.recycle();
        this.f3696q = (int) ((r1.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3695p = -1;
        setSaveEnabled(false);
    }

    @Override // p000.InterfaceC0173E0
    /* JADX INFO: renamed from: a */
    public final boolean mo135a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC0173E0
    /* JADX INFO: renamed from: b */
    public final boolean mo136b() {
        if (TextUtils.isEmpty(getText()) == false) goto L5;
        return false;
    L5:
        if (this.f3686g.getIcon() != null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC0249Fr
    /* JADX INFO: renamed from: c */
    public final void mo521c(C2427qr r2) {
        this.f3686g = r2;
        setIcon(r2.getIcon());
        setTitle(r2.getTitleCondensed());
        setId(r2.f8492a);
        if (r2.isVisible() == false) goto L5;
        int r0 = 0;
    L6:
        setVisibility(r0);
        setEnabled(r2.isEnabled());
        if (r2.hasSubMenu() == true) goto L9;
        return;
    L9:
        if (this.f3690k != null) goto L13;
        this.f3690k = new C2695x0(this);
        return;
    L13:
        return;
    L5:
        r0 = 8;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2072g() {
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

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.InterfaceC0249Fr
    public C2427qr getItemData() {
        return this.f3686g;
    }

    /* JADX INFO: renamed from: h */
    public final void m2073h() {
        boolean r1 = true;
        boolean r0 = !TextUtils.isEmpty(this.f3687h);
        if (this.f3688i != null) goto L5;
    L12:
        boolean r02 = r0 & r1;
        CharSequence r12 = null;
        if (r02 == false) goto L15;
        CharSequence r2 = this.f3687h;
    L16:
        setText(r2);
        CharSequence r22 = this.f3686g.f8508q;
        if (TextUtils.isEmpty(r22) == false) goto L22;
        if (r02 == false) goto L20;
        CharSequence r23 = null;
    L21:
        setContentDescription(r23);
    L23:
        CharSequence r24 = this.f3686g.f8509r;
        if (TextUtils.isEmpty(r24) == false) goto L30;
        if (r02 == true) goto L28;
        r12 = this.f3686g.f8496e;
    L28:
        AbstractC2706xB.m5280a(this, r12);
        return;
    L30:
        AbstractC2706xB.m5280a(this, r24);
        return;
    L20:
        r23 = this.f3686g.f8496e;
        goto L21
    L22:
        setContentDescription(r22);
        goto L23
    L15:
        r2 = null;
        goto L16
    L5:
        if ((this.f3686g.f8516y & 4) == 4) goto L7;
    L11:
        r1 = false;
        goto L12
    L7:
        if (this.f3692m == true) goto L12;
        if (this.f3693n == false) goto L11;
        goto L11
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        InterfaceC2161kr r22 = this.f3689j;
        if (r22 == null) goto L6;
        r22.mo2074a(this.f3686g);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        this.f3692m = m2072g();
        m2073h();
    }

    @Override // p000.C2304o4, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
        boolean r0 = TextUtils.isEmpty(getText());
        if (r0 == true) goto L7;
        int r1 = this.f3695p;
        if (r1 < 0) goto L7;
        super.setPadding(r1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    L7:
        super.onMeasure(r6, r7);
        int r12 = View.MeasureSpec.getMode(r6);
        int r62 = View.MeasureSpec.getSize(r6);
        int r2 = getMeasuredWidth();
        int r4 = this.f3694o;
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
        if (this.f3688i == null) goto L22;
        super.setPadding((getMeasuredWidth() - this.f3688i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
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
        if (this.f3686g.hasSubMenu() == false) goto L11;
        C2695x0 r0 = this.f3690k;
        if (r0 == null) goto L11;
        if (r0.onTouch(this, r2) == false) goto L11;
        return true;
    L11:
        return super.onTouchEvent(r2);
    }

    public void setCheckable(boolean r1) {
    }

    public void setChecked(boolean r1) {
    }

    public void setExpandedFormat(boolean r2) {
        if (this.f3693n == r2) goto L8;
        this.f3693n = r2;
        C2427qr r22 = this.f3686g;
        if (r22 == null) goto L9;
        MenuC2204lr r23 = r22.f8505n;
        r23.f7670k = true;
        r23.m4435p(true);
        return;
    L9:
        return;
    }

    public void setIcon(Drawable r5) {
        this.f3688i = r5;
        if (r5 == null) goto L11;
        int r0 = r5.getIntrinsicWidth();
        int r1 = r5.getIntrinsicHeight();
        int r2 = this.f3696q;
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
        m2073h();
    }

    public void setItemInvoker(InterfaceC2161kr r1) {
        this.f3689j = r1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
        this.f3695p = r1;
        super.setPadding(r1, r2, r3, r4);
    }

    public void setPopupCallback(AbstractC2738y0 r1) {
        this.f3691l = r1;
    }

    public void setTitle(CharSequence r1) {
        this.f3687h = r1;
        m2073h();
    }
}
