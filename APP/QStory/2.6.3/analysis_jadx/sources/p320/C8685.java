package p320;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8685 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f24491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24493;

    public /* synthetic */ C8685(Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, int i) {
        this.f24493 = i;
        this.f24492 = ref$ObjectRef;
        this.f24491 = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14408(int i, String str, ArrayList arrayList) {
        int i2 = this.f24493;
        CountDownLatch countDownLatch = this.f24491;
        Ref$ObjectRef ref$ObjectRef = this.f24492;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵呜呜");
        AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        switch (i2) {
            case 0:
                ref$ObjectRef.element = new C8686(i, str, arrayList);
                countDownLatch.countDown();
                break;
            default:
                ref$ObjectRef.element = new C8686(i, str, arrayList);
                countDownLatch.countDown();
                break;
        }
    }
}
