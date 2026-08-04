package yyds;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛶᲁᛲᛲ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1420 implements MediaScannerConnection.OnScanCompletedListener {
    static {
        NativeUtil.classesInit0(180);
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final native void onScanCompleted(String str, Uri uri);
}
