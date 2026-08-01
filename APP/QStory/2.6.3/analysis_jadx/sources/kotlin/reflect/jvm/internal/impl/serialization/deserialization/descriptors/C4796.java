package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4649;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import p007.C6157;
import p034.AbstractC6344;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p070.AbstractC6903;
import p070.C6906;
import p070.InterfaceC6908;
import p079.AbstractC6986;
import p080.InterfaceC7022;
import p101.C7248;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4796 extends AbstractC4795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ProtoBuf$Package f13978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4466 f13979;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f13980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4687 f13981;

    public C4796(InterfaceC4466 interfaceC4466, ProtoBuf$Package protoBuf$Package, InterfaceC6908 interfaceC6908, AbstractC6903 abstractC6903, C4649 c4649, C4833 c4833, String str, InterfaceC6543 interfaceC6543) {
        interfaceC6908.getClass();
        abstractC6903.getClass();
        c4833.getClass();
        ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
        typeTable.getClass();
        C6157 c6157 = new C6157(typeTable);
        C6906 c6906 = C6906.f18421;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C6906 c6906M11889 = AbstractC6344.m11889(versionRequirementTable);
        c6906M11889.getClass();
        C4824 c4824 = new C4824(c4833, interfaceC6908, interfaceC4466, c6157, c6906M11889, abstractC6903, c4649, null, EmptyList.INSTANCE);
        List<ProtoBuf$Function> functionList = protoBuf$Package.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Package.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Package.getTypeAliasList();
        typeAliasList.getClass();
        super(c4824, functionList, propertyList, typeAliasList, interfaceC6543);
        this.f13979 = interfaceC4466;
        this.f13978 = protoBuf$Package;
        this.f13980 = str;
        this.f13981 = ((AbstractC6986) interfaceC4466).f18687;
    }

    public final String toString() {
        return this.f13980;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795, p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        AbstractC7739.m13056(this.f13977.f14062.f14105, noLookupLocation, this.f13979, c4691);
        return super.mo9155(c4691, noLookupLocation);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        List listM9533 = m9533(c7248, interfaceC6558, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterable = this.f13977.f14062.f14103;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC4344.m8804(((InterfaceC7022) it.next()).mo8966(this.f13981), arrayList);
        }
        return AbstractC4344.m8793(arrayList, listM9533);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Set mo9524() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9526(C4691 c4691) {
        c4691.getClass();
        if (m9525().contains(c4691)) {
            return true;
        }
        Iterable iterable = this.f13977.f14062.f14103;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7022) it.next()).mo8965(this.f13981, c4691)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo9528() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Set mo9529() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final C4688 mo9532(C4691 c4691) {
        c4691.getClass();
        return new C4688(this.f13981, c4691);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9530(ArrayList arrayList, InterfaceC6558 interfaceC6558) {
    }
}
