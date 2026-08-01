package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4854;
import p052.InterfaceC6557;
import p070.InterfaceC6907;
import p076.C6964;
import p079.AbstractC6988;
import p101.C7247;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4796 extends AbstractC4794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4846 f13978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC4860 f13979;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4846 f13980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C4800 f13981;

    public C4796(C4800 c4800, AbstractC4860 abstractC4860) {
        this.f13981 = c4800;
        C4823 c4823 = c4800.f13990;
        ProtoBuf$Class protoBuf$Class = c4800.f13999;
        List<ProtoBuf$Function> functionList = protoBuf$Class.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Class.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Class.getTypeAliasList();
        typeAliasList.getClass();
        List<Integer> nestedClassNameList = protoBuf$Class.getNestedClassNameList();
        nestedClassNameList.getClass();
        InterfaceC6907 interfaceC6907 = c4800.f13990.f14057;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(nestedClassNameList, 10));
        Iterator<T> it = nestedClassNameList.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC7738.m13047(interfaceC6907, ((Number) it.next()).intValue()));
        }
        int i = 0;
        super(c4823, functionList, propertyList, typeAliasList, new C4781(arrayList, i));
        C4832 c4832 = c4823.f14058;
        this.f13979 = abstractC4860;
        C4844 c4844 = c4832.f14088;
        C4780 c4780 = new C4780(this, i);
        c4844.getClass();
        this.f13978 = new C4846(c4844, c4780);
        C4844 c48442 = c4832.f14088;
        C4780 c47802 = new C4780(this, 1);
        c48442.getClass();
        this.f13980 = new C4846(c48442, c47802);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794, p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        m9545(c4690, noLookupLocation);
        return super.mo9175(c4690, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794, p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        m9545(c4690, noLookupLocation);
        return super.mo9177(c4690, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794, p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        AbstractC6988 abstractC6988;
        c4690.getClass();
        noLookupLocation.getClass();
        m9545(c4690, noLookupLocation);
        C0325 c0325 = this.f13981.f13998;
        return (c0325 == null || (abstractC6988 = (AbstractC6988) ((C4847) c0325.f1096).invoke(c4690)) == null) ? super.mo9165(c4690, noLookupLocation) : abstractC6988;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        return (Collection) this.f13978.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m9545(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        C6964 c6964 = this.f13973.f14058.f14101;
        c6964.getClass();
        this.f13981.getClass();
        if (c6964 == C6964.f18659) {
            return;
        }
        noLookupLocation.getLocation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Set mo9534() {
        List listMo9504 = this.f13981.f13988.mo9504();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo9504.iterator();
        while (it.hasNext()) {
            Set setMo9176 = ((AbstractC4881) it.next()).mo9734().mo9176();
            if (setMo9176 == null) {
                return null;
            }
            AbstractC4343.m8794(setMo9176, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo9537(C4793 c4793) {
        return this.f13973.f14058.f14095.mo8972(this.f13981, c4793);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo9538() {
        C4800 c4800 = this.f13981;
        List listMo9504 = c4800.f13988.mo9504();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo9504.iterator();
        while (it.hasNext()) {
            AbstractC4343.m8794(((AbstractC4881) it.next()).mo9734().mo9178(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13973.f14058.f14091.mo8969(c4800));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Set mo9539() {
        List listMo9504 = this.f13981.f13988.mo9504();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo9504.iterator();
        while (it.hasNext()) {
            AbstractC4343.m8794(((AbstractC4881) it.next()).mo9734().mo9182(), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo9540(ArrayList arrayList, InterfaceC6557 interfaceC6557) {
        ?? arrayList2;
        C0325 c0325 = this.f13981.f13998;
        if (c0325 != null) {
            Set<C4690> setKeySet = ((LinkedHashMap) c0325.f1095).keySet();
            arrayList2 = new ArrayList();
            for (C4690 c4690 : setKeySet) {
                c4690.getClass();
                AbstractC6988 abstractC6988 = (AbstractC6988) ((C4847) c0325.f1096).invoke(c4690);
                if (abstractC6988 != null) {
                    arrayList2.add(abstractC6988);
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

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo9541(ArrayList arrayList, C4690 c4690) {
        c4690.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f13980.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC4881) it.next()).mo9734().mo9177(c4690, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C4854) this.f13973.f14058.f14093).f14132.m12125(c4690, arrayList2, arrayList3, this.f13981, new C4797(arrayList, 0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final C4687 mo9542(C4690 c4690) {
        c4690.getClass();
        return this.f13981.f14000.m9335(c4690);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo9544(ArrayList arrayList, C4690 c4690) {
        c4690.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f13980.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC4881) it.next()).mo9734().mo9175(c4690, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        C4823 c4823 = this.f13973;
        arrayList.addAll(c4823.f14058.f14091.mo8970(c4690, this.f13981));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C4854) c4823.f14058.f14093).f14132.m12125(c4690, arrayList2, arrayList3, this.f13981, new C4797(arrayList, 0));
    }
}
