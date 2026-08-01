package p034;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.appcompat.app.AbstractC0927;
import androidx.appcompat.widget.C0984;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.colorspace.C2324;
import androidx.compose.runtime.C2157;
import androidx.compose.runtime.internal.C2080;
import androidx.compose.runtime.tooling.C2129;
import androidx.compose.runtime.tooling.C2131;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.core.os.AbstractC3012;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3738;
import com.kongzue.dialogx.util.C4596;
import io.ktor.http.cio.C4790;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.jvm.javaio.C5054;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5438;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.storage.C5672;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.InterfaceC5678;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5748;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5699;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5712;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.C5730;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5683;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5971;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.p010io.C6308;
import lin.xposed.hook.javaplugin.C6385;
import okhttp3.Protocol;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p073.AbstractC7683;
import p073.InterfaceC7680;
import p077.AbstractC7688;
import p078.AbstractC7689;
import p085.C7724;
import p085.C7726;
import p085.InterfaceC7725;
import p103.AbstractC7953;
import p103.AbstractC7973;
import p103.C7899;
import p103.C7906;
import p103.C7932;
import p103.C7960;
import p103.C7969;
import p105.C8011;
import p105.InterfaceC8013;
import p111.C8036;
import p111.ExecutorC8037;
import p121.AbstractC8132;
import p121.C8130;
import p121.C8134;
import p213.InterfaceC8675;
import p252.C8949;
import p252.C8954;
import p279.AbstractC9085;
import p279.C9084;
import p321.C9449;
import p360.C9654;
import p360.C9658;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7082 implements InterfaceC8675 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static AbstractC5748 m12294(AbstractC5748 abstractC5748) {
        int i = 1;
        if (!(abstractC5748 instanceof C5730)) {
            return new C5699(abstractC5748, i);
        }
        C5730 c5730 = (C5730) abstractC5748;
        InterfaceC5295[] interfaceC5295Arr = c5730.f14566;
        AbstractC5702[] abstractC5702Arr = c5730.f14565;
        abstractC5702Arr.getClass();
        interfaceC5295Arr.getClass();
        int iMin = Math.min(abstractC5702Arr.length, interfaceC5295Arr.length);
        ArrayList<Pair> arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(new Pair(abstractC5702Arr[i2], interfaceC5295Arr[i2]));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(m12314((AbstractC5702) pair.getFirst(), (InterfaceC5295) pair.getSecond()));
        }
        return new C5730(interfaceC5295Arr, (AbstractC5702[]) arrayList2.toArray(new AbstractC5702[0]), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (kotlin.text.AbstractC5971.m10689(r1.f22761, r7) != false) goto L21;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C8954 m12295(C8954 c8954, Charset charset) {
        c8954.getClass();
        charset.getClass();
        String strName = charset.name();
        strName.getClass();
        List<C8949> list = (List) c8954.f577;
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                C8949 c8949 = (C8949) list.get(0);
                if (AbstractC5971.m10689(c8949.f22762, "charset")) {
                }
            } else if (!list.isEmpty()) {
                for (C8949 c89492 : list) {
                    if (AbstractC5971.m10689(c89492.f22762, "charset") && AbstractC5971.m10689(c89492.f22761, strName)) {
                        return c8954;
                    }
                }
            }
        }
        return new C8954(c8954.f22771, c8954.f22770, (String) c8954.f576, AbstractC5176.m9353(list, new C8949("charset", strName)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final boolean m12296(Throwable th, InterfaceC7372 interfaceC7372) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = AbstractC7688.f18645;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = AbstractC7689.f18646;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = EmptyList.INSTANCE;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            C2131 c2131 = (C2131) interfaceC7372.invoke();
            if (c2131 != null) {
                boolean z2 = c2131.f4129;
                List list = c2131.f4130;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C2129) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                c2131.getClass();
                diagnosticComposeException = new DiagnosticComposeException(c2131);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            AbstractC6019.m10775(th, diagnosticComposeException);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static C5054 m12297(InputStream inputStream) {
        C8036 c8036 = AbstractC6227.f15375;
        ExecutorC8037 executorC8037 = ExecutorC8037.f19570;
        C4790 c4790 = AbstractC7683.f18640;
        inputStream.getClass();
        executorC8037.getClass();
        c4790.getClass();
        return new C5054(new C6308(inputStream), executorC8037);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Handler m12298(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC3012.m4540(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C6755.m11872(cause);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long[] m12299(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Charset m12300(AbstractC0927 abstractC0927) {
        abstractC0927.getClass();
        String strM869 = abstractC0927.m869("charset");
        if (strM869 == null) {
            return null;
        }
        try {
            Charset charset = AbstractC5964.f15033;
            Charset charsetForName = Charset.forName(strM869);
            charsetForName.getClass();
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m12301(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8134 m12302(AbstractC5714 abstractC5714) {
        Variance varianceM10417;
        C8130 c8130;
        abstractC5714.getClass();
        if (abstractC5714.mo10331() instanceof AbstractC5728) {
            C8134 c8134M12302 = m12302(AbstractC5725.m10385(abstractC5714));
            C8134 c8134M123022 = m12302(AbstractC5725.m10366(abstractC5714));
            return new C8134(AbstractC5725.m10383(AbstractC5725.m10368(AbstractC5725.m10385((AbstractC5714) c8134M12302.f19793), AbstractC5725.m10366((AbstractC5714) c8134M123022.f19793)), abstractC5714), AbstractC5725.m10383(AbstractC5725.m10368(AbstractC5725.m10385((AbstractC5714) c8134M12302.f19792), AbstractC5725.m10366((AbstractC5714) c8134M123022.f19792)), abstractC5714));
        }
        InterfaceC5705 interfaceC5705Mo10281 = abstractC5714.mo10281();
        if (abstractC5714.mo10281() instanceof InterfaceC7725) {
            interfaceC5705Mo10281.getClass();
            AbstractC5702 abstractC5702Mo10279 = ((InterfaceC7725) interfaceC5705Mo10281).mo10279();
            AbstractC5714 abstractC5714Mo10300 = abstractC5702Mo10279.mo10300();
            abstractC5714Mo10300.getClass();
            AbstractC5714 abstractC5714M10408 = AbstractC5749.m10408(abstractC5714Mo10300, abstractC5714.mo10284());
            abstractC5714M10408.getClass();
            int i = AbstractC8132.f19790[abstractC5702Mo10279.mo10301().ordinal()];
            if (i == 2) {
                return new C8134(abstractC5714M10408, AbstractC3738.m6877(abstractC5714).m12592());
            }
            if (i != 3) {
                C6385.m11443(abstractC5702Mo10279, "Only nontrivial projections should have been captured, not: ");
                return null;
            }
            AbstractC5714 abstractC5714M104082 = AbstractC5749.m10408(AbstractC3738.m6877(abstractC5714).m12590(), abstractC5714.mo10284());
            abstractC5714M104082.getClass();
            return new C8134(abstractC5714M104082, abstractC5714M10408);
        }
        if (abstractC5714.mo10285().isEmpty() || abstractC5714.mo10285().size() != interfaceC5705Mo10281.getParameters().size()) {
            return new C8134(abstractC5714, abstractC5714);
        }
        ArrayList<C8130> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listMo10285 = abstractC5714.mo10285();
        List parameters = interfaceC5705Mo10281.getParameters();
        parameters.getClass();
        Iterator it = AbstractC5176.m9380(listMo10285, parameters).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    for (C8130 c81302 : arrayList) {
                        c81302.getClass();
                        if (!InterfaceC5683.f14478.m10157(c81302.f19788, c81302.f19787)) {
                            break;
                        }
                    }
                    z = false;
                }
                return new C8134(z ? AbstractC3738.m6877(abstractC5714).m12590() : m12307(abstractC5714, arrayList), m12307(abstractC5714, arrayList2));
            }
            Pair pair = (Pair) it.next();
            AbstractC5702 abstractC5702 = (AbstractC5702) pair.component1();
            InterfaceC5295 interfaceC5295 = (InterfaceC5295) pair.component2();
            interfaceC5295.getClass();
            Variance varianceMo9562 = interfaceC5295.mo9562();
            if (varianceMo9562 == null) {
                C5751.m10418(35);
                throw null;
            }
            if (abstractC5702 == null) {
                C5751.m10418(36);
                throw null;
            }
            C5751 c5751 = C5751.f14593;
            if (abstractC5702.mo10299()) {
                varianceM10417 = Variance.OUT_VARIANCE;
                if (varianceM10417 == null) {
                    C5751.m10418(37);
                    throw null;
                }
            } else {
                varianceM10417 = C5751.m10417(varianceMo9562, abstractC5702.mo10301());
            }
            int i2 = AbstractC8132.f19790[varianceM10417.ordinal()];
            if (i2 == 1) {
                AbstractC5714 abstractC5714Mo103002 = abstractC5702.mo10300();
                abstractC5714Mo103002.getClass();
                AbstractC5714 abstractC5714Mo103003 = abstractC5702.mo10300();
                abstractC5714Mo103003.getClass();
                c8130 = new C8130(interfaceC5295, abstractC5714Mo103002, abstractC5714Mo103003);
            } else if (i2 == 2) {
                AbstractC5714 abstractC5714Mo103004 = abstractC5702.mo10300();
                abstractC5714Mo103004.getClass();
                c8130 = new C8130(interfaceC5295, abstractC5714Mo103004, AbstractC5605.m10058(interfaceC5295).m12592());
            } else {
                if (i2 != 3) {
                    C5043.m9170();
                    return null;
                }
                AbstractC5710 abstractC5710M12590 = AbstractC5605.m10058(interfaceC5295).m12590();
                AbstractC5714 abstractC5714Mo103005 = abstractC5702.mo10300();
                abstractC5714Mo103005.getClass();
                c8130 = new C8130(interfaceC5295, abstractC5710M12590, abstractC5714Mo103005);
            }
            if (abstractC5702.mo10299()) {
                arrayList.add(c8130);
                arrayList2.add(c8130);
            } else {
                C8134 c8134M123023 = m12302(c8130.f19788);
                AbstractC5714 abstractC57142 = (AbstractC5714) c8134M123023.f19793;
                AbstractC5714 abstractC57143 = (AbstractC5714) c8134M123023.f19792;
                C8134 c8134M123024 = m12302(c8130.f19787);
                AbstractC5714 abstractC57144 = (AbstractC5714) c8134M123024.f19793;
                AbstractC5714 abstractC57145 = (AbstractC5714) c8134M123024.f19792;
                InterfaceC5295 interfaceC52952 = c8130.f19789;
                C8130 c81303 = new C8130(interfaceC52952, abstractC57143, abstractC57144);
                C8130 c81304 = new C8130(interfaceC52952, abstractC57142, abstractC57145);
                arrayList.add(c81303);
                arrayList2.add(c81304);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Class m12303(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return m12303(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objM9384 = AbstractC5179.m9384(upperBounds);
            objM9384.getClass();
            return m12303((Type) objM9384);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return m12303(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        sb.append(" has type ");
        C6755.m11869(AbstractC3275.m5135(AbstractC5228.f13320, type.getClass(), sb));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC8013 m12304(C2080 c2080, Type type, boolean z) {
        ArrayList<InterfaceC8013> arrayList;
        InterfaceC8013 interfaceC8013M12304;
        InterfaceC8013 interfaceC8013M123042;
        InterfaceC5925 interfaceC5925Mo9476;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                genericComponentType = (Type) AbstractC5179.m9384(upperBounds);
            }
            genericComponentType.getClass();
            if (z) {
                interfaceC8013M123042 = AbstractC5754.m10431(c2080, genericComponentType);
            } else {
                c2080.getClass();
                interfaceC8013M123042 = m12304(c2080, genericComponentType, false);
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                rawType.getClass();
                interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476((Class) rawType);
            } else {
                if (!(genericComponentType instanceof InterfaceC5925)) {
                    C6755.m11870(AbstractC3275.m5135(AbstractC5228.f13320, genericComponentType.getClass(), new StringBuilder("unsupported type in GenericArray: ")));
                    return null;
                }
                interfaceC5925Mo9476 = (InterfaceC5925) genericComponentType;
            }
            interfaceC5925Mo9476.getClass();
            return new C7969(interfaceC5925Mo9476, interfaceC8013M123042);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return m12306(c2080, cls, EmptyList.INSTANCE);
            }
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (z) {
                interfaceC8013M12304 = AbstractC5754.m10431(c2080, componentType);
            } else {
                c2080.getClass();
                interfaceC8013M12304 = m12304(c2080, componentType, false);
            }
            return new C7969(AbstractC5228.f13320.mo9476(componentType), interfaceC8013M12304);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                upperBounds2.getClass();
                Object objM9384 = AbstractC5179.m9384(upperBounds2);
                objM9384.getClass();
                return m12304(c2080, (Type) objM9384, true);
            }
            StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb.append(type);
            sb.append(" has type ");
            C6755.m11869(AbstractC3275.m5135(AbstractC5228.f13320, type.getClass(), sb));
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        rawType2.getClass();
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                type2.getClass();
                arrayList.add(AbstractC5754.m10431(c2080, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                type3.getClass();
                c2080.getClass();
                InterfaceC8013 interfaceC8013M123043 = m12304(c2080, type3, false);
                if (interfaceC8013M123043 != null) {
                    arrayList.add(interfaceC8013M123043);
                }
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            InterfaceC8013 interfaceC8013 = (InterfaceC8013) arrayList.get(0);
            interfaceC8013.getClass();
            return new C7932(interfaceC8013, 2);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            InterfaceC8013 interfaceC80132 = (InterfaceC8013) arrayList.get(0);
            interfaceC80132.getClass();
            return new C7932(interfaceC80132, 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            InterfaceC8013 interfaceC80133 = (InterfaceC8013) arrayList.get(0);
            InterfaceC8013 interfaceC80134 = (InterfaceC8013) arrayList.get(1);
            interfaceC80133.getClass();
            interfaceC80134.getClass();
            return new C7906(interfaceC80133, interfaceC80134, 1);
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            InterfaceC8013 interfaceC80135 = (InterfaceC8013) arrayList.get(0);
            InterfaceC8013 interfaceC80136 = (InterfaceC8013) arrayList.get(1);
            interfaceC80135.getClass();
            interfaceC80136.getClass();
            return new C7899(interfaceC80135, interfaceC80136, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            InterfaceC8013 interfaceC80137 = (InterfaceC8013) arrayList.get(0);
            InterfaceC8013 interfaceC80138 = (InterfaceC8013) arrayList.get(1);
            interfaceC80137.getClass();
            interfaceC80138.getClass();
            return new C7899(interfaceC80137, interfaceC80138, 1);
        }
        if (Triple.class.isAssignableFrom(cls2)) {
            InterfaceC8013 interfaceC80139 = (InterfaceC8013) arrayList.get(0);
            InterfaceC8013 interfaceC801310 = (InterfaceC8013) arrayList.get(1);
            InterfaceC8013 interfaceC801311 = (InterfaceC8013) arrayList.get(2);
            interfaceC80139.getClass();
            interfaceC801310.getClass();
            interfaceC801311.getClass();
            return new C7960(interfaceC80139, interfaceC801310, interfaceC801311);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        for (InterfaceC8013 interfaceC801312 : arrayList) {
            interfaceC801312.getClass();
            arrayList2.add(interfaceC801312);
        }
        return m12306(c2080, cls2, arrayList2);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C5054 m12305(InputStream inputStream, InterfaceC7680 interfaceC7680) {
        C8036 c8036 = AbstractC6227.f15375;
        ExecutorC8037 executorC8037 = ExecutorC8037.f19570;
        executorC8037.getClass();
        interfaceC7680.getClass();
        return new C5054(new C6308(inputStream), executorC8037);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final InterfaceC8013 m12306(C2080 c2080, Class cls, List list) {
        InterfaceC8013[] interfaceC8013Arr = (InterfaceC8013[]) list.toArray(new InterfaceC8013[0]);
        InterfaceC8013 interfaceC8013M12972 = AbstractC7973.m12972(cls, (InterfaceC8013[]) Arrays.copyOf(interfaceC8013Arr, interfaceC8013Arr.length));
        if (interfaceC8013M12972 != null) {
            return interfaceC8013M12972;
        }
        C5229 c5229 = AbstractC5228.f13320;
        InterfaceC5925 interfaceC5925Mo9476 = c5229.mo9476(cls);
        InterfaceC8013 interfaceC8013 = (InterfaceC8013) AbstractC7953.f19406.get(interfaceC5925Mo9476);
        if (interfaceC8013 != null) {
            return interfaceC8013;
        }
        c2080.m2721(interfaceC5925Mo9476, list);
        if (cls.isInterface()) {
            return new C8011(c5229.mo9476(cls));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC5714 m12307(AbstractC5714 abstractC5714, ArrayList arrayList) {
        C5717 c5717;
        abstractC5714.mo10285().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8130 c8130 = (C8130) it.next();
            c8130.getClass();
            AbstractC5714 abstractC57142 = c8130.f19787;
            AbstractC5714 abstractC57143 = c8130.f19788;
            InterfaceC5295 interfaceC5295 = c8130.f19789;
            InterfaceC5683.f14478.m10157(abstractC57143, abstractC57142);
            if (!AbstractC5227.m9466(abstractC57143, abstractC57142)) {
                Variance varianceMo9562 = interfaceC5295.mo9562();
                Variance variance = Variance.IN_VARIANCE;
                if (varianceMo9562 == variance) {
                    c5717 = new C5717(abstractC57143);
                } else if (AbstractC7359.m12577(abstractC57143) && interfaceC5295.mo9562() != variance) {
                    Variance variance2 = Variance.OUT_VARIANCE;
                    if (variance2 == interfaceC5295.mo9562()) {
                        variance2 = Variance.INVARIANT;
                    }
                    c5717 = new C5717(abstractC57142, variance2);
                } else {
                    if (abstractC57142 == null) {
                        AbstractC7359.m12579(140);
                        throw null;
                    }
                    if (AbstractC7359.m12581(abstractC57142) && abstractC57142.mo10284()) {
                        if (variance == interfaceC5295.mo9562()) {
                            variance = Variance.INVARIANT;
                        }
                        c5717 = new C5717(abstractC57143, variance);
                    } else {
                        Variance variance3 = Variance.OUT_VARIANCE;
                        if (variance3 == interfaceC5295.mo9562()) {
                            variance3 = Variance.INVARIANT;
                        }
                        c5717 = new C5717(abstractC57142, variance3);
                    }
                }
            }
            arrayList2.add(c5717);
        }
        return AbstractC5725.m10380(abstractC5714, arrayList2, null, 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Object m12308(InterfaceC5678 interfaceC5678, InterfaceC5920 interfaceC5920) {
        interfaceC5678.getClass();
        interfaceC5920.getClass();
        return interfaceC5678.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static LayoutInflater m12309(Context context) {
        return LayoutInflater.from(context).cloneInContext(new C4596(context, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C0984 m12310(String str) throws ProtocolException {
        Protocol protocol;
        int i;
        String strSubstring;
        if (AbstractC5971.m10698(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else if (AbstractC5971.m10698(str, "ICY ", false)) {
            protocol = Protocol.HTTP_1_0;
            i = 4;
        } else {
            if (!AbstractC5971.m10698(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numM10699 = AbstractC5971.m10699(str.substring(i, i2));
        if (numM10699 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM10699.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new C0984(protocol, iIntValue, strSubstring);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m12311(InterfaceC5312 interfaceC5312) {
        interfaceC5312.getClass();
        if (!AbstractC5438.f13799.contains(interfaceC5312.getName())) {
            return false;
        }
        if (AbstractC5176.m9365(AbstractC5438.f13800, AbstractC5605.m10060(interfaceC5312)) && interfaceC5312.mo9594().isEmpty()) {
            return true;
        }
        if (!AbstractC7359.m12571(interfaceC5312)) {
            return false;
        }
        Collection collectionMo9589 = interfaceC5312.mo9589();
        collectionMo9589.getClass();
        Collection<InterfaceC5312> collection = collectionMo9589;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC5312 interfaceC53122 : collection) {
            interfaceC53122.getClass();
            if (m12311(interfaceC53122)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C9654 m12312(C9658 c9658, boolean z) {
        long j;
        long j2;
        float f;
        long j3 = c9658.f25244;
        long j4 = c9658.f25245;
        long j5 = c9658.f25243;
        long jM12317 = m12317(C2434.m3510(0.8f, j5), j3);
        long jM123172 = m12317(C2434.m3510(0.8f, j5), j4);
        long j6 = c9658.f25242;
        long jM123173 = m12317(C2434.m3510(0.2f, j6), j3);
        long jM123174 = m12317(C2434.m3510(0.38f, j6), j3);
        long j7 = c9658.f25241;
        long jM123175 = m12317(C2434.m3510(0.38f, j7), jM123174);
        long jM123176 = m12317(C2434.m3510(0.38f, j6), j3);
        long jM123177 = m12317(C2434.m3510(0.6f, j7), jM123176);
        long jM123178 = m12317(C2434.m3510(0.38f, j6), j3);
        long jM123179 = m12317(C2434.m3510(0.5f, c9658.f25235), j3);
        long jM1231710 = m12317(C2434.m3510(0.38f, j5), jM123179);
        long jM1231711 = m12317(C2434.m3510(0.6f, j4), j3);
        long jM1231712 = m12317(C2434.m3510(0.38f, j5), jM1231711);
        long j8 = c9658.f25242;
        long j9 = c9658.f25241;
        long j10 = c9658.f25240;
        long j11 = c9658.f25239;
        long j12 = c9658.f25238;
        long j13 = c9658.f25237;
        long j14 = c9658.f25256;
        long j15 = c9658.f25255;
        long j16 = c9658.f25259;
        long j17 = c9658.f25260;
        long j18 = c9658.f25235;
        long j19 = c9658.f25236;
        long j20 = c9658.f25245;
        long j21 = c9658.f25243;
        long j22 = c9658.f25250;
        long j23 = c9658.f25249;
        long j24 = c9658.f25246;
        long j25 = c9658.f25234;
        long j26 = c9658.f25253;
        long j27 = c9658.f25254;
        long j28 = c9658.f25251;
        long j29 = c9658.f25252;
        long j30 = c9658.f25244;
        long j31 = c9658.f25247;
        long j32 = c9658.f25248;
        if (z) {
            j = j32;
            j2 = C2434.f5041;
            f = 0.6f;
        } else {
            j = j32;
            j2 = C2434.f5041;
            f = 0.3f;
        }
        return new C9654(j8, j9, j10, j11, j12, j13, j14, j15, jM123174, jM123175, jM123176, jM123177, jM123178, j16, j17, j18, j19, j20, j21, jM123179, jM1231710, jM1231711, jM1231712, j22, j23, j24, j25, j26, j27, j27, j28, j29, j8, j30, j21, j31, jM12317, j25, j25, j21, j, j21, j25, j20, jM123172, j24, j21, j19, j18, C2434.m3510(f, j2), c9658.f25242, c9658.f25245, jM123173);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m12313(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AbstractC5702 m12314(AbstractC5702 abstractC5702, InterfaceC5295 interfaceC5295) {
        if (interfaceC5295 == null || abstractC5702.mo10301() == Variance.INVARIANT) {
            return abstractC5702;
        }
        if (interfaceC5295.mo9562() != abstractC5702.mo10301()) {
            C7724 c7724 = new C7724(abstractC5702);
            C5706.f14520.getClass();
            return new C5717(new C7726(abstractC5702, c7724, false, C5706.f14521));
        }
        if (!abstractC5702.mo10299()) {
            return new C5717(abstractC5702.mo10300());
        }
        C5672 c5672 = C5677.f14468;
        c5672.getClass();
        return new C5717(new C5712(c5672, new C2157(abstractC5702, 13)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C9084 m12315(C9084 c9084) {
        c9084.getClass();
        double dRint = Math.rint(c9084.f23201);
        return (((90.0d > dRint ? 1 : (90.0d == dRint ? 0 : -1)) <= 0 && (dRint > 111.0d ? 1 : (dRint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(c9084.f23200) > 16.0d ? 1 : (Math.rint(c9084.f23200) == 16.0d ? 0 : -1)) > 0) && (Math.rint(c9084.f23199) < 65.0d)) ? AbstractC9085.m14382(c9084.f23201, c9084.f23200, 70.0d) : c9084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m12316(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            int i = 0;
            while (i < str.length()) {
                int iCodePointAt = Character.codePointAt(str, i);
                StringBuilder sb2 = new StringBuilder("\\u");
                String hexString = Integer.toHexString(iCodePointAt);
                if (hexString.startsWith("0")) {
                    hexString = hexString.substring(1);
                }
                if (hexString.length() <= 4) {
                    int length = hexString.length();
                    StringBuilder sb3 = new StringBuilder();
                    for (int i2 = 0; i2 < 4 - length; i2++) {
                        sb3.append("0");
                    }
                    sb2.append(sb3.toString());
                }
                sb2.append(hexString);
                sb.append(sb2.toString());
                if (Character.isHighSurrogate(str.charAt(i))) {
                    i++;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long m12317(long j, long j2) {
        long jM3443;
        if (C2434.m3508(j) >= 1.0f) {
            return j;
        }
        float fM3508 = C2434.m3508(j);
        float fM35082 = C2434.m3508(j2);
        float f = 1.0f - fM3508;
        float f2 = (fM35082 * f) + fM3508;
        if (f2 == 0.0f) {
            jM3443 = AbstractC2416.m3443(0.0f, 0.0f, 0.0f, 0.0f, C2324.f4557);
        } else {
            jM3443 = AbstractC2416.m3443((((C2434.m3512(j2) * fM35082) * f) + (C2434.m3512(j) * fM3508)) / f2, (((C2434.m3513(j2) * fM35082) * f) + (C2434.m3513(j) * fM3508)) / f2, (((C2434.m3507(j2) * fM35082) * f) + (C2434.m3507(j) * fM3508)) / f2, f2, C2324.f4557);
        }
        return AbstractC2416.m3443(C2434.m3512(jM3443), C2434.m3513(jM3443), C2434.m3507(jM3443), 1.0f, C2324.f4557);
    }

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public int mo10302(int i) {
        int iMo12319 = mo12319(i);
        if (iMo12319 == -1 || mo12319(iMo12319) == -1) {
            return -1;
        }
        return iMo12319;
    }

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public int mo10303(int i) {
        int iMo12318 = mo12318(i);
        if (iMo12318 == -1 || mo12318(iMo12318) == -1) {
            return -1;
        }
        return iMo12318;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract String mo10554();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public abstract int mo12318(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract int mo12319(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo12320(C9449 c9449, float f, float f2);

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public int mo10320(int i) {
        return mo12319(i);
    }

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public int mo10321(int i) {
        return mo12318(i);
    }
}
