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
import androidx.appcompat.widget.AbstractC0994;
import androidx.appcompat.widget.C1052;
import androidx.appcompat.widget.C1072;
import androidx.appcompat.widget.InterfaceC1048;
import p204.AbstractC8602;
import p206.AbstractC8612;
import p206.C8629;
import p206.InterfaceC8616;
import p206.InterfaceC8630;
import p206.MenuC8631;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C1072 implements InterfaceC8616, View.OnClickListener, InterfaceC1048 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f704;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f705;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC8612 f706;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C1052 f707;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC8630 f708;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Drawable f709;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f710;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f711;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int f712;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C8629 f713;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CharSequence f714;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f705 = m1018();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21432, 0, 0);
        this.f712 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f710 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f711 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p206.InterfaceC8616
    public C8629 getItemData() {
        return this.f713;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC8630 interfaceC8630 = this.f708;
        if (interfaceC8630 != null) {
            interfaceC8630.mo1019(this.f713);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f705 = m1018();
        m1017();
    }

    @Override // androidx.appcompat.widget.C1072, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f711) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f712;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f709 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f709.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1052 c1052;
        if (this.f713.hasSubMenu() && (c1052 = this.f707) != null && c1052.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f704 != z) {
            this.f704 = z;
            C8629 c8629 = this.f713;
            if (c8629 != null) {
                MenuC8631 menuC8631 = c8629.f21570;
                menuC8631.f21598 = true;
                menuC8631.m13723(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f709 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f710;
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
        m1017();
    }

    public void setItemInvoker(InterfaceC8630 interfaceC8630) {
        this.f708 = interfaceC8630;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f711 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC8612 abstractC8612) {
        this.f706 = abstractC8612;
    }

    public void setTitle(CharSequence charSequence) {
        this.f714 = charSequence;
        m1017();
    }

    @Override // p206.InterfaceC8616
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1014(C8629 c8629) {
        this.f713 = c8629;
        setIcon(c8629.getIcon());
        setTitle(c8629.getTitleCondensed());
        setId(c8629.f21589);
        setVisibility(c8629.isVisible() ? 0 : 8);
        setEnabled(c8629.isEnabled());
        if (c8629.hasSubMenu() && this.f707 == null) {
            this.f707 = new C1052(this);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1048
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo1015() {
        return !TextUtils.isEmpty(getText()) && this.f713.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.InterfaceC1048
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1016() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1017() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f714);
        if (this.f709 != null && ((this.f713.f21567 & 4) != 4 || (!this.f705 && !this.f704))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f714 : null);
        CharSequence charSequence = this.f713.f21579;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f713.f21581);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f713.f21578;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0994.m1161(this, z3 ? null : this.f713.f21581);
        } else {
            AbstractC0994.m1161(this, charSequence2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m1018() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
