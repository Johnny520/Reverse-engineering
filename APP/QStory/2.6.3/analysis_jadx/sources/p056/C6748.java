package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6748 implements InterfaceC6840 {
    public static final C6812 Companion = new C6812();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6816 f18175;

    public /* synthetic */ C6748(int i, InterfaceC6816 interfaceC6816) {
        if ((i & 1) == 0) {
            this.f18175 = Method$Defined.Ping;
        } else {
            this.f18175 = interfaceC6816;
        }
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18175;
    }
}
