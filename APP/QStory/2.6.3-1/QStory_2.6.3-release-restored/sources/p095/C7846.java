package p095;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7846 implements InterfaceC5307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f19200;

    public C7846(List list, String str) {
        list.getClass();
        this.f19200 = list;
        this.f19199 = str;
        list.size();
        AbstractC5176.m9347(list).size();
    }

    public final String toString() {
        return this.f19199;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9511(C5519 c5519) {
        c5519.getClass();
        List list = this.f19200;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC5323.m9640((InterfaceC5307) it.next(), c5519)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9512(C5519 c5519, ArrayList arrayList) {
        c5519.getClass();
        for (InterfaceC5307 interfaceC5307 : this.f19200) {
            interfaceC5307.getClass();
            c5519.getClass();
            interfaceC5307.mo9512(c5519, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9513(C5519 c5519, InterfaceC7387 interfaceC7387) {
        c5519.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.f19200.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC5307) it.next()).mo9513(c5519, interfaceC7387));
        }
        return hashSet;
    }
}
