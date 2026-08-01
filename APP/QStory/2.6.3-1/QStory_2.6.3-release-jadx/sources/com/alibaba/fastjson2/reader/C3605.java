package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import p160.C8376;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3605 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f8791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8793;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Supplier f8794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8795;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile boolean f8796;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Constructor f8797;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Class f8798;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final HashMap f8799;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Class[] f8800;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final String[] f8801;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC3595[] f8802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f8803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long[] f8804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final short[] f8805;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final long[] f8806;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short[] f8807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC3595 f8808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8809;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final JSONSchema f8810;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final String f8811;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f8812;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f8813;

    public C3605(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, AbstractC3595... abstractC3595Arr) {
        AbstractC3595 abstractC3595;
        String strM6503 = (str2 != null || cls == null) ? str2 : AbstractC3700.m6503(cls);
        this.f8795 = cls;
        this.f8794 = supplier;
        this.f8793 = function;
        this.f8792 = j;
        this.f8791 = strM6503;
        this.f8809 = strM6503 != null ? AbstractC3693.m6334(strM6503) : 0L;
        this.f8810 = jSONSchema;
        this.f8813 = cls != null && Serializable.class.isAssignableFrom(cls);
        Constructor constructorM6372 = cls == null ? null : AbstractC3698.m6372(cls, true);
        this.f8797 = constructorM6372;
        if (constructorM6372 != null) {
            constructorM6372.setAccessible(true);
        }
        if (str == null || str.isEmpty()) {
            this.f8811 = "@type";
            this.f8803 = InterfaceC3621.f8931;
        } else {
            this.f8811 = str;
            this.f8803 = AbstractC3693.m6334(str);
        }
        this.f8802 = abstractC3595Arr;
        int length = abstractC3595Arr.length;
        long[] jArr = new long[length];
        int length2 = abstractC3595Arr.length;
        long[] jArr2 = new long[length2];
        for (int i = 0; i < abstractC3595Arr.length; i++) {
            AbstractC3595 abstractC35952 = abstractC3595Arr[i];
            jArr[i] = abstractC35952.f8756;
            jArr2[i] = abstractC35952.f8755;
            if ((abstractC35952.f8767 & 562949953421312L) != 0 && ((abstractC3595 = this.f8808) == null || !(abstractC3595 instanceof C3594))) {
                this.f8808 = abstractC35952;
            }
            if (abstractC35952.f8760 != null) {
                this.f8812 = true;
            }
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.f8806 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.f8807 = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f8807[Arrays.binarySearch(this.f8806, jArr[i2])] = (short) i2;
        }
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, length2);
        this.f8804 = jArrCopyOf2;
        Arrays.sort(jArrCopyOf2);
        this.f8805 = new short[jArrCopyOf2.length];
        for (int i3 = 0; i3 < length2; i3++) {
            this.f8805[Arrays.binarySearch(this.f8804, jArr2[i3])] = (short) i3;
        }
        this.f8800 = clsArr;
        if (clsArr != null) {
            this.f8799 = new HashMap(clsArr.length, 1.0f);
            this.f8801 = new String[clsArr.length];
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                Class cls3 = clsArr[i4];
                String simpleName = (strArr == null || strArr.length < i4 + 1) ? null : strArr[i4];
                if (simpleName == null || simpleName.isEmpty()) {
                    simpleName = cls3.getSimpleName();
                }
                this.f8799.put(Long.valueOf(AbstractC3693.m6334(simpleName)), cls3);
                this.f8801[i4] = simpleName;
            }
        } else {
            this.f8799 = null;
            this.f8801 = null;
        }
        this.f8798 = cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m6137(AbstractC3595 abstractC3595) {
        return (abstractC3595.f8767 & JSONReader$Feature.NullOnError.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    public final long getFeatures() {
        return this.f8792;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo6059(long j) {
        Object objNewInstance;
        Constructor constructor;
        if (this.f8796 && (constructor = this.f8797) != null) {
            try {
                Object objNewInstance2 = constructor.newInstance(null);
                if (this.f8812) {
                    mo6026(objNewInstance2);
                }
                return objNewInstance2;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                C3775.m6961("create instance error, ", this.f8795, e);
                return null;
            }
        }
        try {
            Class cls = this.f8795;
            Constructor constructor2 = this.f8797;
            if ((j & JSONReader$Feature.UseDefaultConstructorAsPossible.mask) == 0 || constructor2 == null || constructor2.getParameterCount() != 0) {
                Supplier supplier = this.f8794;
                if (supplier != null) {
                    objNewInstance = supplier.get();
                } else {
                    C3775.m6964(cls, "create instance error, ");
                    objNewInstance = null;
                }
            } else {
                try {
                    objNewInstance = constructor2.newInstance(null);
                    if (this.f8812) {
                        mo6026(objNewInstance);
                    }
                } catch (IllegalAccessException e2) {
                    e = e2;
                    C8376.m13334("create instance error, ", cls, e);
                    objNewInstance = null;
                } catch (InstantiationException e3) {
                    e = e3;
                    C8376.m13334("create instance error, ", cls, e);
                    objNewInstance = null;
                } catch (InvocationTargetException e4) {
                    e = e4;
                    C8376.m13334("create instance error, ", cls, e);
                    objNewInstance = null;
                }
            }
            if (!this.f8812) {
                return objNewInstance;
            }
            mo6026(objNewInstance);
            return objNewInstance;
        } catch (Exception e5) {
            this.f8796 = true;
            Constructor constructor3 = this.f8797;
            if (constructor3 == null) {
                C3775.m6961("create instance error, ", this.f8795, e5);
                return null;
            }
            try {
                Object objNewInstance3 = constructor3.newInstance(null);
                if (this.f8812) {
                    mo6026(objNewInstance3);
                }
                return objNewInstance3;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
                C3775.m6961("create instance error, ", this.f8795, e6);
                return null;
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo6138(Object obj, String str, Object obj2, long j) {
        AbstractC3595 abstractC3595Mo6024;
        Class cls;
        AbstractC3595 abstractC3595 = this.f8808;
        if (abstractC3595 != null && obj != null) {
            abstractC3595.mo6043(obj, str, obj2);
            return;
        }
        if (str.startsWith("is") && (abstractC3595Mo6024 = mo6024(AbstractC3693.m6333(str.substring(2)))) != null && ((cls = abstractC3595Mo6024.f8774) == Boolean.class || cls == Boolean.TYPE)) {
            abstractC3595Mo6024.mo6031(obj, obj2);
        } else {
            if ((JSONReader$Feature.ErrorOnUnknownProperties.mask & j) == 0) {
                return;
            }
            C1123.m1410("Unknown Property ".concat(str));
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public Object mo6022(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!this.f8813) {
            abstractC3732.m6716(this.f8795);
        }
        InterfaceC3621 interfaceC3621M6147 = m6147(abstractC3732, j);
        if (interfaceC3621M6147 != null) {
            return interfaceC3621M6147.mo6022(abstractC3732, type, obj, j);
        }
        Object objMo6059 = mo6059(0L);
        int iMo6792 = abstractC3732.mo6792();
        AbstractC3595[] abstractC3595Arr = this.f8802;
        if (iMo6792 == abstractC3595Arr.length) {
            for (AbstractC3595 abstractC3595 : abstractC3595Arr) {
                try {
                    abstractC3595.mo6032(abstractC3732, objMo6059);
                } catch (RuntimeException e) {
                    if (!m6137(abstractC3595)) {
                        throw e;
                    }
                }
            }
        } else {
            m6143(abstractC3732, objMo6059, iMo6792);
        }
        Function function = this.f8793;
        return function != null ? function.apply(objMo6059) : objMo6059;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3621 mo6139(C3635 c3635, long j) {
        HashMap map = this.f8799;
        if (map == null || map.size() <= 0) {
            return c3635.m6190(j);
        }
        Class cls = (Class) map.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return c3635.m6193(cls, false);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        String str;
        long j2;
        long j3;
        long j4;
        String strMo6660;
        boolean z = abstractC3732.f9544;
        C3776 c3776 = abstractC3732.f9546;
        if (z) {
            return mo6027(abstractC3732, type, obj, j);
        }
        if (abstractC3732.mo6711()) {
            abstractC3732.mo6705();
            return null;
        }
        String str2 = null;
        long j5 = this.f8792 | j;
        long jM6717 = abstractC3732.m6717(j5);
        long j6 = 0;
        if (abstractC3732.mo6729()) {
            return (JSONReader$Feature.SupportArrayToBean.mask & jM6717) != 0 ? mo6097(abstractC3732, type, obj, j) : m6145(abstractC3732, type, obj, jM6717);
        }
        if (!abstractC3732.mo6708()) {
            char c = abstractC3732.f9538;
            if (c == 't' || c == 'f') {
                abstractC3732.mo6668();
                return null;
            }
            if (c != '\"' && c != '\'' && c != '}') {
                C1123.m1410(abstractC3732.mo6730(null));
                return null;
            }
        }
        int i = 0;
        Object objApply = null;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            c3776.getClass();
            if (i == 0 && jMo6689 == this.f8803) {
                long j7 = c3776.f9665 | j5;
                str = str2;
                j4 = j6;
                if ((JSONReader$Feature.SupportAutoType.mask & j7) == j4) {
                    j2 = jM6717;
                    j3 = j5;
                } else {
                    InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, abstractC3732.mo6799());
                    if (interfaceC3621Mo6146 == null) {
                        String strMo66602 = abstractC3732.mo6660();
                        j2 = jM6717;
                        InterfaceC3621 interfaceC3621M6189 = ((C3635) c3776.f9663).m6189(strMo66602, this.f8795, c3776.f9665 | j7);
                        if (interfaceC3621M6189 == null) {
                            C1123.m1410(abstractC3732.mo6730("No suitable ObjectReader found for " + strMo66602));
                            return str;
                        }
                        strMo6660 = strMo66602;
                        interfaceC3621Mo6146 = interfaceC3621M6189;
                    } else {
                        j2 = jM6717;
                        strMo6660 = str;
                    }
                    if (interfaceC3621Mo6146 != this) {
                        AbstractC3595 abstractC3595Mo6025 = interfaceC3621Mo6146.mo6025(jMo6689);
                        if (abstractC3595Mo6025 != null && strMo6660 == null) {
                            strMo6660 = abstractC3732.mo6660();
                        }
                        String str3 = strMo6660;
                        Object objMo6023 = interfaceC3621Mo6146.mo6023(abstractC3732, null, null, j5);
                        if (abstractC3595Mo6025 != null) {
                            abstractC3595Mo6025.mo6031(objMo6023, str3);
                        }
                        return objMo6023;
                    }
                    j3 = j5;
                    i++;
                    j5 = j3;
                    str2 = str;
                    j6 = j4;
                    jM6717 = j2;
                }
            } else {
                str = str2;
                j2 = jM6717;
                j3 = j5;
                j4 = j6;
            }
            AbstractC3595 abstractC3595Mo60252 = mo6025(jMo6689);
            if (abstractC3595Mo60252 == null && abstractC3732.m6731(j3)) {
                abstractC3595Mo60252 = mo6024(abstractC3732.mo6666());
            }
            if (objApply == null) {
                objApply = mo6059(c3776.f9665 | j);
            }
            if (abstractC3595Mo60252 == null) {
                m6141(abstractC3732, objApply);
            } else {
                abstractC3595Mo60252.mo6032(abstractC3732, objApply);
            }
            i++;
            j5 = j3;
            str2 = str;
            j6 = j4;
            jM6717 = j2;
        }
        if (objApply == null && (objApply = mo6059(c3776.f9665 | j)) != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6717) != j6) {
            m6142(objApply);
        }
        abstractC3732.mo6705();
        Function function = this.f8793;
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = this.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo6140() {
        return this.f8803;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6029(Collection collection, long j) {
        Object objMo6059 = mo6059(0L);
        int i = 0;
        for (Object obj : collection) {
            AbstractC3595[] abstractC3595Arr = this.f8802;
            if (i >= abstractC3595Arr.length) {
                break;
            }
            abstractC3595Arr[i].mo6031(objMo6059, obj);
            i++;
        }
        return objMo6059;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f8795;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public AbstractC3595 mo6024(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f8804, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f8802[this.f8805[iBinarySearch]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m6141(AbstractC3732 abstractC3732, Object obj) {
        AbstractC3595 abstractC3595Mo6024;
        Class cls;
        if ((abstractC3732.m6717(this.f8792) & JSONReader$Feature.SupportSmartMatch.mask) != 0) {
            String strMo6664 = abstractC3732.mo6664();
            if (strMo6664.startsWith("is") && (abstractC3595Mo6024 = mo6024(AbstractC3693.m6333(strMo6664.substring(2)))) != null && obj != null && ((cls = abstractC3595Mo6024.f8774) == Boolean.class || cls == Boolean.TYPE)) {
                abstractC3595Mo6024.mo6032(abstractC3732, obj);
                return;
            }
        }
        AbstractC3595 abstractC3595 = this.f8808;
        if (abstractC3595 != null && obj != null) {
            abstractC3595.mo6044(abstractC3732, obj);
            return;
        }
        abstractC3732.f9546.getClass();
        if ((abstractC3732.m6717(0L) & JSONReader$Feature.ErrorOnUnknownProperties.mask) == 0) {
            abstractC3732.mo6793();
        } else {
            C1123.m1401(abstractC3732.mo6664(), "Unknown Property ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m6142(Object obj) {
        int i = 0;
        while (true) {
            AbstractC3595[] abstractC3595Arr = this.f8802;
            if (i >= abstractC3595Arr.length) {
                return;
            }
            AbstractC3595 abstractC3595 = abstractC3595Arr[i];
            if (abstractC3595.f8774 == String.class) {
                abstractC3595.mo6031(obj, "");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m6143(AbstractC3732 abstractC3732, Object obj, int i) {
        int i2 = 0;
        while (true) {
            AbstractC3595[] abstractC3595Arr = this.f8802;
            if (i2 >= abstractC3595Arr.length) {
                for (int length = abstractC3595Arr.length; length < i; length++) {
                    abstractC3732.mo6793();
                }
                return;
            }
            if (i2 < i) {
                AbstractC3595 abstractC3595 = abstractC3595Arr[i2];
                try {
                    abstractC3595.mo6032(abstractC3732, obj);
                } catch (RuntimeException e) {
                    if (!m6137(abstractC3595)) {
                        throw e;
                    }
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String mo6144() {
        return this.f8811;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object m6145(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        String str = "expect {, but [, class " + this.f8791;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String strMo6730 = abstractC3732.mo6730(str);
        if ((abstractC3732.m6717(j) & JSONReader$Feature.SupportSmartMatch.mask) != 0) {
            if (type == null) {
                type = this.f8795;
            }
            List listMo6682 = abstractC3732.mo6682(type);
            if (listMo6682 != null) {
                if (listMo6682.size() == 0) {
                    return null;
                }
                if (listMo6682.size() == 1) {
                    return listMo6682.get(0);
                }
            }
        }
        C1123.m1410(strMo6730);
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public AbstractC3595 mo6025(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f8806, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f8802[this.f8807[iBinarySearch]];
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Function mo6063() {
        return this.f8793;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo6026(Object obj) {
        int i = 0;
        while (true) {
            AbstractC3595[] abstractC3595Arr = this.f8802;
            if (i >= abstractC3595Arr.length) {
                return;
            }
            AbstractC3595 abstractC3595 = abstractC3595Arr[i];
            Object obj2 = abstractC3595.f8760;
            if (obj2 != null) {
                abstractC3595.mo6031(obj, obj2);
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC3621 mo6146(C3776 c3776, long j) {
        HashMap map = this.f8799;
        if (map == null || map.size() <= 0) {
            return ((C3635) c3776.f9663).m6190(j);
        }
        Class cls = (Class) map.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return c3776.m6971(cls);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public Object mo6097(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.f9544) {
            return mo6022(abstractC3732, type, obj, j);
        }
        if (!this.f8813) {
            abstractC3732.m6716(this.f8795);
        }
        abstractC3732.mo6701();
        Object obj2 = this.f8794.get();
        int i = 0;
        while (true) {
            AbstractC3595[] abstractC3595Arr = this.f8802;
            if (i >= abstractC3595Arr.length) {
                if (!abstractC3732.mo6702()) {
                    C1123.m1410(abstractC3732.mo6730("array to bean end error"));
                    return null;
                }
                abstractC3732.mo6705();
                Function function = this.f8793;
                return function != null ? function.apply(obj2) : obj2;
            }
            AbstractC3595 abstractC3595 = abstractC3595Arr[i];
            try {
                abstractC3595.mo6032(abstractC3732, obj2);
            } catch (RuntimeException e) {
                if (!m6137(abstractC3595)) {
                    throw e;
                }
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        boolean zMo6693 = abstractC3732.mo6693();
        C3776 c3776 = abstractC3732.f9546;
        if (zMo6693) {
            return null;
        }
        long j2 = this.f8792 | j;
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(this.f8809, j2, this.f8795);
        Class cls = this.f8795;
        if (interfaceC3621Mo6724 != null && interfaceC3621Mo6724.mo6058() != cls) {
            return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
        }
        if (!this.f8813) {
            abstractC3732.m6716(cls);
        }
        if (abstractC3732.mo6729()) {
            if (abstractC3732.m6736()) {
                return mo6022(abstractC3732, type, obj, j);
            }
            C1123.m1410(abstractC3732.mo6730("expect object, but " + InterfaceC3745.m6917(abstractC3732.mo6743())));
            return null;
        }
        abstractC3732.mo6708();
        int i = 0;
        Object objMo6059 = null;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == this.f8803 && i == 0) {
                InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, abstractC3732.mo6804());
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
                    abstractC3732.f9525 = true;
                    return interfaceC3621Mo6146.mo6027(abstractC3732, type, obj, j);
                }
            } else if (jMo6689 != 0) {
                AbstractC3595 abstractC3595Mo6025 = mo6025(jMo6689);
                if (abstractC3595Mo6025 == null && abstractC3732.m6731(j2)) {
                    abstractC3595Mo6025 = mo6024(abstractC3732.mo6666());
                }
                if (abstractC3595Mo6025 == null) {
                    m6141(abstractC3732, objMo6059);
                } else {
                    if (objMo6059 == null) {
                        objMo6059 = mo6059(c3776.f9665 | j);
                    }
                    abstractC3595Mo6025.mo6032(abstractC3732, objMo6059);
                }
            }
            i++;
        }
        if (objMo6059 == null) {
            objMo6059 = mo6059(c3776.f9665 | j);
        }
        JSONSchema jSONSchema = this.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objMo6059);
        }
        return objMo6059;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC3621 m6147(AbstractC3732 abstractC3732, long j) {
        if (abstractC3732.mo6692()) {
            long jMo6799 = abstractC3732.mo6799();
            C3776 c3776 = abstractC3732.f9546;
            long jM6717 = abstractC3732.m6717(this.f8792 | j);
            c3776.getClass();
            Class cls = this.f8795;
            InterfaceC3621 interfaceC3621M6661 = abstractC3732.m6661(jMo6799, j, cls);
            if (interfaceC3621M6661 == null) {
                C1123.m1410(abstractC3732.mo6730("autoType not support"));
                return null;
            }
            Class clsMo6058 = interfaceC3621M6661.mo6058();
            Class cls2 = this.f8795;
            if (cls == null || clsMo6058 == null || cls.isAssignableFrom(clsMo6058)) {
                if (jMo6799 == this.f8809 || (JSONReader$Feature.SupportAutoType.mask & jM6717) == 0) {
                    interfaceC3621M6661 = null;
                }
            } else {
                if ((JSONReader$Feature.IgnoreAutoTypeNotMatch.mask & jM6717) == 0) {
                    C3775.m6957("type not match. ", this.f8791, " -> ", cls2.getName());
                    return null;
                }
                interfaceC3621M6661 = c3776.m6971(cls);
            }
            if (interfaceC3621M6661 != this && (interfaceC3621M6661 == null || interfaceC3621M6661.mo6058() != cls2)) {
                return interfaceC3621M6661;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo6067(Map map, long j) throws IOException {
        C3635 c3635M6947 = AbstractC3766.m6947();
        Object obj = map.get(this.f8811);
        long j2 = this.f8792 | j;
        if (obj instanceof String) {
            String str = (String) obj;
            InterfaceC3621 interfaceC3621Mo6139 = ((JSONReader$Feature.SupportAutoType.mask & j) != 0 || (this instanceof C3633)) ? mo6139(c3635M6947, AbstractC3693.m6334(str)) : null;
            if (interfaceC3621Mo6139 == null) {
                interfaceC3621Mo6139 = c3635M6947.m6189(str, this.f8795, j2);
            }
            if (interfaceC3621Mo6139 != this && interfaceC3621Mo6139 != null) {
                return interfaceC3621Mo6139.mo6067(map, j);
            }
        }
        Object objMo6059 = mo6059(j);
        int i = 0;
        if (this.f8808 == null) {
            if (((JSONReader$Feature.ErrorOnUnknownProperties.mask | JSONReader$Feature.SupportSmartMatch.mask) & j2) == 0) {
                boolean z = (JSONReader$Feature.FieldBased.mask & j2) != 0;
                while (true) {
                    AbstractC3595[] abstractC3595Arr = this.f8802;
                    if (i >= abstractC3595Arr.length) {
                        break;
                    }
                    AbstractC3595 abstractC3595 = abstractC3595Arr[i];
                    Object obj2 = map.get(abstractC3595.f8773);
                    if (obj2 != null || ((JSONReader$Feature.IgnoreSetNullValue.mask & j2) == 0 && map.containsKey(abstractC3595.f8773))) {
                        Field field = abstractC3595.f8769;
                        if (field != null && Modifier.isFinal(field.getModifiers())) {
                            try {
                                Object objInvoke = abstractC3595.f8772.invoke(objMo6059, null);
                                if (!(objInvoke instanceof Collection) || ((Collection) objInvoke).isEmpty()) {
                                }
                            } catch (Exception unused) {
                            }
                        } else if (obj2 != null) {
                            try {
                                Class<?> cls = obj2.getClass();
                                Type type = abstractC3595.f8768;
                                if (cls == type) {
                                    abstractC3595.mo6031(objMo6059, obj2);
                                } else if ((abstractC3595 instanceof C3585) && (obj2 instanceof JSONArray)) {
                                    abstractC3595.mo6031(objMo6059, abstractC3595.m6134(c3635M6947).mo6029((JSONArray) obj2, j));
                                } else if (!(obj2 instanceof JSONObject) || type == JSONObject.class) {
                                    abstractC3595.mo6042(j, objMo6059, obj2);
                                } else {
                                    abstractC3595.mo6031(objMo6059, c3635M6947.m6193(type, z).mo6067((JSONObject) obj2, j));
                                }
                            } catch (RuntimeException e) {
                                if (!m6137(abstractC3595)) {
                                    throw e;
                                }
                            }
                        } else {
                            abstractC3595.mo6031(objMo6059, obj2);
                        }
                    }
                    i++;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    String string = entry.getKey().toString();
                    Object value = entry.getValue();
                    AbstractC3595 abstractC3595M6180 = m6180(string);
                    if (abstractC3595M6180 == null) {
                        mo6138(objMo6059, string, entry.getValue(), j);
                    } else {
                        Object obj3 = objMo6059;
                        Type type2 = abstractC3595M6180.f8768;
                        if (value != null && value.getClass() == type2) {
                            abstractC3595M6180.mo6031(obj3, value);
                        } else if (value == null || !"com.alibaba.fastjson.JSONObject".equals(value.getClass().getName())) {
                            abstractC3595M6180.mo6042(j, obj3, value);
                        } else {
                            abstractC3595M6180.mo6031(obj3, c3635M6947.m6193(type2, false).mo6067((Map) value, j));
                        }
                        objMo6059 = obj3;
                    }
                }
            }
        }
        Object obj4 = objMo6059;
        Function function = this.f8793;
        return function != null ? function.apply(obj4) : obj4;
    }

    public C3605(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC3595... abstractC3595Arr) {
        this(cls, str, str2, j, jSONSchema, supplier, function, null, null, null, abstractC3595Arr);
    }
}
