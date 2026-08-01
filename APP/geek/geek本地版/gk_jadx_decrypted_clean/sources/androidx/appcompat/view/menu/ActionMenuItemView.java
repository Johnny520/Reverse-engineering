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
import p000.AbstractC0910xy;
import p000.C0135d1;
import p000.C0249g5;
import p000.C0572ou;
import p000.InterfaceC0201ev;
import p000.InterfaceC0387ju;
import p000.InterfaceC0395k1;
import p000.MenuC0424ku;
import p000.l70;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0249g5 implements InterfaceC0201ev, View.OnClickListener, InterfaceC0395k1 {

    /* JADX INFO: renamed from: h */
    public C0572ou f194h;

    /* JADX INFO: renamed from: i */
    public CharSequence f195i;

    /* JADX INFO: renamed from: j */
    public Drawable f196j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0387ju f197k;

    /* JADX INFO: renamed from: l */
    public C0135d1 f198l;

    /* JADX INFO: renamed from: m */
    public AbstractC0171e1 f199m;

    /* JADX INFO: renamed from: n */
    public boolean f200n;

    /* JADX INFO: renamed from: o */
    public boolean f201o;

    /* JADX INFO: renamed from: p */
    public final int f202p;

    /* JADX INFO: renamed from: q */
    public int f203q;

    /* JADX INFO: renamed from: r */
    public final int f204r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f200n = m135f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5219c, 0, 0);
        this.f202p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f204r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f203q = -1;
        setSaveEnabled(false);
    }

    @Override // p000.InterfaceC0395k1
    /* JADX INFO: renamed from: a */
    public final boolean mo132a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC0395k1
    /* JADX INFO: renamed from: b */
    public final boolean mo133b() {
        return !TextUtils.isEmpty(getText()) && this.f194h.getIcon() == null;
    }

    @Override // p000.InterfaceC0201ev
    /* JADX INFO: renamed from: c */
    public final void mo134c(C0572ou c0572ou) {
        this.f194h = c0572ou;
        setIcon(c0572ou.getIcon());
        setTitle(c0572ou.getTitleCondensed());
        setId(c0572ou.f3586a);
        setVisibility(c0572ou.isVisible() ? 0 : 8);
        setEnabled(c0572ou.isEnabled());
        if (c0572ou.hasSubMenu() && this.f198l == null) {
            this.f198l = new C0135d1(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m135f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m136g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f195i);
        if (this.f196j != null && ((this.f194h.f3610y & 4) != 4 || (!this.f200n && !this.f201o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f195i : null);
        CharSequence charSequence = this.f194h.f3602q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f194h.f3590e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f194h.f3603r;
        if (TextUtils.isEmpty(charSequence2)) {
            l70.m1753a(this, z3 ? null : this.f194h.f3590e);
        } else {
            l70.m1753a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.InterfaceC0201ev
    public C0572ou getItemData() {
        return this.f194h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0387ju interfaceC0387ju = this.f197k;
        if (interfaceC0387ju != null) {
            interfaceC0387ju.mo137a(this.f194h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f200n = m135f();
        m136g();
    }

    @Override // p000.C0249g5, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f203q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f202p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f196j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f196j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0135d1 c0135d1;
        if (this.f194h.hasSubMenu() && (c0135d1 = this.f198l) != null && c0135d1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f201o != z) {
            this.f201o = z;
            C0572ou c0572ou = this.f194h;
            if (c0572ou != null) {
                MenuC0424ku menuC0424ku = c0572ou.f3599n;
                menuC0424ku.f2960k = true;
                menuC0424ku.m1723p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f196j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f204r;
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
        m136g();
    }

    public void setItemInvoker(InterfaceC0387ju interfaceC0387ju) {
        this.f197k = interfaceC0387ju;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f203q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0171e1 abstractC0171e1) {
        this.f199m = abstractC0171e1;
    }

    public void setTitle(CharSequence charSequence) {
        this.f195i = charSequence;
        m136g();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
