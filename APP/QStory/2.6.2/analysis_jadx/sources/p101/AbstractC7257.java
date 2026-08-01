package p101;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;
import p079.AbstractC7008;
import p103.C7269;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7257 implements InterfaceC7253 {
    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Set mo9176() {
        return null;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Set mo9178() {
        Collection collectionMo9179 = mo9179(C7247.f19324, C7269.f19373);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo9179) {
            if (obj instanceof InterfaceC4470) {
                C4690 name = ((AbstractC7008) ((InterfaceC4470) obj)).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Set mo9182() {
        Collection collectionMo9179 = mo9179(C7247.f19321, C7269.f19373);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo9179) {
            if (obj instanceof InterfaceC4470) {
                C4690 name = ((AbstractC7008) ((InterfaceC4470) obj)).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
