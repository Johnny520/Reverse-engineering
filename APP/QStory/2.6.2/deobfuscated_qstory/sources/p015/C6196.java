package p015;

import okio.ByteString;
import p005.InterfaceC6120;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6196 extends AbstractC6206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ByteString f16946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6217 f16947;

    public C6196(C6217 c6217, ByteString byteString) {
        this.f16947 = c6217;
        this.f16946 = byteString;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11095(InterfaceC6120 interfaceC6120) {
        interfaceC6120.mo11464(this.f16946);
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6217 mo11096() {
        return this.f16947;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11097() {
        return this.f16946.size();
    }
}
