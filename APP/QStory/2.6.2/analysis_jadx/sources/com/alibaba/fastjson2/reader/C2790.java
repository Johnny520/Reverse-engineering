package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2790 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8631 = AbstractC2859.m5729("address");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8630 = AbstractC2859.m5729("port");

    public C2790(Class cls) {
        this.f8632 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        InetAddress inetAddress = null;
        if (abstractC2898.mo6087()) {
            return null;
        }
        Class cls = this.f8632;
        if (cls != InetSocketAddress.class) {
            C0276.m849(abstractC2898.mo6124("not support : ".concat(cls.getName())));
            return null;
        }
        abstractC2898.mo6102();
        int iIntValue = 0;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 == f8631) {
                inetAddress = (InetAddress) abstractC2898.mo6094(InetAddress.class);
            } else if (jMo6083 == f8630) {
                iIntValue = abstractC2898.mo6168().intValue();
            } else {
                abstractC2898.mo6188();
            }
        }
        abstractC2898.mo6099();
        return new InetSocketAddress(inetAddress, iIntValue);
    }
}
