package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C1012;
import com.bumptech.glide.AbstractC3055;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.checker.C4854;
import p049.AbstractC6525;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p065.C6868;
import p066.AbstractC6875;
import p079.C6991;
import p083.C7040;
import p101.C7247;
import p101.C7261;
import p103.AbstractC7274;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4571 extends AbstractC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f13320 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4451 f13321;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4599 f13322;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4571(C0325 c0325, C4451 c4451, C4599 c4599) {
        super(c0325, null);
        c4451.getClass();
        this.f13321 = c4451;
        this.f13322 = c4599;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static InterfaceC4472 m9164(InterfaceC4472 interfaceC4472) {
        if (interfaceC4472.getKind().isReal()) {
            return interfaceC4472;
        }
        Collection collectionMo9040 = interfaceC4472.mo9040();
        collectionMo9040.getClass();
        Collection<InterfaceC4472> collection = collectionMo9040;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collection, 10));
        for (InterfaceC4472 interfaceC44722 : collection) {
            interfaceC44722.getClass();
            arrayList.add(m9164(interfaceC44722));
        }
        return (InterfaceC4472) AbstractC4343.m8818(AbstractC4343.m8804(AbstractC4343.m8801(arrayList)));
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4570, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo9162(ArrayList arrayList, C4690 c4690) {
        C4690 c46902;
        ArrayList arrayList2;
        C6991 c6991M12101;
        c4690.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1012 c1012 = new C1012(c4690, 10);
        C4599 c4599 = this.f13322;
        AbstractC7274.m12461(AbstractC8189.m13660(c4599), C4573.f13326, new C4572(c4599, linkedHashSet, c1012));
        boolean zIsEmpty = arrayList.isEmpty();
        C0325 c0325 = this.f13332;
        if (zIsEmpty) {
            ArrayList arrayList3 = arrayList;
            c46902 = c4690;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC4472 interfaceC4472M9164 = m9164((InterfaceC4472) obj);
                Object arrayList4 = linkedHashMap.get(interfaceC4472M9164);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(interfaceC4472M9164, arrayList4);
                }
                ((List) arrayList4).add(obj);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C7040 c7040 = (C7040) c0325.f1095;
                ArrayList arrayList6 = arrayList3;
                AbstractC4343.m8794(AbstractC6560.m12003(arrayList6, collection, c46902, c7040.f18894, ((C4854) c7040.f18904).f14132, this.f13322), arrayList5);
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList2.addAll(arrayList5);
        } else {
            C7040 c70402 = (C7040) c0325.f1095;
            c46902 = c4690;
            arrayList.addAll(AbstractC6560.m12003(arrayList, linkedHashSet, c4690, c70402.f18894, ((C4854) c70402.f18904).f14132, this.f13322));
            arrayList2 = arrayList;
        }
        if (this.f13321.f13079.isEnum() && c46902.equals(AbstractC6525.f17846) && (c6991M12101 = AbstractC6875.m12101(c4599)) != null) {
            arrayList2.add(c6991M12101);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo9166(LinkedHashSet linkedHashSet, C4690 c4690) {
        c4690.getClass();
        C4599 c4599 = this.f13322;
        C4571 c4571M6639 = AbstractC3055.m6639(c4599);
        Collection collectionM8800 = c4571M6639 == null ? EmptySet.INSTANCE : AbstractC4343.m8800(c4571M6639.mo9175(c4690, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        C7040 c7040 = (C7040) this.f13332.f1095;
        linkedHashSet.addAll(AbstractC6560.m12003(linkedHashSet, collectionM8800, c4690, c7040.f18894, ((C4854) c7040.f18904).f14132, this.f13322));
        if (this.f13321.f13079.isEnum()) {
            if (c4690.equals(AbstractC6525.f17845)) {
                linkedHashSet.add(AbstractC6875.m12105(c4599));
            } else if (c4690.equals(AbstractC6525.f17847)) {
                linkedHashSet.add(AbstractC6875.m12106(c4599));
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4498 mo9167() {
        return this.f13322;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Set mo9168(C7247 c7247) {
        c7247.getClass();
        Set setM8801 = AbstractC4343.m8801(((InterfaceC4580) this.f13329.invoke()).mo9192());
        C4598 c4598 = C4598.f13409;
        C4599 c4599 = this.f13322;
        AbstractC7274.m12461(AbstractC8189.m13660(c4599), C4573.f13326, new C4572(c4599, setM8801, c4598));
        if (this.f13321.f13079.isEnum()) {
            setM8801.add(AbstractC6525.f17846);
        }
        return setM8801;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Set mo9169(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC4580 mo9170() {
        return new C4582(this.f13321, C4598.f13410);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Set mo9171(C7247 c7247, C7261 c7261) {
        c7247.getClass();
        Set setM8801 = AbstractC4343.m8801(((InterfaceC4580) this.f13329.invoke()).mo9196());
        C4599 c4599 = this.f13322;
        C4571 c4571M6639 = AbstractC3055.m6639(c4599);
        Set setMo9178 = c4571M6639 != null ? c4571M6639.mo9178() : null;
        if (setMo9178 == null) {
            setMo9178 = EmptySet.INSTANCE;
        }
        setM8801.addAll(setMo9178);
        if (this.f13321.f13079.isEnum()) {
            setM8801.addAll(AbstractC8189.m13659(AbstractC6525.f17845, AbstractC6525.f17847));
        }
        C0325 c0325 = this.f13332;
        setM8801.addAll(((C6868) ((C7040) c0325.f1095).f18903).m12072(c4599, c0325));
        return setM8801;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo9172(ArrayList arrayList, C4690 c4690) {
        c4690.getClass();
        C0325 c0325 = this.f13332;
        ((C6868) ((C7040) c0325.f1095).f18903).m12067(this.f13322, c4690, arrayList, c0325);
    }
}
