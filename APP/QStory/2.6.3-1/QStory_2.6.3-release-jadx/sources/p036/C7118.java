package p036;

import p020.C6919;
import p020.C6921;
import p020.C6936;
import p020.C6942;
import p020.InterfaceC6932;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7118 implements InterfaceC6932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f17704;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7120 f17705;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6942 f17706;

    public C7118(C7120 c7120) {
        this.f17705 = c7120;
        this.f17706 = new C6942(((C6936) c7120.f17714.f663).f17033.mo11493());
    }

    @Override // p020.InterfaceC6932, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f17704) {
            return;
        }
        this.f17704 = true;
        ((C6936) this.f17705.f17714.f663).mo12022("0\r\n\r\n");
        C6942 c6942 = this.f17706;
        C6919 c6919 = c6942.f17039;
        c6942.f17039 = C6919.f16988;
        c6919.mo12013();
        c6919.mo12012();
        this.f17705.f17713 = 3;
    }

    @Override // p020.InterfaceC6932, java.io.Flushable
    public final synchronized void flush() {
        if (this.f17704) {
            return;
        }
        ((C6936) this.f17705.f17714.f663).flush();
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11493() {
        return this.f17706;
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11494(C6921 c6921, long j) {
        if (this.f17704) {
            C6755.m11870("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        C6936 c6936 = (C6936) this.f17705.f17714.f663;
        if (c6936.f17032) {
            C6755.m11870("closed");
            return;
        }
        c6936.f17031.m12020(j);
        c6936.m12067();
        c6936.mo12022("\r\n");
        c6936.mo11494(c6921, j);
        c6936.mo12022("\r\n");
    }
}
