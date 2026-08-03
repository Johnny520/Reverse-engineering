package a;

/* JADX INFO: renamed from: a.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0113e1 extends android.widget.ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.G0 f446a;
    public final a.C0095d1 b;
    public boolean c;

    public C0113e1(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            a.C0252lf.a(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.c = r1
            android.content.Context r1 = r0.getContext()
            a.C0109df.a(r0, r1)
            a.G0 r1 = new a.G0
            r1.<init>(r0)
            r0.f446a = r1
            r1.d(r2, r3)
            a.d1 r1 = new a.d1
            r1.<init>(r0)
            r0.b = r1
            r1.b(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            a.G0 r0 = r1.f446a
            if (r0 == 0) goto La
            r0.a()
        La:
            a.d1 r0 = r1.b
            if (r0 == 0) goto L11
            r0.a()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            a.G0 r0 = r1.f446a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            a.G0 r0 = r1.f446a
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
            a.d1 r1 = r2.b
            if (r1 == 0) goto Lb
            a.mf r1 = r1.b
            if (r1 == 0) goto Lb
            android.content.res.ColorStateList r0 = r1.f580a
        Lb:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r2 = this;
            r0 = 0
            a.d1 r1 = r2.b
            if (r1 == 0) goto Lb
            a.mf r1 = r1.b
            if (r1 == 0) goto Lb
            android.graphics.PorterDuff$Mode r0 = r1.b
        Lb:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
            r1 = this;
            a.d1 r0 = r1.b
            android.widget.ImageView r0 = r0.f430a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 != 0) goto L14
            boolean r0 = super.hasOverlappingRendering()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            a.G0 r1 = r0.f446a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            a.G0 r0 = r1.f446a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            a.d1 r1 = r0.b
            if (r1 == 0) goto La
            r1.a()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            a.d1 r0 = r2.b
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            boolean r1 = r2.c
            if (r1 != 0) goto L10
            int r1 = r3.getLevel()
            r0.c = r1
        L10:
            super.setImageDrawable(r3)
            if (r0 == 0) goto L2d
            r0.a()
            boolean r3 = r2.c
            if (r3 != 0) goto L2d
            android.widget.ImageView r3 = r0.f430a
            android.graphics.drawable.Drawable r1 = r3.getDrawable()
            if (r1 == 0) goto L2d
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            int r0 = r0.c
            r3.setLevel(r0)
        L2d:
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
            a.d1 r0 = r3.b
            if (r0 == 0) goto L20
            android.widget.ImageView r1 = r0.f430a
            if (r4 == 0) goto L19
            android.content.Context r2 = r1.getContext()
            android.graphics.drawable.Drawable r4 = a.C0435w1.A(r2, r4)
            if (r4 == 0) goto L15
            a.C0457x5.a(r4)
        L15:
            r1.setImageDrawable(r4)
            goto L1d
        L19:
            r4 = 0
            r1.setImageDrawable(r4)
        L1d:
            r0.a()
        L20:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            a.d1 r1 = r0.b
            if (r1 == 0) goto La
            r1.a()
        La:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.G0 r0 = r1.f446a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.G0 r0 = r1.f446a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportImageTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            a.d1 r0 = r2.b
            if (r0 == 0) goto L19
            a.mf r1 = r0.b
            if (r1 != 0) goto Lf
            a.mf r1 = new a.mf
            r1.<init>()
            r0.b = r1
        Lf:
            a.mf r1 = r0.b
            r1.f580a = r3
            r3 = 1
            r1.d = r3
            r0.a()
        L19:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            a.d1 r0 = r2.b
            if (r0 == 0) goto L19
            a.mf r1 = r0.b
            if (r1 != 0) goto Lf
            a.mf r1 = new a.mf
            r1.<init>()
            r0.b = r1
        Lf:
            a.mf r1 = r0.b
            r1.b = r3
            r3 = 1
            r1.c = r3
            r0.a()
        L19:
            return
    }
}
