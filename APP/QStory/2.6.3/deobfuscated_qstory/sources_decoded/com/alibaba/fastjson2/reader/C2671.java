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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2671 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8011;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long f8012;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f8013;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2762 f8014;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8015;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8016;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8017;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8018;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8019;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2671(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC2762 abstractC2762, AbstractC2762 abstractC27622, AbstractC2762 abstractC27623) {
        AbstractC2762[] abstractC2762Arr = {abstractC2762, abstractC27622, abstractC27623};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        AbstractC2762 abstractC27624 = abstractC2762Arr[0];
        this.f8016 = abstractC27624;
        AbstractC2762 abstractC27625 = abstractC2762Arr[1];
        this.f8015 = abstractC27625;
        AbstractC2762 abstractC27626 = abstractC2762Arr[2];
        this.f8014 = abstractC27626;
        this.f8013 = abstractC27624.f8411;
        this.f8012 = abstractC27625.f8411;
        this.f8011 = abstractC27626.f8411;
        this.f8019 = abstractC27624.f8410;
        this.f8018 = abstractC27625.f8410;
        this.f8017 = abstractC27626.f8410;
        this.f8467 = (abstractC27624.f8415 == null && abstractC27625.f8415 == null && abstractC27626.f8415 == null) ? false : true;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
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
        if (iMo6232 == this.f8457.length) {
            this.f8016.mo5472(abstractC2899, obj2);
            this.f8015.mo5472(abstractC2899, obj2);
            this.f8014.mo5472(abstractC2899, obj2);
        } else {
            m5583(abstractC2899, obj2, iMo6232);
        }
        Function function = this.f8448;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        C2671 c2671;
        C2671 c26712;
        C2671 c26713 = this;
        boolean z = c26713.f8468;
        Class cls = c26713.f8450;
        if (!z) {
            abstractC2899.m6156(cls);
        }
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, j);
        }
        if (abstractC2899.mo6133()) {
            abstractC2899.mo6145();
            return null;
        }
        long j2 = c26713.f8447 | j;
        long jM6157 = abstractC2899.m6157(j2);
        boolean zMo6169 = abstractC2899.mo6169();
        Function function = c26713.f8448;
        Supplier supplier = c26713.f8449;
        AbstractC2762 abstractC2762 = c26713.f8014;
        AbstractC2762 abstractC27622 = c26713.f8015;
        AbstractC2762 abstractC27623 = c26713.f8016;
        long j3 = 0;
        if (zMo6169) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6157) == 0) {
                return c26713.m5585(abstractC2899, type, obj, jM6157);
            }
            abstractC2899.mo6141();
            Object obj2 = supplier.get();
            if (c26713.f8467) {
                c26713.mo5466(obj2);
            }
            abstractC27623.mo5472(abstractC2899, obj2);
            abstractC27622.mo5472(abstractC2899, obj2);
            abstractC2762.mo5472(abstractC2899, obj2);
            if (abstractC2899.mo6142()) {
                abstractC2899.mo6145();
                return function != null ? function.apply(obj2) : obj2;
            }
            C0276.m850(abstractC2899.mo6170("array to bean end error"));
            return null;
        }
        abstractC2899.mo6148();
        Object objApply = supplier.get();
        if (c26713.f8467) {
            c26713.mo5466(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6157) != 0) {
            c26713.m5582(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC2899.mo6152()) {
                c2671 = c26713;
                break;
            }
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == j3) {
                c26712 = c26713;
            } else if (i == 0 && jMo6129 == InterfaceC2788.f8586) {
                long jMo6239 = abstractC2899.mo6239();
                C2943 c2943 = abstractC2899.f9201;
                InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(jMo6239);
                if ((interfaceC2788M5630 != null || (interfaceC2788M5630 = c2943.m6410(cls, abstractC2899.mo6100())) != null) && interfaceC2788M5630 != c26713) {
                    c2671 = c26713;
                    objApply = interfaceC2788M5630.mo5463(abstractC2899, type, obj, j);
                    break;
                }
                c26712 = c26713;
            } else {
                c26712 = c26713;
                if (jMo6129 == c26712.f8013) {
                    abstractC27623.mo5472(abstractC2899, objApply);
                } else if (jMo6129 == c26712.f8012) {
                    abstractC27622.mo5472(abstractC2899, objApply);
                } else if (jMo6129 == c26712.f8011) {
                    abstractC2762.mo5472(abstractC2899, objApply);
                } else if (abstractC2899.m6171(j2)) {
                    long jMo6106 = abstractC2899.mo6106();
                    if (jMo6106 == c26712.f8019) {
                        abstractC27623.mo5472(abstractC2899, objApply);
                    } else if (jMo6106 == c26712.f8018) {
                        abstractC27622.mo5472(abstractC2899, objApply);
                    } else if (jMo6106 == c26712.f8017) {
                        abstractC2762.mo5472(abstractC2899, objApply);
                    } else {
                        c26712.m5581(abstractC2899, objApply);
                    }
                } else {
                    c26712.m5581(abstractC2899, objApply);
                }
            }
            i++;
            c26713 = c26712;
            j3 = 0;
        }
        abstractC2899.mo6145();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c2671.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 mo5464(long j) {
        if (j == this.f8019) {
            return this.f8016;
        }
        if (j == this.f8018) {
            return this.f8015;
        }
        if (j == this.f8017) {
            return this.f8014;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC2762 mo5465(long j) {
        if (j == this.f8013) {
            return this.f8016;
        }
        if (j == this.f8012) {
            return this.f8015;
        }
        if (j == this.f8011) {
            return this.f8014;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo5466(Object obj) {
        this.f8016.m5573(obj);
        this.f8015.m5573(obj);
        this.f8014.m5573(obj);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        long j2;
        Object objAllocateInstance;
        boolean z = this.f8468;
        Class cls = this.f8450;
        if (!z) {
            abstractC2899.m6156(cls);
        }
        boolean zMo6169 = abstractC2899.mo6169();
        Function function = this.f8448;
        Supplier supplier = this.f8449;
        AbstractC2762 abstractC2762 = this.f8014;
        AbstractC2762 abstractC27622 = this.f8015;
        AbstractC2762 abstractC27623 = this.f8016;
        if (zMo6169) {
            Object obj2 = supplier.get();
            int iMo6232 = abstractC2899.mo6232();
            if (iMo6232 > 0) {
                abstractC27623.mo5472(abstractC2899, obj2);
                if (iMo6232 > 1) {
                    abstractC27622.mo5472(abstractC2899, obj2);
                    if (iMo6232 > 2) {
                        abstractC2762.mo5472(abstractC2899, obj2);
                        for (int i = 3; i < iMo6232; i++) {
                            abstractC2899.mo6233();
                        }
                    }
                }
            }
            return function != null ? function.apply(obj2) : obj2;
        }
        long j3 = this.f8447 | j;
        InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(this.f8464, j3, this.f8450);
        if (interfaceC2788Mo6164 != null && interfaceC2788Mo6164.mo5498() != cls) {
            return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
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
            if (((j | abstractC2899.f9201.f9320) & JSONReader$Feature.FieldBased.mask) != 0) {
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
        while (!abstractC2899.mo6143((byte) -91)) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 != j2) {
                long j4 = this.f8013;
                if (jMo6129 == j4) {
                    abstractC27623.mo5472(abstractC2899, objAllocateInstance);
                } else {
                    long j5 = this.f8012;
                    if (jMo6129 == j5) {
                        abstractC27622.mo5472(abstractC2899, objAllocateInstance);
                    } else {
                        long j6 = this.f8011;
                        if (jMo6129 == j6) {
                            abstractC2762.mo5472(abstractC2899, objAllocateInstance);
                        } else if (abstractC2899.m6171(j3)) {
                            long jMo6106 = abstractC2899.mo6106();
                            if (jMo6106 == j4) {
                                abstractC27623.mo5472(abstractC2899, objAllocateInstance);
                            } else if (jMo6106 == j5) {
                                abstractC27622.mo5472(abstractC2899, objAllocateInstance);
                            } else if (jMo6106 == j6) {
                                abstractC2762.mo5472(abstractC2899, objAllocateInstance);
                            } else {
                                m5581(abstractC2899, objAllocateInstance);
                            }
                        } else {
                            m5581(abstractC2899, objAllocateInstance);
                        }
                    }
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
