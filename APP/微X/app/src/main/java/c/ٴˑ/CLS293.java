// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

public final class CLS293 {
    public static Uri MTH4337(ContentResolver contentResolver0, Uri uri0, String s) {
        return DocumentsContract.renameDocument(contentResolver0, uri0, s);
    }
}

