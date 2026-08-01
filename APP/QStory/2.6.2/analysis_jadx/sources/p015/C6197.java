package p015;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p005.C6099;
import p005.C6117;
import p005.InterfaceC6120;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6197 extends AbstractC6206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ File f16948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6217 f16949;

    public C6197(C6217 c6217, File file) {
        this.f16949 = c6217;
        this.f16948 = file;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11095(InterfaceC6120 interfaceC6120) throws IOException {
        File file = this.f16948;
        file.getClass();
        C6117 c6117 = new C6117(new FileInputStream(file), C6099.f16653);
        try {
            interfaceC6120.mo11495(c6117);
            c6117.close();
        } finally {
        }
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6217 mo11096() {
        return this.f16949;
    }

    @Override // p015.AbstractC6206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11097() {
        return this.f16948.length();
    }
}
