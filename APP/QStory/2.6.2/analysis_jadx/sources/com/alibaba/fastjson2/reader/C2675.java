package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2675 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f8105;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f8106;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8107;

    public C2675(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761... abstractC2761Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2761Arr);
        AbstractC2761 abstractC2761 = abstractC2761Arr[0];
        this.f8107 = abstractC2761;
        this.f8106 = abstractC2761.f8409;
        this.f8105 = abstractC2761.f8408;
        this.f8465 = abstractC2761.f8413 != null;
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
            this.f8107.mo5427(abstractC2898, obj2);
            for (int i = 1; i < iMo6187; i++) {
                abstractC2898.mo6188();
            }
        }
        Function function = this.f8446;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        InterfaceC2787 interfaceC2787;
        boolean z = this.f8466;
        Class cls = this.f8448;
        if (!z) {
            abstractC2898.m6112(cls);
        }
        if (abstractC2898.f9197) {
            return mo5422(abstractC2898, type, obj, 0L);
        }
        if (abstractC2898.mo6105()) {
            return null;
        }
        long j2 = this.f8445 | j;
        long jM6110 = abstractC2898.m6110(j2);
        boolean zMo6123 = abstractC2898.mo6123();
        Function function = this.f8446;
        Supplier supplier = this.f8447;
        AbstractC2761 abstractC2761 = this.f8107;
        if (zMo6123) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6110) == 0) {
                return m5540(abstractC2898, type, obj, jM6110);
            }
            abstractC2898.mo6127();
            Object obj2 = supplier.get();
            abstractC2761.mo5427(abstractC2898, obj2);
            if (abstractC2898.mo6096()) {
                abstractC2898.mo6099();
                return function != null ? function.apply(obj2) : obj2;
            }
            C0276.m849(abstractC2898.mo6124("array to bean end error, " + abstractC2898.f9191));
            return null;
        }
        abstractC2898.mo6102();
        Object objApply = supplier != null ? supplier.get() : null;
        if (this.f8465) {
            mo5421(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6110) != 0) {
            m5537(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC2898.mo6106()) {
                break;
            }
            long jMo6083 = abstractC2898.mo6083();
            if (i == 0 && jMo6083 == InterfaceC2787.f8584) {
                long jMo6194 = abstractC2898.mo6194();
                C2942 c2942 = abstractC2898.f9199;
                InterfaceC2787 interfaceC2787M5585 = ((C2801) c2942.f9316).m5585(jMo6194);
                if ((interfaceC2787M5585 != null || (interfaceC2787M5585 = c2942.m6352(cls, abstractC2898.mo6055())) != null) && (interfaceC2787 = interfaceC2787M5585) != this) {
                    objApply = interfaceC2787.mo5418(abstractC2898, type, obj, j);
                    break;
                }
            } else if (jMo6083 == this.f8106) {
                abstractC2761.mo5427(abstractC2898, objApply);
            } else if (abstractC2898.m6125(j2) && abstractC2898.mo6060() == this.f8105) {
                abstractC2761.mo5427(abstractC2898, objApply);
            } else {
                m5536(abstractC2898, objApply);
            }
            i++;
        }
        abstractC2898.mo6099();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = this.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2761 mo5419(long j) {
        if (j == this.f8105) {
            return this.f8107;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5423(AbstractC2898 abstractC2898) {
        return mo5418(abstractC2898, null, null, this.f8445);
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2761 mo5420(long j) {
        if (j == this.f8106) {
            return this.f8107;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5421(Object obj) {
        this.f8107.m5528(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5422(com.alibaba.fastjson2.AbstractC2898 r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2675.mo5422(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }
}
