package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import com.alibaba.fastjson2.AbstractC2905;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.checker.C4855;
import p034.AbstractC6347;
import p049.AbstractC6526;
import p052.InterfaceC6558;
import p065.C6869;
import p066.AbstractC6876;
import p079.C6992;
import p083.C7041;
import p101.C7248;
import p101.C7262;
import p103.AbstractC7275;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4572 extends AbstractC4571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f13324 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4452 f13325;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4600 f13326;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4572(C0325 c0325, C4452 c4452, C4600 c4600) {
        super(c0325, null);
        c4452.getClass();
        this.f13325 = c4452;
        this.f13326 = c4600;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static InterfaceC4473 m9154(InterfaceC4473 interfaceC4473) {
        if (interfaceC4473.getKind().isReal()) {
            return interfaceC4473;
        }
        Collection collectionMo9030 = interfaceC4473.mo9030();
        collectionMo9030.getClass();
        Collection<InterfaceC4473> collection = collectionMo9030;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(collection, 10));
        for (InterfaceC4473 interfaceC44732 : collection) {
            interfaceC44732.getClass();
            arrayList.add(m9154(interfaceC44732));
        }
        return (InterfaceC4473) AbstractC4344.m8779(AbstractC4344.m8797(AbstractC4344.m8784(arrayList)));
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4571, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo9152(ArrayList arrayList, C4691 c4691) {
        C4691 c46912;
        ArrayList arrayList2;
        C6992 c6992M12129;
        c4691.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1012 c1012 = new C1012(c4691, 10);
        C4600 c4600 = this.f13326;
        AbstractC7275.m12488(AbstractC6347.m11928(c4600), C4574.f13330, new C4573(c4600, linkedHashSet, c1012));
        boolean zIsEmpty = arrayList.isEmpty();
        C0325 c0325 = this.f13336;
        if (zIsEmpty) {
            ArrayList arrayList3 = arrayList;
            c46912 = c4691;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC4473 interfaceC4473M9154 = m9154((InterfaceC4473) obj);
                Object arrayList4 = linkedHashMap.get(interfaceC4473M9154);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(interfaceC4473M9154, arrayList4);
                }
                ((List) arrayList4).add(obj);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C7041 c7041 = (C7041) c0325.f1095;
                ArrayList arrayList6 = arrayList3;
                AbstractC4344.m8804(AbstractC2905.m6333(arrayList6, collection, c46912, c7041.f18889, ((C4855) c7041.f18899).f14136, this.f13326), arrayList5);
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList2.addAll(arrayList5);
        } else {
            C7041 c70412 = (C7041) c0325.f1095;
            c46912 = c4691;
            arrayList.addAll(AbstractC2905.m6333(arrayList, linkedHashSet, c4691, c70412.f18889, ((C4855) c70412.f18899).f14136, this.f13326));
            arrayList2 = arrayList;
        }
        if (this.f13325.f13083.isEnum() && c46912.equals(AbstractC6526.f17842) && (c6992M12129 = AbstractC6876.m12129(c4600)) != null) {
            arrayList2.add(c6992M12129);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo9156(LinkedHashSet linkedHashSet, C4691 c4691) {
        c4691.getClass();
        C4600 c4600 = this.f13326;
        C4572 c4572M13696 = AbstractC8190.m13696(c4600);
        Collection collectionM8788 = c4572M13696 == null ? EmptySet.INSTANCE : AbstractC4344.m8788(c4572M13696.mo9165(c4691, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        C7041 c7041 = (C7041) this.f13336.f1095;
        linkedHashSet.addAll(AbstractC2905.m6333(linkedHashSet, collectionM8788, c4691, c7041.f18889, ((C4855) c7041.f18899).f14136, this.f13326));
        if (this.f13325.f13083.isEnum()) {
            if (c4691.equals(AbstractC6526.f17841)) {
                linkedHashSet.add(AbstractC6876.m12133(c4600));
            } else if (c4691.equals(AbstractC6526.f17843)) {
                linkedHashSet.add(AbstractC6876.m12134(c4600));
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4499 mo9157() {
        return this.f13326;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Set mo9158(C7248 c7248) {
        c7248.getClass();
        Set setM8784 = AbstractC4344.m8784(((InterfaceC4581) this.f13333.invoke()).mo9182());
        C4599 c4599 = C4599.f13413;
        C4600 c4600 = this.f13326;
        AbstractC7275.m12488(AbstractC6347.m11928(c4600), C4574.f13330, new C4573(c4600, setM8784, c4599));
        if (this.f13325.f13083.isEnum()) {
            setM8784.add(AbstractC6526.f17842);
        }
        return setM8784;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Set mo9159(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC4581 mo9160() {
        return new C4583(this.f13325, C4599.f13414);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Set mo9161(C7248 c7248, C7262 c7262) {
        c7248.getClass();
        Set setM8784 = AbstractC4344.m8784(((InterfaceC4581) this.f13333.invoke()).mo9186());
        C4600 c4600 = this.f13326;
        C4572 c4572M13696 = AbstractC8190.m13696(c4600);
        Set setMo9168 = c4572M13696 != null ? c4572M13696.mo9168() : null;
        if (setMo9168 == null) {
            setMo9168 = EmptySet.INSTANCE;
        }
        setM8784.addAll(setMo9168);
        if (this.f13325.f13083.isEnum()) {
            setM8784.addAll(AbstractC6347.m11931(AbstractC6526.f17841, AbstractC6526.f17843));
        }
        C0325 c0325 = this.f13336;
        setM8784.addAll(((C6869) ((C7041) c0325.f1095).f18898).m12100(c4600, c0325));
        return setM8784;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo9162(ArrayList arrayList, C4691 c4691) {
        c4691.getClass();
        C0325 c0325 = this.f13336;
        ((C6869) ((C7041) c0325.f1095).f18898).m12095(this.f13326, c4691, arrayList, c0325);
    }
}
