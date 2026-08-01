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
import p000.AbstractC0171e1;
import p000.AbstractC0205ez;
import p000.C0135d1;
import p000.C0249g5;
import p000.C0869wu;
import p000.InterfaceC0395k1;
import p000.InterfaceC0499mv;
import p000.InterfaceC0609pu;
import p000.MenuC0646qu;
import p000.r70;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0249g5 implements InterfaceC0499mv, View.OnClickListener, InterfaceC0395k1 {

    /* JADX INFO: renamed from: h */
    public C0869wu f157h;

    /* JADX INFO: renamed from: i */
    public CharSequence f158i;

    /* JADX INFO: renamed from: j */
    public Drawable f159j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0609pu f160k;

    /* JADX INFO: renamed from: l */
    public C0135d1 f161l;

    /* JADX INFO: renamed from: m */
    public AbstractC0171e1 f162m;

    /* JADX INFO: renamed from: n */
    public boolean f163n;

    /* JADX INFO: renamed from: o */
    public boolean f164o;

    /* JADX INFO: renamed from: p */
    public final int f165p;

    /* JADX INFO: renamed from: q */
    public int f166q;

    /* JADX INFO: renamed from: r */
    public final int f167r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f163n = m120f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1679c, 0, 0);
        this.f165p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f167r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f166q = -1;
        setSaveEnabled(false);
    }

    @Override // p000.InterfaceC0395k1
    /* JADX INFO: renamed from: a */
    public final boolean mo117a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC0395k1
    /* JADX INFO: renamed from: b */
    public final boolean mo118b() {
        return !TextUtils.isEmpty(getText()) && this.f157h.getIcon() == null;
    }

    @Override // p000.InterfaceC0499mv
    /* JADX INFO: renamed from: c */
    public final void mo119c(C0869wu c0869wu) {
        this.f157h = c0869wu;
        setIcon(c0869wu.getIcon());
        setTitle(c0869wu.getTitleCondensed());
        setId(c0869wu.f5112a);
        setVisibility(c0869wu.isVisible() ? 0 : 8);
        setEnabled(c0869wu.isEnabled());
        if (c0869wu.hasSubMenu() && this.f161l == null) {
            this.f161l = new C0135d1(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m120f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m121g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f158i);
        if (this.f159j != null && ((this.f157h.f5136y & 4) != 4 || (!this.f163n && !this.f164o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f158i : null);
        CharSequence charSequence = this.f157h.f5128q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f157h.f5116e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f157h.f5129r;
        if (TextUtils.isEmpty(charSequence2)) {
            r70.m2264a(this, z3 ? null : this.f157h.f5116e);
        } else {
            r70.m2264a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.InterfaceC0499mv
    public C0869wu getItemData() {
        return this.f157h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0609pu interfaceC0609pu = this.f160k;
        if (interfaceC0609pu != null) {
            interfaceC0609pu.mo122a(this.f157h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f163n = m120f();
        m121g();
    }

    @Override // p000.C0249g5, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f166q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f165p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f159j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f159j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0135d1 c0135d1;
        if (this.f157h.hasSubMenu() && (c0135d1 = this.f161l) != null && c0135d1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f164o != z) {
            this.f164o = z;
            C0869wu c0869wu = this.f157h;
            if (c0869wu != null) {
                MenuC0646qu menuC0646qu = c0869wu.f5125n;
                menuC0646qu.f3961k = true;
                menuC0646qu.m2172p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f159j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f167r;
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
        m121g();
    }

    public void setItemInvoker(InterfaceC0609pu interfaceC0609pu) {
        this.f160k = interfaceC0609pu;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f166q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0171e1 abstractC0171e1) {
        this.f162m = abstractC0171e1;
    }

    public void setTitle(CharSequence charSequence) {
        this.f158i = charSequence;
        m121g();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
