package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class a4 extends android.widget.ImageView {
    public final defpackage.v2 a;
    public final defpackage.z3 b;
    public boolean c;

    public a4(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.x60.a(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.c = r1
            android.content.Context r1 = r0.getContext()
            defpackage.r60.a(r0, r1)
            v2 r1 = new v2
            r1.<init>(r0)
            r0.a = r1
            r1.d(r2, r3)
            z3 r1 = new z3
            r1.<init>(r0)
            r0.b = r1
            r1.d(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.a()
        La:
            z3 r0 = r1.b
            if (r0 == 0) goto L11
            r0.a()
        L11:
            return
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

    public android.content.res.ColorStateList getSupportImageTintList() {
            r2 = this;
            r0 = 0
            z3 r1 = r2.b
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r1.c
            y60 r1 = (defpackage.y60) r1
            if (r1 == 0) goto Ld
            android.content.res.ColorStateList r0 = r1.a
        Ld:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r2 = this;
            r0 = 0
            z3 r1 = r2.b
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r1.c
            y60 r1 = (defpackage.y60) r1
            if (r1 == 0) goto Ld
            android.graphics.PorterDuff$Mode r0 = r1.b
        Ld:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
            r1 = this;
            z3 r0 = r1.b
            java.lang.Object r0 = r0.b
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 != 0) goto L16
            boolean r0 = super.hasOverlappingRendering()
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
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

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            z3 r1 = r0.b
            if (r1 == 0) goto La
            r1.a()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            z3 r0 = r2.b
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            boolean r1 = r2.c
            if (r1 != 0) goto L10
            int r1 = r3.getLevel()
            r0.a = r1
        L10:
            super.setImageDrawable(r3)
            if (r0 == 0) goto L2f
            r0.a()
            boolean r3 = r2.c
            if (r3 != 0) goto L2f
            java.lang.Object r3 = r0.b
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r1 = r3.getDrawable()
            if (r1 == 0) goto L2f
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            int r0 = r0.a
            r3.setLevel(r0)
        L2f:
            return
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
            r0 = this;
            super.setImageLevel(r1)
            r1 = 1
            r0.c = r1
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r4) {
            r3 = this;
            z3 r0 = r3.b
            if (r0 == 0) goto L22
            java.lang.Object r1 = r0.b
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r4 == 0) goto L1b
            android.content.Context r2 = r1.getContext()
            android.graphics.drawable.Drawable r4 = defpackage.ff.r(r2, r4)
            if (r4 == 0) goto L17
            defpackage.eh.a(r4)
        L17:
            r1.setImageDrawable(r4)
            goto L1f
        L1b:
            r4 = 0
            r1.setImageDrawable(r4)
        L1f:
            r0.a()
        L22:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            z3 r1 = r0.b
            if (r1 == 0) goto La
            r1.a()
        La:
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

    public void setSupportImageTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            z3 r0 = r2.b
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r0.c
            y60 r1 = (defpackage.y60) r1
            if (r1 != 0) goto L11
            y60 r1 = new y60
            r1.<init>()
            r0.c = r1
        L11:
            java.lang.Object r1 = r0.c
            y60 r1 = (defpackage.y60) r1
            r1.a = r3
            r3 = 1
            r1.d = r3
            r0.a()
        L1d:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            z3 r0 = r2.b
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r0.c
            y60 r1 = (defpackage.y60) r1
            if (r1 != 0) goto L11
            y60 r1 = new y60
            r1.<init>()
            r0.c = r1
        L11:
            java.lang.Object r1 = r0.c
            y60 r1 = (defpackage.y60) r1
            r1.b = r3
            r3 = 1
            r1.c = r3
            r0.a()
        L1d:
            return
    }
}
