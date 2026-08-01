package p251;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import androidx.compose.ui.draganddrop.C1426;
import bsh.C2633;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3057;
import io.ktor.websocket.C4270;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.AbstractC4348;
import kotlin.collections.C4338;
import kotlin.collections.C4341;
import kotlin.collections.C4342;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.internal.AbstractC5060;
import kotlin.reflect.jvm.internal.AbstractC5067;
import kotlin.reflect.jvm.internal.C5004;
import kotlin.reflect.jvm.internal.C5016;
import kotlin.reflect.jvm.internal.InterfaceC5061;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4501;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4617;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4636;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.sequences.AbstractC5122;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import kotlin.text.AbstractC5145;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import okio.ByteString;
import p004.C6092;
import p009.AbstractC6183;
import p015.AbstractC6236;
import p015.C6235;
import p034.AbstractC6347;
import p045.C6463;
import p045.C6465;
import p046.C6482;
import p049.AbstractC6527;
import p052.InterfaceC6558;
import p077.AbstractC6969;
import p077.C6972;
import p079.C6979;
import p079.C7006;
import p087.AbstractC7124;
import p087.C7125;
import p089.C7180;
import p089.InterfaceC7184;
import p091.C7190;
import p091.C7192;
import p091.C7195;
import p091.C7198;
import p091.InterfaceC7191;
import p112.C7327;
import p132.AbstractC7505;
import p236.AbstractC8100;
import p236.C8101;
import p236.C8105;
import p253.AbstractC8190;
import p287.AbstractC8405;
import p305.InterfaceC8619;
import p350.C8857;
import p350.C8858;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static long f22509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Method f22510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static volatile ExecutorService f22511;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m13623(InterfaceC4636 interfaceC4636, Annotation annotation) throws InvocationTargetException {
        Class clsM6756 = AbstractC3057.m6756(AbstractC3057.m6759(annotation));
        InterfaceC4643 interfaceC4643Mo990 = interfaceC4636.mo990(AbstractC4431.m8977(clsM6756), new C6972(annotation));
        if (interfaceC4643Mo990 != null) {
            m13629(interfaceC4643Mo990, annotation, clsM6756);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C0076 m13624(InterfaceC5061 interfaceC5061, String str) {
        str.getClass();
        C4270 c4270M10067 = AbstractC5067.m10067(str);
        ArrayList arrayList = c4270M10067.f12816;
        boolean zM8907 = AbstractC4395.m8907(AbstractC4344.m8812(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = AbstractC4406.m8934(interfaceC5061).size() + (zM8907 ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(AbstractC4344.m8799(arrayList.size() - size, arrayList));
        for (Pair pair : AbstractC4344.m8821(AbstractC4406.m8934(interfaceC5061), AbstractC4344.m8800(size, arrayList))) {
            InterfaceC5108 interfaceC5108 = (InterfaceC5108) pair.component1();
            String str2 = (String) pair.component2();
            interfaceC5108.getClass();
            if ((interfaceC5108 instanceof AbstractC5060) && ((AbstractC5060) interfaceC5108).mo9956() && AbstractC5067.m10073(interfaceC5108.getType())) {
                Iterator it = AbstractC5122.m10117(AbstractC5122.m10115(interfaceC5108.getType(), C5016.f14452), 1).iterator();
                while (it.hasNext()) {
                    if (AbstractC5067.m10078((InterfaceC5087) it.next())) {
                        linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5108.getType().mo8899();
                        interfaceC5092Mo8899.getClass();
                        StringBuilder sb = new StringBuilder("L");
                        String strReplace = ((C5004) ((InterfaceC5093) interfaceC5092Mo8899)).f14424.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                        strReplace.getClass();
                        sb.append(strReplace);
                        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                        arrayList2.add(sb.toString());
                        break;
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (zM8907) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new C0076(str, EmptySet.INSTANCE) : new C0076(AbstractC4344.m8810(arrayList2, "", "(", ")", null, 56).concat(c4270M10067.f12815), linkedHashSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Throwable m13625(Throwable th) {
        th.getClass();
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (cause.equals(cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C4490 m13626(AbstractC4501 abstractC4501) {
        abstractC4501.getClass();
        C4490 c4490 = (C4490) AbstractC4617.f13515.get(abstractC4501);
        return c4490 == null ? AbstractC4489.m9072(abstractC4501) : c4490;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final void m13627(C8101 c8101, String str) {
        c8101.getClass();
        str.getClass();
        c8101.m13571(AbstractC5144.m10172(str) ? EmptyList.INSTANCE : str.equals("/") ? AbstractC8100.f22375 : new ArrayList(AbstractC5144.m10150(str, new char[]{'/'})));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final void m13628(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m13629(InterfaceC4643 interfaceC4643, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                C4691 c4691M9330 = C4691.m9330(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    interfaceC4643.mo981(c4691M9330, m13640((Class) objInvoke));
                } else if (AbstractC6969.f18659.contains(enclosingClass)) {
                    interfaceC4643.mo988(c4691M9330, objInvoke);
                } else {
                    List list = AbstractC4431.f13055;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        interfaceC4643.mo989(c4691M9330, AbstractC4431.m8977(enclosingClass), C4691.m9330(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) AbstractC4347.m8849(interfaces);
                        cls2.getClass();
                        InterfaceC4643 interfaceC4643Mo991 = interfaceC4643.mo991(AbstractC4431.m8977(cls2), c4691M9330);
                        if (interfaceC4643Mo991 != null) {
                            m13629(interfaceC4643Mo991, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC4644 interfaceC4644Mo984 = interfaceC4643.mo984(c4691M9330);
                        if (interfaceC4644Mo984 != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C4688 c4688M8977 = AbstractC4431.m8977(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    interfaceC4644Mo984.mo987(c4688M8977, C4691.m9330(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    interfaceC4644Mo984.mo983(m13640((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC4643 interfaceC4643Mo985 = interfaceC4644Mo984.mo985(AbstractC4431.m8977(componentType));
                                    if (interfaceC4643Mo985 != null) {
                                        obj3.getClass();
                                        m13629(interfaceC4643Mo985, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    interfaceC4644Mo984.mo986(obj4);
                                }
                            }
                            interfaceC4644Mo984.mo982();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC4643.mo982();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m13630(Logger logger, AbstractC6236 abstractC6236, C6235 c6235, String str) {
        logger.fine(c6235.f17190 + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC6236.f17195);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m13631(C8101 c8101, StringBuilder sb) throws IOException {
        int i;
        List listM11928;
        sb.append(c8101.m13572().f22322);
        String str = c8101.m13572().f22322;
        int iHashCode = str.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3143036) {
                if (iHashCode == 92611469 && str.equals("about")) {
                    CharSequence charSequence = c8101.f22382;
                    sb.append(":");
                    sb.append(charSequence);
                    return;
                }
            } else if (str.equals("file")) {
                CharSequence charSequence2 = c8101.f22382;
                String strM13636 = m13636(c8101);
                sb.append("://");
                sb.append(charSequence2);
                if (!AbstractC5144.m10146(strM13636, '/')) {
                    sb.append('/');
                }
                sb.append((CharSequence) strM13636);
                return;
            }
        } else if (str.equals("mailto")) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = c8101.f22378;
            String str3 = c8101.f22377;
            if (str2 != null) {
                sb2.append(str2);
                if (str3 != null) {
                    sb2.append(':');
                    sb2.append(str3);
                }
                sb2.append("@");
            }
            CharSequence string = sb2.toString();
            CharSequence charSequence3 = c8101.f22382;
            sb.append(":");
            sb.append(string);
            sb.append(charSequence3);
            return;
        }
        sb.append("://");
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        String str4 = c8101.f22378;
        String str5 = c8101.f22377;
        if (str4 != null) {
            sb4.append(str4);
            if (str5 != null) {
                sb4.append(':');
                sb4.append(str5);
            }
            sb4.append("@");
        }
        sb3.append(sb4.toString());
        sb3.append(c8101.f22382);
        int i2 = c8101.f22380;
        if (i2 != 0 && i2 != c8101.m13572().f22321) {
            sb3.append(":");
            sb3.append(String.valueOf(c8101.f22380));
        }
        sb.append(sb3.toString());
        String strM136362 = m13636(c8101);
        C8105 c8105 = c8101.f22385;
        boolean z = c8101.f22381;
        strM136362.getClass();
        c8105.getClass();
        if (!AbstractC5144.m10172(strM136362) && !AbstractC5139.m10139(strM136362, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) strM136362);
        if (!((Map) c8105.f3895).isEmpty() || z) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        Set setMo2418 = c8105.mo2418();
        ArrayList arrayList = new ArrayList();
        Iterator it = setMo2418.iterator();
        while (true) {
            i = 10;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str6 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listM11928 = AbstractC6347.m11928(new Pair(str6, null));
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(str6, (String) it2.next()));
                }
                listM11928 = arrayList2;
            }
            AbstractC4344.m8804(listM11928, arrayList);
        }
        AbstractC4344.m8809(arrayList, sb, "&", null, null, new C7180(i), 60);
        if (c8101.f22384.length() > 0) {
            sb.append('#');
            sb.append(c8101.f22384);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7327 m13632(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C7327(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7125 m13633(String str, C7192 c7192) {
        if (AbstractC5144.m10172(str)) {
            C5925.m11310("Blank serial names are prohibited");
            return null;
        }
        for (InterfaceC7184 interfaceC7184 : AbstractC7124.f19061.values()) {
            if (str.equals(interfaceC7184.getDescriptor().mo12382())) {
                StringBuilder sbM11585 = AbstractC6183.m11585("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM11585.append(AbstractC4396.f12975.mo8917(interfaceC7184.getClass()).getSimpleName());
                sbM11585.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                C5925.m11310(AbstractC5145.m10178(sbM11585.toString()));
                return null;
            }
        }
        return new C7125(str, c7192);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m13634(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Executor m13635() {
        if (f22511 == null) {
            synchronized (AbstractC8175.class) {
                try {
                    if (f22511 == null) {
                        f22511 = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return f22511;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String m13636(C8101 c8101) {
        List list = c8101.f22383;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) AbstractC4344.m8820(list)).length() == 0 ? "/" : (String) AbstractC4344.m8820(list) : AbstractC4344.m8810(list, "/", null, null, null, 62);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static boolean m13637() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC7505.m12724();
        }
        try {
            if (f22510 == null) {
                f22509 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f22510 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f22510.invoke(null, Long.valueOf(f22509))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            C5925.m11313(cause);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m13638(C7327 c7327) {
        long j = c7327.f19529;
        return (j >>> 32) == (4294967295L & j) && j == c7327.f19528 && j == c7327.f19535 && j == c7327.f19534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final long m13639(C1426 c1426) {
        float x = c1426.f4103.getX();
        float y = c1426.f4103.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C4749 m13640(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            C4688 c4688M8977 = AbstractC4431.m8977(cls);
            String str = C4410.f12987;
            C4688 c4688M8946 = C4410.m8946(c4688M8977.m9327());
            if (c4688M8946 != null) {
                c4688M8977 = c4688M8946;
            }
            return new C4749(c4688M8977, i);
        }
        if (cls.equals(Void.TYPE)) {
            C4687 c4687M9319 = AbstractC6527.f17882.m9319();
            return new C4749(new C4688(c4687M9319.m9320(), c4687M9319.f13696.m9318()), i);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        primitiveType.getClass();
        if (i > 0) {
            C4687 arrayTypeFqName = primitiveType.getArrayTypeFqName();
            arrayTypeFqName.getClass();
            return new C4749(new C4688(arrayTypeFqName.m9320(), arrayTypeFqName.f13696.m9318()), i - 1);
        }
        C4687 typeFqName = primitiveType.getTypeFqName();
        typeFqName.getClass();
        return new C4749(new C4688(typeFqName.m9320(), typeFqName.f13696.m9318()), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m13641(long j, C6092 c6092, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C5925.m11310("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((ByteString) arrayList4.get(i8)).size() < i7) {
                C5925.m11310("Failed requirement.");
                return;
            }
        }
        ByteString byteString = (ByteString) arrayList.get(i2);
        ByteString byteString2 = (ByteString) arrayList4.get(i3 - 1);
        if (i7 == byteString.size()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            ByteString byteString3 = (ByteString) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            byteString = byteString3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (byteString.getByte(i7) == byteString2.getByte(i7)) {
            int iMin = Math.min(byteString.size(), byteString2.size());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && byteString.getByte(i11) == byteString2.getByte(i11); i11++) {
                i10++;
            }
            long j3 = (c6092.f16647 / 4) + j + 2 + ((long) i10) + 1;
            c6092.m11458(-i10);
            c6092.m11458(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c6092.m11458(byteString.getByte(i7) & Opcodes.CONST_METHOD_TYPE);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((ByteString) arrayList4.get(i4)).size()) {
                    c6092.m11458(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C5925.m11311("Check failed.");
                    return;
                }
            }
            C6092 c60922 = new C6092();
            c6092.m11458(((int) ((c60922.f16647 / 4) + j3)) * (-1));
            m13641(j3, c60922, i12, arrayList4, i4, i3, arrayList5);
            c6092.mo11468(c60922);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((ByteString) arrayList4.get(i14 - 1)).getByte(i7) != ((ByteString) arrayList4.get(i14)).getByte(i7)) {
                i13++;
            }
        }
        long j4 = (c6092.f16647 / 4) + j + 2 + ((long) (i13 * 2));
        c6092.m11458(i13);
        c6092.m11458(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((ByteString) arrayList4.get(i15)).getByte(i7);
            if (i15 == i4 || i16 != ((ByteString) arrayList4.get(i15 - 1)).getByte(i7)) {
                c6092.m11458(i16 & Opcodes.CONST_METHOD_TYPE);
            }
        }
        C6092 c60923 = new C6092();
        int i17 = i4;
        while (i17 < i3) {
            byte b = ((ByteString) arrayList4.get(i17)).getByte(i7);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (b != ((ByteString) arrayList4.get(i19)).getByte(i7)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i7 + 1 == ((ByteString) arrayList4.get(i17)).size()) {
                c6092.m11458(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
            } else {
                c6092.m11458(((int) ((c60923.f16647 / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
                m13641(j2, c60923, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        c6092.mo11468(c60923);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Type m13642(InterfaceC5061 interfaceC5061) {
        Type[] lowerBounds;
        if (interfaceC5061.isSuspend()) {
            Object objM8812 = AbstractC4344.m8812(interfaceC5061.mo9941().getParameterTypes());
            ParameterizedType parameterizedType = objM8812 instanceof ParameterizedType ? (ParameterizedType) objM8812 : null;
            if (AbstractC4395.m8907(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC4357.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objM8849 = AbstractC4347.m8849(actualTypeArguments);
                WildcardType wildcardType = objM8849 instanceof WildcardType ? (WildcardType) objM8849 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC4347.m8825(lowerBounds);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m13643(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Object[] m13644(Object[]... objArr) {
        if (objArr.length == 0) {
            C2633.m5343("There is no arrays to concat!");
            return null;
        }
        if (objArr.length == 1) {
            return objArr[0];
        }
        int length = 0;
        for (Object[] objArr2 : objArr) {
            length += objArr2.length;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr[0].getClass().getComponentType(), length);
        int length2 = 0;
        for (Object[] objArr4 : objArr) {
            System.arraycopy(objArr4, 0, objArr3, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return objArr3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C6463 m13645(C6465 c6465, boolean z) {
        String lowerCase;
        c6465.getClass();
        List list = c6465.f17737;
        C6463 c6463 = new C6463(c6465, null, CallableMemberDescriptor$Kind.DECLARATION, z);
        C7006 c7006Mo12307 = c6465.mo12307();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC4463) obj).mo9003() != Variance.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        C4342 c4342M8787 = AbstractC4344.m8787(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(c4342M8787, 10));
        Iterator it = c4342M8787.iterator();
        while (true) {
            C4338 c4338 = (C4338) it;
            if (!c4338.f12919.hasNext()) {
                c6463.mo12297(null, c7006Mo12307, emptyList, emptyList, arrayList2, ((InterfaceC4463) AbstractC4344.m8808(list)).mo9025(), Modality.ABSTRACT, AbstractC4489.f13116);
                C6463 c64632 = c6463;
                c64632.f18765 = true;
                return c64632;
            }
            C4341 c4341 = (C4341) c4338.next();
            int i = c4341.f12924;
            InterfaceC4463 interfaceC4463 = (InterfaceC4463) c4341.f12923;
            String strM9335 = interfaceC4463.getName().m9335();
            strM9335.getClass();
            if (strM9335.equals("T")) {
                lowerCase = "instance";
            } else if (strM9335.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM9335.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            C6463 c64633 = c6463;
            C4691 c4691M9330 = C4691.m9330(lowerCase);
            AbstractC4878 abstractC4878Mo9025 = interfaceC4463.mo9025();
            abstractC4878Mo9025.getClass();
            arrayList2.add(new C6979(c64633, null, i, C6482.f17768, c4691M9330, abstractC4878Mo9025, false, false, false, null, InterfaceC4462.f13091));
            c6463 = c64633;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m13646(ArrayList arrayList, BaseItemUiInfo baseItemUiInfo, String str) {
        if (baseItemUiInfo instanceof DirectoryUiInfo) {
            StringBuilder sbM140 = AbstractC0053.m140(str);
            sbM140.append(AbstractC8405.m13972(3232));
            sbM140.append(arrayList.size());
            sbM140.append(SignatureVisitor.SUPER);
            DirectoryUiInfo directoryUiInfo = (DirectoryUiInfo) baseItemUiInfo;
            sbM140.append(directoryUiInfo.getItemName());
            arrayList.add(new C8858(sbM140.toString(), directoryUiInfo));
            return;
        }
        if (baseItemUiInfo instanceof ItemUiInfo) {
            StringBuilder sbM1402 = AbstractC0053.m140(str);
            sbM1402.append(AbstractC8405.m13972(3233));
            sbM1402.append(arrayList.size());
            sbM1402.append(SignatureVisitor.SUPER);
            ItemUiInfo itemUiInfo = (ItemUiInfo) baseItemUiInfo;
            sbM1402.append(itemUiInfo.getItemName());
            arrayList.add(new C8857(sbM1402.toString(), itemUiInfo));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final String m13647(Object[] objArr, int i, int i2, AbstractC4348 abstractC4348) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC4348) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C7190 m13648(String str, AbstractC8190 abstractC8190, InterfaceC7191[] interfaceC7191Arr, InterfaceC6558 interfaceC6558) {
        if (AbstractC5144.m10172(str)) {
            C5925.m11310("Blank serial names are prohibited");
            return null;
        }
        if (abstractC8190.equals(C7198.f19209)) {
            C5925.m11310("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C7195 c7195 = new C7195(str);
        interfaceC6558.invoke(c7195);
        return new C7190(str, abstractC8190, c7195.f19201.size(), AbstractC4347.m8846(interfaceC7191Arr), c7195);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C7190 m13649(String str, AbstractC8190 abstractC8190, InterfaceC7191[] interfaceC7191Arr) {
        if (AbstractC5144.m10172(str)) {
            C5925.m11310("Blank serial names are prohibited");
            return null;
        }
        if (abstractC8190.equals(C7198.f19209)) {
            C5925.m11310("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C7195 c7195 = new C7195(str);
        return new C7190(str, abstractC8190, c7195.f19201.size(), AbstractC4347.m8846(interfaceC7191Arr), c7195);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m13650(Appendable appendable, Object obj, InterfaceC6558 interfaceC6558) throws IOException {
        appendable.getClass();
        if (interfaceC6558 != null) {
            appendable.append((CharSequence) interfaceC6558.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m13651(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract boolean mo4416();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract void mo7179(Typeface typeface, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo7180(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public abstract View mo4417(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public abstract void mo7060(InterfaceC8619 interfaceC8619, float f);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract float mo7061(InterfaceC8619 interfaceC8619);
}
