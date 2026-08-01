package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Currency;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3553 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3553 f8630 = new C3553(Currency.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8629 = AbstractC3693.m6334("Currency");

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) throws IOException {
        String strMo6744;
        if (abstractC3732.mo6737()) {
            JSONObject jSONObject = new JSONObject();
            abstractC3732.m6750(jSONObject, 0L);
            strMo6744 = jSONObject.getString("currency");
            if (strMo6744 == null) {
                strMo6744 = jSONObject.getString("currencyCode");
            }
        } else {
            strMo6744 = abstractC3732.mo6744();
        }
        if (strMo6744 == null || strMo6744.isEmpty()) {
            return null;
        }
        return Currency.getInstance(strMo6744);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6743() == -110) {
            abstractC3732.mo6733();
            long jMo6799 = abstractC3732.mo6799();
            if (jMo6799 != f8629 && jMo6799 != -7860540621745740270L) {
                C1123.m1410(abstractC3732.mo6730("currency not support input autoTypeClass " + abstractC3732.mo6660()));
                return null;
            }
        }
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744 == null || strMo6744.isEmpty()) {
            return null;
        }
        return Currency.getInstance(strMo6744);
    }
}
