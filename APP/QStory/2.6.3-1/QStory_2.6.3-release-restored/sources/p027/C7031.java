package p027;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p023.C6968;
import p023.C6978;
import p029.AbstractC7059;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7031 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List f17408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f17409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f17410;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f17411;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6686 f17412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6968 f17413;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f17414;

    public C7031(C6968 c6968, C6686 c6686, C7032 c7032, boolean z) {
        List listM12260;
        c6686.getClass();
        this.f17413 = c6968;
        this.f17412 = c6686;
        this.f17411 = z;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f17410 = emptyList;
        this.f17408 = emptyList;
        this.f17414 = new ArrayList();
        C6978 c6978 = c6968.f17160;
        c6978.getClass();
        URI uriM12104 = c6978.m12104();
        if (uriM12104.getHost() == null) {
            listM12260 = AbstractC7059.m12260(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c6968.f17161.select(uriM12104);
            listM12260 = (listSelect == null || listSelect.isEmpty()) ? AbstractC7059.m12260(new Proxy[]{Proxy.NO_PROXY}) : AbstractC7059.m12262(listSelect);
        }
        this.f17410 = listM12260;
        this.f17409 = 0;
        listM12260.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12190() {
        return this.f17409 < this.f17410.size() || !this.f17414.isEmpty();
    }
}
