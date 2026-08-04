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
import yyds.AbstractC0146;
import yyds.AbstractC1592;
import yyds.AbstractC2290;
import yyds.C0580;
import yyds.C1148;
import yyds.C2412;
import yyds.InterfaceC1200;
import yyds.InterfaceC1632;
import yyds.InterfaceC2468;
import yyds.MenuC0836;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0580 implements InterfaceC2468, View.OnClickListener, InterfaceC1200 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public AbstractC2290 f46;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C2412 f47;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C1148 f48;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f49;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f50;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final int f51;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Drawable f52;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public InterfaceC1632 f53;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public CharSequence f54;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final int f55;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f56;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f49 = m29();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8109, 0, 0);
        this.f51 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f55 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f50 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // yyds.InterfaceC2468
    public C1148 getItemData() {
        return this.f48;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1632 interfaceC1632 = this.f53;
        if (interfaceC1632 != null) {
            interfaceC1632.mo30(this.f48);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f49 = m29();
        m25();
    }

    @Override // yyds.C0580, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f50) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f51;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f52 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f52.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2412 c2412;
        if (this.f48.hasSubMenu() && (c2412 = this.f47) != null && c2412.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f56 != z) {
            this.f56 = z;
            C1148 c1148 = this.f48;
            if (c1148 != null) {
                MenuC0836 menuC0836 = c1148.f5276;
                menuC0836.f3824 = true;
                menuC0836.m1915(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f52 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f55;
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
        m25();
    }

    public void setItemInvoker(InterfaceC1632 interfaceC1632) {
        this.f53 = interfaceC1632;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f50 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC2290 abstractC2290) {
        this.f46 = abstractC2290;
    }

    public void setTitle(CharSequence charSequence) {
        this.f54 = charSequence;
        m25();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m25() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f54);
        if (this.f52 != null && ((this.f48.f5255 & 4) != 4 || (!this.f49 && !this.f56))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f54 : null);
        CharSequence charSequence = this.f48.f5274;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f48.f5265);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f48.f5259;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0146.m690(this, z3 ? null : this.f48.f5265);
        } else {
            AbstractC0146.m690(this, charSequence2);
        }
    }

    @Override // yyds.InterfaceC2468
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo26(C1148 c1148) {
        this.f48 = c1148;
        setIcon(c1148.getIcon());
        setTitle(c1148.getTitleCondensed());
        setId(c1148.f5275);
        setVisibility(c1148.isVisible() ? 0 : 8);
        setEnabled(c1148.isEnabled());
        if (c1148.hasSubMenu() && this.f47 == null) {
            this.f47 = new C2412(this);
        }
    }

    @Override // yyds.InterfaceC1200
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean mo27() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // yyds.InterfaceC1200
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean mo28() {
        return !TextUtils.isEmpty(getText()) && this.f48.getIcon() == null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean m29() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
