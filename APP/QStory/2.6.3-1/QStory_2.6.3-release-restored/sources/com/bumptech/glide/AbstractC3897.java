package com.bumptech.glide;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.activity.AbstractC0900;
import androidx.collection.C1094;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.util.AbstractC3682;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.server.routing.AbstractC4997;
import io.ktor.server.routing.C4975;
import io.ktor.server.routing.C4977;
import io.ktor.server.routing.C4980;
import io.ktor.server.routing.C4981;
import io.ktor.server.routing.C4984;
import io.ktor.server.routing.C4986;
import io.ktor.server.routing.C4990;
import io.ktor.server.routing.C4991;
import io.ktor.server.routing.C4998;
import io.ktor.server.routing.C4999;
import io.ktor.server.routing.C5002;
import io.ktor.util.C5043;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AbstractC6019;
import kotlin.Pair;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.AbstractC5863;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5844;
import kotlin.reflect.jvm.internal.C5845;
import kotlin.reflect.jvm.internal.C5848;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.TypeNullability;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.renderer.AbstractC5570;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5759;
import kotlin.reflect.jvm.internal.types.C5771;
import kotlin.sequences.AbstractC5954;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.modules.AbstractC6343;
import net.bytebuddy.description.type.TypeDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C6554;
import org.slf4j.Marker;
import p023.C6951;
import p023.C6973;
import p025.AbstractC7012;
import p029.AbstractC7054;
import p035.C7092;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p104.AbstractC7988;
import p104.C7989;
import p104.C7991;
import p104.C8003;
import p104.C8006;
import p105.InterfaceC8013;
import p107.C8021;
import p107.C8022;
import p107.C8025;
import p107.C8026;
import p107.C8027;
import p117.C8082;
import p117.C8084;
import p117.C8094;
import p117.InterfaceC8083;
import p119.C8103;
import p160.C8376;
import p163.C8401;
import p252.C8928;
import p269.AbstractC9019;
import p332.C9496;
import p380.C9763;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9921;
import top.sacz.xphelper.util.DexMethodDescriptor;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3897 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final boolean m7361(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(AbstractC5971.m10696(str2, TypeDescription.Generic.OfWildcardType.SYMBOL, ""))) {
            return true;
        }
        if (str2.endsWith(TypeDescription.Generic.OfWildcardType.SYMBOL) && str.concat(TypeDescription.Generic.OfWildcardType.SYMBOL).equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final Method m7362(String str) {
        int i = C9921.f25825;
        Method methodInstance = new DexMethodDescriptor(str).getMethodInstance(AbstractC9919.f25822);
        methodInstance.setAccessible(true);
        return methodInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
    
        r5 = null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC5919 m7363(Type type, Map map, TypeNullability typeNullability, boolean z, int i) {
        ArrayList arrayList;
        C5759 c5759M7399;
        String strMo9444;
        C5848 c5848 = C5848.f14806;
        C5848 c58482 = C5848.f14807;
        TypeNullability typeNullability2 = (i & 2) != 0 ? TypeNullability.FLEXIBLE : typeNullability;
        int i2 = 0;
        boolean z2 = (i & 4) != 0 ? false : z;
        type.getClass();
        typeNullability2.getClass();
        C5518 c5518 = null;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!m7378(cls).isEmpty() && !z2) {
                cls.getClass();
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(cls);
                List listM7378 = m7378(cls);
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(listM7378, 10));
                Iterator it = listM7378.iterator();
                while (it.hasNext()) {
                    Type[] bounds = ((TypeVariable) AbstractC5954.m10667(AbstractC5954.m10674((TypeVariable) it.next(), C5848.f14819))).getBounds();
                    bounds.getClass();
                    Type type2 = (Type) AbstractC5179.m9384(bounds);
                    C5917 c5917 = C5917.f14981;
                    type2.getClass();
                    arrayList2.add(AbstractC5922.m10659(m7363(type2, map, null, true, 2)));
                }
                C5759 c5759M73992 = m7399(cls, interfaceC5925Mo9476, arrayList2, false);
                InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(cls);
                List<TypeVariable> listM73782 = m7378(cls);
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(listM73782, 10));
                for (TypeVariable typeVariable : listM73782) {
                    arrayList3.add(C5917.f14981);
                }
                C5759 c5759M73993 = m7399(cls, interfaceC5925Mo94762, arrayList3, true);
                return c5759M73992.equals(c5759M73993) ? c5759M73992 : new C5771(c5759M73992, c5759M73993, true, new C5844(cls, i2));
            }
            if (cls.isArray()) {
                InterfaceC5925 interfaceC5925Mo94763 = AbstractC5228.f13320.mo9476(cls);
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return m7367(m7399(type, interfaceC5925Mo94763, AbstractC7176.m12487(m7364(componentType, map)), false), type);
            }
            InterfaceC5925 interfaceC5925Mo94764 = AbstractC5228.f13320.mo9476(cls);
            List<TypeVariable> listM73783 = m7378(cls);
            ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(listM73783, 10));
            for (TypeVariable typeVariable2 : listM73783) {
                arrayList4.add(C5917.f14981);
            }
            c5759M7399 = m7399(type, interfaceC5925Mo94764, arrayList4, false);
        } else {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                genericComponentType.getClass();
                C5917 c5917M7364 = m7364(genericComponentType, map);
                InterfaceC5919 interfaceC5919 = c5917M7364.f14982;
                interfaceC5919.getClass();
                return m7367(m7399(type, AbstractC5228.f13320.mo9476(AbstractC5899.m10621(AbstractC3889.m7316(AbstractC5913.m10651(interfaceC5919)))), AbstractC7176.m12487(c5917M7364), false), type);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                rawType.getClass();
                InterfaceC5925 interfaceC5925Mo94765 = AbstractC5228.f13320.mo9476((Class) rawType);
                if (z2) {
                    List<Type> listM10669 = AbstractC5954.m10669(AbstractC5954.m10672(AbstractC5954.m10674(parameterizedType, c58482), c5848));
                    arrayList = new ArrayList(AbstractC5177.m9381(listM10669, 10));
                    for (Type type3 : listM10669) {
                        arrayList.add(C5917.f14981);
                    }
                } else {
                    List listM106692 = AbstractC5954.m10669(AbstractC5954.m10672(AbstractC5954.m10674(parameterizedType, c58482), c5848));
                    ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(listM106692, 10));
                    Iterator it2 = listM106692.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(m7364((Type) it2.next(), map));
                    }
                    arrayList = arrayList5;
                }
                c5759M7399 = m7399(type, interfaceC5925Mo94765, arrayList, false);
            } else {
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        C5043.m9154(type, "Wildcard type is not possible here: ");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type);
                    Class<?> cls2 = type.getClass();
                    sb.append(" (");
                    sb.append(cls2);
                    sb.append(')');
                    throw new KotlinReflectionInternalError(sb.toString());
                }
                TypeVariable typeVariable3 = (TypeVariable) type;
                AbstractC5226 abstractC5226 = (AbstractC5226) map.get(typeVariable3);
                if (abstractC5226 == null) {
                    Iterator it3 = m7388(typeVariable3).getTypeParameters().iterator();
                    boolean z3 = false;
                    Object obj = null;
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (AbstractC5227.m9466(((AbstractC5226) next).mo9460(), typeVariable3.getName())) {
                                if (z3) {
                                    break;
                                }
                                obj = next;
                                z3 = true;
                            }
                        } else if (!z3) {
                            break;
                        }
                    }
                    abstractC5226 = (AbstractC5226) obj;
                    if (abstractC5226 == null) {
                        throw new KotlinReflectionInternalError("Type parameter " + typeVariable3.getName() + " is not found in " + m7388(typeVariable3));
                    }
                }
                c5759M7399 = m7399(type, abstractC5226, EmptyList.INSTANCE, false);
            }
        }
        InterfaceC5924 interfaceC5924 = c5759M7399.f14616;
        InterfaceC5925 interfaceC5925 = interfaceC5924 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924 : null;
        String str = C5242.f13332;
        if (interfaceC5925 != null && (strMo9444 = interfaceC5925.mo9444()) != null) {
            c5518 = new C5518(strMo9444);
        }
        C5519 c5519M9506 = C5242.m9506(c5518);
        AbstractC5758 c5771 = c5759M7399;
        c5771 = c5759M7399;
        if (c5519M9506 != null && interfaceC5925 != null) {
            C5759 c5759 = new C5759(interfaceC5924, c5759M7399.f14617, c5759M7399.f14611, EmptyList.INSTANCE, null, false, false, false, AbstractC7176.m12456(interfaceC5925, c5519M9506), new C5845(2, type));
            c5771 = c5759.equals(c5759M7399) ? c5759 : new C5771(c5759, c5759M7399, false, new C5845(0, type));
        }
        int i3 = AbstractC5863.f14855[typeNullability2.ordinal()];
        if (i3 == 1) {
            return c5771;
        }
        if (i3 == 2) {
            return c5771.mo10473(true);
        }
        AbstractC5758 abstractC5758Mo10475 = c5771.mo10475();
        AbstractC5758 abstractC5758 = abstractC5758Mo10475;
        if (abstractC5758Mo10475 == null) {
            abstractC5758 = c5771;
        }
        AbstractC5758 abstractC5758Mo10472 = c5771.mo10472();
        AbstractC5758 abstractC57582 = c5771;
        if (abstractC5758Mo10472 != null) {
            abstractC57582 = abstractC5758Mo10472;
        }
        AbstractC5758 abstractC5758Mo10473 = abstractC57582.mo10473(true);
        return abstractC5758.equals(abstractC5758Mo10473) ? abstractC5758 : new C5771(abstractC5758, abstractC5758Mo10473, false, new C5845(1, type));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final C5917 m7364(Type type, Map map) {
        if (!(type instanceof WildcardType)) {
            C5917 c5917 = C5917.f14981;
            return AbstractC5922.m10659(m7363(type, map, null, false, 6));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C5043.m9154(type, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            C5917 c59172 = C5917.f14981;
            Object objM9408 = AbstractC5179.m9408(lowerBounds);
            objM9408.getClass();
            InterfaceC5919 interfaceC5919M7363 = m7363((Type) objM9408, map, null, false, 6);
            interfaceC5919M7363.getClass();
            return new C5917(interfaceC5919M7363, KVariance.f304IN);
        }
        if (upperBounds.length != 1) {
            return C5917.f14981;
        }
        C5917 c59173 = C5917.f14981;
        Object objM94082 = AbstractC5179.m9408(upperBounds);
        objM94082.getClass();
        InterfaceC5919 interfaceC5919M73632 = m7363((Type) objM94082, map, null, false, 6);
        interfaceC5919M73632.getClass();
        return new C5917(interfaceC5919M73632, KVariance.OUT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final void m7365(Object obj, String str, Object obj2) {
        int i = C9915.f25813;
        C9915 c9915M15221 = C9915.m15221(obj.getClass());
        c9915M15221.f25815 = str;
        c9915M15221.f25814 = null;
        try {
            ((Field) c9915M15221.m15164()).set(obj, obj2);
        } catch (IllegalAccessException e) {
            C6755.m11872(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C4986 m7366(C4977 c4977, String str, C8928 c8928, InterfaceC7387 interfaceC7387) {
        AbstractC3887 c4999;
        AbstractC3887 c4981;
        c4977.getClass();
        c8928.getClass();
        C4984 c4984 = new C4984(c8928);
        C4990 c4990 = C4990.f12941;
        List list = AbstractC4765.m8854(str).f12942;
        int size = list.size();
        int i = 0;
        C4986 c4986M9095 = c4977;
        while (i < size) {
            C4991 c4991 = (C4991) list.get(i);
            String str2 = c4991.f12944;
            int i2 = AbstractC4997.f12965[c4991.f12943.ordinal()];
            if (i2 == 1) {
                str2.getClass();
                int iM10730 = AbstractC5976.m10730(str2, '{', 0, 6);
                int iM10724 = AbstractC5976.m10724(str2, '}', 0, 6);
                String strSubstring = iM10730 == 0 ? null : str2.substring(0, iM10730);
                String strSubstring2 = iM10724 == str2.length() - 1 ? null : str2.substring(iM10724 + 1);
                String strSubstring3 = str2.substring(iM10730 + 1, iM10724);
                if (strSubstring3.endsWith(TypeDescription.Generic.OfWildcardType.SYMBOL)) {
                    c4999 = new C4980(AbstractC5976.m10720(1, strSubstring3), strSubstring, strSubstring2);
                } else if (!strSubstring3.endsWith("...")) {
                    c4999 = new C4999(strSubstring3, strSubstring, strSubstring2);
                } else {
                    if (strSubstring2 != null && strSubstring2.length() != 0) {
                        C6755.m11869("Suffix after tailcard is not supported");
                        return null;
                    }
                    String strM10720 = AbstractC5976.m10720(3, strSubstring3);
                    if (strSubstring == null) {
                        strSubstring = "";
                    }
                    c4999 = new C4998(strM10720, strSubstring);
                }
                c4981 = c4999;
            } else {
                if (i2 != 2) {
                    C5043.m9170();
                    return null;
                }
                str2.getClass();
                c4981 = str2.equals(Marker.ANY_MARKER) ? C5002.f12973 : new C4981(str2);
            }
            i++;
            c4986M9095 = c4986M9095.m9095(c4981);
        }
        C4986 c4986M90952 = c4986M9095;
        if (str.endsWith("/")) {
            c4986M90952 = c4986M9095.m9095(C4975.f12905);
        }
        C4986 c4986M90953 = c4986M90952.m9095(c4984);
        interfaceC7387.invoke(c4986M90953);
        return c4986M90953;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C5771 m7367(C5759 c5759, Type type) {
        InterfaceC5924 interfaceC5924 = c5759.f14616;
        List<C5917> list = c5759.f14617;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        for (C5917 c5917 : list) {
            InterfaceC5919 interfaceC5919 = c5917.f14982;
            if (interfaceC5919 != null) {
                c5917 = new C5917(interfaceC5919, KVariance.OUT);
            }
            arrayList.add(c5917);
        }
        C5759 c5759M7399 = m7399(type, interfaceC5924, arrayList, true);
        C5845 c5845 = new C5845(3, type);
        boolean zEquals = c5759.equals(c5759M7399);
        Object c5771 = c5759;
        if (!zEquals) {
            c5771 = new C5771(c5759, c5759M7399, false, c5845);
        }
        return (C5771) c5771;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final int m7368(C1094 c1094) {
        int iM1416;
        int i = c1094.f1330;
        int iM14162 = c1094.m1416(0);
        while (c1094.f1330 != 0 && c1094.m1416(0) == iM14162) {
            c1094.m1352(0, c1094.m1415());
            c1094.m1353(c1094.f1330 - 1);
            int i2 = c1094.f1330;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iM14163 = c1094.m1416(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iM14164 = c1094.m1416(i6);
                if (i5 >= i2 || (iM1416 = c1094.m1416(i5)) <= iM14164) {
                    if (iM14164 > iM14163) {
                        c1094.m1352(i4, iM14164);
                        c1094.m1352(i6, iM14163);
                        i4 = i6;
                    }
                } else if (iM1416 > iM14163) {
                    c1094.m1352(i4, iM1416);
                    c1094.m1352(i5, iM14163);
                    i4 = i5;
                }
            }
        }
        return iM14162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7369(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        byte[] bArrM7393 = m7393(file);
        try {
            int length = bArrM7393.length;
            File file3 = new File(file2.getParent(), file2.getName() + ".tmp");
            if (m7370(file3)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    randomAccessFile.setLength(length);
                    randomAccessFile.write(bArrM7393, 0, length);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (!file3.renameTo(file2) && (!file2.exists() || file2.delete())) {
                        file3.renameTo(file2);
                    }
                } finally {
                }
            } else {
                new Exception("create file failed");
            }
        } catch (Exception e) {
            new Exception("save bytes failed", e);
        }
        m7391(file);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m7370(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final int m7371(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final String m7372(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        if (!AbstractC5971.m10698(str, str2, false) || !AbstractC5971.m10698(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (m7361(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final String m7373(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5523 c5523 = (C5523) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m7375(c5523));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final String m7374(String str, String str2, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722, InterfaceC7387 interfaceC7387) {
        str.getClass();
        str2.getClass();
        interfaceC7387.getClass();
        String str3 = (String) interfaceC7372.invoke();
        String strM7372 = m7372(str, AbstractC0900.m696(str3, "Mutable"), str2, str3, AbstractC0900.m696(str3, "(Mutable)"));
        if (strM7372 != null) {
            return strM7372;
        }
        String strM73722 = m7372(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strM73722 != null) {
            return strM73722;
        }
        String str4 = (String) interfaceC73722.invoke();
        StringBuilder sbM700 = AbstractC0900.m700(str4);
        sbM700.append((String) interfaceC7387.invoke("Array<"));
        String string = sbM700.toString();
        StringBuilder sbM7002 = AbstractC0900.m700(str4);
        sbM7002.append((String) interfaceC7387.invoke("Array<out "));
        String string2 = sbM7002.toString();
        StringBuilder sbM7003 = AbstractC0900.m700(str4);
        sbM7003.append((String) interfaceC7387.invoke("Array<(out) "));
        String strM73723 = m7372(str, string, str2, string2, sbM7003.toString());
        if (strM73723 != null) {
            return strM73723;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static String m7375(C5523 c5523) {
        c5523.getClass();
        String strM9894 = c5523.m9894();
        strM9894.getClass();
        if (!AbstractC5570.f14176.contains(strM9894)) {
            int i = 0;
            while (true) {
                if (i < strM9894.length()) {
                    char cCharAt = strM9894.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strM9894.length() != 0 && Character.isJavaIdentifierStart(strM9894.codePointAt(0))) {
                    return strM9894;
                }
            }
        }
        return "`".concat(strM9894).concat("`");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m7376(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = randomAccessFile.read(bArr, i2, i - i2);
                if (i3 < 0) {
                    break;
                } else {
                    i2 += i3;
                }
            } finally {
                m7400(randomAccessFile);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static C8401 m7377(String str) {
        String strGroup;
        if (str == null || AbstractC5976.m10731(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i2 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i3 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
        strGroup4.getClass();
        return new C8401(i, i2, strGroup4, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List m7378(Class cls) {
        cls.getClass();
        return AbstractC5954.m10669(AbstractC5954.m10673(AbstractC5954.m10674(cls, C5848.f14816), C5848.f14817));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m7379(C1094 c1094, int i) {
        if (c1094.f1330 == 0 || !(c1094.m1416(0) == i || c1094.m1416(c1094.f1330 - 1) == i)) {
            int i2 = c1094.f1330;
            c1094.m1355(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM1416 = c1094.m1416(i3);
                if (i <= iM1416) {
                    break;
                }
                c1094.m1352(i2, iM1416);
                i2 = i3;
            }
            c1094.m1352(i2, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object[] m7380(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC5179.m9399(0, i, objArr, 6, objArr2);
        AbstractC5179.m9394(i, i + 1, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object[] m7381(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC5179.m9399(0, i, objArr, 6, objArr2);
        AbstractC5179.m9394(i, i + 2, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object[] m7382(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC5179.m9399(0, i, objArr, 6, objArr2);
        AbstractC5179.m9394(i + 2, i, objArr, objArr.length, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7991 m7383(InterfaceC7387 interfaceC7387) {
        C7989 c7989 = AbstractC7988.f19470;
        c7989.getClass();
        C8003 c8003 = new C8003();
        C8006 c8006 = c7989.f19473;
        c8003.f19491 = c8006.f19502;
        c8003.f19490 = c8006.f19498;
        c8003.f19489 = c8006.f19501;
        c8003.f19488 = c8006.f19500;
        c8003.f19487 = c8006.f19499;
        String str = c8006.f19497;
        c8003.f19486 = str;
        c8003.f19493 = c8006.f19504;
        c8003.f19492 = c8006.f19505;
        c8003.f19495 = c8006.f19503;
        c8003.f19496 = c7989.f19472;
        c8003.f19494 = c8006.f19506;
        interfaceC7387.invoke(c8003);
        if (c8003.f19487) {
            if (!AbstractC5227.m9466(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        C6755.m11873("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!AbstractC5227.m9466(str, "    ")) {
            C6755.m11869("Indent should not be specified when default printing mode is used");
            return null;
        }
        boolean z = c8003.f19491;
        boolean z2 = c8003.f19489;
        boolean z3 = c8003.f19488;
        boolean z4 = c8003.f19487;
        boolean z5 = c8003.f19490;
        String str2 = c8003.f19486;
        String str3 = c8003.f19493;
        boolean z6 = c8003.f19495;
        ClassDiscriminatorMode classDiscriminatorMode = c8003.f19492;
        C8006 c80062 = new C8006(z, z2, z3, z4, z5, str2, str3, z6, classDiscriminatorMode, c8003.f19494);
        C2080 c2080 = c8003.f19496;
        c2080.getClass();
        C7991 c7991 = new C7991(c80062, c2080);
        if (c2080 == AbstractC6343.f15582) {
            return c7991;
        }
        boolean z7 = classDiscriminatorMode != ClassDiscriminatorMode.NONE;
        Iterator it = ((Map) c2080.f3965).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == null) {
                C5043.m9170();
                return null;
            }
            C3775.m6954();
            return null;
        }
        for (Map.Entry entry2 : ((Map) c2080.f3966).entrySet()) {
            InterfaceC5925 interfaceC5925 = (InterfaceC5925) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC5925 interfaceC59252 = (InterfaceC5925) entry3.getKey();
                InterfaceC8013 interfaceC8013 = (InterfaceC8013) entry3.getValue();
                interfaceC5925.getClass();
                interfaceC59252.getClass();
                interfaceC8013.getClass();
                AbstractC9019 kind = interfaceC8013.getDescriptor().getKind();
                if ((kind instanceof C8022) || AbstractC5227.m9466(kind, C8026.f19551)) {
                    C7092.m12334("Serializer for ", interfaceC59252.getSimpleName(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    return null;
                }
                if (z7 && (AbstractC5227.m9466(kind, C8027.f19555) || AbstractC5227.m9466(kind, C8027.f19553) || (kind instanceof C8021) || (kind instanceof C8025))) {
                    C7092.m12334("Serializer for ", interfaceC59252.getSimpleName(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.");
                    return null;
                }
            }
        }
        for (Map.Entry entry4 : ((Map) c2080.f3963).entrySet()) {
            InterfaceC5925 interfaceC59253 = (InterfaceC5925) entry4.getKey();
            InterfaceC7387 interfaceC73872 = (InterfaceC7387) entry4.getValue();
            interfaceC59253.getClass();
            interfaceC73872.getClass();
            AbstractC5220.m9447(1, interfaceC73872);
        }
        for (Map.Entry entry5 : ((Map) c2080.f3964).entrySet()) {
            InterfaceC5925 interfaceC59254 = (InterfaceC5925) entry5.getKey();
            InterfaceC7387 interfaceC73873 = (InterfaceC7387) entry5.getValue();
            interfaceC59254.getClass();
            interfaceC73873.getClass();
            AbstractC5220.m9447(1, interfaceC73873);
        }
        return c7991;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m7384(File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i = fileInputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    fileInputStream.close();
                    return new BigInteger(1, messageDigest.digest()).toString(16).toUpperCase();
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Object m7385(Class cls, String str, Object obj) {
        int i = C9915.f25813;
        C9915 c9915M15221 = C9915.m15221(obj.getClass());
        c9915M15221.f25815 = str;
        c9915M15221.f25814 = cls;
        return c9915M15221.m15224(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C2902 m7386(C2847 c2847, int i) {
        C2902 c2902 = c2847.f6292;
        C2902 c29022 = c2847.f6292;
        long j = c2847.f6291;
        int iM4310 = C2869.m4310(j);
        int iM43102 = C2869.m4310(j);
        int length = iM43102 + i;
        if (((i ^ length) & (iM43102 ^ length)) < 0) {
            length = c29022.f6474.length();
        }
        return c2902.subSequence(iM4310, Math.min(length, c29022.f6474.length()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2902 m7387(C2847 c2847, int i) {
        C2902 c2902 = c2847.f6292;
        long j = c2847.f6291;
        int iM4317 = C2869.m4317(j);
        int i2 = iM4317 - i;
        if (((iM4317 ^ i2) & (i ^ iM4317)) < 0) {
            i2 = 0;
        }
        return c2902.subSequence(Math.max(0, i2), C2869.m4317(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5836 m7388(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (C5836) AbstractC5228.f13320.mo9476((Class) genericDeclaration);
        }
        C5043.m9172("Non-class container of a type parameter is not supported: ", genericDeclaration, " (", typeVariable);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C2902 m7389(C2847 c2847) {
        C2902 c2902 = c2847.f6292;
        long j = c2847.f6291;
        c2902.getClass();
        return c2902.subSequence(C2869.m4317(j), C2869.m4310(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m7390(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m7390(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m7391(File file) {
        try {
            if (file.exists()) {
                m7390(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C6554 m7392(DexKitBridge dexKitBridge, C9763 c9763) {
        dexKitBridge.getClass();
        int iM7848 = c9763.m7848(4);
        int i = iM7848 != 0 ? c9763.f11199.getInt(iM7848 + c9763.f11200) : 0;
        int iM78482 = c9763.m7848(6);
        int i2 = iM78482 != 0 ? c9763.f11199.getInt(iM78482 + c9763.f11200) : 0;
        int iM78483 = c9763.m7848(8);
        if (iM78483 != 0) {
            c9763.m7846(iM78483 + c9763.f11200);
        }
        int iM78484 = c9763.m7848(10);
        int i3 = iM78484 != 0 ? c9763.f11199.getInt(iM78484 + c9763.f11200) : 0;
        int iM78485 = c9763.m7848(12);
        String strM7846 = iM78485 != 0 ? c9763.m7846(iM78485 + c9763.f11200) : null;
        if (strM7846 == null) {
            strM7846 = "";
        }
        String str = strM7846;
        int iM78486 = c9763.m7848(14);
        int i4 = iM78486 != 0 ? c9763.f11199.getInt(iM78486 + c9763.f11200) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM78487 = c9763.m7848(16);
        int iM7844 = iM78487 != 0 ? c9763.m7844(iM78487) : 0;
        for (int i5 = 0; i5 < iM7844; i5++) {
            int iM78488 = c9763.m7848(16);
            arrayList.add(Integer.valueOf(iM78488 != 0 ? c9763.f11199.getInt((i5 * 4) + c9763.m7845(iM78488)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM78489 = c9763.m7848(18);
        int iM78442 = iM78489 != 0 ? c9763.m7844(iM78489) : 0;
        for (int i6 = 0; i6 < iM78442; i6++) {
            int iM784810 = c9763.m7848(18);
            arrayList2.add(Integer.valueOf(iM784810 != 0 ? c9763.f11199.getInt((i6 * 4) + c9763.m7845(iM784810)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM784811 = c9763.m7848(20);
        int iM78443 = iM784811 != 0 ? c9763.m7844(iM784811) : 0;
        for (int i7 = 0; i7 < iM78443; i7++) {
            int iM784812 = c9763.m7848(20);
            arrayList3.add(Integer.valueOf(iM784812 != 0 ? c9763.f11199.getInt((i7 * 4) + c9763.m7845(iM784812)) : 0));
        }
        return new C6554(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static byte[] m7393(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            C8376.m13323(file.getPath(), "file too large, path:");
            return null;
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        m7376(file, bArr, i);
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m7394(int i) {
        switch (i) {
            case 0:
                return "fieldReader0";
            case 1:
                return "fieldReader1";
            case 2:
                return "fieldReader2";
            case 3:
                return "fieldReader3";
            case 4:
                return "fieldReader4";
            case 5:
                return "fieldReader5";
            case 6:
                return "fieldReader6";
            case 7:
                return "fieldReader7";
            case 8:
                return "fieldReader8";
            case 9:
                return "fieldReader9";
            case 10:
                return "fieldReader10";
            case 11:
                return "fieldReader11";
            case 12:
                return "fieldReader12";
            case 13:
                return "fieldReader13";
            case 14:
                return "fieldReader14";
            case 15:
                return "fieldReader15";
            default:
                char[] cArr = new char[AbstractC3682.m6316(i) + 11];
                "fieldReader".getChars(0, 11, cArr, 0);
                AbstractC3682.m6312(cArr, 11, i);
                return new String(cArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m7395(int i) {
        if (i >= 1024) {
            return i < 1048576 ? String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) i) / 1024.0d)}, 1)).concat(" KB") : String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) i) / 1048576.0d)}, 1)).concat(" MB");
        }
        return i + " B";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m7396(AutoCloseable autoCloseable, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    AbstractC7012.m12134(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    AbstractC6019.m10775(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    C6755.m11865();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m7397(Object obj, String str, Object... objArr) {
        obj.getClass();
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            arrayList.add(obj2 == null ? C9496.class : obj2.getClass());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        int i2 = C9921.f25825;
        C9921 c9921M15231 = C9921.m15231(obj.getClass());
        c9921M15231.f25826 = str;
        c9921M15231.m15234((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        return c9921M15231.m15233(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static InterfaceC8083 m7398(String str, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC5714) it.next()).mo10283());
        }
        C8103 c8103M8867 = AbstractC4765.m8867(arrayList);
        int i = c8103M8867.f19719;
        InterfaceC8083 c8082 = i != 0 ? i != 1 ? new C8082(str, (InterfaceC8083[]) c8103M8867.toArray(new InterfaceC8083[0])) : (InterfaceC8083) c8103M8867.get(0) : C8084.f19681;
        return c8103M8867.f19719 <= 1 ? c8082 : new C8094(c8082);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C5759 m7399(Type type, InterfaceC5924 interfaceC5924, List list, boolean z) {
        return new C5759(interfaceC5924, list, z, EmptyList.INSTANCE, null, false, false, false, null, new C5845(2, type));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m7400(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C6951 m7401(String str, C6973 c6973) {
        str.getClass();
        Pair pairM12447 = AbstractC7173.m12447(c6973);
        Charset charset = (Charset) pairM12447.component1();
        C6973 c69732 = (C6973) pairM12447.component2();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        AbstractC7054.m12240(bytes.length, 0L, length);
        return new C6951(c69732, length, bytes);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract int mo7402(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract int mo7403(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public abstract int mo7404(boolean z);
}
