// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

public final class CLS368 {
    public static Uri MTH5068(ContentResolver contentResolver0, Uri uri0, String s, String s1) {
        return DocumentsContract.createDocument(contentResolver0, uri0, s, s1);
    }
}

