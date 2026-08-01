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
import androidx.appcompat.widget.AbstractC0147;
import androidx.appcompat.widget.C0205;
import androidx.appcompat.widget.C0225;
import androidx.appcompat.widget.InterfaceC0201;
import p188.AbstractC7773;
import p190.AbstractC7783;
import p190.C7800;
import p190.InterfaceC7787;
import p190.InterfaceC7801;
import p190.MenuC7802;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0225 implements InterfaceC7787, View.OnClickListener, InterfaceC0201 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f359;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f360;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC7783 f361;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C0205 f362;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC7801 f363;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Drawable f364;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f365;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f366;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int f367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C7800 f368;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CharSequence f369;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f360 = m458();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7773.f21087, 0, 0);
        this.f367 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f365 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f366 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p190.InterfaceC7787
    public C7800 getItemData() {
        return this.f368;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC7801 interfaceC7801 = this.f363;
        if (interfaceC7801 != null) {
            interfaceC7801.mo459(this.f368);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f360 = m458();
        m457();
    }

    @Override // androidx.appcompat.widget.C0225, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f366) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f367;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f364 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f364.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0205 c0205;
        if (this.f368.hasSubMenu() && (c0205 = this.f362) != null && c0205.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f359 != z) {
            this.f359 = z;
            C7800 c7800 = this.f368;
            if (c7800 != null) {
                MenuC7802 menuC7802 = c7800.f21225;
                menuC7802.f21253 = true;
                menuC7802.m13164(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f364 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f365;
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
        m457();
    }

    public void setItemInvoker(InterfaceC7801 interfaceC7801) {
        this.f363 = interfaceC7801;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f366 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC7783 abstractC7783) {
        this.f361 = abstractC7783;
    }

    public void setTitle(CharSequence charSequence) {
        this.f369 = charSequence;
        m457();
    }

    @Override // p190.InterfaceC7787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo454(C7800 c7800) {
        this.f368 = c7800;
        setIcon(c7800.getIcon());
        setTitle(c7800.getTitleCondensed());
        setId(c7800.f21244);
        setVisibility(c7800.isVisible() ? 0 : 8);
        setEnabled(c7800.isEnabled());
        if (c7800.hasSubMenu() && this.f362 == null) {
            this.f362 = new C0205(this);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo455() {
        return !TextUtils.isEmpty(getText()) && this.f368.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo456() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m457() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f369);
        if (this.f364 != null && ((this.f368.f21222 & 4) != 4 || (!this.f360 && !this.f359))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f369 : null);
        CharSequence charSequence = this.f368.f21234;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f368.f21236);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f368.f21233;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0147.m601(this, z3 ? null : this.f368.f21236);
        } else {
            AbstractC0147.m601(this, charSequence2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m458() {
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
