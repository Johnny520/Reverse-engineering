package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* JADX INFO: renamed from: wk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859wk {
    /* JADX INFO: renamed from: a */
    public static Cursor m2613a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}
