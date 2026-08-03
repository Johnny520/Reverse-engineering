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

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1069n = m1114h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0550a.f1618c, 0, 0);
        this.f1071p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1073r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1072q = -1;
        setSaveEnabled(false);
    }

    @Override // p057g.InterfaceC0908j
    /* JADX INFO: renamed from: a */
    public final boolean mo1111a() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f1063h.getIcon() == null;
    }

    @Override // p057g.InterfaceC0908j
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p055f.InterfaceC0786q
    /* JADX INFO: renamed from: c */
    public final void mo1113c(MenuItemC0780k menuItemC0780k) {
        this.f1063h = menuItemC0780k;
        setIcon(menuItemC0780k.getIcon());
        setTitle(menuItemC0780k.getTitleCondensed());
        setId(menuItemC0780k.f2807a);
        setVisibility(menuItemC0780k.isVisible() ? 0 : 8);
        setEnabled(menuItemC0780k.isEnabled());
        if (menuItemC0780k.hasSubMenu() && this.f1067l == null) {
            this.f1067l = new ViewOnTouchListenerC0770a(this);
        }
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
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX INFO: renamed from: i */
    public final void m1115i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1064i);
        if (this.f1065j != null && ((this.f1063h.f2831y & 4) != 4 || (!this.f1069n && !this.f1070o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1064i : null);
        CharSequence charSequence = this.f1063h.f2823q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1063h.f2811e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1063h.f2824r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0875N0.m2199a(this, z4 ? null : this.f1063h.f2811e);
        } else {
            AbstractC0875N0.m2199a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0778i interfaceC0778i = this.f1066k;
        if (interfaceC0778i != null) {
            interfaceC0778i.mo1116a(this.f1063h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1069n = m1114h();
        m1115i();
    }

    @Override // p057g.C0868K, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2 = !TextUtils.isEmpty(getText());
        if (z2 && (i4 = this.f1072q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1071p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (z2 || this.f1065j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1065j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0770a viewOnTouchListenerC0770a;
        if (this.f1063h.hasSubMenu() && (viewOnTouchListenerC0770a = this.f1067l) != null && viewOnTouchListenerC0770a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1070o != z2) {
            this.f1070o = z2;
            MenuItemC0780k menuItemC0780k = this.f1063h;
            if (menuItemC0780k != null) {
                MenuC0779j menuC0779j = menuItemC0780k.f2820n;
                menuC0779j.f2795k = true;
                menuC0779j.m2009o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1065j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f1073r;
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
        m1115i();
    }

    public void setItemInvoker(InterfaceC0778i interfaceC0778i) {
        this.f1066k = interfaceC0778i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f1072q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0771b abstractC0771b) {
        this.f1068m = abstractC0771b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1064i = charSequence;
        m1115i();
    }
}
