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

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3692m = m2072g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3068c, 0, 0);
        this.f3694o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3696q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
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
        return !TextUtils.isEmpty(getText()) && this.f3686g.getIcon() == null;
    }

    @Override // p000.InterfaceC0249Fr
    /* JADX INFO: renamed from: c */
    public final void mo521c(C2427qr c2427qr) {
        this.f3686g = c2427qr;
        setIcon(c2427qr.getIcon());
        setTitle(c2427qr.getTitleCondensed());
        setId(c2427qr.f8492a);
        setVisibility(c2427qr.isVisible() ? 0 : 8);
        setEnabled(c2427qr.isEnabled());
        if (c2427qr.hasSubMenu() && this.f3690k == null) {
            this.f3690k = new C2695x0(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2072g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
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
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f3687h);
        if (this.f3688i != null && ((this.f3686g.f8516y & 4) != 4 || (!this.f3692m && !this.f3693n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f3687h : null);
        CharSequence charSequence = this.f3686g.f8508q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f3686g.f8496e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3686g.f8509r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC2706xB.m5280a(this, z3 ? null : this.f3686g.f8496e);
        } else {
            AbstractC2706xB.m5280a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2161kr interfaceC2161kr = this.f3689j;
        if (interfaceC2161kr != null) {
            interfaceC2161kr.mo2074a(this.f3686g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3692m = m2072g();
        m2073h();
    }

    @Override // p000.C2304o4, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f3695p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f3694o;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f3688i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3688i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2695x0 c2695x0;
        if (this.f3686g.hasSubMenu() && (c2695x0 = this.f3690k) != null && c2695x0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f3693n != z) {
            this.f3693n = z;
            C2427qr c2427qr = this.f3686g;
            if (c2427qr != null) {
                MenuC2204lr menuC2204lr = c2427qr.f8505n;
                menuC2204lr.f7670k = true;
                menuC2204lr.m4435p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3688i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f3696q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2073h();
    }

    public void setItemInvoker(InterfaceC2161kr interfaceC2161kr) {
        this.f3689j = interfaceC2161kr;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f3695p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC2738y0 abstractC2738y0) {
        this.f3691l = abstractC2738y0;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3687h = charSequence;
        m2073h();
    }
}
