package a;

/* JADX INFO: loaded from: classes.dex */
public class F0 extends android.widget.AutoCompleteTextView {
    public static final int[] d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.G0 f78a;
    public final a.C0310p1 b;
    public final a.C0039a1 c;

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            a.F0.d = r0
            return
    }

    public F0(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public F0(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            a.C0252lf.a(r4)
            r3.<init>(r4, r5, r6)
            android.content.Context r4 = r3.getContext()
            a.C0109df.a(r3, r4)
            android.content.Context r4 = r3.getContext()
            int[] r0 = a.F0.d
            a.of r4 = a.C0306of.e(r4, r5, r0, r6)
            android.content.res.TypedArray r0 = r4.b
            r1 = 0
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L27
            android.graphics.drawable.Drawable r0 = r4.b(r1)
            r3.setDropDownBackgroundDrawable(r0)
        L27:
            r4.f()
            a.G0 r4 = new a.G0
            r4.<init>(r3)
            r3.f78a = r4
            r4.d(r5, r6)
            a.p1 r4 = new a.p1
            r4.<init>(r3)
            r3.b = r4
            r4.f(r5, r6)
            r4.b()
            a.a1 r4 = new a.a1
            r4.<init>(r3)
            r3.c = r4
            r4.b(r5, r6)
            android.text.method.KeyListener r5 = r3.getKeyListener()
            boolean r6 = r5 instanceof android.text.method.NumberKeyListener
            if (r6 != 0) goto L79
            boolean r6 = super.isFocusable()
            boolean r0 = super.isClickable()
            boolean r1 = super.isLongClickable()
            int r2 = super.getInputType()
            android.text.method.KeyListener r4 = r4.a(r5)
            if (r4 != r5) goto L6a
            goto L79
        L6a:
            super.setKeyListener(r4)
            super.setRawInputType(r2)
            super.setFocusable(r6)
            super.setClickable(r0)
            super.setLongClickable(r1)
        L79:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            a.G0 r0 = r1.f78a
            if (r0 == 0) goto La
            r0.a()
        La:
            a.p1 r0 = r1.b
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = a.Ze.b(r0)
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            a.G0 r0 = r1.f78a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            a.G0 r0 = r1.f78a
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            a.p1 r0 = r1.b
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            a.p1 r0 = r1.b
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            a.C0435w1.L(r3, r0, r2)
            a.a1 r1 = r2.c
            a.N5 r3 = r1.c(r0, r3)
            return r3
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            a.G0 r1 = r0.f78a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            a.G0 r0 = r1.f78a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            a.p1 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            a.p1 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
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
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            a.a1 r0 = r1.c
            r0.d(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            a.a1 r0 = r1.c
            android.text.method.KeyListener r2 = r0.a(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.G0 r0 = r1.f78a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.G0 r0 = r1.f78a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.p1 r0 = r1.b
            r0.i(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.p1 r0 = r1.b
            r0.j(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            a.p1 r0 = r1.b
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }
}
