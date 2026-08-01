package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2791 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8633 = AbstractC2860.m5774("address");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8632 = AbstractC2860.m5774("port");

    public C2791(Class cls) {
        this.f8634 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        InetAddress inetAddress = null;
        if (abstractC2899.mo6133()) {
            return null;
        }
        Class cls = this.f8634;
        if (cls != InetSocketAddress.class) {
            C0276.m850(abstractC2899.mo6170("not support : ".concat(cls.getName())));
            return null;
        }
        abstractC2899.mo6148();
        int iIntValue = 0;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == f8633) {
                inetAddress = (InetAddress) abstractC2899.mo6140(InetAddress.class);
            } else if (jMo6129 == f8632) {
                iIntValue = abstractC2899.mo6213().intValue();
            } else {
                abstractC2899.mo6233();
            }
        }
        abstractC2899.mo6145();
        return new InetSocketAddress(inetAddress, iIntValue);
    }
}
