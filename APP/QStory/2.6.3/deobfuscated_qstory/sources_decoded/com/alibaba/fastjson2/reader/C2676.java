package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2676 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f8107;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f8108;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8109;

    public C2676(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762... abstractC2762Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        AbstractC2762 abstractC2762 = abstractC2762Arr[0];
        this.f8109 = abstractC2762;
        this.f8108 = abstractC2762.f8411;
        this.f8107 = abstractC2762.f8410;
        this.f8467 = abstractC2762.f8415 != null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final Object mo5462(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!this.f8468) {
            abstractC2899.m6156(this.f8450);
        }
        InterfaceC2788 interfaceC2788M5587 = m5587(abstractC2899, j);
        if (interfaceC2788M5587 != null) {
            return interfaceC2788M5587.mo5462(abstractC2899, type, obj, j);
        }
        Object obj2 = this.f8449.get();
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 > 0) {
            this.f8109.mo5472(abstractC2899, obj2);
            for (int i = 1; i < iMo6232; i++) {
                abstractC2899.mo6233();
            }
        }
        Function function = this.f8448;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        InterfaceC2788 interfaceC2788;
        boolean z = this.f8468;
        Class cls = this.f8450;
        if (!z) {
            abstractC2899.m6156(cls);
        }
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, 0L);
        }
        if (abstractC2899.mo6151()) {
            return null;
        }
        long j2 = this.f8447 | j;
        long jM6157 = abstractC2899.m6157(j2);
        boolean zMo6169 = abstractC2899.mo6169();
        Function function = this.f8448;
        Supplier supplier = this.f8449;
        AbstractC2762 abstractC2762 = this.f8109;
        if (zMo6169) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6157) == 0) {
                return m5585(abstractC2899, type, obj, jM6157);
            }
            abstractC2899.mo6173();
            Object obj2 = supplier.get();
            abstractC2762.mo5472(abstractC2899, obj2);
            if (abstractC2899.mo6142()) {
                abstractC2899.mo6145();
                return function != null ? function.apply(obj2) : obj2;
            }
            C0276.m850(abstractC2899.mo6170("array to bean end error, " + abstractC2899.f9193));
            return null;
        }
        abstractC2899.mo6148();
        Object objApply = supplier != null ? supplier.get() : null;
        if (this.f8467) {
            mo5466(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6157) != 0) {
            m5582(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC2899.mo6152()) {
                break;
            }
            long jMo6129 = abstractC2899.mo6129();
            if (i == 0 && jMo6129 == InterfaceC2788.f8586) {
                long jMo6239 = abstractC2899.mo6239();
                C2943 c2943 = abstractC2899.f9201;
                InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(jMo6239);
                if ((interfaceC2788M5630 != null || (interfaceC2788M5630 = c2943.m6410(cls, abstractC2899.mo6100())) != null) && (interfaceC2788 = interfaceC2788M5630) != this) {
                    objApply = interfaceC2788.mo5463(abstractC2899, type, obj, j);
                    break;
                }
            } else if (jMo6129 == this.f8108) {
                abstractC2762.mo5472(abstractC2899, objApply);
            } else if (abstractC2899.m6171(j2) && abstractC2899.mo6106() == this.f8107) {
                abstractC2762.mo5472(abstractC2899, objApply);
            } else {
                m5581(abstractC2899, objApply);
            }
            i++;
        }
        abstractC2899.mo6145();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = this.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2762 mo5464(long j) {
        if (j == this.f8107) {
            return this.f8109;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5468(AbstractC2899 abstractC2899) {
        return mo5463(abstractC2899, null, null, this.f8447);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2762 mo5465(long j) {
        if (j == this.f8108) {
            return this.f8109;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5466(Object obj) {
        this.f8109.m5573(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5467(com.alibaba.fastjson2.AbstractC2899 r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2676.mo5467(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }
}
