package defpackage;

/* JADX INFO: renamed from: ᛳᲈᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0597 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1372 f2975;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.res.Resources f2976;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.res.Resources.Theme f2977;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f2978;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.Object f2979;

    public C0597(android.content.res.Resources.Theme r1, android.content.res.Resources r2, defpackage.C1372 r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f2977 = r1
            r0.f2976 = r2
            r0.f2975 = r3
            r0.f2978 = r4
            return
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r5, defpackage.InterfaceC0784 r6) {
            r4 = this;
            ᛷᲁᛷᛶ r5 = r4.f2975     // Catch: android.content.res.Resources.NotFoundException -> L23
            android.content.res.Resources$Theme r0 = r4.f2977     // Catch: android.content.res.Resources.NotFoundException -> L23
            android.content.res.Resources r1 = r4.f2976     // Catch: android.content.res.Resources.NotFoundException -> L23
            int r2 = r4.f2978     // Catch: android.content.res.Resources.NotFoundException -> L23
            int r3 = r5.f6001     // Catch: android.content.res.Resources.NotFoundException -> L23
            switch(r3) {
                case 0: goto L19;
                case 1: goto L12;
                default: goto Ld;
            }     // Catch: android.content.res.Resources.NotFoundException -> L23
        Ld:
            java.io.InputStream r5 = r1.openRawResource(r2)     // Catch: android.content.res.Resources.NotFoundException -> L23
            goto L1d
        L12:
            android.content.Context r5 = r5.f6000     // Catch: android.content.res.Resources.NotFoundException -> L23
            android.graphics.drawable.Drawable r5 = defpackage.AbstractC1754.m3145(r5, r5, r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L23
            goto L1d
        L19:
            android.content.res.AssetFileDescriptor r5 = r1.openRawResourceFd(r2)     // Catch: android.content.res.Resources.NotFoundException -> L23
        L1d:
            r4.f2979 = r5     // Catch: android.content.res.Resources.NotFoundException -> L23
            r6.mo1362(r5)     // Catch: android.content.res.Resources.NotFoundException -> L23
            return
        L23:
            r4 = move-exception
            r6.mo1360(r4)
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r1 = this;
            java.lang.Object r0 = r1.f2979
            if (r0 == 0) goto L19
            ᛷᲁᛷᛶ r1 = r1.f2975     // Catch: java.io.IOException -> L19
            int r1 = r1.f6001     // Catch: java.io.IOException -> L19
            switch(r1) {
                case 0: goto L14;
                case 1: goto L11;
                default: goto Lb;
            }     // Catch: java.io.IOException -> L19
        Lb:
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.io.IOException -> L19
            r0.close()     // Catch: java.io.IOException -> L19
            goto L19
        L11:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.io.IOException -> L19
            goto L19
        L14:
            android.content.res.AssetFileDescriptor r0 = (android.content.res.AssetFileDescriptor) r0     // Catch: java.io.IOException -> L19
            r0.close()     // Catch: java.io.IOException -> L19
        L19:
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r0 = this;
            ᛷᲁᛷᛶ r0 = r0.f2975
            int r0 = r0.f6001
            switch(r0) {
                case 0: goto Ld;
                case 1: goto La;
                default: goto L7;
            }
        L7:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            goto Lf
        La:
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            goto Lf
        Ld:
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
        Lf:
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
