package p027;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import p031.AbstractC7065;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7042 extends AbstractC7065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C7043 f17477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7030 f17478;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7042(String str, InterfaceC7030 interfaceC7030, C7043 c7043) {
        super(str);
        this.f17478 = interfaceC7030;
        this.f17477 = c7043;
    }

    @Override // p031.AbstractC7065
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo12212() throws InterruptedException {
        C7028 c7028;
        InterfaceC7030 interfaceC7030 = this.f17478;
        try {
            c7028 = interfaceC7030.mo12181();
        } catch (Throwable th) {
            c7028 = new C7028(interfaceC7030, th, 2);
        }
        C7043 c7043 = this.f17477;
        if (!((CopyOnWriteArrayList) c7043.f17480).contains(interfaceC7030)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c7043.f17479).put(c7028);
        return -1L;
    }
}
