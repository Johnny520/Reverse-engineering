package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2675 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8101;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long f8102;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f8103;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f8104;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8105;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8106;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2675(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762 abstractC2762, AbstractC2762 abstractC27622) {
        AbstractC2762[] abstractC2762Arr = {abstractC2762, abstractC27622};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        AbstractC2762 abstractC27623 = abstractC2762Arr[0];
        this.f8106 = abstractC27623;
        AbstractC2762 abstractC27624 = abstractC2762Arr[1];
        this.f8105 = abstractC27624;
        this.f8104 = abstractC27623.f8411;
        this.f8102 = abstractC27623.f8410;
        this.f8103 = abstractC27624.f8411;
        this.f8101 = abstractC27624.f8410;
        this.f8467 = (abstractC27623.f8415 == null && abstractC27624.f8415 == null) ? false : true;
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
            this.f8106.mo5472(abstractC2899, obj2);
            if (iMo6232 > 1) {
                this.f8105.mo5472(abstractC2899, obj2);
                for (int i = 2; i < iMo6232; i++) {
                    abstractC2899.mo6233();
                }
            }
        }
        Function function = this.f8448;
        return function != null ? function.apply(obj2) : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5463(com.alibaba.fastjson2.AbstractC2899 r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2675.mo5463(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2762 mo5464(long j) {
        if (j == this.f8102) {
            return this.f8106;
        }
        if (j == this.f8101) {
            return this.f8105;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object mo5468(AbstractC2899 abstractC2899) {
        return mo5463(abstractC2899, null, null, this.f8447);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2762 mo5465(long j) {
        if (j == this.f8104) {
            return this.f8106;
        }
        if (j == this.f8103) {
            return this.f8105;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5466(Object obj) {
        this.f8106.m5573(obj);
        this.f8105.m5573(obj);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        long j2;
        Object objAllocateInstance;
        boolean z = this.f8468;
        Class cls = this.f8450;
        if (!z) {
            abstractC2899.m6156(cls);
        }
        long j3 = this.f8447 | j;
        InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(this.f8464, j3, this.f8450);
        C2943 c2943 = abstractC2899.f9201;
        if (interfaceC2788Mo6164 != null && interfaceC2788Mo6164.mo5498() != cls) {
            return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
        }
        boolean zMo6169 = abstractC2899.mo6169();
        Function function = this.f8448;
        Supplier supplier = this.f8449;
        AbstractC2762 abstractC2762 = this.f8105;
        AbstractC2762 abstractC27622 = this.f8106;
        if (zMo6169) {
            Object obj2 = supplier.get();
            if (this.f8467) {
                mo5466(obj2);
            }
            int iMo6232 = abstractC2899.mo6232();
            if (iMo6232 > 0) {
                abstractC27622.mo5472(abstractC2899, obj2);
                if (iMo6232 > 1) {
                    abstractC2762.mo5472(abstractC2899, obj2);
                    for (int i = 2; i < iMo6232; i++) {
                        abstractC2899.mo6233();
                    }
                }
            }
            return function != null ? function.apply(obj2) : obj2;
        }
        if (!abstractC2899.mo6143((byte) -90)) {
            C0276.m850(abstractC2899.mo6170("expect object, but " + InterfaceC2912.m6357(abstractC2899.mo6183())));
            return null;
        }
        if (supplier != null) {
            objAllocateInstance = supplier.get();
            j2 = 0;
        } else {
            j2 = 0;
            if ((JSONReader$Feature.FieldBased.mask & (j | c2943.f9320)) != 0) {
                try {
                    objAllocateInstance = AbstractC2854.f8921.allocateInstance(cls);
                } catch (InstantiationException e) {
                    C0276.m843(abstractC2899.mo6170("create instance error"), e);
                    return null;
                }
            } else {
                objAllocateInstance = null;
            }
        }
        if (objAllocateInstance != null && this.f8467) {
            mo5466(objAllocateInstance);
        }
        if (objAllocateInstance != null && (c2943.f9320 & 16) != j2) {
            m5582(objAllocateInstance);
        }
        while (!abstractC2899.mo6143((byte) -91)) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 != j2) {
                if (jMo6129 == this.f8104) {
                    abstractC27622.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8103) {
                    abstractC2762.mo5481(abstractC2899, objAllocateInstance);
                } else {
                    if (abstractC2899.m6171(j3)) {
                        long jMo6106 = abstractC2899.mo6106();
                        if (jMo6106 == this.f8102) {
                            abstractC27622.mo5481(abstractC2899, objAllocateInstance);
                        } else if (jMo6106 == this.f8101) {
                            abstractC2762.mo5481(abstractC2899, objAllocateInstance);
                        }
                    }
                    m5581(abstractC2899, objAllocateInstance);
                }
            }
        }
        if (function != null) {
            objAllocateInstance = function.apply(objAllocateInstance);
        }
        JSONSchema jSONSchema = this.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objAllocateInstance);
        }
        return objAllocateInstance;
    }
}
