package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.util.List;
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2877 extends AbstractC2878 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f9098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2936 f9100;

    public C2877(C2936 c2936, JSONPathFilter$Operator jSONPathFilter$Operator, Object obj) {
        this.f9100 = c2936;
        this.f9099 = jSONPathFilter$Operator;
        this.f9098 = obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC2878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5955(C2926 c2926, Object obj) {
        if (obj != null) {
            C2936 c2936 = this.f9100;
            C2926 c29262 = new C2926(null, null, c2936, null);
            c29262.f9270 = obj;
            c2936.mo5953(c29262);
            List list = (List) c29262.f9269;
            for (int i = 0; i < list.size(); i++) {
                int iM5923 = AbstractC2867.m5923(list.get(i), this.f9098);
                int iOrdinal = this.f9099.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    if (iOrdinal != 5) {
                                        C5554.m10882();
                                        return false;
                                    }
                                    if (iM5923 <= 0) {
                                    }
                                } else if (iM5923 < 0) {
                                }
                            } else if (iM5923 >= 0) {
                            }
                        } else if (iM5923 > 0) {
                        }
                    } else if (iM5923 != 0) {
                    }
                } else if (iM5923 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        if (!(obj instanceof List)) {
            C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("UnsupportedOperation ")));
            return;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (mo5955(c2926, obj2)) {
                jSONArray.add(obj2);
            }
        }
        c2926.f9269 = jSONArray;
        c2926.f9275 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        throw new JSONException(AbstractC0053.m154(C2877.class, "UnsupportedOperation "));
    }
}
