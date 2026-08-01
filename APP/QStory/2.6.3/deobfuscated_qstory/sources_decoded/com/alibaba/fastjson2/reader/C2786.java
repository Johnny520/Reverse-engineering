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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2786 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8544;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8545;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8546;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8547;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2762 f8548;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2762 f8549;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2762 f8550;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8551;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8552;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8553;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8554;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8555;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8556;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8557;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8558;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2786(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC2762 abstractC2762, AbstractC2762 abstractC27622, AbstractC2762 abstractC27623, AbstractC2762 abstractC27624, AbstractC2762 abstractC27625) {
        AbstractC2762[] abstractC2762Arr = {abstractC2762, abstractC27622, abstractC27623, abstractC27624, abstractC27625};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        AbstractC2762 abstractC27626 = abstractC2762Arr[0];
        this.f8552 = abstractC27626;
        AbstractC2762 abstractC27627 = abstractC2762Arr[1];
        this.f8551 = abstractC27627;
        AbstractC2762 abstractC27628 = abstractC2762Arr[2];
        this.f8550 = abstractC27628;
        AbstractC2762 abstractC27629 = abstractC2762Arr[3];
        this.f8549 = abstractC27629;
        AbstractC2762 abstractC276210 = abstractC2762Arr[4];
        this.f8548 = abstractC276210;
        this.f8547 = abstractC27626.f8411;
        this.f8558 = abstractC27627.f8411;
        this.f8557 = abstractC27628.f8411;
        this.f8556 = abstractC27629.f8411;
        this.f8555 = abstractC276210.f8411;
        this.f8554 = abstractC27626.f8410;
        this.f8553 = abstractC27627.f8410;
        this.f8545 = abstractC27628.f8410;
        this.f8544 = abstractC27629.f8410;
        this.f8546 = abstractC276210.f8410;
        this.f8467 = (abstractC27626.f8415 == null && abstractC27627.f8415 == null && abstractC27628.f8415 == null && abstractC27629.f8415 == null && abstractC276210.f8415 == null) ? false : true;
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
            this.f8552.mo5472(abstractC2899, obj2);
            if (iMo6232 > 1) {
                this.f8551.mo5472(abstractC2899, obj2);
                if (iMo6232 > 2) {
                    this.f8550.mo5472(abstractC2899, obj2);
                    if (iMo6232 > 3) {
                        this.f8549.mo5472(abstractC2899, obj2);
                        if (iMo6232 > 4) {
                            this.f8548.mo5472(abstractC2899, obj2);
                            for (int i = 5; i < iMo6232; i++) {
                                abstractC2899.mo6233();
                            }
                        }
                    }
                }
            }
        }
        Function function = this.f8448;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        C2786 c2786;
        Class cls;
        C2786 c27862 = this;
        boolean z = c27862.f8468;
        Class cls2 = c27862.f8450;
        if (!z) {
            abstractC2899.m6156(cls2);
        }
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, j);
        }
        if (abstractC2899.mo6133()) {
            abstractC2899.mo6145();
            return null;
        }
        long j2 = c27862.f8447 | j;
        long jM6157 = abstractC2899.m6157(j2);
        boolean zMo6169 = abstractC2899.mo6169();
        Function function = c27862.f8448;
        Supplier supplier = c27862.f8449;
        AbstractC2762 abstractC2762 = c27862.f8548;
        AbstractC2762 abstractC27622 = c27862.f8549;
        AbstractC2762 abstractC27623 = c27862.f8550;
        AbstractC2762 abstractC27624 = c27862.f8551;
        AbstractC2762 abstractC27625 = c27862.f8552;
        if (zMo6169) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6157) == 0) {
                return c27862.m5585(abstractC2899, type, obj, jM6157);
            }
            abstractC2899.mo6141();
            Object obj2 = supplier.get();
            if (c27862.f8467) {
                c27862.mo5466(obj2);
            }
            abstractC27625.mo5472(abstractC2899, obj2);
            abstractC27624.mo5472(abstractC2899, obj2);
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
        if (c27862.f8467) {
            c27862.mo5466(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6157) != 0) {
            c27862.m5582(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC2899.mo6152()) {
                c2786 = c27862;
                break;
            }
            long jMo6129 = abstractC2899.mo6129();
            if (i == 0 && jMo6129 == InterfaceC2788.f8586) {
                long jMo6239 = abstractC2899.mo6239();
                C2943 c2943 = abstractC2899.f9201;
                InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(jMo6239);
                if ((interfaceC2788M5630 != null || (interfaceC2788M5630 = c2943.m6410(cls2, abstractC2899.mo6100())) != null) && interfaceC2788M5630 != c27862) {
                    c2786 = c27862;
                    objApply = interfaceC2788M5630.mo5463(abstractC2899, type, obj, j);
                    break;
                }
                cls = cls2;
                c2786 = c27862;
                i++;
                c27862 = c2786;
                cls2 = cls;
            } else {
                cls = cls2;
                c2786 = c27862;
                if (jMo6129 == -1) {
                    break;
                }
                if (jMo6129 == c2786.f8547) {
                    abstractC27625.mo5472(abstractC2899, objApply);
                } else if (jMo6129 == c2786.f8558) {
                    abstractC27624.mo5472(abstractC2899, objApply);
                } else if (jMo6129 == c2786.f8557) {
                    abstractC27623.mo5472(abstractC2899, objApply);
                } else if (jMo6129 == c2786.f8556) {
                    abstractC27622.mo5472(abstractC2899, objApply);
                } else if (jMo6129 == c2786.f8555) {
                    abstractC2762.mo5472(abstractC2899, objApply);
                } else if (abstractC2899.m6171(j2)) {
                    long jMo6106 = abstractC2899.mo6106();
                    if (jMo6106 == c2786.f8554) {
                        abstractC27625.mo5472(abstractC2899, objApply);
                    } else if (jMo6106 == c2786.f8553) {
                        abstractC27624.mo5472(abstractC2899, objApply);
                    } else if (jMo6106 == c2786.f8545) {
                        abstractC27623.mo5472(abstractC2899, objApply);
                    } else if (jMo6106 == c2786.f8544) {
                        abstractC27622.mo5472(abstractC2899, objApply);
                    } else if (jMo6106 == c2786.f8546) {
                        abstractC2762.mo5472(abstractC2899, objApply);
                    } else {
                        c2786.m5581(abstractC2899, objApply);
                    }
                } else {
                    c2786.m5581(abstractC2899, objApply);
                }
                i++;
                c27862 = c2786;
                cls2 = cls;
            }
        }
        abstractC2899.mo6145();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c2786.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2762 mo5464(long j) {
        if (j == this.f8554) {
            return this.f8552;
        }
        if (j == this.f8553) {
            return this.f8551;
        }
        if (j == this.f8545) {
            return this.f8550;
        }
        if (j == this.f8544) {
            return this.f8549;
        }
        if (j == this.f8546) {
            return this.f8548;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2762 mo5465(long j) {
        if (j == this.f8547) {
            return this.f8552;
        }
        if (j == this.f8558) {
            return this.f8551;
        }
        if (j == this.f8557) {
            return this.f8550;
        }
        if (j == this.f8556) {
            return this.f8549;
        }
        if (j == this.f8555) {
            return this.f8548;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5466(Object obj) {
        this.f8552.m5573(obj);
        this.f8551.m5573(obj);
        this.f8550.m5573(obj);
        this.f8549.m5573(obj);
        this.f8548.m5573(obj);
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
        boolean zMo6169 = abstractC2899.mo6169();
        Function function = this.f8448;
        Supplier supplier = this.f8449;
        AbstractC2762 abstractC2762 = this.f8548;
        AbstractC2762 abstractC27622 = this.f8549;
        AbstractC2762 abstractC27623 = this.f8550;
        AbstractC2762 abstractC27624 = this.f8551;
        AbstractC2762 abstractC27625 = this.f8552;
        if (zMo6169) {
            Object obj2 = supplier.get();
            int iMo6232 = abstractC2899.mo6232();
            if (iMo6232 > 0) {
                abstractC27625.mo5472(abstractC2899, obj2);
                if (iMo6232 > 1) {
                    abstractC27624.mo5472(abstractC2899, obj2);
                    if (iMo6232 > 2) {
                        abstractC27623.mo5472(abstractC2899, obj2);
                        if (iMo6232 > 3) {
                            abstractC27622.mo5472(abstractC2899, obj2);
                            if (iMo6232 > 4) {
                                abstractC2762.mo5472(abstractC2899, obj2);
                                for (int i = 5; i < iMo6232; i++) {
                                    abstractC2899.mo6233();
                                }
                            }
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
            C0276.m841(InterfaceC2912.m6357(abstractC2899.mo6183()), "expect object, but ");
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
                if (jMo6129 == this.f8547) {
                    abstractC27625.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8558) {
                    abstractC27624.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8557) {
                    abstractC27623.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8556) {
                    abstractC27622.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8555) {
                    abstractC2762.mo5472(abstractC2899, objAllocateInstance);
                } else if (abstractC2899.m6171(j3)) {
                    long jMo6106 = abstractC2899.mo6106();
                    if (jMo6106 == this.f8554) {
                        abstractC27625.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8553) {
                        abstractC27624.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8545) {
                        abstractC27623.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8544) {
                        abstractC27622.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8546) {
                        abstractC2762.mo5472(abstractC2899, objAllocateInstance);
                    } else {
                        m5581(abstractC2899, objAllocateInstance);
                    }
                } else {
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
