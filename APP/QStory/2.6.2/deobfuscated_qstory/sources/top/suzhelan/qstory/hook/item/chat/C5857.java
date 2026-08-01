package top.suzhelan.qstory.hook.item.chat;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5857 implements MediaScannerConnection.OnScanCompletedListener {
    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        DownloadEmotion$downloadEmotion$1.invokeSuspend$lambda$0$1(str, uri);
    }
}
