package p079;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;
import p101.AbstractC7257;
import p101.C7247;
import p101.C7250;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6979 extends AbstractC7257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4686 f18681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4485 f18682;

    public C6979(InterfaceC4485 interfaceC4485, C4686 c4686) {
        interfaceC4485.getClass();
        c4686.getClass();
        this.f18682 = interfaceC4485;
        this.f18681 = c4686;
    }

    public final String toString() {
        return "subpackages of " + this.f18681 + " from " + this.f18682;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9176() {
        return EmptySet.INSTANCE;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        if (!c7247.m12447(C7247.f19325)) {
            return EmptyList.INSTANCE;
        }
        C4686 c4686 = this.f18681;
        if (c4686.f13692.m9324() && c7247.f19332.contains(C7250.f19335)) {
            return EmptyList.INSTANCE;
        }
        InterfaceC4485 interfaceC4485 = this.f18682;
        Collection collectionMo9073 = interfaceC4485.mo9073(c4686, interfaceC6557);
        ArrayList arrayList = new ArrayList(collectionMo9073.size());
        Iterator it = collectionMo9073.iterator();
        while (it.hasNext()) {
            C4690 c4690M9328 = ((C4686) it.next()).f13692.m9328();
            if (((Boolean) interfaceC6557.invoke(c4690M9328)).booleanValue()) {
                C7003 c7003 = null;
                if (!c4690M9328.f13700) {
                    C7003 c7003Mo9072 = interfaceC4485.mo9072(c4686.m9331(c4690M9328));
                    if (!((Boolean) AbstractC9124.m14672(c7003Mo9072.f18818, C7003.f18815[1])).booleanValue()) {
                        c7003 = c7003Mo9072;
                    }
                }
                if (c7003 != null) {
                    arrayList.add(c7003);
                }
            }
        }
        return arrayList;
    }
}
