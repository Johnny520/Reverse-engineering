package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0497 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public android.widget.TextView f1255;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public android.view.textclassifier.TextClassifier f1256;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static final class C0498 {
        public C0498() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.view.textclassifier.TextClassifier m1773(@Yue.InterfaceC4410 android.widget.TextView r1) {
                android.content.Context r1 = r1.getContext()
                java.lang.Class<android.view.textclassifier.TextClassificationManager> r0 = android.view.textclassifier.TextClassificationManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.view.textclassifier.TextClassificationManager r1 = (android.view.textclassifier.TextClassificationManager) r1
                if (r1 == 0) goto L13
                android.view.textclassifier.TextClassifier r1 = r1.getTextClassifier()
                return r1
            L13:
                android.view.textclassifier.TextClassifier r1 = android.view.textclassifier.TextClassifier.NO_OP
                return r1
        }
    }

    public C0497(@Yue.InterfaceC4410 android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = Yue.C4868.m19181(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1255 = r1
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(api = 26)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.view.textclassifier.TextClassifier m1771() {
            r1 = this;
            android.view.textclassifier.TextClassifier r0 = r1.f1256
            if (r0 != 0) goto La
            android.widget.TextView r0 = r1.f1255
            android.view.textclassifier.TextClassifier r0 = Yue.C0497.C0498.m1773(r0)
        La:
            return r0
    }

    @Yue.InterfaceC5336(api = 26)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m1772(@Yue.InterfaceC4544 android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            r0.f1256 = r1
            return
    }
}
