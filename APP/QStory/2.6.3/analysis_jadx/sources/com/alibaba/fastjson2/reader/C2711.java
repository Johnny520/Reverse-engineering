package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2711 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2711 f8241 = new C2711(long[].class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8240 = AbstractC2860.m5774("[J");

    public C2711(Class cls, Function function) {
        super(cls);
        this.f8242 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Function function;
        long[] jArrMo6208 = abstractC2899.mo6208();
        return (jArrMo6208 == null || (function = this.f8242) == null) ? jArrMo6208 : function.apply(jArrMo6208);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        long jLongValue;
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                jLongValue = 0;
            } else if (obj instanceof Number) {
                jLongValue = ((Number) obj).longValue();
            } else {
                Function functionM5631 = AbstractC2933.m6387().m5631(obj.getClass(), Long.TYPE);
                if (functionM5631 == null) {
                    C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to long ")));
                    return null;
                }
                jLongValue = ((Long) functionM5631.apply(obj)).longValue();
            }
            jArr[i] = jLongValue;
            i++;
        }
        Function function = this.f8242;
        return function != null ? function.apply(jArr) : jArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Function function;
        long[] jArrMo6208 = abstractC2899.mo6208();
        return (jArrMo6208 == null || (function = this.f8242) == null) ? jArrMo6208 : function.apply(jArrMo6208);
    }
}
