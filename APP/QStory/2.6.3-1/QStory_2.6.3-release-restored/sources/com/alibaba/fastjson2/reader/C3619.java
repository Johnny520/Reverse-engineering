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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3619 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8889;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8890;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8891;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final long f8892;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC3595 f8893;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC3595 f8894;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3595 f8895;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3595 f8896;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8897;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8898;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8899;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8900;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8901;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8902;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final long f8903;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3619(Class cls, Supplier supplier, long j, JSONSchema jSONSchema, Function function, AbstractC3595 abstractC3595, AbstractC3595 abstractC35952, AbstractC3595 abstractC35953, AbstractC3595 abstractC35954, AbstractC3595 abstractC35955) {
        AbstractC3595[] abstractC3595Arr = {abstractC3595, abstractC35952, abstractC35953, abstractC35954, abstractC35955};
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC3595Arr);
        AbstractC3595 abstractC35956 = abstractC3595Arr[0];
        this.f8897 = abstractC35956;
        AbstractC3595 abstractC35957 = abstractC3595Arr[1];
        this.f8896 = abstractC35957;
        AbstractC3595 abstractC35958 = abstractC3595Arr[2];
        this.f8895 = abstractC35958;
        AbstractC3595 abstractC35959 = abstractC3595Arr[3];
        this.f8894 = abstractC35959;
        AbstractC3595 abstractC359510 = abstractC3595Arr[4];
        this.f8893 = abstractC359510;
        this.f8892 = abstractC35956.f8756;
        this.f8903 = abstractC35957.f8756;
        this.f8902 = abstractC35958.f8756;
        this.f8901 = abstractC35959.f8756;
        this.f8900 = abstractC359510.f8756;
        this.f8899 = abstractC35956.f8755;
        this.f8898 = abstractC35957.f8755;
        this.f8890 = abstractC35958.f8755;
        this.f8889 = abstractC35959.f8755;
        this.f8891 = abstractC359510.f8755;
        this.f8812 = (abstractC35956.f8760 == null && abstractC35957.f8760 == null && abstractC35958.f8760 == null && abstractC35959.f8760 == null && abstractC359510.f8760 == null) ? false : true;
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
            this.f8897.mo6032(abstractC3732, obj2);
            if (iMo6792 > 1) {
                this.f8896.mo6032(abstractC3732, obj2);
                if (iMo6792 > 2) {
                    this.f8895.mo6032(abstractC3732, obj2);
                    if (iMo6792 > 3) {
                        this.f8894.mo6032(abstractC3732, obj2);
                        if (iMo6792 > 4) {
                            this.f8893.mo6032(abstractC3732, obj2);
                            for (int i = 5; i < iMo6792; i++) {
                                abstractC3732.mo6793();
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
        C3619 c3619;
        Class cls;
        C3619 c36192 = this;
        boolean z = c36192.f8813;
        Class cls2 = c36192.f8795;
        if (!z) {
            abstractC3732.m6716(cls2);
        }
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, j);
        }
        if (abstractC3732.mo6693()) {
            abstractC3732.mo6705();
            return null;
        }
        long j2 = c36192.f8792 | j;
        long jM6717 = abstractC3732.m6717(j2);
        boolean zMo6729 = abstractC3732.mo6729();
        Function function = c36192.f8793;
        Supplier supplier = c36192.f8794;
        AbstractC3595 abstractC3595 = c36192.f8893;
        AbstractC3595 abstractC35952 = c36192.f8894;
        AbstractC3595 abstractC35953 = c36192.f8895;
        AbstractC3595 abstractC35954 = c36192.f8896;
        AbstractC3595 abstractC35955 = c36192.f8897;
        if (zMo6729) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6717) == 0) {
                return c36192.m6145(abstractC3732, type, obj, jM6717);
            }
            abstractC3732.mo6701();
            Object obj2 = supplier.get();
            if (c36192.f8812) {
                c36192.mo6026(obj2);
            }
            abstractC35955.mo6032(abstractC3732, obj2);
            abstractC35954.mo6032(abstractC3732, obj2);
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
        if (c36192.f8812) {
            c36192.mo6026(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6717) != 0) {
            c36192.m6142(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC3732.mo6712()) {
                c3619 = c36192;
                break;
            }
            long jMo6689 = abstractC3732.mo6689();
            if (i == 0 && jMo6689 == InterfaceC3621.f8931) {
                long jMo6799 = abstractC3732.mo6799();
                C3776 c3776 = abstractC3732.f9546;
                InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(jMo6799);
                if ((interfaceC3621M6190 != null || (interfaceC3621M6190 = c3776.m6970(cls2, abstractC3732.mo6660())) != null) && interfaceC3621M6190 != c36192) {
                    c3619 = c36192;
                    objApply = interfaceC3621M6190.mo6023(abstractC3732, type, obj, j);
                    break;
                }
                cls = cls2;
                c3619 = c36192;
                i++;
                c36192 = c3619;
                cls2 = cls;
            } else {
                cls = cls2;
                c3619 = c36192;
                if (jMo6689 == -1) {
                    break;
                }
                if (jMo6689 == c3619.f8892) {
                    abstractC35955.mo6032(abstractC3732, objApply);
                } else if (jMo6689 == c3619.f8903) {
                    abstractC35954.mo6032(abstractC3732, objApply);
                } else if (jMo6689 == c3619.f8902) {
                    abstractC35953.mo6032(abstractC3732, objApply);
                } else if (jMo6689 == c3619.f8901) {
                    abstractC35952.mo6032(abstractC3732, objApply);
                } else if (jMo6689 == c3619.f8900) {
                    abstractC3595.mo6032(abstractC3732, objApply);
                } else if (abstractC3732.m6731(j2)) {
                    long jMo6666 = abstractC3732.mo6666();
                    if (jMo6666 == c3619.f8899) {
                        abstractC35955.mo6032(abstractC3732, objApply);
                    } else if (jMo6666 == c3619.f8898) {
                        abstractC35954.mo6032(abstractC3732, objApply);
                    } else if (jMo6666 == c3619.f8890) {
                        abstractC35953.mo6032(abstractC3732, objApply);
                    } else if (jMo6666 == c3619.f8889) {
                        abstractC35952.mo6032(abstractC3732, objApply);
                    } else if (jMo6666 == c3619.f8891) {
                        abstractC3595.mo6032(abstractC3732, objApply);
                    } else {
                        c3619.m6141(abstractC3732, objApply);
                    }
                } else {
                    c3619.m6141(abstractC3732, objApply);
                }
                i++;
                c36192 = c3619;
                cls2 = cls;
            }
        }
        abstractC3732.mo6705();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = c3619.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3595 mo6024(long j) {
        if (j == this.f8899) {
            return this.f8897;
        }
        if (j == this.f8898) {
            return this.f8896;
        }
        if (j == this.f8890) {
            return this.f8895;
        }
        if (j == this.f8889) {
            return this.f8894;
        }
        if (j == this.f8891) {
            return this.f8893;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC3595 mo6025(long j) {
        if (j == this.f8892) {
            return this.f8897;
        }
        if (j == this.f8903) {
            return this.f8896;
        }
        if (j == this.f8902) {
            return this.f8895;
        }
        if (j == this.f8901) {
            return this.f8894;
        }
        if (j == this.f8900) {
            return this.f8893;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo6026(Object obj) {
        this.f8897.m6133(obj);
        this.f8896.m6133(obj);
        this.f8895.m6133(obj);
        this.f8894.m6133(obj);
        this.f8893.m6133(obj);
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
        AbstractC3595 abstractC3595 = this.f8893;
        AbstractC3595 abstractC35952 = this.f8894;
        AbstractC3595 abstractC35953 = this.f8895;
        AbstractC3595 abstractC35954 = this.f8896;
        AbstractC3595 abstractC35955 = this.f8897;
        if (zMo6729) {
            Object obj2 = supplier.get();
            int iMo6792 = abstractC3732.mo6792();
            if (iMo6792 > 0) {
                abstractC35955.mo6032(abstractC3732, obj2);
                if (iMo6792 > 1) {
                    abstractC35954.mo6032(abstractC3732, obj2);
                    if (iMo6792 > 2) {
                        abstractC35953.mo6032(abstractC3732, obj2);
                        if (iMo6792 > 3) {
                            abstractC35952.mo6032(abstractC3732, obj2);
                            if (iMo6792 > 4) {
                                abstractC3595.mo6032(abstractC3732, obj2);
                                for (int i = 5; i < iMo6792; i++) {
                                    abstractC3732.mo6793();
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
            C1123.m1401(InterfaceC3745.m6917(abstractC3732.mo6743()), "expect object, but ");
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
                if (jMo6689 == this.f8892) {
                    abstractC35955.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8903) {
                    abstractC35954.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8902) {
                    abstractC35953.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8901) {
                    abstractC35952.mo6032(abstractC3732, objAllocateInstance);
                } else if (jMo6689 == this.f8900) {
                    abstractC3595.mo6032(abstractC3732, objAllocateInstance);
                } else if (abstractC3732.m6731(j3)) {
                    long jMo6666 = abstractC3732.mo6666();
                    if (jMo6666 == this.f8899) {
                        abstractC35955.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8898) {
                        abstractC35954.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8890) {
                        abstractC35953.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8889) {
                        abstractC35952.mo6032(abstractC3732, objAllocateInstance);
                    } else if (jMo6666 == this.f8891) {
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
