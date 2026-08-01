package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8506 extends AbstractC8494 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8506(String str, int i, String str2, String str3, Field field) {
        Class cls = Double.TYPE;
        super(str, i, 0L, str2, null, str3, cls, cls, field, null);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return Double.valueOf(m14087(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final double m14087(Object obj) {
        String str = this.f23618;
        if (obj == null) {
            C2942.m6404(str, "field.get error, ");
            return 0.0d;
        }
        try {
            long j = this.f23602;
            return j != -1 ? AbstractC2854.f8921.getDouble(obj, j) : this.f23613.getDouble(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C7547.m12775("field.get error, ", str, e);
            return 0.0d;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7547.m12775("field.get error, ", str, e);
            return 0.0d;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        double dM14087 = m14087(obj);
        DecimalFormat decimalFormat = this.f23612;
        if (decimalFormat != null) {
            abstractC2897.m6070(dM14087, decimalFormat);
        } else {
            abstractC2897.mo5991(dM14087);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        double dM14087 = m14087(obj);
        m14078(abstractC2897);
        DecimalFormat decimalFormat = this.f23612;
        if (decimalFormat != null) {
            abstractC2897.m6070(dM14087, decimalFormat);
            return true;
        }
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23611) != 0) {
            abstractC2897.mo6017(Double.toString(dM14087));
            return true;
        }
        abstractC2897.mo5991(dM14087);
        return true;
    }
}
