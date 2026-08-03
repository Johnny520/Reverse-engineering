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
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.InterfaceC1003k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C1038a;
import p000a.AbstractViewOnTouchListenerC0386V6;
import p000a.C0794r1;
import p000a.C0922xf;
import p000a.InterfaceC0541de;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0794r1 implements InterfaceC1003k.a, View.OnClickListener, ActionMenuView.InterfaceC1013a {

    /* JADX INFO: renamed from: g */
    public C1000h f3693g;

    /* JADX INFO: renamed from: h */
    public CharSequence f3694h;

    /* JADX INFO: renamed from: i */
    public Drawable f3695i;

    /* JADX INFO: renamed from: j */
    public C0998f.b f3696j;

    /* JADX INFO: renamed from: k */
    public C0991a f3697k;

    /* JADX INFO: renamed from: l */
    public AbstractC0992b f3698l;

    /* JADX INFO: renamed from: m */
    public boolean f3699m;

    /* JADX INFO: renamed from: n */
    public boolean f3700n;

    /* JADX INFO: renamed from: o */
    public final int f3701o;

    /* JADX INFO: renamed from: p */
    public int f3702p;

    /* JADX INFO: renamed from: q */
    public final int f3703q;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0991a extends AbstractViewOnTouchListenerC0386V6 {
        public C0991a() {
            super(ActionMenuItemView.this);
        }

        @Override // p000a.AbstractViewOnTouchListenerC0386V6
        /* JADX INFO: renamed from: b */
        public final InterfaceC0541de mo1016b() {
            C1038a.a aVar;
            AbstractC0992b abstractC0992b = ActionMenuItemView.this.f3698l;
            if (abstractC0992b == null || (aVar = C1038a.this.f4096t) == null) {
                return null;
            }
            return aVar.m2343a();
        }

        @Override // p000a.AbstractViewOnTouchListenerC0386V6
        /* JADX INFO: renamed from: c */
        public final boolean mo1017c() {
            InterfaceC0541de interfaceC0541deMo1016b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0998f.b bVar = actionMenuItemView.f3696j;
            return bVar != null && bVar.mo2304a(actionMenuItemView.f3693g) && (interfaceC0541deMo1016b = mo1016b()) != null && interfaceC0541deMo1016b.mo276b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0992b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3699m = m2302h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0983R.styleable.ActionMenuItemView, 0, 0);
        this.f3701o = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0983R.styleable.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3703q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3702p = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1013a
    /* JADX INFO: renamed from: a */
    public final boolean mo2299a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k.a
    /* JADX INFO: renamed from: b */
    public final void mo2300b(C1000h c1000h) {
        this.f3693g = c1000h;
        setIcon(c1000h.getIcon());
        setTitle(c1000h.getTitleCondensed());
        setId(c1000h.f3814a);
        setVisibility(c1000h.isVisible() ? 0 : 8);
        setEnabled(c1000h.isEnabled());
        if (c1000h.hasSubMenu() && this.f3697k == null) {
            this.f3697k = new C0991a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1013a
    /* JADX INFO: renamed from: c */
    public final boolean mo2301c() {
        return !TextUtils.isEmpty(getText()) && this.f3693g.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k.a
    public C1000h getItemData() {
        return this.f3693g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2302h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2303i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f3694h);
        if (this.f3695i != null && ((this.f3693g.f3838y & 4) != 4 || (!this.f3699m && !this.f3700n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f3694h : null);
        CharSequence charSequence = this.f3693g.f3830q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f3693g.f3818e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3693g.f3831r;
        if (TextUtils.isEmpty(charSequence2)) {
            C0922xf.m2208a(this, z3 ? null : this.f3693g.f3818e);
        } else {
            C0922xf.m2208a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0998f.b bVar = this.f3696j;
        if (bVar != null) {
            bVar.mo2304a(this.f3693g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3699m = m2302h();
        m2303i();
    }

    @Override // p000a.C0794r1, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f3702p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f3701o;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f3695i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3695i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0991a c0991a;
        if (this.f3693g.hasSubMenu() && (c0991a = this.f3697k) != null && c0991a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f3700n != z) {
            this.f3700n = z;
            C1000h c1000h = this.f3693g;
            if (c1000h != null) {
                C0998f c0998f = c1000h.f3827n;
                c0998f.f3794k = true;
                c0998f.m2331p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3695i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f3703q;
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
        m2303i();
    }

    public void setItemInvoker(C0998f.b bVar) {
        this.f3696j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f3702p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0992b abstractC0992b) {
        this.f3698l = abstractC0992b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3694h = charSequence;
        m2303i();
    }
}
