package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3536 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8550 = AbstractC3693.m6334("declaringClass");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8549 = AbstractC3693.m6334("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8548 = AbstractC3693.m6334("parameterTypes");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Method m6064(AbstractC3732 abstractC3732, long j) {
        boolean zMo6708 = abstractC3732.mo6708();
        C3776 c3776 = abstractC3732.f9546;
        boolean z = abstractC3732.f9544;
        String strMo6744 = null;
        if (zMo6708) {
            String strMo67442 = null;
            List listMo6682 = null;
            while (!abstractC3732.mo6712()) {
                long jMo6689 = abstractC3732.mo6689();
                if (jMo6689 == f8550) {
                    strMo67442 = abstractC3732.mo6744();
                } else if (jMo6689 == f8549) {
                    strMo6744 = abstractC3732.mo6744();
                } else if (jMo6689 == f8548) {
                    listMo6682 = abstractC3732.mo6682(String.class);
                } else {
                    abstractC3732.mo6793();
                }
            }
            if (!z) {
                abstractC3732.mo6705();
            }
            return m6066(c3776.f9665 | j, strMo6744, strMo67442, listMo6682);
        }
        if (!abstractC3732.m6732(j)) {
            C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
            return null;
        }
        if (z) {
            return m6065(abstractC3732, j);
        }
        if (!abstractC3732.mo6701()) {
            C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
            return null;
        }
        String strMo67443 = abstractC3732.mo6744();
        String strMo67444 = abstractC3732.mo6744();
        List listMo66822 = abstractC3732.mo6682(String.class);
        if (abstractC3732.mo6702()) {
            abstractC3732.mo6705();
            return m6066(c3776.f9665 | j, strMo67444, strMo67443, listMo66822);
        }
        C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Method m6065(AbstractC3732 abstractC3732, long j) {
        if (abstractC3732.mo6792() != 3) {
            C1123.m1410("not support input ".concat(abstractC3732.mo6730(null)));
            return null;
        }
        String strMo6744 = abstractC3732.mo6744();
        return m6066(abstractC3732.f9546.f9665 | j, abstractC3732.mo6744(), strMo6744, abstractC3732.mo6682(String.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Method m6066(long j, String str, String str2, List list) {
        Class<?>[] clsArr;
        if ((j & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C1123.m1410("ClassForName not support");
            return null;
        }
        Class clsM6489 = AbstractC3700.m6489(str2);
        if (list == null) {
            clsArr = new Class[0];
        } else {
            Class<?>[] clsArr2 = new Class[list.size()];
            for (int i = 0; i < list.size(); i++) {
                clsArr2[i] = AbstractC3700.m6489((String) list.get(i));
            }
            clsArr = clsArr2;
        }
        try {
            return clsM6489.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            C1123.m1403("method not found", e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final /* bridge */ /* synthetic */ Object mo6022(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return m6065(abstractC3732, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ /* synthetic */ Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return m6064(abstractC3732, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return m6064(abstractC3732, j);
    }
}
