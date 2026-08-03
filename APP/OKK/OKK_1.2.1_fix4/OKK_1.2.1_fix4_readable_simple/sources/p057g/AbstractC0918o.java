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

    public AbstractC0918o(Context r2, AttributeSet r3) {
        AbstractC0851B0.m2165a(r2);
        super(r2, r3, C1031R.attr.materialButtonStyle);
        AbstractC0849A0.m2159a(this, getContext());
        C0916n r22 = new C0916n(this);
        this.f3246a = r22;
        r22.m2243d(r3, C1031R.attr.materialButtonStyle);
        C0860G r23 = new C0860G(this);
        this.f3247b = r23;
        r23.m2177d(r3, C1031R.attr.materialButtonStyle);
        r23.m2176b();
        getEmojiTextViewHelper().m2262a(r3, C1031R.attr.materialButtonStyle);
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f3248c != null) goto L6;
        this.f3248c = new C0932v(this);
    L6:
        return this.f3248c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n r02 = this.f3246a;
        if (r02 == null) goto L5;
        r02.m2240a();
    L5:
        C0860G r03 = this.f3247b;
        if (r03 == null) goto L9;
        r03.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3247b;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return Math.round(r02.f3099i.f3142e);
    L5:
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3247b;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return Math.round(r02.f3099i.f3141d);
    L5:
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3247b;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return Math.round(r02.f3099i.f3140c);
    L5:
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3247b;
        if (r02 == null) goto L11;
        return r02.f3099i.f3143f;
    L11:
        return new int[0];
    L5:
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3247b;
        if (r02 != null) goto L11;
        return 0;
    L11:
        return r02.f3099i.f3138a;
    L5:
        if (super.getAutoSizeTextType() == 1) goto L7;
        return 0;
    L7:
        return 1;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r02 = super.getCustomSelectionActionModeCallback();
        if ((r02 instanceof ActionModeCallbackC0229r) == true) goto L5;
        return r02;
    L5:
        return ((ActionModeCallbackC0229r) r02).f465a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n r02 = this.f3246a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2241b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n r02 = this.f3246a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2242c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 r02 = this.f3247b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3084a;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 r02 = this.f3247b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3085b;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        C0860G r12 = this.f3247b;
        if (r12 != null) goto L5;
        return;
    L5:
        if (AbstractC0881Q0.f3149a == true) goto L9;
        r12.f3099i.m2203a();
        return;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        C0860G r12 = this.f3247b;
        if (r12 != null) goto L5;
        return;
    L5:
        if (AbstractC0881Q0.f3149a == true) goto L11;
        C0878P r13 = r12.f3099i;
        if (r13.m2205f() == false) goto L12;
        r13.m2203a();
        return;
    L12:
        return;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(r2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
        if (AbstractC0881Q0.f3149a == false) goto L5;
        super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
        return;
    L5:
        C0860G r02 = this.f3247b;
        if (r02 == null) goto L10;
        r02.m2179g(r2, r3, r4, r5);
        return;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
        if (AbstractC0881Q0.f3149a == false) goto L5;
        super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
        return;
    L5:
        C0860G r02 = this.f3247b;
        if (r02 == null) goto L10;
        r02.m2180h(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        if (AbstractC0881Q0.f3149a == false) goto L5;
        super.setAutoSizeTextTypeWithDefaults(r2);
        return;
    L5:
        C0860G r02 = this.f3247b;
        if (r02 == null) goto L10;
        r02.m2181i(r2);
        return;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C0916n r12 = this.f3246a;
        if (r12 == null) goto L6;
        r12.m2244e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C0916n r02 = this.f3246a;
        if (r02 == null) goto L6;
        r02.m2245f(r2);
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(r2));
    }

    public void setSupportAllCaps(boolean r2) {
        C0860G r02 = this.f3247b;
        if (r02 == null) goto L6;
        r02.f3091a.setAllCaps(r2);
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C0916n r02 = this.f3246a;
        if (r02 == null) goto L6;
        r02.m2247h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C0916n r02 = this.f3246a;
        if (r02 == null) goto L6;
        r02.m2248i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C0860G r02 = this.f3247b;
        r02.m2182j(r2);
        r02.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C0860G r02 = this.f3247b;
        r02.m2183k(r2);
        r02.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C0860G r02 = this.f3247b;
        if (r02 == null) goto L6;
        r02.m2178e(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
        boolean r02 = AbstractC0881Q0.f3149a;
        if (r02 == false) goto L5;
        super.setTextSize(r3, r4);
        return;
    L5:
        C0860G r1 = this.f3247b;
        if (r1 == null) goto L13;
        if (r02 == true) goto L14;
        C0878P r03 = r1.f3099i;
        if (r03.m2205f() == true) goto L15;
        r03.m2206g(r3, r4);
        return;
    L15:
        return;
    L14:
        return;
    }
}
