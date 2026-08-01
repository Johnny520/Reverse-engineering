package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2722 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2722 f8288 = new C2722(boolean[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8287 = AbstractC2860.m5774("[Z");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6119()) {
            if (abstractC2899.mo6141()) {
                boolean[] zArrCopyOf = new boolean[16];
                int i = 0;
                while (!abstractC2899.mo6142()) {
                    int i2 = i + 1;
                    if (i2 - zArrCopyOf.length > 0) {
                        int length = zArrCopyOf.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        zArrCopyOf = Arrays.copyOf(zArrCopyOf, i3);
                    }
                    zArrCopyOf[i] = abstractC2899.mo6108();
                    i = i2;
                }
                abstractC2899.mo6145();
                return Arrays.copyOf(zArrCopyOf, i);
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110) && abstractC2899.mo6239() != f8287) {
            C0276.m841(abstractC2899.mo6100(), "not support autoType : ");
            return null;
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        boolean[] zArr = new boolean[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            zArr[i] = abstractC2899.mo6108();
        }
        return zArr;
    }
}
