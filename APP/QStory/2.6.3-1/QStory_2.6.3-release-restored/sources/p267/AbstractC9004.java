package p267;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import androidx.compose.p001ui.draganddrop.C2261;
import bsh.C3466;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3889;
import io.ktor.websocket.C5102;
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
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.AbstractC5180;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.AbstractC5892;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5848;
import kotlin.reflect.jvm.internal.InterfaceC5893;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5333;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5449;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5468;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.sequences.AbstractC5954;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.AbstractC5977;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import okio.ByteString;
import p020.C6921;
import p025.AbstractC7012;
import p031.AbstractC7065;
import p031.C7064;
import p050.AbstractC7176;
import p061.C7292;
import p061.C7294;
import p062.C7311;
import p065.AbstractC7356;
import p068.InterfaceC7387;
import p093.AbstractC7798;
import p093.C7801;
import p095.C7808;
import p095.C7835;
import p103.AbstractC7953;
import p103.C7954;
import p105.C8009;
import p105.InterfaceC8013;
import p107.C8019;
import p107.C8021;
import p107.C8024;
import p107.C8027;
import p107.InterfaceC8020;
import p128.C8156;
import p148.AbstractC8334;
import p252.AbstractC8929;
import p252.C8930;
import p252.C8934;
import p269.AbstractC9019;
import p321.InterfaceC9448;
import p366.C9686;
import p366.C9687;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static long f22854;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Method f22855;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static volatile ExecutorService f22856;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m14182(InterfaceC5468 interfaceC5468, Annotation annotation) throws InvocationTargetException {
        Class clsM7316 = AbstractC3889.m7316(AbstractC3889.m7319(annotation));
        InterfaceC5475 interfaceC5475Mo1550 = interfaceC5468.mo1550(AbstractC5263.m9536(clsM7316), new C7801(annotation));
        if (interfaceC5475Mo1550 != null) {
            m14188(interfaceC5475Mo1550, annotation, clsM7316);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C0923 m14183(InterfaceC5893 interfaceC5893, String str) {
        str.getClass();
        C5102 c5102M10626 = AbstractC5899.m10626(str);
        ArrayList arrayList = c5102M10626.f13161;
        boolean zM9466 = AbstractC5227.m9466(AbstractC5176.m9371(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = AbstractC5238.m9493(interfaceC5893).size() + (zM9466 ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(AbstractC5176.m9358(arrayList.size() - size, arrayList));
        for (Pair pair : AbstractC5176.m9380(AbstractC5238.m9493(interfaceC5893), AbstractC5176.m9359(size, arrayList))) {
            InterfaceC5940 interfaceC5940 = (InterfaceC5940) pair.component1();
            String str2 = (String) pair.component2();
            interfaceC5940.getClass();
            if ((interfaceC5940 instanceof AbstractC5892) && ((AbstractC5892) interfaceC5940).mo10515() && AbstractC5899.m10632(interfaceC5940.getType())) {
                Iterator it = AbstractC5954.m10676(AbstractC5954.m10674(interfaceC5940.getType(), C5848.f14797), 1).iterator();
                while (it.hasNext()) {
                    if (AbstractC5899.m10637((InterfaceC5919) it.next())) {
                        linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5940.getType().mo9458();
                        interfaceC5924Mo9458.getClass();
                        StringBuilder sb = new StringBuilder("L");
                        String strReplace = ((C5836) ((InterfaceC5925) interfaceC5924Mo9458)).f14769.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
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
        if (zM9466) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new C0923(str, EmptySet.INSTANCE) : new C0923(AbstractC5176.m9369(arrayList2, "", "(", ")", null, 56).concat(c5102M10626.f13160), linkedHashSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Throwable m14184(Throwable th) {
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
    public static final C5322 m14185(AbstractC5333 abstractC5333) {
        abstractC5333.getClass();
        C5322 c5322 = (C5322) AbstractC5449.f13860.get(abstractC5333);
        return c5322 == null ? AbstractC5321.m9631(abstractC5333) : c5322;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final void m14186(C8930 c8930, String str) {
        c8930.getClass();
        str.getClass();
        c8930.m14130(AbstractC5976.m10731(str) ? EmptyList.INSTANCE : str.equals("/") ? AbstractC8929.f22720 : new ArrayList(AbstractC5976.m10709(str, new char[]{'/'})));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final void m14187(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m14188(InterfaceC5475 interfaceC5475, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                C5523 c5523M9889 = C5523.m9889(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    interfaceC5475.mo1541(c5523M9889, m14199((Class) objInvoke));
                } else if (AbstractC7798.f19004.contains(enclosingClass)) {
                    interfaceC5475.mo1548(c5523M9889, objInvoke);
                } else {
                    List list = AbstractC5263.f13400;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        interfaceC5475.mo1549(c5523M9889, AbstractC5263.m9536(enclosingClass), C5523.m9889(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) AbstractC5179.m9408(interfaces);
                        cls2.getClass();
                        InterfaceC5475 interfaceC5475Mo1551 = interfaceC5475.mo1551(AbstractC5263.m9536(cls2), c5523M9889);
                        if (interfaceC5475Mo1551 != null) {
                            m14188(interfaceC5475Mo1551, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC5476 interfaceC5476Mo1544 = interfaceC5475.mo1544(c5523M9889);
                        if (interfaceC5476Mo1544 != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C5520 c5520M9536 = AbstractC5263.m9536(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    interfaceC5476Mo1544.mo1547(c5520M9536, C5523.m9889(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    interfaceC5476Mo1544.mo1543(m14199((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC5475 interfaceC5475Mo1545 = interfaceC5476Mo1544.mo1545(AbstractC5263.m9536(componentType));
                                    if (interfaceC5475Mo1545 != null) {
                                        obj3.getClass();
                                        m14188(interfaceC5475Mo1545, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    interfaceC5476Mo1544.mo1546(obj4);
                                }
                            }
                            interfaceC5476Mo1544.mo1542();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC5475.mo1542();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m14189(Logger logger, AbstractC7065 abstractC7065, C7064 c7064, String str) {
        logger.fine(c7064.f17535 + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC7065.f17540);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m14190(C8930 c8930, StringBuilder sb) throws IOException {
        int i;
        List listM12487;
        sb.append(c8930.m14131().f22667);
        String str = c8930.m14131().f22667;
        int iHashCode = str.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3143036) {
                if (iHashCode == 92611469 && str.equals("about")) {
                    CharSequence charSequence = c8930.f22727;
                    sb.append(":");
                    sb.append(charSequence);
                    return;
                }
            } else if (str.equals("file")) {
                CharSequence charSequence2 = c8930.f22727;
                String strM14195 = m14195(c8930);
                sb.append("://");
                sb.append(charSequence2);
                if (!AbstractC5976.m10705(strM14195, '/')) {
                    sb.append('/');
                }
                sb.append((CharSequence) strM14195);
                return;
            }
        } else if (str.equals("mailto")) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = c8930.f22723;
            String str3 = c8930.f22722;
            if (str2 != null) {
                sb2.append(str2);
                if (str3 != null) {
                    sb2.append(':');
                    sb2.append(str3);
                }
                sb2.append("@");
            }
            CharSequence string = sb2.toString();
            CharSequence charSequence3 = c8930.f22727;
            sb.append(":");
            sb.append(string);
            sb.append(charSequence3);
            return;
        }
        sb.append("://");
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        String str4 = c8930.f22723;
        String str5 = c8930.f22722;
        if (str4 != null) {
            sb4.append(str4);
            if (str5 != null) {
                sb4.append(':');
                sb4.append(str5);
            }
            sb4.append("@");
        }
        sb3.append(sb4.toString());
        sb3.append(c8930.f22727);
        int i2 = c8930.f22725;
        if (i2 != 0 && i2 != c8930.m14131().f22666) {
            sb3.append(":");
            sb3.append(String.valueOf(c8930.f22725));
        }
        sb.append(sb3.toString());
        String strM141952 = m14195(c8930);
        C8934 c8934 = c8930.f22730;
        boolean z = c8930.f22726;
        strM141952.getClass();
        c8934.getClass();
        if (!AbstractC5976.m10731(strM141952) && !AbstractC5971.m10698(strM141952, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) strM141952);
        if (!((Map) c8934.f4240).isEmpty() || z) {
            sb.append(TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        Set setMo2978 = c8934.mo2978();
        ArrayList arrayList = new ArrayList();
        Iterator it = setMo2978.iterator();
        while (true) {
            i = 10;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str6 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listM12487 = AbstractC7176.m12487(new Pair(str6, null));
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(str6, (String) it2.next()));
                }
                listM12487 = arrayList2;
            }
            AbstractC5176.m9363(listM12487, arrayList);
        }
        AbstractC5176.m9368(arrayList, sb, "&", null, null, new C8009(i), 60);
        if (c8930.f22729.length() > 0) {
            sb.append('#');
            sb.append(c8930.f22729);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8156 m14191(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C8156(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7954 m14192(String str, C8021 c8021) {
        if (AbstractC5976.m10731(str)) {
            C6755.m11869("Blank serial names are prohibited");
            return null;
        }
        for (InterfaceC8013 interfaceC8013 : AbstractC7953.f19406.values()) {
            if (str.equals(interfaceC8013.getDescriptor().mo12941())) {
                StringBuilder sbM12144 = AbstractC7012.m12144("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM12144.append(AbstractC5228.f13320.mo9476(interfaceC8013.getClass()).getSimpleName());
                sbM12144.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                C6755.m11869(AbstractC5977.m10737(sbM12144.toString()));
                return null;
            }
        }
        return new C7954(str, c8021);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m14193(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Executor m14194() {
        if (f22856 == null) {
            synchronized (AbstractC9004.class) {
                try {
                    if (f22856 == null) {
                        f22856 = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return f22856;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String m14195(C8930 c8930) {
        List list = c8930.f22728;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) AbstractC5176.m9379(list)).length() == 0 ? "/" : (String) AbstractC5176.m9379(list) : AbstractC5176.m9369(list, "/", null, null, null, 62);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static boolean m14196() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC8334.m13283();
        }
        try {
            if (f22855 == null) {
                f22854 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f22855 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f22855.invoke(null, Long.valueOf(f22854))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            C6755.m11872(cause);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m14197(C8156 c8156) {
        long j = c8156.f19874;
        return (j >>> 32) == (4294967295L & j) && j == c8156.f19873 && j == c8156.f19880 && j == c8156.f19879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final long m14198(C2261 c2261) {
        float x = c2261.f4448.getX();
        float y = c2261.f4448.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C5581 m14199(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            C5520 c5520M9536 = AbstractC5263.m9536(cls);
            String str = C5242.f13332;
            C5520 c5520M9505 = C5242.m9505(c5520M9536.m9886());
            if (c5520M9505 != null) {
                c5520M9536 = c5520M9505;
            }
            return new C5581(c5520M9536, i);
        }
        if (cls.equals(Void.TYPE)) {
            C5519 c5519M9878 = AbstractC7356.f18227.m9878();
            return new C5581(new C5520(c5519M9878.m9879(), c5519M9878.f14041.m9877()), i);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        primitiveType.getClass();
        if (i > 0) {
            C5519 arrayTypeFqName = primitiveType.getArrayTypeFqName();
            arrayTypeFqName.getClass();
            return new C5581(new C5520(arrayTypeFqName.m9879(), arrayTypeFqName.f14041.m9877()), i - 1);
        }
        C5519 typeFqName = primitiveType.getTypeFqName();
        typeFqName.getClass();
        return new C5581(new C5520(typeFqName.m9879(), typeFqName.f14041.m9877()), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m14200(long j, C6921 c6921, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C6755.m11869("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((ByteString) arrayList4.get(i8)).size() < i7) {
                C6755.m11869("Failed requirement.");
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
            long j3 = (c6921.f16992 / 4) + j + 2 + ((long) i10) + 1;
            c6921.m12017(-i10);
            c6921.m12017(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c6921.m12017(byteString.getByte(i7) & Opcodes.CONST_METHOD_TYPE);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((ByteString) arrayList4.get(i4)).size()) {
                    c6921.m12017(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C6755.m11870("Check failed.");
                    return;
                }
            }
            C6921 c69212 = new C6921();
            c6921.m12017(((int) ((c69212.f16992 / 4) + j3)) * (-1));
            m14200(j3, c69212, i12, arrayList4, i4, i3, arrayList5);
            c6921.mo12027(c69212);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((ByteString) arrayList4.get(i14 - 1)).getByte(i7) != ((ByteString) arrayList4.get(i14)).getByte(i7)) {
                i13++;
            }
        }
        long j4 = (c6921.f16992 / 4) + j + 2 + ((long) (i13 * 2));
        c6921.m12017(i13);
        c6921.m12017(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((ByteString) arrayList4.get(i15)).getByte(i7);
            if (i15 == i4 || i16 != ((ByteString) arrayList4.get(i15 - 1)).getByte(i7)) {
                c6921.m12017(i16 & Opcodes.CONST_METHOD_TYPE);
            }
        }
        C6921 c69213 = new C6921();
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
                c6921.m12017(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
            } else {
                c6921.m12017(((int) ((c69213.f16992 / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i19;
                m14200(j2, c69213, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        c6921.mo12027(c69213);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Type m14201(InterfaceC5893 interfaceC5893) {
        Type[] lowerBounds;
        if (interfaceC5893.isSuspend()) {
            Object objM9371 = AbstractC5176.m9371(interfaceC5893.mo10500().getParameterTypes());
            ParameterizedType parameterizedType = objM9371 instanceof ParameterizedType ? (ParameterizedType) objM9371 : null;
            if (AbstractC5227.m9466(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC5189.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objM9408 = AbstractC5179.m9408(actualTypeArguments);
                WildcardType wildcardType = objM9408 instanceof WildcardType ? (WildcardType) objM9408 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC5179.m9384(lowerBounds);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m14202(long j) {
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
    public static Object[] m14203(Object[]... objArr) {
        if (objArr.length == 0) {
            C3466.m5903("There is no arrays to concat!");
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
    public static C7292 m14204(C7294 c7294, boolean z) {
        String lowerCase;
        c7294.getClass();
        List list = c7294.f18082;
        C7292 c7292 = new C7292(c7294, null, CallableMemberDescriptor$Kind.DECLARATION, z);
        C7835 c7835Mo12866 = c7294.mo12866();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC5295) obj).mo9562() != Variance.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        C5174 c5174M9346 = AbstractC5176.m9346(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(c5174M9346, 10));
        Iterator it = c5174M9346.iterator();
        while (true) {
            C5170 c5170 = (C5170) it;
            if (!c5170.f13264.hasNext()) {
                c7292.mo12856(null, c7835Mo12866, emptyList, emptyList, arrayList2, ((InterfaceC5295) AbstractC5176.m9367(list)).mo9584(), Modality.ABSTRACT, AbstractC5321.f13461);
                C7292 c72922 = c7292;
                c72922.f19110 = true;
                return c72922;
            }
            C5173 c5173 = (C5173) c5170.next();
            int i = c5173.f13269;
            InterfaceC5295 interfaceC5295 = (InterfaceC5295) c5173.f13268;
            String strM9894 = interfaceC5295.getName().m9894();
            strM9894.getClass();
            if (strM9894.equals("T")) {
                lowerCase = "instance";
            } else if (strM9894.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM9894.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            C7292 c72923 = c7292;
            C5523 c5523M9889 = C5523.m9889(lowerCase);
            AbstractC5710 abstractC5710Mo9584 = interfaceC5295.mo9584();
            abstractC5710Mo9584.getClass();
            arrayList2.add(new C7808(c72923, null, i, C7311.f18113, c5523M9889, abstractC5710Mo9584, false, false, false, null, InterfaceC5294.f13436));
            c7292 = c72923;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m14205(ArrayList arrayList, BaseItemUiInfo baseItemUiInfo, String str) {
        if (baseItemUiInfo instanceof DirectoryUiInfo) {
            StringBuilder sbM700 = AbstractC0900.m700(str);
            sbM700.append("-directory-");
            sbM700.append(arrayList.size());
            sbM700.append(SignatureVisitor.SUPER);
            DirectoryUiInfo directoryUiInfo = (DirectoryUiInfo) baseItemUiInfo;
            sbM700.append(directoryUiInfo.getItemName());
            arrayList.add(new C9687(sbM700.toString(), directoryUiInfo));
            return;
        }
        if (baseItemUiInfo instanceof ItemUiInfo) {
            StringBuilder sbM7002 = AbstractC0900.m700(str);
            sbM7002.append("-function-");
            sbM7002.append(arrayList.size());
            sbM7002.append(SignatureVisitor.SUPER);
            ItemUiInfo itemUiInfo = (ItemUiInfo) baseItemUiInfo;
            sbM7002.append(itemUiInfo.getItemName());
            arrayList.add(new C9686(sbM7002.toString(), itemUiInfo));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final String m14206(Object[] objArr, int i, int i2, AbstractC5180 abstractC5180) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC5180) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8019 m14207(String str, AbstractC9019 abstractC9019, InterfaceC8020[] interfaceC8020Arr, InterfaceC7387 interfaceC7387) {
        if (AbstractC5976.m10731(str)) {
            C6755.m11869("Blank serial names are prohibited");
            return null;
        }
        if (abstractC9019.equals(C8027.f19554)) {
            C6755.m11869("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C8024 c8024 = new C8024(str);
        interfaceC7387.invoke(c8024);
        return new C8019(str, abstractC9019, c8024.f19546.size(), AbstractC5179.m9405(interfaceC8020Arr), c8024);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C8019 m14208(String str, AbstractC9019 abstractC9019, InterfaceC8020[] interfaceC8020Arr) {
        if (AbstractC5976.m10731(str)) {
            C6755.m11869("Blank serial names are prohibited");
            return null;
        }
        if (abstractC9019.equals(C8027.f19554)) {
            C6755.m11869("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C8024 c8024 = new C8024(str);
        return new C8019(str, abstractC9019, c8024.f19546.size(), AbstractC5179.m9405(interfaceC8020Arr), c8024);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m14209(Appendable appendable, Object obj, InterfaceC7387 interfaceC7387) throws IOException {
        appendable.getClass();
        if (interfaceC7387 != null) {
            appendable.append((CharSequence) interfaceC7387.invoke(obj));
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
    public static void m14210(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract boolean mo4976();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract void mo7738(Typeface typeface, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo7739(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public abstract View mo4977(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public abstract void mo7619(InterfaceC9448 interfaceC9448, float f);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract float mo7620(InterfaceC9448 interfaceC9448);
}
