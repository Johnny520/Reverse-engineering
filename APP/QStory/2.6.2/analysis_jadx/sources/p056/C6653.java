package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6653 implements InterfaceC6839 {
    public static final C6657 Companion = new C6657();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6815 f18057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7151 f18058;

    public C6653(int i, C7151 c7151, InterfaceC6815 interfaceC6815) {
        this.f18058 = (i & 1) == 0 ? AbstractC6601.f17981 : c7151;
        if ((i & 2) == 0) {
            this.f18057 = Method$Defined.RootsList;
        } else {
            this.f18057 = interfaceC6815;
        }
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18057;
    }
}
