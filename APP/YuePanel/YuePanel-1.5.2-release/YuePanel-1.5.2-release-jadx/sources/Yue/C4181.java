package Yue;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4181 {
    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static Cursor m1136(@InterfaceC6391 ContentResolver contentResolver, @InterfaceC6391 Uri uri, @InterfaceC6490 String[] strArr, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr2, @InterfaceC6490 String str2, @InterfaceC6490 C3674 c3674) {
        return m1137(contentResolver, uri, strArr, str, strArr2, str2, c3674 != null ? (CancellationSignal) c3674.m742() : null);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static Cursor m1137(@InterfaceC6391 ContentResolver contentResolver, @InterfaceC6391 Uri uri, @InterfaceC6490 String[] strArr, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr2, @InterfaceC6490 String str2, @InterfaceC6490 CancellationSignal cancellationSignal) throws Exception {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                throw new C6576();
            }
            throw e;
        }
    }
}
