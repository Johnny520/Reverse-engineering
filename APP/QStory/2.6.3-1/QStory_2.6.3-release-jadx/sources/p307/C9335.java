package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9335 extends AbstractC9323 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C9335(String str, int i, String str2, String str3, Field field) {
        Class cls = Double.TYPE;
        super(str, i, 0L, str2, null, str3, cls, cls, field, null);
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        return Double.valueOf(m14646(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final double m14646(Object obj) {
        String str = this.f23963;
        if (obj == null) {
            C3775.m6964(str, "field.get error, ");
            return 0.0d;
        }
        try {
            long j = this.f23947;
            return j != -1 ? AbstractC3687.f9266.getDouble(obj, j) : this.f23958.getDouble(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C8376.m13334("field.get error, ", str, e);
            return 0.0d;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C8376.m13334("field.get error, ", str, e);
            return 0.0d;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        double dM14646 = m14646(obj);
        DecimalFormat decimalFormat = this.f23957;
        if (decimalFormat != null) {
            abstractC3730.m6630(dM14646, decimalFormat);
        } else {
            abstractC3730.mo6551(dM14646);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        double dM14646 = m14646(obj);
        m14637(abstractC3730);
        DecimalFormat decimalFormat = this.f23957;
        if (decimalFormat != null) {
            abstractC3730.m6630(dM14646, decimalFormat);
            return true;
        }
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23956) != 0) {
            abstractC3730.mo6577(Double.toString(dM14646));
            return true;
        }
        abstractC3730.mo6551(dM14646);
        return true;
    }
}
