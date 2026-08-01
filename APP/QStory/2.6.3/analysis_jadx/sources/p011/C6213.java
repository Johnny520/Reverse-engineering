package p011;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import p015.AbstractC6236;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6213 extends AbstractC6236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C6214 f17132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6201 f17133;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6213(String str, InterfaceC6201 interfaceC6201, C6214 c6214) {
        super(str);
        this.f17133 = interfaceC6201;
        this.f17132 = c6214;
    }

    @Override // p015.AbstractC6236
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11653() throws InterruptedException {
        C6199 c6199;
        InterfaceC6201 interfaceC6201 = this.f17133;
        try {
            c6199 = interfaceC6201.mo11622();
        } catch (Throwable th) {
            c6199 = new C6199(interfaceC6201, th, 2);
        }
        C6214 c6214 = this.f17132;
        if (!((CopyOnWriteArrayList) c6214.f17135).contains(interfaceC6201)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c6214.f17134).put(c6199);
        return -1L;
    }
}
