package top.suzhelan.qstory.hook.item.chat;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5862 implements MediaScannerConnection.OnScanCompletedListener {
    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        DownloadEmotion$downloadEmotion$1.invokeSuspend$lambda$0$1(str, uri);
    }
}
