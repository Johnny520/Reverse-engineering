package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Field;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8447 extends AbstractC8441 {
    public C8447(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Long.TYPE, field, null);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return Long.valueOf(m13997(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long m13997(Object obj) {
        String str = this.f23627;
        if (obj == null) {
            C2941.m6346(str, "field.get error, ");
            return 0L;
        }
        try {
            long j = this.f23611;
            return j != -1 ? AbstractC2853.f8919.getLong(obj, j) : this.f23622.getLong(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C7546.m12746("field.get error, ", str, e);
            return 0L;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7546.m12746("field.get error, ", str, e);
            return 0L;
        }
    }

    @Override // p291.AbstractC8441, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        abstractC2896.mo5918(m13997(obj));
    }

    @Override // p291.AbstractC8441, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        long jM13997 = m13997(obj);
        if (jM13997 == 0 && abstractC2896.m6030(JSONWriter$Feature.NotWriteDefaultValue)) {
            return false;
        }
        m13989(abstractC2896, jM13997);
        return true;
    }
}
