package defpackage;

/* JADX INFO: renamed from: ᲁᛳᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1831 extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0196 f7977;

    public C1831(android.view.inputmethod.InputConnection r1, defpackage.C0196 r2) {
            r0 = this;
            r0.f7977 = r2
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
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            ᛸᲈᛸᲈ r1 = new ᛸᲈᛸᲈ
            r2 = 27
            r1.<init>(r2, r8)
            r2 = 28
            r0.<init>(r2, r1)
        L12:
            ᛱᲇᛴᛲ r1 = r7.f7977
            java.lang.Object r1 = r1.f1265
            ᲇᛳᛳᲇ r1 = (defpackage.C2015) r1
            r2 = r9 & 1
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.f7101     // Catch: java.lang.Exception -> L40
            ᛸᲈᛸᲈ r2 = (defpackage.C1606) r2     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.f7101     // Catch: java.lang.Exception -> L40
            android.view.inputmethod.InputContentInfo r2 = (android.view.inputmethod.InputContentInfo) r2     // Catch: java.lang.Exception -> L40
            r2.requestPermission()     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r0.f7101
            ᛸᲈᛸᲈ r2 = (defpackage.C1606) r2
            java.lang.Object r2 = r2.f7101
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
            java.lang.Object r0 = r0.f7101
            ᛸᲈᛸᲈ r0 = (defpackage.C1606) r0
            java.lang.Object r0 = r0.f7101
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
            ᛸᲈᛸᲈ r4 = new ᛸᲈᛸᲈ
            r4.<init>(r2, r6)
            goto L7a
        L71:
            ᛵᛶᛱᛲ r4 = new ᛵᛶᛱᛲ
            r4.<init>()
            r4.f4118 = r2
            r4.f4117 = r6
        L7a:
            android.net.Uri r0 = r0.getLinkUri()
            r4.mo1521(r0)
            r4.setExtras(r3)
            ᛳᛱᛴᛸ r0 = r4.build()
            ᛳᛱᛴᛸ r0 = defpackage.AbstractC0858.m1814(r1, r0)
            if (r0 != 0) goto L90
            r7 = 1
            return r7
        L90:
            boolean r7 = super.commitContent(r8, r9, r10)
            return r7
    }
}
