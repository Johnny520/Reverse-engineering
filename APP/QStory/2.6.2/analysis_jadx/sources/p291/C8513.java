package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8513 extends AbstractC8502 {
    public C8513(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, null, str3, Double.class, Double.class, field, null);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        String str = this.f23627;
        if (obj == null) {
            C2941.m6346(str, "field.get error, ");
            return null;
        }
        long j = this.f23611;
        if (j != -1) {
            try {
                if (!this.f23626.isPrimitive()) {
                    return AbstractC2853.f8919.getObject(obj, j);
                }
            } catch (IllegalAccessException e) {
                e = e;
                C7546.m12746("field.get error, ", str, e);
                return null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                C7546.m12746("field.get error, ", str, e);
                return null;
            }
        }
        return this.f23622.get(obj);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        Double d = (Double) mo13976(obj);
        if (d == null) {
            abstractC2896.m6019();
            return;
        }
        double dDoubleValue = d.doubleValue();
        DecimalFormat decimalFormat = this.f23621;
        if (decimalFormat != null) {
            abstractC2896.m6024(dDoubleValue, decimalFormat);
        } else {
            abstractC2896.mo5946(dDoubleValue);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        Double d = (Double) mo13976(obj);
        if (d == null) {
            return m14058(abstractC2896);
        }
        m14059(abstractC2896);
        double dDoubleValue = d.doubleValue();
        DecimalFormat decimalFormat = this.f23621;
        if (decimalFormat != null) {
            abstractC2896.m6024(dDoubleValue, decimalFormat);
            return true;
        }
        abstractC2896.mo5946(dDoubleValue);
        return true;
    }
}
