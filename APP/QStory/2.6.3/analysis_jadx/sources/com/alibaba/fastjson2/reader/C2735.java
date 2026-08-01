package com.alibaba.fastjson2.reader;

import androidx.compose.foundation.lazy.layout.C0707;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p009.AbstractC6183;
import p278.C8363;
import p297.AbstractC8591;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2735 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Constructor f8352;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Constructor f8353;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Constructor f8354;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Constructor f8355;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f8356;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8357;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f8358;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final long f8351 = AbstractC2860.m5774("@type");

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final long f8350 = AbstractC2860.m5774("message");

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final long f8349 = AbstractC2860.m5774("detailMessage");

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final long f8348 = AbstractC2860.m5774("localizedMessage");

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final long f8347 = AbstractC2860.m5774("cause");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long f8346 = AbstractC2860.m5774("stackTrace");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final long f8345 = AbstractC2860.m5774("suppressedExceptions");

    public C2735(Class cls, List list, AbstractC2762... abstractC2762Arr) {
        int i;
        String[] strArrM14217;
        super(cls, null, cls.getName(), 0L, null, null, null, abstractC2762Arr);
        this.f8356 = list;
        Iterator it = list.iterator();
        Constructor constructor = null;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        Constructor constructor4 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Constructor constructor5 = (Constructor) it.next();
            if (constructor5 != null && constructor3 == null) {
                int parameterCount = constructor5.getParameterCount();
                if (parameterCount == 0) {
                    constructor = constructor5;
                } else {
                    Class<?>[] parameterTypes = constructor5.getParameterTypes();
                    Class<?> cls2 = parameterTypes[0];
                    if (parameterCount == 1) {
                        if (cls2 == String.class) {
                            constructor2 = constructor5;
                        } else if (Throwable.class.isAssignableFrom(cls2)) {
                            constructor4 = constructor5;
                        }
                    }
                    if (parameterCount == 2 && cls2 == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                        constructor3 = constructor5;
                    }
                }
            }
        }
        this.f8355 = constructor;
        this.f8354 = constructor2;
        this.f8353 = constructor3;
        this.f8352 = constructor4;
        list.sort(new C0707(4));
        this.f8358 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Constructor constructor6 = (Constructor) it2.next();
            if (constructor6.getParameterCount() > 0) {
                strArrM14217 = AbstractC8591.m14217(constructor6);
                Parameter[] parameters = constructor6.getParameters();
                C8363 c8363 = new C8363();
                for (int i2 = 0; i2 < parameters.length && i2 < strArrM14217.length; i2++) {
                    c8363.m13865();
                    AbstractC2933.m6387().m5623(c8363, cls, constructor6, i2, parameters[i2]);
                    String str = c8363.f23049;
                    if (str != null) {
                        strArrM14217[i2] = str;
                    }
                }
            } else {
                strArrM14217 = null;
            }
            this.f8358.add(strArrM14217);
        }
        AbstractC2762 abstractC2762 = null;
        for (AbstractC2762 abstractC27622 : abstractC2762Arr) {
            if ("stackTrace".equals(abstractC27622.f8428) && abstractC27622.f8429 == StackTraceElement[].class) {
                abstractC2762 = abstractC27622;
            }
        }
        this.f8357 = abstractC2762;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰] */
    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5463(com.alibaba.fastjson2.AbstractC2899 r25, java.lang.reflect.Type r26, java.lang.Object r27, long r28) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2735.mo5463(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        InterfaceC2788 interfaceC2788;
        if (abstractC2899.mo6183() == -110) {
            C2943 c2943 = abstractC2899.f9201;
            if (abstractC2899.m6175(j)) {
                abstractC2899.mo6173();
                InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(abstractC2899.mo6239());
                if (interfaceC2788M5630 == null) {
                    String strMo6100 = abstractC2899.mo6100();
                    InterfaceC2788 interfaceC2788M6410 = c2943.m6410(null, strMo6100);
                    if (interfaceC2788M6410 == null) {
                        StringBuilder sbM11585 = AbstractC6183.m11585("autoType not support : ", strMo6100, ", offset ");
                        sbM11585.append(abstractC2899.f9194);
                        throw new JSONException(sbM11585.toString());
                    }
                    interfaceC2788 = interfaceC2788M6410;
                } else {
                    interfaceC2788 = interfaceC2788M5630;
                }
                return interfaceC2788.mo5467(abstractC2899, type, obj, 0L);
            }
            c2943.getClass();
        }
        return mo5463(abstractC2899, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        if (map == null) {
            return null;
        }
        return mo5463(AbstractC2899.m6091(InterfaceC2916.m6375(map)), null, null, j);
    }
}
