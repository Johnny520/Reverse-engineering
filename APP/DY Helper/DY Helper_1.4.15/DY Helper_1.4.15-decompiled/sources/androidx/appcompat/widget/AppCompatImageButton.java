package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends android.widget.ImageButton {

    /* JADX INFO: renamed from: ε */
    public final p000.C0610o4 f561;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0571n2 f562;

    /* JADX INFO: renamed from: η */
    public boolean f563;

    public AppCompatImageButton(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968746(0x7f0400aa, float:1.7546154E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public AppCompatImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968746(0x7f0400aa, float:1.7546154E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatImageButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            p000.o42.m4207(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.f563 = r1
            android.content.Context r1 = r0.getContext()
            p000.b42.m739(r0, r1)
            o4 r1 = new o4
            r1.<init>(r0)
            r0.f561 = r1
            r1.m4197(r2, r3)
            n2 r1 = new n2
            r1.<init>(r0)
            r0.f562 = r1
            r1.m3946(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            o4 r0 = r1.f561
            if (r0 == 0) goto La
            r0.m4194()
        La:
            n2 r1 = r1.f562
            if (r1 == 0) goto L11
            r1.m3944()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            o4 r0 = r0.f561
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f561
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            r0 = 0
            n2 r1 = r1.f562
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f7360
            oo r1 = (p000.C0630oo) r1
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f8165
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            return r1
        L10:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            r0 = 0
            n2 r1 = r1.f562
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f7360
            oo r1 = (p000.C0630oo) r1
            if (r1 == 0) goto L10
            java.io.Serializable r1 = r1.f8166
            android.graphics.PorterDuff$Mode r1 = (android.graphics.PorterDuff.Mode) r1
            return r1
        L10:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
            r1 = this;
            n2 r0 = r1.f562
            java.lang.Object r0 = r0.f7359
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 != 0) goto L16
            boolean r1 = super.hasOverlappingRendering()
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f561
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f561
            if (r0 == 0) goto La
            r0.m4199(r1)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            n2 r0 = r0.f562
            if (r0 == 0) goto La
            r0.m3944()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            n2 r0 = r2.f562
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            boolean r1 = r2.f563
            if (r1 != 0) goto L10
            int r1 = r3.getLevel()
            r0.f7358 = r1
        L10:
            super.setImageDrawable(r3)
            if (r0 == 0) goto L2f
            r0.m3944()
            boolean r2 = r2.f563
            if (r2 != 0) goto L2f
            java.lang.Object r2 = r0.f7359
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 == 0) goto L2f
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            int r3 = r0.f7358
            r2.setLevel(r3)
        L2f:
            return
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
            r0 = this;
            super.setImageLevel(r1)
            r1 = 1
            r0.f563 = r1
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r3) {
            r2 = this;
            n2 r2 = r2.f562
            java.lang.Object r0 = r2.f7359
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r3 == 0) goto L19
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = p000.ln0.m3603(r1, r3)
            if (r3 == 0) goto L15
            p000.AbstractC0300fw.m2205(r3)
        L15:
            r0.setImageDrawable(r3)
            goto L1d
        L19:
            r3 = 0
            r0.setImageDrawable(r3)
        L1d:
            r2.m3944()
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            n2 r0 = r0.f562
            if (r0 == 0) goto La
            r0.m3944()
        La:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f561
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f561
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            n2 r1 = r1.f562
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r1.f7360
            oo r0 = (p000.C0630oo) r0
            if (r0 != 0) goto L11
            oo r0 = new oo
            r0.<init>()
            r1.f7360 = r0
        L11:
            java.lang.Object r0 = r1.f7360
            oo r0 = (p000.C0630oo) r0
            r0.f8165 = r2
            r2 = 1
            r0.f8164 = r2
            r1.m3944()
        L1d:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            n2 r1 = r1.f562
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r1.f7360
            oo r0 = (p000.C0630oo) r0
            if (r0 != 0) goto L11
            oo r0 = new oo
            r0.<init>()
            r1.f7360 = r0
        L11:
            java.lang.Object r0 = r1.f7360
            oo r0 = (p000.C0630oo) r0
            r0.f8166 = r2
            r2 = 1
            r0.f8163 = r2
            r1.m3944()
        L1d:
            return
    }
}
