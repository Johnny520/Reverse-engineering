package p350;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8867 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f24977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24979;

    public /* synthetic */ C8867(Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, int i) {
        this.f24979 = i;
        this.f24978 = ref$ObjectRef;
        this.f24977 = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, 飘花落叶言苏哲子楪世兰.飘花落叶言子楪世苏哲兰] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, 飘花落叶言苏哲子楪世兰.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14515(int i, String str, ArrayList arrayList) {
        int i2 = this.f24979;
        CountDownLatch countDownLatch = this.f24977;
        Ref$ObjectRef ref$ObjectRef = this.f24978;
        AbstractC3056.m6668(-3937826738059609511L);
        AbstractC3056.m6668(-3937700152488494503L);
        switch (i2) {
            case 0:
                ref$ObjectRef.element = new C8868(i, str, arrayList);
                countDownLatch.countDown();
                break;
            default:
                ref$ObjectRef.element = new C8868(i, str, arrayList);
                countDownLatch.countDown();
                break;
        }
    }
}
