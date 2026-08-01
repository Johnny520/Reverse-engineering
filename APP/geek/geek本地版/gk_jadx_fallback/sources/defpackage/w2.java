package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class w2 extends android.widget.Button {
    public final defpackage.v2 a;
    public final defpackage.d5 b;
    public defpackage.x3 c;

    public w2(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.x60.a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            defpackage.r60.a(r0, r1)
            v2 r1 = new v2
            r1.<init>(r0)
            r0.a = r1
            r1.d(r2, r3)
            d5 r1 = new d5
            r1.<init>(r0)
            r0.b = r1
            r1.f(r2, r3)
            r1.b()
            x3 r1 = r0.getEmojiTextViewHelper()
            r1.a(r2, r3)
            return
    }

    private defpackage.x3 getEmojiTextViewHelper() {
            r1 = this;
            x3 r0 = r1.c
            if (r0 != 0) goto Lb
            x3 r0 = new x3
            r0.<init>(r1)
            r1.c = r0
        Lb:
            x3 r0 = r1.c
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.a()
        La:
            d5 r0 = r1.b
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
        L9:
            d5 r0 = r1.b
            if (r0 == 0) goto L16
            n5 r0 = r0.i
            float r0 = r0.e
            int r0 = java.lang.Math.round(r0)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMinTextSize()
            return r0
        L9:
            d5 r0 = r1.b
            if (r0 == 0) goto L16
            n5 r0 = r0.i
            float r0 = r0.d
            int r0 = java.lang.Math.round(r0)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeStepGranularity()
            return r0
        L9:
            d5 r0 = r1.b
            if (r0 == 0) goto L16
            n5 r0 = r0.i
            float r0 = r0.c
            int r0 = java.lang.Math.round(r0)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L9
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
        L9:
            d5 r0 = r1.b
            if (r0 == 0) goto L12
            n5 r0 = r0.i
            int[] r0 = r0.f
            return r0
        L12:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = defpackage.cb0.b
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = super.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto Ld
            return r2
        Ld:
            return r1
        Le:
            d5 r0 = r3.b
            if (r0 == 0) goto L17
            n5 r0 = r0.i
            int r0 = r0.a
            return r0
        L17:
            return r1
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r2 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            boolean r1 = r0 instanceof defpackage.o60
            if (r1 == 0) goto Lc
            o60 r0 = (defpackage.o60) r0
            android.view.ActionMode$Callback r0 = r0.a
        Lc:
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            d5 r0 = r1.b
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            d5 r0 = r1.b
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            d5 r2 = r1.b
            if (r2 == 0) goto L11
            boolean r3 = defpackage.cb0.b
            if (r3 != 0) goto L11
            n5 r2 = r2.i
            r2.a()
        L11:
            return
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto L16
            n5 r1 = r1.i
            boolean r2 = defpackage.cb0.b
            if (r2 != 0) goto L16
            boolean r2 = r1.f()
            if (r2 == 0) goto L16
            r1.a()
        L16:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            x3 r0 = r1.getEmojiTextViewHelper()
            r0.b(r2)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
        L8:
            d5 r0 = r1.b
            if (r0 == 0) goto Lf
            r0.i(r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
        L8:
            d5 r0 = r1.b
            if (r0 == 0) goto Lf
            r0.j(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeWithDefaults(r2)
            return
        L8:
            d5 r0 = r1.b
            if (r0 == 0) goto Lf
            r0.k(r2)
        Lf:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            v2 r1 = r0.a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = defpackage.zt.S(r1, r0)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            x3 r0 = r1.getEmojiTextViewHelper()
            r0.c(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            x3 r0 = r1.getEmojiTextViewHelper()
            l0 r0 = r0.b
            java.lang.Object r0 = r0.b
            a80 r0 = (defpackage.a80) r0
            android.text.InputFilter[] r2 = r0.l(r2)
            super.setFilters(r2)
            return
    }

    public void setSupportAllCaps(boolean r2) {
            r1 = this;
            d5 r0 = r1.b
            if (r0 == 0) goto L9
            android.widget.TextView r0 = r0.a
            r0.setAllCaps(r2)
        L9:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            d5 r0 = r1.b
            r0.l(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            d5 r0 = r1.b
            r0.m(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            d5 r0 = r1.b
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
            r2 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L8
            super.setTextSize(r3, r4)
            return
        L8:
            d5 r1 = r2.b
            if (r1 == 0) goto L19
            n5 r1 = r1.i
            if (r0 != 0) goto L19
            boolean r0 = r1.f()
            if (r0 != 0) goto L19
            r1.g(r3, r4)
        L19:
            return
    }
}
