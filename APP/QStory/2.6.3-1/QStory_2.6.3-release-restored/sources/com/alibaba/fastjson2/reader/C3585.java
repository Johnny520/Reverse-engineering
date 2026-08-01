package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
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
public class C3585 extends C3525 {
    public C3585(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, biConsumer);
        this.f8762 = type2;
        if (cls2 != null) {
            AbstractC3693.m6334(cls2.getName());
        }
        if (cls != null) {
            AbstractC3693.m6334(AbstractC3700.m6503(cls));
        }
        if (str2 == null || type2 != Date.class) {
            return;
        }
        this.f8761 = new C3574(str2, locale);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Collection m6129(C3776 c3776) {
        Class cls = this.f8774;
        return (cls == List.class || cls == Collection.class || cls == ArrayList.class) ? new ArrayList() : (Collection) mo6056(c3776).mo6059(this.f8767);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        AbstractC3732 abstractC37322;
        if (abstractC3732.f9544) {
            mo6041(abstractC3732, obj);
            return;
        }
        Function functionMo6063 = null;
        if (abstractC3732.mo6693()) {
            mo6031(obj, null);
            return;
        }
        if (abstractC3732.mo6740()) {
            String strMo6749 = abstractC3732.mo6749();
            if ("..".equals(strMo6749)) {
                mo6031(obj, obj);
                return;
            } else {
                m6132(abstractC3732, obj, strMo6749);
                return;
            }
        }
        C3776 c3776 = abstractC3732.f9546;
        InterfaceC3621 interfaceC3621Mo6056 = mo6056(c3776);
        InterfaceC3621 interfaceC3621 = this.f8509;
        if (interfaceC3621 != null) {
            functionMo6063 = interfaceC3621.mo6063();
        } else if (interfaceC3621Mo6056 instanceof C3531) {
            functionMo6063 = ((C3531) interfaceC3621Mo6056).f8537;
        }
        char c = abstractC3732.f9538;
        if (c != '[') {
            if (c != '{' || !(m6135(c3776) instanceof C3605)) {
                boolean z = abstractC3732.f9544;
                long j = this.f8767;
                mo6031(obj, z ? interfaceC3621Mo6056.mo6027(abstractC3732, null, null, j) : interfaceC3621Mo6056.mo6023(abstractC3732, null, null, j));
                return;
            }
            boolean z2 = abstractC3732.f9544;
            InterfaceC3621 interfaceC36212 = this.f8761;
            long j2 = this.f8767;
            Object objMo6027 = z2 ? interfaceC36212.mo6027(abstractC3732, null, null, j2) : interfaceC36212.mo6023(abstractC3732, null, null, j2);
            Collection collection = (Collection) interfaceC3621Mo6056.mo6059(this.f8767);
            collection.add(objMo6027);
            if (functionMo6063 != null) {
                collection = (Collection) functionMo6063.apply(collection);
            }
            mo6031(obj, collection);
            abstractC3732.mo6705();
            return;
        }
        InterfaceC3621 interfaceC3621M6135 = m6135(c3776);
        Collection collectionM6129 = m6129(c3776);
        abstractC3732.mo6733();
        int i = 0;
        while (!abstractC3732.mo6702()) {
            if (abstractC3732.mo6748(i, collectionM6129)) {
                abstractC37322 = abstractC3732;
            } else {
                AbstractC3732 abstractC37323 = abstractC3732;
                abstractC37322 = abstractC37323;
                collectionM6129.add(interfaceC3621M6135.mo6023(abstractC37323, null, null, 0L));
                abstractC37322.mo6705();
            }
            i++;
            abstractC3732 = abstractC37322;
        }
        if (functionMo6063 != null) {
            collectionM6129 = (Collection) functionMo6063.apply(collectionM6129);
        }
        mo6031(obj, collectionM6129);
        abstractC3732.mo6705();
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        Function functionM6191;
        boolean z = abstractC3732.f9544;
        C3776 c3776 = abstractC3732.f9546;
        int i = 0;
        if (z) {
            int iMo6792 = abstractC3732.mo6792();
            if (iMo6792 == -1) {
                return null;
            }
            Object[] objArr = new Object[iMo6792];
            InterfaceC3621 interfaceC3621M6135 = m6135(c3776);
            while (i < iMo6792) {
                objArr[i] = interfaceC3621M6135.mo6023(abstractC3732, null, null, 0L);
                i++;
            }
            return Arrays.asList(objArr);
        }
        if (abstractC3732.f9538 == '[') {
            InterfaceC3621 interfaceC3621M61352 = m6135(c3776);
            Collection collectionM6129 = m6129(c3776);
            abstractC3732.mo6733();
            while (!abstractC3732.mo6702()) {
                collectionM6129.add(interfaceC3621M61352.mo6023(abstractC3732, null, null, 0L));
                abstractC3732.mo6705();
                interfaceC3621M61352 = interfaceC3621M61352;
            }
            abstractC3732.mo6705();
            return collectionM6129;
        }
        if (abstractC3732.mo6739()) {
            String strMo6744 = abstractC3732.mo6744();
            Type type = this.f8762;
            if ((type instanceof Class) && Number.class.isAssignableFrom((Class) type) && (functionM6191 = ((C3635) c3776.f9663).m6191(String.class, this.f8762)) != null) {
                Collection collectionM61292 = m6129(c3776);
                if (strMo6744.indexOf(44) != -1) {
                    String[] strArrSplit = strMo6744.split(",");
                    int length = strArrSplit.length;
                    while (i < length) {
                        collectionM61292.add(functionM6191.apply(strArrSplit[i]));
                        i++;
                    }
                }
                return collectionM61292;
            }
        }
        C1123.m1410(abstractC3732.mo6730("TODO : " + getClass()));
        return null;
    }
}
