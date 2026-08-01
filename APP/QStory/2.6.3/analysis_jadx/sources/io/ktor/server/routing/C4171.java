package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3055;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4171 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4161 f12629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f12630;

    public C4171(String str) {
        str.getClass();
        C4158 c4158 = C4158.f12596;
        List<C4159> list = AbstractC3933.m8295(str).f12597;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        for (C4159 c4159 : list) {
            if (c4159.f12598 != RoutingPathSegmentKind.Constant) {
                C5925.m11310("rootPath should be constant, no wildcards supported.");
                throw null;
            }
            arrayList.add(c4159.f12599);
        }
        this.f12630 = arrayList;
        this.f12629 = new C4161(1.0d, arrayList.size(), 2);
    }

    public final String toString() {
        return AbstractC4344.m8810(this.f12630, "/", null, null, null, 62);
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4160 mo6674(C4142 c4142, int i) {
        if (i != 0) {
            C5925.m11311("Root selector should be evaluated first.");
            return null;
        }
        ArrayList arrayList = this.f12630;
        if (arrayList.isEmpty()) {
            return AbstractC4160.f12602;
        }
        List list = c4142.f12553;
        if (list.size() < arrayList.size()) {
            return AbstractC4160.f12605;
        }
        int size = arrayList.size() + i;
        while (i < size) {
            if (!AbstractC4395.m8907(list.get(i), arrayList.get(i))) {
                return AbstractC4160.f12605;
            }
            i++;
        }
        return this.f12629;
    }
}
