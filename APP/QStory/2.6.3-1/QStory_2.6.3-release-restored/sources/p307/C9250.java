package p307;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3698;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPOutputStream;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9250 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f23671 = AtomicReferenceFieldUpdater.newUpdater(C9250.class, Class.class, "飘花落叶言子世兰楪苏哲");

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f23672 = AbstractC9322.f23936.objectFieldOffset(C9250.class.getDeclaredField("飘花落叶言子世兰楪苏哲"));

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f23673;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23674;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public volatile Class f23675;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23676;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23677;

    public C9250(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23674 = (562949953421312L & j) != 0;
        if (cls == Currency.class) {
            this.f23675 = cls;
            this.f23941 = C9301.f23849;
        }
        this.f23677 = cls.isArray() || Collection.class.isAssignableFrom(cls) || cls == AtomicLongArray.class || cls == AtomicIntegerArray.class;
        this.f23676 = Number.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m14560(AbstractC3730 abstractC3730, Object obj, long j, boolean z, InterfaceC9352 interfaceC9352) {
        if (obj instanceof Map) {
            boolean z2 = abstractC3730.f9516;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String string = entry.getKey().toString();
                Object value = entry.getValue();
                if (value != null || (JSONWriter$Feature.WriteNulls.mask & j) != 0) {
                    abstractC3730.mo6591(string);
                    if (!z2) {
                        abstractC3730.mo6539();
                    }
                    if (value == null) {
                        abstractC3730.mo6527();
                    } else {
                        abstractC3730.m6637(value.getClass()).m14655(abstractC3730, value);
                    }
                }
            }
            if (z) {
                abstractC3730.m6643(obj);
                return true;
            }
        } else {
            if (!(interfaceC9352 instanceof C9353)) {
                return false;
            }
            Iterator it = ((C9353) interfaceC9352).f24058.iterator();
            while (it.hasNext()) {
                ((AbstractC9323) it.next()).mo14558(abstractC3730, obj);
            }
        }
        return true;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        Class cls2 = this.f23675;
        if (cls2 == null || this.f23941 == C9351.f24054) {
            return m14562(abstractC3730, cls);
        }
        boolean z = true;
        boolean z2 = cls2 == cls || (this.f23673 && cls2.isAssignableFrom(cls)) || ((cls2 == Map.class && cls2.isAssignableFrom(cls)) || (cls2 == List.class && cls2.isAssignableFrom(cls)));
        if (!z2 && cls2.isPrimitive()) {
            if ((cls2 != Integer.TYPE || cls != Integer.class) && ((cls2 != Long.TYPE || cls != Long.class) && ((cls2 != Boolean.TYPE || cls != Boolean.class) && ((cls2 != Short.TYPE || cls != Short.class) && ((cls2 != Byte.TYPE || cls != Byte.class) && ((cls2 != Float.TYPE || cls != Float.class) && ((cls2 != Double.TYPE || cls != Double.class) && (cls2 != Character.TYPE || cls != Character.class)))))))) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            if (this.f23941 != null) {
                return this.f23941;
            }
            InterfaceC9352 interfaceC9352M14581 = Map.class.isAssignableFrom(cls) ? this.f23962.isAssignableFrom(cls) ? C9291.m14581(this.f23961, null, cls) : C9291.m14582(cls) : abstractC3730.m6637(cls);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC9323.f23937;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC9352M14581) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            return interfaceC9352M14581;
        }
        Type type = this.f23961;
        Class cls3 = this.f23962;
        if (Map.class.isAssignableFrom(cls)) {
            return cls3.isAssignableFrom(cls) ? C9291.m14581(type, null, cls) : C9291.m14582(cls);
        }
        String str = this.f23959;
        InterfaceC9352 interfaceC9352M14635 = str != null ? AbstractC9323.m14635(type, cls3, str, null, cls) : null;
        return interfaceC9352M14635 == null ? abstractC3730.m6637(cls) : interfaceC9352M14635;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC9352 mo14561() {
        return this.f23941;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC9352 m14562(AbstractC3730 abstractC3730, Class cls) {
        InterfaceC9352 c9283;
        if (AbstractC3698.m6360(cls) && "$super$".equals(this.f23963)) {
            C3728 c3728 = abstractC3730.f9523;
            InterfaceC9352 interfaceC9352M14665 = c3728.f9499.m14665(this.f23961, this.f23962, ((this.f23956 | c3728.f9498) & JSONWriter$Feature.FieldBased.mask) != 0);
            if (this.f23941 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23671;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = AbstractC9322.f23936;
                    long j = f23672;
                    if (unsafe.compareAndSwapObject(this, j, (Object) null, cls)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AbstractC9323.f23937;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, interfaceC9352M14665) && atomicReferenceFieldUpdater2.get(this) == null) {
                        }
                    } else if (unsafe.getObjectVolatile(this, j) != null) {
                        break;
                    }
                }
            }
            return interfaceC9352M14665;
        }
        Class cls2 = cls;
        if (this.f23959 == null) {
            C3728 c37282 = abstractC3730.f9523;
            boolean z = ((this.f23956 | c37282.f9498) & JSONWriter$Feature.FieldBased.mask) != 0;
            C9368 c9368 = c37282.f9499;
            c9283 = z ? (InterfaceC9352) c9368.f24129.get(cls) : (InterfaceC9352) c9368.f24130.get(cls);
        } else {
            c9283 = null;
        }
        DecimalFormat decimalFormat = this.f23957;
        if (cls2 == Float[].class) {
            c9283 = decimalFormat != null ? new C9348(Float.class, decimalFormat) : C9348.f24035;
        } else if (cls2 == Double[].class) {
            c9283 = decimalFormat != null ? new C9348(Double.class, decimalFormat) : C9348.f24036;
        } else if (cls2 == float[].class) {
            c9283 = decimalFormat != null ? new C9286(decimalFormat) : C9286.f23763;
        } else if (cls2 == double[].class) {
            c9283 = decimalFormat != null ? new C9283(decimalFormat) : C9283.f23751;
        }
        if (c9283 == null) {
            c9283 = AbstractC9323.m14635(this.f23961, this.f23962, this.f23959, this.f23960, cls);
        }
        InterfaceC9352 interfaceC9352 = c9283;
        if (interfaceC9352 != null) {
            if (this.f23941 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f23671;
                while (true) {
                    atomicReferenceFieldUpdater3.getClass();
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    long j2 = f23672;
                    if (unsafe2.compareAndSwapObject(this, j2, (Object) null, cls)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = AbstractC9323.f23937;
                        while (!atomicReferenceFieldUpdater4.compareAndSet(this, null, interfaceC9352) && atomicReferenceFieldUpdater4.get(this) == null) {
                        }
                    } else if (unsafe2.getObjectVolatile(this, j2) != null) {
                        break;
                    }
                }
            }
            return interfaceC9352;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5 = f23671;
        while (true) {
            atomicReferenceFieldUpdater5.getClass();
            Unsafe unsafe3 = AbstractC9322.f23936;
            long j3 = f23672;
            if (unsafe3.compareAndSwapObject(this, j3, (Object) null, cls2)) {
                z = true;
                break;
            }
            if (unsafe3.getObjectVolatile(this, j3) != null) {
                break;
            }
            cls2 = cls;
        }
        InterfaceC9352 interfaceC9352M6637 = abstractC3730.m6637(cls);
        if (z) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater6 = AbstractC9323.f23937;
            while (!atomicReferenceFieldUpdater6.compareAndSet(this, null, interfaceC9352M6637) && atomicReferenceFieldUpdater6.get(this) == null) {
            }
        }
        return interfaceC9352M6637;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo14557(AbstractC3730 abstractC3730, Object obj) {
        InterfaceC9352 interfaceC9352M6637;
        AbstractC3730 abstractC37302;
        Object objMo14554 = mo14554(obj);
        if (objMo14554 == null) {
            abstractC3730.mo6527();
            return;
        }
        Class<?> cls = objMo14554.getClass();
        if (this.f23675 == null) {
            this.f23675 = cls;
            interfaceC9352M6637 = abstractC3730.m6637(cls);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC9323.f23937;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC9352M6637) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        } else {
            interfaceC9352M6637 = this.f23675 == cls ? this.f23941 : abstractC3730.m6637(cls);
        }
        if (interfaceC9352M6637 == null) {
            C1123.m1410(AbstractC0900.m714(cls, "get value writer error, valueType : "));
            return;
        }
        boolean z = abstractC3730.m6632() && !C9368.m14664(cls);
        if (z) {
            if (objMo14554 == obj) {
                abstractC3730.mo6580("..");
                return;
            }
            String strM6647 = abstractC3730.m6647(objMo14554, this.f23963);
            if (strM6647 != null) {
                abstractC3730.mo6580(strM6647);
                abstractC3730.m6643(objMo14554);
                return;
            }
        }
        if (abstractC3730.f9516) {
            boolean zM6639 = abstractC3730.m6639();
            String str = this.f23963;
            Class cls2 = this.f23962;
            if (zM6639) {
                InterfaceC9352 interfaceC9352 = interfaceC9352M6637;
                abstractC37302 = abstractC3730;
                interfaceC9352.mo14577(abstractC37302, objMo14554, cls2, this.f23956);
            } else {
                InterfaceC9352 interfaceC93522 = interfaceC9352M6637;
                abstractC37302 = abstractC3730;
                interfaceC93522.mo6238(abstractC37302, objMo14554, str, cls2, this.f23956);
            }
        } else {
            InterfaceC9352 interfaceC93523 = interfaceC9352M6637;
            abstractC37302 = abstractC3730;
            interfaceC93523.mo6239(abstractC37302, objMo14554, this.f23963, this.f23962, this.f23956);
        }
        if (z) {
            abstractC37302.m6643(objMo14554);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo14563() {
        return this.f23674;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e A[PHI: r16
  0x008e: PHI (r16v2 long) = (r16v3 long), (r16v4 long), (r16v4 long) binds: [B:25:0x005e, B:20:0x0050, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        boolean z;
        Object obj2;
        boolean z2;
        AbstractC3730 abstractC37302;
        Field field;
        long j;
        IdentityHashMap identityHashMap;
        C3728 c3728 = abstractC3730.f9523;
        long j2 = c3728.f9498;
        long j3 = this.f23956;
        long j4 = j3 | j2;
        c3728.f9498 = j4;
        if ((this.f23953 || (JSONWriter$Feature.IgnoreNoneSerializable.mask & j4) == 0) && !(this.f23939 && (identityHashMap = abstractC3730.f9512) != null && identityHashMap.containsKey(obj))) {
            try {
                Object objMo14554 = mo14554(obj);
                Class cls = this.f23962;
                if (objMo14554 == null) {
                    long j5 = JSONWriter$Feature.WriteNulls.mask & j4;
                    boolean z3 = this.f23676;
                    if (j5 == 0) {
                        j = 0;
                        if ((JSONWriter$Feature.NullAsDefaultValue.mask & j4) == 0 || z3) {
                            long j6 = JSONWriter$Feature.WriteNullNumberAsZero.mask;
                            long j7 = JSONWriter$Feature.NullAsDefaultValue.mask;
                            if ((j4 & (j6 | j7)) == j || !z3) {
                                if ((j4 & (JSONWriter$Feature.WriteNullBooleanAsFalse.mask | j7)) != j && (cls == Boolean.class || cls == AtomicBoolean.class)) {
                                    m14637(abstractC3730);
                                    abstractC3730.mo6549(false);
                                }
                                z = false;
                            } else {
                                m14637(abstractC3730);
                                abstractC3730.mo6533(0);
                            }
                            z = true;
                        }
                    } else {
                        j = 0;
                    }
                    if ((JSONWriter$Feature.NotWriteDefaultValue.mask & j4) == j) {
                        m14637(abstractC3730);
                        if (this.f23677) {
                            abstractC3730.mo6599();
                        } else if (z3) {
                            abstractC3730.m6625();
                        } else if (cls == Appendable.class || cls == StringBuffer.class || cls == StringBuilder.class) {
                            abstractC3730.mo6608();
                        } else if (cls == Boolean.class) {
                            abstractC3730.m6628();
                        } else {
                            abstractC3730.m6626(cls);
                        }
                    }
                    z = true;
                } else {
                    if ((objMo14554 != obj || cls != Throwable.class || (field = this.f23958) == null || field.getDeclaringClass() != Throwable.class) && (((j4 & JSONWriter$Feature.IgnoreNoneSerializable.mask) == 0 || (objMo14554 instanceof Serializable)) && ((j4 & JSONWriter$Feature.IgnoreEmpty.mask) == 0 || ((!(objMo14554 instanceof Collection) || !((Collection) objMo14554).isEmpty()) && (!(objMo14554 instanceof Map) || !((Map) objMo14554).isEmpty()))))) {
                        boolean zM6633 = abstractC3730.m6633(objMo14554);
                        if (zM6633) {
                            if (objMo14554 == obj) {
                                m14637(abstractC3730);
                                abstractC3730.mo6580("..");
                            } else {
                                String strM6648 = abstractC3730.m6648(this, objMo14554);
                                if (strM6648 != null) {
                                    m14637(abstractC3730);
                                    abstractC3730.mo6580(strM6648);
                                    abstractC3730.m6643(objMo14554);
                                }
                            }
                            z = true;
                        } else {
                            Class<?> cls2 = objMo14554.getClass();
                            if (cls2 == byte[].class) {
                                byte[] bArr = (byte[]) objMo14554;
                                m14637(abstractC3730);
                                if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & j3) != 0) {
                                    abstractC3730.mo6609(bArr);
                                } else {
                                    String str = this.f23959;
                                    if ("base64".equals(str) || (str == null && (abstractC3730.m6638(j3) & JSONWriter$Feature.WriteByteArrayAsBase64.mask) != 0)) {
                                        abstractC3730.mo6548(bArr);
                                    } else if ("hex".equals(str)) {
                                        abstractC3730.mo6545(bArr);
                                    } else if ("gzip,base64".equals(str) || "gzip".equals(str)) {
                                        GZIPOutputStream gZIPOutputStream = null;
                                        try {
                                            try {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                gZIPOutputStream = bArr.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArr.length) : new GZIPOutputStream(byteArrayOutputStream);
                                                gZIPOutputStream.write(bArr);
                                                gZIPOutputStream.finish();
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                AbstractC3682.m6285(gZIPOutputStream);
                                                abstractC3730.mo6548(byteArray);
                                            } catch (Throwable th) {
                                                AbstractC3682.m6285(gZIPOutputStream);
                                                throw th;
                                            }
                                        } catch (IOException e) {
                                            throw new JSONException("write gzipBytes error", e);
                                        }
                                    } else {
                                        abstractC3730.mo6596(bArr);
                                    }
                                }
                            } else {
                                InterfaceC9352 interfaceC9352Mo14553 = mo14553(abstractC3730, cls2);
                                if (interfaceC9352Mo14553 == null) {
                                    C1123.m1410(AbstractC0900.m714(cls2, "get objectWriter error : "));
                                    return false;
                                }
                                if (this.f23674) {
                                    obj2 = objMo14554;
                                    z2 = zM6633;
                                    if (!m14560(abstractC3730, obj2, j4, zM6633, interfaceC9352Mo14553)) {
                                    }
                                } else {
                                    obj2 = objMo14554;
                                    z2 = zM6633;
                                }
                                m14637(abstractC3730);
                                boolean z4 = abstractC3730.f9516;
                                long j8 = JSONWriter$Feature.BeanToArray.mask;
                                long j9 = this.f23956;
                                long j10 = j8 & j9;
                                String str2 = this.f23963;
                                Type type = this.f23961;
                                if (j10 != 0) {
                                    if (z4) {
                                        interfaceC9352Mo14553.mo14577(abstractC3730, obj2, type, j9);
                                    } else {
                                        interfaceC9352Mo14553.mo14578(abstractC3730, obj2, str2, type, j9);
                                    }
                                    abstractC37302 = abstractC3730;
                                } else if (z4) {
                                    abstractC37302 = abstractC3730;
                                    interfaceC9352Mo14553.mo6238(abstractC37302, obj2, str2, type, j9);
                                } else {
                                    abstractC37302 = abstractC3730;
                                    interfaceC9352Mo14553.mo6239(abstractC37302, obj2, str2, type, j9);
                                }
                                if (z2) {
                                    abstractC37302.m6643(obj2);
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
            } catch (RuntimeException e2) {
                if (!abstractC3730.m6635()) {
                    throw e2;
                }
                z = false;
            }
        } else {
            z = false;
        }
        c3728.f9498 = j2;
        return z;
    }
}
