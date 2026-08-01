// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

public final class CLS375 {
    public static boolean MTH5136(ContentResolver contentResolver0, Uri uri0) {
        return DocumentsContract.deleteDocument(contentResolver0, uri0);
    }
}

