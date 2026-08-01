package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4439;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4445;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.sequences.C5114;
import kotlin.sequences.C5115;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4582 implements InterfaceC4580 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f13361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f13362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f13363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1012 f13364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f13365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4451 f13366;

    public C4582(C4451 c4451, InterfaceC6557 interfaceC6557) {
        c4451.getClass();
        this.f13366 = c4451;
        this.f13365 = interfaceC6557;
        C1012 c1012 = new C1012(this, 8);
        this.f13364 = c1012;
        C5114 c5114 = new C5114(AbstractC4343.m8790(c4451.m8999()), true, c1012);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5115 c5115 = new C5115(c5114);
        while (c5115.hasNext()) {
            Object next = c5115.next();
            C4690 c4690M8994 = ((C4435) next).m8994();
            Object arrayList = linkedHashMap.get(c4690M8994);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c4690M8994, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f13363 = linkedHashMap;
        C5114 c51142 = new C5114(AbstractC4343.m8790(this.f13366.m9001()), true, this.f13365);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C5115 c51152 = new C5115(c51142);
        while (c51152.hasNext()) {
            Object next2 = c51152.next();
            linkedHashMap2.put(((C4445) next2).m8994(), next2);
        }
        this.f13362 = linkedHashMap2;
        ArrayList arrayListM9004 = this.f13366.m9004();
        InterfaceC6557 interfaceC65572 = this.f13365;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListM9004) {
            if (((Boolean) interfaceC65572.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8779 < 16 ? 16 : iM8779);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((C4439) obj2).m8994(), obj2);
        }
        this.f13361 = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4580
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9191(C4690 c4690) {
        c4690.getClass();
        List list = (List) this.f13363.get(c4690);
        return list != null ? list : EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4580
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9192() {
        C5114 c5114 = new C5114(AbstractC4343.m8790(this.f13366.m9001()), true, this.f13365);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5115 c5115 = new C5115(c5114);
        while (c5115.hasNext()) {
            linkedHashSet.add(((C4445) c5115.next()).m8994());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4580
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Set mo9193() {
        return this.f13361.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4580
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4445 mo9194(C4690 c4690) {
        c4690.getClass();
        return (C4445) this.f13362.get(c4690);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4580
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C4439 mo9195(C4690 c4690) {
        c4690.getClass();
        return (C4439) this.f13361.get(c4690);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC4580
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Set mo9196() {
        C5114 c5114 = new C5114(AbstractC4343.m8790(this.f13366.m8999()), true, this.f13364);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5115 c5115 = new C5115(c5114);
        while (c5115.hasNext()) {
            linkedHashSet.add(((C4435) c5115.next()).m8994());
        }
        return linkedHashSet;
    }
}
