package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class im0 extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.hi0 f5126;

    public im0(android.view.inputmethod.InputConnection r1, p000.hi0 r2) {
            r0 = this;
            r0.f5126 = r2
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
            n r0 = new n
            n r1 = new n
            r2 = 25
            r1.<init>(r2, r8)
            r2 = 26
            r0.<init>(r2, r1)
        L12:
            hi0 r1 = r7.f5126
            java.lang.Object r1 = r1.f4745
            androidx.appcompat.widget.AppCompatEditText r1 = (androidx.appcompat.widget.AppCompatEditText) r1
            r2 = r9 & 1
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.f7336     // Catch: java.lang.Exception -> L40
            n r2 = (p000.C0568n) r2     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.f7336     // Catch: java.lang.Exception -> L40
            android.view.inputmethod.InputContentInfo r2 = (android.view.inputmethod.InputContentInfo) r2     // Catch: java.lang.Exception -> L40
            r2.requestPermission()     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r0.f7336
            n r2 = (p000.C0568n) r2
            java.lang.Object r2 = r2.f7336
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
            java.lang.Object r0 = r0.f7336
            n r0 = (p000.C0568n) r0
            java.lang.Object r0 = r0.f7336
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
            n r4 = new n
            r4.<init>(r2, r6)
            goto L7a
        L71:
            fp r4 = new fp
            r4.<init>()
            r4.f4056 = r2
            r4.f4057 = r6
        L7a:
            android.net.Uri r0 = r0.getLinkUri()
            r4.mo1946(r0)
            r4.setExtras(r3)
            hp r0 = r4.build()
            hp r0 = p000.b92.m827(r1, r0)
            if (r0 != 0) goto L90
            r7 = 1
            return r7
        L90:
            boolean r7 = super.commitContent(r8, r9, r10)
            return r7
    }
}
