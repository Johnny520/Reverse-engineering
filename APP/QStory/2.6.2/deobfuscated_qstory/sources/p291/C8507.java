package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8507 extends AbstractC8502 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8507(String str, int i, long j, String str2, String str3, Field field) {
        Class cls = Float.TYPE;
        super(str, i, j, str2, null, str3, cls, cls, field, null);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return Float.valueOf(m14062(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float m14062(Object obj) {
        String str = this.f23627;
        if (obj == null) {
            C2941.m6346(str, "field.get error, ");
            return 0.0f;
        }
        try {
            long j = this.f23611;
            return j != -1 ? AbstractC2853.f8919.getFloat(obj, j) : this.f23622.getFloat(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C7546.m12746("field.get error, ", str, e);
            return 0.0f;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7546.m12746("field.get error, ", str, e);
            return 0.0f;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        float fM14062 = m14062(obj);
        DecimalFormat decimalFormat = this.f23621;
        if (decimalFormat != null) {
            abstractC2896.m6021(fM14062, decimalFormat);
        } else {
            abstractC2896.mo5938(fM14062);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        float fM14062 = m14062(obj);
        m14059(abstractC2896);
        DecimalFormat decimalFormat = this.f23621;
        if (decimalFormat != null) {
            abstractC2896.m6021(fM14062, decimalFormat);
            return true;
        }
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23620) != 0) {
            abstractC2896.mo5972(Float.toString(fM14062));
            return true;
        }
        abstractC2896.mo5938(fM14062);
        return true;
    }
}
