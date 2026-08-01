package p007;

import okio.ByteString;
import p004.InterfaceC6111;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6123 extends AbstractC6133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ByteString f16707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6144 f16708;

    public C6123(C6144 c6144, ByteString byteString) {
        this.f16708 = c6144;
        this.f16707 = byteString;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11152(InterfaceC6111 interfaceC6111) {
        interfaceC6111.mo11459(this.f16707);
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6144 mo11153() {
        return this.f16708;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11154() {
        return this.f16707.size();
    }
}
