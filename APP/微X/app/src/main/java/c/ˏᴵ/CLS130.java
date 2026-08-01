// Decompiled by JEB v5.42.0.202606242140

package c.ˏᴵ;

import android.content.ContentResolver;
import android.net.Uri;

public final class CLS130 {
    public static void MTH1982(ContentResolver contentResolver0, Uri uri0, int v) {
        contentResolver0.takePersistableUriPermission(uri0, v);
    }
}

