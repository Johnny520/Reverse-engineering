package defpackage;

/* JADX INFO: renamed from: ᲈᛳᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2213 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f9457;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.res.AssetManager f9458;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f9459;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f9460;

    public C2213(android.content.res.AssetManager r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f9460 = r3
            r0.<init>()
            r0.f9458 = r1
            r0.f9459 = r2
            return
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r3, defpackage.InterfaceC0784 r4) {
            r2 = this;
            android.content.res.AssetManager r3 = r2.f9458     // Catch: java.io.IOException -> L18
            java.lang.String r0 = r2.f9459     // Catch: java.io.IOException -> L18
            int r1 = r2.f9460     // Catch: java.io.IOException -> L18
            switch(r1) {
                case 0: goto Le;
                default: goto L9;
            }     // Catch: java.io.IOException -> L18
        L9:
            java.io.InputStream r3 = r3.open(r0)     // Catch: java.io.IOException -> L18
            goto L12
        Le:
            android.content.res.AssetFileDescriptor r3 = r3.openFd(r0)     // Catch: java.io.IOException -> L18
        L12:
            r2.f9457 = r3     // Catch: java.io.IOException -> L18
            r4.mo1362(r3)     // Catch: java.io.IOException -> L18
            return
        L18:
            r2 = move-exception
            r3 = 3
            java.lang.String r0 = "AssetPathFetcher"
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto L27
            java.lang.String r3 = "Failed to load data from asset manager"
            android.util.Log.d(r0, r3, r2)
        L27:
            r4.mo1360(r2)
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r1 = this;
            java.lang.Object r0 = r1.f9457
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r1.f9460     // Catch: java.io.IOException -> L15
            switch(r1) {
                case 0: goto L10;
                default: goto La;
            }     // Catch: java.io.IOException -> L15
        La:
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.io.IOException -> L15
            r0.close()     // Catch: java.io.IOException -> L15
            goto L15
        L10:
            android.content.res.AssetFileDescriptor r0 = (android.content.res.AssetFileDescriptor) r0     // Catch: java.io.IOException -> L15
            r0.close()     // Catch: java.io.IOException -> L15
        L15:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r0 = this;
            int r0 = r0.f9460
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
        L8:
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            return r0
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r0 = this;
            r0 = 1
            return r0
    }
}
