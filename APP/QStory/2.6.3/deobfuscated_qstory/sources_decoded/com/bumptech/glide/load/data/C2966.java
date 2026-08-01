package com.bumptech.glide.load.data;

import android.content.UriMatcher;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2966 extends AbstractC2967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final UriMatcher f9379;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f9379 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    @Override // com.bumptech.glide.load.data.AbstractC2967
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo6436(android.content.ContentResolver r5, android.net.Uri r6) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            android.content.UriMatcher r0 = com.bumptech.glide.load.data.C2966.f9379
            int r0 = r0.match(r6)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L55
            r3 = 3
            if (r0 == r3) goto L50
            r3 = 5
            if (r0 == r3) goto L55
            boolean r4 = r4.f9383
            if (r4 == 0) goto L4b
            boolean r4 = kotlin.reflect.jvm.internal.AbstractC5062.m10041(r6)
            if (r4 == 0) goto L4b
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r4 < r0) goto L4b
            int r4 = androidx.core.view.AbstractC2226.m4070()
            r0 = 17
            if (r4 < r0) goto L4b
            android.content.res.AssetFileDescriptor r4 = androidx.core.os.AbstractC2174.m3960(r5, r6)
            if (r4 == 0) goto L45
            java.io.FileInputStream r4 = r4.createInputStream()     // Catch: java.io.IOException -> L33
            goto L5f
        L33:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Exception -> L37
        L37:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r6 = "Unable to create stream"
            r4.<init>(r6)
            java.lang.Throwable r4 = r4.initCause(r5)
            java.io.FileNotFoundException r4 = (java.io.FileNotFoundException) r4
            throw r4
        L45:
            java.lang.String r4 = "FileDescriptor is null for: "
            com.alibaba.fastjson2.C2942.m6400(r6, r4)
            return r1
        L4b:
            java.io.InputStream r4 = r5.openInputStream(r6)
            goto L5f
        L50:
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r6, r2)
            goto L5f
        L55:
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.lookupContact(r5, r6)
            if (r4 == 0) goto L68
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r2)
        L5f:
            if (r4 == 0) goto L62
            return r4
        L62:
            java.lang.String r4 = "InputStream is null for "
            com.alibaba.fastjson2.C2942.m6400(r6, r4)
            return r1
        L68:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.C2966.mo6436(android.content.ContentResolver, android.net.Uri):java.lang.Object");
    }

    @Override // com.bumptech.glide.load.data.AbstractC2967
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6437(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        return InputStream.class;
    }
}
