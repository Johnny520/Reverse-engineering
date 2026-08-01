package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C1171;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5687;
import p068.InterfaceC7387;
import p086.InterfaceC7737;
import p092.C7794;
import p095.AbstractC7818;
import p117.C8077;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5629 extends AbstractC5627 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5679 f14327;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC5693 f14328;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5679 f14329;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C5633 f14330;

    public C5629(C5633 c5633, AbstractC5693 abstractC5693) {
        this.f14330 = c5633;
        C5656 c5656 = c5633.f14339;
        ProtoBuf$Class protoBuf$Class = c5633.f14348;
        List<ProtoBuf$Function> functionList = protoBuf$Class.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Class.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Class.getTypeAliasList();
        typeAliasList.getClass();
        List<Integer> nestedClassNameList = protoBuf$Class.getNestedClassNameList();
        nestedClassNameList.getClass();
        InterfaceC7737 interfaceC7737 = c5633.f14339.f14406;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(nestedClassNameList, 10));
        Iterator<T> it = nestedClassNameList.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4765.m8875(interfaceC7737, ((Number) it.next()).intValue()));
        }
        int i = 0;
        super(c5656, functionList, propertyList, typeAliasList, new C5614(arrayList, i));
        C5665 c5665 = c5656.f14407;
        this.f14328 = abstractC5693;
        C5677 c5677 = c5665.f14437;
        C5613 c5613 = new C5613(this, i);
        c5677.getClass();
        this.f14327 = new C5679(c5677, c5613);
        C5677 c56772 = c5665.f14437;
        C5613 c56132 = new C5613(this, 1);
        c56772.getClass();
        this.f14329 = new C5679(c56772, c56132);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627, p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        m10094(c5523, noLookupLocation);
        return super.mo9724(c5523, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627, p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        m10094(c5523, noLookupLocation);
        return super.mo9726(c5523, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627, p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        AbstractC7818 abstractC7818;
        c5523.getClass();
        noLookupLocation.getClass();
        m10094(c5523, noLookupLocation);
        C1171 c1171 = this.f14330.f14347;
        return (c1171 == null || (abstractC7818 = (AbstractC7818) ((C5680) c1171.f1441).invoke(c5523)) == null) ? super.mo9714(c5523, noLookupLocation) : abstractC7818;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        return (Collection) this.f14327.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m10094(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        C7794 c7794 = this.f14322.f14407.f14450;
        c7794.getClass();
        this.f14330.getClass();
        if (c7794 == C7794.f18999) {
            return;
        }
        noLookupLocation.getLocation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Set mo10083() {
        List listMo10053 = this.f14330.f14337.mo10053();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo10053.iterator();
        while (it.hasNext()) {
            Set setMo9725 = ((AbstractC5714) it.next()).mo10283().mo9725();
            if (setMo9725 == null) {
                return null;
            }
            AbstractC5176.m9363(setMo9725, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10086(C5626 c5626) {
        return this.f14322.f14407.f14444.mo9521(this.f14330, c5626);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo10087() {
        C5633 c5633 = this.f14330;
        List listMo10053 = c5633.f14337.mo10053();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo10053.iterator();
        while (it.hasNext()) {
            AbstractC5176.m9363(((AbstractC5714) it.next()).mo10283().mo9727(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f14322.f14407.f14440.mo9518(c5633));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Set mo10088() {
        List listMo10053 = this.f14330.f14337.mo10053();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo10053.iterator();
        while (it.hasNext()) {
            AbstractC5176.m9363(((AbstractC5714) it.next()).mo10283().mo9731(), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10089(ArrayList arrayList, InterfaceC7387 interfaceC7387) {
        ?? arrayList2;
        C1171 c1171 = this.f14330.f14347;
        if (c1171 != null) {
            Set<C5523> setKeySet = ((LinkedHashMap) c1171.f1440).keySet();
            arrayList2 = new ArrayList();
            for (C5523 c5523 : setKeySet) {
                c5523.getClass();
                AbstractC7818 abstractC7818 = (AbstractC7818) ((C5680) c1171.f1441).invoke(c5523);
                if (abstractC7818 != null) {
                    arrayList2.add(abstractC7818);
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

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo10090(ArrayList arrayList, C5523 c5523) {
        c5523.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f14329.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC5714) it.next()).mo10283().mo9726(c5523, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C5687) this.f14322.f14407.f14442).f14481.m12712(c5523, arrayList2, arrayList3, this.f14330, new C5630(arrayList, 0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final C5520 mo10091(C5523 c5523) {
        c5523.getClass();
        return this.f14330.f14349.m9884(c5523);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10093(ArrayList arrayList, C5523 c5523) {
        c5523.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f14329.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC5714) it.next()).mo10283().mo9724(c5523, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        C5656 c5656 = this.f14322;
        arrayList.addAll(c5656.f14407.f14440.mo9519(c5523, this.f14330));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C5687) c5656.f14407.f14442).f14481.m12712(c5523, arrayList2, arrayList3, this.f14330, new C5630(arrayList, 0));
    }
}
