package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2727 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC2787 f8298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8300;

    public C2727(GenericArrayType genericArrayType) {
        AbstractC2866.m5899(genericArrayType);
        Type genericComponentType = genericArrayType.getGenericComponentType();
        this.f8300 = genericComponentType;
        Class clsM5897 = AbstractC2866.m5897(genericComponentType);
        this.f8299 = clsM5897;
        this.f8297 = AbstractC2859.m5729("[" + AbstractC2866.m5898(clsM5897));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        AbstractC2898 abstractC28982;
        Object objMo6139;
        InterfaceC2787 interfaceC2787 = this.f8298;
        Type type2 = this.f8300;
        if (interfaceC2787 == null) {
            this.f8298 = abstractC2898.f9199.m6353(type2);
        }
        if (abstractC2898.f9197) {
            return mo5422(abstractC2898, type, obj, 0L);
        }
        if (!abstractC2898.mo6073()) {
            char c = abstractC2898.f9191;
            if (c != '\"') {
                ArrayList arrayList = new ArrayList();
                if (c != '[') {
                    C0276.m849(abstractC2898.mo6124(null));
                    return null;
                }
                abstractC2898.mo6127();
                while (!abstractC2898.mo6096()) {
                    InterfaceC2787 interfaceC27872 = this.f8298;
                    Type type3 = this.f8300;
                    if (interfaceC27872 != null) {
                        abstractC28982 = abstractC2898;
                        objMo6139 = interfaceC27872.mo5418(abstractC28982, type3, null, 0L);
                    } else {
                        abstractC28982 = abstractC2898;
                        if (type3 != String.class) {
                            C0276.m849(abstractC28982.mo6124("TODO : " + type2));
                            return null;
                        }
                        objMo6139 = abstractC28982.mo6139();
                    }
                    arrayList.add(objMo6139);
                    abstractC28982.mo6099();
                    abstractC2898 = abstractC28982;
                }
                abstractC2898.mo6099();
                Object objNewInstance = Array.newInstance((Class<?>) this.f8299, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            }
            if ((type instanceof GenericArrayType) && ((GenericArrayType) type).getGenericComponentType() == Byte.TYPE) {
                if ((abstractC2898.m6110(j) & JSONReader$Feature.Base64StringAsByteArray.mask) == 0) {
                    return abstractC2898.mo6067();
                }
                return Base64.getDecoder().decode(abstractC2898.mo6139());
            }
            if (!abstractC2898.mo6139().isEmpty()) {
                C0276.m849(abstractC2898.mo6124(null));
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6097((byte) -110) && abstractC2898.mo6194() != this.f8297) {
            C0276.m849(AbstractC0053.m152("not support input typeName ", abstractC2898.mo6055()));
            return null;
        }
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 > 0 && this.f8298 == null) {
            this.f8298 = abstractC2898.f9199.m6353(this.f8300);
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f8299, iMo6187);
        int i = 0;
        while (i < iMo6187) {
            AbstractC2898 abstractC28982 = abstractC2898;
            Array.set(objNewInstance, i, this.f8298.mo5422(abstractC28982, this.f8300, null, 0L));
            i++;
            abstractC2898 = abstractC28982;
        }
        return objNewInstance;
    }
}
