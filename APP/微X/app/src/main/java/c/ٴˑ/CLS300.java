// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

public final class CLS300 {
    public static boolean MTH4392(ContentResolver contentResolver0, Uri uri0) {
        return DocumentsContract.deleteDocument(contentResolver0, uri0);
    }
}

