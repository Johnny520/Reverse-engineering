package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1088 extends android.widget.Button {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C2355 f4880;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1181 f4881;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0866 f4882;

    public C1088(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.AbstractC0322.m994(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            defpackage.AbstractC2218.m3609(r1, r0)
            ᛵᛴᛴᛳ r1 = new ᛵᛴᛴᛳ
            r1.<init>(r0)
            r0.f4882 = r1
            r1.m1824(r2, r3)
            ᛶᲈᛳᛵ r1 = new ᛶᲈᛳᛵ
            r1.<init>(r0)
            r0.f4881 = r1
            r1.m2310(r2, r3)
            r1.m2309()
            ᲈᲇᲀᛲ r0 = r0.getEmojiTextViewHelper()
            r0.m3854(r2, r3)
            return
    }

    private defpackage.C2355 getEmojiTextViewHelper() {
            r1 = this;
            ᲈᲇᲀᛲ r0 = r1.f4880
            if (r0 != 0) goto Lb
            ᲈᲇᲀᛲ r0 = new ᲈᲇᲀᛲ
            r0.<init>(r1)
            r1.f4880 = r0
        Lb:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r1.f4882
            if (r0 == 0) goto La
            r0.m1836()
        La:
            ᛶᲈᛳᛵ r1 = r1.f4881
            if (r1 == 0) goto L11
            r1.m2309()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            int r1 = super.getAutoSizeMaxTextSize()
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            int r1 = super.getAutoSizeMinTextSize()
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            int r1 = super.getAutoSizeStepGranularity()
            return r1
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            int[] r1 = super.getAutoSizeTextAvailableSizes()
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            int r1 = super.getAutoSizeTextType()
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4882
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4882
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4881
            android.content.res.ColorStateList r0 = r0.m2306()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4881
            android.graphics.PorterDuff$Mode r0 = r0.m2305()
            return r0
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            ᛶᲈᛳᛵ r0 = r0.f4881
            if (r0 == 0) goto Lc
            r0.getClass()
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
        Lc:
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f4881
            if (r0 == 0) goto L9
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
        L9:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            ᲈᲇᲀᛲ r0 = r0.getEmojiTextViewHelper()
            r0.m3855(r1)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            super.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            ᛵᛴᛴᛳ r0 = r0.f4882
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f4882
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            ᲈᲇᲀᛲ r0 = r0.getEmojiTextViewHelper()
            r0.m3853(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            ᲈᲇᲀᛲ r0 = r1.getEmojiTextViewHelper()
            ᛸᲈᛸᲈ r0 = r0.f10166
            java.lang.Object r0 = r0.f7101
            ᲈᛷᛲ r0 = (defpackage.AbstractC2279) r0
            android.text.InputFilter[] r2 = r0.mo392(r2)
            super.setFilters(r2)
            return
    }

    public void setSupportAllCaps(boolean r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4881
            if (r0 == 0) goto L9
            android.widget.TextView r0 = r0.f5365
            r0.setAllCaps(r1)
        L9:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4882
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4882
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4881
            r0.m2303(r1)
            r0.m2309()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4881
            r0.m2304(r1)
            r0.m2309()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ᛶᲈᛳᛵ r0 = r0.f4881
            if (r0 == 0) goto La
            r0.m2311(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r2, float r3) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            super.setTextSize(r2, r3)
            return
    }
}
