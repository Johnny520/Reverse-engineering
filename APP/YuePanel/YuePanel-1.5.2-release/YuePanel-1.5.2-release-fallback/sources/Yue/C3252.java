package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C3252 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f10626 = "InputConnectionCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f10627 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f10628 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10629 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10630 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f10631 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f10632 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f10633 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10634 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f10635 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f10636 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f10637 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.lang.String f10638 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.String f10639 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f10640 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f10641 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final java.lang.String f10642 = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ, reason: contains not printable characters */
    public class C3253 extends android.view.inputmethod.InputConnectionWrapper {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3252.InterfaceC3256 f10643;

        public C3253(android.view.inputmethod.InputConnection r1, boolean r2, Yue.C3252.InterfaceC3256 r3) {
                r0 = this;
                r0.f10643 = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(android.view.inputmethod.InputContentInfo r3, int r4, android.os.Bundle r5) {
                r2 = this;
                Yue.ۥ۠ۥۢۥ$ۥ۟۟۟ r0 = r2.f10643
                Yue.ۥ۠ۥۢۦ r1 = Yue.C3257.m13699(r3)
                boolean r0 = r0.mo13690(r1, r4, r5)
                if (r0 == 0) goto Le
                r3 = 1
                return r3
            Le:
                boolean r3 = super.commitContent(r3, r4, r5)
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ۟, reason: contains not printable characters */
    public class C3254 extends android.view.inputmethod.InputConnectionWrapper {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3252.InterfaceC3256 f10644;

        public C3254(android.view.inputmethod.InputConnection r1, boolean r2, Yue.C3252.InterfaceC3256 r3) {
                r0 = this;
                r0.f10644 = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                Yue.ۥ۠ۥۢۥ$ۥ۟۟۟ r0 = r1.f10644
                boolean r0 = Yue.C3252.m13696(r2, r3, r0)
                if (r0 == 0) goto La
                r2 = 1
                return r2
            La:
                boolean r2 = super.performPrivateCommand(r2, r3)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(25)
    public static class C3255 {
        public C3255() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m13698(android.view.inputmethod.InputConnection r0, android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
                boolean r0 = r0.commitContent(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC3256 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo13690(@Yue.InterfaceC4410 Yue.C3257 r1, int r2, @Yue.InterfaceC4544 android.os.Bundle r3);
    }

    @java.lang.Deprecated
    public C3252() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ boolean m13691(android.view.View r0, Yue.C3257 r1, int r2, android.os.Bundle r3) {
            boolean r0 = m13697(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m13692(@Yue.InterfaceC4410 android.view.inputmethod.InputConnection r0, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r1, @Yue.InterfaceC4410 Yue.C3257 r2, int r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            java.lang.Object r1 = r2.m13705()
            android.view.inputmethod.InputContentInfo r1 = (android.view.inputmethod.InputContentInfo) r1
            boolean r0 = Yue.C3252.C3255.m13698(r0, r1, r3, r4)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C3252.InterfaceC3256 m13693(@Yue.InterfaceC4410 android.view.View r1) {
            Yue.C4868.m19181(r1)
            Yue.ۥ۠ۥۢۤ r0 = new Yue.ۥ۠ۥۢۤ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.view.inputmethod.InputConnection m13694(@Yue.InterfaceC4410 android.view.View r0, @Yue.InterfaceC4410 android.view.inputmethod.InputConnection r1, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r2) {
            Yue.ۥ۠ۥۢۥ$ۥ۟۟۟ r0 = m13693(r0)
            android.view.inputmethod.InputConnection r0 = m13695(r1, r2, r0)
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.view.inputmethod.InputConnection m13695(@Yue.InterfaceC4410 android.view.inputmethod.InputConnection r1, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r2, @Yue.InterfaceC4410 Yue.C3252.InterfaceC3256 r3) {
            java.lang.String r0 = "inputConnection must be non-null"
            Yue.C4554.m18128(r1, r0)
            java.lang.String r0 = "editorInfo must be non-null"
            Yue.C4554.m18128(r2, r0)
            java.lang.String r2 = "onCommitContentListener must be non-null"
            Yue.C4554.m18128(r3, r2)
            Yue.ۥ۠ۥۢۥ$ۥ r2 = new Yue.ۥ۠ۥۢۥ$ۥ
            r0 = 0
            r2.<init>(r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m13696(@Yue.InterfaceC4544 java.lang.String r7, @Yue.InterfaceC4544 android.os.Bundle r8, @Yue.InterfaceC4410 Yue.C3252.InterfaceC3256 r9) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto Le
            r7 = r0
            goto L17
        Le:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L82
            r7 = 1
        L17:
            r1 = 0
            if (r7 == 0) goto L20
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L22
        L1d:
            r7 = move-exception
            r2 = r1
            goto L7c
        L20:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L22:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L2f
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L31
        L2d:
            r7 = move-exception
            goto L7c
        L2f:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L31:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L3c
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L3e
        L3c:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L3e:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch: java.lang.Throwable -> L2d
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L49
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L4b
        L49:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L4b:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L56
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L58
        L56:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L58:
            int r6 = r8.getInt(r6)     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L61
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L63
        L61:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L63:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch: java.lang.Throwable -> L2d
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L76
            if (r4 == 0) goto L76
            Yue.ۥ۠ۥۢۦ r8 = new Yue.ۥ۠ۥۢۦ     // Catch: java.lang.Throwable -> L2d
            r8.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r9.mo13690(r8, r6, r7)     // Catch: java.lang.Throwable -> L2d
        L76:
            if (r2 == 0) goto L7b
            r2.send(r0, r1)
        L7b:
            return r0
        L7c:
            if (r2 == 0) goto L81
            r2.send(r0, r1)
        L81:
            throw r7
        L82:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m13697(android.view.View r5, Yue.C3257 r6, int r7, android.os.Bundle r8) {
            r0 = 1
            r7 = r7 & r0
            r1 = 0
            if (r7 == 0) goto L2b
            r6.m13704()     // Catch: java.lang.Exception -> L22
            java.lang.Object r7 = r6.m13705()
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            if (r8 != 0) goto L16
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            goto L1c
        L16:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r8)
            r8 = r2
        L1c:
            java.lang.String r2 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r8.putParcelable(r2, r7)
            goto L2b
        L22:
            r5 = move-exception
            java.lang.String r6 = "InputConnectionCompat"
            java.lang.String r7 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r6, r7, r5)
            return r1
        L2b:
            android.content.ClipData r7 = new android.content.ClipData
            android.content.ClipDescription r2 = r6.m13701()
            android.content.ClipData$Item r3 = new android.content.ClipData$Item
            android.net.Uri r4 = r6.m13700()
            r3.<init>(r4)
            r7.<init>(r2, r3)
            Yue.ۥۣ۟ۧۡ$ۥ۟ r2 = new Yue.ۥۣ۟ۧۡ$ۥ۟
            r3 = 2
            r2.<init>(r7, r3)
            android.net.Uri r6 = r6.m13702()
            Yue.ۥۣ۟ۧۡ$ۥ۟ r6 = r2.m7706(r6)
            Yue.ۥۣ۟ۧۡ$ۥ۟ r6 = r6.m7704(r8)
            Yue.ۥۣ۟ۧۡ r6 = r6.m7702()
            Yue.ۥۣ۟ۧۡ r5 = Yue.C6794.m26208(r5, r6)
            if (r5 != 0) goto L5a
            goto L5b
        L5a:
            r0 = r1
        L5b:
            return r0
    }
}
