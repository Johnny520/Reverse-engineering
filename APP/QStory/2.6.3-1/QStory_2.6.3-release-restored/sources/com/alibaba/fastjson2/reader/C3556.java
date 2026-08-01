package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3556 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3556 f8635 = new C3556(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8634 = AbstractC3693.m6334("[C");

    public C3556(Function function) {
        super(char[].class);
        this.f8636 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6679()) {
            return null;
        }
        char c = abstractC3732.f9538;
        Function function = this.f8636;
        if (c == '\"') {
            char[] charArray = abstractC3732.mo6744().toCharArray();
            return function != null ? function.apply(charArray) : charArray;
        }
        if (!abstractC3732.mo6701()) {
            C1123.m1410(abstractC3732.mo6730("TODO"));
            return null;
        }
        char[] cArrCopyOf = new char[16];
        int i = 0;
        while (!abstractC3732.mo6702()) {
            int i2 = i + 1;
            if (i2 - cArrCopyOf.length > 0) {
                int length = cArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                cArrCopyOf = Arrays.copyOf(cArrCopyOf, i3);
            }
            if (abstractC3732.mo6741()) {
                cArrCopyOf[i] = (char) abstractC3732.mo6772();
            } else {
                String strMo6744 = abstractC3732.mo6744();
                cArrCopyOf[i] = strMo6744 == null ? (char) 0 : strMo6744.charAt(0);
            }
            i = i2;
        }
        abstractC3732.mo6705();
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, i);
        return function != null ? function.apply(cArrCopyOf2) : cArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110) && abstractC3732.mo6799() != f8634) {
            C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
            return null;
        }
        if (abstractC3732.mo6739()) {
            return abstractC3732.mo6744().toCharArray();
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        char[] cArr = new char[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            if (abstractC3732.mo6741()) {
                cArr[i] = (char) abstractC3732.mo6772();
            } else {
                cArr[i] = abstractC3732.mo6744().charAt(0);
            }
        }
        Function function = this.f8636;
        return function != null ? function.apply(cArr) : cArr;
    }
}
