package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0441 extends android.widget.CheckedTextView implements Yue.InterfaceC6267, Yue.InterfaceC6266, Yue.InterfaceC2109, Yue.InterfaceC6269 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.C0442 f1130;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Yue.C0429 f1131;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Yue.C0499 f1132;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public Yue.C0462 f1133;

    public C0441(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0441(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16626
            r1.<init>(r2, r3, r0)
            return
    }

    public C0441(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = Yue.C6261.m23335(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            Yue.C6173.m23109(r0, r1)
            Yue.ۥۣ۟ۡۧ r1 = new Yue.ۥۣ۟ۡۧ
            r1.<init>(r0)
            r0.f1132 = r1
            r1.m1786(r2, r3)
            r1.m1776()
            Yue.ۥ۟ۡ۟۟ r1 = new Yue.ۥ۟ۡ۟۟
            r1.<init>(r0)
            r0.f1131 = r1
            r1.m1631(r2, r3)
            Yue.ۥ۟ۡ۠۠ r1 = new Yue.ۥ۟ۡ۠۠
            r1.<init>(r0)
            r0.f1130 = r1
            r1.m1649(r2, r3)
            Yue.ۥ۟ۡۡۧ r1 = r0.getEmojiTextViewHelper()
            r1.m1700(r2, r3)
            return
    }

    @Yue.InterfaceC4410
    private Yue.C0462 getEmojiTextViewHelper() {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.f1133
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۡۡۧ r0 = new Yue.ۥ۟ۡۡۧ
            r0.<init>(r1)
            r1.f1133 = r0
        Lb:
            Yue.ۥ۟ۡۡۧ r0 = r1.f1133
            return r0
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            Yue.ۥۣ۟ۡۧ r0 = r1.f1132
            if (r0 == 0) goto La
            r0.m1776()
        La:
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1131
            if (r0 == 0) goto L11
            r0.m1628()
        L11:
            Yue.ۥ۟ۡ۠۠ r0 = r1.f1130
            if (r0 == 0) goto L18
            r0.m1646()
        L18:
            return
    }

    @Override // android.widget.TextView
    @Yue.InterfaceC4544
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = Yue.C6156.m23068(r0)
            return r0
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1131
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
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1131
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1630()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6267
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r1 = this;
            Yue.ۥ۟ۡ۠۠ r0 = r1.f1130
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1647()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6267
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r1 = this;
            Yue.ۥ۟ۡ۠۠ r0 = r1.f1130
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1648()
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
            Yue.ۥۣ۟ۡۧ r0 = r1.f1132
            android.content.res.ColorStateList r0 = r0.m1783()
            return r0
    }

    @Override // Yue.InterfaceC6269
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.f1132
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

    @Override // android.widget.TextView, android.view.View
    @Yue.InterfaceC4544
    public android.view.inputmethod.InputConnection onCreateInputConnection(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            android.view.inputmethod.InputConnection r2 = Yue.C0463.m1704(r0, r2, r1)
            return r2
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
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1131
            if (r0 == 0) goto La
            r0.m1632(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1131
            if (r0 == 0) goto La
            r0.m1633(r2)
        La:
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setCheckMarkDrawable(r1)
            Yue.ۥ۟ۡ۠۠ r1 = r0.f1130
            if (r1 == 0) goto La
            r1.m1650()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r3, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            Yue.ۥۣ۟ۡۧ r1 = r0.f1132
            if (r1 == 0) goto La
            r1.m1789()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r3, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            Yue.ۥۣ۟ۡۧ r1 = r0.f1132
            if (r1 == 0) goto La
            r1.m1789()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Yue.InterfaceC4544 android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = Yue.C6156.m23069(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // Yue.InterfaceC2109
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            r0.m1702(r2)
            return
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportBackgroundTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1131
            if (r0 == 0) goto L7
            r0.m1635(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportBackgroundTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1131
            if (r0 == 0) goto L7
            r0.m1636(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6267
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportCheckMarkTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥ۟ۡ۠۠ r0 = r1.f1130
            if (r0 == 0) goto L7
            r0.m1651(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6267
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportCheckMarkTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥ۟ۡ۠۠ r0 = r1.f1130
            if (r0 == 0) goto L7
            r0.m1652(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6269
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportCompoundDrawablesTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.f1132
            r0.m1796(r2)
            Yue.ۥۣ۟ۡۧ r2 = r1.f1132
            r2.m1776()
            return
    }

    @Override // Yue.InterfaceC6269
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportCompoundDrawablesTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.f1132
            r0.m1797(r2)
            Yue.ۥۣ۟ۡۧ r2 = r1.f1132
            r2.m1776()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@Yue.InterfaceC4410 android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            Yue.ۥۣ۟ۡۧ r0 = r1.f1132
            if (r0 == 0) goto La
            r0.m1790(r2, r3)
        La:
            return
    }
}
