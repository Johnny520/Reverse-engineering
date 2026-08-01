package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2723 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2723 f8290 = new C2723(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8289 = AbstractC2860.m5774("[C");

    public C2723(Function function) {
        super(char[].class);
        this.f8291 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6119()) {
            return null;
        }
        char c = abstractC2899.f9193;
        Function function = this.f8291;
        if (c == '\"') {
            char[] charArray = abstractC2899.mo6184().toCharArray();
            return function != null ? function.apply(charArray) : charArray;
        }
        if (!abstractC2899.mo6141()) {
            C0276.m850(abstractC2899.mo6170("TODO"));
            return null;
        }
        char[] cArrCopyOf = new char[16];
        int i = 0;
        while (!abstractC2899.mo6142()) {
            int i2 = i + 1;
            if (i2 - cArrCopyOf.length > 0) {
                int length = cArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                cArrCopyOf = Arrays.copyOf(cArrCopyOf, i3);
            }
            if (abstractC2899.mo6181()) {
                cArrCopyOf[i] = (char) abstractC2899.mo6212();
            } else {
                String strMo6184 = abstractC2899.mo6184();
                cArrCopyOf[i] = strMo6184 == null ? (char) 0 : strMo6184.charAt(0);
            }
            i = i2;
        }
        abstractC2899.mo6145();
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, i);
        return function != null ? function.apply(cArrCopyOf2) : cArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110) && abstractC2899.mo6239() != f8289) {
            C0276.m841(abstractC2899.mo6100(), "not support autoType : ");
            return null;
        }
        if (abstractC2899.mo6179()) {
            return abstractC2899.mo6184().toCharArray();
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        char[] cArr = new char[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            if (abstractC2899.mo6181()) {
                cArr[i] = (char) abstractC2899.mo6212();
            } else {
                cArr[i] = abstractC2899.mo6184().charAt(0);
            }
        }
        Function function = this.f8291;
        return function != null ? function.apply(cArr) : cArr;
    }
}
