package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.lang.reflect.Field;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8439 extends AbstractC8433 {
    public C8439(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Long.TYPE, field, null);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return Long.valueOf(m14016(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long m14016(Object obj) {
        String str = this.f23618;
        if (obj == null) {
            C2942.m6404(str, "field.get error, ");
            return 0L;
        }
        try {
            long j = this.f23602;
            return j != -1 ? AbstractC2854.f8921.getLong(obj, j) : this.f23613.getLong(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C7547.m12775("field.get error, ", str, e);
            return 0L;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7547.m12775("field.get error, ", str, e);
            return 0L;
        }
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        abstractC2897.mo5963(m14016(obj));
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        long jM14016 = m14016(obj);
        if (jM14016 == 0 && abstractC2897.m6076(JSONWriter$Feature.NotWriteDefaultValue)) {
            return false;
        }
        m14008(abstractC2897, jM14016);
        return true;
    }
}
