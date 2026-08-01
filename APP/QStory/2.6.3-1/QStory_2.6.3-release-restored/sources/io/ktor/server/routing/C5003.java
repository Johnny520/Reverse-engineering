package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3887;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5003 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4993 f12974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f12975;

    public C5003(String str) {
        str.getClass();
        C4990 c4990 = C4990.f12941;
        List<C4991> list = AbstractC4765.m8854(str).f12942;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        for (C4991 c4991 : list) {
            if (c4991.f12943 != RoutingPathSegmentKind.Constant) {
                C6755.m11869("rootPath should be constant, no wildcards supported.");
                throw null;
            }
            arrayList.add(c4991.f12944);
        }
        this.f12975 = arrayList;
        this.f12974 = new C4993(1.0d, arrayList.size(), 2);
    }

    public final String toString() {
        return AbstractC5176.m9369(this.f12975, "/", null, null, null, 62);
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4992 mo7234(C4974 c4974, int i) {
        if (i != 0) {
            C6755.m11870("Root selector should be evaluated first.");
            return null;
        }
        ArrayList arrayList = this.f12975;
        if (arrayList.isEmpty()) {
            return AbstractC4992.f12947;
        }
        List list = c4974.f12898;
        if (list.size() < arrayList.size()) {
            return AbstractC4992.f12950;
        }
        int size = arrayList.size() + i;
        while (i < size) {
            if (!AbstractC5227.m9466(list.get(i), arrayList.get(i))) {
                return AbstractC4992.f12950;
            }
            i++;
        }
        return this.f12974;
    }
}
