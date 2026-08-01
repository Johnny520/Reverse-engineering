// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class CLS22 {
    public static String MTH844(Uri uri0) {
        return DocumentsContract.getDocumentId(uri0);
    }

    public static void MTH845(AlarmManager alarmManager0, long v, PendingIntent pendingIntent0) {
        alarmManager0.setExact(0, v, pendingIntent0);
    }

    public static Charset MTH846() {
        return StandardCharsets.UTF_8;
    }

    public static boolean MTH847(Context context0, Uri uri0) {
        return DocumentsContract.isDocumentUri(context0, uri0);
    }
}

