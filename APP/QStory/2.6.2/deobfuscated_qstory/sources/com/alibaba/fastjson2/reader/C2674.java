package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2674 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8099;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long f8100;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f8101;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f8102;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2761 f8103;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8104;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2674(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761 abstractC2761, AbstractC2761 abstractC27612) {
        AbstractC2761[] abstractC2761Arr = {abstractC2761, abstractC27612};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2761Arr);
        AbstractC2761 abstractC27613 = abstractC2761Arr[0];
        this.f8104 = abstractC27613;
        AbstractC2761 abstractC27614 = abstractC2761Arr[1];
        this.f8103 = abstractC27614;
        this.f8102 = abstractC27613.f8409;
        this.f8100 = abstractC27613.f8408;
        this.f8101 = abstractC27614.f8409;
        this.f8099 = abstractC27614.f8408;
        this.f8465 = (abstractC27613.f8413 == null && abstractC27614.f8413 == null) ? false : true;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final Object mo5417(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!this.f8466) {
            abstractC2898.m6112(this.f8448);
        }
        InterfaceC2787 interfaceC2787M5542 = m5542(abstractC2898, j);
        if (interfaceC2787M5542 != null) {
            return interfaceC2787M5542.mo5417(abstractC2898, type, obj, j);
        }
        Object obj2 = this.f8447.get();
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 > 0) {
            this.f8104.mo5427(abstractC2898, obj2);
            if (iMo6187 > 1) {
                this.f8103.mo5427(abstractC2898, obj2);
                for (int i = 2; i < iMo6187; i++) {
                    abstractC2898.mo6188();
                }
            }
        }
        Function function = this.f8446;
        return function != null ? function.apply(obj2) : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5418(com.alibaba.fastjson2.AbstractC2898 r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2674.mo5418(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2761 mo5419(long j) {
        if (j == this.f8100) {
            return this.f8104;
        }
        if (j == this.f8099) {
            return this.f8103;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object mo5423(AbstractC2898 abstractC2898) {
        return mo5418(abstractC2898, null, null, this.f8445);
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2761 mo5420(long j) {
        if (j == this.f8102) {
            return this.f8104;
        }
        if (j == this.f8101) {
            return this.f8103;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5421(Object obj) {
        this.f8104.m5528(obj);
        this.f8103.m5528(obj);
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        long j2;
        Object objAllocateInstance;
        boolean z = this.f8466;
        Class cls = this.f8448;
        if (!z) {
            abstractC2898.m6112(cls);
        }
        long j3 = this.f8445 | j;
        InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(this.f8462, j3, this.f8448);
        C2942 c2942 = abstractC2898.f9199;
        if (interfaceC2787Mo6118 != null && interfaceC2787Mo6118.mo5453() != cls) {
            return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
        }
        boolean zMo6123 = abstractC2898.mo6123();
        Function function = this.f8446;
        Supplier supplier = this.f8447;
        AbstractC2761 abstractC2761 = this.f8103;
        AbstractC2761 abstractC27612 = this.f8104;
        if (zMo6123) {
            Object obj2 = supplier.get();
            if (this.f8465) {
                mo5421(obj2);
            }
            int iMo6187 = abstractC2898.mo6187();
            if (iMo6187 > 0) {
                abstractC27612.mo5427(abstractC2898, obj2);
                if (iMo6187 > 1) {
                    abstractC2761.mo5427(abstractC2898, obj2);
                    for (int i = 2; i < iMo6187; i++) {
                        abstractC2898.mo6188();
                    }
                }
            }
            return function != null ? function.apply(obj2) : obj2;
        }
        if (!abstractC2898.mo6097((byte) -90)) {
            C0276.m849(abstractC2898.mo6124("expect object, but " + InterfaceC2911.m6299(abstractC2898.mo6138())));
            return null;
        }
        if (supplier != null) {
            objAllocateInstance = supplier.get();
            j2 = 0;
        } else {
            j2 = 0;
            if ((JSONReader$Feature.FieldBased.mask & (j | c2942.f9318)) != 0) {
                try {
                    objAllocateInstance = AbstractC2853.f8919.allocateInstance(cls);
                } catch (InstantiationException e) {
                    C0276.m842(abstractC2898.mo6124("create instance error"), e);
                    return null;
                }
            } else {
                objAllocateInstance = null;
            }
        }
        if (objAllocateInstance != null && this.f8465) {
            mo5421(objAllocateInstance);
        }
        if (objAllocateInstance != null && (c2942.f9318 & 16) != j2) {
            m5537(objAllocateInstance);
        }
        while (!abstractC2898.mo6097((byte) -91)) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 != j2) {
                if (jMo6083 == this.f8102) {
                    abstractC27612.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8101) {
                    abstractC2761.mo5436(abstractC2898, objAllocateInstance);
                } else {
                    if (abstractC2898.m6125(j3)) {
                        long jMo6060 = abstractC2898.mo6060();
                        if (jMo6060 == this.f8100) {
                            abstractC27612.mo5436(abstractC2898, objAllocateInstance);
                        } else if (jMo6060 == this.f8099) {
                            abstractC2761.mo5436(abstractC2898, objAllocateInstance);
                        }
                    }
                    m5536(abstractC2898, objAllocateInstance);
                }
            }
        }
        if (function != null) {
            objAllocateInstance = function.apply(objAllocateInstance);
        }
        JSONSchema jSONSchema = this.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objAllocateInstance);
        }
        return objAllocateInstance;
    }
}
