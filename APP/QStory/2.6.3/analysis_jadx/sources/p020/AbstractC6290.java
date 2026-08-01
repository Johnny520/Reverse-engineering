package p020;

import java.io.IOException;
import p004.C6090;
import p004.C6092;
import p004.C6099;
import p004.C6113;
import p004.InterfaceC6101;
import p007.C6127;
import p007.C6138;
import p007.C6149;
import p007.C6151;
import p012.AbstractC6222;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6290 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C6291 f17362;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6113 f17363;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17364;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6149 f17365;

    public AbstractC6290(C6291 c6291, C6149 c6149) {
        c6149.getClass();
        this.f17362 = c6291;
        this.f17365 = c6149;
        this.f17363 = new C6113(((C6099) c6291.f17369.f320).f16673.mo10933());
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public long mo10932(C6092 c6092, long j) throws IOException {
        C6291 c6291 = this.f17362;
        c6092.getClass();
        try {
            return ((C6099) c6291.f17369.f320).mo10932(c6092, j);
        } catch (IOException e) {
            c6291.f17370.mo11621();
            this.m11817(C6291.f17366);
            throw e;
        }
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f17363;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11817(C6151 c6151) {
        C6127 c6127;
        C6138 c6138;
        c6151.getClass();
        C6291 c6291 = this.f17362;
        int i = c6291.f17368;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            C5925.m11305(c6291.f17368, "state: ");
            return;
        }
        C6113 c6113 = this.f17363;
        C6090 c6090 = c6113.f16694;
        c6113.f16694 = C6090.f16643;
        c6090.mo11454();
        c6090.mo11453();
        c6291.f17368 = 6;
        if (c6151.size() <= 0 || (c6127 = c6291.f17371) == null || (c6138 = c6127.f16748) == null) {
            return;
        }
        AbstractC6222.m11674(c6138, this.f17365, c6151);
    }
}
