package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2722 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2722 f8288 = new C2722(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8287 = AbstractC2859.m5729("[C");

    public C2722(Function function) {
        super(char[].class);
        this.f8289 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6073()) {
            return null;
        }
        char c = abstractC2898.f9191;
        Function function = this.f8289;
        if (c == '\"') {
            char[] charArray = abstractC2898.mo6139().toCharArray();
            return function != null ? function.apply(charArray) : charArray;
        }
        if (!abstractC2898.mo6095()) {
            C0276.m849(abstractC2898.mo6124("TODO"));
            return null;
        }
        char[] cArrCopyOf = new char[16];
        int i = 0;
        while (!abstractC2898.mo6096()) {
            int i2 = i + 1;
            if (i2 - cArrCopyOf.length > 0) {
                int length = cArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                cArrCopyOf = Arrays.copyOf(cArrCopyOf, i3);
            }
            if (abstractC2898.mo6135()) {
                cArrCopyOf[i] = (char) abstractC2898.mo6167();
            } else {
                String strMo6139 = abstractC2898.mo6139();
                cArrCopyOf[i] = strMo6139 == null ? (char) 0 : strMo6139.charAt(0);
            }
            i = i2;
        }
        abstractC2898.mo6099();
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, i);
        return function != null ? function.apply(cArrCopyOf2) : cArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6097((byte) -110) && abstractC2898.mo6194() != f8287) {
            C0276.m840(abstractC2898.mo6055(), "not support autoType : ");
            return null;
        }
        if (abstractC2898.mo6133()) {
            return abstractC2898.mo6139().toCharArray();
        }
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        char[] cArr = new char[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            if (abstractC2898.mo6135()) {
                cArr[i] = (char) abstractC2898.mo6167();
            } else {
                cArr[i] = abstractC2898.mo6139().charAt(0);
            }
        }
        Function function = this.f8289;
        return function != null ? function.apply(cArr) : cArr;
    }
}
