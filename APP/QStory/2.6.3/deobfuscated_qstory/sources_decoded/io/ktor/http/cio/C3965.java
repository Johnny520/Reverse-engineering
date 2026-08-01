package io.ktor.http.cio;

import kotlinx.io.InterfaceC5481;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3965 extends AbstractC3968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5481 f12200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12201;

    public C3965(InterfaceC5481 interfaceC5481, int i) {
        this.f12201 = i;
        switch (i) {
            case 1:
                this.f12200 = interfaceC5481;
                break;
            default:
                interfaceC5481.getClass();
                this.f12200 = interfaceC5481;
                break;
        }
    }

    @Override // io.ktor.http.cio.AbstractC3968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8357() throws Exception {
        int i = this.f12201;
        InterfaceC5481 interfaceC5481 = this.f12200;
        switch (i) {
            case 0:
                interfaceC5481.close();
                break;
            default:
                interfaceC5481.close();
                break;
        }
    }
}
