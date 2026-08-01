package p023;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p020.C6919;
import p020.C6937;
import p020.InterfaceC6940;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6953 extends AbstractC6962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ File f17054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6973 f17055;

    public C6953(C6973 c6973, File file) {
        this.f17055 = c6973;
        this.f17054 = file;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11711(InterfaceC6940 interfaceC6940) throws IOException {
        File file = this.f17054;
        file.getClass();
        C6937 c6937 = new C6937(new FileInputStream(file), C6919.f16988);
        try {
            interfaceC6940.mo12027(c6937);
            c6937.close();
        } finally {
        }
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6973 mo11712() {
        return this.f17055;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11713() {
        return this.f17054.length();
    }
}
