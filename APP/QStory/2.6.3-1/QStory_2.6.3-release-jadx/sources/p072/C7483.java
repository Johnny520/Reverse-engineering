package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7483 implements InterfaceC7669 {
    public static final C7487 Companion = new C7487();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7645 f18397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7981 f18398;

    public C7483(int i, C7981 c7981, InterfaceC7645 interfaceC7645) {
        this.f18398 = (i & 1) == 0 ? AbstractC7431.f18321 : c7981;
        if ((i & 2) == 0) {
            this.f18397 = Method$Defined.RootsList;
        } else {
            this.f18397 = interfaceC7645;
        }
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18397;
    }
}
