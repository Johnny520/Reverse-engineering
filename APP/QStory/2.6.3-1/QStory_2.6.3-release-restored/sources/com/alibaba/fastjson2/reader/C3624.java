package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3624 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f8978 = AbstractC3693.m6334("address");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8977 = AbstractC3693.m6334("port");

    public C3624(Class cls) {
        this.f8979 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        InetAddress inetAddress = null;
        if (abstractC3732.mo6693()) {
            return null;
        }
        Class cls = this.f8979;
        if (cls != InetSocketAddress.class) {
            C1123.m1410(abstractC3732.mo6730("not support : ".concat(cls.getName())));
            return null;
        }
        abstractC3732.mo6708();
        int iIntValue = 0;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == f8978) {
                inetAddress = (InetAddress) abstractC3732.mo6700(InetAddress.class);
            } else if (jMo6689 == f8977) {
                iIntValue = abstractC3732.mo6773().intValue();
            } else {
                abstractC3732.mo6793();
            }
        }
        abstractC3732.mo6705();
        return new InetSocketAddress(inetAddress, iIntValue);
    }
}
