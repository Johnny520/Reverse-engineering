package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.lang.reflect.Field;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9268 extends AbstractC9262 {
    public C9268(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Long.TYPE, field, null);
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        return Long.valueOf(m14575(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long m14575(Object obj) {
        String str = this.f23963;
        if (obj == null) {
            C3775.m6964(str, "field.get error, ");
            return 0L;
        }
        try {
            long j = this.f23947;
            return j != -1 ? AbstractC3687.f9266.getLong(obj, j) : this.f23958.getLong(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C8376.m13334("field.get error, ", str, e);
            return 0L;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C8376.m13334("field.get error, ", str, e);
            return 0L;
        }
    }

    @Override // p307.AbstractC9262, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        abstractC3730.mo6523(m14575(obj));
    }

    @Override // p307.AbstractC9262, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        long jM14575 = m14575(obj);
        if (jM14575 == 0 && abstractC3730.m6636(JSONWriter$Feature.NotWriteDefaultValue)) {
            return false;
        }
        m14567(abstractC3730, jM14575);
        return true;
    }
}
