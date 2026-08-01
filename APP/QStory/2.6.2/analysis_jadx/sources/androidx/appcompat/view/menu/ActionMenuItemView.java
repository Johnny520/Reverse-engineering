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
import p188.AbstractC7772;
import p190.AbstractC7782;
import p190.C7799;
import p190.InterfaceC7786;
import p190.InterfaceC7800;
import p190.MenuC7801;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0225 implements InterfaceC7786, View.OnClickListener, InterfaceC0201 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f359;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f360;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC7782 f361;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C0205 f362;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public InterfaceC7800 f363;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Drawable f364;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f365;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f366;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int f367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C7799 f368;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CharSequence f369;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f360 = m457();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7772.f21090, 0, 0);
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

    @Override // p190.InterfaceC7786
    public C7799 getItemData() {
        return this.f368;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC7800 interfaceC7800 = this.f363;
        if (interfaceC7800 != null) {
            interfaceC7800.mo458(this.f368);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f360 = m457();
        m456();
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
            C7799 c7799 = this.f368;
            if (c7799 != null) {
                MenuC7801 menuC7801 = c7799.f21228;
                menuC7801.f21256 = true;
                menuC7801.m13136(true);
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
        m456();
    }

    public void setItemInvoker(InterfaceC7800 interfaceC7800) {
        this.f363 = interfaceC7800;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f366 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC7782 abstractC7782) {
        this.f361 = abstractC7782;
    }

    public void setTitle(CharSequence charSequence) {
        this.f369 = charSequence;
        m456();
    }

    @Override // p190.InterfaceC7786
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo453(C7799 c7799) {
        this.f368 = c7799;
        setIcon(c7799.getIcon());
        setTitle(c7799.getTitleCondensed());
        setId(c7799.f21247);
        setVisibility(c7799.isVisible() ? 0 : 8);
        setEnabled(c7799.isEnabled());
        if (c7799.hasSubMenu() && this.f362 == null) {
            this.f362 = new C0205(this);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo454() {
        return !TextUtils.isEmpty(getText()) && this.f368.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0201
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo455() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m456() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f369);
        if (this.f364 != null && ((this.f368.f21225 & 4) != 4 || (!this.f360 && !this.f359))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f369 : null);
        CharSequence charSequence = this.f368.f21237;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f368.f21239);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f368.f21236;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0147.m600(this, z3 ? null : this.f368.f21239);
        } else {
            AbstractC0147.m600(this, charSequence2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m457() {
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
