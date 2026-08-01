package p013;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import p012.AbstractC6167;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6187 extends AbstractC6167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C6188 f16926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6174 f16927;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6187(String str, InterfaceC6174 interfaceC6174, C6188 c6188) {
        super(str);
        this.f16927 = interfaceC6174;
        this.f16926 = c6188;
    }

    @Override // p012.AbstractC6167
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11595() throws InterruptedException {
        C6175 c6175;
        InterfaceC6174 interfaceC6174 = this.f16927;
        try {
            c6175 = interfaceC6174.mo11603();
        } catch (Throwable th) {
            c6175 = new C6175(interfaceC6174, th, 2);
        }
        C6188 c6188 = this.f16926;
        if (!((CopyOnWriteArrayList) c6188.f16929).contains(interfaceC6174)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c6188.f16928).put(c6175);
        return -1L;
    }
}
