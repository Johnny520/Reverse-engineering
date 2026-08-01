package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C0325;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4855;
import p052.InterfaceC6558;
import p070.InterfaceC6908;
import p076.C6965;
import p079.AbstractC6989;
import p101.C7248;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4797 extends AbstractC4795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4847 f13982;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC4861 f13983;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4847 f13984;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C4801 f13985;

    public C4797(C4801 c4801, AbstractC4861 abstractC4861) {
        this.f13985 = c4801;
        C4824 c4824 = c4801.f13994;
        ProtoBuf$Class protoBuf$Class = c4801.f14003;
        List<ProtoBuf$Function> functionList = protoBuf$Class.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Class.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Class.getTypeAliasList();
        typeAliasList.getClass();
        List<Integer> nestedClassNameList = protoBuf$Class.getNestedClassNameList();
        nestedClassNameList.getClass();
        InterfaceC6908 interfaceC6908 = c4801.f13994.f14061;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(nestedClassNameList, 10));
        Iterator<T> it = nestedClassNameList.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3933.m8316(interfaceC6908, ((Number) it.next()).intValue()));
        }
        int i = 0;
        super(c4824, functionList, propertyList, typeAliasList, new C4782(arrayList, i));
        C4833 c4833 = c4824.f14062;
        this.f13983 = abstractC4861;
        C4845 c4845 = c4833.f14092;
        C4781 c4781 = new C4781(this, i);
        c4845.getClass();
        this.f13982 = new C4847(c4845, c4781);
        C4845 c48452 = c4833.f14092;
        C4781 c47812 = new C4781(this, 1);
        c48452.getClass();
        this.f13984 = new C4847(c48452, c47812);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795, p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        m9535(c4691, noLookupLocation);
        return super.mo9165(c4691, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795, p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        m9535(c4691, noLookupLocation);
        return super.mo9167(c4691, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795, p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        AbstractC6989 abstractC6989;
        c4691.getClass();
        noLookupLocation.getClass();
        m9535(c4691, noLookupLocation);
        C0325 c0325 = this.f13985.f14002;
        return (c0325 == null || (abstractC6989 = (AbstractC6989) ((C4848) c0325.f1096).invoke(c4691)) == null) ? super.mo9155(c4691, noLookupLocation) : abstractC6989;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        return (Collection) this.f13982.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m9535(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        C6965 c6965 = this.f13977.f14062.f14105;
        c6965.getClass();
        this.f13985.getClass();
        if (c6965 == C6965.f18654) {
            return;
        }
        noLookupLocation.getLocation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Set mo9524() {
        List listMo9494 = this.f13985.f13992.mo9494();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo9494.iterator();
        while (it.hasNext()) {
            Set setMo9166 = ((AbstractC4882) it.next()).mo9724().mo9166();
            if (setMo9166 == null) {
                return null;
            }
            AbstractC4344.m8804(setMo9166, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo9527(C4794 c4794) {
        return this.f13977.f14062.f14099.mo8962(this.f13985, c4794);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo9528() {
        C4801 c4801 = this.f13985;
        List listMo9494 = c4801.f13992.mo9494();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo9494.iterator();
        while (it.hasNext()) {
            AbstractC4344.m8804(((AbstractC4882) it.next()).mo9724().mo9168(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13977.f14062.f14095.mo8959(c4801));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Set mo9529() {
        List listMo9494 = this.f13985.f13992.mo9494();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo9494.iterator();
        while (it.hasNext()) {
            AbstractC4344.m8804(((AbstractC4882) it.next()).mo9724().mo9172(), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9530(ArrayList arrayList, InterfaceC6558 interfaceC6558) {
        ?? arrayList2;
        C0325 c0325 = this.f13985.f14002;
        if (c0325 != null) {
            Set<C4691> setKeySet = ((LinkedHashMap) c0325.f1095).keySet();
            arrayList2 = new ArrayList();
            for (C4691 c4691 : setKeySet) {
                c4691.getClass();
                AbstractC6989 abstractC6989 = (AbstractC6989) ((C4848) c0325.f1096).invoke(c4691);
                if (abstractC6989 != null) {
                    arrayList2.add(abstractC6989);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = EmptyList.INSTANCE;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9531(ArrayList arrayList, C4691 c4691) {
        c4691.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f13984.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC4882) it.next()).mo9724().mo9167(c4691, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C4855) this.f13977.f14062.f14097).f14136.m12153(c4691, arrayList2, arrayList3, this.f13985, new C4798(arrayList, 0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final C4688 mo9532(C4691 c4691) {
        c4691.getClass();
        return this.f13985.f14004.m9325(c4691);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9534(ArrayList arrayList, C4691 c4691) {
        c4691.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f13984.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC4882) it.next()).mo9724().mo9165(c4691, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        C4824 c4824 = this.f13977;
        arrayList.addAll(c4824.f14062.f14095.mo8960(c4691, this.f13985));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C4855) c4824.f14062.f14097).f14136.m12153(c4691, arrayList2, arrayList3, this.f13985, new C4798(arrayList, 0));
    }
}
