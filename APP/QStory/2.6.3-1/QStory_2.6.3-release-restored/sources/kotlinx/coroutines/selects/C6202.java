package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.InterfaceC6230;
import kotlinx.coroutines.internal.AbstractC6193;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7380 f15316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SuspendLambda f15317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f15318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7380 f15319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7380 f15320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f15322 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f15323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C6201 f15324;

    public C6202(C6201 c6201, Object obj, InterfaceC7380 interfaceC7380, InterfaceC7380 interfaceC73802, C5317 c5317, SuspendLambda suspendLambda, InterfaceC7380 interfaceC73803) {
        this.f15324 = c6201;
        this.f15321 = obj;
        this.f15320 = interfaceC7380;
        this.f15319 = interfaceC73802;
        this.f15318 = c5317;
        this.f15317 = suspendLambda;
        this.f15316 = interfaceC73803;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10984() {
        Object obj = this.f15323;
        if (obj instanceof AbstractC6193) {
            ((AbstractC6193) obj).mo10826(this.f15322, this.f15324.f15315);
            return;
        }
        InterfaceC6230 interfaceC6230 = obj instanceof InterfaceC6230 ? (InterfaceC6230) obj : null;
        if (interfaceC6230 != null) {
            interfaceC6230.dispose();
        }
    }
}
