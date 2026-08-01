package p324;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import lin.xposed.hook.util.qq.QQMessageUtils;
import p075.C6960;
import p319.AbstractC8699;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC8747 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f24651;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24652;

    public /* synthetic */ CallableC8747(Object obj, int i) {
        this.f24652 = i;
        this.f24651 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f24652;
        Object obj = this.f24651;
        switch (i) {
            case 0:
                C6960 c6960 = C8748.f24653;
                ExecutorService executorService = AbstractC8699.f24528;
                Map<String, String> msgRecordMd5UrlMap = QQMessageUtils.getMsgRecordMd5UrlMap(obj);
                "getMsgRecordMd5UrlMap(...)";
                msgRecordMd5UrlMap.getClass();
                AbstractC8699.m14380(msgRecordMd5UrlMap);
                break;
            default:
                C6960 c69602 = C8748.f24653;
                Map<String, String> msgRecordMd5UrlMap2 = QQMessageUtils.getMsgRecordMd5UrlMap(XposedHelpers.callMethod(obj, "getMsgRecord", new Object[0]));
                if (!msgRecordMd5UrlMap2.isEmpty()) {
                    AbstractC8699.m14380(msgRecordMd5UrlMap2);
                }
                break;
        }
        return null;
    }
}
