package p023;

import okio.ByteString;
import p020.InterfaceC6940;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6952 extends AbstractC6962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ByteString f17052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6973 f17053;

    public C6952(C6973 c6973, ByteString byteString) {
        this.f17053 = c6973;
        this.f17052 = byteString;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11711(InterfaceC6940 interfaceC6940) {
        interfaceC6940.mo12018(this.f17052);
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6973 mo11712() {
        return this.f17053;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11713() {
        return this.f17052.size();
    }
}
