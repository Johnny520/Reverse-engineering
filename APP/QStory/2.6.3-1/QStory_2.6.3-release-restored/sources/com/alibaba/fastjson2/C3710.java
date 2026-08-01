package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.util.List;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3710 extends AbstractC3711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f9443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3769 f9445;

    public C3710(C3769 c3769, JSONPathFilter$Operator jSONPathFilter$Operator, Object obj) {
        this.f9445 = c3769;
        this.f9444 = jSONPathFilter$Operator;
        this.f9443 = obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC3711
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo6515(C3759 c3759, Object obj) {
        if (obj != null) {
            C3769 c3769 = this.f9445;
            C3759 c37592 = new C3759(null, null, c3769, null);
            c37592.f9615 = obj;
            c3769.mo6513(c37592);
            List list = (List) c37592.f9614;
            for (int i = 0; i < list.size(); i++) {
                int iM6483 = AbstractC3700.m6483(list.get(i), this.f9443);
                int iOrdinal = this.f9444.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    if (iOrdinal != 5) {
                                        C6385.m11441();
                                        return false;
                                    }
                                    if (iM6483 <= 0) {
                                    }
                                } else if (iM6483 < 0) {
                                }
                            } else if (iM6483 >= 0) {
                            }
                        } else if (iM6483 > 0) {
                        }
                    } else if (iM6483 != 0) {
                    }
                } else if (iM6483 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        if (!(obj instanceof List)) {
            C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("UnsupportedOperation ")));
            return;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (mo6515(c3759, obj2)) {
                jSONArray.add(obj2);
            }
        }
        c3759.f9614 = jSONArray;
        c3759.f9620 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        throw new JSONException(AbstractC0900.m714(C3710.class, "UnsupportedOperation "));
    }
}
