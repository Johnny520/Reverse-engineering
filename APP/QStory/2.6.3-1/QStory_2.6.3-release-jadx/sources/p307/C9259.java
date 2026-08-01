package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.lang.reflect.Field;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9259 extends AbstractC9262 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C9259(String str, int i, long j, String str2, String str3, Field field) {
        Class cls = Integer.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, null);
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        return Integer.valueOf(m14565(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m14565(Object obj) {
        String str = this.f23963;
        if (obj == null) {
            C3775.m6964(str, "field.get error, ");
            return 0;
        }
        try {
            long j = this.f23947;
            return j != -1 ? AbstractC3687.f9266.getInt(obj, j) : this.f23958.getInt(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C8376.m13334("field.get error, ", str, e);
            return 0;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C8376.m13334("field.get error, ", str, e);
            return 0;
        }
    }

    @Override // p307.AbstractC9262, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        abstractC3730.mo6533(m14565(obj));
    }

    @Override // p307.AbstractC9262, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        int iM14565 = m14565(obj);
        if (iM14565 == 0 && abstractC3730.m6636(JSONWriter$Feature.NotWriteDefaultValue)) {
            return false;
        }
        m14566(abstractC3730, iM14565);
        return true;
    }
}
