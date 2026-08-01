package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public class w2 extends Button {
    public final v2 a;
    public final d5 b;
    public x3 c;

    public w2(Context r1, AttributeSet r2, int r3) {
        x60.a(r1);
        super(r1, r2, r3);
        r60.a(this, getContext());
        v2 r12 = new v2(this);
        this.a = r12;
        r12.d(r2, r3);
        d5 r13 = new d5(this);
        this.b = r13;
        r13.f(r2, r3);
        r13.b();
        getEmojiTextViewHelper().a(r2, r3);
    }

    private x3 getEmojiTextViewHelper() {
        if (this.c != null) goto L6;
        this.c = new x3(this);
    L6:
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v2 r0 = this.a;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        d5 r02 = this.b;
        if (r02 == null) goto L9;
        r02.b();
        return;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L9;
        return -1;
    L9:
        return Math.round(r0.i.e);
    L5:
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L9;
        return -1;
    L9:
        return Math.round(r0.i.d);
    L5:
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L9;
        return -1;
    L9:
        return Math.round(r0.i.c);
    L5:
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 == null) goto L11;
        return r0.i.f;
    L11:
        return new int[0];
    L5:
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L11;
        return 0;
    L11:
        return r0.i.a;
    L5:
        if (super.getAutoSizeTextType() != 1) goto L7;
        return 1;
    L7:
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r0 = super.getCustomSelectionActionModeCallback();
        if ((r0 instanceof o60) == true) goto L5;
        return r0;
    L5:
        return ((o60) r0).a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
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
        d5 r22 = this.b;
        if (r22 != null) goto L5;
        return;
    L5:
        if (cb0.b == true) goto L9;
        r22.i.a();
        return;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L10;
        n5 r13 = r12.i;
        if (cb0.b == false) goto L7;
        return;
    L7:
        if (r13.f() == false) goto L12;
        r13.a();
        return;
    L12:
        return;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().b(r2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
        if (cb0.b == false) goto L6;
        super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
        return;
    L6:
        d5 r0 = this.b;
        if (r0 == null) goto L10;
        r0.i(r2, r3, r4, r5);
        return;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
        if (cb0.b == false) goto L6;
        super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
        return;
    L6:
        d5 r0 = this.b;
        if (r0 == null) goto L10;
        r0.j(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        if (cb0.b == false) goto L6;
        super.setAutoSizeTextTypeWithDefaults(r2);
        return;
    L6:
        d5 r0 = this.b;
        if (r0 == null) goto L10;
        r0.k(r2);
        return;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        v2 r12 = this.a;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(zt.S(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().c(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((a80) getEmojiTextViewHelper().b.b).l(r2));
    }

    public void setSupportAllCaps(boolean r2) {
        d5 r0 = this.b;
        if (r0 == null) goto L6;
        r0.a.setAllCaps(r2);
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        d5 r0 = this.b;
        r0.l(r2);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        d5 r0 = this.b;
        r0.m(r2);
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        d5 r0 = this.b;
        if (r0 == null) goto L6;
        r0.g(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
        boolean r0 = cb0.b;
        if (r0 == false) goto L6;
        super.setTextSize(r3, r4);
        return;
    L6:
        d5 r1 = this.b;
        if (r1 == null) goto L14;
        n5 r12 = r1.i;
        if (r0 == false) goto L11;
        return;
    L11:
        if (r12.f() == true) goto L16;
        r12.g(r3, r4);
        return;
    L16:
        return;
    }
}
