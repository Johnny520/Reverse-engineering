package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.foundation.text.C1850;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5268;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5272;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5278;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.sequences.C5947;
import kotlin.sequences.C5948;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5415 implements InterfaceC5413 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f13710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f13711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f13712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1850 f13713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f13714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5284 f13715;

    public C5415(C5284 c5284, InterfaceC7387 interfaceC7387) {
        c5284.getClass();
        this.f13715 = c5284;
        this.f13714 = interfaceC7387;
        C1850 c1850 = new C1850(this, 8);
        this.f13713 = c1850;
        C5947 c5947 = new C5947(AbstractC5176.m9362(c5284.m9548()), true, c1850);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5948 c5948 = new C5948(c5947);
        while (c5948.hasNext()) {
            Object next = c5948.next();
            C5523 c5523M9543 = ((C5268) next).m9543();
            Object arrayList = linkedHashMap.get(c5523M9543);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c5523M9543, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f13712 = linkedHashMap;
        C5947 c59472 = new C5947(AbstractC5176.m9362(this.f13715.m9550()), true, this.f13714);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C5948 c59482 = new C5948(c59472);
        while (c59482.hasNext()) {
            Object next2 = c59482.next();
            linkedHashMap2.put(((C5278) next2).m9543(), next2);
        }
        this.f13711 = linkedHashMap2;
        ArrayList arrayListM9553 = this.f13715.m9553();
        InterfaceC7387 interfaceC73872 = this.f13714;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListM9553) {
            if (((Boolean) interfaceC73872.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM9331 < 16 ? 16 : iM9331);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((C5272) obj2).m9543(), obj2);
        }
        this.f13710 = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC5413
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9740(C5523 c5523) {
        c5523.getClass();
        List list = (List) this.f13712.get(c5523);
        return list != null ? list : EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC5413
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9741() {
        C5947 c5947 = new C5947(AbstractC5176.m9362(this.f13715.m9550()), true, this.f13714);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5948 c5948 = new C5948(c5947);
        while (c5948.hasNext()) {
            linkedHashSet.add(((C5278) c5948.next()).m9543());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC5413
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Set mo9742() {
        return this.f13710.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC5413
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C5278 mo9743(C5523 c5523) {
        c5523.getClass();
        return (C5278) this.f13711.get(c5523);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC5413
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C5272 mo9744(C5523 c5523) {
        c5523.getClass();
        return (C5272) this.f13710.get(c5523);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC5413
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Set mo9745() {
        C5947 c5947 = new C5947(AbstractC5176.m9362(this.f13715.m9548()), true, this.f13713);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5948 c5948 = new C5948(c5947);
        while (c5948.hasNext()) {
            linkedHashSet.add(((C5268) c5948.next()).m9543());
        }
        return linkedHashSet;
    }
}
