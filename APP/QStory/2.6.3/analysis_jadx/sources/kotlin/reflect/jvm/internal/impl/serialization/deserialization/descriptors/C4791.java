package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC3933;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4713;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.storage.C4848;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4791 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13950 = {new PropertyReference1Impl(C4791.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new PropertyReference1Impl(C4791.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4848 f13951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4837 f13952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4837 f13953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f13954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f13955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f13956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4847 f13957;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4847 f13958;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4795 f13959;

    public C4791(AbstractC4795 abstractC4795, List list, List list2, List list3) {
        this.f13959 = abstractC4795;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C4691 c4691M8316 = AbstractC3933.m8316(abstractC4795.f13977.f14061, ((ProtoBuf$Function) ((InterfaceC4701) obj)).getName());
            Object arrayList = linkedHashMap.get(c4691M8316);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c4691M8316, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f13956 = m9523(linkedHashMap);
        AbstractC4795 abstractC47952 = this.f13959;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            C4691 c4691M83162 = AbstractC3933.m8316(abstractC47952.f13977.f14061, ((ProtoBuf$Property) ((InterfaceC4701) obj2)).getName());
            Object arrayList2 = linkedHashMap2.get(c4691M83162);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(c4691M83162, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f13955 = m9523(linkedHashMap2);
        this.f13959.f13977.f14062.f14090.getClass();
        AbstractC4795 abstractC47953 = this.f13959;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            C4691 c4691M83163 = AbstractC3933.m8316(abstractC47953.f13977.f14061, ((ProtoBuf$TypeAlias) ((InterfaceC4701) obj3)).getName());
            Object arrayList3 = linkedHashMap3.get(c4691M83163);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(c4691M83163, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f13954 = m9523(linkedHashMap3);
        int i = 0;
        this.f13953 = this.f13959.f13977.f14062.f14092.m9579(new C4800(this, i));
        int i2 = 1;
        this.f13952 = this.f13959.f13977.f14062.f14092.m9579(new C4800(this, i2));
        this.f13951 = this.f13959.f13977.f14062.f14092.m9578(new C4800(this, 2));
        AbstractC4795 abstractC47954 = this.f13959;
        C4845 c4845 = abstractC47954.f13977.f14062.f14092;
        C4792 c4792 = new C4792(this, abstractC47954, i);
        c4845.getClass();
        this.f13958 = new C4847(c4845, c4792);
        AbstractC4795 abstractC47955 = this.f13959;
        C4845 c48452 = abstractC47955.f13977.f14062.f14092;
        C4792 c47922 = new C4792(this, abstractC47955, i2);
        c48452.getClass();
        this.f13957 = new C4847(c48452, c47922);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LinkedHashMap m9523(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4339.m8772(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((AbstractC4713) it.next()).writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(C5176.f14739);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
