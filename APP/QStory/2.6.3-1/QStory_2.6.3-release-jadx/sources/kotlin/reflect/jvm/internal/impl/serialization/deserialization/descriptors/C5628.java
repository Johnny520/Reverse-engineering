package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5481;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import p023.C6986;
import p050.AbstractC7173;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p086.AbstractC7732;
import p086.C7735;
import p086.InterfaceC7737;
import p095.AbstractC7815;
import p096.InterfaceC7851;
import p117.C8077;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5628 extends AbstractC5627 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ProtoBuf$Package f14323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5298 f14324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f14325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5519 f14326;

    public C5628(InterfaceC5298 interfaceC5298, ProtoBuf$Package protoBuf$Package, InterfaceC7737 interfaceC7737, AbstractC7732 abstractC7732, C5481 c5481, C5665 c5665, String str, InterfaceC7372 interfaceC7372) {
        interfaceC7737.getClass();
        abstractC7732.getClass();
        c5665.getClass();
        ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
        typeTable.getClass();
        C6986 c6986 = new C6986(typeTable);
        C7735 c7735 = C7735.f18766;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C7735 c7735M12448 = AbstractC7173.m12448(versionRequirementTable);
        c7735M12448.getClass();
        C5656 c5656 = new C5656(c5665, interfaceC7737, interfaceC5298, c6986, c7735M12448, abstractC7732, c5481, null, EmptyList.INSTANCE);
        List<ProtoBuf$Function> functionList = protoBuf$Package.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Package.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Package.getTypeAliasList();
        typeAliasList.getClass();
        super(c5656, functionList, propertyList, typeAliasList, interfaceC7372);
        this.f14324 = interfaceC5298;
        this.f14323 = protoBuf$Package;
        this.f14325 = str;
        this.f14326 = ((AbstractC7815) interfaceC5298).f19032;
    }

    public final String toString() {
        return this.f14325;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627, p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        AbstractC8568.m13615(this.f14322.f14407.f14450, noLookupLocation, this.f14324, c5523);
        return super.mo9714(c5523, noLookupLocation);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        List listM10092 = m10092(c8077, interfaceC7387, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterable = this.f14322.f14407.f14448;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC5176.m9363(((InterfaceC7851) it.next()).mo9525(this.f14326), arrayList);
        }
        return AbstractC5176.m9352(arrayList, listM10092);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Set mo10083() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo10085(C5523 c5523) {
        c5523.getClass();
        if (m10084().contains(c5523)) {
            return true;
        }
        Iterable iterable = this.f14322.f14407.f14448;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7851) it.next()).mo9524(this.f14326, c5523)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo10087() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Set mo10088() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final C5520 mo10091(C5523 c5523) {
        c5523.getClass();
        return new C5520(this.f14326, c5523);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10089(ArrayList arrayList, InterfaceC7387 interfaceC7387) {
    }
}
