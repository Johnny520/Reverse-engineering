package p321;

import de.robv.android.xposed.XposedHelpers;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import lin.xposed.hook.util.qq.QQMessageUtils;
import p075.C6958;
import p287.AbstractC8405;
import p323.AbstractC8721;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC8697 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24519;

    public /* synthetic */ CallableC8697(Object obj, int i) {
        this.f24519 = i;
        this.f24518 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f24519;
        Object obj = this.f24518;
        switch (i) {
            case 0:
                C6958 c6958 = C8698.f24520;
                ExecutorService executorService = AbstractC8721.f24571;
                Map<String, String> msgRecordMd5UrlMap = QQMessageUtils.getMsgRecordMd5UrlMap(obj);
                AbstractC8405.m13972(2687);
                msgRecordMd5UrlMap.getClass();
                AbstractC8721.m14428(msgRecordMd5UrlMap);
                break;
            default:
                C6958 c69582 = C8698.f24520;
                Map<String, String> msgRecordMd5UrlMap2 = QQMessageUtils.getMsgRecordMd5UrlMap(XposedHelpers.callMethod(obj, AbstractC8405.m13972(164), new Object[0]));
                if (!msgRecordMd5UrlMap2.isEmpty()) {
                    AbstractC8721.m14428(msgRecordMd5UrlMap2);
                }
                break;
        }
        return null;
    }
}
