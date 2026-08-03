package a;

/* JADX INFO: loaded from: classes.dex */
public final class X8 extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.E5 f337a;

    public X8(android.view.inputmethod.InputConnection r1, a.E5 r2) {
            r0 = this;
            r0.f337a = r2
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r8, int r9, android.os.Bundle r10) {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            goto Le
        L4:
            a.Y8 r0 = new a.Y8
            a.Y8$a r1 = new a.Y8$a
            r1.<init>(r8)
            r0.<init>(r1)
        Le:
            a.E5 r1 = r7.f337a
            r2 = r9 & 1
            if (r2 == 0) goto L39
            a.Y8$a r2 = r0.f354a     // Catch: java.lang.Exception -> L30
            android.view.inputmethod.InputContentInfo r2 = r2.f355a     // Catch: java.lang.Exception -> L30
            r2.requestPermission()     // Catch: java.lang.Exception -> L30
            a.Y8$a r2 = r0.f354a
            android.view.inputmethod.InputContentInfo r2 = r2.f355a
            android.os.Bundle r3 = new android.os.Bundle
            if (r10 != 0) goto L27
            r3.<init>()
            goto L2a
        L27:
            r3.<init>(r10)
        L2a:
            java.lang.String r4 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r3.putParcelable(r4, r2)
            goto L3a
        L30:
            r0 = move-exception
            java.lang.String r1 = "InputConnectionCompat"
            java.lang.String r2 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r1, r2, r0)
            goto L86
        L39:
            r3 = r10
        L3a:
            android.content.ClipData r2 = new android.content.ClipData
            a.Y8$a r4 = r0.f354a
            android.view.inputmethod.InputContentInfo r4 = r4.f355a
            android.content.ClipDescription r4 = r4.getDescription()
            android.content.ClipData$Item r5 = new android.content.ClipData$Item
            a.Y8$a r0 = r0.f354a
            android.view.inputmethod.InputContentInfo r6 = r0.f355a
            android.net.Uri r6 = r6.getContentUri()
            r5.<init>(r6)
            r2.<init>(r4, r5)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            r6 = 2
            if (r4 < r5) goto L61
            a.W3$a r4 = new a.W3$a
            r4.<init>(r2, r6)
            goto L6a
        L61:
            a.W3$c r4 = new a.W3$c
            r4.<init>()
            r4.f316a = r2
            r4.b = r6
        L6a:
            android.view.inputmethod.InputContentInfo r0 = r0.f355a
            android.net.Uri r0 = r0.getLinkUri()
            r4.b(r0)
            r4.setExtras(r3)
            a.W3 r0 = r4.a()
            java.lang.Object r1 = r1.f69a
            a.Z0 r1 = (a.Z0) r1
            a.W3 r0 = a.C0414ug.f(r1, r0)
            if (r0 != 0) goto L86
            r8 = 1
            return r8
        L86:
            boolean r8 = super.commitContent(r8, r9, r10)
            return r8
    }
}
