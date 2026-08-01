package p337;

import de.robv.android.xposed.XposedHelpers;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import lin.xposed.hook.util.p011qq.QQMessageUtils;
import p091.C7787;
import p339.AbstractC9550;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC9526 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24864;

    public /* synthetic */ CallableC9526(Object obj, int i) {
        this.f24864 = i;
        this.f24863 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f24864;
        Object obj = this.f24863;
        switch (i) {
            case 0:
                C7787 c7787 = C9527.f24865;
                ExecutorService executorService = AbstractC9550.f24916;
                Map<String, String> msgRecordMd5UrlMap = QQMessageUtils.getMsgRecordMd5UrlMap(obj);
                "getMsgRecordMd5UrlMap(...)";
                msgRecordMd5UrlMap.getClass();
                AbstractC9550.m14987(msgRecordMd5UrlMap);
                break;
            default:
                C7787 c77872 = C9527.f24865;
                Map<String, String> msgRecordMd5UrlMap2 = QQMessageUtils.getMsgRecordMd5UrlMap(XposedHelpers.callMethod(obj, "getMsgRecord", new Object[0]));
                if (!msgRecordMd5UrlMap2.isEmpty()) {
                    AbstractC9550.m14987(msgRecordMd5UrlMap2);
                }
                break;
        }
        return null;
    }
}
