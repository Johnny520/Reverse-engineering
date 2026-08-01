package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4436;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4440;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4446;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.sequences.C5115;
import kotlin.sequences.C5116;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4583 implements InterfaceC4581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f13365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f13366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f13367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1012 f13368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f13369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4452 f13370;

    public C4583(C4452 c4452, InterfaceC6558 interfaceC6558) {
        c4452.getClass();
        this.f13370 = c4452;
        this.f13369 = interfaceC6558;
        C1012 c1012 = new C1012(this, 8);
        this.f13368 = c1012;
        C5115 c5115 = new C5115(AbstractC4344.m8803(c4452.m8989()), true, c1012);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5116 c5116 = new C5116(c5115);
        while (c5116.hasNext()) {
            Object next = c5116.next();
            C4691 c4691M8984 = ((C4436) next).m8984();
            Object arrayList = linkedHashMap.get(c4691M8984);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c4691M8984, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f13367 = linkedHashMap;
        C5115 c51152 = new C5115(AbstractC4344.m8803(this.f13370.m8991()), true, this.f13369);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C5116 c51162 = new C5116(c51152);
        while (c51162.hasNext()) {
            Object next2 = c51162.next();
            linkedHashMap2.put(((C4446) next2).m8984(), next2);
        }
        this.f13366 = linkedHashMap2;
        ArrayList arrayListM8994 = this.f13370.m8994();
        InterfaceC6558 interfaceC65582 = this.f13369;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListM8994) {
            if (((Boolean) interfaceC65582.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8772 < 16 ? 16 : iM8772);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((C4440) obj2).m8984(), obj2);
        }
        this.f13365 = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4581
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9181(C4691 c4691) {
        c4691.getClass();
        List list = (List) this.f13367.get(c4691);
        return list != null ? list : EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4581
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9182() {
        C5115 c5115 = new C5115(AbstractC4344.m8803(this.f13370.m8991()), true, this.f13369);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5116 c5116 = new C5116(c5115);
        while (c5116.hasNext()) {
            linkedHashSet.add(((C4446) c5116.next()).m8984());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4581
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Set mo9183() {
        return this.f13365.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4581
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4446 mo9184(C4691 c4691) {
        c4691.getClass();
        return (C4446) this.f13366.get(c4691);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4581
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C4440 mo9185(C4691 c4691) {
        c4691.getClass();
        return (C4440) this.f13365.get(c4691);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4581
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Set mo9186() {
        C5115 c5115 = new C5115(AbstractC4344.m8803(this.f13370.m8989()), true, this.f13368);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5116 c5116 = new C5116(c5115);
        while (c5116.hasNext()) {
            linkedHashSet.add(((C4436) c5116.next()).m8984());
        }
        return linkedHashSet;
    }
}
