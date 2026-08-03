package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: jz */
/* JADX INFO: loaded from: classes.dex */
public final class C2121jz extends AbstractC1019Xo {

    /* JADX INFO: renamed from: e */
    public static final UriMatcher f7451e = null;

    static {
        UriMatcher r0 = new UriMatcher(-1);
        f7451e = r0;
        r0.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        r0.addURI("com.android.contacts", "contacts/lookup/*", 1);
        r0.addURI("com.android.contacts", "contacts/#/photo", 2);
        r0.addURI("com.android.contacts", "contacts/#", 3);
        r0.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        r0.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return InputStream.class;
    }

    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: b */
    public final void mo1623b(Object r1) {
        ((InputStream) r1).close();
    }

    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: e */
    public final Object mo1624e(ContentResolver r4, Uri r5) {
        int r0 = f7451e.match(r5);
        if (r0 != 1) goto L5;
    L28:
        Uri r02 = ContactsContract.Contacts.lookupContact(r4, r5);
        if (r02 == null) goto L36;
        InputStream r42 = ContactsContract.Contacts.openContactPhotoInputStream(r4, r02, true);
    L31:
        if (r42 == null) goto L34;
        return r42;
    L34:
        throw new FileNotFoundException("InputStream is null for " + r5);
    L36:
        throw new FileNotFoundException("Contact cannot be found");
    L5:
        if (r0 != 3) goto L7;
        r42 = ContactsContract.Contacts.openContactPhotoInputStream(r4, r5, true);
        goto L31
    L7:
        if (r0 == 5) goto L28;
        if (this.f3227a == true) goto L11;
    L26:
        r42 = r4.openInputStream(r5);
        goto L31
    L11:
        if (AbstractC0628Oj.m1227H(r5) == false) goto L26;
        if (Build.VERSION.SDK_INT < 30) goto L26;
        if (AbstractC0773S.m1571b() < 17) goto L26;
        AssetFileDescriptor r43 = AbstractC1424fr.m2736a(r4, r5);
        if (r43 == null) goto L25;
        r42 = r43.createInputStream();     // Catch: IOException -> L20
    L20:
        e = move-exception;
        r43.close();     // Catch: Exception -> L37
    L23:
        throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e));
    L25:
        throw new FileNotFoundException("FileDescriptor is null for: " + r5);
    }
}
