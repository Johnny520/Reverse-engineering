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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3504 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8356;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final long f8357;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f8358;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3595 f8359;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3595 f8360;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8361;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8362;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8363;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8364;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3504(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC3595 abstractC3595, AbstractC3595 abstractC35952, AbstractC3595 abstractC35953) {
        AbstractC3595[] abstractC3595Arr = {abstractC3595, abstractC35952, abstractC35953};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC3595Arr);
        AbstractC3595 abstractC35954 = abstractC3595Arr[0];
        this.f8361 = abstractC35954;
        AbstractC3595 abstractC35955 = abstractC3595Arr[1];
        this.f8360 = abstractC35955;
        AbstractC3595 abstractC35956 = abstractC3595Arr[2];
        this.f8359 = abstractC35956;
        this.f8358 = abstractC35954.f8756;
        this.f8357 = abstractC35955.f8756;
        this.f8356 = abstractC35956.f8756;
        this.f8364 = abstractC35954.f8755;
        this.f8363 = abstractC35955.f8755;
        this.f8362 = abstractC35956.f8755;
        this.f8812 = (abstractC35954.f8760 == null && abstractC35955.f8760 == null && abstractC35956.f8760 == null) ? false : true;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
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
        if (iMo6792 == this.f8802.length) {
            this.f8361.mo6032(abstractC3732, obj2);
            this.f8360.mo6032(abstractC3732, obj2);
            this.f8359.mo6032(abstractC3732, obj2);
        } else {
            m6143(abstractC3732, obj2, iMo6792);
        }
        Function function = this.f8793;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        C3504 c3504;
        C3504 c35042;
        C3504 c35043 = this;
        boolean z = c35043.f8813;
        Class cls = c35043.f8795;
        if (!z) {
            abstractC3732.m6716(cls);
        }
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, j);
        }
        if (abstractC3732.mo6693()) {
            abstractC3732.mo6705();
            return null;
        }
        long j2 = c35043.f8792 | j;
        long jM6717 = abstractC3732.m6717(j2);
        boolean zMo6729 = abstractC3732.mo6729();
        Function function = c35043.f8793;
        Supplier supplier = c35043.f8794;
        AbstractC3595 abstractC3595 = c35043.f8359;
        AbstractC3595 abstractC35952 = c35043.f8360;
        AbstractC3595 abstractC35953 = c35043.f8361;
        long j3 = 0;
        if (zMo6729) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6717) == 0) {
                return c35043.m6145(abstractC3732, type, obj, jM6717);
            }
            abstractC3732.mo6701();
            Object obj2 = supplier.get();
            if (c35043.f8812) {
                c35043.mo6026(obj2);
            }
            abstractC35953.mo6032(abstractC3732, obj2);
            abstractC35952.mo6032(abstractC3732, obj2);
            abstractC3595.mo6032(abstractC3732, obj2);
            if (abstractC3732.mo6702()) {
                abstractC3732.mo6705();
                return function != null ? function.apply(obj2) : obj2;
            }
            C1123.m1410(abstractC3732.mo6730("array to bean end error"));
            return null;
        }
        abstractC3732.mo6708();
        Object objApply = supplier.get();
        if (c35043.f8812) {
            c35043.mo6026(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6717) != 0) {
            c35043.m6142(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC3732.mo6712()) {
                c3504 = c35043;
                break;
            }
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == j3) {
                c35042 = c35043;
            } else if (i == 0 && jMo6689 == InterfaceC3621.f8931) {
                long jMo6799 = abstractC3732.mo6799();
                C3776 c3776 = abstractC3732.f9546;
                InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(jMo6799);
                if ((interfaceC3621M6190 != null || (interfaceC3621M6190 = c3776.m6970(cls, abstractC3732.mo6660())) != null) && interfaceC3621M6190 != c35043) {
                    c3504 = c35043;
                    objApply = interfaceC3621M6190.mo6023(abstractC3732, type, obj, j);
                    break;
                }
                c35042 = c35043;
            } else {
                c35042 = c35043;
                if (jMo6689 == c35042.f8358) {
                    abstractC35953.mo6032(abstractC3732, objApply);
                } else if (jMo6689 == c35042.f8357) {
                    abstractC35952.mo6032(abstractC3732, objApply);
                } else if (jMo6689 == c35042.f8356) {
                    abstractC3595.mo6032(abstractC3732, objApply);
                } else if (abstractC3732.m6731(j2)) {
                    long jMo6666 = abstractC3732.mo6666();
                    if (jMo6666 == c35042.f8364) {
                        abstractC35953.mo6032(abstractC3732, objApply);
                    } else if (jMo6666 == c35042.f8363) {
                        abstractC35952.mo6032(abstractC3732, objApply);
                    } else if (jMo6666 == c35042.f8362) {
                        abstractC3595.mo6032(abstractC3732, objApply);
                    } else {
                        c35042.m6141(abstractC3732, objApply);
                    }
                } else {
                    c35042.m6141(abstractC3732, objApply);
                }
            }
            i++;
            c35043 = c35042;
            j3 = 0;
        }
        abstractC3732.mo6705();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c3504.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 mo6024(long j) {
        if (j == this.f8364) {
            return this.f8361;
        }
        if (j == this.f8363) {
            return this.f8360;
        }
        if (j == this.f8362) {
            return this.f8359;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC3595 mo6025(long j) {
        if (j == this.f8358) {
            return this.f8361;
        }
        if (j == this.f8357) {
            return this.f8360;
        }
        if (j == this.f8356) {
            return this.f8359;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo6026(Object obj) {
        this.f8361.m6133(obj);
        this.f8360.m6133(obj);
        this.f8359.m6133(obj);
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
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
        AbstractC3595 abstractC3595 = this.f8359;
        AbstractC3595 abstractC35952 = this.f8360;
        AbstractC3595 abstractC35953 = this.f8361;
        if (zMo6729) {
            Object obj2 = supplier.get();
            int iMo6792 = abstractC3732.mo6792();
            if (iMo6792 > 0) {
                abstractC35953.mo6032(abstractC3732, obj2);
                if (iMo6792 > 1) {
                    abstractC35952.mo6032(abstractC3732, obj2);
                    if (iMo6792 > 2) {
                        abstractC3595.mo6032(abstractC3732, obj2);
                        for (int i = 3; i < iMo6792; i++) {
                            abstractC3732.mo6793();
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
                long j4 = this.f8358;
                if (jMo6689 == j4) {
                    abstractC35953.mo6032(abstractC3732, objAllocateInstance);
                } else {
                    long j5 = this.f8357;
                    if (jMo6689 == j5) {
                        abstractC35952.mo6032(abstractC3732, objAllocateInstance);
                    } else {
                        long j6 = this.f8356;
                        if (jMo6689 == j6) {
                            abstractC3595.mo6032(abstractC3732, objAllocateInstance);
                        } else if (abstractC3732.m6731(j3)) {
                            long jMo6666 = abstractC3732.mo6666();
                            if (jMo6666 == j4) {
                                abstractC35953.mo6032(abstractC3732, objAllocateInstance);
                            } else if (jMo6666 == j5) {
                                abstractC35952.mo6032(abstractC3732, objAllocateInstance);
                            } else if (jMo6666 == j6) {
                                abstractC3595.mo6032(abstractC3732, objAllocateInstance);
                            } else {
                                m6141(abstractC3732, objAllocateInstance);
                            }
                        } else {
                            m6141(abstractC3732, objAllocateInstance);
                        }
                    }
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
