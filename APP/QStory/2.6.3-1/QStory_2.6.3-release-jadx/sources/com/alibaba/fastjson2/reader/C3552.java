package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3552 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3552 f8628 = new C3552(Class.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8627 = AbstractC3693.m6334("java.lang.Class");

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        abstractC3732.mo6804();
        C3776 c3776 = abstractC3732.f9546;
        c3776.getClass();
        String strMo6660 = abstractC3732.mo6660();
        if (((c3776.f9665 | j) & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C1123.m1410(abstractC3732.mo6730("not support ClassForName : " + strMo6660 + ", you can config 'JSONReader.Feature.SupportClassForName'"));
            return null;
        }
        Class cls = (Class) AbstractC3700.f9378.get(strMo6660);
        if (cls != null) {
            return cls;
        }
        Class clsM6184 = ((C3635) c3776.f9663).m6184(strMo6660, null, JSONReader$Feature.SupportAutoType.mask);
        if (clsM6184 != null) {
            return clsM6184;
        }
        C1123.m1410(abstractC3732.mo6730("class not found " + strMo6660));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6703((byte) -110) || abstractC3732.mo6799() == f8627) {
            return mo6023(abstractC3732, type, obj, j);
        }
        C1123.m1410(abstractC3732.mo6730("not support autoType : " + abstractC3732.mo6660()));
        return null;
    }
}
