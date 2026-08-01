package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class f80 {
    public static android.os.ParcelFileDescriptor a(android.content.ContentResolver r0, android.net.Uri r1, java.lang.String r2, android.os.CancellationSignal r3) {
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r2, r3)
            return r0
    }
}
