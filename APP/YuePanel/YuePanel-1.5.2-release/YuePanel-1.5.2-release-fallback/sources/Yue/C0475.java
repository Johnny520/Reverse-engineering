package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0475 extends android.widget.RadioButton implements Yue.InterfaceC6268, Yue.InterfaceC6266, Yue.InterfaceC2109, Yue.InterfaceC6269 {
    private Yue.C0462 mAppCompatEmojiTextHelper;
    private final Yue.C0429 mBackgroundTintHelper;
    private final Yue.C0443 mCompoundButtonHelper;
    private final Yue.C0499 mTextHelper;

    public C0475(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0475(android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16741
            r1.<init>(r2, r3, r0)
            return
    }

    public C0475(android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = Yue.C6261.m23335(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            Yue.C6173.m23109(r0, r1)
            Yue.ۥ۟ۡ۠ۡ r1 = new Yue.ۥ۟ۡ۠ۡ
            r1.<init>(r0)
            r0.mCompoundButtonHelper = r1
            r1.m1656(r2, r3)
            Yue.ۥ۟ۡ۟۟ r1 = new Yue.ۥ۟ۡ۟۟
            r1.<init>(r0)
            r0.mBackgroundTintHelper = r1
            r1.m1631(r2, r3)
            Yue.ۥۣ۟ۡۧ r1 = new Yue.ۥۣ۟ۡۧ
            r1.<init>(r0)
            r0.mTextHelper = r1
            r1.m1786(r2, r3)
            Yue.ۥ۟ۡۡۧ r1 = r0.getEmojiTextViewHelper()
            r1.m1700(r2, r3)
            return
    }

    @Yue.InterfaceC4410
    private Yue.C0462 getEmojiTextViewHelper() {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.mAppCompatEmojiTextHelper
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۡۡۧ r0 = new Yue.ۥ۟ۡۡۧ
            r0.<init>(r1)
            r1.mAppCompatEmojiTextHelper = r0
        Lb:
            Yue.ۥ۟ۡۡۧ r0 = r1.mAppCompatEmojiTextHelper
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            Yue.ۥ۟ۡ۟۟ r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.m1628()
        La:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            r0.m1776()
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

    @Override // Yue.InterfaceC6268
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            Yue.ۥ۟ۡ۠ۡ r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1654()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6268
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            Yue.ۥ۟ۡ۠ۡ r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1655()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6269
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            android.content.res.ColorStateList r0 = r0.m1783()
            return r0
    }

    @Override // Yue.InterfaceC6269
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            android.graphics.PorterDuff$Mode r0 = r0.m1784()
            return r0
    }

    @Override // Yue.InterfaceC2109
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            boolean r0 = r0.m1699()
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            r0.m1701(r2)
            return
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setButtonDrawable(r1)
            Yue.ۥ۟ۡ۠ۡ r1 = r0.mCompoundButtonHelper
            if (r1 == 0) goto La
            r1.m1657()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r3, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            Yue.ۥۣ۟ۡۧ r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.m1789()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r3, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            Yue.ۥۣ۟ۡۧ r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.m1789()
        La:
            return
    }

    @Override // Yue.InterfaceC2109
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            r0.m1702(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(@Yue.InterfaceC4410 android.text.InputFilter[] r2) {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.m1698(r2)
            super.setFilters(r2)
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

    @Override // Yue.InterfaceC6268
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportButtonTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥ۟ۡ۠ۡ r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L7
            r0.m1658(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6268
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportButtonTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥ۟ۡ۠ۡ r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L7
            r0.m1659(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6269
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportCompoundDrawablesTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            r0.m1796(r2)
            Yue.ۥۣ۟ۡۧ r2 = r1.mTextHelper
            r2.m1776()
            return
    }

    @Override // Yue.InterfaceC6269
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportCompoundDrawablesTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            r0.m1797(r2)
            Yue.ۥۣ۟ۡۧ r2 = r1.mTextHelper
            r2.m1776()
            return
    }
}
