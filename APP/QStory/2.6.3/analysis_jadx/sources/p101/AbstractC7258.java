package p101;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;
import p079.AbstractC7009;
import p103.C7270;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7258 implements InterfaceC7254 {
    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Set mo9166() {
        return null;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Set mo9168() {
        Collection collectionMo9169 = mo9169(C7248.f19319, C7270.f19368);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo9169) {
            if (obj instanceof InterfaceC4471) {
                C4691 name = ((AbstractC7009) ((InterfaceC4471) obj)).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Set mo9172() {
        Collection collectionMo9169 = mo9169(C7248.f19316, C7270.f19368);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo9169) {
            if (obj instanceof InterfaceC4471) {
                C4691 name = ((AbstractC7009) ((InterfaceC4471) obj)).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
