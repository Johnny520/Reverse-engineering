package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC4765;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5545;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.storage.C5680;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5623 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14295 = {new PropertyReference1Impl(C5623.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new PropertyReference1Impl(C5623.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5680 f14296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5669 f14297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5669 f14298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f14299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f14300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f14301;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5679 f14302;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5679 f14303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5627 f14304;

    public C5623(AbstractC5627 abstractC5627, List list, List list2, List list3) {
        this.f14304 = abstractC5627;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C5523 c5523M8875 = AbstractC4765.m8875(abstractC5627.f14322.f14406, ((ProtoBuf$Function) ((InterfaceC5533) obj)).getName());
            Object arrayList = linkedHashMap.get(c5523M8875);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c5523M8875, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f14301 = m10082(linkedHashMap);
        AbstractC5627 abstractC56272 = this.f14304;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            C5523 c5523M88752 = AbstractC4765.m8875(abstractC56272.f14322.f14406, ((ProtoBuf$Property) ((InterfaceC5533) obj2)).getName());
            Object arrayList2 = linkedHashMap2.get(c5523M88752);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(c5523M88752, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f14300 = m10082(linkedHashMap2);
        this.f14304.f14322.f14407.f14435.getClass();
        AbstractC5627 abstractC56273 = this.f14304;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            C5523 c5523M88753 = AbstractC4765.m8875(abstractC56273.f14322.f14406, ((ProtoBuf$TypeAlias) ((InterfaceC5533) obj3)).getName());
            Object arrayList3 = linkedHashMap3.get(c5523M88753);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(c5523M88753, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f14299 = m10082(linkedHashMap3);
        int i = 0;
        this.f14298 = this.f14304.f14322.f14407.f14437.m10138(new C5632(this, i));
        int i2 = 1;
        this.f14297 = this.f14304.f14322.f14407.f14437.m10138(new C5632(this, i2));
        this.f14296 = this.f14304.f14322.f14407.f14437.m10137(new C5632(this, 2));
        AbstractC5627 abstractC56274 = this.f14304;
        C5677 c5677 = abstractC56274.f14322.f14407.f14437;
        C5624 c5624 = new C5624(this, abstractC56274, i);
        c5677.getClass();
        this.f14303 = new C5679(c5677, c5624);
        AbstractC5627 abstractC56275 = this.f14304;
        C5677 c56772 = abstractC56275.f14322.f14407.f14437;
        C5624 c56242 = new C5624(this, abstractC56275, i2);
        c56772.getClass();
        this.f14302 = new C5679(c56772, c56242);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LinkedHashMap m10082(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5171.m9331(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((AbstractC5545) it.next()).writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(C6008.f15084);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
