package p103;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import p025.AbstractC7012;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.C8021;
import p107.InterfaceC8020;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7906 extends AbstractC7934 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7907 f19329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f19330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8013 f19331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8013 f19332;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7906(InterfaceC8013 interfaceC8013, InterfaceC8013 interfaceC80132, int i) {
        this(interfaceC8013, interfaceC80132, (byte) 0);
        this.f19330 = i;
        interfaceC8013.getClass();
        interfaceC80132.getClass();
        switch (i) {
            case 1:
                this(interfaceC8013, interfaceC80132, (byte) 0);
                InterfaceC8020 descriptor = interfaceC8013.getDescriptor();
                InterfaceC8020 descriptor2 = interfaceC80132.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.f19329 = new C7907("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                InterfaceC8020 descriptor3 = interfaceC8013.getDescriptor();
                InterfaceC8020 descriptor4 = interfaceC80132.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.f19329 = new C7907("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        switch (this.f19330) {
        }
        return this.f19329;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        int iMo12949 = mo12949(obj);
        InterfaceC8020 descriptor = getDescriptor();
        InterfaceC8017 interfaceC8017Mo11328 = interfaceC8015.mo11328(descriptor, iMo12949);
        Iterator itMo12956 = mo12956(obj);
        int i = 0;
        while (itMo12956.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo12956.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            interfaceC8017Mo11328.mo11278(getDescriptor(), i, this.f19332, key);
            i += 2;
            interfaceC8017Mo11328.mo11278(getDescriptor(), i2, this.f19331, value);
        }
        interfaceC8017Mo11328.mo11270(descriptor);
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objMo11233 = interfaceC8018.mo11233(getDescriptor(), i, this.f19332, null);
        int iMo11277 = interfaceC8018.mo11277(getDescriptor());
        if (iMo11277 != i + 1) {
            C6755.m11873(AbstractC7012.m12150(i, iMo11277, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objMo11233);
        InterfaceC8013 interfaceC8013 = this.f19331;
        map.put(objMo11233, (!zContainsKey || (interfaceC8013.getDescriptor().getKind() instanceof C8021)) ? interfaceC8018.mo11233(getDescriptor(), iMo11277, interfaceC8013, null) : interfaceC8018.mo11233(getDescriptor(), iMo11277, interfaceC8013, AbstractC5171.m9332(objMo11233, map)));
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        switch (this.f19330) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Iterator mo12956(Object obj) {
        switch (this.f19330) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo12957(Object obj) {
        int size;
        switch (this.f19330) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo12958() {
        switch (this.f19330) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object mo12959(Object obj) {
        switch (this.f19330) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        Object obj2;
        switch (this.f19330) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                obj2 = map instanceof HashMap ? (HashMap) map : null;
                return obj2 == null ? new HashMap(map) : obj2;
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                obj2 = map2 instanceof LinkedHashMap ? (LinkedHashMap) map2 : null;
                return obj2 == null ? new LinkedHashMap(map2) : obj2;
        }
    }

    public C7906(InterfaceC8013 interfaceC8013, InterfaceC8013 interfaceC80132, byte b) {
        this.f19332 = interfaceC8013;
        this.f19331 = interfaceC80132;
    }
}
