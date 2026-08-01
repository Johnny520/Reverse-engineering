package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Field;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8444 extends AbstractC8508 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8444(String str, int i, long j, String str2, String str3, Field field) {
        Class cls = Byte.TYPE;
        super(str, i, j, str2, null, str3, cls, cls, field, null, 1);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return Byte.valueOf(m13996(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final byte m13996(Object obj) {
        String str = this.f23627;
        if (obj == null) {
            C2941.m6346(str, "field.get error, ");
            return (byte) 0;
        }
        try {
            long j = this.f23611;
            return j != -1 ? AbstractC2853.f8919.getByte(obj, j) : this.f23622.getByte(obj);
        } catch (IllegalAccessException e) {
            e = e;
            C7546.m12746("field.get error, ", str, e);
            return (byte) 0;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7546.m12746("field.get error, ", str, e);
            return (byte) 0;
        }
    }

    @Override // p291.AbstractC8508, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        abstractC2896.mo5928(m13996(obj));
    }

    @Override // p291.AbstractC8508, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        m14064(abstractC2896, m13996(obj));
        return true;
    }
}
