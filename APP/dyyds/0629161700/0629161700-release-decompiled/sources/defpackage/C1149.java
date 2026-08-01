package defpackage;

/* JADX INFO: renamed from: ᛶᲁᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1149 extends defpackage.AbstractC0771 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final android.content.UriMatcher f5241 = null;

    static {
            android.content.UriMatcher r0 = new android.content.UriMatcher
            r1 = -1
            r0.<init>(r1)
            defpackage.C1149.f5241 = r0
            java.lang.String r1 = "com.android.contacts"
            java.lang.String r2 = "contacts/lookup/*/#"
            r3 = 1
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/lookup/*"
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/photo"
            r3 = 2
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#"
            r3 = 3
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/display_photo"
            r3 = 4
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "phone_lookup/*"
            r3 = 5
            r0.addURI(r1, r2, r3)
            return
    }

    @Override // defpackage.AbstractC0771
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final java.lang.Object mo645(android.content.ContentResolver r5, android.net.Uri r6) {
            r4 = this;
            android.content.UriMatcher r0 = defpackage.C1149.f5241
            int r0 = r0.match(r6)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L51
            r3 = 3
            if (r0 == r3) goto L4c
            r3 = 5
            if (r0 == r3) goto L51
            boolean r4 = r4.f3603
            if (r4 == 0) goto L47
            boolean r4 = defpackage.AbstractC0209.m762(r6)
            if (r4 == 0) goto L47
            r4 = 30
            int r4 = android.os.ext.SdkExtensions.getExtensionVersion(r4)
            r0 = 17
            if (r4 < r0) goto L47
            android.content.res.AssetFileDescriptor r4 = defpackage.AbstractC0747.m1665(r5, r6)
            if (r4 == 0) goto L41
            java.io.FileInputStream r4 = r4.createInputStream()     // Catch: java.io.IOException -> L2f
            goto L5b
        L2f:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Exception -> L33
        L33:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r6 = "Unable to create stream"
            r4.<init>(r6)
            java.lang.Throwable r4 = r4.initCause(r5)
            java.io.FileNotFoundException r4 = (java.io.FileNotFoundException) r4
            throw r4
        L41:
            java.lang.String r4 = "FileDescriptor is null for: "
            defpackage.C0086.m550(r6, r4)
            return r1
        L47:
            java.io.InputStream r4 = r5.openInputStream(r6)
            goto L5b
        L4c:
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r6, r2)
            goto L5b
        L51:
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.lookupContact(r5, r6)
            if (r4 == 0) goto L64
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r2)
        L5b:
            if (r4 == 0) goto L5e
            return r4
        L5e:
            java.lang.String r4 = "InputStream is null for "
            defpackage.C0086.m550(r6, r4)
            return r1
        L64:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r0 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // defpackage.AbstractC0771
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo647(java.lang.Object r1) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            r1.close()
            return
    }
}
