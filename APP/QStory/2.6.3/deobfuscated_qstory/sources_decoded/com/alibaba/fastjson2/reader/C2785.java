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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2785 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8526;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8527;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8528;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8529;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8530;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8531;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC2762 f8532;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2762 f8533;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2762 f8534;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2762 f8535;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8536;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8537;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8538;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8539;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8540;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8541;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8542;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8543;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2785(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC2762 abstractC2762, AbstractC2762 abstractC27622, AbstractC2762 abstractC27623, AbstractC2762 abstractC27624, AbstractC2762 abstractC27625, AbstractC2762 abstractC27626) {
        AbstractC2762[] abstractC2762Arr = {abstractC2762, abstractC27622, abstractC27623, abstractC27624, abstractC27625, abstractC27626};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        AbstractC2762 abstractC27627 = abstractC2762Arr[0];
        this.f8537 = abstractC27627;
        AbstractC2762 abstractC27628 = abstractC2762Arr[1];
        this.f8536 = abstractC27628;
        AbstractC2762 abstractC27629 = abstractC2762Arr[2];
        this.f8535 = abstractC27629;
        AbstractC2762 abstractC276210 = abstractC2762Arr[3];
        this.f8534 = abstractC276210;
        AbstractC2762 abstractC276211 = abstractC2762Arr[4];
        this.f8533 = abstractC276211;
        AbstractC2762 abstractC276212 = abstractC2762Arr[5];
        this.f8532 = abstractC276212;
        this.f8543 = abstractC27627.f8411;
        this.f8542 = abstractC27628.f8411;
        this.f8541 = abstractC27629.f8411;
        this.f8540 = abstractC276210.f8411;
        this.f8539 = abstractC276211.f8411;
        this.f8538 = abstractC276212.f8411;
        this.f8529 = abstractC27627.f8410;
        this.f8528 = abstractC27628.f8410;
        this.f8531 = abstractC27629.f8410;
        this.f8530 = abstractC276210.f8410;
        this.f8526 = abstractC276211.f8410;
        this.f8527 = abstractC276212.f8410;
        this.f8467 = (abstractC27627.f8415 == null && abstractC27628.f8415 == null && abstractC27629.f8415 == null && abstractC276210.f8415 == null && abstractC276211.f8415 == null && abstractC276212.f8415 == null) ? false : true;
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
            this.f8537.mo5472(abstractC2899, obj2);
            if (iMo6232 > 1) {
                this.f8536.mo5472(abstractC2899, obj2);
                if (iMo6232 > 2) {
                    this.f8535.mo5472(abstractC2899, obj2);
                    if (iMo6232 > 3) {
                        this.f8534.mo5472(abstractC2899, obj2);
                        if (iMo6232 > 4) {
                            this.f8533.mo5472(abstractC2899, obj2);
                            if (iMo6232 > 5) {
                                this.f8532.mo5472(abstractC2899, obj2);
                                for (int i = 6; i < iMo6232; i++) {
                                    abstractC2899.mo6233();
                                }
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
        C2785 c2785;
        Class cls;
        long j2;
        C2785 c27852;
        Object obj2;
        C2785 c27853 = this;
        AbstractC2899 abstractC28992 = abstractC2899;
        boolean z = c27853.f8468;
        Class cls2 = c27853.f8450;
        if (!z) {
            abstractC28992.m6156(cls2);
        }
        if (abstractC28992.f9199) {
            return mo5467(abstractC2899, type, obj, j);
        }
        if (abstractC28992.mo6133()) {
            abstractC28992.mo6145();
            return null;
        }
        long j3 = c27853.f8447 | j;
        long jM6157 = abstractC28992.m6157(j3);
        boolean zMo6169 = abstractC28992.mo6169();
        Function function = c27853.f8448;
        Supplier supplier = c27853.f8449;
        AbstractC2762 abstractC2762 = c27853.f8532;
        AbstractC2762 abstractC27622 = c27853.f8533;
        AbstractC2762 abstractC27623 = c27853.f8534;
        AbstractC2762 abstractC27624 = c27853.f8535;
        AbstractC2762 abstractC27625 = c27853.f8536;
        AbstractC2762 abstractC27626 = c27853.f8537;
        if (zMo6169) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6157) == 0) {
                return c27853.m5585(abstractC28992, type, obj, jM6157);
            }
            abstractC28992.mo6141();
            Object obj3 = supplier.get();
            if (c27853.f8467) {
                c27853.mo5466(obj3);
            }
            abstractC27626.mo5472(abstractC28992, obj3);
            abstractC27625.mo5472(abstractC28992, obj3);
            abstractC27624.mo5472(abstractC28992, obj3);
            abstractC27623.mo5472(abstractC28992, obj3);
            abstractC27622.mo5472(abstractC28992, obj3);
            abstractC2762.mo5472(abstractC28992, obj3);
            if (abstractC28992.mo6142()) {
                abstractC28992.mo6145();
                return function != null ? function.apply(obj3) : obj3;
            }
            C0276.m850(abstractC28992.mo6170("array to bean end error"));
            return null;
        }
        abstractC28992.mo6148();
        Object objApply = supplier.get();
        if (c27853.f8467) {
            c27853.mo5466(objApply);
        }
        if (objApply != null && (jM6157 & JSONReader$Feature.InitStringFieldAsEmpty.mask) != 0) {
            c27853.m5582(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC28992.mo6152()) {
                c2785 = c27853;
                break;
            }
            long jMo6129 = abstractC28992.mo6129();
            if (i == 0 && jMo6129 == InterfaceC2788.f8586) {
                long jMo6239 = abstractC28992.mo6239();
                C2943 c2943 = abstractC28992.f9201;
                InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(jMo6239);
                if ((interfaceC2788M5630 != null || (interfaceC2788M5630 = c2943.m6410(cls2, abstractC2899.mo6100())) != null) && interfaceC2788M5630 != c27853) {
                    c2785 = c27853;
                    InterfaceC2788 interfaceC2788 = interfaceC2788M5630;
                    abstractC28992 = abstractC2899;
                    objApply = interfaceC2788.mo5463(abstractC28992, type, obj, j);
                    break;
                }
                abstractC28992 = abstractC2899;
                cls = cls2;
                j2 = j3;
                c27852 = c27853;
                obj2 = objApply;
            } else {
                cls = cls2;
                j2 = j3;
                c27852 = c27853;
                obj2 = objApply;
                if (jMo6129 == c27852.f8543) {
                    abstractC27626.mo5472(abstractC28992, obj2);
                } else if (jMo6129 == c27852.f8542) {
                    abstractC27625.mo5472(abstractC28992, obj2);
                } else if (jMo6129 == c27852.f8541) {
                    abstractC27624.mo5472(abstractC28992, obj2);
                } else if (jMo6129 == c27852.f8540) {
                    abstractC27623.mo5472(abstractC28992, obj2);
                } else if (jMo6129 == c27852.f8539) {
                    abstractC27622.mo5472(abstractC28992, obj2);
                } else if (jMo6129 == c27852.f8538) {
                    abstractC2762.mo5472(abstractC28992, obj2);
                } else if (abstractC28992.m6171(j2)) {
                    long jMo6106 = abstractC28992.mo6106();
                    j2 = j2;
                    if (jMo6106 == c27852.f8529) {
                        abstractC27626.mo5472(abstractC28992, obj2);
                    } else if (jMo6106 == c27852.f8528) {
                        abstractC27625.mo5472(abstractC28992, obj2);
                    } else if (jMo6106 == c27852.f8531) {
                        abstractC27624.mo5472(abstractC28992, obj2);
                    } else if (jMo6106 == c27852.f8530) {
                        abstractC27623.mo5472(abstractC28992, obj2);
                    } else if (jMo6106 == c27852.f8526) {
                        abstractC27622.mo5472(abstractC28992, obj2);
                    } else if (jMo6106 == c27852.f8527) {
                        abstractC2762.mo5472(abstractC28992, obj2);
                    } else {
                        c27852.m5581(abstractC28992, obj2);
                    }
                } else {
                    c27852.m5581(abstractC28992, obj2);
                    j2 = j2;
                }
            }
            i++;
            c27853 = c27852;
            objApply = obj2;
            cls2 = cls;
            j3 = j2;
        }
        abstractC28992.mo6145();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c2785.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2762 mo5464(long j) {
        if (j == this.f8529) {
            return this.f8537;
        }
        if (j == this.f8528) {
            return this.f8536;
        }
        if (j == this.f8531) {
            return this.f8535;
        }
        if (j == this.f8530) {
            return this.f8534;
        }
        if (j == this.f8526) {
            return this.f8533;
        }
        if (j == this.f8527) {
            return this.f8532;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2762 mo5465(long j) {
        if (j == this.f8543) {
            return this.f8537;
        }
        if (j == this.f8542) {
            return this.f8536;
        }
        if (j == this.f8541) {
            return this.f8535;
        }
        if (j == this.f8540) {
            return this.f8534;
        }
        if (j == this.f8539) {
            return this.f8533;
        }
        if (j == this.f8538) {
            return this.f8532;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5466(Object obj) {
        this.f8537.m5573(obj);
        this.f8536.m5573(obj);
        this.f8535.m5573(obj);
        this.f8534.m5573(obj);
        this.f8533.m5573(obj);
        this.f8532.m5573(obj);
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
        AbstractC2762 abstractC2762 = this.f8532;
        AbstractC2762 abstractC27622 = this.f8533;
        AbstractC2762 abstractC27623 = this.f8534;
        AbstractC2762 abstractC27624 = this.f8535;
        AbstractC2762 abstractC27625 = this.f8536;
        AbstractC2762 abstractC27626 = this.f8537;
        if (zMo6169) {
            Object obj2 = supplier.get();
            int iMo6232 = abstractC2899.mo6232();
            if (iMo6232 > 0) {
                abstractC27626.mo5472(abstractC2899, obj2);
                if (iMo6232 > 1) {
                    abstractC27625.mo5472(abstractC2899, obj2);
                    if (iMo6232 > 2) {
                        abstractC27624.mo5472(abstractC2899, obj2);
                        if (iMo6232 > 3) {
                            abstractC27623.mo5472(abstractC2899, obj2);
                            if (iMo6232 > 4) {
                                abstractC27622.mo5472(abstractC2899, obj2);
                                if (iMo6232 > 5) {
                                    abstractC2762.mo5472(abstractC2899, obj2);
                                    for (int i = 6; i < iMo6232; i++) {
                                        abstractC2899.mo6233();
                                    }
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
                if (jMo6129 == this.f8543) {
                    abstractC27626.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8542) {
                    abstractC27625.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8541) {
                    abstractC27624.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8540) {
                    abstractC27623.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8539) {
                    abstractC27622.mo5472(abstractC2899, objAllocateInstance);
                } else if (jMo6129 == this.f8538) {
                    abstractC2762.mo5472(abstractC2899, objAllocateInstance);
                } else if (abstractC2899.m6171(j3)) {
                    long jMo6106 = abstractC2899.mo6106();
                    if (jMo6106 == this.f8529) {
                        abstractC27626.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8528) {
                        abstractC27625.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8531) {
                        abstractC27624.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8530) {
                        abstractC27623.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8526) {
                        abstractC27622.mo5472(abstractC2899, objAllocateInstance);
                    } else if (jMo6106 == this.f8527) {
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
