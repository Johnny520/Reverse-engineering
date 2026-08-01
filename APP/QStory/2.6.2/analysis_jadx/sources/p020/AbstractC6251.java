package p020;

import java.io.IOException;
import p005.C6099;
import p005.C6101;
import p005.C6108;
import p005.C6122;
import p005.InterfaceC6110;
import p015.C6200;
import p015.C6211;
import p015.C6222;
import p015.C6224;
import p021.AbstractC6260;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6251 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C6252 f17215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6122 f17216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6222 f17218;

    public AbstractC6251(C6252 c6252, C6222 c6222) {
        c6222.getClass();
        this.f17215 = c6252;
        this.f17218 = c6222;
        this.f17216 = new C6122(((C6108) c6252.f17222.f320).f16683.mo10875());
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f17216;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11726(C6224 c6224) {
        C6200 c6200;
        C6211 c6211;
        c6224.getClass();
        C6252 c6252 = this.f17215;
        int i = c6252.f17221;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            C5919.m11244(c6252.f17221, "state: ");
            return;
        }
        C6122 c6122 = this.f17216;
        C6099 c6099 = c6122.f16704;
        c6122.f16704 = C6099.f16653;
        c6099.mo11461();
        c6099.mo11460();
        c6252.f17221 = 6;
        if (c6224.size() <= 0 || (c6200 = c6252.f17224) == null || (c6211 = c6200.f16987) == null) {
            return;
        }
        AbstractC6260.m11744(c6211, this.f17218, c6224);
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public long mo10876(C6101 c6101, long j) throws IOException {
        C6252 c6252 = this.f17215;
        c6101.getClass();
        try {
            return ((C6108) c6252.f17222.f320).mo10876(c6101, j);
        } catch (IOException e) {
            c6252.f17223.mo11602();
            this.m11726(C6252.f17219);
            throw e;
        }
    }
}
