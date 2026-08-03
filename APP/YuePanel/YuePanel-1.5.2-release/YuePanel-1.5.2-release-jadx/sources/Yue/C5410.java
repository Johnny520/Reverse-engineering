package Yue;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C5410 {
    @InterfaceC6399
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ */
    public static final Icon m2179(@InterfaceC6399 Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Icon m2180(@InterfaceC6399 Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Icon m16899(@InterfaceC6399 Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Icon m16900(@InterfaceC6399 byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
