package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends android.widget.Button {

    /* JADX INFO: renamed from: ε */
    public final p000.C0610o4 f545;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0201d6 f546;

    /* JADX INFO: renamed from: η */
    public p000.C0500l5 f547;

    public AppCompatButton(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968647(0x7f040047, float:1.7545954E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public AppCompatButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968647(0x7f040047, float:1.7545954E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            p000.o42.m4207(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            p000.b42.m739(r0, r1)
            o4 r1 = new o4
            r1.<init>(r0)
            r0.f545 = r1
            r1.m4197(r2, r3)
            d6 r1 = new d6
            r1.<init>(r0)
            r0.f546 = r1
            r1.m1661(r2, r3)
            r1.m1658()
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3497(r2, r3)
            return
    }

    private p000.C0500l5 getEmojiTextViewHelper() {
            r1 = this;
            l5 r0 = r1.f547
            if (r0 != 0) goto Lb
            l5 r0 = new l5
            r0.<init>(r1)
            r1.f547 = r0
        Lb:
            l5 r1 = r1.f547
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            o4 r0 = r1.f545
            if (r0 == 0) goto La
            r0.m4194()
        La:
            d6 r1 = r1.f546
            if (r1 == 0) goto L11
            r1.m1658()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r0 = this;
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r0 = this;
            int r0 = super.getAutoSizeMinTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r0 = this;
            int r0 = super.getAutoSizeStepGranularity()
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r0 = this;
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r1 = this;
            int r1 = super.getAutoSizeTextType()
            r0 = 1
            if (r1 != r0) goto L8
            return r0
        L8:
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
            o4 r0 = r0.f545
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f545
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            d6 r0 = r0.f546
            android.content.res.ColorStateList r0 = r0.m1659()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            d6 r0 = r0.f546
            android.graphics.PorterDuff$Mode r0 = r0.m1660()
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
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            d6 r0 = r0.f546
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3498(r1)
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r1) {
            r0 = this;
            super.setAutoSizeTextTypeWithDefaults(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f545
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f545
            if (r0 == 0) goto La
            r0.m4199(r1)
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
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3499(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            l5 r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.m3496(r2)
            super.setFilters(r2)
            return
    }

    public void setSupportAllCaps(boolean r1) {
            r0 = this;
            d6 r0 = r0.f546
            if (r0 == 0) goto L9
            android.widget.TextView r0 = r0.f2907
            r0.setAllCaps(r1)
        L9:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f545
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f545
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            d6 r0 = r0.f546
            r0.m1663(r1)
            r0.m1658()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            d6 r0 = r0.f546
            r0.m1664(r1)
            r0.m1658()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            d6 r0 = r0.f546
            if (r0 == 0) goto La
            r0.m1662(r1, r2)
        La:
            return
    }
}
