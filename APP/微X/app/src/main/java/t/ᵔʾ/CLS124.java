// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class CLS124 {
    public static String MTH2014(Uri uri0) {
        return DocumentsContract.getDocumentId(uri0);
    }

    public static boolean MTH2015(Context context0, Uri uri0) {
        return DocumentsContract.isDocumentUri(context0, uri0);
    }

    public static Charset MTH2016() {
        return StandardCharsets.UTF_8;
    }
}

