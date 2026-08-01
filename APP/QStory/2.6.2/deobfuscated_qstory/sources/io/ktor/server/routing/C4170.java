package io.ktor.server.routing;

import io.ktor.client.plugins.AbstractC3932;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4170 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4160 f12625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f12626;

    public C4170(String str) {
        str.getClass();
        C4157 c4157 = C4157.f12592;
        List<C4158> list = AbstractC6087.m11390(str).f12593;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        for (C4158 c4158 : list) {
            if (c4158.f12594 != RoutingPathSegmentKind.Constant) {
                C5919.m11249("rootPath should be constant, no wildcards supported.");
                throw null;
            }
            arrayList.add(c4158.f12595);
        }
        this.f12626 = arrayList;
        this.f12625 = new C4160(1.0d, arrayList.size(), 2);
    }

    public final String toString() {
        return AbstractC4343.m8813(this.f12626, "/", null, null, null, 62);
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4159 mo8329(C4141 c4141, int i) {
        if (i != 0) {
            C5919.m11250("Root selector should be evaluated first.");
            return null;
        }
        ArrayList arrayList = this.f12626;
        if (arrayList.isEmpty()) {
            return AbstractC4159.f12598;
        }
        List list = c4141.f12549;
        if (list.size() < arrayList.size()) {
            return AbstractC4159.f12601;
        }
        int size = arrayList.size() + i;
        while (i < size) {
            if (!AbstractC4394.m8917(list.get(i), arrayList.get(i))) {
                return AbstractC4159.f12601;
            }
            i++;
        }
        return this.f12625;
    }
}
