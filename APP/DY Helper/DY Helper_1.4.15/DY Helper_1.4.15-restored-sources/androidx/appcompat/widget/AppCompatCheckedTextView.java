package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends android.widget.CheckedTextView {

    /* JADX INFO: renamed from: ε */
    public final p000.C0711q4 f552;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0610o4 f553;

    /* JADX INFO: renamed from: η */
    public final p000.C0201d6 f554;

    /* JADX INFO: renamed from: θ */
    public p000.C0500l5 f555;

    public AppCompatCheckedTextView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968655(0x7f04004f, float:1.754597E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public AppCompatCheckedTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968655(0x7f04004f, float:1.754597E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatCheckedTextView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            p000.o42.m4207(r9)
            r8.<init>(r9, r10, r11)
            android.content.Context r9 = r8.getContext()
            p000.b42.m739(r8, r9)
            d6 r9 = new d6
            r9.<init>(r8)
            r8.f554 = r9
            r9.m1661(r10, r11)
            r9.m1658()
            o4 r9 = new o4
            r9.<init>(r8)
            r8.f553 = r9
            r9.m4197(r10, r11)
            q4 r9 = new q4
            r9.<init>(r8)
            r8.f552 = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = p000.kk1.f5979
            m6 r9 = p000.C0538m6.m3752(r9, r10, r2, r11)
            java.lang.Object r0 = r9.f6967
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f6967
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r0 = p000.b92.f1572
            r6 = 0
            r0 = r8
            r3 = r10
            r5 = r11
            p000.y82.m6840(r0, r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L66
            r11 = 0
            if (r10 == 0) goto L69
            int r8 = r7.getResourceId(r8, r11)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L69
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L69
            android.graphics.drawable.Drawable r8 = p000.ln0.m3603(r10, r8)     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L69
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L69
            goto L80
        L66:
            r0 = move-exception
            r8 = r0
            goto Lad
        L69:
            boolean r8 = r7.hasValue(r11)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L80
            int r8 = r7.getResourceId(r11, r11)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L80
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L66
            android.graphics.drawable.Drawable r8 = p000.ln0.m3603(r10, r8)     // Catch: java.lang.Throwable -> L66
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L66
        L80:
            r8 = 2
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L66
            if (r10 == 0) goto L8e
            android.content.res.ColorStateList r8 = r9.m3790(r8)     // Catch: java.lang.Throwable -> L66
            r0.setCheckMarkTintList(r8)     // Catch: java.lang.Throwable -> L66
        L8e:
            r8 = 3
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L66
            if (r10 == 0) goto La2
            r10 = -1
            int r8 = r7.getInt(r8, r10)     // Catch: java.lang.Throwable -> L66
            r10 = 0
            android.graphics.PorterDuff$Mode r8 = p000.AbstractC0300fw.m2207(r8, r10)     // Catch: java.lang.Throwable -> L66
            r0.setCheckMarkTintMode(r8)     // Catch: java.lang.Throwable -> L66
        La2:
            r9.m3765()
            l5 r8 = r0.getEmojiTextViewHelper()
            r8.m3497(r3, r5)
            return
        Lad:
            r9.m3765()
            throw r8
    }

    private p000.C0500l5 getEmojiTextViewHelper() {
            r1 = this;
            l5 r0 = r1.f555
            if (r0 != 0) goto Lb
            l5 r0 = new l5
            r0.<init>(r1)
            r1.f555 = r0
        Lb:
            l5 r1 = r1.f555
            return r1
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            d6 r0 = r1.f554
            if (r0 == 0) goto La
            r0.m1658()
        La:
            o4 r0 = r1.f553
            if (r0 == 0) goto L11
            r0.m4194()
        L11:
            q4 r1 = r1.f552
            if (r1 == 0) goto L18
            r1.m4762()
        L18:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            o4 r0 = r0.f553
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f553
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r0 = this;
            q4 r0 = r0.f552
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.f8850
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r0 = this;
            q4 r0 = r0.f552
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.f8851
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            d6 r0 = r0.f554
            android.content.res.ColorStateList r0 = r0.m1659()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            d6 r0 = r0.f554
            android.graphics.PorterDuff$Mode r0 = r0.m1660()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            p000.kn0.m3344(r2, r0, r1)
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3498(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f553
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f553
            if (r0 == 0) goto La
            r0.m4199(r1)
        La:
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setCheckMarkDrawable(r1)
            q4 r0 = r0.f552
            if (r0 == 0) goto L15
            boolean r1 = r0.f8854
            if (r1 == 0) goto Lf
            r1 = 0
            r0.f8854 = r1
            return
        Lf:
            r1 = 1
            r0.f8854 = r1
            r0.m4762()
        L15:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d6 r0 = r0.f554
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d6 r0 = r0.f554
            if (r0 == 0) goto La
            r0.m1658()
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

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f553
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f553
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            q4 r0 = r0.f552
            if (r0 == 0) goto Lc
            r0.f8850 = r1
            r1 = 1
            r0.f8852 = r1
            r0.m4762()
        Lc:
            return
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            q4 r0 = r0.f552
            if (r0 == 0) goto Lc
            r0.f8851 = r1
            r1 = 1
            r0.f8853 = r1
            r0.m4762()
        Lc:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            d6 r0 = r0.f554
            r0.m1663(r1)
            r0.m1658()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            d6 r0 = r0.f554
            r0.m1664(r1)
            r0.m1658()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            d6 r0 = r0.f554
            if (r0 == 0) goto La
            r0.m1662(r1, r2)
        La:
            return
    }
}
