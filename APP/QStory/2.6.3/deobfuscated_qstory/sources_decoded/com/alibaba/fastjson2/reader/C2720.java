package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Currency;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2720 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2720 f8285 = new C2720(Currency.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8284 = AbstractC2860.m5774("Currency");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) throws IOException {
        String strMo6184;
        if (abstractC2899.mo6177()) {
            JSONObject jSONObject = new JSONObject();
            abstractC2899.m6190(jSONObject, 0L);
            strMo6184 = jSONObject.getString("currency");
            if (strMo6184 == null) {
                strMo6184 = jSONObject.getString("currencyCode");
            }
        } else {
            strMo6184 = abstractC2899.mo6184();
        }
        if (strMo6184 == null || strMo6184.isEmpty()) {
            return null;
        }
        return Currency.getInstance(strMo6184);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6183() == -110) {
            abstractC2899.mo6173();
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != f8284 && jMo6239 != -7860540621745740270L) {
                C0276.m850(abstractC2899.mo6170("currency not support input autoTypeClass " + abstractC2899.mo6100()));
                return null;
            }
        }
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184 == null || strMo6184.isEmpty()) {
            return null;
        }
        return Currency.getInstance(strMo6184);
    }
}
