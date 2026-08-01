package io.ktor.http.cio;

import kotlinx.p010io.InterfaceC6313;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4797 extends AbstractC4800 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6313 f12545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12546;

    public C4797(InterfaceC6313 interfaceC6313, int i) {
        this.f12546 = i;
        switch (i) {
            case 1:
                this.f12545 = interfaceC6313;
                break;
            default:
                interfaceC6313.getClass();
                this.f12545 = interfaceC6313;
                break;
        }
    }

    @Override // io.ktor.http.cio.AbstractC4800
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8916() throws Exception {
        int i = this.f12546;
        InterfaceC6313 interfaceC6313 = this.f12545;
        switch (i) {
            case 0:
                interfaceC6313.close();
                break;
            default:
                interfaceC6313.close();
                break;
        }
    }
}
