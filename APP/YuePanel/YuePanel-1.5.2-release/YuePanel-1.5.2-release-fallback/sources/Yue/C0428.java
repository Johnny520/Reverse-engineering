package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0428 extends android.widget.AutoCompleteTextView implements Yue.InterfaceC6266, Yue.InterfaceC2109, Yue.InterfaceC6269 {
    private static final int[] TINT_ATTRS = null;

    @Yue.InterfaceC4410
    private final Yue.C0461 mAppCompatEmojiEditTextHelper;
    private final Yue.C0429 mBackgroundTintHelper;
    private final Yue.C0499 mTextHelper;

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            Yue.C0428.TINT_ATTRS = r0
            return
    }

    public C0428(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0428(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16596
            r1.<init>(r2, r3, r0)
            return
    }

    public C0428(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.util.AttributeSet r4, int r5) {
            r2 = this;
            android.content.Context r3 = Yue.C6261.m23335(r3)
            r2.<init>(r3, r4, r5)
            android.content.Context r3 = r2.getContext()
            Yue.C6173.m23109(r2, r3)
            android.content.Context r3 = r2.getContext()
            int[] r0 = Yue.C0428.TINT_ATTRS
            r1 = 0
            Yue.ۥۢۡۥۦ r3 = Yue.C6264.m23339(r3, r4, r0, r5, r1)
            boolean r0 = r3.m23368(r1)
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r3.m23347(r1)
            r2.setDropDownBackgroundDrawable(r0)
        L26:
            r3.m23371()
            Yue.ۥ۟ۡ۟۟ r3 = new Yue.ۥ۟ۡ۟۟
            r3.<init>(r2)
            r2.mBackgroundTintHelper = r3
            r3.m1631(r4, r5)
            Yue.ۥۣ۟ۡۧ r3 = new Yue.ۥۣ۟ۡۧ
            r3.<init>(r2)
            r2.mTextHelper = r3
            r3.m1786(r4, r5)
            r3.m1776()
            Yue.ۥ۟ۡۡۦ r3 = new Yue.ۥ۟ۡۡۦ
            r3.<init>(r2)
            r2.mAppCompatEmojiEditTextHelper = r3
            r3.m1695(r4, r5)
            r2.initEmojiKeyListener(r3)
            return
    }

    @Override // android.widget.TextView, android.view.View
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

    public void initEmojiKeyListener(Yue.C0461 r6) {
            r5 = this;
            android.text.method.KeyListener r0 = r5.getKeyListener()
            boolean r1 = r6.m1693(r0)
            if (r1 == 0) goto L30
            boolean r1 = super.isFocusable()
            boolean r2 = super.isClickable()
            boolean r3 = super.isLongClickable()
            int r4 = super.getInputType()
            android.text.method.KeyListener r6 = r6.m1692(r0)
            if (r6 != r0) goto L21
            return
        L21:
            super.setKeyListener(r6)
            super.setRawInputType(r4)
            super.setFocusable(r1)
            super.setClickable(r2)
            super.setLongClickable(r3)
        L30:
            return
    }

    @Override // Yue.InterfaceC2109
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            Yue.ۥ۟ۡۡۦ r0 = r1.mAppCompatEmojiEditTextHelper
            boolean r0 = r0.m1694()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            android.view.inputmethod.InputConnection r0 = Yue.C0463.m1704(r0, r3, r2)
            Yue.ۥ۟ۡۡۦ r1 = r2.mAppCompatEmojiEditTextHelper
            android.view.inputmethod.InputConnection r3 = r1.m1696(r0, r3)
            return r3
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Yue.InterfaceC4544 android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = Yue.C6156.m23069(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    @Override // Yue.InterfaceC2109
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            Yue.ۥ۟ۡۡۦ r0 = r1.mAppCompatEmojiEditTextHelper
            r0.m1697(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Yue.InterfaceC4544 android.text.method.KeyListener r2) {
            r1 = this;
            Yue.ۥ۟ۡۡۦ r0 = r1.mAppCompatEmojiEditTextHelper
            android.text.method.KeyListener r2 = r0.m1692(r2)
            super.setKeyListener(r2)
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

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto La
            r0.m1790(r2, r3)
        La:
            return
    }
}
