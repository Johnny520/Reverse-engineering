package p291;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2864;
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
import p383.AbstractC9032;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8429 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f23335 = AtomicReferenceFieldUpdater.newUpdater(C8429.class, Class.class, "飘花落叶言子世兰楪苏哲");

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f23336 = AbstractC8501.f23600.objectFieldOffset(C8429.class.getDeclaredField("飘花落叶言子世兰楪苏哲"));

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f23337;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23338;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public volatile Class f23339;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23340;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23341;

    public C8429(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23338 = (562949953421312L & j) != 0;
        if (cls == Currency.class) {
            this.f23339 = cls;
            this.f23605 = C8480.f23513;
        }
        this.f23341 = cls.isArray() || Collection.class.isAssignableFrom(cls) || cls == AtomicLongArray.class || cls == AtomicIntegerArray.class;
        this.f23340 = Number.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m13982(AbstractC2896 abstractC2896, Object obj, long j, boolean z, InterfaceC8531 interfaceC8531) {
        if (obj instanceof Map) {
            boolean z2 = abstractC2896.f9169;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String string = entry.getKey().toString();
                Object value = entry.getValue();
                if (value != null || (JSONWriter$Feature.WriteNulls.mask & j) != 0) {
                    abstractC2896.mo5986(string);
                    if (!z2) {
                        abstractC2896.mo5934();
                    }
                    if (value == null) {
                        abstractC2896.mo5922();
                    } else {
                        abstractC2896.m6031(value.getClass()).m14077(abstractC2896, value);
                    }
                }
            }
            if (z) {
                abstractC2896.m6037(obj);
                return true;
            }
        } else {
            if (!(interfaceC8531 instanceof C8532)) {
                return false;
            }
            Iterator it = ((C8532) interfaceC8531).f23722.iterator();
            while (it.hasNext()) {
                ((AbstractC8502) it.next()).mo13980(abstractC2896, obj);
            }
        }
        return true;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        Class cls2 = this.f23339;
        if (cls2 == null || this.f23605 == C8530.f23718) {
            return m13984(abstractC2896, cls);
        }
        boolean z = true;
        boolean z2 = cls2 == cls || (this.f23337 && cls2.isAssignableFrom(cls)) || ((cls2 == Map.class && cls2.isAssignableFrom(cls)) || (cls2 == List.class && cls2.isAssignableFrom(cls)));
        if (!z2 && cls2.isPrimitive()) {
            if ((cls2 != Integer.TYPE || cls != Integer.class) && ((cls2 != Long.TYPE || cls != Long.class) && ((cls2 != Boolean.TYPE || cls != Boolean.class) && ((cls2 != Short.TYPE || cls != Short.class) && ((cls2 != Byte.TYPE || cls != Byte.class) && ((cls2 != Float.TYPE || cls != Float.class) && ((cls2 != Double.TYPE || cls != Double.class) && (cls2 != Character.TYPE || cls != Character.class)))))))) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            if (this.f23605 != null) {
                return this.f23605;
            }
            InterfaceC8531 interfaceC8531M14003 = Map.class.isAssignableFrom(cls) ? this.f23626.isAssignableFrom(cls) ? C8470.m14003(this.f23625, null, cls) : C8470.m14004(cls) : abstractC2896.m6031(cls);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC8502.f23601;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC8531M14003) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            return interfaceC8531M14003;
        }
        Type type = this.f23625;
        Class cls3 = this.f23626;
        if (Map.class.isAssignableFrom(cls)) {
            return cls3.isAssignableFrom(cls) ? C8470.m14003(type, null, cls) : C8470.m14004(cls);
        }
        String str = this.f23623;
        InterfaceC8531 interfaceC8531M14057 = str != null ? AbstractC8502.m14057(type, cls3, str, null, cls) : null;
        return interfaceC8531M14057 == null ? abstractC2896.m6031(cls) : interfaceC8531M14057;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8531 mo13983() {
        return this.f23605;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8531 m13984(AbstractC2896 abstractC2896, Class cls) {
        InterfaceC8531 c8462;
        if (AbstractC2864.m5755(cls) && "$super$".equals(this.f23627)) {
            C2894 c2894 = abstractC2896.f9176;
            InterfaceC8531 interfaceC8531M14087 = c2894.f9152.m14087(this.f23625, this.f23626, ((this.f23620 | c2894.f9151) & JSONWriter$Feature.FieldBased.mask) != 0);
            if (this.f23605 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23335;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = AbstractC8501.f23600;
                    long j = f23336;
                    if (unsafe.compareAndSwapObject(this, j, (Object) null, cls)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AbstractC8502.f23601;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, interfaceC8531M14087) && atomicReferenceFieldUpdater2.get(this) == null) {
                        }
                    } else if (unsafe.getObjectVolatile(this, j) != null) {
                        break;
                    }
                }
            }
            return interfaceC8531M14087;
        }
        Class cls2 = cls;
        if (this.f23623 == null) {
            C2894 c28942 = abstractC2896.f9176;
            boolean z = ((this.f23620 | c28942.f9151) & JSONWriter$Feature.FieldBased.mask) != 0;
            C8547 c8547 = c28942.f9152;
            c8462 = z ? (InterfaceC8531) c8547.f23793.get(cls) : (InterfaceC8531) c8547.f23794.get(cls);
        } else {
            c8462 = null;
        }
        DecimalFormat decimalFormat = this.f23621;
        if (cls2 == Float[].class) {
            c8462 = decimalFormat != null ? new C8527(Float.class, decimalFormat) : C8527.f23699;
        } else if (cls2 == Double[].class) {
            c8462 = decimalFormat != null ? new C8527(Double.class, decimalFormat) : C8527.f23700;
        } else if (cls2 == float[].class) {
            c8462 = decimalFormat != null ? new C8465(decimalFormat) : C8465.f23427;
        } else if (cls2 == double[].class) {
            c8462 = decimalFormat != null ? new C8462(decimalFormat) : C8462.f23415;
        }
        if (c8462 == null) {
            c8462 = AbstractC8502.m14057(this.f23625, this.f23626, this.f23623, this.f23624, cls);
        }
        InterfaceC8531 interfaceC8531 = c8462;
        if (interfaceC8531 != null) {
            if (this.f23605 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f23335;
                while (true) {
                    atomicReferenceFieldUpdater3.getClass();
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    long j2 = f23336;
                    if (unsafe2.compareAndSwapObject(this, j2, (Object) null, cls)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = AbstractC8502.f23601;
                        while (!atomicReferenceFieldUpdater4.compareAndSet(this, null, interfaceC8531) && atomicReferenceFieldUpdater4.get(this) == null) {
                        }
                    } else if (unsafe2.getObjectVolatile(this, j2) != null) {
                        break;
                    }
                }
            }
            return interfaceC8531;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5 = f23335;
        while (true) {
            atomicReferenceFieldUpdater5.getClass();
            Unsafe unsafe3 = AbstractC8501.f23600;
            long j3 = f23336;
            if (unsafe3.compareAndSwapObject(this, j3, (Object) null, cls2)) {
                z = true;
                break;
            }
            if (unsafe3.getObjectVolatile(this, j3) != null) {
                break;
            }
            cls2 = cls;
        }
        InterfaceC8531 interfaceC8531M6031 = abstractC2896.m6031(cls);
        if (z) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater6 = AbstractC8502.f23601;
            while (!atomicReferenceFieldUpdater6.compareAndSet(this, null, interfaceC8531M6031) && atomicReferenceFieldUpdater6.get(this) == null) {
            }
        }
        return interfaceC8531M6031;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13979(AbstractC2896 abstractC2896, Object obj) {
        InterfaceC8531 interfaceC8531M6031;
        AbstractC2896 abstractC28962;
        Object objMo13976 = mo13976(obj);
        if (objMo13976 == null) {
            abstractC2896.mo5922();
            return;
        }
        Class<?> cls = objMo13976.getClass();
        if (this.f23339 == null) {
            this.f23339 = cls;
            interfaceC8531M6031 = abstractC2896.m6031(cls);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC8502.f23601;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC8531M6031) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        } else {
            interfaceC8531M6031 = this.f23339 == cls ? this.f23605 : abstractC2896.m6031(cls);
        }
        if (interfaceC8531M6031 == null) {
            C0276.m849(AbstractC9032.m14590(cls, "get value writer error, valueType : "));
            return;
        }
        boolean z = abstractC2896.m6028() && !C8547.m14086(cls);
        if (z) {
            if (objMo13976 == obj) {
                abstractC2896.mo5975("..");
                return;
            }
            String strM6041 = abstractC2896.m6041(objMo13976, this.f23627);
            if (strM6041 != null) {
                abstractC2896.mo5975(strM6041);
                abstractC2896.m6037(objMo13976);
                return;
            }
        }
        if (abstractC2896.f9169) {
            boolean zM6033 = abstractC2896.m6033();
            String str = this.f23627;
            Class cls2 = this.f23626;
            if (zM6033) {
                InterfaceC8531 interfaceC8531 = interfaceC8531M6031;
                abstractC28962 = abstractC2896;
                interfaceC8531.mo13999(abstractC28962, objMo13976, cls2, this.f23620);
            } else {
                InterfaceC8531 interfaceC85312 = interfaceC8531M6031;
                abstractC28962 = abstractC2896;
                interfaceC85312.mo5633(abstractC28962, objMo13976, str, cls2, this.f23620);
            }
        } else {
            InterfaceC8531 interfaceC85313 = interfaceC8531M6031;
            abstractC28962 = abstractC2896;
            interfaceC85313.mo5634(abstractC28962, objMo13976, this.f23627, this.f23626, this.f23620);
        }
        if (z) {
            abstractC28962.m6037(objMo13976);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo13985() {
        return this.f23338;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e A[PHI: r16
  0x008e: PHI (r16v2 long) = (r16v3 long), (r16v4 long), (r16v4 long) binds: [B:25:0x005e, B:20:0x0050, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo13980(com.alibaba.fastjson2.AbstractC2896 r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8429.mo13980(com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, java.lang.Object):boolean");
    }
}
