package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class f80 {
    public static ParcelFileDescriptor a(ContentResolver r0, Uri r1, String r2, CancellationSignal r3) {
        return r0.openFileDescriptor(r1, r2, r3);
    }
}
