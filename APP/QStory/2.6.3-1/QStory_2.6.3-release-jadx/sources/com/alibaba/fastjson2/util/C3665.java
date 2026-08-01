package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.function.Function;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3665 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f9161 = AbstractC3693.m6334("zoneId");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f9162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f9163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f9164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f9165;

    public C3665(Class cls) {
        this.f9165 = cls;
        ClassLoader classLoader = cls.getClassLoader();
        try {
            Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.chrono.GregorianChronology");
            Class<?> clsLoadClass2 = classLoader.loadClass("org.joda.time.DateTimeZone");
            this.f9162 = clsLoadClass.getMethod("getInstanceUTC", null).invoke(null, null);
            this.f9164 = AbstractC9396.m14698(clsLoadClass2.getMethod("forID", String.class));
            this.f9163 = AbstractC9396.m14698(clsLoadClass.getMethod("getInstance", clsLoadClass2));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C1123.m1403("create ChronologyReader error", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        throw new JSONException(abstractC3732.mo6730("not support"));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f9165;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        abstractC3732.mo6708();
        Integer numValueOf = null;
        String strMo6744 = null;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == 8244232525129275563L) {
                numValueOf = Integer.valueOf(abstractC3732.mo6772());
            } else {
                if (jMo6689 != f9161) {
                    C1123.m1410(abstractC3732.mo6730("not support fieldName " + abstractC3732.mo6664()));
                    return null;
                }
                strMo6744 = abstractC3732.mo6744();
            }
        }
        if (numValueOf != null) {
            C1123.m1410(abstractC3732.mo6730("not support"));
            return null;
        }
        if ("UTC".equals(strMo6744)) {
            return this.f9162;
        }
        return this.f9163.apply(this.f9164.apply(strMo6744));
    }
}
