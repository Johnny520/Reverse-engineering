package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.function.Function;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2831 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8814 = AbstractC2859.m5729("zoneId");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f8815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8817;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8818;

    public C2831(Class cls) {
        this.f8818 = cls;
        ClassLoader classLoader = cls.getClassLoader();
        try {
            Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.chrono.GregorianChronology");
            Class<?> clsLoadClass2 = classLoader.loadClass("org.joda.time.DateTimeZone");
            this.f8815 = clsLoadClass.getMethod("getInstanceUTC", null).invoke(null, null);
            this.f8817 = AbstractC8575.m14120(clsLoadClass2.getMethod("forID", String.class));
            this.f8816 = AbstractC8575.m14120(clsLoadClass.getMethod("getInstance", clsLoadClass2));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C0276.m842("create ChronologyReader error", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        throw new JSONException(abstractC2898.mo6124("not support"));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8818;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        abstractC2898.mo6102();
        Integer numValueOf = null;
        String strMo6139 = null;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 == 8244232525129275563L) {
                numValueOf = Integer.valueOf(abstractC2898.mo6167());
            } else {
                if (jMo6083 != f8814) {
                    C0276.m849(abstractC2898.mo6124("not support fieldName " + abstractC2898.mo6058()));
                    return null;
                }
                strMo6139 = abstractC2898.mo6139();
            }
        }
        if (numValueOf != null) {
            C0276.m849(abstractC2898.mo6124("not support"));
            return null;
        }
        if ("UTC".equals(strMo6139)) {
            return this.f8815;
        }
        return this.f8816.apply(this.f8817.apply(strMo6139));
    }
}
