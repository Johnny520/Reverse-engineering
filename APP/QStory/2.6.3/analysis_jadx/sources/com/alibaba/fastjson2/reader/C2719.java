package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2719 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2719 f8283 = new C2719(Class.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8282 = AbstractC2860.m5774("java.lang.Class");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        abstractC2899.mo6244();
        C2943 c2943 = abstractC2899.f9201;
        c2943.getClass();
        String strMo6100 = abstractC2899.mo6100();
        if (((c2943.f9320 | j) & JSONReader$Feature.SupportClassForName.mask) == 0) {
            C0276.m850(abstractC2899.mo6170("not support ClassForName : " + strMo6100 + ", you can config 'JSONReader.Feature.SupportClassForName'"));
            return null;
        }
        Class cls = (Class) AbstractC2867.f9033.get(strMo6100);
        if (cls != null) {
            return cls;
        }
        Class clsM5624 = ((C2802) c2943.f9318).m5624(strMo6100, null, JSONReader$Feature.SupportAutoType.mask);
        if (clsM5624 != null) {
            return clsM5624;
        }
        C0276.m850(abstractC2899.mo6170("class not found " + strMo6100));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6143((byte) -110) || abstractC2899.mo6239() == f8282) {
            return mo5463(abstractC2899, type, obj, j);
        }
        C0276.m850(abstractC2899.mo6170("not support autoType : " + abstractC2899.mo6100()));
        return null;
    }
}
