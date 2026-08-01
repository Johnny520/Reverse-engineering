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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3509 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f8452;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f8453;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8454;

    public C3509(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC3595... abstractC3595Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC3595Arr);
        AbstractC3595 abstractC3595 = abstractC3595Arr[0];
        this.f8454 = abstractC3595;
        this.f8453 = abstractC3595.f8756;
        this.f8452 = abstractC3595.f8755;
        this.f8812 = abstractC3595.f8760 != null;
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
            this.f8454.mo6032(abstractC3732, obj2);
            for (int i = 1; i < iMo6792; i++) {
                abstractC3732.mo6793();
            }
        }
        Function function = this.f8793;
        return function != null ? function.apply(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        InterfaceC3621 interfaceC3621;
        boolean z = this.f8813;
        Class cls = this.f8795;
        if (!z) {
            abstractC3732.m6716(cls);
        }
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, 0L);
        }
        if (abstractC3732.mo6711()) {
            return null;
        }
        long j2 = this.f8792 | j;
        long jM6717 = abstractC3732.m6717(j2);
        boolean zMo6729 = abstractC3732.mo6729();
        Function function = this.f8793;
        Supplier supplier = this.f8794;
        AbstractC3595 abstractC3595 = this.f8454;
        if (zMo6729) {
            if ((JSONReader$Feature.SupportArrayToBean.mask & jM6717) == 0) {
                return m6145(abstractC3732, type, obj, jM6717);
            }
            abstractC3732.mo6733();
            Object obj2 = supplier.get();
            abstractC3595.mo6032(abstractC3732, obj2);
            if (abstractC3732.mo6702()) {
                abstractC3732.mo6705();
                return function != null ? function.apply(obj2) : obj2;
            }
            C1123.m1410(abstractC3732.mo6730("array to bean end error, " + abstractC3732.f9538));
            return null;
        }
        abstractC3732.mo6708();
        Object objApply = supplier != null ? supplier.get() : null;
        if (this.f8812) {
            mo6026(objApply);
        }
        if (objApply != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6717) != 0) {
            m6142(objApply);
        }
        int i = 0;
        while (true) {
            if (abstractC3732.mo6712()) {
                break;
            }
            long jMo6689 = abstractC3732.mo6689();
            if (i == 0 && jMo6689 == InterfaceC3621.f8931) {
                long jMo6799 = abstractC3732.mo6799();
                C3776 c3776 = abstractC3732.f9546;
                InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(jMo6799);
                if ((interfaceC3621M6190 != null || (interfaceC3621M6190 = c3776.m6970(cls, abstractC3732.mo6660())) != null) && (interfaceC3621 = interfaceC3621M6190) != this) {
                    objApply = interfaceC3621.mo6023(abstractC3732, type, obj, j);
                    break;
                }
            } else if (jMo6689 == this.f8453) {
                abstractC3595.mo6032(abstractC3732, objApply);
            } else if (abstractC3732.m6731(j2) && abstractC3732.mo6666() == this.f8452) {
                abstractC3595.mo6032(abstractC3732, objApply);
            } else {
                m6141(abstractC3732, objApply);
            }
            i++;
        }
        abstractC3732.mo6705();
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = this.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3595 mo6024(long j) {
        if (j == this.f8452) {
            return this.f8454;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6028(AbstractC3732 abstractC3732) {
        return mo6023(abstractC3732, null, null, this.f8792);
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC3595 mo6025(long j) {
        if (j == this.f8453) {
            return this.f8454;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo6026(Object obj) {
        this.f8454.m6133(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objAllocateInstance;
        Object objApply;
        JSONSchema jSONSchema;
        boolean z = this.f8813;
        Class cls = this.f8795;
        if (!z) {
            abstractC3732.m6716(cls);
        }
        InterfaceC3621 interfaceC3621M6147 = m6147(abstractC3732, j);
        C3776 c3776 = abstractC3732.f9546;
        if (interfaceC3621M6147 != null) {
            return interfaceC3621M6147.mo6027(abstractC3732, type, obj, j);
        }
        boolean zMo6729 = abstractC3732.mo6729();
        Function function = this.f8793;
        Supplier supplier = this.f8794;
        AbstractC3595 abstractC3595 = this.f8454;
        if (zMo6729) {
            Object obj2 = supplier.get();
            int iMo6792 = abstractC3732.mo6792();
            if (iMo6792 > 0) {
                abstractC3595.mo6032(abstractC3732, obj2);
                for (int i = 1; i < iMo6792; i++) {
                    abstractC3732.mo6793();
                }
            }
            return function != null ? function.apply(obj2) : obj2;
        }
        if (!abstractC3732.mo6703((byte) -90)) {
            if (!abstractC3732.f9525) {
                C1123.m1410(abstractC3732.mo6730("expect object, but " + InterfaceC3745.m6917(abstractC3732.mo6743())));
                return null;
            }
            abstractC3732.f9525 = false;
        }
        if (supplier != null) {
            objAllocateInstance = supplier.get();
        } else {
            if (((j | c3776.f9665) & JSONReader$Feature.FieldBased.mask) == 0) {
                objApply = null;
                if (objApply != null && this.f8812) {
                    mo6026(objApply);
                }
                int i2 = 0;
                while (!abstractC3732.mo6703((byte) -91)) {
                    long jMo6689 = abstractC3732.mo6689();
                    if (jMo6689 == this.f8803 && i2 == 0) {
                        InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, abstractC3732.mo6799());
                        if (interfaceC3621Mo6146 == null) {
                            String strMo6660 = abstractC3732.mo6660();
                            InterfaceC3621 interfaceC3621M6970 = c3776.m6970(null, strMo6660);
                            if (interfaceC3621M6970 == null) {
                                C1123.m1410(abstractC3732.mo6730("autoType not support : " + strMo6660));
                                return null;
                            }
                            interfaceC3621Mo6146 = interfaceC3621M6970;
                        }
                        if (interfaceC3621Mo6146 != this) {
                            return interfaceC3621Mo6146.mo6027(abstractC3732, type, obj, j);
                        }
                    } else if (jMo6689 != 0) {
                        if (jMo6689 == this.f8453) {
                            abstractC3595.mo6041(abstractC3732, objApply);
                        } else if (abstractC3732.m6731(j | this.f8792) && abstractC3732.mo6666() == this.f8452) {
                            abstractC3595.mo6032(abstractC3732, objApply);
                        } else {
                            m6141(abstractC3732, objApply);
                        }
                    }
                    i2++;
                }
                if (function != null) {
                    objApply = function.apply(objApply);
                }
                jSONSchema = this.f8810;
                if (jSONSchema != null) {
                    jSONSchema.m6216(objApply);
                }
                return objApply;
            }
            try {
                objAllocateInstance = AbstractC3687.f9266.allocateInstance(cls);
            } catch (InstantiationException e) {
                C1123.m1403(abstractC3732.mo6730("create instance error"), e);
                return null;
            }
        }
        objApply = objAllocateInstance;
        if (objApply != null) {
            mo6026(objApply);
        }
        int i22 = 0;
        while (!abstractC3732.mo6703((byte) -91)) {
        }
        if (function != null) {
        }
        jSONSchema = this.f8810;
        if (jSONSchema != null) {
        }
        return objApply;
    }
}
