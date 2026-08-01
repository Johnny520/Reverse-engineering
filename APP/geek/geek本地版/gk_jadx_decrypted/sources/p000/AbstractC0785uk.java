package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* JADX INFO: renamed from: uk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0785uk {
    /* JADX INFO: renamed from: a */
    public static Cursor m2458a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}
