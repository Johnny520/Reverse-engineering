package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8495 extends AbstractC8494 {
    public C8495(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, null, str3, Float.class, Float.class, field, null);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        String str = this.f23618;
        if (obj == null) {
            C2942.m6404(str, "field.get error, ");
            return null;
        }
        long j = this.f23602;
        if (j != -1) {
            try {
                if (!this.f23617.isPrimitive()) {
                    return AbstractC2854.f8921.getObject(obj, j);
                }
            } catch (IllegalAccessException e) {
                e = e;
                C7547.m12775("field.get error, ", str, e);
                return null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                C7547.m12775("field.get error, ", str, e);
                return null;
            }
        }
        return this.f23613.get(obj);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        Float f = (Float) mo13995(obj);
        if (f == null) {
            abstractC2897.m6065();
            return;
        }
        float fFloatValue = f.floatValue();
        DecimalFormat decimalFormat = this.f23612;
        if (decimalFormat != null) {
            abstractC2897.m6067(fFloatValue, decimalFormat);
        } else {
            abstractC2897.mo5983(fFloatValue);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        Float f = (Float) mo13995(obj);
        if (f == null) {
            return m14077(abstractC2897);
        }
        m14078(abstractC2897);
        float fFloatValue = f.floatValue();
        DecimalFormat decimalFormat = this.f23612;
        if (decimalFormat != null) {
            abstractC2897.m6067(fFloatValue, decimalFormat);
            return true;
        }
        abstractC2897.mo5983(fFloatValue);
        return true;
    }
}
