package p024;

import android.os.Message;
import androidx.appcompat.app.HandlerC0103;
import java.util.concurrent.atomic.AtomicBoolean;
import p287.AbstractC8405;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言世哲兰楪子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6308 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static HandlerC0103 f17421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicBoolean f17422 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9095 f17420 = new C9095(AbstractC8405.m13972(769), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11828(String str) {
        Message message = new Message();
        message.obj = str;
        f17421.sendMessage(message);
    }
}
