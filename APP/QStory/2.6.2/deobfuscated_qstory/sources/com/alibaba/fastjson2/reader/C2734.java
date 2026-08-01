package com.alibaba.fastjson2.reader;

import androidx.compose.foundation.lazy.layout.C0707;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007.AbstractC6136;
import p278.C8362;
import p297.AbstractC8599;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2734 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Constructor f8350;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Constructor f8351;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Constructor f8352;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Constructor f8353;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final List f8354;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8355;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f8356;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final long f8349 = AbstractC2859.m5729("@type");

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final long f8348 = AbstractC2859.m5729("message");

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final long f8347 = AbstractC2859.m5729("detailMessage");

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final long f8346 = AbstractC2859.m5729("localizedMessage");

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final long f8345 = AbstractC2859.m5729("cause");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final long f8344 = AbstractC2859.m5729("stackTrace");

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final long f8343 = AbstractC2859.m5729("suppressedExceptions");

    public C2734(Class cls, List list, AbstractC2761... abstractC2761Arr) {
        int i;
        String[] strArrM14198;
        super(cls, null, cls.getName(), 0L, null, null, null, abstractC2761Arr);
        this.f8354 = list;
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
        this.f8353 = constructor;
        this.f8352 = constructor2;
        this.f8351 = constructor3;
        this.f8350 = constructor4;
        list.sort(new C0707(4));
        this.f8356 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Constructor constructor6 = (Constructor) it2.next();
            if (constructor6.getParameterCount() > 0) {
                strArrM14198 = AbstractC8599.m14198(constructor6);
                Parameter[] parameters = constructor6.getParameters();
                C8362 c8362 = new C8362();
                for (int i2 = 0; i2 < parameters.length && i2 < strArrM14198.length; i2++) {
                    c8362.m13848();
                    AbstractC2932.m6329().m5578(c8362, cls, constructor6, i2, parameters[i2]);
                    String str = c8362.f23050;
                    if (str != null) {
                        strArrM14198[i2] = str;
                    }
                }
            } else {
                strArrM14198 = null;
            }
            this.f8356.add(strArrM14198);
        }
        AbstractC2761 abstractC2761 = null;
        for (AbstractC2761 abstractC27612 : abstractC2761Arr) {
            if ("stackTrace".equals(abstractC27612.f8426) && abstractC27612.f8427 == StackTraceElement[].class) {
                abstractC2761 = abstractC27612;
            }
        }
        this.f8355 = abstractC2761;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰] */
    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5418(com.alibaba.fastjson2.AbstractC2898 r25, java.lang.reflect.Type r26, java.lang.Object r27, long r28) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2734.mo5418(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        InterfaceC2787 interfaceC2787;
        if (abstractC2898.mo6138() == -110) {
            C2942 c2942 = abstractC2898.f9199;
            if (abstractC2898.m6129(j)) {
                abstractC2898.mo6127();
                InterfaceC2787 interfaceC2787M5585 = ((C2801) c2942.f9316).m5585(abstractC2898.mo6194());
                if (interfaceC2787M5585 == null) {
                    String strMo6055 = abstractC2898.mo6055();
                    InterfaceC2787 interfaceC2787M6352 = c2942.m6352(null, strMo6055);
                    if (interfaceC2787M6352 == null) {
                        StringBuilder sbM11550 = AbstractC6136.m11550("autoType not support : ", strMo6055, ", offset ");
                        sbM11550.append(abstractC2898.f9192);
                        throw new JSONException(sbM11550.toString());
                    }
                    interfaceC2787 = interfaceC2787M6352;
                } else {
                    interfaceC2787 = interfaceC2787M5585;
                }
                return interfaceC2787.mo5422(abstractC2898, type, obj, 0L);
            }
            c2942.getClass();
        }
        return mo5418(abstractC2898, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        if (map == null) {
            return null;
        }
        return mo5418(AbstractC2898.m6046(InterfaceC2915.m6317(map)), null, null, j);
    }
}
