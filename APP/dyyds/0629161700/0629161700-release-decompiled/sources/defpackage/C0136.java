package defpackage;

/* JADX INFO: renamed from: ᛱᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0136 extends android.widget.ImageView {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f1077;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1126 f1078;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0866 f1079;

    public C0136(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.AbstractC0322.m994(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.f1077 = r1
            android.content.Context r1 = r0.getContext()
            defpackage.AbstractC2218.m3609(r1, r0)
            ᛵᛴᛴᛳ r1 = new ᛵᛴᛴᛳ
            r1.<init>(r0)
            r0.f1079 = r1
            r1.m1824(r2, r3)
            ᛶᛸᛶᛲ r1 = new ᛶᛸᛶᛲ
            r1.<init>(r0)
            r0.f1078 = r1
            r1.m2155(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r1.f1079
            if (r0 == 0) goto La
            r0.m1836()
        La:
            ᛶᛸᛶᛲ r1 = r1.f1078
            if (r1 == 0) goto L11
            r1.m2154()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f1079
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f1079
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            r0 = 0
            ᛶᛸᛶᛲ r1 = r1.f1078
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f5013
            ᛲᛸᲀᲁ r1 = (defpackage.C0340) r1
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f1738
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            return r1
        L10:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            r0 = 0
            ᛶᛸᛶᛲ r1 = r1.f1078
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f5013
            ᛲᛸᲀᲁ r1 = (defpackage.C0340) r1
            if (r1 == 0) goto L10
            java.io.Serializable r1 = r1.f1737
            android.graphics.PorterDuff$Mode r1 = (android.graphics.PorterDuff.Mode) r1
            return r1
        L10:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
            r1 = this;
            ᛶᛸᛶᛲ r0 = r1.f1078
            java.lang.Object r0 = r0.f5014
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
            ᛵᛴᛴᛳ r0 = r0.f1079
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f1079
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            ᛶᛸᛶᛲ r0 = r0.f1078
            if (r0 == 0) goto La
            r0.m2154()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            ᛶᛸᛶᛲ r0 = r2.f1078
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            boolean r1 = r2.f1077
            if (r1 != 0) goto L10
            int r1 = r3.getLevel()
            r0.f5016 = r1
        L10:
            super.setImageDrawable(r3)
            if (r0 == 0) goto L2f
            r0.m2154()
            boolean r2 = r2.f1077
            if (r2 != 0) goto L2f
            java.lang.Object r2 = r0.f5014
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 == 0) goto L2f
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            int r3 = r0.f5016
            r2.setLevel(r3)
        L2f:
            return
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
            r0 = this;
            super.setImageLevel(r1)
            r1 = 1
            r0.f1077 = r1
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r3) {
            r2 = this;
            ᛶᛸᛶᛲ r2 = r2.f1078
            if (r2 == 0) goto L22
            java.lang.Object r0 = r2.f5014
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r3 == 0) goto L1b
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = defpackage.AbstractC1592.m2873(r1, r3)
            if (r3 == 0) goto L17
            defpackage.AbstractC1660.m3052(r3)
        L17:
            r0.setImageDrawable(r3)
            goto L1f
        L1b:
            r3 = 0
            r0.setImageDrawable(r3)
        L1f:
            r2.m2154()
        L22:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            ᛶᛸᛶᛲ r0 = r0.f1078
            if (r0 == 0) goto La
            r0.m2154()
        La:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f1079
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f1079
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            ᛶᛸᛶᛲ r1 = r1.f1078
            if (r1 == 0) goto L19
            java.lang.Object r0 = r1.f5013
            ᛲᛸᲀᲁ r0 = (defpackage.C0340) r0
            if (r0 != 0) goto L11
            ᛲᛸᲀᲁ r0 = new ᛲᛸᲀᲁ
            r0.<init>()
            r1.f5013 = r0
        L11:
            r0.f1738 = r2
            r2 = 1
            r0.f1740 = r2
            r1.m2154()
        L19:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            ᛶᛸᛶᛲ r1 = r1.f1078
            if (r1 == 0) goto L19
            java.lang.Object r0 = r1.f5013
            ᛲᛸᲀᲁ r0 = (defpackage.C0340) r0
            if (r0 != 0) goto L11
            ᛲᛸᲀᲁ r0 = new ᛲᛸᲀᲁ
            r0.<init>()
            r1.f5013 = r0
        L11:
            r0.f1737 = r2
            r2 = 1
            r0.f1739 = r2
            r1.m2154()
        L19:
            return
    }
}
