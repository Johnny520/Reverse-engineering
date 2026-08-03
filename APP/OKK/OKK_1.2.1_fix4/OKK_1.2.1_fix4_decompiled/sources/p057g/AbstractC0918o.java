package p057g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p017J.ActionModeCallbackC0229r;

/* JADX INFO: renamed from: g.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0918o extends Button {

    /* JADX INFO: renamed from: a */
    public final C0916n f3246a;

    /* JADX INFO: renamed from: b */
    public final C0860G f3247b;

    /* JADX INFO: renamed from: c */
    public C0932v f3248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0918o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.materialButtonStyle);
        AbstractC0851B0.m2165a(context);
        AbstractC0849A0.m2159a(this, getContext());
        C0916n c0916n = new C0916n(this);
        this.f3246a = c0916n;
        c0916n.m2243d(attributeSet, C1031R.attr.materialButtonStyle);
        C0860G c0860g = new C0860G(this);
        this.f3247b = c0860g;
        c0860g.m2177d(attributeSet, C1031R.attr.materialButtonStyle);
        c0860g.m2176b();
        getEmojiTextViewHelper().m2262a(attributeSet, C1031R.attr.materialButtonStyle);
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f3248c == null) {
            this.f3248c = new C0932v(this);
        }
        return this.f3248c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n c0916n = this.f3246a;
        if (c0916n != null) {
            c0916n.m2240a();
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            return Math.round(c0860g.f3099i.f3142e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeMinTextSize();
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            return Math.round(c0860g.f3099i.f3141d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeStepGranularity();
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            return Math.round(c0860g.f3099i.f3140c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0860G c0860g = this.f3247b;
        return c0860g != null ? c0860g.f3099i.f3143f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            return c0860g.f3099i.f3138a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC0229r ? ((ActionModeCallbackC0229r) customSelectionActionModeCallback).f465a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n c0916n = this.f3246a;
        if (c0916n != null) {
            return c0916n.m2241b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n c0916n = this.f3246a;
        if (c0916n != null) {
            return c0916n.m2242c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 c0853c0 = this.f3247b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3084a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 c0853c0 = this.f3247b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3085b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0860G c0860g = this.f3247b;
        if (c0860g == null || AbstractC0881Q0.f3149a) {
            return;
        }
        c0860g.f3099i.m2203a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0860G c0860g = this.f3247b;
        if (c0860g == null || AbstractC0881Q0.f3149a) {
            return;
        }
        C0878P c0878p = c0860g.f3099i;
        if (c0878p.m2205f()) {
            c0878p.m2203a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (AbstractC0881Q0.f3149a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            c0860g.m2179g(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (AbstractC0881Q0.f3149a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            c0860g.m2180h(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AbstractC0881Q0.f3149a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            c0860g.m2181i(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0916n c0916n = this.f3246a;
        if (c0916n != null) {
            c0916n.m2244e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0916n c0916n = this.f3246a;
        if (c0916n != null) {
            c0916n.m2245f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            c0860g.f3091a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0916n c0916n = this.f3246a;
        if (c0916n != null) {
            c0916n.m2247h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0916n c0916n = this.f3246a;
        if (c0916n != null) {
            c0916n.m2248i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0860G c0860g = this.f3247b;
        c0860g.m2182j(colorStateList);
        c0860g.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0860G c0860g = this.f3247b;
        c0860g.m2183k(mode);
        c0860g.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0860G c0860g = this.f3247b;
        if (c0860g != null) {
            c0860g.m2178e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = AbstractC0881Q0.f3149a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0860G c0860g = this.f3247b;
        if (c0860g == null || z2) {
            return;
        }
        C0878P c0878p = c0860g.f3099i;
        if (c0878p.m2205f()) {
            return;
        }
        c0878p.m2206g(i2, f2);
    }
}
