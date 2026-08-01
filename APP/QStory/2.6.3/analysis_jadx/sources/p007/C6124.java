package p007;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p004.C6090;
import p004.C6108;
import p004.InterfaceC6111;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6124 extends AbstractC6133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ File f16709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6144 f16710;

    public C6124(C6144 c6144, File file) {
        this.f16710 = c6144;
        this.f16709 = file;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11152(InterfaceC6111 interfaceC6111) throws IOException {
        File file = this.f16709;
        file.getClass();
        C6108 c6108 = new C6108(new FileInputStream(file), C6090.f16643);
        try {
            interfaceC6111.mo11468(c6108);
            c6108.close();
        } finally {
        }
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6144 mo11153() {
        return this.f16710;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11154() {
        return this.f16709.length();
    }
}
