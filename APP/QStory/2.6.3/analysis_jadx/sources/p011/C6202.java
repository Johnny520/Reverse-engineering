package p011;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p007.C6139;
import p007.C6149;
import p013.AbstractC6230;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List f17063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f17064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f17065;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f17066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5856 f17067;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6139 f17068;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f17069;

    public C6202(C6139 c6139, C5856 c5856, C6203 c6203, boolean z) {
        List listM11701;
        c5856.getClass();
        this.f17068 = c6139;
        this.f17067 = c5856;
        this.f17066 = z;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f17065 = emptyList;
        this.f17063 = emptyList;
        this.f17069 = new ArrayList();
        C6149 c6149 = c6139.f16815;
        c6149.getClass();
        URI uriM11545 = c6149.m11545();
        if (uriM11545.getHost() == null) {
            listM11701 = AbstractC6230.m11701(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c6139.f16816.select(uriM11545);
            listM11701 = (listSelect == null || listSelect.isEmpty()) ? AbstractC6230.m11701(new Proxy[]{Proxy.NO_PROXY}) : AbstractC6230.m11703(listSelect);
        }
        this.f17065 = listM11701;
        this.f17064 = 0;
        listM11701.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11631() {
        return this.f17064 < this.f17065.size() || !this.f17069.isEmpty();
    }
}
