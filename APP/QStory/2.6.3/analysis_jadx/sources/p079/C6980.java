package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p101.AbstractC7258;
import p101.C7248;
import p101.C7251;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6980 extends AbstractC7258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4687 f18676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4486 f18677;

    public C6980(InterfaceC4486 interfaceC4486, C4687 c4687) {
        interfaceC4486.getClass();
        c4687.getClass();
        this.f18677 = interfaceC4486;
        this.f18676 = c4687;
    }

    public final String toString() {
        return "subpackages of " + this.f18676 + " from " + this.f18677;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9166() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        if (!c7248.m12474(C7248.f19320)) {
            return EmptyList.INSTANCE;
        }
        C4687 c4687 = this.f18676;
        if (c4687.f13696.m9314() && c7248.f19327.contains(C7251.f19330)) {
            return EmptyList.INSTANCE;
        }
        InterfaceC4486 interfaceC4486 = this.f18677;
        Collection collectionMo9063 = interfaceC4486.mo9063(c4687, interfaceC6558);
        ArrayList arrayList = new ArrayList(collectionMo9063.size());
        Iterator it = collectionMo9063.iterator();
        while (it.hasNext()) {
            C4691 c4691M9318 = ((C4687) it.next()).f13696.m9318();
            if (((Boolean) interfaceC6558.invoke(c4691M9318)).booleanValue()) {
                C7004 c7004 = null;
                if (!c4691M9318.f13704) {
                    C7004 c7004Mo9062 = interfaceC4486.mo9062(c4687.m9321(c4691M9318));
                    if (!((Boolean) AbstractC6253.m11749(c7004Mo9062.f18813, C7004.f18810[1])).booleanValue()) {
                        c7004 = c7004Mo9062;
                    }
                }
                if (c7004 != null) {
                    arrayList.add(c7004);
                }
            }
        }
        return arrayList;
    }
}
