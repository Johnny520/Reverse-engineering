package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3618 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8871;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8872;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8873;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8874;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8875;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8876;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC3595 f8877;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC3595 f8878;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC3595 f8879;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3595 f8880;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3595 f8881;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8882;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8883;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8884;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8885;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8886;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8887;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8888;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3618(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC3595 abstractC3595, AbstractC3595 abstractC35952, AbstractC3595 abstractC35953, AbstractC3595 abstractC35954, AbstractC3595 abstractC35955, AbstractC3595 abstractC35956) {
        AbstractC3595[] abstractC3595Arr = {abstractC3595, abstractC35952, abstractC35953, abstractC35954, abstractC35955, abstractC35956};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC3595Arr);
        AbstractC3595 abstractC35957 = abstractC3595Arr[0];
        this.f8882 = abstractC35957;
        AbstractC3595 abstractC35958 = abstractC3595Arr[1];
        this.f8881 = abstractC35958;
        AbstractC3595 abstractC35959 = abstractC3595Arr[2];
        this.f8880 = abstractC35959;
        AbstractC3595 abstractC359510 = abstractC3595Arr[3];
        this.f8879 = abstractC359510;
        AbstractC3595 abstractC359511 = abstractC3595Arr[4];
        this.f8878 = abstractC359511;
        AbstractC3595 abstractC359512 = abstractC3595Arr[5];
        this.f8877 = abstractC359512;
        this.f8888 = abstractC35957.f8756;
        this.f8887 = abstractC35958.f8756;
        this.f8886 = abstractC35959.f8756;
        this.f8885 = abstractC359510.f8756;
        this.f8884 = abstractC359511.f8756;
        this.f8883 = abstractC359512.f8756;
        this.f8874 = abstractC35957.f8755;
        this.f8873 = abstractC35958.f8755;
        this.f8876 = abstractC35959.f8755;
        this.f8875 = abstractC359510.f8755;
        this.f8871 = abstractC359511.f8755;
        this.f8872 = abstractC359512.f8755;
        this.f8812 = (abstractC35957.f8760 == null && abstractC35958.f8760 == null && abstractC35959.f8760 == null && abstractC359510.f8760 == null && abstractC359511.f8760 == null && abstractC359512.f8760 == null) ? false : true;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final Object mo6022(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!this.f8813) {
            abstractC3732.m6716(this.f8795);
        }
        InterfaceC3621 interfaceC3621M6147 = m6147(abstractC3732, j);
        if (interfaceC3621M6147 != null) {
            return interfaceC3621M6147.mo6022(abstractC3732, type, obj, j);
        }
        Object obj2 = this.f8794.get();
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 > 0) {
            this.f8882.mo6032(abstractC3732, obj2);
            if (iMo6792 > 1) {
                this.f8881.mo6032(abstractC3732, obj2);
                if (iMo6792 > 2) {
                    this.f8880.mo6032(abstractC3732, obj2);
                    if (iMo6792 > 3) {
                        this.f8879.mo6032(abstractC3732, obj2);
                        if (iMo6792 > 4) {
                            this.f8878.mo6032(abstractC3732, obj2);
                            if (iMo6792 > 5) {
                                this.f8877.mo6032(abstractC3732, obj2);
                                for (int i = 6; i < iMo6792; i++) {
                                    abstractC3732.mo6793();
                                }
                            }
                        }
                    }
                }
            }
        }
        Function function = this.f8793;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        C3618 c3618;
        Class cls;
        long j2;
        C3618 c36182;
        Object obj2;
        C3618 c36183 = this;
        AbstractC3732 abstractC37322 = abstractC3732;
        boolean z = c36183.f8813;
        Class cls2 = c36183.f8795;
        if (!z) {
            abstractC37322.m6716(cls2);
        }
        if (abstractC37322.f9544) {
            return mo6027(abstractC3732, type, obj, j);
        }
        if (abstractC37322.mo6693()) {
            abstractC37322.mo6705();
            return null;
        }
        long j3 = c36183.f8792 | j;
        long jM6717 = abstractC37322.m6717(j3);
        boolean zMo6729 = abstractC37322.mo6729();
        Function function = c36183.f8793;
        Supplier supplier = c36183.f8794;
        AbstractC3595 abstractC3595 = c36183.f8877;
        AbstractC3595 abstractC35952 = c36183.f8878;
        AbstractC3595 abstractC35953 = c36183.f8879;
        AbstractC3595 abstractC35954 = c36183.f8880;
        AbstractC3595 abstractC35955 = c36183.f8881;
        AbstractC3595 abstractC35956 = c36183.f8882;
        if (zMo6729) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6717) == 0) {
                return c36183.m6145(abstractC37322, type, obj, jM6717);
            }
            abstractC37322.mo6701();
            Object obj3 = supplier.get();
            if (c36183.f8812) {
                c36183.mo6026(obj3);
            }
            abstractC35956.mo6032(abstractC37322, obj3);
            abstractC35955.mo6032(abstractC37322, obj3);
            abstractC35954.mo6032(abstractC37322, obj3);
            abstractC35953.mo6032(abstractC37322, obj3);
            abstractC35952.mo6032(abstractC37322, obj3);
            abstractC3595.mo6032(abstractC37322, obj3);
            if (abstractC37322.mo6702()) {
                abstractC37322.mo6705();
                return function != null ? function.apply(obj3) : obj3;
            }
            C1123.m1410(abstractC37322.mo6730("array to bean end error"));
            return null;
        }
        abstractC37322.mo6708();
        Object objApply = supplier.get();
        if (c36183.f8812) {
            c36183.mo6026(objApply);
        }
        if (objApply != null && (jM6717 & JSONReader$Feature.InitStringFieldAsEmpty.mask) != 0) {
            c36183.m6142(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC37322.mo6712()) {
                c3618 = c36183;
                break;
            }
            long jMo6689 = abstractC37322.mo6689();
            if (i == 0 && jMo6689 == InterfaceC3621.f8931) {
                long jMo6799 = abstractC37322.mo6799();
                C3776 c3776 = abstractC37322.f9546;
                InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(jMo6799);
                if ((interfaceC3621M6190 != null || (interfaceC3621M6190 = c3776.m6970(cls2, abstractC3732.mo6660())) != null) && interfaceC3621M6190 != c36183) {
                    c3618 = c36183;
                    InterfaceC3621 interfaceC3621 = interfaceC3621M6190;
                    abstractC37322 = abstractC3732;
                    objApply = interfaceC3621.mo6023(abstractC37322, type, obj, j);
                    break;
                }
                abstractC37322 = abstractC3732;
                cls = cls2;
                j2 = j3;
                c36182 = c36183;
                obj2 = objApply;
            } else {
                cls = cls2;
                j2 = j3;
                c36182 = c36183;
                obj2 = objApply;
                if (jMo6689 == c36182.f8888) {
                    abstractC35956.mo6032(abstractC37322, obj2);
                } else if (jMo6689 == c36182.f8887) {
                    abstractC35955.mo6032(abstractC37322, obj2);
                } else if (jMo6689 == c36182.f8886) {
                    abstractC35954.mo6032(abstractC37322, obj2);
                } else if (jMo6689 == c36182.f8885) {
                    abstractC35953.mo6032(abstractC37322, obj2);
                } else if (jMo6689 == c36182.f8884) {
                    abstractC35952.mo6032(abstractC37322, obj2);
                } else if (jMo6689 == c36182.f8883) {
                    abstractC3595.mo6032(abstractC37322, obj2);
                } else if (abstractC37322.m6731(j2)) {
                    long jMo6666 = abstractC37322.mo6666();
                    j2 = j2;
                    if (jMo6666 == c36182.f8874) {
                        abstractC35956.mo6032(abstractC37322, obj2);
                    } else if (jMo6666 == c36182.f8873) {
                        abstractC35955.mo6032(abstractC37322, obj2);
                    } else if (jMo6666 == c36182.f8876) {
                        abstractC35954.mo6032(abstractC37322, obj2);
                    } else if (jMo6666 == c36182.f8875) {
                        abstractC35953.mo6032(abstractC37322, obj2);
                    } else if (jMo6666 == c36182.f8871) {
                        abstractC35952.mo6032(abstractC37322, obj2);
                    } else if (jMo6666 == c36182.f8872) {
                        abstractC3595.mo6032(abstractC37322, obj2);
                    } else {
                        c36182.m6141(abstractC37322, obj2);
                    }
                } else {
                    c36182.m6141(abstractC37322, obj2);
                    j2 = j2;
                }
            }
            i++;
            c36183 = c36182;
            objApply = obj2;
            cls2 = cls;
            j3 = j2;
        }
        abstractC37322.mo6705();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c3618.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3595 mo6024(long j) {
        if (j == this.f8874) {
            return this.f8882;
        }
        if (j == this.f8873) {
            return this.f8881;
        }
        if (j == this.f8876) {
            return this.f8880;
        }
        if (j == this.f8875) {
            return this.f8879;
        }
        if (j == this.f8871) {
            return this.f8878;
        }
        if (j == this.f8872) {
            return this.f8877;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC3595 mo6025(long j) {
        if (j == this.f8888) {
            return this.f8882;
        }
        if (j == this.f8887) {
            return this.f8881;
        }
        if (j == this.f8886) {
            return this.f8880;
        }
        if (j == this.f8885) {
            return this.f8879;
        }
        if (j == this.f8884) {
            return this.f8878;
        }
        if (j == this.f8883) {
            return this.f8877;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo6026(Object obj) {
        this.f8882.m6133(obj);
        this.f8881.m6133(obj);
        this.f8880.m6133(obj);
        this.f8879.m6133(obj);
        this.f8878.m6133(obj);
        this.f8877.m6133(obj);
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        long j2;
        Object objAllocateInstance;
        boolean z = this.f8813;
        Class cls = this.f8795;
        if (!z) {
            abstractC3732.m6716(cls);
        }
        boolean zMo6729 = abstractC3732.mo6729();
        Function function = this.f8793;
        Supplier supplier = this.f8794;
        AbstractC3595 abstractC3595 = this.f8877;
        AbstractC3595 abstractC35952 = this.f8878;
        AbstractC3595 abstractC35953 = this.f8879;
        AbstractC3595 abstractC35954 = this.f8880;
        AbstractC3595 abstractC35955 = this.f8881;
        AbstractC3595 abstractC35956 = this.f8882;
        if (zMo6729) {
            Object obj2 = supplier.get();
            int iMo6792 = abstractC3732.mo6792();
            if (iMo6792 > 0) {
                abstractC35956.mo6032(abstractC3732, obj2);
                if (iMo6792 > 1) {
                    abstractC35955.mo6032(abstractC3732, obj2);
                    if (iMo6792 > 2) {
                        abstractC35954.mo6032(abstractC3732, obj2);
                        if (iMo6792 > 3) {
                            abstractC35953.mo6032(abstractC3732, obj2);
                            if (iMo6792 > 4) {
                                abstractC35952.mo6032(abstractC3732, obj2);
                                if (iMo6792 > 5) {
                                    abstractC3595.mo6032(abstractC3732, obj2);
                                    for (int i = 6; i < iMo6792; i++) {
                                        abstractC3732.mo6793();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return function != null ? function.apply(obj2) : obj2;
        }
        long j3 = this.f8792 | j;
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(this.f8809, j3, this.f8795);
        if (interfaceC3621Mo6724 != null && interfaceC3621Mo6724.mo6058() != cls) {
            return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
        }
        if (!abstractC3732.mo6703((byte) -90)) {
            C1123.m1410(abstractC3732.mo6730("expect object, but " + InterfaceC3745.m6917(abstractC3732.mo6743())));
            return null;
        }
        if (supplier != null) {
            objAllocateInstance = supplier.get();
            j2 = 0;
        } else {
            j2 = 0;
            if (((j | abstractC3732.f9546.f9665) & JSONReader$Feature.FieldBased.mask) != 0) {
                try {
                    objAllocateInstance = AbstractC3687.f9266.allocateInstance(cls);
                } catch (InstantiationException e) {
                    C1123.m1403(abstractC3732.mo6730("create instance error"), e);
                    return null;
                }
            } else {
                objAllocateInstance = null;
            }
        }
        if (objAllocateInstance != null && this.f8812) {
            mo6026(objAllocateInstance);
        }
        while (!abstractC3732.mo6703((byte) -91)) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 != j2) {
                if (jMo6689 == this.f8888) {
                    abstractC35956.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8887) {
                    abstractC35955.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8886) {
                    abstractC35954.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8885) {
                    abstractC35953.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8884) {
                    abstractC35952.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8883) {
                    abstractC3595.mo6032(abstractC3732, objAllocateInstance);
                } else if (abstractC3732.m6731(j3)) {
                    long jMo6666 = abstractC3732.mo6666();
                    if (jMo6666 == this.f8874) {
                        abstractC35956.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8873) {
                        abstractC35955.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8876) {
                        abstractC35954.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8875) {
                        abstractC35953.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8871) {
                        abstractC35952.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8872) {
                        abstractC3595.mo6032(abstractC3732, objAllocateInstance);
                    } else {
                        m6141(abstractC3732, objAllocateInstance);
                    }
                } else {
                    m6141(abstractC3732, objAllocateInstance);
                }
            }
        }
        if (function != null) {
            objAllocateInstance = function.apply(objAllocateInstance);
        }
        JSONSchema jSONSchema = this.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objAllocateInstance);
        }
        return objAllocateInstance;
    }
}
