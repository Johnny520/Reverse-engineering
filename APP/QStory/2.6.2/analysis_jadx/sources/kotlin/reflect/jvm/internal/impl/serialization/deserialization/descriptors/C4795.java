package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3064;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4648;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import p015.C6230;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p070.AbstractC6902;
import p070.C6905;
import p070.InterfaceC6907;
import p079.AbstractC6985;
import p080.InterfaceC7021;
import p101.C7247;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4795 extends AbstractC4794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ProtoBuf$Package f13974;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4465 f13975;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f13976;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4686 f13977;

    public C4795(InterfaceC4465 interfaceC4465, ProtoBuf$Package protoBuf$Package, InterfaceC6907 interfaceC6907, AbstractC6902 abstractC6902, C4648 c4648, C4832 c4832, String str, InterfaceC6542 interfaceC6542) {
        interfaceC6907.getClass();
        abstractC6902.getClass();
        c4832.getClass();
        ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
        typeTable.getClass();
        C6230 c6230 = new C6230(typeTable);
        C6905 c6905 = C6905.f18426;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C6905 c6905M6644 = AbstractC3055.m6644(versionRequirementTable);
        c6905M6644.getClass();
        C4823 c4823 = new C4823(c4832, interfaceC6907, interfaceC4465, c6230, c6905M6644, abstractC6902, c4648, null, EmptyList.INSTANCE);
        List<ProtoBuf$Function> functionList = protoBuf$Package.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Package.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Package.getTypeAliasList();
        typeAliasList.getClass();
        super(c4823, functionList, propertyList, typeAliasList, interfaceC6542);
        this.f13975 = interfaceC4465;
        this.f13974 = protoBuf$Package;
        this.f13976 = str;
        this.f13977 = ((AbstractC6985) interfaceC4465).f18692;
    }

    public final String toString() {
        return this.f13976;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794, p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        AbstractC3064.m6783(this.f13973.f14058.f14101, noLookupLocation, this.f13975, c4690);
        return super.mo9165(c4690, noLookupLocation);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        List listM9543 = m9543(c7247, interfaceC6557, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterable = this.f13973.f14058.f14099;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC4343.m8794(((InterfaceC7021) it.next()).mo8976(this.f13977), arrayList);
        }
        return AbstractC4343.m8825(arrayList, listM9543);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Set mo9534() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9536(C4690 c4690) {
        c4690.getClass();
        if (m9535().contains(c4690)) {
            return true;
        }
        Iterable iterable = this.f13973.f14058.f14099;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7021) it.next()).mo8975(this.f13977, c4690)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo9538() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Set mo9539() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final C4687 mo9542(C4690 c4690) {
        c4690.getClass();
        return new C4687(this.f13977, c4690);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9540(ArrayList arrayList, InterfaceC6557 interfaceC6557) {
    }
}
