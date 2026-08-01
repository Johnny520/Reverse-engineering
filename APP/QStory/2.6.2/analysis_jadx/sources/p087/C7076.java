package p087;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import p007.AbstractC6136;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.C7191;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7076 extends AbstractC7104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7077 f18989;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f18990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7183 f18991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7183 f18992;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7076(InterfaceC7183 interfaceC7183, InterfaceC7183 interfaceC71832, int i) {
        this(interfaceC7183, interfaceC71832, (byte) 0);
        this.f18990 = i;
        interfaceC7183.getClass();
        interfaceC71832.getClass();
        switch (i) {
            case 1:
                this(interfaceC7183, interfaceC71832, (byte) 0);
                InterfaceC7190 descriptor = interfaceC7183.getDescriptor();
                InterfaceC7190 descriptor2 = interfaceC71832.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.f18989 = new C7077("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                InterfaceC7190 descriptor3 = interfaceC7183.getDescriptor();
                InterfaceC7190 descriptor4 = interfaceC71832.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.f18989 = new C7077("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        switch (this.f18990) {
        }
        return this.f18989;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        int iMo12363 = mo12363(obj);
        InterfaceC7190 descriptor = getDescriptor();
        InterfaceC7187 interfaceC7187Mo10712 = interfaceC7185.mo10712(descriptor, iMo12363);
        Iterator itMo12370 = mo12370(obj);
        int i = 0;
        while (itMo12370.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo12370.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            interfaceC7187Mo10712.mo6791(getDescriptor(), i, this.f18992, key);
            i += 2;
            interfaceC7187Mo10712.mo6791(getDescriptor(), i2, this.f18991, value);
        }
        interfaceC7187Mo10712.mo6801(descriptor);
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objMo6874 = interfaceC7188.mo6874(getDescriptor(), i, this.f18992, null);
        int iMo10672 = interfaceC7188.mo10672(getDescriptor());
        if (iMo10672 != i + 1) {
            C5919.m11253(AbstractC6136.m11559(i, iMo10672, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objMo6874);
        InterfaceC7183 interfaceC7183 = this.f18991;
        map.put(objMo6874, (!zContainsKey || (interfaceC7183.getDescriptor().getKind() instanceof C7191)) ? interfaceC7188.mo6874(getDescriptor(), iMo10672, interfaceC7183, null) : interfaceC7188.mo6874(getDescriptor(), iMo10672, interfaceC7183, AbstractC4338.m8780(objMo6874, map)));
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        switch (this.f18990) {
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

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Iterator mo12370(Object obj) {
        switch (this.f18990) {
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

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo12371(Object obj) {
        int size;
        switch (this.f18990) {
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

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo12372() {
        switch (this.f18990) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object mo12373(Object obj) {
        switch (this.f18990) {
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

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        Object obj2;
        switch (this.f18990) {
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

    public C7076(InterfaceC7183 interfaceC7183, InterfaceC7183 interfaceC71832, byte b) {
        this.f18992 = interfaceC7183;
        this.f18991 = interfaceC71832;
    }
}
