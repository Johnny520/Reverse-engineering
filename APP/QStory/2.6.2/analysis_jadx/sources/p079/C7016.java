package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7016 implements InterfaceC4474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18860;

    public C7016(List list, String str) {
        list.getClass();
        this.f18860 = list;
        this.f18859 = str;
        list.size();
        AbstractC4343.m8800(list).size();
    }

    public final String toString() {
        return this.f18859;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8962(C4686 c4686) {
        c4686.getClass();
        List list = this.f18860;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC4490.m9091((InterfaceC4474) it.next(), c4686)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8963(C4686 c4686, ArrayList arrayList) {
        c4686.getClass();
        for (InterfaceC4474 interfaceC4474 : this.f18860) {
            interfaceC4474.getClass();
            c4686.getClass();
            interfaceC4474.mo8963(c4686, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8964(C4686 c4686, InterfaceC6557 interfaceC6557) {
        c4686.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.f18860.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC4474) it.next()).mo8964(c4686, interfaceC6557));
        }
        return hashSet;
    }
}
