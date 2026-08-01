package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2728 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC2788 f8300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8302;

    public C2728(GenericArrayType genericArrayType) {
        AbstractC2867.m5944(genericArrayType);
        Type genericComponentType = genericArrayType.getGenericComponentType();
        this.f8302 = genericComponentType;
        Class clsM5942 = AbstractC2867.m5942(genericComponentType);
        this.f8301 = clsM5942;
        this.f8299 = AbstractC2860.m5774("[" + AbstractC2867.m5943(clsM5942));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        AbstractC2899 abstractC28992;
        Object objMo6184;
        InterfaceC2788 interfaceC2788 = this.f8300;
        Type type2 = this.f8302;
        if (interfaceC2788 == null) {
            this.f8300 = abstractC2899.f9201.m6411(type2);
        }
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, 0L);
        }
        if (!abstractC2899.mo6119()) {
            char c = abstractC2899.f9193;
            if (c != '\"') {
                ArrayList arrayList = new ArrayList();
                if (c != '[') {
                    C0276.m850(abstractC2899.mo6170(null));
                    return null;
                }
                abstractC2899.mo6173();
                while (!abstractC2899.mo6142()) {
                    InterfaceC2788 interfaceC27882 = this.f8300;
                    Type type3 = this.f8302;
                    if (interfaceC27882 != null) {
                        abstractC28992 = abstractC2899;
                        objMo6184 = interfaceC27882.mo5463(abstractC28992, type3, null, 0L);
                    } else {
                        abstractC28992 = abstractC2899;
                        if (type3 != String.class) {
                            C0276.m850(abstractC28992.mo6170("TODO : " + type2));
                            return null;
                        }
                        objMo6184 = abstractC28992.mo6184();
                    }
                    arrayList.add(objMo6184);
                    abstractC28992.mo6145();
                    abstractC2899 = abstractC28992;
                }
                abstractC2899.mo6145();
                Object objNewInstance = Array.newInstance((Class<?>) this.f8301, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            }
            if ((type instanceof GenericArrayType) && ((GenericArrayType) type).getGenericComponentType() == Byte.TYPE) {
                if ((abstractC2899.m6157(j) & JSONReader$Feature.Base64StringAsByteArray.mask) == 0) {
                    return abstractC2899.mo6113();
                }
                return Base64.getDecoder().decode(abstractC2899.mo6184());
            }
            if (!abstractC2899.mo6184().isEmpty()) {
                C0276.m850(abstractC2899.mo6170(null));
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110) && abstractC2899.mo6239() != this.f8299) {
            C0276.m850(AbstractC0053.m157("not support input typeName ", abstractC2899.mo6100()));
            return null;
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 > 0 && this.f8300 == null) {
            this.f8300 = abstractC2899.f9201.m6411(this.f8302);
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f8301, iMo6232);
        int i = 0;
        while (i < iMo6232) {
            AbstractC2899 abstractC28992 = abstractC2899;
            Array.set(objNewInstance, i, this.f8300.mo5467(abstractC28992, this.f8302, null, 0L));
            i++;
            abstractC2899 = abstractC28992;
        }
        return objNewInstance;
    }
}
