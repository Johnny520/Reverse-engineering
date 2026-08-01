package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6654 implements InterfaceC6840 {
    public static final C6658 Companion = new C6658();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6816 f18052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7152 f18053;

    public C6654(int i, C7152 c7152, InterfaceC6816 interfaceC6816) {
        this.f18053 = (i & 1) == 0 ? AbstractC6602.f17976 : c7152;
        if ((i & 2) == 0) {
            this.f18052 = Method$Defined.RootsList;
        } else {
            this.f18052 = interfaceC6816;
        }
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18052;
    }
}
