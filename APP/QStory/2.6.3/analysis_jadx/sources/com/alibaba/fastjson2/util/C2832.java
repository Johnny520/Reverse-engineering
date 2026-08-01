package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.function.Function;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2832 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8816 = AbstractC2860.m5774("zoneId");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f8817;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8818;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8819;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8820;

    public C2832(Class cls) {
        this.f8820 = cls;
        ClassLoader classLoader = cls.getClassLoader();
        try {
            Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.chrono.GregorianChronology");
            Class<?> clsLoadClass2 = classLoader.loadClass("org.joda.time.DateTimeZone");
            this.f8817 = clsLoadClass.getMethod("getInstanceUTC", null).invoke(null, null);
            this.f8819 = AbstractC8567.m14139(clsLoadClass2.getMethod("forID", String.class));
            this.f8818 = AbstractC8567.m14139(clsLoadClass.getMethod("getInstance", clsLoadClass2));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C0276.m843("create ChronologyReader error", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        throw new JSONException(abstractC2899.mo6170("not support"));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8820;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        abstractC2899.mo6148();
        Integer numValueOf = null;
        String strMo6184 = null;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == 8244232525129275563L) {
                numValueOf = Integer.valueOf(abstractC2899.mo6212());
            } else {
                if (jMo6129 != f8816) {
                    C0276.m850(abstractC2899.mo6170("not support fieldName " + abstractC2899.mo6104()));
                    return null;
                }
                strMo6184 = abstractC2899.mo6184();
            }
        }
        if (numValueOf != null) {
            C0276.m850(abstractC2899.mo6170("not support"));
            return null;
        }
        if ("UTC".equals(strMo6184)) {
            return this.f8817;
        }
        return this.f8818.apply(this.f8819.apply(strMo6184));
    }
}
