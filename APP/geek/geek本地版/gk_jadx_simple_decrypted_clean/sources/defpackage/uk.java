package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public abstract class uk {
    public static Cursor a(ContentResolver r0, Uri r1, String[] r2, String r3, String[] r4, String r5, Object r6) {
        return r0.query(r1, r2, r3, r4, r5, (CancellationSignal) r6);
    }
}
