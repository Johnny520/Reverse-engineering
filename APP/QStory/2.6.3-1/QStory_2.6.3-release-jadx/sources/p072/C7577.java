package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7577 implements InterfaceC7669 {
    public static final C7641 Companion = new C7641();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7645 f18520;

    public /* synthetic */ C7577(int i, InterfaceC7645 interfaceC7645) {
        if ((i & 1) == 0) {
            this.f18520 = Method$Defined.Ping;
        } else {
            this.f18520 = interfaceC7645;
        }
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18520;
    }
}
