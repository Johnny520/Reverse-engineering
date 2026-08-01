package com.alibaba.fastjson2;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.util.List;
import lin.xposed.hook.javaplugin.C5553;
import p383.AbstractC9032;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2876 extends AbstractC2877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f9096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2935 f9098;

    public C2876(C2935 c2935, JSONPathFilter$Operator jSONPathFilter$Operator, Object obj) {
        this.f9098 = c2935;
        this.f9097 = jSONPathFilter$Operator;
        this.f9096 = obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC2877
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5910(C2925 c2925, Object obj) {
        if (obj != null) {
            C2935 c2935 = this.f9098;
            C2925 c29252 = new C2925(null, null, c2935, null);
            c29252.f9268 = obj;
            c2935.mo5908(c29252);
            List list = (List) c29252.f9267;
            for (int i = 0; i < list.size(); i++) {
                int iM5878 = AbstractC2866.m5878(list.get(i), this.f9096);
                int iOrdinal = this.f9097.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    if (iOrdinal != 5) {
                                        C5553.m10825();
                                        return false;
                                    }
                                    if (iM5878 <= 0) {
                                    }
                                } else if (iM5878 < 0) {
                                }
                            } else if (iM5878 >= 0) {
                            }
                        } else if (iM5878 > 0) {
                        }
                    } else if (iM5878 != 0) {
                    }
                } else if (iM5878 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        if (!(obj instanceof List)) {
            C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("UnsupportedOperation ")));
            return;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (mo5910(c2925, obj2)) {
                jSONArray.add(obj2);
            }
        }
        c2925.f9267 = jSONArray;
        c2925.f9273 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        throw new JSONException(AbstractC9032.m14590(C2876.class, "UnsupportedOperation "));
    }
}
