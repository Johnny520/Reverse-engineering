package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2707 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2707 f8231 = new C2707(Long[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8230 = AbstractC2860.m5774("[Long");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6119()) {
            if (abstractC2899.mo6141()) {
                Long[] lArr = new Long[16];
                int i = 0;
                while (!abstractC2899.mo6142()) {
                    if (abstractC2899.mo6165()) {
                        C0276.m850(abstractC2899.mo6170("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - lArr.length > 0) {
                        int length = lArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        lArr = (Long[]) Arrays.copyOf(lArr, i3);
                    }
                    lArr[i] = abstractC2899.mo6210();
                    i = i2;
                }
                abstractC2899.mo6145();
                return Arrays.copyOf(lArr, i);
            }
            if (!abstractC2899.mo6179()) {
                if (abstractC2899.mo6178()) {
                    return new Long[]{abstractC2899.mo6210()};
                }
                C0276.m850(abstractC2899.mo6170("TODO"));
                return null;
            }
            String strMo6184 = abstractC2899.mo6184();
            if (!strMo6184.isEmpty()) {
                C0276.m850(abstractC2899.mo6170("not support input ".concat(strMo6184)));
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        Long[] lArr = new Long[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Long lValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    lValueOf = Long.valueOf(((Number) obj).longValue());
                } else {
                    Function functionM5631 = AbstractC2933.m6387().m5631(obj.getClass(), Long.class);
                    if (functionM5631 == null) {
                        C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to Integer ")));
                        return null;
                    }
                    lValueOf = (Long) functionM5631.apply(obj);
                }
            }
            lArr[i] = lValueOf;
            i++;
        }
        return lArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110)) {
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != f8230 && jMo6239 != C2711.f8240 && jMo6239 != C2729.f8303 && jMo6239 != C2708.f8232) {
                C0276.m850(abstractC2899.mo6170("not support type " + abstractC2899.mo6100()));
                return null;
            }
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        Long[] lArr = new Long[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            lArr[i] = abstractC2899.mo6210();
        }
        return lArr;
    }
}
