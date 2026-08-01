package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4712;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13946 = {new PropertyReference1Impl(C4790.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new PropertyReference1Impl(C4790.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4847 f13947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4836 f13948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4836 f13949;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f13950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f13951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f13952;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4846 f13953;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4846 f13954;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4794 f13955;

    public C4790(AbstractC4794 abstractC4794, List list, List list2, List list3) {
        this.f13955 = abstractC4794;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C4690 c4690M13047 = AbstractC7738.m13047(abstractC4794.f13973.f14057, ((ProtoBuf$Function) ((InterfaceC4700) obj)).getName());
            Object arrayList = linkedHashMap.get(c4690M13047);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c4690M13047, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f13952 = m9533(linkedHashMap);
        AbstractC4794 abstractC47942 = this.f13955;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            C4690 c4690M130472 = AbstractC7738.m13047(abstractC47942.f13973.f14057, ((ProtoBuf$Property) ((InterfaceC4700) obj2)).getName());
            Object arrayList2 = linkedHashMap2.get(c4690M130472);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(c4690M130472, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f13951 = m9533(linkedHashMap2);
        this.f13955.f13973.f14058.f14086.getClass();
        AbstractC4794 abstractC47943 = this.f13955;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            C4690 c4690M130473 = AbstractC7738.m13047(abstractC47943.f13973.f14057, ((ProtoBuf$TypeAlias) ((InterfaceC4700) obj3)).getName());
            Object arrayList3 = linkedHashMap3.get(c4690M130473);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(c4690M130473, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f13950 = m9533(linkedHashMap3);
        int i = 0;
        this.f13949 = this.f13955.f13973.f14058.f14088.m9589(new C4799(this, i));
        int i2 = 1;
        this.f13948 = this.f13955.f13973.f14058.f14088.m9589(new C4799(this, i2));
        this.f13947 = this.f13955.f13973.f14058.f14088.m9588(new C4799(this, 2));
        AbstractC4794 abstractC47944 = this.f13955;
        C4844 c4844 = abstractC47944.f13973.f14058.f14088;
        C4791 c4791 = new C4791(this, abstractC47944, i);
        c4844.getClass();
        this.f13954 = new C4846(c4844, c4791);
        AbstractC4794 abstractC47945 = this.f13955;
        C4844 c48442 = abstractC47945.f13973.f14058.f14088;
        C4791 c47912 = new C4791(this, abstractC47945, i2);
        c48442.getClass();
        this.f13953 = new C4846(c48442, c47912);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LinkedHashMap m9533(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4338.m8779(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((AbstractC4712) it.next()).writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(C5175.f14739);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
