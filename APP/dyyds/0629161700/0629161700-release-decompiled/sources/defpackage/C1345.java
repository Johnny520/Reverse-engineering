package defpackage;

/* JADX INFO: renamed from: ᛷᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1345 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f5923;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5924;

    public /* synthetic */ C1345(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5924 = r1
            r0.f5923 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    private final void m2495() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    private final void m2496() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m2497() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    private final void m2498() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r0 = this;
            int r0 = r0.f5924
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r2, defpackage.InterfaceC0784 r3) {
            r1 = this;
            int r2 = r1.f5924
            java.lang.Object r1 = r1.f5923
            switch(r2) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r3.mo1362(r1)
            return
        Lb:
            java.io.File r1 = (java.io.File) r1     // Catch: java.io.IOException -> L15
            java.nio.MappedByteBuffer r1 = defpackage.AbstractC0036.m363(r1)     // Catch: java.io.IOException -> L15
            r3.mo1362(r1)     // Catch: java.io.IOException -> L15
            goto L27
        L15:
            r1 = move-exception
            r2 = 3
            java.lang.String r0 = "ByteBufferFileLoader"
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L24
            java.lang.String r2 = "Failed to obtain ByteBuffer for file"
            android.util.Log.d(r0, r2, r1)
        L24:
            r3.mo1360(r1)
        L27:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r0 = this;
            int r0 = r0.f5924
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r1 = this;
            int r0 = r1.f5924
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f5923
            java.lang.Class r1 = r1.getClass()
            return r1
        Lc:
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            return r1
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r0 = this;
            int r0 = r0.f5924
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 1
            return r0
        L7:
            r0 = 1
            return r0
    }
}
