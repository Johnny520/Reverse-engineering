package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3573 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8722 = AbstractC3693.m6334("declaringClass");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8721 = AbstractC3693.m6334("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Field m6096(String str, String str2, long j) {
        if ((j & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C1123.m1410("ClassForName not support");
            return null;
        }
        try {
            return AbstractC3700.m6489(str2).getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            C1123.m1403("method not found", e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final Object mo6022(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6792() == 2) {
            return m6096(abstractC3732.mo6744(), abstractC3732.mo6744(), abstractC3732.f9546.f9665 | j);
        }
        C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        boolean zMo6708 = abstractC3732.mo6708();
        boolean z = abstractC3732.f9544;
        String strMo6744 = null;
        if (!zMo6708) {
            if (abstractC3732.m6732(j)) {
                return z ? mo6022(abstractC3732, type, obj, j) : mo6097(abstractC3732, type, obj, j);
            }
            C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
            return null;
        }
        String strMo67442 = null;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == f8722) {
                strMo67442 = abstractC3732.mo6744();
            } else if (jMo6689 == f8721) {
                strMo6744 = abstractC3732.mo6744();
            } else {
                abstractC3732.mo6793();
            }
        }
        if (!z) {
            abstractC3732.mo6705();
        }
        return m6096(strMo6744, strMo67442, abstractC3732.f9546.f9665 | j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo6097(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6701()) {
            C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
            return null;
        }
        String strMo6744 = abstractC3732.mo6744();
        String strMo67442 = abstractC3732.mo6744();
        if (abstractC3732.mo6702()) {
            abstractC3732.mo6705();
            return m6096(strMo67442, strMo6744, abstractC3732.f9546.f9665 | j);
        }
        C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return mo6023(abstractC3732, type, obj, j);
    }
}
