package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131 extends defpackage.AbstractC0771 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1067;

    public /* synthetic */ C0131(android.content.ContentResolver r1, android.net.Uri r2, boolean r3, int r4) {
            r0 = this;
            r0.f1067 = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // defpackage.AbstractC0771
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object mo645(android.content.ContentResolver r7, android.net.Uri r8) {
            r6 = this;
            int r7 = r6.f1067
            r0 = 0
            java.lang.String r1 = "FileDescriptor is null for: "
            java.lang.String r2 = "r"
            r3 = 17
            r4 = 30
            boolean r5 = r6.f3603
            android.content.ContentResolver r6 = r6.f3601
            switch(r7) {
                case 0: goto L34;
                default: goto L12;
            }
        L12:
            if (r5 == 0) goto L25
            boolean r7 = defpackage.AbstractC0209.m762(r8)
            if (r7 == 0) goto L25
            int r7 = android.os.ext.SdkExtensions.getExtensionVersion(r4)
            if (r7 < r3) goto L25
            android.content.res.AssetFileDescriptor r6 = defpackage.AbstractC0747.m1665(r6, r8)
            goto L29
        L25:
            android.content.res.AssetFileDescriptor r6 = r6.openAssetFileDescriptor(r8, r2)
        L29:
            if (r6 == 0) goto L30
            android.os.ParcelFileDescriptor r0 = r6.getParcelFileDescriptor()
            goto L33
        L30:
            defpackage.C0086.m550(r8, r1)
        L33:
            return r0
        L34:
            if (r5 == 0) goto L47
            boolean r7 = defpackage.AbstractC0209.m762(r8)
            if (r7 == 0) goto L47
            int r7 = android.os.ext.SdkExtensions.getExtensionVersion(r4)
            if (r7 < r3) goto L47
            android.content.res.AssetFileDescriptor r6 = defpackage.AbstractC0747.m1665(r6, r8)
            goto L4b
        L47:
            android.content.res.AssetFileDescriptor r6 = r6.openAssetFileDescriptor(r8, r2)
        L4b:
            if (r6 == 0) goto L4f
            r0 = r6
            goto L52
        L4f:
            defpackage.C0086.m550(r8, r1)
        L52:
            return r0
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class mo646() {
            r0 = this;
            int r0 = r0.f1067
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            return r0
        L8:
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            return r0
    }

    @Override // defpackage.AbstractC0771
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo647(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f1067
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            r1.close()
            return
        Lb:
            android.content.res.AssetFileDescriptor r1 = (android.content.res.AssetFileDescriptor) r1
            r1.close()
            return
    }
}
