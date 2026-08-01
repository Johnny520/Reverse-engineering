package p336;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9514 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f24836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24837;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24838;

    public /* synthetic */ C9514(Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, int i) {
        this.f24838 = i;
        this.f24837 = ref$ObjectRef;
        this.f24836 = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14967(int i, String str, ArrayList arrayList) {
        int i2 = this.f24838;
        CountDownLatch countDownLatch = this.f24836;
        Ref$ObjectRef ref$ObjectRef = this.f24837;
        "errMsg";
        "msgList";
        switch (i2) {
            case 0:
                ref$ObjectRef.element = new C9515(i, str, arrayList);
                countDownLatch.countDown();
                break;
            default:
                ref$ObjectRef.element = new C9515(i, str, arrayList);
                countDownLatch.countDown();
                break;
        }
    }
}
