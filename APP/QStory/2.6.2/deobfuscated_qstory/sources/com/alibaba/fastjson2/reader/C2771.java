package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
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
import p144.C7546;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2771 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f8444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Supplier f8447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8448;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile boolean f8449;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Constructor f8450;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Class f8451;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final HashMap f8452;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Class[] f8453;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final String[] f8454;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC2761[] f8455;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f8456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long[] f8457;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final short[] f8458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final long[] f8459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short[] f8460;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC2761 f8461;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8462;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final JSONSchema f8463;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final String f8464;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f8465;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f8466;

    public C2771(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, AbstractC2761... abstractC2761Arr) {
        AbstractC2761 abstractC2761;
        String strM5898 = (str2 != null || cls == null) ? str2 : AbstractC2866.m5898(cls);
        this.f8448 = cls;
        this.f8447 = supplier;
        this.f8446 = function;
        this.f8445 = j;
        this.f8444 = strM5898;
        this.f8462 = strM5898 != null ? AbstractC2859.m5729(strM5898) : 0L;
        this.f8463 = jSONSchema;
        this.f8466 = cls != null && Serializable.class.isAssignableFrom(cls);
        Constructor constructorM5767 = cls == null ? null : AbstractC2864.m5767(cls, true);
        this.f8450 = constructorM5767;
        if (constructorM5767 != null) {
            constructorM5767.setAccessible(true);
        }
        if (str == null || str.isEmpty()) {
            this.f8464 = "@type";
            this.f8456 = InterfaceC2787.f8584;
        } else {
            this.f8464 = str;
            this.f8456 = AbstractC2859.m5729(str);
        }
        this.f8455 = abstractC2761Arr;
        int length = abstractC2761Arr.length;
        long[] jArr = new long[length];
        int length2 = abstractC2761Arr.length;
        long[] jArr2 = new long[length2];
        for (int i = 0; i < abstractC2761Arr.length; i++) {
            AbstractC2761 abstractC27612 = abstractC2761Arr[i];
            jArr[i] = abstractC27612.f8409;
            jArr2[i] = abstractC27612.f8408;
            if ((abstractC27612.f8420 & 562949953421312L) != 0 && ((abstractC2761 = this.f8461) == null || !(abstractC2761 instanceof C2760))) {
                this.f8461 = abstractC27612;
            }
            if (abstractC27612.f8413 != null) {
                this.f8465 = true;
            }
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.f8459 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.f8460 = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f8460[Arrays.binarySearch(this.f8459, jArr[i2])] = (short) i2;
        }
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, length2);
        this.f8457 = jArrCopyOf2;
        Arrays.sort(jArrCopyOf2);
        this.f8458 = new short[jArrCopyOf2.length];
        for (int i3 = 0; i3 < length2; i3++) {
            this.f8458[Arrays.binarySearch(this.f8457, jArr2[i3])] = (short) i3;
        }
        this.f8453 = clsArr;
        if (clsArr != null) {
            this.f8452 = new HashMap(clsArr.length, 1.0f);
            this.f8454 = new String[clsArr.length];
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                Class cls3 = clsArr[i4];
                String simpleName = (strArr == null || strArr.length < i4 + 1) ? null : strArr[i4];
                if (simpleName == null || simpleName.isEmpty()) {
                    simpleName = cls3.getSimpleName();
                }
                this.f8452.put(Long.valueOf(AbstractC2859.m5729(simpleName)), cls3);
                this.f8454[i4] = simpleName;
            }
        } else {
            this.f8452 = null;
            this.f8454 = null;
        }
        this.f8451 = cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m5532(AbstractC2761 abstractC2761) {
        return (abstractC2761.f8420 & JSONReader$Feature.NullOnError.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    public final long getFeatures() {
        return this.f8445;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo5454(long j) {
        Object objNewInstance;
        Constructor constructor;
        if (this.f8449 && (constructor = this.f8450) != null) {
            try {
                Object objNewInstance2 = constructor.newInstance(null);
                if (this.f8465) {
                    mo5421(objNewInstance2);
                }
                return objNewInstance2;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                C2941.m6343("create instance error, ", this.f8448, e);
                return null;
            }
        }
        try {
            Class cls = this.f8448;
            Constructor constructor2 = this.f8450;
            if ((j & JSONReader$Feature.UseDefaultConstructorAsPossible.mask) == 0 || constructor2 == null || constructor2.getParameterCount() != 0) {
                Supplier supplier = this.f8447;
                if (supplier != null) {
                    objNewInstance = supplier.get();
                } else {
                    C2941.m6346(cls, "create instance error, ");
                    objNewInstance = null;
                }
            } else {
                try {
                    objNewInstance = constructor2.newInstance(null);
                    if (this.f8465) {
                        mo5421(objNewInstance);
                    }
                } catch (IllegalAccessException e2) {
                    e = e2;
                    C7546.m12746("create instance error, ", cls, e);
                    objNewInstance = null;
                } catch (InstantiationException e3) {
                    e = e3;
                    C7546.m12746("create instance error, ", cls, e);
                    objNewInstance = null;
                } catch (InvocationTargetException e4) {
                    e = e4;
                    C7546.m12746("create instance error, ", cls, e);
                    objNewInstance = null;
                }
            }
            if (!this.f8465) {
                return objNewInstance;
            }
            mo5421(objNewInstance);
            return objNewInstance;
        } catch (Exception e5) {
            this.f8449 = true;
            Constructor constructor3 = this.f8450;
            if (constructor3 == null) {
                C2941.m6343("create instance error, ", this.f8448, e5);
                return null;
            }
            try {
                Object objNewInstance3 = constructor3.newInstance(null);
                if (this.f8465) {
                    mo5421(objNewInstance3);
                }
                return objNewInstance3;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
                C2941.m6343("create instance error, ", this.f8448, e6);
                return null;
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo5533(Object obj, String str, Object obj2, long j) {
        AbstractC2761 abstractC2761Mo5419;
        Class cls;
        AbstractC2761 abstractC2761 = this.f8461;
        if (abstractC2761 != null && obj != null) {
            abstractC2761.mo5438(obj, str, obj2);
            return;
        }
        if (str.startsWith("is") && (abstractC2761Mo5419 = mo5419(AbstractC2859.m5728(str.substring(2)))) != null && ((cls = abstractC2761Mo5419.f8427) == Boolean.class || cls == Boolean.TYPE)) {
            abstractC2761Mo5419.mo5426(obj, obj2);
        } else {
            if ((JSONReader$Feature.ErrorOnUnknownProperties.mask & j) == 0) {
                return;
            }
            C0276.m849("Unknown Property ".concat(str));
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public Object mo5417(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!this.f8466) {
            abstractC2898.m6112(this.f8448);
        }
        InterfaceC2787 interfaceC2787M5542 = m5542(abstractC2898, j);
        if (interfaceC2787M5542 != null) {
            return interfaceC2787M5542.mo5417(abstractC2898, type, obj, j);
        }
        Object objMo5454 = mo5454(0L);
        int iMo6187 = abstractC2898.mo6187();
        AbstractC2761[] abstractC2761Arr = this.f8455;
        if (iMo6187 == abstractC2761Arr.length) {
            for (AbstractC2761 abstractC2761 : abstractC2761Arr) {
                try {
                    abstractC2761.mo5427(abstractC2898, objMo5454);
                } catch (RuntimeException e) {
                    if (!m5532(abstractC2761)) {
                        throw e;
                    }
                }
            }
        } else {
            m5538(abstractC2898, objMo5454, iMo6187);
        }
        Function function = this.f8446;
        return function != null ? function.apply(objMo5454) : objMo5454;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2787 mo5534(C2801 c2801, long j) {
        HashMap map = this.f8452;
        if (map == null || map.size() <= 0) {
            return c2801.m5585(j);
        }
        Class cls = (Class) map.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return c2801.m5588(cls, false);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        String str;
        long j2;
        long j3;
        long j4;
        String strMo6055;
        boolean z = abstractC2898.f9197;
        C2942 c2942 = abstractC2898.f9199;
        if (z) {
            return mo5422(abstractC2898, type, obj, j);
        }
        if (abstractC2898.mo6105()) {
            abstractC2898.mo6099();
            return null;
        }
        String str2 = null;
        long j5 = this.f8445 | j;
        long jM6110 = abstractC2898.m6110(j5);
        long j6 = 0;
        if (abstractC2898.mo6123()) {
            return (JSONReader$Feature.SupportArrayToBean.mask & jM6110) != 0 ? mo5492(abstractC2898, type, obj, j) : m5540(abstractC2898, type, obj, jM6110);
        }
        if (!abstractC2898.mo6102()) {
            char c = abstractC2898.f9191;
            if (c == 't' || c == 'f') {
                abstractC2898.mo6062();
                return null;
            }
            if (c != '\"' && c != '\'' && c != '}') {
                C0276.m849(abstractC2898.mo6124(null));
                return null;
            }
        }
        int i = 0;
        Object objApply = null;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            c2942.getClass();
            if (i == 0 && jMo6083 == this.f8456) {
                long j7 = c2942.f9318 | j5;
                str = str2;
                j4 = j6;
                if ((JSONReader$Feature.SupportAutoType.mask & j7) == j4) {
                    j2 = jM6110;
                    j3 = j5;
                } else {
                    InterfaceC2787 interfaceC2787Mo5541 = mo5541(c2942, abstractC2898.mo6194());
                    if (interfaceC2787Mo5541 == null) {
                        String strMo60552 = abstractC2898.mo6055();
                        j2 = jM6110;
                        InterfaceC2787 interfaceC2787M5584 = ((C2801) c2942.f9316).m5584(strMo60552, this.f8448, c2942.f9318 | j7);
                        if (interfaceC2787M5584 == null) {
                            C0276.m849(abstractC2898.mo6124("No suitable ObjectReader found for " + strMo60552));
                            return str;
                        }
                        strMo6055 = strMo60552;
                        interfaceC2787Mo5541 = interfaceC2787M5584;
                    } else {
                        j2 = jM6110;
                        strMo6055 = str;
                    }
                    if (interfaceC2787Mo5541 != this) {
                        AbstractC2761 abstractC2761Mo5420 = interfaceC2787Mo5541.mo5420(jMo6083);
                        if (abstractC2761Mo5420 != null && strMo6055 == null) {
                            strMo6055 = abstractC2898.mo6055();
                        }
                        String str3 = strMo6055;
                        Object objMo5418 = interfaceC2787Mo5541.mo5418(abstractC2898, null, null, j5);
                        if (abstractC2761Mo5420 != null) {
                            abstractC2761Mo5420.mo5426(objMo5418, str3);
                        }
                        return objMo5418;
                    }
                    j3 = j5;
                    i++;
                    j5 = j3;
                    str2 = str;
                    j6 = j4;
                    jM6110 = j2;
                }
            } else {
                str = str2;
                j2 = jM6110;
                j3 = j5;
                j4 = j6;
            }
            AbstractC2761 abstractC2761Mo54202 = mo5420(jMo6083);
            if (abstractC2761Mo54202 == null && abstractC2898.m6125(j3)) {
                abstractC2761Mo54202 = mo5419(abstractC2898.mo6060());
            }
            if (objApply == null) {
                objApply = mo5454(c2942.f9318 | j);
            }
            if (abstractC2761Mo54202 == null) {
                m5536(abstractC2898, objApply);
            } else {
                abstractC2761Mo54202.mo5427(abstractC2898, objApply);
            }
            i++;
            j5 = j3;
            str2 = str;
            j6 = j4;
            jM6110 = j2;
        }
        if (objApply == null && (objApply = mo5454(c2942.f9318 | j)) != null && (JSONReader$Feature.InitStringFieldAsEmpty.mask & jM6110) != j6) {
            m5537(objApply);
        }
        abstractC2898.mo6099();
        Function function = this.f8446;
        if (function != null) {
            objApply = function.apply(objApply);
        }
        JSONSchema jSONSchema = this.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objApply);
        }
        return objApply;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo5535() {
        return this.f8456;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo5424(Collection collection, long j) {
        Object objMo5454 = mo5454(0L);
        int i = 0;
        for (Object obj : collection) {
            AbstractC2761[] abstractC2761Arr = this.f8455;
            if (i >= abstractC2761Arr.length) {
                break;
            }
            abstractC2761Arr[i].mo5426(objMo5454, obj);
            i++;
        }
        return objMo5454;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8448;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public AbstractC2761 mo5419(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f8457, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f8455[this.f8458[iBinarySearch]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m5536(AbstractC2898 abstractC2898, Object obj) {
        AbstractC2761 abstractC2761Mo5419;
        Class cls;
        if ((abstractC2898.m6110(this.f8445) & JSONReader$Feature.SupportSmartMatch.mask) != 0) {
            String strMo6058 = abstractC2898.mo6058();
            if (strMo6058.startsWith("is") && (abstractC2761Mo5419 = mo5419(AbstractC2859.m5728(strMo6058.substring(2)))) != null && obj != null && ((cls = abstractC2761Mo5419.f8427) == Boolean.class || cls == Boolean.TYPE)) {
                abstractC2761Mo5419.mo5427(abstractC2898, obj);
                return;
            }
        }
        AbstractC2761 abstractC2761 = this.f8461;
        if (abstractC2761 != null && obj != null) {
            abstractC2761.mo5439(abstractC2898, obj);
            return;
        }
        abstractC2898.f9199.getClass();
        if ((abstractC2898.m6110(0L) & JSONReader$Feature.ErrorOnUnknownProperties.mask) == 0) {
            abstractC2898.mo6188();
        } else {
            C0276.m840(abstractC2898.mo6058(), "Unknown Property ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m5537(Object obj) {
        int i = 0;
        while (true) {
            AbstractC2761[] abstractC2761Arr = this.f8455;
            if (i >= abstractC2761Arr.length) {
                return;
            }
            AbstractC2761 abstractC2761 = abstractC2761Arr[i];
            if (abstractC2761.f8427 == String.class) {
                abstractC2761.mo5426(obj, "");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m5538(AbstractC2898 abstractC2898, Object obj, int i) {
        int i2 = 0;
        while (true) {
            AbstractC2761[] abstractC2761Arr = this.f8455;
            if (i2 >= abstractC2761Arr.length) {
                for (int length = abstractC2761Arr.length; length < i; length++) {
                    abstractC2898.mo6188();
                }
                return;
            }
            if (i2 < i) {
                AbstractC2761 abstractC2761 = abstractC2761Arr[i2];
                try {
                    abstractC2761.mo5427(abstractC2898, obj);
                } catch (RuntimeException e) {
                    if (!m5532(abstractC2761)) {
                        throw e;
                    }
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final String mo5539() {
        return this.f8464;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object m5540(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        String str = "expect {, but [, class " + this.f8444;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String strMo6124 = abstractC2898.mo6124(str);
        if ((abstractC2898.m6110(j) & JSONReader$Feature.SupportSmartMatch.mask) != 0) {
            if (type == null) {
                type = this.f8448;
            }
            List listMo6076 = abstractC2898.mo6076(type);
            if (listMo6076 != null) {
                if (listMo6076.size() == 0) {
                    return null;
                }
                if (listMo6076.size() == 1) {
                    return listMo6076.get(0);
                }
            }
        }
        C0276.m849(strMo6124);
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public AbstractC2761 mo5420(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f8459, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f8455[this.f8460[iBinarySearch]];
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Function mo5458() {
        return this.f8446;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo5421(Object obj) {
        int i = 0;
        while (true) {
            AbstractC2761[] abstractC2761Arr = this.f8455;
            if (i >= abstractC2761Arr.length) {
                return;
            }
            AbstractC2761 abstractC2761 = abstractC2761Arr[i];
            Object obj2 = abstractC2761.f8413;
            if (obj2 != null) {
                abstractC2761.mo5426(obj, obj2);
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2787 mo5541(C2942 c2942, long j) {
        HashMap map = this.f8452;
        if (map == null || map.size() <= 0) {
            return ((C2801) c2942.f9316).m5585(j);
        }
        Class cls = (Class) map.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        return c2942.m6353(cls);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public Object mo5492(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.f9197) {
            return mo5417(abstractC2898, type, obj, j);
        }
        if (!this.f8466) {
            abstractC2898.m6112(this.f8448);
        }
        abstractC2898.mo6095();
        Object obj2 = this.f8447.get();
        int i = 0;
        while (true) {
            AbstractC2761[] abstractC2761Arr = this.f8455;
            if (i >= abstractC2761Arr.length) {
                if (!abstractC2898.mo6096()) {
                    C0276.m849(abstractC2898.mo6124("array to bean end error"));
                    return null;
                }
                abstractC2898.mo6099();
                Function function = this.f8446;
                return function != null ? function.apply(obj2) : obj2;
            }
            AbstractC2761 abstractC2761 = abstractC2761Arr[i];
            try {
                abstractC2761.mo5427(abstractC2898, obj2);
            } catch (RuntimeException e) {
                if (!m5532(abstractC2761)) {
                    throw e;
                }
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        boolean zMo6087 = abstractC2898.mo6087();
        C2942 c2942 = abstractC2898.f9199;
        if (zMo6087) {
            return null;
        }
        long j2 = this.f8445 | j;
        InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(this.f8462, j2, this.f8448);
        Class cls = this.f8448;
        if (interfaceC2787Mo6118 != null && interfaceC2787Mo6118.mo5453() != cls) {
            return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
        }
        if (!this.f8466) {
            abstractC2898.m6112(cls);
        }
        if (abstractC2898.mo6123()) {
            if (abstractC2898.m6130()) {
                return mo5417(abstractC2898, type, obj, j);
            }
            C0276.m849(abstractC2898.mo6124("expect object, but " + InterfaceC2911.m6299(abstractC2898.mo6138())));
            return null;
        }
        abstractC2898.mo6102();
        int i = 0;
        Object objMo5454 = null;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 == this.f8456 && i == 0) {
                InterfaceC2787 interfaceC2787Mo5541 = mo5541(c2942, abstractC2898.mo6199());
                if (interfaceC2787Mo5541 == null) {
                    String strMo6055 = abstractC2898.mo6055();
                    InterfaceC2787 interfaceC2787M6352 = c2942.m6352(null, strMo6055);
                    if (interfaceC2787M6352 == null) {
                        C0276.m849(abstractC2898.mo6124("autoType not support : " + strMo6055));
                        return null;
                    }
                    interfaceC2787Mo5541 = interfaceC2787M6352;
                }
                if (interfaceC2787Mo5541 != this) {
                    abstractC2898.f9178 = true;
                    return interfaceC2787Mo5541.mo5422(abstractC2898, type, obj, j);
                }
            } else if (jMo6083 != 0) {
                AbstractC2761 abstractC2761Mo5420 = mo5420(jMo6083);
                if (abstractC2761Mo5420 == null && abstractC2898.m6125(j2)) {
                    abstractC2761Mo5420 = mo5419(abstractC2898.mo6060());
                }
                if (abstractC2761Mo5420 == null) {
                    m5536(abstractC2898, objMo5454);
                } else {
                    if (objMo5454 == null) {
                        objMo5454 = mo5454(c2942.f9318 | j);
                    }
                    abstractC2761Mo5420.mo5427(abstractC2898, objMo5454);
                }
            }
            i++;
        }
        if (objMo5454 == null) {
            objMo5454 = mo5454(c2942.f9318 | j);
        }
        JSONSchema jSONSchema = this.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objMo5454);
        }
        return objMo5454;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2787 m5542(AbstractC2898 abstractC2898, long j) {
        if (abstractC2898.mo6086()) {
            long jMo6194 = abstractC2898.mo6194();
            C2942 c2942 = abstractC2898.f9199;
            long jM6110 = abstractC2898.m6110(this.f8445 | j);
            c2942.getClass();
            Class cls = this.f8448;
            InterfaceC2787 interfaceC2787M6054 = abstractC2898.m6054(jMo6194, j, cls);
            if (interfaceC2787M6054 == null) {
                C0276.m849(abstractC2898.mo6124("autoType not support"));
                return null;
            }
            Class clsMo5453 = interfaceC2787M6054.mo5453();
            Class cls2 = this.f8448;
            if (cls == null || clsMo5453 == null || cls.isAssignableFrom(clsMo5453)) {
                if (jMo6194 == this.f8462 || (JSONReader$Feature.SupportAutoType.mask & jM6110) == 0) {
                    interfaceC2787M6054 = null;
                }
            } else {
                if ((JSONReader$Feature.IgnoreAutoTypeNotMatch.mask & jM6110) == 0) {
                    C2941.m6339("type not match. ", this.f8444, " -> ", cls2.getName());
                    return null;
                }
                interfaceC2787M6054 = c2942.m6353(cls);
            }
            if (interfaceC2787M6054 != this && (interfaceC2787M6054 == null || interfaceC2787M6054.mo5453() != cls2)) {
                return interfaceC2787M6054;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5462(java.util.Map r18, long r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2771.mo5462(java.util.Map, long):java.lang.Object");
    }

    public C2771(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761... abstractC2761Arr) {
        this(cls, str, str2, j, jSONSchema, supplier, function, null, null, null, abstractC2761Arr);
    }
}
