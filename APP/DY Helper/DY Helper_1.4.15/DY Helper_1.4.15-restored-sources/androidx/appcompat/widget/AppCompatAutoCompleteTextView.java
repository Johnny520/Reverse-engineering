package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends android.widget.AutoCompleteTextView {

    /* JADX INFO: renamed from: θ */
    public static final int[] f541 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.C0610o4 f542;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0201d6 f543;

    /* JADX INFO: renamed from: η */
    public final p000.C0574n5 f544;

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.AppCompatAutoCompleteTextView.f541 = r0
            return
    }

    public AppCompatAutoCompleteTextView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968625(0x7f040031, float:1.7545909E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public AppCompatAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968625(0x7f040031, float:1.7545909E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatAutoCompleteTextView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            p000.o42.m4207(r4)
            r3.<init>(r4, r5, r6)
            android.content.Context r4 = r3.getContext()
            p000.b42.m739(r3, r4)
            android.content.Context r4 = r3.getContext()
            int[] r0 = androidx.appcompat.widget.AppCompatAutoCompleteTextView.f541
            m6 r4 = p000.C0538m6.m3752(r4, r5, r0, r6)
            java.lang.Object r0 = r4.f6967
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r4.m3754(r1)
            r3.setDropDownBackgroundDrawable(r0)
        L29:
            r4.m3765()
            o4 r4 = new o4
            r4.<init>(r3)
            r3.f542 = r4
            r4.m4197(r5, r6)
            d6 r4 = new d6
            r4.<init>(r3)
            r3.f543 = r4
            r4.m1661(r5, r6)
            r4.m1658()
            n5 r4 = new n5
            r0 = 4
            r4.<init>(r3, r0)
            r3.f544 = r4
            r4.mo3966(r5, r6)
            android.text.method.KeyListener r5 = r3.getKeyListener()
            boolean r6 = r5 instanceof android.text.method.NumberKeyListener
            if (r6 != 0) goto L7c
            boolean r6 = super.isFocusable()
            boolean r0 = super.isClickable()
            boolean r1 = super.isLongClickable()
            int r2 = super.getInputType()
            android.text.method.KeyListener r4 = r4.m3963(r5)
            if (r4 != r5) goto L6d
            goto L7c
        L6d:
            super.setKeyListener(r4)
            super.setRawInputType(r2)
            super.setFocusable(r6)
            super.setClickable(r0)
            super.setLongClickable(r1)
        L7c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            o4 r0 = r1.f542
            if (r0 == 0) goto La
            r0.m4194()
        La:
            d6 r1 = r1.f543
            if (r1 == 0) goto L11
            r1.m1658()
        L11:
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
            o4 r0 = r0.f542
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f542
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            d6 r0 = r0.f543
            android.content.res.ColorStateList r0 = r0.m1659()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            d6 r0 = r0.f543
            android.graphics.PorterDuff$Mode r0 = r0.m1660()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            p000.kn0.m3344(r2, r0, r1)
            n5 r1 = r1.f544
            py r1 = r1.m3968(r0, r2)
            return r1
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f542
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f542
            if (r0 == 0) goto La
            r0.m4199(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d6 r0 = r0.f543
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d6 r0 = r0.f543
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            n5 r0 = r0.f544
            r0.m3977(r1)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            n5 r0 = r1.f544
            android.text.method.KeyListener r2 = r0.m3963(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f542
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f542
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            d6 r0 = r0.f543
            r0.m1663(r1)
            r0.m1658()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            d6 r0 = r0.f543
            r0.m1664(r1)
            r0.m1658()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            d6 r0 = r0.f543
            if (r0 == 0) goto La
            r0.m1662(r1, r2)
        La:
            return
    }
}
