package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Currency;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2719 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2719 f8283 = new C2719(Currency.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8282 = AbstractC2859.m5729("Currency");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) throws IOException {
        String strMo6139;
        if (abstractC2898.mo6131()) {
            JSONObject jSONObject = new JSONObject();
            abstractC2898.m6145(jSONObject, 0L);
            strMo6139 = jSONObject.getString("currency");
            if (strMo6139 == null) {
                strMo6139 = jSONObject.getString("currencyCode");
            }
        } else {
            strMo6139 = abstractC2898.mo6139();
        }
        if (strMo6139 == null || strMo6139.isEmpty()) {
            return null;
        }
        return Currency.getInstance(strMo6139);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6138() == -110) {
            abstractC2898.mo6127();
            long jMo6194 = abstractC2898.mo6194();
            if (jMo6194 != f8282 && jMo6194 != -7860540621745740270L) {
                C0276.m849(abstractC2898.mo6124("currency not support input autoTypeClass " + abstractC2898.mo6055()));
                return null;
            }
        }
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139 == null || strMo6139.isEmpty()) {
            return null;
        }
        return Currency.getInstance(strMo6139);
    }
}
