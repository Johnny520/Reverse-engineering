package androidx.compose.runtime;

import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C1041;
import androidx.compose.animation.core.C1202;
import androidx.compose.foundation.lazy.layout.C1548;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2069;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2084;
import androidx.compose.runtime.internal.C2088;
import com.android.p002dx.p005io.Opcodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.C6116;
import kotlinx.coroutines.flow.C6128;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p142.C8252;
import p142.C8255;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Object f4318 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2153 f4316 = new C2153();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1548 f4317 = new C1548(2);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final C2088 m3029(C1041[] c1041Arr, C2088 c2088, C2088 c20882) {
        C2088 c20883 = C2088.f3986;
        C2084 c2084 = new C2084(c20883);
        c2084.f3969 = c20883;
        for (C1041 c1041 : c1041Arr) {
            AbstractC2225 abstractC2225 = (AbstractC2225) c1041.f1106;
            if (c1041.f1107 || !c2088.containsKey(abstractC2225)) {
                c2084.put(abstractC2225, abstractC2225.m3091(c1041, (InterfaceC2160) c20882.get(abstractC2225)));
            }
        }
        return c2084.mo2732();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C6116 m3030(InterfaceC7372 interfaceC7372) {
        return new C6116(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(null, interfaceC7372, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final int m3031(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final void m3032(InterfaceC2208 interfaceC2208, Object obj, InterfaceC7383 interfaceC7383) {
        if (((C2159) interfaceC2208).f4183 || !AbstractC5227.m9466(((C2159) interfaceC2208).m2905(), obj)) {
            C2159 c2159 = (C2159) interfaceC2208;
            c2159.m2946(obj);
            c2159.m2924(obj, interfaceC7383);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final void m3033(C2070 c2070, int i, Object obj) {
        int iM2691 = c2070.m2691(i);
        Object[] objArr = c2070.f3912;
        Object obj2 = objArr[iM2691];
        objArr[iM2691] = C2204.f4319;
        if (obj == obj2) {
            return;
        }
        AbstractC2209.m3067("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static InterfaceC2230 m3034(Object obj) {
        return new ParcelableSnapshotMutableState(obj, C2188.f4267);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2230 m3035(Object obj, C2188 c2188) {
        return new ParcelableSnapshotMutableState(obj, c2188);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AbstractC2162 m3036(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2233 m3037(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2232 m3038(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final InterfaceC2230 m3039(Object obj, InterfaceC2208 interfaceC2208) {
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        if (objM2905 == C2204.f4319) {
            objM2905 = m3034(obj);
            c2159.m2946(objM2905);
        }
        InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
        interfaceC2230.setValue(obj);
        return interfaceC2230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C2149 m3040(InterfaceC2208 interfaceC2208) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2897(Opcodes.DIV_DOUBLE_2ADDR, AbstractC2209.f4320);
        if (c2159.f4183) {
            C2070.m2649(c2159.f4197);
        }
        Object objM2908 = c2159.m2908();
        C2155 c2176 = objM2908 instanceof C2155 ? (C2155) objM2908 : null;
        if (c2176 == null) {
            c2176 = new C2176(new C2150(new C2149(c2159, c2159.f4182, c2159.f4216, c2159.f4191, c2159.f4220.f4298)), -1);
            c2159.m2945(c2176);
        }
        InterfaceC2174 interfaceC2174 = c2176.f4169;
        interfaceC2174.getClass();
        C2149 c2149 = ((C2150) interfaceC2174).f4163;
        ((AbstractC2182) c2149.f4156).setValue(c2159.m2941());
        c2159.m2937(false);
        return c2149;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final void m3041(InterfaceC2208 interfaceC2208, InterfaceC7387 interfaceC7387) {
        ((C2159) interfaceC2208).m2924(C6008.f15084, new C2161(interfaceC7387, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Object m3042(C2088 c2088, AbstractC2225 abstractC2225) {
        abstractC2225.getClass();
        Object objMo2998 = c2088.get(abstractC2225);
        if (objMo2998 == null) {
            objMo2998 = abstractC2225.mo2998();
        }
        return ((InterfaceC2160) objMo2998).mo2866(c2088);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final InterfaceC2230 m3043(InterfaceC2208 interfaceC2208, Object obj, InterfaceC7383 interfaceC7383) {
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (objM2905 == c2188) {
            objM2905 = m3034(obj);
            c2159.m2946(objM2905);
        }
        InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
        boolean zM2938 = c2159.m2938(interfaceC7383);
        Object objM29052 = c2159.m2905();
        if (zM2938 || objM29052 == c2188) {
            objM29052 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(interfaceC7383, interfaceC2230, null);
            c2159.m2946(objM29052);
        }
        m3060(c2159, C6008.f15084, (InterfaceC7383) objM29052);
        return interfaceC2230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m3044(Object obj, InterfaceC7387 interfaceC7387, InterfaceC2208 interfaceC2208) {
        C2159 c2159 = (C2159) interfaceC2208;
        boolean zM2920 = c2159.m2920(obj);
        Object objM2905 = c2159.m2905();
        if (zM2920 || objM2905 == C2204.f4319) {
            objM2905 = new C2194(interfaceC7387);
            c2159.m2946(objM2905);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m3045(Object obj, Object obj2, InterfaceC7387 interfaceC7387, InterfaceC2208 interfaceC2208) {
        C2159 c2159 = (C2159) interfaceC2208;
        boolean zM2920 = c2159.m2920(obj) | c2159.m2920(obj2);
        Object objM2905 = c2159.m2905();
        if (zM2920 || objM2905 == C2204.f4319) {
            objM2905 = new C2194(interfaceC7387);
            c2159.m2946(objM2905);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3046(C1041[] c1041Arr, InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, int i) {
        C2088 c2088M2731;
        boolean z;
        C2224 c2224M2935;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(415205898);
        C2145 c2145 = c2159.f4211;
        C2088 c2088M2941 = c2159.m2941();
        c2159.m2897(201, AbstractC2209.f4323);
        boolean z2 = c2159.f4183;
        C2214 c2214 = AbstractC2209.f4321;
        if (z2) {
            C2088 c2088M3029 = m3029(c1041Arr, c2088M2941, C2088.f3986);
            c2088M2941.getClass();
            C2084 c2084 = new C2084(c2088M2941);
            c2084.f3969 = c2088M2941;
            c2084.putAll(c2088M3029);
            c2088M2731 = c2084.mo2732();
            c2159.m2897(Opcodes.SUB_DOUBLE_2ADDR, c2214);
            c2159.m2908();
            c2159.m2945(c2088M2731);
            c2159.m2908();
            c2159.m2945(c2088M3029);
            c2159.m2937(false);
            c2159.f4196 = true;
        } else {
            C2069 c2069 = c2159.f4199;
            Object objM2643 = c2069.m2643(c2069.f3904, 0);
            objM2643.getClass();
            C2088 c2088 = (C2088) objM2643;
            C2069 c20692 = c2159.f4199;
            Object objM26432 = c20692.m2643(c20692.f3904, 1);
            objM26432.getClass();
            C2088 c20882 = (C2088) objM26432;
            C2088 c2088M30292 = m3029(c1041Arr, c2088M2941, c20882);
            if (!c2159.m2911() || c2159.f4195 || !c20882.equals(c2088M30292)) {
                c2088M2941.getClass();
                C2084 c20842 = new C2084(c2088M2941);
                c20842.f3969 = c2088M2941;
                c20842.putAll(c2088M30292);
                c2088M2731 = c20842.mo2732();
                c2159.m2897(Opcodes.SUB_DOUBLE_2ADDR, c2214);
                c2159.m2908();
                c2159.m2945(c2088M2731);
                c2159.m2908();
                c2159.m2945(c2088M30292);
                c2159.m2937(false);
                if (c2159.f4195 || !AbstractC5227.m9466(c2088M2731, c2088)) {
                    z = true;
                }
                if (z && !c2159.f4183) {
                    c2159.m2914(c2088M2731);
                }
                c2145.m2867(c2159.f4210 ? 1 : 0);
                c2159.f4210 = z;
                c2159.f4187 = c2088M2731;
                c2159.m2902(Opcodes.REM_FLOAT_2ADDR, 0, AbstractC2209.f4322, c2088M2731);
                interfaceC7383.invoke(c2159, Integer.valueOf((i >> 3) & 14));
                c2159.m2937(false);
                c2159.m2937(false);
                c2159.f4210 = c2145.m2868() != 0;
                c2159.f4187 = null;
                c2224M2935 = c2159.m2935();
                if (c2224M2935 == null) {
                    c2224M2935.f4379 = new C1202(i, 2, c1041Arr, interfaceC7383);
                    return;
                }
                return;
            }
            c2159.f4223 = c2159.f4199.m2635() + c2159.f4223;
            c2088M2731 = c2088;
        }
        z = false;
        if (z) {
            c2159.m2914(c2088M2731);
        }
        c2145.m2867(c2159.f4210 ? 1 : 0);
        c2159.f4210 = z;
        c2159.f4187 = c2088M2731;
        c2159.m2902(Opcodes.REM_FLOAT_2ADDR, 0, AbstractC2209.f4322, c2088M2731);
        interfaceC7383.invoke(c2159, Integer.valueOf((i >> 3) & 14));
        c2159.m2937(false);
        c2159.m2937(false);
        c2159.f4210 = c2145.m2868() != 0;
        c2159.f4187 = null;
        c2224M2935 = c2159.m2935();
        if (c2224M2935 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3047(C1041 c1041, InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, int i) {
        InterfaceC2160 interfaceC2160;
        boolean z;
        C2224 c2224M2935;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-149765515);
        C2145 c2145 = c2159.f4211;
        C2088 c2088M2941 = c2159.m2941();
        c2159.m2897(201, AbstractC2209.f4323);
        Object objM2905 = c2159.m2905();
        if (AbstractC5227.m9466(objM2905, C2204.f4319)) {
            interfaceC2160 = null;
        } else {
            objM2905.getClass();
            interfaceC2160 = (InterfaceC2160) objM2905;
        }
        AbstractC2225 abstractC2225 = (AbstractC2225) c1041.f1106;
        InterfaceC2160 interfaceC2160M3091 = abstractC2225.m3091(c1041, interfaceC2160);
        boolean zEquals = interfaceC2160M3091.equals(interfaceC2160);
        if (!zEquals) {
            c2159.m2946(interfaceC2160M3091);
        }
        int i2 = 1;
        if (!c2159.f4183) {
            C2069 c2069 = c2159.f4199;
            Object objM2632 = c2069.m2632(c2069.f3899, c2069.f3904);
            objM2632.getClass();
            C2088 c2088 = (C2088) objM2632;
            if (!(c2159.m2911() && zEquals) && (c1041.f1107 || !c2088M2941.containsKey(abstractC2225))) {
                c2088M2941 = c2088M2941.m2746(abstractC2225, interfaceC2160M3091);
            } else if ((zEquals && !c2159.f4210) || !c2159.f4210) {
                c2088M2941 = c2088;
            }
            if (c2159.f4195 || c2088 != c2088M2941) {
                z = true;
            }
            if (z && !c2159.f4183) {
                c2159.m2914(c2088M2941);
            }
            c2145.m2867(c2159.f4210 ? 1 : 0);
            c2159.f4210 = z;
            c2159.f4187 = c2088M2941;
            c2159.m2902(Opcodes.REM_FLOAT_2ADDR, 0, AbstractC2209.f4322, c2088M2941);
            interfaceC7383.invoke(c2159, Integer.valueOf((i >> 3) & 14));
            c2159.m2937(false);
            c2159.m2937(false);
            c2159.f4210 = c2145.m2868() != 0;
            c2159.f4187 = null;
            c2224M2935 = c2159.m2935();
            if (c2224M2935 == null) {
                c2224M2935.f4379 = new C1202(i, i2, c1041, interfaceC7383);
                return;
            }
            return;
        }
        if (c1041.f1107 || !c2088M2941.containsKey(abstractC2225)) {
            c2088M2941 = c2088M2941.m2746(abstractC2225, interfaceC2160M3091);
        }
        c2159.f4196 = true;
        z = false;
        if (z) {
            c2159.m2914(c2088M2941);
        }
        c2145.m2867(c2159.f4210 ? 1 : 0);
        c2159.f4210 = z;
        c2159.f4187 = c2088M2941;
        c2159.m2902(Opcodes.REM_FLOAT_2ADDR, 0, AbstractC2209.f4322, c2088M2941);
        interfaceC7383.invoke(c2159, Integer.valueOf((i >> 3) & 14));
        c2159.m2937(false);
        c2159.m2937(false);
        c2159.f4210 = c2145.m2868() != 0;
        c2159.f4187 = null;
        c2224M2935 = c2159.m2935();
        if (c2224M2935 == null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final int m3048(InterfaceC2208 interfaceC2208) {
        interfaceC2208.getClass();
        return Long.hashCode(((C2159) interfaceC2208).f4182);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int m3049(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM9464 = AbstractC5227.m9464(((C2144) list.get(i3)).f4145, i);
            if (iM9464 < 0) {
                i2 = i3 + 1;
            } else {
                if (iM9464 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final void m3050(InterfaceC2208 interfaceC2208, InterfaceC7387 interfaceC7387) {
        if (((C2159) interfaceC2208).f4183) {
            ((C2159) interfaceC2208).m2924(C6008.f15084, new C2161(interfaceC7387, 0));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final void m3051() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final InterfaceC2139 m3052(InterfaceC5192 interfaceC5192) {
        InterfaceC2139 interfaceC2139 = (InterfaceC2139) interfaceC5192.get(C2188.f4269);
        if (interfaceC2139 != null) {
            return interfaceC2139;
        }
        C6755.m11870("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final void m3053(InterfaceC2208 interfaceC2208, Integer num, InterfaceC7383 interfaceC7383) {
        if (((C2159) interfaceC2208).f4183) {
            ((C2159) interfaceC2208).m2924(num, interfaceC7383);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC2230 m3054(C6128 c6128, C2159 c2159) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        Object value = c6128.f15225.getValue();
        boolean zM2938 = c2159.m2938(emptyCoroutineContext) | c2159.m2938(c6128);
        Object objM2905 = c2159.m2905();
        Object obj = C2204.f4319;
        if (zM2938 || objM2905 == obj) {
            objM2905 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(emptyCoroutineContext, c6128, null);
            c2159.m2946(objM2905);
        }
        InterfaceC7383 interfaceC7383 = (InterfaceC7383) objM2905;
        Object objM29052 = c2159.m2905();
        if (objM29052 == obj) {
            objM29052 = m3034(value);
            c2159.m2946(objM29052);
        }
        InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM29052;
        boolean zM29382 = c2159.m2938(interfaceC7383);
        Object objM29053 = c2159.m2905();
        if (zM29382 || objM29053 == obj) {
            objM29053 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(interfaceC7383, interfaceC2230, null);
            c2159.m2946(objM29053);
        }
        m3059(c6128, emptyCoroutineContext, (InterfaceC7383) objM29053, c2159);
        return interfaceC2230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2059 m3055() {
        C0955 c0955 = AbstractC2170.f4241;
        C2059 c2059 = (C2059) c0955.m953();
        if (c2059 != null) {
            return c2059;
        }
        C2059 c20592 = new C2059(0, new C2148[0]);
        c0955.m922(c20592);
        return c20592;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2197 m3056(InterfaceC7372 interfaceC7372) {
        C0955 c0955 = AbstractC2170.f4242;
        return new C2197(interfaceC7372, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m3057(C2069 c2069, ArrayList arrayList, int i) {
        boolean zM2646 = c2069.m2646(i);
        int[] iArr = c2069.f3899;
        if (zM2646) {
            arrayList.add(c2069.m2637(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m3057(c2069, arrayList, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC6233 m3058(EmptyCoroutineContext emptyCoroutineContext, InterfaceC2208 interfaceC2208) {
        if (emptyCoroutineContext.get(C6285.f15450) == null) {
            return new C2179(((C2159) interfaceC2208).f4180, emptyCoroutineContext);
        }
        C6283 c6283M11047 = AbstractC6231.m11047();
        c6283M11047.m11113(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return AbstractC6231.m11048(c6283M11047);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m3059(Object obj, Object obj2, InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208) {
        InterfaceC5192 interfaceC5192 = ((C2159) interfaceC2208).f4180;
        C2159 c2159 = (C2159) interfaceC2208;
        boolean zM2920 = c2159.m2920(obj) | c2159.m2920(obj2);
        Object objM2905 = c2159.m2905();
        if (zM2920 || objM2905 == C2204.f4319) {
            objM2905 = new C2142(interfaceC5192, interfaceC7383);
            c2159.m2946(objM2905);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m3060(InterfaceC2208 interfaceC2208, Object obj, InterfaceC7383 interfaceC7383) {
        InterfaceC5192 interfaceC5192 = ((C2159) interfaceC2208).f4180;
        C2159 c2159 = (C2159) interfaceC2208;
        boolean zM2920 = c2159.m2920(obj);
        Object objM2905 = c2159.m2905();
        if (zM2920 || objM2905 == C2204.f4319) {
            objM2905 = new C2142(interfaceC5192, interfaceC7383);
            c2159.m2946(objM2905);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m3061(C2070 c2070, List list, C2198 c2198) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iM2676 = c2070.m2676((C2065) list.get(i));
            int iM2660 = c2070.m2660(c2070.f3913, c2070.m2688(iM2676));
            Object obj = iM2660 < c2070.m2692(c2070.f3913, c2070.m2688(iM2676 + 1)) ? c2070.f3912[c2070.m2691(iM2660)] : C2204.f4319;
            C2224 c2224 = obj instanceof C2224 ? (C2224) obj : null;
            if (c2224 != null) {
                c2224.f4382 = c2198;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m3062(InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208) {
        C8252 c8252 = ((C2159) interfaceC2208).f4189.f20489.f20497;
        c8252.m13211(C8255.f20471);
        AbstractC5754.m10425(c8252, 0, interfaceC7372);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m3063(List list, int i, int i2) {
        int iM3049 = m3049(i, list);
        if (iM3049 < 0) {
            iM3049 = -(iM3049 + 1);
        }
        while (iM3049 < list.size() && ((C2144) list.get(iM3049)).f4145 < i2) {
        }
    }
}
