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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zu2 extends ic1 {

    /* JADX INFO: renamed from: l */
    public static final UriMatcher f14109l;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f14109l = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        return InputStream.class;
    }

    @Override // p000.ic1
    /* JADX INFO: renamed from: d */
    public final void mo2324d(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    @Override // p000.ic1
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2325f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f14109l.match(uri);
        if (iMatch == 1) {
            Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch != 5) {
            if (!this.f4552h || !AbstractC0691se.m4825N(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) {
                inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
            } else {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    um2.m5517g("FileDescriptor is null for: ", uri);
                    return null;
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
        um2.m5517g("InputStream is null for ", uri);
        return null;
    }
}
