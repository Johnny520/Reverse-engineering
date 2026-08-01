// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.net.Uri;
import android.provider.DocumentsContract;

public final class CLS296 {
    public static Uri MTH4352(Uri uri0, String s) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri0, s);
    }
}

