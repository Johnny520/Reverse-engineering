// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.net.Uri;
import android.provider.DocumentsContract;

public final class CLS372 {
    public static Uri MTH5101(Uri uri0, String s) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri0, s);
    }
}

