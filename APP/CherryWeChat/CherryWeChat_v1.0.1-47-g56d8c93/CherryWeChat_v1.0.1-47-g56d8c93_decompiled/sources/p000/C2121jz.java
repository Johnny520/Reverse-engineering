package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: jz */
/* JADX INFO: loaded from: classes.dex */
public final class C2121jz extends AbstractC1019Xo {

    /* JADX INFO: renamed from: e */
    public static final UriMatcher f7451e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f7451e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return InputStream.class;
    }

    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: b */
    public final void mo1623b(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1624e(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f7451e.match(uri);
        if (iMatch == 1) {
            Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch != 5) {
            if (!this.f3227a || !AbstractC0628Oj.m1227H(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) {
                inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
            } else {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    throw new FileNotFoundException("FileDescriptor is null for: " + uri);
                }
                try {
                    inputStreamOpenContactPhotoInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException e) {
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (Exception unused) {
                    }
                    throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e));
                }
            }
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return inputStreamOpenContactPhotoInputStream;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
