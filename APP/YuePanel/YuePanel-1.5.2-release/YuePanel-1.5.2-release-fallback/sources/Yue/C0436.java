package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0436 extends android.widget.Button implements Yue.InterfaceC6266, Yue.InterfaceC0707, Yue.InterfaceC6269, Yue.InterfaceC2109 {

    @Yue.InterfaceC4410
    private Yue.C0462 mAppCompatEmojiTextHelper;
    private final Yue.C0429 mBackgroundTintHelper;
    private final Yue.C0499 mTextHelper;

    public C0436(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0436(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16618
            r1.<init>(r2, r3, r0)
            return
    }

    public C0436(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = Yue.C6261.m23335(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            Yue.C6173.m23109(r0, r1)
            Yue.ۥ۟ۡ۟۟ r1 = new Yue.ۥ۟ۡ۟۟
            r1.<init>(r0)
            r0.mBackgroundTintHelper = r1
            r1.m1631(r2, r3)
            Yue.ۥۣ۟ۡۧ r1 = new Yue.ۥۣ۟ۡۧ
            r1.<init>(r0)
            r0.mTextHelper = r1
            r1.m1786(r2, r3)
            r1.m1776()
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

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
        L9:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int r0 = r0.m1778()
            return r0
        L12:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMinTextSize()
            return r0
        L9:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int r0 = r0.m1779()
            return r0
        L12:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeStepGranularity()
            return r0
        L9:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int r0 = r0.m1780()
            return r0
        L12:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L9
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
        L9:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L12
            int[] r0 = r0.m1781()
            return r0
        L12:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = Yue.C6928.f24176
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = super.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto Ld
            r1 = r2
        Ld:
            return r1
        Le:
            Yue.ۥۣ۟ۡۧ r0 = r3.mTextHelper
            if (r0 == 0) goto L17
            int r0 = r0.m1782()
            return r0
        L17:
            return r1
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

    @Override // Yue.InterfaceC2109
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            boolean r0 = r0.m1699()
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            Yue.ۥۣ۟ۡۧ r0 = r6.mTextHelper
            if (r0 == 0) goto Lf
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.m1788(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            Yue.ۥۣ۟ۡۧ r1 = r0.mTextHelper
            if (r1 == 0) goto L16
            boolean r2 = Yue.C6928.f24176
            if (r2 != 0) goto L16
            boolean r1 = r1.m1785()
            if (r1 == 0) goto L16
            Yue.ۥۣ۟ۡۧ r1 = r0.mTextHelper
            r1.m1777()
        L16:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            r0.m1701(r2)
            return
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto Lf
        L8:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.m1793(r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@Yue.InterfaceC4410 int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto Lf
        L8:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.m1794(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeWithDefaults(r2)
            goto Lf
        L8:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.m1795(r2)
        Lf:
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

    @Override // android.widget.TextView
    public void setFilters(@Yue.InterfaceC4410 android.text.InputFilter[] r2) {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.m1698(r2)
            super.setFilters(r2)
            return
    }

    public void setSupportAllCaps(boolean r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L7
            r0.m1792(r2)
        L7:
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

    @Override // android.widget.TextView
    public void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto L8
            super.setTextSize(r2, r3)
            goto Lf
        L8:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto Lf
            r0.m1800(r2, r3)
        Lf:
            return
    }
}
