package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2752 extends C2692 {
    public C2752(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8417 = type2;
        if (cls2 != null) {
            AbstractC2860.m5774(cls2.getName());
        }
        if (cls != null) {
            AbstractC2860.m5774(AbstractC2867.m5943(cls));
        }
        if (str2 == null || type2 != Date.class) {
            return;
        }
        this.f8416 = new C2741(str2, locale);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Collection m5569(C2943 c2943) {
        Class cls = this.f8429;
        return (cls == List.class || cls == Collection.class || cls == ArrayList.class) ? new ArrayList() : (Collection) mo5496(c2943).mo5499(this.f8422);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        AbstractC2899 abstractC28992;
        if (abstractC2899.f9199) {
            mo5481(abstractC2899, obj);
            return;
        }
        Function functionMo5503 = null;
        if (abstractC2899.mo6133()) {
            mo5471(obj, null);
            return;
        }
        if (abstractC2899.mo6180()) {
            String strMo6189 = abstractC2899.mo6189();
            if ("..".equals(strMo6189)) {
                mo5471(obj, obj);
                return;
            } else {
                m5572(abstractC2899, obj, strMo6189);
                return;
            }
        }
        C2943 c2943 = abstractC2899.f9201;
        InterfaceC2788 interfaceC2788Mo5496 = mo5496(c2943);
        InterfaceC2788 interfaceC2788 = this.f8164;
        if (interfaceC2788 != null) {
            functionMo5503 = interfaceC2788.mo5503();
        } else if (interfaceC2788Mo5496 instanceof C2698) {
            functionMo5503 = ((C2698) interfaceC2788Mo5496).f8192;
        }
        char c = abstractC2899.f9193;
        if (c != '[') {
            if (c != '{' || !(m5575(c2943) instanceof C2772)) {
                boolean z = abstractC2899.f9199;
                long j = this.f8422;
                mo5471(obj, z ? interfaceC2788Mo5496.mo5467(abstractC2899, null, null, j) : interfaceC2788Mo5496.mo5463(abstractC2899, null, null, j));
                return;
            }
            boolean z2 = abstractC2899.f9199;
            InterfaceC2788 interfaceC27882 = this.f8416;
            long j2 = this.f8422;
            Object objMo5467 = z2 ? interfaceC27882.mo5467(abstractC2899, null, null, j2) : interfaceC27882.mo5463(abstractC2899, null, null, j2);
            Collection collection = (Collection) interfaceC2788Mo5496.mo5499(this.f8422);
            collection.add(objMo5467);
            if (functionMo5503 != null) {
                collection = (Collection) functionMo5503.apply(collection);
            }
            mo5471(obj, collection);
            abstractC2899.mo6145();
            return;
        }
        InterfaceC2788 interfaceC2788M5575 = m5575(c2943);
        Collection collectionM5569 = m5569(c2943);
        abstractC2899.mo6173();
        int i = 0;
        while (!abstractC2899.mo6142()) {
            if (abstractC2899.mo6188(i, collectionM5569)) {
                abstractC28992 = abstractC2899;
            } else {
                AbstractC2899 abstractC28993 = abstractC2899;
                abstractC28992 = abstractC28993;
                collectionM5569.add(interfaceC2788M5575.mo5463(abstractC28993, null, null, 0L));
                abstractC28992.mo6145();
            }
            i++;
            abstractC2899 = abstractC28992;
        }
        if (functionMo5503 != null) {
            collectionM5569 = (Collection) functionMo5503.apply(collectionM5569);
        }
        mo5471(obj, collectionM5569);
        abstractC2899.mo6145();
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        Function functionM5631;
        boolean z = abstractC2899.f9199;
        C2943 c2943 = abstractC2899.f9201;
        int i = 0;
        if (z) {
            int iMo6232 = abstractC2899.mo6232();
            if (iMo6232 == -1) {
                return null;
            }
            Object[] objArr = new Object[iMo6232];
            InterfaceC2788 interfaceC2788M5575 = m5575(c2943);
            while (i < iMo6232) {
                objArr[i] = interfaceC2788M5575.mo5463(abstractC2899, null, null, 0L);
                i++;
            }
            return Arrays.asList(objArr);
        }
        if (abstractC2899.f9193 == '[') {
            InterfaceC2788 interfaceC2788M55752 = m5575(c2943);
            Collection collectionM5569 = m5569(c2943);
            abstractC2899.mo6173();
            while (!abstractC2899.mo6142()) {
                collectionM5569.add(interfaceC2788M55752.mo5463(abstractC2899, null, null, 0L));
                abstractC2899.mo6145();
                interfaceC2788M55752 = interfaceC2788M55752;
            }
            abstractC2899.mo6145();
            return collectionM5569;
        }
        if (abstractC2899.mo6179()) {
            String strMo6184 = abstractC2899.mo6184();
            Type type = this.f8417;
            if ((type instanceof Class) && Number.class.isAssignableFrom((Class) type) && (functionM5631 = ((C2802) c2943.f9318).m5631(String.class, this.f8417)) != null) {
                Collection collectionM55692 = m5569(c2943);
                if (strMo6184.indexOf(44) != -1) {
                    String[] strArrSplit = strMo6184.split(",");
                    int length = strArrSplit.length;
                    while (i < length) {
                        collectionM55692.add(functionM5631.apply(strArrSplit[i]));
                        i++;
                    }
                }
                return collectionM55692;
            }
        }
        C0276.m850(abstractC2899.mo6170("TODO : " + getClass()));
        return null;
    }
}
