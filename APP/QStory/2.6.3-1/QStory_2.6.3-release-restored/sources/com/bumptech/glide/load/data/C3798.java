package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.alibaba.fastjson2.C3775;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.AbstractC5894;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3798 extends AbstractC3799 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final UriMatcher f9724;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f9724 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    @Override // com.bumptech.glide.load.data.AbstractC3799
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6996(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f9724.match(uri);
        if (iMatch == 1) {
            Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch != 5) {
            if (!this.f9728 || !AbstractC5894.m10600(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) {
                inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
            } else {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    C3775.m6960(uri, "FileDescriptor is null for: ");
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
        C3775.m6960(uri, "InputStream is null for ");
        return null;
    }

    @Override // com.bumptech.glide.load.data.AbstractC3799
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6997(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        return InputStream.class;
    }
}
