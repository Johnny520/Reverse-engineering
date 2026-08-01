package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2710 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8240;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2710 f8239 = new C2710(long[].class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8238 = AbstractC2859.m5729("[J");

    public C2710(Class cls, Function function) {
        super(cls);
        this.f8240 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Function function;
        long[] jArrMo6163 = abstractC2898.mo6163();
        return (jArrMo6163 == null || (function = this.f8240) == null) ? jArrMo6163 : function.apply(jArrMo6163);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        long jLongValue;
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                jLongValue = 0;
            } else if (obj instanceof Number) {
                jLongValue = ((Number) obj).longValue();
            } else {
                Function functionM5586 = AbstractC2932.m6329().m5586(obj.getClass(), Long.TYPE);
                if (functionM5586 == null) {
                    C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to long ")));
                    return null;
                }
                jLongValue = ((Long) functionM5586.apply(obj)).longValue();
            }
            jArr[i] = jLongValue;
            i++;
        }
        Function function = this.f8240;
        return function != null ? function.apply(jArr) : jArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Function function;
        long[] jArrMo6163 = abstractC2898.mo6163();
        return (jArrMo6163 == null || (function = this.f8240) == null) ? jArrMo6163 : function.apply(jArrMo6163);
    }
}
