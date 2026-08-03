package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0468 extends android.widget.ImageView implements Yue.InterfaceC6266, Yue.InterfaceC6270 {
    private final Yue.C0429 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final Yue.C0466 mImageHelper;

    public C0468(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0468(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C0468(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = Yue.C6261.m23335(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mHasLevel = r1
            android.content.Context r1 = r0.getContext()
            Yue.C6173.m23109(r0, r1)
            Yue.ۥ۟ۡ۟۟ r1 = new Yue.ۥ۟ۡ۟۟
            r1.<init>(r0)
            r0.mBackgroundTintHelper = r1
            r1.m1631(r2, r3)
            Yue.ۥ۟ۡۢ۠ r1 = new Yue.ۥ۟ۡۢ۠
            r1.<init>(r0)
            r0.mImageHelper = r1
            r1.m1712(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.m1628()
        La:
            Yue.ۥ۟ۡۢ۠ r0 = r1.mImageHelper
            if (r0 == 0) goto L11
            r0.m1708()
        L11:
            return
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1629()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1630()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6270
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            Yue.ۥ۟ۡۢ۠ r0 = r1.mImageHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1709()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6270
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            Yue.ۥ۟ۡۢ۠ r0 = r1.mImageHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1710()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            Yue.ۥ۟ۡۢ۠ r0 = r1.mImageHelper
            boolean r0 = r0.m1711()
            if (r0 == 0) goto L10
            boolean r0 = super.hasOverlappingRendering()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.m1632(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.m1633(r2)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            Yue.ۥ۟ۡۢ۠ r1 = r0.mImageHelper
            if (r1 == 0) goto La
            r1.m1708()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r3) {
            r2 = this;
            Yue.ۥ۟ۡۢ۠ r0 = r2.mImageHelper
            if (r0 == 0) goto Ld
            if (r3 == 0) goto Ld
            boolean r1 = r2.mHasLevel
            if (r1 != 0) goto Ld
            r0.m1713(r3)
        Ld:
            super.setImageDrawable(r3)
            Yue.ۥ۟ۡۢ۠ r3 = r2.mImageHelper
            if (r3 == 0) goto L20
            r3.m1708()
            boolean r3 = r2.mHasLevel
            if (r3 != 0) goto L20
            Yue.ۥ۟ۡۢ۠ r3 = r2.mImageHelper
            r3.m1707()
        L20:
            return
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
            r0 = this;
            super.setImageLevel(r1)
            r1 = 1
            r0.mHasLevel = r1
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            Yue.ۥ۟ۡۢ۠ r0 = r1.mImageHelper
            if (r0 == 0) goto L7
            r0.m1714(r2)
        L7:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Yue.InterfaceC4544 android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            Yue.ۥ۟ۡۢ۠ r1 = r0.mImageHelper
            if (r1 == 0) goto La
            r1.m1708()
        La:
            return
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportBackgroundTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.m1635(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportBackgroundTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.m1636(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6270
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportImageTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥ۟ۡۢ۠ r0 = r1.mImageHelper
            if (r0 == 0) goto L7
            r0.m1716(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6270
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportImageTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥ۟ۡۢ۠ r0 = r1.mImageHelper
            if (r0 == 0) goto L7
            r0.m1717(r2)
        L7:
            return
    }
}
