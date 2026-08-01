package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1850;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.checker.C5687;
import p050.AbstractC7176;
import p065.AbstractC7355;
import p068.InterfaceC7387;
import p081.C7698;
import p082.AbstractC7705;
import p095.C7821;
import p099.C7870;
import p117.C8077;
import p117.C8091;
import p119.AbstractC8104;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5404 extends AbstractC5403 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f13669 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C5284 f13670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5432 f13671;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5404(C1171 c1171, C5284 c5284, C5432 c5432) {
        super(c1171, null);
        c5284.getClass();
        this.f13670 = c5284;
        this.f13671 = c5432;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static InterfaceC5305 m9713(InterfaceC5305 interfaceC5305) {
        if (interfaceC5305.getKind().isReal()) {
            return interfaceC5305;
        }
        Collection collectionMo9589 = interfaceC5305.mo9589();
        collectionMo9589.getClass();
        Collection<InterfaceC5305> collection = collectionMo9589;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(collection, 10));
        for (InterfaceC5305 interfaceC53052 : collection) {
            interfaceC53052.getClass();
            arrayList.add(m9713(interfaceC53052));
        }
        return (InterfaceC5305) AbstractC5176.m9338(AbstractC5176.m9356(AbstractC5176.m9343(arrayList)));
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5403, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo9711(ArrayList arrayList, C5523 c5523) {
        C5523 c55232;
        ArrayList arrayList2;
        C7821 c7821M12688;
        c5523.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1850 c1850 = new C1850(c5523, 10);
        C5432 c5432 = this.f13671;
        AbstractC8104.m13047(AbstractC7176.m12487(c5432), C5406.f13675, new C5405(c5432, linkedHashSet, c1850));
        boolean zIsEmpty = arrayList.isEmpty();
        C1171 c1171 = this.f13681;
        if (zIsEmpty) {
            ArrayList arrayList3 = arrayList;
            c55232 = c5523;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC5305 interfaceC5305M9713 = m9713((InterfaceC5305) obj);
                Object arrayList4 = linkedHashMap.get(interfaceC5305M9713);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(interfaceC5305M9713, arrayList4);
                }
                ((List) arrayList4).add(obj);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C7870 c7870 = (C7870) c1171.f1440;
                ArrayList arrayList6 = arrayList3;
                AbstractC5176.m9363(AbstractC3738.m6893(arrayList6, collection, c55232, c7870.f19234, ((C5687) c7870.f19244).f14481, this.f13671), arrayList5);
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList2.addAll(arrayList5);
        } else {
            C7870 c78702 = (C7870) c1171.f1440;
            c55232 = c5523;
            arrayList.addAll(AbstractC3738.m6893(arrayList, linkedHashSet, c5523, c78702.f19234, ((C5687) c78702.f19244).f14481, this.f13671));
            arrayList2 = arrayList;
        }
        if (this.f13670.f13428.isEnum() && c55232.equals(AbstractC7355.f18187) && (c7821M12688 = AbstractC7705.m12688(c5432)) != null) {
            arrayList2.add(c7821M12688);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo9715(LinkedHashSet linkedHashSet, C5523 c5523) {
        c5523.getClass();
        C5432 c5432 = this.f13671;
        C5404 c5404M14255 = AbstractC9019.m14255(c5432);
        Collection collectionM9347 = c5404M14255 == null ? EmptySet.INSTANCE : AbstractC5176.m9347(c5404M14255.mo9724(c5523, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        C7870 c7870 = (C7870) this.f13681.f1440;
        linkedHashSet.addAll(AbstractC3738.m6893(linkedHashSet, collectionM9347, c5523, c7870.f19234, ((C5687) c7870.f19244).f14481, this.f13671));
        if (this.f13670.f13428.isEnum()) {
            if (c5523.equals(AbstractC7355.f18186)) {
                linkedHashSet.add(AbstractC7705.m12692(c5432));
            } else if (c5523.equals(AbstractC7355.f18188)) {
                linkedHashSet.add(AbstractC7705.m12693(c5432));
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5331 mo9716() {
        return this.f13671;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Set mo9717(C8077 c8077) {
        c8077.getClass();
        Set setM9343 = AbstractC5176.m9343(((InterfaceC5413) this.f13678.invoke()).mo9741());
        C5431 c5431 = C5431.f13758;
        C5432 c5432 = this.f13671;
        AbstractC8104.m13047(AbstractC7176.m12487(c5432), C5406.f13675, new C5405(c5432, setM9343, c5431));
        if (this.f13670.f13428.isEnum()) {
            setM9343.add(AbstractC7355.f18187);
        }
        return setM9343;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Set mo9718(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5413 mo9719() {
        return new C5415(this.f13670, C5431.f13759);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Set mo9720(C8077 c8077, C8091 c8091) {
        c8077.getClass();
        Set setM9343 = AbstractC5176.m9343(((InterfaceC5413) this.f13678.invoke()).mo9745());
        C5432 c5432 = this.f13671;
        C5404 c5404M14255 = AbstractC9019.m14255(c5432);
        Set setMo9727 = c5404M14255 != null ? c5404M14255.mo9727() : null;
        if (setMo9727 == null) {
            setMo9727 = EmptySet.INSTANCE;
        }
        setM9343.addAll(setMo9727);
        if (this.f13670.f13428.isEnum()) {
            setM9343.addAll(AbstractC7176.m12490(AbstractC7355.f18186, AbstractC7355.f18188));
        }
        C1171 c1171 = this.f13681;
        setM9343.addAll(((C7698) ((C7870) c1171.f1440).f19243).m12659(c5432, c1171));
        return setM9343;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo9721(ArrayList arrayList, C5523 c5523) {
        c5523.getClass();
        C1171 c1171 = this.f13681;
        ((C7698) ((C7870) c1171.f1440).f19243).m12654(this.f13671, c5523, arrayList, c1171);
    }
}
