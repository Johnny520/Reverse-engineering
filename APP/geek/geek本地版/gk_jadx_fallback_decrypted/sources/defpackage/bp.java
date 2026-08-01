package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bp extends android.view.inputmethod.InputConnectionWrapper {
    public final /* synthetic */ defpackage.oh a;

    public bp(android.view.inputmethod.InputConnection r1, defpackage.oh r2) {
            r0 = this;
            r0.a = r2
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r8, int r9, android.os.Bundle r10) {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            goto L12
        L4:
            l0 r0 = new l0
            l0 r1 = new l0
            r2 = 16
            r1.<init>(r2, r8)
            r2 = 17
            r0.<init>(r2, r1)
        L12:
            oh r1 = r7.a
            java.lang.Object r1 = r1.a
            w3 r1 = (defpackage.w3) r1
            r2 = r9 & 1
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.b     // Catch: java.lang.Exception -> L40
            l0 r2 = (defpackage.l0) r2     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.b     // Catch: java.lang.Exception -> L40
            android.view.inputmethod.InputContentInfo r2 = (android.view.inputmethod.InputContentInfo) r2     // Catch: java.lang.Exception -> L40
            r2.requestPermission()     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r0.b
            l0 r2 = (defpackage.l0) r2
            java.lang.Object r2 = r2.b
            android.view.inputmethod.InputContentInfo r2 = (android.view.inputmethod.InputContentInfo) r2
            android.os.Bundle r3 = new android.os.Bundle
            if (r10 != 0) goto L37
            r3.<init>()
            goto L3a
        L37:
            r3.<init>(r10)
        L3a:
            java.lang.String r4 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r3.putParcelable(r4, r2)
            goto L4a
        L40:
            r0 = move-exception
            java.lang.String r1 = "InputConnectionCompat"
            java.lang.String r2 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r1, r2, r0)
            goto L90
        L49:
            r3 = r10
        L4a:
            android.content.ClipData r2 = new android.content.ClipData
            java.lang.Object r0 = r0.b
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            android.view.inputmethod.InputContentInfo r0 = (android.view.inputmethod.InputContentInfo) r0
            android.content.ClipDescription r4 = r0.getDescription()
            android.content.ClipData$Item r5 = new android.content.ClipData$Item
            android.net.Uri r6 = r0.getContentUri()
            r5.<init>(r6)
            r2.<init>(r4, r5)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            r6 = 2
            if (r4 < r5) goto L71
            l0 r4 = new l0
            r4.<init>(r2, r6)
            goto L7a
        L71:
            ad r4 = new ad
            r4.<init>()
            r4.b = r2
            r4.c = r6
        L7a:
            android.net.Uri r0 = r0.getLinkUri()
            r4.m(r0)
            r4.setExtras(r3)
            cd r0 = r4.build()
            cd r0 = defpackage.ja0.h(r1, r0)
            if (r0 != 0) goto L90
            r8 = 1
            return r8
        L90:
            boolean r8 = super.commitContent(r8, r9, r10)
            return r8
    }
}
