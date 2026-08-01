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
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p068h.AbstractC0584c;
import p068h.C0583b;
import p068h.C0596o;
import p068h.InterfaceC0576A;
import p068h.InterfaceC0593l;
import p068h.MenuC0594m;
import p069i.C0669d0;
import p069i.InterfaceC0692l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0669d0 implements InterfaceC0576A, View.OnClickListener, InterfaceC0692l {

    /* JADX INFO: renamed from: h */
    public C0596o f915h;

    /* JADX INFO: renamed from: i */
    public CharSequence f916i;

    /* JADX INFO: renamed from: j */
    public Drawable f917j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0593l f918k;

    /* JADX INFO: renamed from: l */
    public C0583b f919l;

    /* JADX INFO: renamed from: m */
    public AbstractC0584c f920m;

    /* JADX INFO: renamed from: n */
    public boolean f921n;

    /* JADX INFO: renamed from: o */
    public boolean f922o;

    /* JADX INFO: renamed from: p */
    public final int f923p;

    /* JADX INFO: renamed from: q */
    public int f924q;

    /* JADX INFO: renamed from: r */
    public final int f925r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f921n = m646e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1639c, 0, 0);
        this.f923p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f925r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f924q = -1;
        setSaveEnabled(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0692l
    /* JADX INFO: renamed from: a */
    public final boolean mo643a() {
        return !TextUtils.isEmpty(getText()) && this.f915h.getIcon() == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0692l
    /* JADX INFO: renamed from: b */
    public final boolean mo644b() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0576A
    /* JADX INFO: renamed from: c */
    public final void mo645c(C0596o c0596o) {
        this.f915h = c0596o;
        setIcon(c0596o.getIcon());
        setTitle(c0596o.getTitleCondensed());
        setId(c0596o.f2060a);
        setVisibility(c0596o.isVisible() ? 0 : 8);
        setEnabled(c0596o.isEnabled());
        if (c0596o.hasSubMenu() && this.f919l == null) {
            this.f919l = new C0583b(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m646e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 480) {
            return (i2 >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m647f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f916i);
        if (this.f917j != null && ((this.f915h.f2084y & 4) != 4 || (!this.f921n && !this.f922o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f916i : null);
        CharSequence charSequence = this.f915h.f2076q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f915h.f2064e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f915h.f2077r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0503h.m976N(this, z4 ? null : this.f915h.f2064e);
        } else {
            AbstractC0503h.m976N(this, charSequence2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0576A
    public C0596o getItemData() {
        return this.f915h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0593l interfaceC0593l = this.f918k;
        if (interfaceC0593l != null) {
            interfaceC0593l.mo649d(this.f915h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f921n = m646e();
        m647f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.C0669d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i4 = this.f924q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f923p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f917j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f917j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0583b c0583b;
        if (this.f915h.hasSubMenu() && (c0583b = this.f919l) != null && c0583b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setExpandedFormat(boolean z2) {
        if (this.f922o != z2) {
            this.f922o = z2;
            C0596o c0596o = this.f915h;
            if (c0596o != null) {
                MenuC0594m menuC0594m = c0596o.f2073n;
                menuC0594m.f2040k = true;
                menuC0594m.m1189p(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(Drawable drawable) {
        this.f917j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f925r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m647f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemInvoker(InterfaceC0593l interfaceC0593l) {
        this.f918k = interfaceC0593l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f924q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPopupCallback(AbstractC0584c abstractC0584c) {
        this.f920m = abstractC0584c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        this.f916i = charSequence;
        m647f();
    }
}
