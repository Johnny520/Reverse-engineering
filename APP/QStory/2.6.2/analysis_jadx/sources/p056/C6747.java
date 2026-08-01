package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6747 implements InterfaceC6839 {
    public static final C6811 Companion = new C6811();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6815 f18180;

    public /* synthetic */ C6747(int i, InterfaceC6815 interfaceC6815) {
        if ((i & 1) == 0) {
            this.f18180 = Method$Defined.Ping;
        } else {
            this.f18180 = interfaceC6815;
        }
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18180;
    }
}
