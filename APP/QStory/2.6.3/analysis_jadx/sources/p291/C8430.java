package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.lang.reflect.Field;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8430 extends AbstractC8433 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8430(String str, int i, long j, String str2, String str3, Field field) {
        Class cls = Integer.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, null);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return Integer.valueOf(m14006(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m14006(Object obj) {
        String str = this.f23618;
        if (obj == null) {
            C2942.m6404(str, "field.get error, ");
            return 0;
        }
        try {
            long j = this.f23602;
            return j != -1 ? AbstractC2854.f8921.getInt(obj, j) : this.f23613.getInt(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C7547.m12775("field.get error, ", str, e);
            return 0;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7547.m12775("field.get error, ", str, e);
            return 0;
        }
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        abstractC2897.mo5973(m14006(obj));
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        int iM14006 = m14006(obj);
        if (iM14006 == 0 && abstractC2897.m6076(JSONWriter$Feature.NotWriteDefaultValue)) {
            return false;
        }
        m14007(abstractC2897, iM14006);
        return true;
    }
}
