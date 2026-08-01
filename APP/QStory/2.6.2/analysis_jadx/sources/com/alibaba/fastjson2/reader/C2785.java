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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2785 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8542;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8543;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8544;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8545;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2761 f8546;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2761 f8547;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2761 f8548;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2761 f8549;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8550;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8551;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8552;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8553;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8554;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8555;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8556;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2785(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC2761 abstractC2761, AbstractC2761 abstractC27612, AbstractC2761 abstractC27613, AbstractC2761 abstractC27614, AbstractC2761 abstractC27615) {
        AbstractC2761[] abstractC2761Arr = {abstractC2761, abstractC27612, abstractC27613, abstractC27614, abstractC27615};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2761Arr);
        AbstractC2761 abstractC27616 = abstractC2761Arr[0];
        this.f8550 = abstractC27616;
        AbstractC2761 abstractC27617 = abstractC2761Arr[1];
        this.f8549 = abstractC27617;
        AbstractC2761 abstractC27618 = abstractC2761Arr[2];
        this.f8548 = abstractC27618;
        AbstractC2761 abstractC27619 = abstractC2761Arr[3];
        this.f8547 = abstractC27619;
        AbstractC2761 abstractC276110 = abstractC2761Arr[4];
        this.f8546 = abstractC276110;
        this.f8545 = abstractC27616.f8409;
        this.f8556 = abstractC27617.f8409;
        this.f8555 = abstractC27618.f8409;
        this.f8554 = abstractC27619.f8409;
        this.f8553 = abstractC276110.f8409;
        this.f8552 = abstractC27616.f8408;
        this.f8551 = abstractC27617.f8408;
        this.f8543 = abstractC27618.f8408;
        this.f8542 = abstractC27619.f8408;
        this.f8544 = abstractC276110.f8408;
        this.f8465 = (abstractC27616.f8413 == null && abstractC27617.f8413 == null && abstractC27618.f8413 == null && abstractC27619.f8413 == null && abstractC276110.f8413 == null) ? false : true;
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
            this.f8550.mo5427(abstractC2898, obj2);
            if (iMo6187 > 1) {
                this.f8549.mo5427(abstractC2898, obj2);
                if (iMo6187 > 2) {
                    this.f8548.mo5427(abstractC2898, obj2);
                    if (iMo6187 > 3) {
                        this.f8547.mo5427(abstractC2898, obj2);
                        if (iMo6187 > 4) {
                            this.f8546.mo5427(abstractC2898, obj2);
                            for (int i = 5; i < iMo6187; i++) {
                                abstractC2898.mo6188();
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
        C2785 c2785;
        Class cls;
        C2785 c27852 = this;
        boolean z = c27852.f8466;
        Class cls2 = c27852.f8448;
        if (!z) {
            abstractC2898.m6112(cls2);
        }
        if (abstractC2898.f9197) {
            return mo5422(abstractC2898, type, obj, j);
        }
        if (abstractC2898.mo6087()) {
            abstractC2898.mo6099();
            return null;
        }
        long j2 = c27852.f8445 | j;
        long jM6110 = abstractC2898.m6110(j2);
        boolean zMo6123 = abstractC2898.mo6123();
        Function function = c27852.f8446;
        Supplier supplier = c27852.f8447;
        AbstractC2761 abstractC2761 = c27852.f8546;
        AbstractC2761 abstractC27612 = c27852.f8547;
        AbstractC2761 abstractC27613 = c27852.f8548;
        AbstractC2761 abstractC27614 = c27852.f8549;
        AbstractC2761 abstractC27615 = c27852.f8550;
        if (zMo6123) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6110) == 0) {
                return c27852.m5540(abstractC2898, type, obj, jM6110);
            }
            abstractC2898.mo6095();
            Object obj2 = supplier.get();
            if (c27852.f8465) {
                c27852.mo5421(obj2);
            }
            abstractC27615.mo5427(abstractC2898, obj2);
            abstractC27614.mo5427(abstractC2898, obj2);
            abstractC27613.mo5427(abstractC2898, obj2);
            abstractC27612.mo5427(abstractC2898, obj2);
            abstractC2761.mo5427(abstractC2898, obj2);
            if (abstractC2898.mo6096()) {
                abstractC2898.mo6099();
                return function != null ? function.apply(obj2) : obj2;
            }
            C0276.m849(abstractC2898.mo6124("array to bean end error"));
            return null;
        }
        abstractC2898.mo6102();
        Object objApply = supplier.get();
        if (c27852.f8465) {
            c27852.mo5421(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6110) != 0) {
            c27852.m5537(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC2898.mo6106()) {
                c2785 = c27852;
                break;
            }
            long jMo6083 = abstractC2898.mo6083();
            if (i == 0 && jMo6083 == InterfaceC2787.f8584) {
                long jMo6194 = abstractC2898.mo6194();
                C2942 c2942 = abstractC2898.f9199;
                InterfaceC2787 interfaceC2787M5585 = ((C2801) c2942.f9316).m5585(jMo6194);
                if ((interfaceC2787M5585 != null || (interfaceC2787M5585 = c2942.m6352(cls2, abstractC2898.mo6055())) != null) && interfaceC2787M5585 != c27852) {
                    c2785 = c27852;
                    objApply = interfaceC2787M5585.mo5418(abstractC2898, type, obj, j);
                    break;
                }
                cls = cls2;
                c2785 = c27852;
                i++;
                c27852 = c2785;
                cls2 = cls;
            } else {
                cls = cls2;
                c2785 = c27852;
                if (jMo6083 == -1) {
                    break;
                }
                if (jMo6083 == c2785.f8545) {
                    abstractC27615.mo5427(abstractC2898, objApply);
                } else if (jMo6083 == c2785.f8556) {
                    abstractC27614.mo5427(abstractC2898, objApply);
                } else if (jMo6083 == c2785.f8555) {
                    abstractC27613.mo5427(abstractC2898, objApply);
                } else if (jMo6083 == c2785.f8554) {
                    abstractC27612.mo5427(abstractC2898, objApply);
                } else if (jMo6083 == c2785.f8553) {
                    abstractC2761.mo5427(abstractC2898, objApply);
                } else if (abstractC2898.m6125(j2)) {
                    long jMo6060 = abstractC2898.mo6060();
                    if (jMo6060 == c2785.f8552) {
                        abstractC27615.mo5427(abstractC2898, objApply);
                    } else if (jMo6060 == c2785.f8551) {
                        abstractC27614.mo5427(abstractC2898, objApply);
                    } else if (jMo6060 == c2785.f8543) {
                        abstractC27613.mo5427(abstractC2898, objApply);
                    } else if (jMo6060 == c2785.f8542) {
                        abstractC27612.mo5427(abstractC2898, objApply);
                    } else if (jMo6060 == c2785.f8544) {
                        abstractC2761.mo5427(abstractC2898, objApply);
                    } else {
                        c2785.m5536(abstractC2898, objApply);
                    }
                } else {
                    c2785.m5536(abstractC2898, objApply);
                }
                i++;
                c27852 = c2785;
                cls2 = cls;
            }
        }
        abstractC2898.mo6099();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c2785.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2761 mo5419(long j) {
        if (j == this.f8552) {
            return this.f8550;
        }
        if (j == this.f8551) {
            return this.f8549;
        }
        if (j == this.f8543) {
            return this.f8548;
        }
        if (j == this.f8542) {
            return this.f8547;
        }
        if (j == this.f8544) {
            return this.f8546;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2761 mo5420(long j) {
        if (j == this.f8545) {
            return this.f8550;
        }
        if (j == this.f8556) {
            return this.f8549;
        }
        if (j == this.f8555) {
            return this.f8548;
        }
        if (j == this.f8554) {
            return this.f8547;
        }
        if (j == this.f8553) {
            return this.f8546;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5421(Object obj) {
        this.f8550.m5528(obj);
        this.f8549.m5528(obj);
        this.f8548.m5528(obj);
        this.f8547.m5528(obj);
        this.f8546.m5528(obj);
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
        AbstractC2761 abstractC2761 = this.f8546;
        AbstractC2761 abstractC27612 = this.f8547;
        AbstractC2761 abstractC27613 = this.f8548;
        AbstractC2761 abstractC27614 = this.f8549;
        AbstractC2761 abstractC27615 = this.f8550;
        if (zMo6123) {
            Object obj2 = supplier.get();
            int iMo6187 = abstractC2898.mo6187();
            if (iMo6187 > 0) {
                abstractC27615.mo5427(abstractC2898, obj2);
                if (iMo6187 > 1) {
                    abstractC27614.mo5427(abstractC2898, obj2);
                    if (iMo6187 > 2) {
                        abstractC27613.mo5427(abstractC2898, obj2);
                        if (iMo6187 > 3) {
                            abstractC27612.mo5427(abstractC2898, obj2);
                            if (iMo6187 > 4) {
                                abstractC2761.mo5427(abstractC2898, obj2);
                                for (int i = 5; i < iMo6187; i++) {
                                    abstractC2898.mo6188();
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
            C0276.m840(InterfaceC2911.m6299(abstractC2898.mo6138()), "expect object, but ");
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
                if (jMo6083 == this.f8545) {
                    abstractC27615.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8556) {
                    abstractC27614.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8555) {
                    abstractC27613.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8554) {
                    abstractC27612.mo5427(abstractC2898, objAllocateInstance);
                } else if (jMo6083 == this.f8553) {
                    abstractC2761.mo5427(abstractC2898, objAllocateInstance);
                } else if (abstractC2898.m6125(j3)) {
                    long jMo6060 = abstractC2898.mo6060();
                    if (jMo6060 == this.f8552) {
                        abstractC27615.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8551) {
                        abstractC27614.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8543) {
                        abstractC27613.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8542) {
                        abstractC27612.mo5427(abstractC2898, objAllocateInstance);
                    } else if (jMo6060 == this.f8544) {
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
