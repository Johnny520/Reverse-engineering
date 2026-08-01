package com.alibaba.fastjson2;

import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3682;
import java.util.Iterator;
import java.util.Map;
import p307.AbstractC9323;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3778 extends C3783 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f9667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9668;

    public C3778(String str, C3780 c3780, JSONPath$Feature... jSONPath$FeatureArr) {
        super(c3780, str, jSONPath$FeatureArr);
        this.f9668 = c3780.f9676;
        this.f9667 = c3780.f9675;
    }

    @Override // com.alibaba.fastjson2.C3783, com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6506() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    @Override // com.alibaba.fastjson2.C3783, com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6507(AbstractC3732 abstractC3732) {
        boolean z = abstractC3732.f9544;
        long j = this.f9667;
        Object objMo6744 = null;
        long j2 = this.f9607;
        if (z) {
            if (abstractC3732.mo6708()) {
                while (!abstractC3732.mo6712()) {
                    long jMo6689 = abstractC3732.mo6689();
                    if (jMo6689 != 0) {
                        if (jMo6689 == j || abstractC3732.mo6737() || abstractC3732.mo6729()) {
                            return abstractC3732.mo6684();
                        }
                        abstractC3732.mo6793();
                    }
                }
            }
            if ((JSONPath$Feature.AlwaysReturnList.mask & j2) != 0) {
                return new JSONArray();
            }
        } else {
            if (abstractC3732.mo6708()) {
                while (!abstractC3732.mo6712()) {
                    if (abstractC3732.mo6689() == j) {
                        char c = abstractC3732.f9538;
                        if (c == '\"' || c == '\'') {
                            objMo6744 = abstractC3732.mo6744();
                        } else if (c == '+' || c == '-') {
                            objMo6744 = abstractC3732.mo6752();
                        } else if (c == '[') {
                            objMo6744 = abstractC3732.mo6685();
                        } else if (c == 'f') {
                            objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                        } else if (c == 'n') {
                            abstractC3732.mo6762();
                        } else if (c != 't') {
                            if (c != '{') {
                                switch (c) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        C1123.m1402(abstractC3732.f9538, "TODO : ");
                                        return null;
                                }
                            } else {
                                objMo6744 = abstractC3732.mo6754();
                            }
                        }
                        return (JSONPath$Feature.AlwaysReturnList.mask & j2) != 0 ? objMo6744 == null ? new JSONArray() : JSONArray.m0of(objMo6744) : objMo6744;
                    }
                    abstractC3732.mo6793();
                }
            }
            if ((JSONPath$Feature.AlwaysReturnList.mask & j2) != 0) {
                return new JSONArray();
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.C3783, com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo6508(Object obj) {
        AbstractC9323 abstractC9323Mo14650;
        Object objMo14554;
        Long lValueOf = null;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            String str = this.f9668;
            objMo14554 = map.get(str);
            if (objMo14554 == null) {
                boolean zM6248 = AbstractC3682.m6248(str);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(str)) {
                        objMo14554 = entry.getValue();
                        break;
                    }
                    if (key instanceof Long) {
                        if (lValueOf == null && zM6248) {
                            lValueOf = Long.valueOf(Long.parseLong(str));
                        }
                        if (key.equals(lValueOf)) {
                            objMo14554 = entry.getValue();
                            break;
                        }
                    }
                }
            }
        } else {
            InterfaceC9352 interfaceC9352M6587 = m6939().m6587(obj.getClass());
            if (interfaceC9352M6587 == null || (abstractC9323Mo14650 = interfaceC9352M6587.mo14650(this.f9667)) == null) {
                return null;
            }
            objMo14554 = abstractC9323Mo14650.mo14554(obj);
        }
        return (this.f9607 & JSONPath$Feature.AlwaysReturnList.mask) != 0 ? objMo14554 == null ? new JSONArray() : JSONArray.m0of(objMo14554) : objMo14554;
    }
}
