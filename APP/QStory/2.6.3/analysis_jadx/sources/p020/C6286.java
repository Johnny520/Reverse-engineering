package p020;

import p004.C6090;
import p004.C6092;
import p004.C6107;
import p004.C6113;
import p004.InterfaceC6103;
import p013.AbstractC6225;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6286 implements InterfaceC6103 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f17351;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6291 f17352;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6113 f17353;

    public C6286(C6291 c6291) {
        this.f17352 = c6291;
        this.f17353 = new C6113(((C6107) c6291.f17369.f318).f16688.mo10934());
    }

    @Override // p004.InterfaceC6103, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17351) {
            return;
        }
        this.f17351 = true;
        C6113 c6113 = this.f17353;
        C6090 c6090 = c6113.f16694;
        c6113.f16694 = C6090.f16643;
        c6090.mo11454();
        c6090.mo11453();
        this.f17352.f17368 = 3;
    }

    @Override // p004.InterfaceC6103, java.io.Flushable
    public final void flush() {
        if (this.f17351) {
            return;
        }
        ((C6107) this.f17352.f17369.f318).flush();
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10934() {
        return this.f17353;
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo10935(C6092 c6092, long j) {
        if (this.f17351) {
            C5925.m11311("closed");
        } else {
            AbstractC6225.m11681(c6092.f16647, 0L, j);
            ((C6107) this.f17352.f17369.f318).mo10935(c6092, j);
        }
    }
}
