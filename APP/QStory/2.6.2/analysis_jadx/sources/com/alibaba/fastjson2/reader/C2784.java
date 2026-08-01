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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2784 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8524;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8525;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8526;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8527;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8528;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8529;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC2761 f8530;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2761 f8531;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2761 f8532;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2761 f8533;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2761 f8534;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8535;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8536;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8537;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8538;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8539;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8540;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8541;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2784(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC2761 abstractC2761, AbstractC2761 abstractC27612, AbstractC2761 abstractC27613, AbstractC2761 abstractC27614, AbstractC2761 abstractC27615, AbstractC2761 abstractC27616) {
        AbstractC2761[] abstractC2761Arr = {abstractC2761, abstractC27612, abstractC27613, abstractC27614, abstractC27615, abstractC27616};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2761Arr);
        AbstractC2761 abstractC27617 = abstractC2761Arr[0];
        this.f8535 = abstractC27617;
        AbstractC2761 abstractC27618 = abstractC2761Arr[1];
        this.f8534 = abstractC27618;
        AbstractC2761 abstractC27619 = abstractC2761Arr[2];
        this.f8533 = abstractC27619;
        AbstractC2761 abstractC276110 = abstractC2761Arr[3];
        this.f8532 = abstractC276110;
        AbstractC2761 abstractC276111 = abstractC2761Arr[4];
        this.f8531 = abstractC276111;
        AbstractC2761 abstractC276112 = abstractC2761Arr[5];
        this.f8530 = abstractC276112;
        this.f8541 = abstractC27617.f8409;
        this.f8540 = abstractC27618.f8409;
        this.f8539 = abstractC27619.f8409;
        this.f8538 = abstractC276110.f8409;
        this.f8537 = abstractC276111.f8409;
        this.f8536 = abstractC276112.f8409;
        this.f8527 = abstractC27617.f8408;
        this.f8526 = abstractC27618.f8408;
        this.f8529 = abstractC27619.f8408;
        this.f8528 = abstractC276110.f8408;
        this.f8524 = abstractC276111.f8408;
        this.f8525 = abstractC276112.f8408;
        this.f8465 = (abstractC27617.f8413 == null && abstractC27618.f8413 == null && abstractC27619.f8413 == null && abstractC276110.f8413 == null && abstractC276111.f8413 == null && abstractC276112.f8413 == null) ? false : true;
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
            this.f8535.mo5427(abstractC2898, obj2);
            if (iMo6187 > 1) {
                this.f8534.mo5427(abstractC2898, obj2);
                if (iMo6187 > 2) {
                    this.f8533.mo5427(abstractC2898, obj2);
                    if (iMo6187 > 3) {
                        this.f8532.mo5427(abstractC2898, obj2);
                        if (iMo6187 > 4) {
                            this.f8531.mo5427(abstractC2898, obj2);
                            if (iMo6187 > 5) {
                                this.f8530.mo5427(abstractC2898, obj2);
                                for (int i = 6; i < iMo6187; i++) {
                                    abstractC2898.mo6188();
                                }
                            }
                        }
                    }
                }
            }
        }
        Function function = this.f8446;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        C2784 c2784;
        Class cls;
        long j2;
        C2784 c27842;
        Object obj2;
        C2784 c27843 = this;
        AbstractC2898 abstractC28982 = abstractC2898;
        boolean z = c27843.f8466;
        Class cls2 = c27843.f8448;
        if (!z) {
            abstractC28982.m6112(cls2);
        }
        if (abstractC28982.f9197) {
            return mo5422(abstractC2898, type, obj, j);
        }
        if (abstractC28982.mo6087()) {
            abstractC28982.mo6099();
            return null;
        }
        long j3 = c27843.f8445 | j;
        long jM6110 = abstractC28982.m6110(j3);
        boolean zMo6123 = abstractC28982.mo6123();
        Function function = c27843.f8446;
        Supplier supplier = c27843.f8447;
        AbstractC2761 abstractC2761 = c27843.f8530;
        AbstractC2761 abstractC27612 = c27843.f8531;
        AbstractC2761 abstractC27613 = c27843.f8532;
        AbstractC2761 abstractC27614 = c27843.f8533;
        AbstractC2761 abstractC27615 = c27843.f8534;
        AbstractC2761 abstractC27616 = c27843.f8535;
        if (zMo6123) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6110) == 0) {
                return c27843.m5540(abstractC28982, type, obj, jM6110);
            }
            abstractC28982.mo6095();
            Object obj3 = supplier.get();
            if (c27843.f8465) {
                c27843.mo5421(obj3);
            }
            abstractC27616.mo5427(abstractC28982, obj3);
            abstractC27615.mo5427(abstractC28982, obj3);
            abstractC27614.mo5427(abstractC28982, obj3);
            abstractC27613.mo5427(abstractC28982, obj3);
            abstractC27612.mo5427(abstractC28982, obj3);
            abstractC2761.mo5427(abstractC28982, obj3);
            if (abstractC28982.mo6096()) {
                abstractC28982.mo6099();
                return function != null ? function.apply(obj3) : obj3;
            }
            C0276.m849(abstractC28982.mo6124("array to bean end error"));
            return null;
        }
        abstractC28982.mo6102();
        Object objApply = supplier.get();
        if (c27843.f8465) {
            c27843.mo5421(objApply);
        }
        if (objApply != null && (jM6110 & JSONReader$Feature.InitStringFieldAsEmpty.mask) != 0) {
            c27843.m5537(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC28982.mo6106()) {
                c2784 = c27843;
                break;
            }
            long jMo6083 = abstractC28982.mo6083();
            if (i == 0 && jMo6083 == InterfaceC2787.f8584) {
                long jMo6194 = abstractC28982.mo6194();
                C2942 c2942 = abstractC28982.f9199;
                InterfaceC2787 interfaceC2787M5585 = ((C2801) c2942.f9316).m5585(jMo6194);
                if ((interfaceC2787M5585 != null || (interfaceC2787M5585 = c2942.m6352(cls2, abstractC2898.mo6055())) != null) && interfaceC2787M5585 != c27843) {
                    c2784 = c27843;
                    InterfaceC2787 interfaceC2787 = interfaceC2787M5585;
                    abstractC28982 = abstractC2898;
                    objApply = interfaceC2787.mo5418(abstractC28982, type, obj, j);
                    break;
                }
                abstractC28982 = abstractC2898;
                cls = cls2;
                j2 = j3;
                c27842 = c27843;
                obj2 = objApply;
            } else {
                cls = cls2;
                j2 = j3;
                c27842 = c27843;
                obj2 = objApply;
                if (jMo6083 == c27842.f8541) {
                    abstractC27616.mo5427(abstractC28982, obj2);
                } else if (jMo6083 == c27842.f8540) {
                    abstractC27615.mo5427(abstractC28982, obj2);
                } else if (jMo6083 == c27842.f8539) {
                    abstractC27614.mo5427(abstractC28982, obj2);
                } else if (jMo6083 == c27842.f8538) {
                    abstractC27613.mo5427(abstractC28982, obj2);
                } else if (jMo6083 == c27842.f8537) {
                    abstractC27612.mo5427(abstractC28982, obj2);
                } else if (jMo6083 == c27842.f8536) {
                    abstractC2761.mo5427(abstractC28982, obj2);
                } else if (abstractC28982.m6125(j2)) {
                    long jMo6060 = abstractC28982.mo6060();
                    j2 = j2;
                    if (jMo6060 == c27842.f8527) {
                        abstractC27616.mo5427(abstractC28982, obj2);
                    } else if (jMo6060 == c27842.f8526) {
                        abstractC27615.mo5427(abstractC28982, obj2);
                    } else if (jMo6060 == c27842.f8529) {
                        abstractC27614.mo5427(abstractC28982, obj2);
                    } else if (jMo6060 == c27842.f8528) {
                        abstractC27613.mo5427(abstractC28982, obj2);
                    } else if (jMo6060 == c27842.f8524) {
                        abstractC27612.mo5427(abstractC28982, obj2);
                    } else if (jMo6060 == c27842.f8525) {
                        abstractC2761.mo5427(abstractC28982, obj2);
                    } else {
                        c27842.m5536(abstractC28982, obj2);
                    }
                } else {
                    c27842.m5536(abstractC28982, obj2);
                    j2 = j2;
                }
            }
            i++;
            c27843 = c27842;
            objApply = obj2;
            cls2 = cls;
            j3 = j2;
        }
        abstractC28982.mo6099();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c2784.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2761 mo5419(long j) {
        if (j == this.f8527) {
            return this.f8535;
        }
        if (j == this.f8526) {
            return this.f8534;
        }
        if (j == this.f8529) {
            return this.f8533;
        }
        if (j == this.f8528) {
            return this.f8532;
        }
        if (j == this.f8524) {
            return this.f8531;
        }
        if (j == this.f8525) {
            return this.f8530;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2761 mo5420(long j) {
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
        if (j == this.f8537) {
            return this.f8531;
        }
        if (j == this.f8536) {
            return this.f8530;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5421(Object obj) {
        this.f8535.m5528(obj);
        this.f8534.m5528(obj);
        this.f8533.m5528(obj);
        this.f8532.m5528(obj);
        this.f8531.m5528(obj);
        this.f8530.m5528(obj);
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
        boolean zMo6123 = abstractC2898.mo6123();
        Function function = this.f8446;
        Supplier supplier = this.f8447;
        AbstractC2761 abstractC2761 = this.f8530;
        AbstractC2761 abstractC27612 = this.f8531;
        AbstractC2761 abstractC27613 = this.f8532;
        AbstractC2761 abstractC27614 = this.f8533;
        AbstractC2761 abstractC27615 = this.f8534;
        AbstractC2761 abstractC27616 = this.f8535;
        if (zMo6123) {
            Object obj2 = supplier.get();
            int iMo6187 = abstractC2898.mo6187();
            if (iMo6187 > 0) {
                abstractC27616.mo5427(abstractC2898, obj2);
                if (iMo6187 > 1) {
                    abstractC27615.mo5427(abstractC2898, obj2);
                    if (iMo6187 > 2) {
                        abstractC27614.mo5427(abstractC2898, obj2);
                        if (iMo6187 > 3) {
                            abstractC27613.mo5427(abstractC2898, obj2);
                            if (iMo6187 > 4) {
                                abstractC27612.mo5427(abstractC2898, obj2);
                                if (iMo6187 > 5) {
                                    abstractC2761.mo5427(abstractC2898, obj2);
                                    for (int i = 6; i < iMo6187; i++) {
                                        abstractC2898.mo6188();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return function != null ? function.apply(obj2) : obj2;
        }
        long j3 = this.f8445 | j;
        InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(this.f8462, j3, this.f8448);
        if (interfaceC2787Mo6118 != null && interfaceC2787Mo6118.mo5453() != cls) {
            return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
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
            if (((j | abstractC2898.f9199.f9318) & JSONReader$Feature.FieldBased.mask) != 0) {
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
        while (!abstractC2898.mo6097((byte) -91)) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 != j2) {
                if (jMo6083 == this.f8541) {
                    abstractC27616.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8540) {
                    abstractC27615.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8539) {
                    abstractC27614.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8538) {
                    abstractC27613.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8537) {
                    abstractC27612.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8536) {
                    abstractC2761.mo5427(abstractC2898, objAllocateInstance);
                } else if (abstractC2898.m6125(j3)) {
                    long jMo6060 = abstractC2898.mo6060();
                    if (jMo6060 == this.f8527) {
                        abstractC27616.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8526) {
                        abstractC27615.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8529) {
                        abstractC27614.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8528) {
                        abstractC27613.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8524) {
                        abstractC27612.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8525) {
                        abstractC2761.mo5427(abstractC2898, objAllocateInstance);
                    } else {
                        m5536(abstractC2898, objAllocateInstance);
                    }
                } else {
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
