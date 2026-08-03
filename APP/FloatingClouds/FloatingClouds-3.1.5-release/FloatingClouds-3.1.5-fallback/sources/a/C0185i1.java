package a;

/* JADX INFO: renamed from: a.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0185i1 extends android.widget.RadioButton implements a.InterfaceC0324pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.M0 f505a;
    public final a.G0 b;
    public final a.C0310p1 c;
    public a.C0058b1 d;

    public C0185i1(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            a.C0252lf.a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            a.C0109df.a(r0, r1)
            a.M0 r1 = new a.M0
            r1.<init>(r0)
            r0.f505a = r1
            r1.b(r2, r3)
            a.G0 r1 = new a.G0
            r1.<init>(r0)
            r0.b = r1
            r1.d(r2, r3)
            a.p1 r1 = new a.p1
            r1.<init>(r0)
            r0.c = r1
            r1.f(r2, r3)
            a.b1 r1 = r0.getEmojiTextViewHelper()
            r1.b(r2, r3)
            return
    }

    private a.C0058b1 getEmojiTextViewHelper() {
            r1 = this;
            a.b1 r0 = r1.d
            if (r0 != 0) goto Lb
            a.b1 r0 = new a.b1
            r0.<init>(r1)
            r1.d = r0
        Lb:
            a.b1 r0 = r1.d
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            a.G0 r0 = r1.b
            if (r0 == 0) goto La
            r0.a()
        La:
            a.p1 r0 = r1.c
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // a.InterfaceC0324pf
    public android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            a.M0 r0 = r1.f505a
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            a.M0 r0 = r1.f505a
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.c
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            a.p1 r0 = r1.c
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            a.p1 r0 = r1.c
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            a.b1 r0 = r1.getEmojiTextViewHelper()
            r0.c(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            a.G0 r1 = r0.b
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            a.G0 r0 = r1.b
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setButtonDrawable(r2)
            a.M0 r2 = r1.f505a
            if (r2 == 0) goto L15
            boolean r0 = r2.f
            if (r0 == 0) goto Lf
            r0 = 0
            r2.f = r0
            return
        Lf:
            r0 = 1
            r2.f = r0
            r2.a()
        L15:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            a.p1 r1 = r0.c
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            a.p1 r1 = r0.c
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            a.b1 r0 = r1.getEmojiTextViewHelper()
            r0.d(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            a.b1 r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.a(r2)
            super.setFilters(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    @Override // a.InterfaceC0324pf
    public void setSupportButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.M0 r0 = r1.f505a
            if (r0 == 0) goto Lc
            r0.b = r2
            r2 = 1
            r0.d = r2
            r0.a()
        Lc:
            return
    }

    @Override // a.InterfaceC0324pf
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.M0 r0 = r1.f505a
            if (r0 == 0) goto Lc
            r0.c = r2
            r2 = 1
            r0.e = r2
            r0.a()
        Lc:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.p1 r0 = r1.c
            r0.i(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.p1 r0 = r1.c
            r0.j(r2)
            r0.b()
            return
    }
}
