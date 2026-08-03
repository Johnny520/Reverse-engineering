package androidx.appcompat.view.menu;

import Yue.AbstractViewOnTouchListenerC5066;
import Yue.C3343;
import Yue.C6898;
import Yue.C7939;
import Yue.InterfaceC7144;
import Yue.InterfaceC7462;
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
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends C3343 implements InterfaceC8700.InterfaceC1608, View.OnClickListener, ActionMenuView.InterfaceC1615 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f25926 = "ActionMenuItemView";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f25927 = 32;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8697 f25928;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public CharSequence f25929;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Drawable f25930;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C8694.InterfaceC1604 f25931;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC5066 f25932;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public AbstractC1599 f25933;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f25934;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f25935;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f25936;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f25937;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f25938;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$ۥ */
    public class C1598 extends AbstractViewOnTouchListenerC5066 {
        public C1598() {
            super(ActionMenuItemView.this);
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC7462 mo399() {
            AbstractC1599 abstractC1599 = ActionMenuItemView.this.f25933;
            if (abstractC1599 != null) {
                return abstractC1599.mo4637();
            }
            return null;
        }

        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo6795() {
            InterfaceC7462 interfaceC7462Mo399;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C8694.InterfaceC1604 interfaceC1604 = actionMenuItemView.f25931;
            return interfaceC1604 != null && interfaceC1604.mo4638(actionMenuItemView.f25928) && (interfaceC7462Mo399 = mo399()) != null && interfaceC7462Mo399.mo2407();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$ۥ۟ */
    public static abstract class AbstractC1599 {
        /* JADX INFO: renamed from: ۥ */
        public abstract InterfaceC7462 mo4637();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public C8697 getItemData() {
        return this.f25928;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void initialize(C8697 c8697, int i) {
        this.f25928 = c8697;
        setIcon(c8697.getIcon());
        setTitle(c8697.m29033(this));
        setId(c8697.getItemId());
        setVisibility(c8697.isVisible() ? 0 : 8);
        setEnabled(c8697.isEnabled());
        if (c8697.hasSubMenu() && this.f25932 == null) {
            this.f25932 = new C1598();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C8694.InterfaceC1604 interfaceC1604 = this.f25931;
        if (interfaceC1604 != null) {
            interfaceC1604.mo4638(this.f25928);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f25934 = m28990();
        m28991();
    }

    @Override // Yue.C3343, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zM28989 = m28989();
        if (zM28989 && (i3 = this.f25937) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f25936) : this.f25936;
        if (mode != 1073741824 && this.f25936 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM28989 || this.f25930 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f25930.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC5066 abstractViewOnTouchListenerC5066;
        if (this.f25928.hasSubMenu() && (abstractViewOnTouchListenerC5066 = this.f25932) != null && abstractViewOnTouchListenerC5066.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f25935 != z) {
            this.f25935 = z;
            C8697 c8697 = this.f25928;
            if (c8697 != null) {
                c8697.m29027();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setIcon(Drawable drawable) {
        this.f25930 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f25938;
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
        m28991();
    }

    public void setItemInvoker(C8694.InterfaceC1604 interfaceC1604) {
        this.f25931 = interfaceC1604;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f25937 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1599 abstractC1599) {
        this.f25933 = abstractC1599;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setShortcut(boolean z, char c) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setTitle(CharSequence charSequence) {
        this.f25929 = charSequence;
        m28991();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public boolean showsIcon() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1615
    /* JADX INFO: renamed from: ۥ */
    public boolean mo4635() {
        return m28989();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1615
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo4636() {
        return m28989() && this.f25928.getIcon() == null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m28989() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m28990() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m28991() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f25929);
        if (this.f25930 != null && (!this.f25928.m29052() || (!this.f25934 && !this.f25935))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f25929 : null);
        CharSequence contentDescription = this.f25928.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f25928.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f25928.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C7939.m3953(this, z3 ? null : this.f25928.getTitle());
        } else {
            C7939.m3953(this, tooltipText);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f25934 = m28990();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19397, i, 0);
        this.f25936 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6898.C6909.f19398, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f25938 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f25937 = -1;
        setSaveEnabled(false);
    }
}
