package p000;

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

/* JADX INFO: renamed from: w2 */
/* JADX INFO: loaded from: classes.dex */
public class C0841w2 extends Button {

    /* JADX INFO: renamed from: a */
    public final C0803v2 f5031a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f5032b;

    /* JADX INFO: renamed from: c */
    public C0879x3 f5033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0841w2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d70.m881a(context);
        x60.m2635a(this, getContext());
        C0803v2 c0803v2 = new C0803v2(this);
        this.f5031a = c0803v2;
        c0803v2.m2536d(attributeSet, i);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f5032b = c0139d5;
        c0139d5.m873f(attributeSet, i);
        c0139d5.m870b();
        getEmojiTextViewHelper().m2629a(attributeSet, i);
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f5033c == null) {
            this.f5033c = new C0879x3(this);
        }
        return this.f5033c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f5031a;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (hb0.f2215b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1309i.f3228e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (hb0.f2215b) {
            return super.getAutoSizeMinTextSize();
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1309i.f3227d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (hb0.f2215b) {
            return super.getAutoSizeStepGranularity();
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1309i.f3226c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (hb0.f2215b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0139d5 c0139d5 = this.f5032b;
        return c0139d5 != null ? c0139d5.f1309i.f3229f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (hb0.f2215b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            return c0139d5.f1309i.f3224a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof u60 ? ((u60) customSelectionActionModeCallback).f4645a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f5031a;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f5031a;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5032b.m871d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5032b.m872e();
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 == null || hb0.f2215b) {
            return;
        }
        c0139d5.f1309i.m1919a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1309i;
            if (hb0.f2215b || !c0510n5.m1921f()) {
                return;
            }
            c0510n5.m1919a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2630b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (hb0.f2215b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            c0139d5.m875i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (hb0.f2215b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            c0139d5.m876j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (hb0.f2215b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            c0139d5.m877k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f5031a;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f5031a;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0274gu.m1308O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2631c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0493mp) getEmojiTextViewHelper().f5159b.f2886b).mo1878r(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            c0139d5.f1301a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f5031a;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f5031a;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f5032b;
        c0139d5.m878l(colorStateList);
        c0139d5.m870b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f5032b;
        c0139d5.m879m(mode);
        c0139d5.m870b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            c0139d5.m874g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = hb0.f2215b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0139d5 c0139d5 = this.f5032b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1309i;
            if (z || c0510n5.m1921f()) {
                return;
            }
            c0510n5.m1922g(i, f);
        }
    }
}
