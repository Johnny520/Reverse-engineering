package p013;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p015.C6212;
import p015.C6222;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6176 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List f16858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f16859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f16860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f16861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5851 f16862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6212 f16863;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f16864;

    public C6176(C6212 c6212, C5851 c5851, C6177 c6177, boolean z) {
        List listM11709;
        c5851.getClass();
        this.f16863 = c6212;
        this.f16862 = c5851;
        this.f16861 = z;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f16860 = emptyList;
        this.f16858 = emptyList;
        this.f16864 = new ArrayList();
        C6222 c6222 = c6212.f17054;
        c6222.getClass();
        URI uriM11674 = c6222.m11674();
        if (uriM11674.getHost() == null) {
            listM11709 = AbstractC6238.m11709(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c6212.f17055.select(uriM11674);
            listM11709 = (listSelect == null || listSelect.isEmpty()) ? AbstractC6238.m11709(new Proxy[]{Proxy.NO_PROXY}) : AbstractC6238.m11711(listSelect);
        }
        this.f16860 = listM11709;
        this.f16859 = 0;
        listM11709.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11612() {
        return this.f16859 < this.f16860.size() || !this.f16864.isEmpty();
    }
}
