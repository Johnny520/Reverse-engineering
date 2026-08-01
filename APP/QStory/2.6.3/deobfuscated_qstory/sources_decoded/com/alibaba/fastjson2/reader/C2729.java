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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2729 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2729 f8304 = new C2729(Integer[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8303 = AbstractC2860.m5774("[Integer");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6119()) {
            if (abstractC2899.mo6141()) {
                Integer[] numArr = new Integer[16];
                int i = 0;
                while (!abstractC2899.mo6142()) {
                    if (abstractC2899.mo6165()) {
                        C0276.m850(abstractC2899.mo6170("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - numArr.length > 0) {
                        int length = numArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        numArr = (Integer[]) Arrays.copyOf(numArr, i3);
                    }
                    numArr[i] = abstractC2899.mo6213();
                    i = i2;
                }
                abstractC2899.mo6145();
                return Arrays.copyOf(numArr, i);
            }
            if (!abstractC2899.mo6179()) {
                if (abstractC2899.mo6178()) {
                    return new Integer[]{abstractC2899.mo6213()};
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
        Integer[] numArr = new Integer[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Integer numValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    numValueOf = Integer.valueOf(((Number) obj).intValue());
                } else {
                    Function functionM5631 = AbstractC2933.m6387().m5631(obj.getClass(), Integer.class);
                    if (functionM5631 == null) {
                        C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to Integer ")));
                        return null;
                    }
                    numValueOf = (Integer) functionM5631.apply(obj);
                }
            }
            numArr[i] = numValueOf;
            i++;
        }
        return numArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110)) {
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != f8303 && jMo6239 != C2708.f8232) {
                C0276.m850(abstractC2899.mo6170("not support type " + abstractC2899.mo6100()));
                return null;
            }
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        Integer[] numArr = new Integer[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            numArr[i] = abstractC2899.mo6213();
        }
        return numArr;
    }
}
