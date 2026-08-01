package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import p144.C7547;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2772 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f8446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8448;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Supplier f8449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8450;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile boolean f8451;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Constructor f8452;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Class f8453;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final HashMap f8454;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Class[] f8455;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final String[] f8456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC2762[] f8457;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f8458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long[] f8459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final short[] f8460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final long[] f8461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short[] f8462;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8463;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8464;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final JSONSchema f8465;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final String f8466;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f8467;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f8468;

    public C2772(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, AbstractC2762... abstractC2762Arr) {
        AbstractC2762 abstractC2762;
        String strM5943 = (str2 != null || cls == null) ? str2 : AbstractC2867.m5943(cls);
        this.f8450 = cls;
        this.f8449 = supplier;
        this.f8448 = function;
        this.f8447 = j;
        this.f8446 = strM5943;
        this.f8464 = strM5943 != null ? AbstractC2860.m5774(strM5943) : 0L;
        this.f8465 = jSONSchema;
        this.f8468 = cls != null && Serializable.class.isAssignableFrom(cls);
        Constructor constructorM5812 = cls == null ? null : AbstractC2865.m5812(cls, true);
        this.f8452 = constructorM5812;
        if (constructorM5812 != null) {
            constructorM5812.setAccessible(true);
        }
        if (str == null || str.isEmpty()) {
            this.f8466 = "@type";
            this.f8458 = InterfaceC2788.f8586;
        } else {
            this.f8466 = str;
            this.f8458 = AbstractC2860.m5774(str);
        }
        this.f8457 = abstractC2762Arr;
        int length = abstractC2762Arr.length;
        long[] jArr = new long[length];
        int length2 = abstractC2762Arr.length;
        long[] jArr2 = new long[length2];
        for (int i = 0; i < abstractC2762Arr.length; i++) {
            AbstractC2762 abstractC27622 = abstractC2762Arr[i];
            jArr[i] = abstractC27622.f8411;
            jArr2[i] = abstractC27622.f8410;
            if ((abstractC27622.f8422 & 562949953421312L) != 0 && ((abstractC2762 = this.f8463) == null || !(abstractC2762 instanceof C2761))) {
                this.f8463 = abstractC27622;
            }
            if (abstractC27622.f8415 != null) {
                this.f8467 = true;
            }
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.f8461 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.f8462 = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f8462[Arrays.binarySearch(this.f8461, jArr[i2])] = (short) i2;
        }
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, length2);
        this.f8459 = jArrCopyOf2;
        Arrays.sort(jArrCopyOf2);
        this.f8460 = new short[jArrCopyOf2.length];
        for (int i3 = 0; i3 < length2; i3++) {
            this.f8460[Arrays.binarySearch(this.f8459, jArr2[i3])] = (short) i3;
        }
        this.f8455 = clsArr;
        if (clsArr != null) {
            this.f8454 = new HashMap(clsArr.length, 1.0f);
            this.f8456 = new String[clsArr.length];
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                Class cls3 = clsArr[i4];
                String simpleName = (strArr == null || strArr.length < i4 + 1) ? null : strArr[i4];
                if (simpleName == null || simpleName.isEmpty()) {
                    simpleName = cls3.getSimpleName();
                }
                this.f8454.put(Long.valueOf(AbstractC2860.m5774(simpleName)), cls3);
                this.f8456[i4] = simpleName;
            }
        } else {
            this.f8454 = null;
            this.f8456 = null;
        }
        this.f8453 = cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m5577(AbstractC2762 abstractC2762) {
        return (abstractC2762.f8422 & JSONReader$Feature.NullOnError.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    public final long getFeatures() {
        return this.f8447;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo5499(long j) {
        Object objNewInstance;
        Constructor constructor;
        if (this.f8451 && (constructor = this.f8452) != null) {
            try {
                Object objNewInstance2 = constructor.newInstance(null);
                if (this.f8467) {
                    mo5466(objNewInstance2);
                }
                return objNewInstance2;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                C2942.m6401("create instance error, ", this.f8450, e);
                return null;
            }
        }
        try {
            Class cls = this.f8450;
            Constructor constructor2 = this.f8452;
            if ((j & JSONReader$Feature.UseDefaultConstructorAsPossible.mask) == 0 || constructor2 == null || constructor2.getParameterCount() != 0) {
                Supplier supplier = this.f8449;
                if (supplier != null) {
                    objNewInstance = supplier.get();
                } else {
                    C2942.m6404(cls, "create instance error, ");
                    objNewInstance = null;
                }
            } else {
                try {
                    objNewInstance = constructor2.newInstance(null);
                    if (this.f8467) {
                        mo5466(objNewInstance);
                    }
                } catch (IllegalAccessException e2) {
                    e = e2;
                    C7547.m12775("create instance error, ", cls, e);
                    objNewInstance = null;
                } catch (InstantiationException e3) {
                    e = e3;
                    C7547.m12775("create instance error, ", cls, e);
                    objNewInstance = null;
                } catch (InvocationTargetException e4) {
                    e = e4;
                    C7547.m12775("create instance error, ", cls, e);
                    objNewInstance = null;
                }
            }
            if (!this.f8467) {
                return objNewInstance;
            }
            mo5466(objNewInstance);
            return objNewInstance;
        } catch (Exception e5) {
            this.f8451 = true;
            Constructor constructor3 = this.f8452;
            if (constructor3 == null) {
                C2942.m6401("create instance error, ", this.f8450, e5);
                return null;
            }
            try {
                Object objNewInstance3 = constructor3.newInstance(null);
                if (this.f8467) {
                    mo5466(objNewInstance3);
                }
                return objNewInstance3;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
                C2942.m6401("create instance error, ", this.f8450, e6);
                return null;
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo5578(Object obj, String str, Object obj2, long j) {
        AbstractC2762 abstractC2762Mo5464;
        Class cls;
        AbstractC2762 abstractC2762 = this.f8463;
        if (abstractC2762 != null && obj != null) {
            abstractC2762.mo5483(obj, str, obj2);
            return;
        }
        if (str.startsWith("is") && (abstractC2762Mo5464 = mo5464(AbstractC2860.m5773(str.substring(2)))) != null && ((cls = abstractC2762Mo5464.f8429) == Boolean.class || cls == Boolean.TYPE)) {
            abstractC2762Mo5464.mo5471(obj, obj2);
        } else {
            if ((JSONReader$Feature.ErrorOnUnknownProperties.mask & j) == 0) {
                return;
            }
            C0276.m850("Unknown Property ".concat(str));
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public Object mo5462(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!this.f8468) {
            abstractC2899.m6156(this.f8450);
        }
        InterfaceC2788 interfaceC2788M5587 = m5587(abstractC2899, j);
        if (interfaceC2788M5587 != null) {
            return interfaceC2788M5587.mo5462(abstractC2899, type, obj, j);
        }
        Object objMo5499 = mo5499(0L);
        int iMo6232 = abstractC2899.mo6232();
        AbstractC2762[] abstractC2762Arr = this.f8457;
        if (iMo6232 == abstractC2762Arr.length) {
            for (AbstractC2762 abstractC2762 : abstractC2762Arr) {
                try {
                    abstractC2762.mo5472(abstractC2899, objMo5499);
                } catch (RuntimeException e) {
                    if (!m5577(abstractC2762)) {
                        throw e;
                    }
                }
            }
        } else {
            m5583(abstractC2899, objMo5499, iMo6232);
        }
        Function function = this.f8448;
        return function != null ? function.apply(objMo5499) : objMo5499;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2788 mo5579(C2802 c2802, long j) {
        HashMap map = this.f8454;
        if (map == null || map.size() <= 0) {
            return c2802.m5630(j);
        }
        Class cls = (Class) map.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return c2802.m5633(cls, false);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        String str;
        long j2;
        long j3;
        long j4;
        String strMo6100;
        boolean z = abstractC2899.f9199;
        C2943 c2943 = abstractC2899.f9201;
        if (z) {
            return mo5467(abstractC2899, type, obj, j);
        }
        if (abstractC2899.mo6151()) {
            abstractC2899.mo6145();
            return null;
        }
        String str2 = null;
        long j5 = this.f8447 | j;
        long jM6157 = abstractC2899.m6157(j5);
        long j6 = 0;
        if (abstractC2899.mo6169()) {
            return (JSONReader$Feature.SupportArrayToBean.mask & jM6157) != 0 ? mo5537(abstractC2899, type, obj, j) : m5585(abstractC2899, type, obj, jM6157);
        }
        if (!abstractC2899.mo6148()) {
            char c = abstractC2899.f9193;
            if (c == 't' || c == 'f') {
                abstractC2899.mo6108();
                return null;
            }
            if (c != '\"' && c != '\'' && c != '}') {
                C0276.m850(abstractC2899.mo6170(null));
                return null;
            }
        }
        int i = 0;
        Object objApply = null;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            c2943.getClass();
            if (i == 0 && jMo6129 == this.f8458) {
                long j7 = c2943.f9320 | j5;
                str = str2;
                j4 = j6;
                if ((JSONReader$Feature.SupportAutoType.mask & j7) == j4) {
                    j2 = jM6157;
                    j3 = j5;
                } else {
                    InterfaceC2788 interfaceC2788Mo5586 = mo5586(c2943, abstractC2899.mo6239());
                    if (interfaceC2788Mo5586 == null) {
                        String strMo61002 = abstractC2899.mo6100();
                        j2 = jM6157;
                        InterfaceC2788 interfaceC2788M5629 = ((C2802) c2943.f9318).m5629(strMo61002, this.f8450, c2943.f9320 | j7);
                        if (interfaceC2788M5629 == null) {
                            C0276.m850(abstractC2899.mo6170("No suitable ObjectReader found for " + strMo61002));
                            return str;
                        }
                        strMo6100 = strMo61002;
                        interfaceC2788Mo5586 = interfaceC2788M5629;
                    } else {
                        j2 = jM6157;
                        strMo6100 = str;
                    }
                    if (interfaceC2788Mo5586 != this) {
                        AbstractC2762 abstractC2762Mo5465 = interfaceC2788Mo5586.mo5465(jMo6129);
                        if (abstractC2762Mo5465 != null && strMo6100 == null) {
                            strMo6100 = abstractC2899.mo6100();
                        }
                        String str3 = strMo6100;
                        Object objMo5463 = interfaceC2788Mo5586.mo5463(abstractC2899, null, null, j5);
                        if (abstractC2762Mo5465 != null) {
                            abstractC2762Mo5465.mo5471(objMo5463, str3);
                        }
                        return objMo5463;
                    }
                    j3 = j5;
                    i++;
                    j5 = j3;
                    str2 = str;
                    j6 = j4;
                    jM6157 = j2;
                }
            } else {
                str = str2;
                j2 = jM6157;
                j3 = j5;
                j4 = j6;
            }
            AbstractC2762 abstractC2762Mo54652 = mo5465(jMo6129);
            if (abstractC2762Mo54652 == null && abstractC2899.m6171(j3)) {
                abstractC2762Mo54652 = mo5464(abstractC2899.mo6106());
            }
            if (objApply == null) {
                objApply = mo5499(c2943.f9320 | j);
            }
            if (abstractC2762Mo54652 == null) {
                m5581(abstractC2899, objApply);
            } else {
                abstractC2762Mo54652.mo5472(abstractC2899, objApply);
            }
            i++;
            j5 = j3;
            str2 = str;
            j6 = j4;
            jM6157 = j2;
        }
        if (objApply == null && (objApply = mo5499(c2943.f9320 | j)) != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6157) != j6) {
            m5582(objApply);
        }
        abstractC2899.mo6145();
        Function function = this.f8448;
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = this.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo5580() {
        return this.f8458;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo5469(Collection collection, long j) {
        Object objMo5499 = mo5499(0L);
        int i = 0;
        for (Object obj : collection) {
            AbstractC2762[] abstractC2762Arr = this.f8457;
            if (i >= abstractC2762Arr.length) {
                break;
            }
            abstractC2762Arr[i].mo5471(objMo5499, obj);
            i++;
        }
        return objMo5499;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8450;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public AbstractC2762 mo5464(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f8459, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f8457[this.f8460[iBinarySearch]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m5581(AbstractC2899 abstractC2899, Object obj) {
        AbstractC2762 abstractC2762Mo5464;
        Class cls;
        if ((abstractC2899.m6157(this.f8447) & JSONReader$Feature.SupportSmartMatch.mask) != 0) {
            String strMo6104 = abstractC2899.mo6104();
            if (strMo6104.startsWith("is") && (abstractC2762Mo5464 = mo5464(AbstractC2860.m5773(strMo6104.substring(2)))) != null && obj != null && ((cls = abstractC2762Mo5464.f8429) == Boolean.class || cls == Boolean.TYPE)) {
                abstractC2762Mo5464.mo5472(abstractC2899, obj);
                return;
            }
        }
        AbstractC2762 abstractC2762 = this.f8463;
        if (abstractC2762 != null && obj != null) {
            abstractC2762.mo5484(abstractC2899, obj);
            return;
        }
        abstractC2899.f9201.getClass();
        if ((abstractC2899.m6157(0L) & JSONReader$Feature.ErrorOnUnknownProperties.mask) == 0) {
            abstractC2899.mo6233();
        } else {
            C0276.m841(abstractC2899.mo6104(), "Unknown Property ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m5582(Object obj) {
        int i = 0;
        while (true) {
            AbstractC2762[] abstractC2762Arr = this.f8457;
            if (i >= abstractC2762Arr.length) {
                return;
            }
            AbstractC2762 abstractC2762 = abstractC2762Arr[i];
            if (abstractC2762.f8429 == String.class) {
                abstractC2762.mo5471(obj, "");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m5583(AbstractC2899 abstractC2899, Object obj, int i) {
        int i2 = 0;
        while (true) {
            AbstractC2762[] abstractC2762Arr = this.f8457;
            if (i2 >= abstractC2762Arr.length) {
                for (int length = abstractC2762Arr.length; length < i; length++) {
                    abstractC2899.mo6233();
                }
                return;
            }
            if (i2 < i) {
                AbstractC2762 abstractC2762 = abstractC2762Arr[i2];
                try {
                    abstractC2762.mo5472(abstractC2899, obj);
                } catch (RuntimeException e) {
                    if (!m5577(abstractC2762)) {
                        throw e;
                    }
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String mo5584() {
        return this.f8466;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object m5585(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        String str = "expect {, but [, class " + this.f8446;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String strMo6170 = abstractC2899.mo6170(str);
        if ((abstractC2899.m6157(j) & JSONReader$Feature.SupportSmartMatch.mask) != 0) {
            if (type == null) {
                type = this.f8450;
            }
            List listMo6122 = abstractC2899.mo6122(type);
            if (listMo6122 != null) {
                if (listMo6122.size() == 0) {
                    return null;
                }
                if (listMo6122.size() == 1) {
                    return listMo6122.get(0);
                }
            }
        }
        C0276.m850(strMo6170);
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public AbstractC2762 mo5465(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f8461, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f8457[this.f8462[iBinarySearch]];
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Function mo5503() {
        return this.f8448;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo5466(Object obj) {
        int i = 0;
        while (true) {
            AbstractC2762[] abstractC2762Arr = this.f8457;
            if (i >= abstractC2762Arr.length) {
                return;
            }
            AbstractC2762 abstractC2762 = abstractC2762Arr[i];
            Object obj2 = abstractC2762.f8415;
            if (obj2 != null) {
                abstractC2762.mo5471(obj, obj2);
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2788 mo5586(C2943 c2943, long j) {
        HashMap map = this.f8454;
        if (map == null || map.size() <= 0) {
            return ((C2802) c2943.f9318).m5630(j);
        }
        Class cls = (Class) map.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return c2943.m6411(cls);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public Object mo5537(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.f9199) {
            return mo5462(abstractC2899, type, obj, j);
        }
        if (!this.f8468) {
            abstractC2899.m6156(this.f8450);
        }
        abstractC2899.mo6141();
        Object obj2 = this.f8449.get();
        int i = 0;
        while (true) {
            AbstractC2762[] abstractC2762Arr = this.f8457;
            if (i >= abstractC2762Arr.length) {
                if (!abstractC2899.mo6142()) {
                    C0276.m850(abstractC2899.mo6170("array to bean end error"));
                    return null;
                }
                abstractC2899.mo6145();
                Function function = this.f8448;
                return function != null ? function.apply(obj2) : obj2;
            }
            AbstractC2762 abstractC2762 = abstractC2762Arr[i];
            try {
                abstractC2762.mo5472(abstractC2899, obj2);
            } catch (RuntimeException e) {
                if (!m5577(abstractC2762)) {
                    throw e;
                }
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        boolean zMo6133 = abstractC2899.mo6133();
        C2943 c2943 = abstractC2899.f9201;
        if (zMo6133) {
            return null;
        }
        long j2 = this.f8447 | j;
        InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(this.f8464, j2, this.f8450);
        Class cls = this.f8450;
        if (interfaceC2788Mo6164 != null && interfaceC2788Mo6164.mo5498() != cls) {
            return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
        }
        if (!this.f8468) {
            abstractC2899.m6156(cls);
        }
        if (abstractC2899.mo6169()) {
            if (abstractC2899.m6176()) {
                return mo5462(abstractC2899, type, obj, j);
            }
            C0276.m850(abstractC2899.mo6170("expect object, but " + InterfaceC2912.m6357(abstractC2899.mo6183())));
            return null;
        }
        abstractC2899.mo6148();
        int i = 0;
        Object objMo5499 = null;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == this.f8458 && i == 0) {
                InterfaceC2788 interfaceC2788Mo5586 = mo5586(c2943, abstractC2899.mo6244());
                if (interfaceC2788Mo5586 == null) {
                    String strMo6100 = abstractC2899.mo6100();
                    InterfaceC2788 interfaceC2788M6410 = c2943.m6410(null, strMo6100);
                    if (interfaceC2788M6410 == null) {
                        C0276.m850(abstractC2899.mo6170("autoType not support : " + strMo6100));
                        return null;
                    }
                    interfaceC2788Mo5586 = interfaceC2788M6410;
                }
                if (interfaceC2788Mo5586 != this) {
                    abstractC2899.f9180 = true;
                    return interfaceC2788Mo5586.mo5467(abstractC2899, type, obj, j);
                }
            } else if (jMo6129 != 0) {
                AbstractC2762 abstractC2762Mo5465 = mo5465(jMo6129);
                if (abstractC2762Mo5465 == null && abstractC2899.m6171(j2)) {
                    abstractC2762Mo5465 = mo5464(abstractC2899.mo6106());
                }
                if (abstractC2762Mo5465 == null) {
                    m5581(abstractC2899, objMo5499);
                } else {
                    if (objMo5499 == null) {
                        objMo5499 = mo5499(c2943.f9320 | j);
                    }
                    abstractC2762Mo5465.mo5472(abstractC2899, objMo5499);
                }
            }
            i++;
        }
        if (objMo5499 == null) {
            objMo5499 = mo5499(c2943.f9320 | j);
        }
        JSONSchema jSONSchema = this.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objMo5499);
        }
        return objMo5499;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2788 m5587(AbstractC2899 abstractC2899, long j) {
        if (abstractC2899.mo6132()) {
            long jMo6239 = abstractC2899.mo6239();
            C2943 c2943 = abstractC2899.f9201;
            long jM6157 = abstractC2899.m6157(this.f8447 | j);
            c2943.getClass();
            Class cls = this.f8450;
            InterfaceC2788 interfaceC2788M6101 = abstractC2899.m6101(jMo6239, j, cls);
            if (interfaceC2788M6101 == null) {
                C0276.m850(abstractC2899.mo6170("autoType not support"));
                return null;
            }
            Class clsMo5498 = interfaceC2788M6101.mo5498();
            Class cls2 = this.f8450;
            if (cls == null || clsMo5498 == null || cls.isAssignableFrom(clsMo5498)) {
                if (jMo6239 == this.f8464 || (JSONReader$Feature.SupportAutoType.mask & jM6157) == 0) {
                    interfaceC2788M6101 = null;
                }
            } else {
                if ((JSONReader$Feature.IgnoreAutoTypeNotMatch.mask & jM6157) == 0) {
                    C2942.m6397("type not match. ", this.f8446, " -> ", cls2.getName());
                    return null;
                }
                interfaceC2788M6101 = c2943.m6411(cls);
            }
            if (interfaceC2788M6101 != this && (interfaceC2788M6101 == null || interfaceC2788M6101.mo5498() != cls2)) {
                return interfaceC2788M6101;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5507(java.util.Map r18, long r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2772.mo5507(java.util.Map, long):java.lang.Object");
    }

    public C2772(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762... abstractC2762Arr) {
        this(cls, str, str2, j, jSONSchema, supplier, function, null, null, null, abstractC2762Arr);
    }
}
