package p040;

import android.os.Message;
import androidx.appcompat.app.HandlerC0950;
import java.util.concurrent.atomic.AtomicBoolean;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言世哲兰楪子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7137 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static HandlerC0950 f17766;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicBoolean f17767 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9924 f17765 = new C9924("MethodCache", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12387(String str) {
        Message message = new Message();
        message.obj = str;
        f17766.sendMessage(message);
    }
}
