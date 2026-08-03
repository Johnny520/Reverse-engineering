package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0508 extends android.widget.TextView implements Yue.InterfaceC6266, Yue.InterfaceC6269, Yue.InterfaceC0707, Yue.InterfaceC2109 {
    private final Yue.C0429 mBackgroundTintHelper;

    @Yue.InterfaceC4410
    private Yue.C0462 mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Yue.InterfaceC4544
    private java.util.concurrent.Future<Yue.C4853> mPrecomputedTextFuture;

    @Yue.InterfaceC4544
    private Yue.C0508.InterfaceC0509 mSuperCaller;
    private final Yue.C0497 mTextClassifierHelper;
    private final Yue.C0499 mTextHelper;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ, reason: contains not printable characters */
    public interface InterfaceC0509 {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2);

        void setAutoSizeTextTypeWithDefaults(int r1);

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        android.view.textclassifier.TextClassifier mo1814();

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        void mo1815(@Yue.InterfaceC4544 android.view.textclassifier.TextClassifier r1);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void mo1816(@Yue.InterfaceC4992 int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        void mo1817(@Yue.InterfaceC4992 int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        void mo1818(int r1, @Yue.InterfaceC2458(from = 0.0d) float r2);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 26)
    public class C0510 implements Yue.C0508.InterfaceC0509 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0508 f1292;

        public C0510(Yue.C0508 r1) {
                r0 = this;
                r0.f1292 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C0508.InterfaceC0509
        public int getAutoSizeMaxTextSize() {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                int r0 = Yue.C0508.access$001(r0)
                return r0
        }

        @Override // Yue.C0508.InterfaceC0509
        public int getAutoSizeMinTextSize() {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                int r0 = Yue.C0508.access$101(r0)
                return r0
        }

        @Override // Yue.C0508.InterfaceC0509
        public int getAutoSizeStepGranularity() {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                int r0 = Yue.C0508.access$201(r0)
                return r0
        }

        @Override // Yue.C0508.InterfaceC0509
        public int[] getAutoSizeTextAvailableSizes() {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                int[] r0 = Yue.C0508.access$301(r0)
                return r0
        }

        @Override // Yue.C0508.InterfaceC0509
        public int getAutoSizeTextType() {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                int r0 = Yue.C0508.access$401(r0)
                return r0
        }

        @Override // Yue.C0508.InterfaceC0509
        public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                Yue.C0508.access$601(r0, r2, r3, r4, r5)
                return
        }

        @Override // Yue.C0508.InterfaceC0509
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                Yue.C0508.access$701(r0, r2, r3)
                return
        }

        @Override // Yue.C0508.InterfaceC0509
        public void setAutoSizeTextTypeWithDefaults(int r2) {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                Yue.C0508.access$801(r0, r2)
                return
        }

        @Override // Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ */
        public android.view.textclassifier.TextClassifier mo1814() {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                android.view.textclassifier.TextClassifier r0 = Yue.C0508.access$501(r0)
                return r0
        }

        @Override // Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1815(@Yue.InterfaceC4544 android.view.textclassifier.TextClassifier r2) {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1292
                Yue.C0508.access$901(r0, r2)
                return
        }

        @Override // Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1816(int r1) {
                r0 = this;
                return
        }

        @Override // Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1817(int r1) {
                r0 = this;
                return
        }

        @Override // Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo1818(int r1, float r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 28)
    public class C0511 extends Yue.C0508.C0510 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0508 f1293;

        public C0511(Yue.C0508 r1) {
                r0 = this;
                r0.f1293 = r1
                r0.<init>(r1)
                return
        }

        @Override // Yue.C0508.C0510, Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1816(@Yue.InterfaceC4992 int r2) {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1293
                Yue.C0508.access$1101(r0, r2)
                return
        }

        @Override // Yue.C0508.C0510, Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1817(@Yue.InterfaceC4992 int r2) {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1293
                Yue.C0508.access$1001(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(api = 34)
    public class C0512 extends Yue.C0508.C0511 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0508 f1294;

        public C0512(Yue.C0508 r1) {
                r0 = this;
                r0.f1294 = r1
                r0.<init>(r1)
                return
        }

        @Override // Yue.C0508.C0510, Yue.C0508.InterfaceC0509
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo1818(int r2, float r3) {
                r1 = this;
                Yue.ۥ۟ۡۤ r0 = r1.f1294
                Yue.C0508.access$1201(r0, r2, r3)
                return
        }
    }

    public C0508(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0508(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0508(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = Yue.C6261.m23335(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mIsSetTypefaceProcessing = r1
            r1 = 0
            r0.mSuperCaller = r1
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
            Yue.ۥ۟ۡۡۧ r1 = r0.getEmojiTextViewHelper()
            r1.m1700(r2, r3)
            return
    }

    public static /* synthetic */ int access$001(Yue.C0508 r0) {
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
    }

    public static /* synthetic */ void access$1001(Yue.C0508 r0, int r1) {
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    public static /* synthetic */ int access$101(Yue.C0508 r0) {
            int r0 = super.getAutoSizeMinTextSize()
            return r0
    }

    public static /* synthetic */ void access$1101(Yue.C0508 r0, int r1) {
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    public static /* synthetic */ void access$1201(Yue.C0508 r0, int r1, float r2) {
            super.setLineHeight(r1, r2)
            return
    }

    public static /* synthetic */ int access$201(Yue.C0508 r0) {
            int r0 = super.getAutoSizeStepGranularity()
            return r0
    }

    public static /* synthetic */ int[] access$301(Yue.C0508 r0) {
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
    }

    public static /* synthetic */ int access$401(Yue.C0508 r0) {
            int r0 = super.getAutoSizeTextType()
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextClassifier access$501(Yue.C0508 r0) {
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public static /* synthetic */ void access$601(Yue.C0508 r0, int r1, int r2, int r3, int r4) {
            super.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void access$701(Yue.C0508 r0, int[] r1, int r2) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
            return
    }

    public static /* synthetic */ void access$801(Yue.C0508 r0, int r1) {
            super.setAutoSizeTextTypeWithDefaults(r1)
            return
    }

    public static /* synthetic */ void access$901(Yue.C0508 r0, android.view.textclassifier.TextClassifier r1) {
            super.setTextClassifier(r1)
            return
    }

    @Yue.InterfaceC4410
    private Yue.C0462 getEmojiTextViewHelper() {
            r1 = this;
            Yue.ۥ۟ۡۡۧ r0 = r1.mEmojiTextViewHelper
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۡۡۧ r0 = new Yue.ۥ۟ۡۡۧ
            r0.<init>(r1)
            r1.mEmojiTextViewHelper = r0
        Lb:
            Yue.ۥ۟ۡۡۧ r0 = r1.mEmojiTextViewHelper
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
            if (r0 == 0) goto Ld
            Yue.ۥ۟ۡۤ$ۥ r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        Ld:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int r0 = r0.m1778()
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto Ld
            Yue.ۥ۟ۡۤ$ۥ r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        Ld:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int r0 = r0.m1779()
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto Ld
            Yue.ۥ۟ۡۤ$ۥ r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        Ld:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int r0 = r0.m1780()
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto Ld
            Yue.ۥ۟ۡۤ$ۥ r0 = r1.getSuperCaller()
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        Ld:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L16
            int[] r0 = r0.m1781()
            return r0
        L16:
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
            if (r0 == 0) goto L12
            Yue.ۥ۟ۡۤ$ۥ r0 = r3.getSuperCaller()
            int r0 = r0.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto L11
            r1 = r2
        L11:
            return r1
        L12:
            Yue.ۥۣ۟ۡۧ r0 = r3.mTextHelper
            if (r0 == 0) goto L1b
            int r0 = r0.m1782()
            return r0
        L1b:
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r1 = this;
            int r0 = Yue.C6156.m23045(r1)
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r1 = this;
            int r0 = Yue.C6156.m23046(r1)
            return r0
    }

    @Yue.InterfaceC6567
    @Yue.InterfaceC5336(api = 26)
    public Yue.C0508.InterfaceC0509 getSuperCaller() {
            r2 = this;
            Yue.ۥ۟ۡۤ$ۥ r0 = r2.mSuperCaller
            if (r0 != 0) goto L25
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L12
            Yue.ۥ۟ۡۤ$ۥ۟۟۟ r0 = new Yue.ۥ۟ۡۤ$ۥ۟۟۟
            r0.<init>(r2)
            r2.mSuperCaller = r0
            goto L25
        L12:
            r1 = 28
            if (r0 < r1) goto L1e
            Yue.ۥ۟ۡۤ$ۥ۟۟ r0 = new Yue.ۥ۟ۡۤ$ۥ۟۟
            r0.<init>(r2)
            r2.mSuperCaller = r0
            goto L25
        L1e:
            Yue.ۥ۟ۡۤ$ۥ۟ r0 = new Yue.ۥ۟ۡۤ$ۥ۟
            r0.<init>(r2)
            r2.mSuperCaller = r0
        L25:
            Yue.ۥ۟ۡۤ$ۥ r0 = r2.mSuperCaller
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

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r1 = this;
            r1.m1813()
            java.lang.CharSequence r0 = super.getText()
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
            Yue.ۥ۟ۡۤ$ۥ r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.mo1814()
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.C4853.C4855 getTextMetricsParamsCompat() {
            r1 = this;
            Yue.ۥۡۤۦ۟$ۥ۟ r0 = Yue.C6156.m23051(r1)
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
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            Yue.ۥۣ۟ۡۧ r1 = r2.mTextHelper
            r1.m1791(r2, r0, r3)
            android.view.inputmethod.InputConnection r3 = Yue.C0463.m1704(r0, r3, r2)
            return r3
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L22
            r1 = 33
            if (r0 >= r1) goto L22
            boolean r0 = r2.onCheckIsTextEditor()
            if (r0 == 0) goto L22
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L22:
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r0.m1813()
            super.onMeasure(r1, r2)
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
            if (r0 == 0) goto Lc
            Yue.ۥ۟ۡۤ$ۥ r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L13
        Lc:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L13
            r0.m1793(r2, r3, r4, r5)
        L13:
            return
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@Yue.InterfaceC4410 int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto Lc
            Yue.ۥ۟ۡۤ$ۥ r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto L13
        Lc:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L13
            r0.m1794(r2, r3)
        L13:
            return
    }

    @Override // android.widget.TextView, Yue.InterfaceC0707
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 == 0) goto Lc
            Yue.ۥ۟ۡۤ$ۥ r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeWithDefaults(r2)
            goto L13
        Lc:
            Yue.ۥۣ۟ۡۧ r0 = r1.mTextHelper
            if (r0 == 0) goto L13
            r0.m1795(r2)
        L13:
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = Yue.C0479.m1737(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = Yue.C0479.m1737(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = Yue.C0479.m1737(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = Yue.C0479.m1737(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            Yue.ۥۣ۟ۡۧ r3 = r2.mTextHelper
            if (r3 == 0) goto L2d
            r3.m1789()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r3, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            Yue.ۥۣ۟ۡۧ r1 = r0.mTextHelper
            if (r1 == 0) goto La
            r1.m1789()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = Yue.C0479.m1737(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = Yue.C0479.m1737(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = Yue.C0479.m1737(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = Yue.C0479.m1737(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            Yue.ۥۣ۟ۡۧ r3 = r2.mTextHelper
            if (r3 == 0) goto L2d
            r3.m1789()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r3, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@Yue.InterfaceC4992 @Yue.InterfaceC3281(from = 0) int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            Yue.ۥ۟ۡۤ$ۥ r0 = r2.getSuperCaller()
            r0.mo1817(r3)
            goto L11
        Le:
            Yue.C6156.m23061(r2, r3)
        L11:
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@Yue.InterfaceC4992 @Yue.InterfaceC3281(from = 0) int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            Yue.ۥ۟ۡۤ$ۥ r0 = r2.getSuperCaller()
            r0.mo1816(r3)
            goto L11
        Le:
            Yue.C6156.m23062(r2, r3)
        L11:
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(@Yue.InterfaceC4992 @Yue.InterfaceC3281(from = 0) int r1) {
            r0 = this;
            Yue.C6156.m23063(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r3, @Yue.InterfaceC2458(from = 0.0d) float r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            Yue.ۥ۟ۡۤ$ۥ r0 = r2.getSuperCaller()
            r0.mo1818(r3, r4)
            goto L11
        Le:
            Yue.C6156.m23064(r2, r3, r4)
        L11:
            return
    }

    public void setPrecomputedText(@Yue.InterfaceC4410 Yue.C4853 r1) {
            r0 = this;
            Yue.C6156.m23065(r0, r1)
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
            Yue.ۥ۟ۡۤ$ۥ r0 = r2.getSuperCaller()
            r0.mo1815(r3)
            return
    }

    public void setTextFuture(@Yue.InterfaceC4544 java.util.concurrent.Future<Yue.C4853> r1) {
            r0 = this;
            r0.mPrecomputedTextFuture = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(@Yue.InterfaceC4410 Yue.C4853.C4855 r1) {
            r0 = this;
            Yue.C6156.m23067(r0, r1)
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

    @Override // android.widget.TextView
    public void setTypeface(@Yue.InterfaceC4544 android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.mIsSetTypefaceProcessing
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L12
            if (r4 <= 0) goto L12
            android.content.Context r0 = r2.getContext()
            android.graphics.Typeface r0 = Yue.C6482.m23916(r0, r3, r4)
            goto L13
        L12:
            r0 = 0
        L13:
            r1 = 1
            r2.mIsSetTypefaceProcessing = r1
            if (r0 == 0) goto L19
            r3 = r0
        L19:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L20
            r2.mIsSetTypefaceProcessing = r0
            return
        L20:
            r3 = move-exception
            r2.mIsSetTypefaceProcessing = r0
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1813() {
            r2 = this;
            java.util.concurrent.Future<Yue.ۥۡۤۦ۟> r0 = r2.mPrecomputedTextFuture
            if (r0 == 0) goto L10
            r1 = 0
            r2.mPrecomputedTextFuture = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L10
            Yue.ۥۡۤۦ۟ r0 = (Yue.C4853) r0     // Catch: java.lang.Throwable -> L10
            Yue.C6156.m23065(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }
}
