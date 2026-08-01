package p036;

import java.io.IOException;
import p020.C6919;
import p020.C6921;
import p020.C6928;
import p020.C6942;
import p020.InterfaceC6930;
import p023.C6956;
import p023.C6967;
import p023.C6978;
import p023.C6980;
import p028.AbstractC7051;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7119 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C7120 f17707;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6942 f17708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17709;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6978 f17710;

    public AbstractC7119(C7120 c7120, C6978 c6978) {
        c6978.getClass();
        this.f17707 = c7120;
        this.f17710 = c6978;
        this.f17708 = new C6942(((C6928) c7120.f17714.f665).f17018.mo11492());
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public long mo11491(C6921 c6921, long j) throws IOException {
        C7120 c7120 = this.f17707;
        c6921.getClass();
        try {
            return ((C6928) c7120.f17714.f665).mo11491(c6921, j);
        } catch (IOException e) {
            c7120.f17715.mo12180();
            this.m12376(C7120.f17711);
            throw e;
        }
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17708;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12376(C6980 c6980) {
        C6956 c6956;
        C6967 c6967;
        c6980.getClass();
        C7120 c7120 = this.f17707;
        int i = c7120.f17713;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            C6755.m11864(c7120.f17713, "state: ");
            return;
        }
        C6942 c6942 = this.f17708;
        C6919 c6919 = c6942.f17039;
        c6942.f17039 = C6919.f16988;
        c6919.mo12013();
        c6919.mo12012();
        c7120.f17713 = 6;
        if (c6980.size() <= 0 || (c6956 = c7120.f17716) == null || (c6967 = c6956.f17093) == null) {
            return;
        }
        AbstractC7051.m12233(c6967, this.f17710, c6980);
    }
}
