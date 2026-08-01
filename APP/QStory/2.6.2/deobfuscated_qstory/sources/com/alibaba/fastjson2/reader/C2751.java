package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2751 extends C2691 {
    public C2751(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8415 = type2;
        if (cls2 != null) {
            AbstractC2859.m5729(cls2.getName());
        }
        if (cls != null) {
            AbstractC2859.m5729(AbstractC2866.m5898(cls));
        }
        if (str2 == null || type2 != Date.class) {
            return;
        }
        this.f8414 = new C2740(str2, locale);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Collection m5524(C2942 c2942) {
        Class cls = this.f8427;
        return (cls == List.class || cls == Collection.class || cls == ArrayList.class) ? new ArrayList() : (Collection) mo5451(c2942).mo5454(this.f8420);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        AbstractC2898 abstractC28982;
        if (abstractC2898.f9197) {
            mo5436(abstractC2898, obj);
            return;
        }
        Function functionMo5458 = null;
        if (abstractC2898.mo6087()) {
            mo5426(obj, null);
            return;
        }
        if (abstractC2898.mo6134()) {
            String strMo6144 = abstractC2898.mo6144();
            if ("..".equals(strMo6144)) {
                mo5426(obj, obj);
                return;
            } else {
                m5527(abstractC2898, obj, strMo6144);
                return;
            }
        }
        C2942 c2942 = abstractC2898.f9199;
        InterfaceC2787 interfaceC2787Mo5451 = mo5451(c2942);
        InterfaceC2787 interfaceC2787 = this.f8162;
        if (interfaceC2787 != null) {
            functionMo5458 = interfaceC2787.mo5458();
        } else if (interfaceC2787Mo5451 instanceof C2697) {
            functionMo5458 = ((C2697) interfaceC2787Mo5451).f8190;
        }
        char c = abstractC2898.f9191;
        if (c != '[') {
            if (c != '{' || !(m5530(c2942) instanceof C2771)) {
                boolean z = abstractC2898.f9197;
                long j = this.f8420;
                mo5426(obj, z ? interfaceC2787Mo5451.mo5422(abstractC2898, null, null, j) : interfaceC2787Mo5451.mo5418(abstractC2898, null, null, j));
                return;
            }
            boolean z2 = abstractC2898.f9197;
            InterfaceC2787 interfaceC27872 = this.f8414;
            long j2 = this.f8420;
            Object objMo5422 = z2 ? interfaceC27872.mo5422(abstractC2898, null, null, j2) : interfaceC27872.mo5418(abstractC2898, null, null, j2);
            Collection collection = (Collection) interfaceC2787Mo5451.mo5454(this.f8420);
            collection.add(objMo5422);
            if (functionMo5458 != null) {
                collection = (Collection) functionMo5458.apply(collection);
            }
            mo5426(obj, collection);
            abstractC2898.mo6099();
            return;
        }
        InterfaceC2787 interfaceC2787M5530 = m5530(c2942);
        Collection collectionM5524 = m5524(c2942);
        abstractC2898.mo6127();
        int i = 0;
        while (!abstractC2898.mo6096()) {
            if (abstractC2898.mo6143(i, collectionM5524)) {
                abstractC28982 = abstractC2898;
            } else {
                AbstractC2898 abstractC28983 = abstractC2898;
                abstractC28982 = abstractC28983;
                collectionM5524.add(interfaceC2787M5530.mo5418(abstractC28983, null, null, 0L));
                abstractC28982.mo6099();
            }
            i++;
            abstractC2898 = abstractC28982;
        }
        if (functionMo5458 != null) {
            collectionM5524 = (Collection) functionMo5458.apply(collectionM5524);
        }
        mo5426(obj, collectionM5524);
        abstractC2898.mo6099();
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        Function functionM5586;
        boolean z = abstractC2898.f9197;
        C2942 c2942 = abstractC2898.f9199;
        int i = 0;
        if (z) {
            int iMo6187 = abstractC2898.mo6187();
            if (iMo6187 == -1) {
                return null;
            }
            Object[] objArr = new Object[iMo6187];
            InterfaceC2787 interfaceC2787M5530 = m5530(c2942);
            while (i < iMo6187) {
                objArr[i] = interfaceC2787M5530.mo5418(abstractC2898, null, null, 0L);
                i++;
            }
            return Arrays.asList(objArr);
        }
        if (abstractC2898.f9191 == '[') {
            InterfaceC2787 interfaceC2787M55302 = m5530(c2942);
            Collection collectionM5524 = m5524(c2942);
            abstractC2898.mo6127();
            while (!abstractC2898.mo6096()) {
                collectionM5524.add(interfaceC2787M55302.mo5418(abstractC2898, null, null, 0L));
                abstractC2898.mo6099();
                interfaceC2787M55302 = interfaceC2787M55302;
            }
            abstractC2898.mo6099();
            return collectionM5524;
        }
        if (abstractC2898.mo6133()) {
            String strMo6139 = abstractC2898.mo6139();
            Type type = this.f8415;
            if ((type instanceof Class) && Number.class.isAssignableFrom((Class) type) && (functionM5586 = ((C2801) c2942.f9316).m5586(String.class, this.f8415)) != null) {
                Collection collectionM55242 = m5524(c2942);
                if (strMo6139.indexOf(44) != -1) {
                    String[] strArrSplit = strMo6139.split(",");
                    int length = strArrSplit.length;
                    while (i < length) {
                        collectionM55242.add(functionM5586.apply(strArrSplit[i]));
                        i++;
                    }
                }
                return collectionM55242;
            }
        }
        C0276.m849(abstractC2898.mo6124("TODO : " + getClass()));
        return null;
    }
}
