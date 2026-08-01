package p020;

import java.io.IOException;
import p004.C6092;
import p007.C6151;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6285 extends AbstractC6290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17350;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17364) {
            return;
        }
        if (!this.f17350) {
            m11817(C6291.f17366);
        }
        this.f17364 = true;
    }

    @Override // p020.AbstractC6290, p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        c6092.getClass();
        if (this.f17364) {
            C5925.m11311("closed");
            return 0L;
        }
        if (this.f17350) {
            return -1L;
        }
        long jMo10932 = super.mo10932(c6092, 8192L);
        if (jMo10932 != -1) {
            return jMo10932;
        }
        this.f17350 = true;
        m11817(C6151.f16892);
        return -1L;
    }
}
