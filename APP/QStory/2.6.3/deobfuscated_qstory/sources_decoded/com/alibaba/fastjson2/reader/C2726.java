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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2726 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2726 f8295 = new C2726(Short[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8294 = AbstractC2860.m5774("[Short");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6119()) {
            if (abstractC2899.mo6141()) {
                Short[] shArr = new Short[16];
                int i = 0;
                while (!abstractC2899.mo6142()) {
                    if (abstractC2899.mo6165()) {
                        C0276.m850(abstractC2899.mo6170("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - shArr.length > 0) {
                        int length = shArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        shArr = (Short[]) Arrays.copyOf(shArr, i3);
                    }
                    Integer numMo6213 = abstractC2899.mo6213();
                    shArr[i] = Short.valueOf(numMo6213 == null ? (short) 0 : numMo6213.shortValue());
                    i = i2;
                }
                abstractC2899.mo6145();
                return Arrays.copyOf(shArr, i);
            }
            if (!abstractC2899.mo6179()) {
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
        Short[] shArr = new Short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Short shValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    shValueOf = Short.valueOf(((Number) obj).shortValue());
                } else {
                    Function functionM5631 = AbstractC2933.m6387().m5631(obj.getClass(), Short.class);
                    if (functionM5631 == null) {
                        C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to Short ")));
                        return null;
                    }
                    shValueOf = (Short) functionM5631.apply(obj);
                }
            }
            shArr[i] = shValueOf;
            i++;
        }
        return shArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110)) {
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != f8294 && jMo6239 != C2730.f8305) {
                C0276.m850(abstractC2899.mo6170("not support type " + abstractC2899.mo6100()));
                return null;
            }
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        Short[] shArr = new Short[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            Integer numMo6213 = abstractC2899.mo6213();
            shArr[i] = numMo6213 == null ? null : Short.valueOf(numMo6213.shortValue());
        }
        return shArr;
    }
}
