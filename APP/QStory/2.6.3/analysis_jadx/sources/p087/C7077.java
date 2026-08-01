package p087;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import p009.AbstractC6183;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.C7192;
import p091.InterfaceC7191;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7077 extends AbstractC7105 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7078 f18984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f18985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7184 f18986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7184 f18987;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7077(InterfaceC7184 interfaceC7184, InterfaceC7184 interfaceC71842, int i) {
        this(interfaceC7184, interfaceC71842, (byte) 0);
        this.f18985 = i;
        interfaceC7184.getClass();
        interfaceC71842.getClass();
        switch (i) {
            case 1:
                this(interfaceC7184, interfaceC71842, (byte) 0);
                InterfaceC7191 descriptor = interfaceC7184.getDescriptor();
                InterfaceC7191 descriptor2 = interfaceC71842.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.f18984 = new C7078("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                InterfaceC7191 descriptor3 = interfaceC7184.getDescriptor();
                InterfaceC7191 descriptor4 = interfaceC71842.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.f18984 = new C7078("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        switch (this.f18985) {
        }
        return this.f18984;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        int iMo12390 = mo12390(obj);
        InterfaceC7191 descriptor = getDescriptor();
        InterfaceC7188 interfaceC7188Mo10769 = interfaceC7186.mo10769(descriptor, iMo12390);
        Iterator itMo12397 = mo12397(obj);
        int i = 0;
        while (itMo12397.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo12397.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            interfaceC7188Mo10769.mo10719(getDescriptor(), i, this.f18987, key);
            i += 2;
            interfaceC7188Mo10769.mo10719(getDescriptor(), i2, this.f18986, value);
        }
        interfaceC7188Mo10769.mo10711(descriptor);
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objMo10674 = interfaceC7189.mo10674(getDescriptor(), i, this.f18987, null);
        int iMo10718 = interfaceC7189.mo10718(getDescriptor());
        if (iMo10718 != i + 1) {
            C5925.m11314(AbstractC6183.m11591(i, iMo10718, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objMo10674);
        InterfaceC7184 interfaceC7184 = this.f18986;
        map.put(objMo10674, (!zContainsKey || (interfaceC7184.getDescriptor().getKind() instanceof C7192)) ? interfaceC7189.mo10674(getDescriptor(), iMo10718, interfaceC7184, null) : interfaceC7189.mo10674(getDescriptor(), iMo10718, interfaceC7184, AbstractC4339.m8773(objMo10674, map)));
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        switch (this.f18985) {
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

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Iterator mo12397(Object obj) {
        switch (this.f18985) {
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

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo12398(Object obj) {
        int size;
        switch (this.f18985) {
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

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo12399() {
        switch (this.f18985) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object mo12400(Object obj) {
        switch (this.f18985) {
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

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        Object obj2;
        switch (this.f18985) {
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

    public C7077(InterfaceC7184 interfaceC7184, InterfaceC7184 interfaceC71842, byte b) {
        this.f18987 = interfaceC7184;
        this.f18986 = interfaceC71842;
    }
}
