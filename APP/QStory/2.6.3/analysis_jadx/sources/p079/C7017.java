package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7017 implements InterfaceC4475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18855;

    public C7017(List list, String str) {
        list.getClass();
        this.f18855 = list;
        this.f18854 = str;
        list.size();
        AbstractC4344.m8788(list).size();
    }

    public final String toString() {
        return this.f18854;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8952(C4687 c4687) {
        c4687.getClass();
        List list = this.f18855;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC4491.m9081((InterfaceC4475) it.next(), c4687)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8953(C4687 c4687, ArrayList arrayList) {
        c4687.getClass();
        for (InterfaceC4475 interfaceC4475 : this.f18855) {
            interfaceC4475.getClass();
            c4687.getClass();
            interfaceC4475.mo8953(c4687, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo8954(C4687 c4687, InterfaceC6558 interfaceC6558) {
        c4687.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.f18855.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC4475) it.next()).mo8954(c4687, interfaceC6558));
        }
        return hashSet;
    }
}
