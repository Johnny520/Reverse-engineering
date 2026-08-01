package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3561 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC3621 f8645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8647;

    public C3561(GenericArrayType genericArrayType) {
        AbstractC3700.m6504(genericArrayType);
        Type genericComponentType = genericArrayType.getGenericComponentType();
        this.f8647 = genericComponentType;
        Class clsM6502 = AbstractC3700.m6502(genericComponentType);
        this.f8646 = clsM6502;
        this.f8644 = AbstractC3693.m6334("[" + AbstractC3700.m6503(clsM6502));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        AbstractC3732 abstractC37322;
        Object objMo6744;
        InterfaceC3621 interfaceC3621 = this.f8645;
        Type type2 = this.f8647;
        if (interfaceC3621 == null) {
            this.f8645 = abstractC3732.f9546.m6971(type2);
        }
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, 0L);
        }
        if (!abstractC3732.mo6679()) {
            char c = abstractC3732.f9538;
            if (c != '\"') {
                ArrayList arrayList = new ArrayList();
                if (c != '[') {
                    C1123.m1410(abstractC3732.mo6730(null));
                    return null;
                }
                abstractC3732.mo6733();
                while (!abstractC3732.mo6702()) {
                    InterfaceC3621 interfaceC36212 = this.f8645;
                    Type type3 = this.f8647;
                    if (interfaceC36212 != null) {
                        abstractC37322 = abstractC3732;
                        objMo6744 = interfaceC36212.mo6023(abstractC37322, type3, null, 0L);
                    } else {
                        abstractC37322 = abstractC3732;
                        if (type3 != String.class) {
                            C1123.m1410(abstractC37322.mo6730("TODO : " + type2));
                            return null;
                        }
                        objMo6744 = abstractC37322.mo6744();
                    }
                    arrayList.add(objMo6744);
                    abstractC37322.mo6705();
                    abstractC3732 = abstractC37322;
                }
                abstractC3732.mo6705();
                Object objNewInstance = Array.newInstance((Class<?>) this.f8646, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            }
            if ((type instanceof GenericArrayType) && ((GenericArrayType) type).getGenericComponentType() == Byte.TYPE) {
                if ((abstractC3732.m6717(j) & JSONReader$Feature.Base64StringAsByteArray.mask) == 0) {
                    return abstractC3732.mo6673();
                }
                return Base64.getDecoder().decode(abstractC3732.mo6744());
            }
            if (!abstractC3732.mo6744().isEmpty()) {
                C1123.m1410(abstractC3732.mo6730(null));
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110) && abstractC3732.mo6799() != this.f8644) {
            C1123.m1410(AbstractC0900.m717("not support input typeName ", abstractC3732.mo6660()));
            return null;
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 > 0 && this.f8645 == null) {
            this.f8645 = abstractC3732.f9546.m6971(this.f8647);
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f8646, iMo6792);
        int i = 0;
        while (i < iMo6792) {
            AbstractC3732 abstractC37322 = abstractC3732;
            Array.set(objNewInstance, i, this.f8645.mo6027(abstractC37322, this.f8647, null, 0L));
            i++;
            abstractC3732 = abstractC37322;
        }
        return objNewInstance;
    }
}
