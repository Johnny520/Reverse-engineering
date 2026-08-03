package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0459 extends android.widget.EditText implements Yue.InterfaceC6266, Yue.InterfaceC4620, Yue.InterfaceC2109, Yue.InterfaceC6269 {

    @Yue.InterfaceC4410
    private final Yue.C0461 mAppCompatEmojiEditTextHelper;
    private final Yue.C0429 mBackgroundTintHelper;
    private final Yue.C6172 mDefaultOnReceiveContentListener;

    @Yue.InterfaceC4544
    private Yue.C0459.C0460 mSuperCaller;
    private final Yue.C0497 mTextClassifierHelper;
    private final Yue.C0499 mTextHelper;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۡۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 26)
    public class C0460 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0459 f1168;

        public C0460(Yue.C0459 r1) {
                r0 = this;
                r0.f1168 = r1
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.textclassifier.TextClassifier m1690() {
                r1 = this;
                Yue.ۥ۟ۡۡۥ r0 = r1.f1168
                android.view.textclassifier.TextClassifier r0 = Yue.C0459.access$001(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m1691(android.view.textclassifier.TextClassifier r2) {
                r1 = this;
                Yue.ۥ۟ۡۡۥ r0 = r1.f1168
                Yue.C0459.access$101(r0, r2)
                return
        }
    }

    public C0459(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0459(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16675
            r1.<init>(r2, r3, r0)
            return
    }

    public C0459(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
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
            Yue.ۥۣ۟ۡۦ r1 = new Yue.ۥۣ۟ۡۦ
            r1.<init>(r0)
            r0.mTextClassifierHelper = r1
            Yue.ۥۢۡۡۡ r1 = new Yue.ۥۢۡۡۡ
            r1.<init>()
            r0.mDefaultOnReceiveContentListener = r1
            Yue.ۥ۟ۡۡۦ r1 = new Yue.ۥ۟ۡۡۦ
            r1.<init>(r0)
            r0.mAppCompatEmojiEditTextHelper = r1
            r1.m1695(r2, r3)
            r0.initEmojiKeyListener(r1)
            return
    }

    public static /* synthetic */ android.view.textclassifier.TextClassifier access$001(Yue.C0459 r0) {
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public static /* synthetic */ void access$101(Yue.C0459 r0, android.view.textclassifier.TextClassifier r1) {
            super.setTextClassifier(r1)
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC6567
    @Yue.InterfaceC5336(26)
    private Yue.C0459.C0460 getSuperCaller() {
            r1 = this;
            Yue.ۥ۟ۡۡۥ$ۥ r0 = r1.mSuperCaller
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۡۡۥ$ۥ r0 = new Yue.ۥ۟ۡۡۥ$ۥ
            r0.<init>(r1)
            r1.mSuperCaller = r0
        Lb:
            Yue.ۥ۟ۡۡۥ$ۥ r0 = r1.mSuperCaller
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

    @Override // android.widget.EditText, android.widget.TextView
    @Yue.InterfaceC4544
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.text.Editable r0 = super.getText()
            return r0
        Lb:
            android.text.Editable r0 = super.getEditableText()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Yue.InterfaceC4544
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r1 = this;
            android.text.Editable r0 = r1.getText()
            return r0
    }

    @Override // android.widget.TextView
    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(api = 26)
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L10
            Yue.ۥۣ۟ۡۦ r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            android.view.textclassifier.TextClassifier r0 = r0.m1771()
            return r0
        L10:
            Yue.ۥ۟ۡۡۥ$ۥ r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.m1690()
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
    @Yue.InterfaceC4544
    public android.view.inputmethod.InputConnection onCreateInputConnection(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            Yue.ۥۣ۟ۡۧ r1 = r3.mTextHelper
            r1.m1791(r3, r0, r4)
            android.view.inputmethod.InputConnection r0 = Yue.C0463.m1704(r0, r4, r3)
            if (r0 == 0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L22
            java.lang.String[] r1 = Yue.C6794.m26148(r3)
            if (r1 == 0) goto L22
            Yue.C2095.m9766(r4, r1)
            android.view.inputmethod.InputConnection r0 = Yue.C3252.m13694(r3, r0, r4)
        L22:
            Yue.ۥ۟ۡۡۦ r1 = r3.mAppCompatEmojiEditTextHelper
            android.view.inputmethod.InputConnection r4 = r1.m1696(r0, r4)
            return r4
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            r1 = 33
            if (r0 >= r1) goto L1c
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L1c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent r2) {
            r1 = this;
            boolean r0 = Yue.C0477.m1731(r1, r2)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = super.onDragEvent(r2)
            return r2
    }

    @Override // Yue.InterfaceC4620
    @Yue.InterfaceC4544
    public Yue.C1545 onReceiveContent(@Yue.InterfaceC4410 Yue.C1545 r2) {
            r1 = this;
            Yue.ۥۢۡۡۡ r0 = r1.mDefaultOnReceiveContentListener
            Yue.ۥۣ۟ۧۡ r2 = r0.mo18431(r1, r2)
            return r2
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int r2) {
            r1 = this;
            boolean r0 = Yue.C0477.m1732(r1, r2)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = super.onTextContextMenuItem(r2)
            return r2
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

    @Override // android.widget.TextView
    @Yue.InterfaceC5336(api = 26)
    public void setTextClassifier(@Yue.InterfaceC4544 android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Lf
            Yue.ۥۣ۟ۡۦ r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            r0.m1772(r3)
            return
        Lf:
            Yue.ۥ۟ۡۡۥ$ۥ r0 = r2.getSuperCaller()
            r0.m1691(r3)
            return
    }
}
