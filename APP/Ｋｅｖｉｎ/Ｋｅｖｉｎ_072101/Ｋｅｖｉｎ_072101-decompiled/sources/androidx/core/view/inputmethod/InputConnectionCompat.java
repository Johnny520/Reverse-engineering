package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes2.dex */
public final class InputConnectionCompat {
    private static final java.lang.String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final java.lang.String LOG_TAG = "InputConnectionCompat";


    /* JADX INFO: renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2 */
    class C02082 extends android.view.inputmethod.InputConnectionWrapper {
        final /* synthetic */ androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener val$listener;

        C02082(android.view.inputmethod.InputConnection r1, boolean r2, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r3) {
                r0 = this;
                r0.val$listener = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener r0 = r1.val$listener
                boolean r0 = androidx.core.view.inputmethod.InputConnectionCompat.handlePerformPrivateCommand(r2, r3, r0)
                if (r0 == 0) goto La
                r0 = 1
                return r0
            La:
                boolean r0 = super.performPrivateCommand(r2, r3)
                return r0
        }
    }

    static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean commitContent(android.view.inputmethod.InputConnection r1, android.view.inputmethod.InputContentInfo r2, int r3, android.os.Bundle r4) {
                boolean r0 = r1.commitContent(r2, r3, r4)
                return r0
        }
    }

    public interface OnCommitContentListener {
        boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r1, int r2, android.os.Bundle r3);
    }

    @java.lang.Deprecated
    public InputConnectionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean commitContent(android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2, androidx.core.view.inputmethod.InputContentInfoCompat r3, int r4, android.os.Bundle r5) {
            java.lang.Object r0 = r3.unwrap()
            android.view.inputmethod.InputContentInfo r0 = (android.view.inputmethod.InputContentInfo) r0
            boolean r0 = androidx.core.view.inputmethod.InputConnectionCompat.Api25Impl.commitContent(r1, r0, r4, r5)
            return r0
    }

    private static androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(android.view.View r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.view.inputmethod.InputConnectionCompat$$ExternalSyntheticLambda0 r0 = new androidx.core.view.inputmethod.InputConnectionCompat$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    public static android.view.inputmethod.InputConnection createWrapper(android.view.View r2, android.view.inputmethod.InputConnection r3, android.view.inputmethod.EditorInfo r4) {
            androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener r0 = createOnCommitContentListenerUsingPerformReceiveContent(r2)
            android.view.inputmethod.InputConnection r1 = createWrapper(r3, r4, r0)
            return r1
    }

    @java.lang.Deprecated
    public static android.view.inputmethod.InputConnection createWrapper(android.view.inputmethod.InputConnection r3, android.view.inputmethod.EditorInfo r4, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r5) {
            java.lang.String r0 = "inputConnection must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r3, r0)
            java.lang.String r0 = "editorInfo must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r4, r0)
            java.lang.String r0 = "onCommitContentListener must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r5, r0)
            r0 = r5
            androidx.core.view.inputmethod.InputConnectionCompat$1 r1 = new androidx.core.view.inputmethod.InputConnectionCompat$1
            r2 = 0
            r1.<init>(r3, r2, r0)
            return r1
    }

    static boolean handlePerformPrivateCommand(java.lang.String r12, android.os.Bundle r13, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener r14) {
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r12)
            if (r1 == 0) goto Le
            r1 = 0
            goto L17
        Le:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r12)
            if (r1 == 0) goto L85
            r1 = 1
        L17:
            r2 = 0
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L1f
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L21
        L1f:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L21:
            android.os.Parcelable r5 = r13.getParcelable(r5)     // Catch: java.lang.Throwable -> L7e
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch: java.lang.Throwable -> L7e
            r2 = r5
            if (r1 == 0) goto L2d
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L2f
        L2d:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L2f:
            android.os.Parcelable r5 = r13.getParcelable(r5)     // Catch: java.lang.Throwable -> L7e
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L3a
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L3c
        L3a:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L3c:
            android.os.Parcelable r6 = r13.getParcelable(r6)     // Catch: java.lang.Throwable -> L7e
            android.content.ClipDescription r6 = (android.content.ClipDescription) r6     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L47
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L49
        L47:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L49:
            android.os.Parcelable r7 = r13.getParcelable(r7)     // Catch: java.lang.Throwable -> L7e
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L54
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L56
        L54:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L56:
            int r8 = r13.getInt(r8)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L5f
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L61
        L5f:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L61:
            android.os.Parcelable r9 = r13.getParcelable(r9)     // Catch: java.lang.Throwable -> L7e
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L75
            if (r6 == 0) goto L75
            androidx.core.view.inputmethod.InputContentInfoCompat r10 = new androidx.core.view.inputmethod.InputContentInfoCompat     // Catch: java.lang.Throwable -> L7e
            r10.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L7e
            boolean r11 = r14.onCommitContent(r10, r8, r9)     // Catch: java.lang.Throwable -> L7e
            r3 = r11
        L75:
            if (r2 == 0) goto L7d
            if (r3 == 0) goto L7a
            r0 = 1
        L7a:
            r2.send(r0, r4)
        L7d:
            return r3
        L7e:
            r0 = move-exception
            if (r2 == 0) goto L84
            r2.send(r3, r4)
        L84:
            throw r0
        L85:
            return r0
    }

    static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(android.view.View r6, androidx.core.view.inputmethod.InputContentInfoCompat r7, int r8, android.os.Bundle r9) {
            r0 = r9
            r1 = r8 & 1
            r2 = 0
            if (r1 == 0) goto L2c
            r7.requestPermission()     // Catch: java.lang.Exception -> L23
            java.lang.Object r1 = r7.unwrap()
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            android.os.Bundle r3 = new android.os.Bundle
            if (r9 != 0) goto L19
            r3.<init>()
            goto L1c
        L19:
            r3.<init>(r9)
        L1c:
            r0 = r3
            java.lang.String r3 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r0.putParcelable(r3, r1)
            goto L2c
        L23:
            r1 = move-exception
            java.lang.String r3 = "InputConnectionCompat"
            java.lang.String r4 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r3, r4, r1)
            return r2
        L2c:
            android.content.ClipData r1 = new android.content.ClipData
            android.content.ClipDescription r3 = r7.getDescription()
            android.content.ClipData$Item r4 = new android.content.ClipData$Item
            android.net.Uri r5 = r7.getContentUri()
            r4.<init>(r5)
            r1.<init>(r3, r4)
            androidx.core.view.ContentInfoCompat$Builder r3 = new androidx.core.view.ContentInfoCompat$Builder
            r4 = 2
            r3.<init>(r1, r4)
            android.net.Uri r4 = r7.getLinkUri()
            androidx.core.view.ContentInfoCompat$Builder r3 = r3.setLinkUri(r4)
            androidx.core.view.ContentInfoCompat$Builder r3 = r3.setExtras(r0)
            androidx.core.view.ContentInfoCompat r3 = r3.build()
            androidx.core.view.ContentInfoCompat r4 = androidx.core.view.ViewCompat.performReceiveContent(r6, r3)
            if (r4 != 0) goto L5b
            r2 = 1
        L5b:
            return r2
    }
}
