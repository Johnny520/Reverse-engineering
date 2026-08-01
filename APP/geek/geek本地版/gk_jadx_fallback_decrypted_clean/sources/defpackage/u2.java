package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class u2 extends android.widget.AutoCompleteTextView {
    public static final int[] d = null;
    public final defpackage.v2 a;
    public final defpackage.d5 b;
    public final defpackage.d4 c;

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            defpackage.u2.d = r0
            return
    }

    public u2(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            defpackage.x60.a(r5)
            r0 = 2130968634(0x7f04003a, float:1.7545927E38)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.r60.a(r4, r5)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.u2.d
            r5 r5 = defpackage.r5.y(r5, r6, r1, r0)
            java.lang.Object r1 = r5.b
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 0
            boolean r1 = r1.hasValue(r2)
            if (r1 == 0) goto L2c
            android.graphics.drawable.Drawable r1 = r5.m(r2)
            r4.setDropDownBackgroundDrawable(r1)
        L2c:
            r5.z()
            v2 r5 = new v2
            r5.<init>(r4)
            r4.a = r5
            r5.d(r6, r0)
            d5 r5 = new d5
            r5.<init>(r4)
            r4.b = r5
            r5.f(r6, r0)
            r5.b()
            d4 r5 = new d4
            r1 = 3
            r5.<init>(r4, r1)
            r4.c = r5
            r5.z(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L7f
            boolean r0 = super.isFocusable()
            boolean r1 = super.isClickable()
            boolean r2 = super.isLongClickable()
            int r3 = super.getInputType()
            android.text.method.KeyListener r5 = r5.u(r6)
            if (r5 != r6) goto L70
            goto L7f
        L70:
            super.setKeyListener(r5)
            super.setRawInputType(r3)
            super.setFocusable(r0)
            super.setClickable(r1)
            super.setLongClickable(r2)
        L7f:
            return
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

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            defpackage.a80.v(r3, r0, r2)
            d4 r1 = r2.c
            ji r3 = r1.C(r0, r3)
            return r3
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
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            d4 r0 = r1.c
            r0.K(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            d4 r0 = r1.c
            android.text.method.KeyListener r2 = r0.u(r2)
            super.setKeyListener(r2)
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
}
