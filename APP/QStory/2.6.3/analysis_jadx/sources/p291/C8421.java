package p291;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8421 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f23326 = AtomicReferenceFieldUpdater.newUpdater(C8421.class, Class.class, "飘花落叶言子世兰楪苏哲");

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f23327 = AbstractC8493.f23591.objectFieldOffset(C8421.class.getDeclaredField("飘花落叶言子世兰楪苏哲"));

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f23328;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23329;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public volatile Class f23330;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23331;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23332;

    public C8421(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23329 = (562949953421312L & j) != 0;
        if (cls == Currency.class) {
            this.f23330 = cls;
            this.f23596 = C8472.f23504;
        }
        this.f23332 = cls.isArray() || Collection.class.isAssignableFrom(cls) || cls == AtomicLongArray.class || cls == AtomicIntegerArray.class;
        this.f23331 = Number.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m14001(AbstractC2897 abstractC2897, Object obj, long j, boolean z, InterfaceC8523 interfaceC8523) {
        if (obj instanceof Map) {
            boolean z2 = abstractC2897.f9171;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String string = entry.getKey().toString();
                Object value = entry.getValue();
                if (value != null || (JSONWriter$Feature.WriteNulls.mask & j) != 0) {
                    abstractC2897.mo6031(string);
                    if (!z2) {
                        abstractC2897.mo5979();
                    }
                    if (value == null) {
                        abstractC2897.mo5967();
                    } else {
                        abstractC2897.m6077(value.getClass()).m14096(abstractC2897, value);
                    }
                }
            }
            if (z) {
                abstractC2897.m6083(obj);
                return true;
            }
        } else {
            if (!(interfaceC8523 instanceof C8524)) {
                return false;
            }
            Iterator it = ((C8524) interfaceC8523).f23713.iterator();
            while (it.hasNext()) {
                ((AbstractC8494) it.next()).mo13999(abstractC2897, obj);
            }
        }
        return true;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        Class cls2 = this.f23330;
        if (cls2 == null || this.f23596 == C8522.f23709) {
            return m14003(abstractC2897, cls);
        }
        boolean z = true;
        boolean z2 = cls2 == cls || (this.f23328 && cls2.isAssignableFrom(cls)) || ((cls2 == Map.class && cls2.isAssignableFrom(cls)) || (cls2 == List.class && cls2.isAssignableFrom(cls)));
        if (!z2 && cls2.isPrimitive()) {
            if ((cls2 != Integer.TYPE || cls != Integer.class) && ((cls2 != Long.TYPE || cls != Long.class) && ((cls2 != Boolean.TYPE || cls != Boolean.class) && ((cls2 != Short.TYPE || cls != Short.class) && ((cls2 != Byte.TYPE || cls != Byte.class) && ((cls2 != Float.TYPE || cls != Float.class) && ((cls2 != Double.TYPE || cls != Double.class) && (cls2 != Character.TYPE || cls != Character.class)))))))) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            if (this.f23596 != null) {
                return this.f23596;
            }
            InterfaceC8523 interfaceC8523M14022 = Map.class.isAssignableFrom(cls) ? this.f23617.isAssignableFrom(cls) ? C8462.m14022(this.f23616, null, cls) : C8462.m14023(cls) : abstractC2897.m6077(cls);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC8494.f23592;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC8523M14022) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            return interfaceC8523M14022;
        }
        Type type = this.f23616;
        Class cls3 = this.f23617;
        if (Map.class.isAssignableFrom(cls)) {
            return cls3.isAssignableFrom(cls) ? C8462.m14022(type, null, cls) : C8462.m14023(cls);
        }
        String str = this.f23614;
        InterfaceC8523 interfaceC8523M14076 = str != null ? AbstractC8494.m14076(type, cls3, str, null, cls) : null;
        return interfaceC8523M14076 == null ? abstractC2897.m6077(cls) : interfaceC8523M14076;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8523 mo14002() {
        return this.f23596;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8523 m14003(AbstractC2897 abstractC2897, Class cls) {
        InterfaceC8523 c8454;
        if (AbstractC2865.m5800(cls) && "$super$".equals(this.f23618)) {
            C2895 c2895 = abstractC2897.f9178;
            InterfaceC8523 interfaceC8523M14106 = c2895.f9154.m14106(this.f23616, this.f23617, ((this.f23611 | c2895.f9153) & JSONWriter$Feature.FieldBased.mask) != 0);
            if (this.f23596 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23326;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = AbstractC8493.f23591;
                    long j = f23327;
                    if (unsafe.compareAndSwapObject(this, j, (Object) null, cls)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AbstractC8494.f23592;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, interfaceC8523M14106) && atomicReferenceFieldUpdater2.get(this) == null) {
                        }
                    } else if (unsafe.getObjectVolatile(this, j) != null) {
                        break;
                    }
                }
            }
            return interfaceC8523M14106;
        }
        Class cls2 = cls;
        if (this.f23614 == null) {
            C2895 c28952 = abstractC2897.f9178;
            boolean z = ((this.f23611 | c28952.f9153) & JSONWriter$Feature.FieldBased.mask) != 0;
            C8539 c8539 = c28952.f9154;
            c8454 = z ? (InterfaceC8523) c8539.f23784.get(cls) : (InterfaceC8523) c8539.f23785.get(cls);
        } else {
            c8454 = null;
        }
        DecimalFormat decimalFormat = this.f23612;
        if (cls2 == Float[].class) {
            c8454 = decimalFormat != null ? new C8519(Float.class, decimalFormat) : C8519.f23690;
        } else if (cls2 == Double[].class) {
            c8454 = decimalFormat != null ? new C8519(Double.class, decimalFormat) : C8519.f23691;
        } else if (cls2 == float[].class) {
            c8454 = decimalFormat != null ? new C8457(decimalFormat) : C8457.f23418;
        } else if (cls2 == double[].class) {
            c8454 = decimalFormat != null ? new C8454(decimalFormat) : C8454.f23406;
        }
        if (c8454 == null) {
            c8454 = AbstractC8494.m14076(this.f23616, this.f23617, this.f23614, this.f23615, cls);
        }
        InterfaceC8523 interfaceC8523 = c8454;
        if (interfaceC8523 != null) {
            if (this.f23596 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f23326;
                while (true) {
                    atomicReferenceFieldUpdater3.getClass();
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    long j2 = f23327;
                    if (unsafe2.compareAndSwapObject(this, j2, (Object) null, cls)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = AbstractC8494.f23592;
                        while (!atomicReferenceFieldUpdater4.compareAndSet(this, null, interfaceC8523) && atomicReferenceFieldUpdater4.get(this) == null) {
                        }
                    } else if (unsafe2.getObjectVolatile(this, j2) != null) {
                        break;
                    }
                }
            }
            return interfaceC8523;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5 = f23326;
        while (true) {
            atomicReferenceFieldUpdater5.getClass();
            Unsafe unsafe3 = AbstractC8493.f23591;
            long j3 = f23327;
            if (unsafe3.compareAndSwapObject(this, j3, (Object) null, cls2)) {
                z = true;
                break;
            }
            if (unsafe3.getObjectVolatile(this, j3) != null) {
                break;
            }
            cls2 = cls;
        }
        InterfaceC8523 interfaceC8523M6077 = abstractC2897.m6077(cls);
        if (z) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater6 = AbstractC8494.f23592;
            while (!atomicReferenceFieldUpdater6.compareAndSet(this, null, interfaceC8523M6077) && atomicReferenceFieldUpdater6.get(this) == null) {
            }
        }
        return interfaceC8523M6077;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13998(AbstractC2897 abstractC2897, Object obj) {
        InterfaceC8523 interfaceC8523M6077;
        AbstractC2897 abstractC28972;
        Object objMo13995 = mo13995(obj);
        if (objMo13995 == null) {
            abstractC2897.mo5967();
            return;
        }
        Class<?> cls = objMo13995.getClass();
        if (this.f23330 == null) {
            this.f23330 = cls;
            interfaceC8523M6077 = abstractC2897.m6077(cls);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC8494.f23592;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC8523M6077) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        } else {
            interfaceC8523M6077 = this.f23330 == cls ? this.f23596 : abstractC2897.m6077(cls);
        }
        if (interfaceC8523M6077 == null) {
            C0276.m850(AbstractC0053.m154(cls, "get value writer error, valueType : "));
            return;
        }
        boolean z = abstractC2897.m6072() && !C8539.m14105(cls);
        if (z) {
            if (objMo13995 == obj) {
                abstractC2897.mo6020("..");
                return;
            }
            String strM6087 = abstractC2897.m6087(objMo13995, this.f23618);
            if (strM6087 != null) {
                abstractC2897.mo6020(strM6087);
                abstractC2897.m6083(objMo13995);
                return;
            }
        }
        if (abstractC2897.f9171) {
            boolean zM6079 = abstractC2897.m6079();
            String str = this.f23618;
            Class cls2 = this.f23617;
            if (zM6079) {
                InterfaceC8523 interfaceC8523 = interfaceC8523M6077;
                abstractC28972 = abstractC2897;
                interfaceC8523.mo14018(abstractC28972, objMo13995, cls2, this.f23611);
            } else {
                InterfaceC8523 interfaceC85232 = interfaceC8523M6077;
                abstractC28972 = abstractC2897;
                interfaceC85232.mo5678(abstractC28972, objMo13995, str, cls2, this.f23611);
            }
        } else {
            InterfaceC8523 interfaceC85233 = interfaceC8523M6077;
            abstractC28972 = abstractC2897;
            interfaceC85233.mo5679(abstractC28972, objMo13995, this.f23618, this.f23617, this.f23611);
        }
        if (z) {
            abstractC28972.m6083(objMo13995);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo14004() {
        return this.f23329;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e A[PHI: r16
  0x008e: PHI (r16v2 long) = (r16v3 long), (r16v4 long), (r16v4 long) binds: [B:25:0x005e, B:20:0x0050, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo13999(com.alibaba.fastjson2.AbstractC2897 r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8421.mo13999(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object):boolean");
    }
}
