package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.ui.platform.C1908;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
import com.alibaba.fastjson2.util.C2864;
import com.bumptech.glide.AbstractC3065;
import io.ktor.client.plugins.api.C3886;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p009.AbstractC6183;
import p278.C8365;
import p295.InterfaceC8572;
import p295.InterfaceC8573;
import p295.InterfaceC8574;
import p295.InterfaceC8575;
import p295.InterfaceC8576;
import p297.AbstractC8591;
import p297.C8587;
import p297.C8589;
import p297.C8590;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2731 extends C2776 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String f8309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String f8310;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final String f8311;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String[] f8312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String f8313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String f8314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String f8315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String f8316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String f8317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final String f8318;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String f8319;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String f8321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String f8322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String f8323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String f8324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2864 f8325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2731 f8308 = new C2731(C2864.f9008);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AtomicLong f8320 = new AtomicLong();

    static {
        StringBuilder sb = new StringBuilder("(");
        String str = AbstractC8591.f23980;
        sb.append(str);
        sb.append(")");
        String str2 = AbstractC8591.f23977;
        sb.append(str2);
        f8319 = sb.toString();
        f8323 = AbstractC6183.m11581("(", str, ")", str2);
        StringBuilder sb2 = new StringBuilder("(Ljava/lang/Class;Ljava/util/function/Supplier;");
        String str3 = AbstractC8591.f23984;
        f8324 = AbstractC0053.m151(sb2, str3, ")V");
        f8321 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;J" + AbstractC8591.f23979 + "Ljava/util/function/Supplier;Ljava/util/function/Function;" + str3 + ")V";
        f8322 = AbstractC0053.m158("(", str, "Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;");
        StringBuilder sb3 = new StringBuilder("(J)");
        sb3.append(AbstractC8591.f23985);
        f8314 = sb3.toString();
        f8313 = AbstractC0053.m158("(", str, "Ljava/lang/Object;)V");
        f8317 = AbstractC0053.m158("(J", str, "JLjava/lang/Object;)V");
        f8318 = AbstractC0053.m158("(", str, "Ljava/lang/Object;Ljava/lang/String;)V");
        f8315 = AbstractC6183.m11581("(", str, ")", str2);
        f8316 = AbstractC0053.m158("(", str, "Ljava/lang/Object;J)V");
        f8310 = AbstractC6183.m11581("(", str, "J)", str2);
        f8309 = AbstractC0053.m158("(", str, "Ljava/lang/Object;I)V");
        HashMap map = new HashMap();
        Package r1 = C2731.class.getPackage();
        f8311 = r1 != null ? r1.getName() : "";
        AbstractC8591.m14216(InterfaceC8576.class);
        int i = 13;
        map.put(Boolean.TYPE, new C3886(i));
        AbstractC8591.m14216(InterfaceC8574.class);
        map.put(Character.TYPE, new C3886(i));
        AbstractC8591.m14216(InterfaceC8575.class);
        map.put(Byte.TYPE, new C3886(i));
        AbstractC8591.m14216(InterfaceC8572.class);
        map.put(Short.TYPE, new C3886(i));
        AbstractC8591.m14216(ObjIntConsumer.class);
        map.put(Integer.TYPE, new C3886(i));
        AbstractC8591.m14216(ObjLongConsumer.class);
        map.put(Long.TYPE, new C3886(i));
        AbstractC8591.m14216(InterfaceC8573.class);
        map.put(Float.TYPE, new C3886(i));
        AbstractC8591.m14216(ObjDoubleConsumer.class);
        map.put(Double.TYPE, new C3886(i));
        AbstractC8591.m14216(BiConsumer.class);
        map.put(String.class, new C3886(i));
        AbstractC8591.m14216(BiConsumer.class);
        map.put(Integer.class, new C3886(i));
        f8312 = new String[1024];
    }

    public C2731(ClassLoader classLoader) {
        this.f8325 = classLoader instanceof C2864 ? (C2864) classLoader : new C2864(classLoader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m5509(C8587 c8587, String str, Constructor constructor) {
        c8587.m14174(str);
        c8587.m14196();
        if (constructor.getParameterCount() == 0) {
            c8587.m14187(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
            return;
        }
        Class<?> cls = constructor.getParameterTypes()[0];
        c8587.m14156(1);
        c8587.m14187(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(" + AbstractC8591.m14218(cls) + ")V");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static void m5510(AbstractC2762 abstractC2762, String str, C1908 c1908, int i, int i2, boolean z, Class cls, Type type, long j, Type type2, String str2, C2732 c2732) {
        Class cls2;
        int iM3604;
        String str3;
        String str4;
        String str5;
        int i3;
        Type type3;
        String str6;
        String str7;
        int i4;
        String str8;
        C8589 c8589;
        AbstractC2762 abstractC27622;
        int i5;
        Type type4;
        int i6;
        C8589 c85892;
        String str9;
        String str10;
        String str11;
        C8589 c85893;
        Field field;
        boolean z2 = c1908.f5626;
        Type type5 = type2 == null ? Object.class : type2;
        Class clsM5942 = AbstractC2867.m5942(type5);
        String strM5518 = m5518(i2);
        C8587 c8587 = (C8587) c1908.f5624;
        if (c2732.f8333 instanceof C2798) {
            iM3604 = c1908.m3605(abstractC2762);
            cls2 = cls;
        } else {
            cls2 = cls;
            iM3604 = c1908.m3604(cls2);
        }
        int iM36042 = c1908.m3604(InterfaceC2788.class);
        String str12 = cls2.isInterface() ? "java/util/ArrayList" : str2;
        C8589 c85894 = new C8589();
        C8589 c85895 = new C8589();
        C8589 c85896 = new C8589();
        Type type6 = type5;
        boolean z3 = AbstractC2854.f8918 == 8 && "java/util/ArrayList".equals(str12);
        int iM36043 = c1908.m3604("ITEM_CNT");
        boolean z4 = z3;
        String str13 = "java/util/List";
        String str14 = "add";
        String str15 = "(Ljava/lang/Object;)Z";
        String str16 = f8322;
        Class cls3 = String.class;
        if (z2) {
            if (c2732.m5533()) {
                c85892 = c85895;
                str9 = "(I)V";
                str10 = str12;
                str11 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            } else {
                str9 = "(I)V";
                C8589 c85897 = new C8589();
                str11 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                c8587.m14182(0);
                str10 = str12;
                c8587.m14199(str, AbstractC3065.m6834(i2), AbstractC8591.f23985);
                c8587.m14182(1);
                c85892 = c85895;
                c8587.m14186(AbstractC8591.f24014, "checkObjectAutoType", f8315);
                c8587.m14196();
                c8587.m14180(iM36042);
                c8587.m14192(c85897);
                c8587.m14182(iM36042);
                c8587.m14182(1);
                m5511(str, c8587, i2, type);
                c8587.m14202(abstractC2762.f8428);
                c8587.m14153(j);
                c8587.m14183(AbstractC8591.f24012, "readJSONBObject", str16);
                c8587.m14178(str2);
                c8587.m14180(iM3604);
                c8587.m14197(c85894);
                c8587.m14158(c85897);
            }
            c8587.m14182(1);
            c8587.m14186(AbstractC8591.f24015, "startArray", "()I");
            c8587.m14196();
            c8587.m14170(iM36043);
            c8587.m14157(-1);
            C8589 c85898 = c85892;
            c8587.m14155(160, c85898);
            c8587.m14156(1);
            c8587.m14180(iM3604);
            c8587.m14197(c85894);
            c8587.m14158(c85898);
            if (abstractC2762.f8427 != null || (field = abstractC2762.f8424) == null) {
                c85893 = c85896;
                str3 = "readJSONBObject";
            } else {
                long jObjectFieldOffset = AbstractC2854.f8921.objectFieldOffset(field);
                c8587.m14200(AbstractC8591.f24003, "UNSAFE", "Lsun/misc/Unsafe;");
                c8587.m14182(i);
                c8587.m14153(jObjectFieldOffset);
                c8587.m14186("sun/misc/Unsafe", "getObject", "(Ljava/lang/Object;J)Ljava/lang/Object;");
                c8587.m14196();
                c8587.m14178(str2);
                c8587.m14180(iM3604);
                C8589 c85899 = new C8589();
                c8587.m14192(c85899);
                c8587.m14182(iM3604);
                c8587.m14186(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, "getClass", "()Ljava/lang/Class;");
                str3 = "readJSONBObject";
                c8587.m14200("java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
                c8587.m14186(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, "getClass", "()Ljava/lang/Class;");
                c85893 = c85896;
                c8587.m14189(c85893);
                c8587.m14158(c85899);
            }
            String str17 = str10;
            c8587.m14174(str17);
            c8587.m14196();
            if (z4) {
                c8587.m14184(iM36043);
                c8587.m14187(str17, str11, str9);
            } else {
                c8587.m14187(str17, str11, "()V");
            }
            c8587.m14180(iM3604);
            c8587.m14158(c85893);
            str4 = str16;
            i3 = iM36043;
            type3 = type6;
            str6 = "readString";
            str5 = "()Z";
        } else {
            str3 = "readJSONBObject";
            String str18 = str12;
            C8589 c858910 = new C8589();
            C8589 c858911 = new C8589();
            C8589 c858912 = new C8589();
            str4 = str16;
            c8587.m14182(1);
            String str19 = AbstractC8591.f24015;
            str5 = "()Z";
            c8587.m14186(str19, "nextIfNull", str5);
            c8587.m14194(c858912);
            c8587.m14182(1);
            c8587.m14186(str19, "nextIfArrayStart", str5);
            c8587.m14194(c858910);
            if (clsM5942 == cls3) {
                i3 = iM36043;
                c8587.m14182(1);
                c8587.m14186(str19, "isString", str5);
                c8587.m14193(c858911);
                c8587.m14174(str18);
                c8587.m14196();
                if (z4) {
                    c8587.m14157(10);
                    c8587.m14187(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
                } else {
                    c8587.m14187(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
                }
                c8587.m14180(iM3604);
                c8587.m14182(1);
                c8587.m14186(str19, "nextIfNullOrEmptyString", str5);
                c8587.m14194(c85894);
                c8587.m14182(iM3604);
                c8587.m14182(1);
                if (clsM5942 == cls3) {
                    str7 = "readString";
                    c8587.m14186(str19, str7, "()Ljava/lang/String;");
                } else {
                    str7 = "readString";
                }
                cls3 = cls3;
                c8587.m14183(str13, str14, str15);
                c8587.m14173();
                c8587.m14197(c85894);
                str13 = str13;
                str14 = str14;
                str15 = str15;
                type3 = type6;
                str6 = str7;
            } else {
                cls3 = cls3;
                i3 = iM36043;
                type3 = type6;
                str6 = "readString";
                if (type3 instanceof Class) {
                    c8587.m14182(1);
                    c8587.m14186(str19, "nextIfNullOrEmptyString", str5);
                    c8587.m14194(c858912);
                    c8587.m14174(str18);
                    c8587.m14196();
                    if (z4) {
                        c8587.m14157(10);
                        c8587.m14187(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
                    } else {
                        c8587.m14187(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
                    }
                    c8587.m14180(iM3604);
                    c8587.m14182(1);
                    c8587.m14182(iM3604);
                    c8587.m14154((Class) type3);
                    c8587.m14186(str19, "readArray", "(Ljava/util/List;Ljava/lang/reflect/Type;)V");
                    c8587.m14197(c85894);
                }
            }
            c8587.m14158(c858911);
            c8587.m14182(1);
            c8587.m14186(str19, "skipValue", "()V");
            c8587.m14158(c858912);
            c8587.m14156(1);
            c8587.m14180(iM3604);
            c8587.m14197(c85894);
            c8587.m14158(c858910);
            c8587.m14174(str18);
            c8587.m14196();
            if (z4) {
                c8587.m14157(10);
                c8587.m14187(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
            } else {
                c8587.m14187(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
            }
            c8587.m14180(iM3604);
        }
        int iM36044 = c1908.m3604("J");
        C8589 c858913 = new C8589();
        C8589 c858914 = new C8589();
        C8589 c858915 = new C8589();
        c8587.m14156(3);
        c8587.m14170(iM36044);
        c8587.m14158(c858913);
        if (z2) {
            c8587.m14184(iM36044);
            c8587.m14184(i3);
            c8587.m14155(162, c858914);
            i4 = 1;
        } else {
            i4 = 1;
            c8587.m14182(1);
            c8587.m14186(AbstractC8591.f24015, "nextIfArrayEnd", str5);
            c8587.m14194(c858914);
        }
        if (type3 == cls3) {
            c8587.m14182(iM3604);
            c8587.m14182(i4);
            c8587.m14186(AbstractC8591.f24015, str6, "()Ljava/lang/String;");
        } else if (type3 == Integer.class) {
            c8587.m14182(iM3604);
            c8587.m14182(i4);
            c8587.m14186(AbstractC8591.f24015, "readInt32", "()Ljava/lang/Integer;");
        } else {
            if (type3 != Long.class) {
                C8589 c858916 = new C8589();
                c8587.m14182(0);
                String str20 = AbstractC8591.f23977;
                c8587.m14199(str, strM5518, str20);
                c8587.m14191(c858916);
                c8587.m14182(0);
                c8587.m14182(0);
                c8587.m14199(str, AbstractC3065.m6834(i2), AbstractC8591.f23985);
                c8587.m14182(1);
                c8587.m14186(AbstractC8591.f24014, "getItemObjectReader", f8319);
                c8587.m14171(str, strM5518, str20);
                c8587.m14158(c858916);
                if ((c2732.f8331.f23100 & 144115188075855872L) == 0) {
                    c8587.m14182(1);
                    c8587.m14182(iM3604);
                    c8587.m14184(iM36044);
                    c8587.m14186(AbstractC8591.f24015, "readReference", "(Ljava/util/List;I)Z");
                    c8587.m14194(c858915);
                }
                c8587.m14182(iM3604);
                C8589 c858917 = new C8589();
                C8589 c858918 = new C8589();
                if (z) {
                    c8587.m14182(1);
                    c8587.m14186(AbstractC8591.f24015, "isArray", str5);
                    c8587.m14193(c858917);
                    c8587.m14182(0);
                    c8587.m14199(str, strM5518, str20);
                    c8587.m14182(1);
                    i5 = i2;
                    type4 = type;
                    m5511(str, c8587, i5, type4);
                    abstractC27622 = abstractC2762;
                    c8587.m14202(abstractC27622.f8428);
                    c8587.m14166(4);
                    String str21 = AbstractC8591.f24012;
                    String str22 = z2 ? "readArrayMappingJSONBObject" : "readArrayMappingObject";
                    str8 = str4;
                    c8589 = c85894;
                    i6 = iM3604;
                    c8587.m14183(str21, str22, str8);
                    c8587.m14197(c858918);
                    c8587.m14158(c858917);
                } else {
                    str8 = str4;
                    c8589 = c85894;
                    abstractC27622 = abstractC2762;
                    i5 = i2;
                    type4 = type;
                    i6 = iM3604;
                }
                c8587.m14182(0);
                c8587.m14199(str, strM5518, str20);
                c8587.m14182(1);
                m5511(str, c8587, i5, type4);
                c8587.m14202(abstractC27622.f8428);
                c8587.m14166(4);
                c8587.m14183(AbstractC8591.f24012, z2 ? str3 : "readObject", str8);
                if (z) {
                    c8587.m14158(c858918);
                }
                c8587.m14183(str13, str14, str15);
                c8587.m14173();
                c8587.m14158(c858915);
                c8587.m14160(iM36044, 1);
                c8587.m14197(c858913);
                c8587.m14158(c858914);
                c8587.m14158(c8589);
                c8587.m14182(i6);
            }
            c8587.m14182(iM3604);
            c8587.m14182(i4);
            c8587.m14186(AbstractC8591.f24015, "readInt64", "()Ljava/lang/Long;");
        }
        c8589 = c85894;
        i6 = iM3604;
        c8587.m14183(str13, str14, str15);
        c8587.m14173();
        c8587.m14158(c858915);
        c8587.m14160(iM36044, 1);
        c8587.m14197(c858913);
        c8587.m14158(c858914);
        c8587.m14158(c8589);
        c8587.m14182(i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static void m5511(String str, C8587 c8587, int i, Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            String name = cls.getName();
            boolean zIsPublic = Modifier.isPublic(cls.getModifiers());
            boolean z = name.startsWith("java.") || cls == JSONArray.class || cls == JSONObject.class;
            if (zIsPublic && z) {
                c8587.m14154(cls);
                return;
            }
        }
        c8587.m14182(0);
        c8587.m14199(str, AbstractC3065.m6834(i), AbstractC8591.f23985);
        c8587.m14199(AbstractC8591.f24014, "fieldType", "Ljava/lang/reflect/Type;");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5512(com.alibaba.fastjson2.reader.AbstractC2762 r29, java.lang.String r30, androidx.compose.ui.platform.C1908 r31, int r32, java.lang.reflect.Type r33, java.lang.Class r34, long r35, java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2731.m5512(com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, java.lang.String, androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, int, java.lang.reflect.Type, java.lang.Class, long, java.lang.String):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m5513(AbstractC2762[] abstractC2762Arr, C1908 c1908) {
        C8587 c8587 = (C8587) c1908.f5624;
        for (AbstractC2762 abstractC2762 : abstractC2762Arr) {
            Class cls = abstractC2762.f8429;
            int iM3605 = c1908.m3605(abstractC2762);
            if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Boolean.TYPE || cls == Character.TYPE) {
                c8587.m14156(3);
                c8587.m14170(iM3605);
            } else if (cls == Long.TYPE) {
                c8587.m14167();
                c8587.m14175(iM3605);
            } else if (cls == Float.TYPE) {
                c8587.m14156(3);
                c8587.m14156(134);
                c8587.m14201(56, iM3605);
            } else if (cls == Double.TYPE) {
                c8587.m14156(3);
                c8587.m14156(135);
                c8587.m14201(57, iM3605);
            } else {
                c8587.m14156(1);
                c8587.m14180(iM3605);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m5514(AbstractC2762[] abstractC2762Arr, String str, boolean z, int i, C8587 c8587, String str2) {
        if ((str2 == AbstractC8591.f24013 || str2 == AbstractC8591.f23997) && z) {
            for (int i2 = 0; i2 < abstractC2762Arr.length; i2++) {
                c8587.m14182(0);
                c8587.m14182(i);
                c8587.m14190(i2);
                c8587.m14156(50);
                c8587.m14171(str, AbstractC3065.m6834(i2), AbstractC8591.f23985);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static void m5515(AbstractC2762[] abstractC2762Arr, C8590 c8590, String str) {
        if (str == AbstractC8591.f24013 || str == AbstractC8591.f23997) {
            for (int i = 0; i < abstractC2762Arr.length; i++) {
                c8590.m14212(AbstractC3065.m6834(i), AbstractC8591.f23985);
            }
            for (int i2 = 0; i2 < abstractC2762Arr.length; i2++) {
                c8590.m14212(m5517(i2), AbstractC8591.f23977);
            }
        }
        for (int i3 = 0; i3 < abstractC2762Arr.length; i3++) {
            if (List.class.isAssignableFrom(abstractC2762Arr[i3].f8429)) {
                c8590.m14212(m5518(i3), AbstractC8591.f23977);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m5516(String str, C1908 c1908) {
        C8587 c8587 = (C8587) c1908.f5624;
        int iM3604 = c1908.m3604("autoTypeObjectReader");
        C8589 c8589 = new C8589();
        c8587.m14182(0);
        c8587.m14182(1);
        c8587.m14166(4);
        c8587.m14186(str, "checkAutoType", f8310);
        c8587.m14196();
        c8587.m14180(iM3604);
        c8587.m14192(c8589);
        c8587.m14182(iM3604);
        c8587.m14182(1);
        c8587.m14182(2);
        c8587.m14182(3);
        c8587.m14166(4);
        c8587.m14183(AbstractC8591.f24012, "readJSONBObject", f8322);
        c8587.m14181();
        c8587.m14158(c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m5517(int i) {
        switch (i) {
            case 0:
                return "objectReader0";
            case 1:
                return "objectReader1";
            case 2:
                return "objectReader2";
            case 3:
                return "objectReader3";
            case 4:
                return "objectReader4";
            case 5:
                return "objectReader5";
            case 6:
                return "objectReader6";
            case 7:
                return "objectReader7";
            case 8:
                return "objectReader8";
            case 9:
                return "objectReader9";
            case 10:
                return "objectReader10";
            case 11:
                return "objectReader11";
            case 12:
                return "objectReader12";
            case 13:
                return "objectReader13";
            case 14:
                return "objectReader14";
            case 15:
                return "objectReader15";
            default:
                int iM5756 = AbstractC2849.m5756(i) + 12;
                char[] cArr = new char[iM5756];
                "objectReader".getChars(0, 12, cArr, 0);
                AbstractC2849.m5732(i, iM5756, cArr);
                return new String(cArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static String m5518(int i) {
        String[] strArr = f8312;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int iM5756 = AbstractC2849.m5756(i) + 10;
        char[] cArr = new char[iM5756];
        "itemReader".getChars(0, 10, cArr, 0);
        AbstractC2849.m5732(i, iM5756, cArr);
        String str2 = new String(cArr);
        strArr[i] = str2;
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0296  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.reader.C2772 m5519(java.lang.Class r31, java.lang.reflect.Type r32, boolean r33, boolean r34, int r35, p278.C8365 r36, java.util.function.Supplier r37, com.alibaba.fastjson2.reader.AbstractC2762[] r38, java.lang.reflect.Constructor r39) {
        /*
            Method dump skipped, instruction units count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2731.m5519(java.lang.Class, java.lang.reflect.Type, boolean, boolean, int, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, java.util.function.Supplier, com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰[], java.lang.reflect.Constructor):com.alibaba.fastjson2.reader.飘花落叶言子苏世楪哲兰");
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0798 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5520(com.alibaba.fastjson2.reader.C2732 r69, com.alibaba.fastjson2.reader.AbstractC2762 r70, boolean r71, androidx.compose.ui.platform.C1908 r72, int r73, int r74, boolean r75) {
        /*
            Method dump skipped, instruction units count: 2611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2731.m5520(com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, boolean, androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, int, int, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m5521(C2732 c2732, C1908 c1908, int i, boolean z, int i2, C8589 c8589) {
        AbstractC2762[] abstractC2762Arr = c2732.f8326;
        C8587 c8587 = (C8587) c1908.f5624;
        c8587.m14182(0);
        c8587.m14166(i);
        c8587.m14186(AbstractC8591.f24013, "getFieldOrdinal", "(J)I");
        C8589 c85892 = new C8589();
        C8589[] c8589Arr = new C8589[abstractC2762Arr.length];
        int[] iArr = new int[abstractC2762Arr.length];
        for (int i3 = 0; i3 < abstractC2762Arr.length; i3++) {
            c8589Arr[i3] = new C8589();
            iArr[i3] = i3;
        }
        c8587.m14206(c85892, iArr, c8589Arr);
        for (int i4 = 0; i4 < abstractC2762Arr.length; i4++) {
            c8587.m14158(c8589Arr[i4]);
            m5520(c2732, abstractC2762Arr[i4], z, c1908, i2, i4, false);
            c8587.m14197(c8589);
        }
        c8587.m14158(c85892);
        c8587.m14182(1);
        c8587.m14186(AbstractC8591.f24015, "skipValue", "()V");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m5522(C2732 c2732, boolean z, C1908 c1908, int i, C8589 c8589, C8589 c85892) {
        String str;
        C1908 c19082 = c1908;
        C2732 c27322 = c2732;
        AbstractC2762[] abstractC2762Arr = c27322.f8326;
        int iM3603 = c19082.m3603("RAW_LONG");
        C8587 c8587 = (C8587) c19082.f5624;
        c8587.m14182(1);
        c8587.m14186(AbstractC8591.f24015, "getRawLong", "()J");
        c8587.m14156(92);
        c8587.m14175(iM3603);
        c8587.m14167();
        c8587.m14168();
        c8587.m14193(c85892);
        int i2 = 0;
        int i3 = 0;
        while (i3 < abstractC2762Arr.length) {
            C8589 c85893 = new C8589();
            AbstractC2762 abstractC2762 = abstractC2762Arr[i3];
            byte[] bytes = abstractC2762.f8428.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            byte[] bArr = new byte[8];
            if (length == 5) {
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 5);
                bArr[6] = 34;
                bArr[7] = 58;
                str = "nextIfName8Match0";
            } else if (length == 6) {
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 6);
                bArr[7] = 34;
                str = "nextIfName8Match1";
            } else if (length != 7) {
                C5925.m11311(AbstractC6183.m11588(length, "length "));
                return;
            } else {
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 7);
                str = "nextIfName8Match2";
            }
            long j = AbstractC2854.f8921.getLong(bArr, AbstractC2854.f8920);
            c8587.m14166(iM3603);
            c8587.m14153(j);
            c8587.m14168();
            c8587.m14194(c85893);
            c8587.m14182(1);
            c8587.m14186(AbstractC8591.f24015, str, "()Z");
            c8587.m14193(c85892);
            m5520(c27322, abstractC2762, z, c19082, i, i3, false);
            c8587.m14197(c8589);
            c8587.m14158(c85893);
            i3++;
            c27322 = c2732;
            c19082 = c1908;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m5523(C2732 c2732, long j) {
        int i;
        String str;
        C1908 c1908;
        C8589 c8589;
        int i2;
        boolean z;
        C8589 c85892;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        C8589 c85893;
        int i6;
        C8589 c85894;
        AbstractC2762[] abstractC2762Arr;
        int i7;
        C2731 c2731;
        C2732 c27322;
        C1908 c19082;
        int i8;
        int i9;
        String str2 = c2732.f8339;
        AbstractC2762[] abstractC2762Arr2 = c2732.f8326;
        Class cls = c2732.f8330;
        boolean z5 = (j & JSONReader$Feature.FieldBased.mask) != 0;
        C2772 c2772 = c2732.f8333;
        C8590 c8590 = c2732.f8329;
        String str3 = f8322;
        C8587 c8587M14211 = c8590.m14211(2048, "readJSONBObject", str3);
        boolean zM5531 = c2732.m5531();
        boolean zM5533 = c2732.m5533();
        boolean z6 = z5;
        C1908 c19083 = new C1908(c8587M14211, true);
        c8587M14211.m14182(1);
        c8587M14211.m14166(4);
        String str4 = AbstractC8591.f24015;
        c8587M14211.m14186(str4, "features", "(J)J");
        c8587M14211.m14175(4);
        int iM3604 = c19083.m3604("object");
        int iM36042 = c19083.m3604("I");
        int iM3603 = c19083.m3603("hashCode64");
        int iM36043 = c19083.m3604("hashCode32");
        int iM36044 = c19083.m3604("fieldReader");
        if (!zM5533) {
            m5516(str2, c19083);
        }
        C8589 c85895 = new C8589();
        c8587M14211.m14182(1);
        c8587M14211.m14186(str4, "nextIfNull", "()Z");
        c8587M14211.m14193(c85895);
        c8587M14211.m14156(1);
        c8587M14211.m14181();
        c8587M14211.m14158(c85895);
        if (cls != null && !Serializable.class.isAssignableFrom(cls)) {
            c8587M14211.m14182(1);
            c8587M14211.m14182(0);
            c8587M14211.m14199(str2, "objectClass", "Ljava/lang/Class;");
            c8587M14211.m14186(str4, "errorOnNoneSerializable", "(Ljava/lang/Class;)V");
        }
        if (!zM5531) {
            C8589 c85896 = new C8589();
            C8589 c85897 = new C8589();
            c8587M14211.m14182(1);
            c8587M14211.m14186(str4, "isArray", "()Z");
            c8587M14211.m14193(c85896);
            c8587M14211.m14182(1);
            c8587M14211.m14186(str4, "isSupportBeanArray", "()Z");
            c8587M14211.m14193(c85897);
            c8587M14211.m14182(0);
            c8587M14211.m14182(1);
            c8587M14211.m14182(2);
            c8587M14211.m14182(3);
            c8587M14211.m14166(4);
            c8587M14211.m14186(str2, "readArrayMappingObject", str3);
            c8587M14211.m14181();
            c8587M14211.m14158(c85897);
            c8587M14211.m14158(c85896);
        }
        if (c2732.f8333 instanceof C2798) {
            C8589 c85898 = new C8589();
            C8589 c85899 = new C8589();
            c8587M14211.m14182(1);
            c8587M14211.m14186(str4, "hasAutoTypeBeforeHandler", "()Z");
            c8587M14211.m14194(c85898);
            c8587M14211.m14166(4);
            i = iM3603;
            str = str4;
            c8587M14211.m14153(JSONReader$Feature.SupportSmartMatch.mask | JSONReader$Feature.SupportAutoType.mask);
            c8587M14211.m14169();
            c8587M14211.m14167();
            c8587M14211.m14168();
            c8587M14211.m14193(c85899);
            c8587M14211.m14158(c85898);
            c8587M14211.m14182(0);
            c8587M14211.m14182(1);
            c8587M14211.m14182(2);
            c8587M14211.m14182(3);
            c8587M14211.m14166(4);
            c8587M14211.m14187(AbstractC8591.f23997, "readJSONBObject", str3);
            c8587M14211.m14181();
            c8587M14211.m14158(c85899);
            m5513(abstractC2762Arr2, c19083);
        } else {
            i = iM3603;
            str = str4;
            m5527(c8587M14211, c2732, str2);
            c8587M14211.m14180(iM3604);
        }
        c8587M14211.m14182(1);
        String str5 = str;
        c8587M14211.m14186(str5, "nextIfObjectStart", "()Z");
        c8587M14211.m14173();
        C8589 c858910 = new C8589();
        C8589 c858911 = new C8589();
        C8589 c858912 = new C8589();
        if (!zM5533) {
            c8587M14211.m14156(3);
            c8587M14211.m14170(iM36042);
        }
        c8587M14211.m14158(c858910);
        C8589 c858913 = new C8589();
        c8587M14211.m14182(1);
        c8587M14211.m14186(str5, "nextIfObjectEnd", "()Z");
        c8587M14211.m14194(c858911);
        if (c2732.f8334 < 2 || c2732.f8338 > 43) {
            c1908 = c19083;
            c8589 = c858913;
            i2 = iM36044;
            z = z6;
            c85892 = c858912;
            i3 = iM3604;
            i4 = iM36043;
            z2 = false;
        } else {
            i4 = iM36043;
            i2 = iM36044;
            m5524(c2732, z6, c19083, iM3604, c858912, c858913);
            c8589 = c858913;
            c85892 = c858912;
            i3 = iM3604;
            c1908 = c19083;
            z = z6;
            z2 = true;
        }
        c8587M14211.m14158(c8589);
        c8587M14211.m14182(1);
        c8587M14211.m14186(str5, "readFieldNameHashCode", "()J");
        c8587M14211.m14156(92);
        int i10 = i;
        c8587M14211.m14175(i10);
        c8587M14211.m14167();
        c8587M14211.m14168();
        c8587M14211.m14193(c85892);
        if (zM5533 || (c2732.f8333 instanceof C2798)) {
            i5 = i10;
            z3 = z2;
            z4 = z;
        } else {
            C8589 c858914 = new C8589();
            c8587M14211.m14166(i10);
            z3 = z2;
            c8587M14211.m14182(0);
            z4 = z;
            c8587M14211.m14199(str2, "typeKeyHashCode", "J");
            c8587M14211.m14168();
            c8587M14211.m14194(c858914);
            c8587M14211.m14166(i10);
            c8587M14211.m14167();
            c8587M14211.m14168();
            c8587M14211.m14193(c858914);
            c8587M14211.m14182(0);
            c8587M14211.m14182(1);
            i5 = i10;
            c8587M14211.m14186(str2, "autoType", AbstractC0053.m151(new StringBuilder("("), AbstractC8591.f23980, ")Ljava/lang/Object;"));
            c8587M14211.m14180(i3);
            c8587M14211.m14197(c858911);
            c8587M14211.m14158(c858914);
        }
        if (z3) {
            if (c2732.f8333 instanceof C2798) {
                C1908 c19084 = c1908;
                m5521(c2732, c19084, i5, z4, i3, c85892);
                c1908 = c19084;
                c85893 = c85892;
            } else {
                c85893 = c85892;
                c8587M14211.m14182(0);
                c8587M14211.m14166(i5);
                c8587M14211.m14182(1);
                c8587M14211.m14166(4);
                c8587M14211.m14182(i3);
                c8587M14211.m14186(AbstractC8591.f24013, "readFieldValue", f8317);
            }
            c8587M14211.m14197(c85893);
            c2731 = this;
            c27322 = c2732;
            i6 = iM36042;
            c85894 = c858911;
        } else {
            c85893 = c85892;
            boolean z7 = z4;
            int i11 = i5;
            String str6 = "(J)Z";
            String str7 = "getNameHashCodeLCase";
            if (abstractC2762Arr2.length > 6) {
                TreeMap treeMap = new TreeMap();
                boolean z8 = z7;
                String str8 = "isSupportSmartMatch";
                C2772 c27722 = c2772;
                int i12 = 0;
                while (true) {
                    long[] jArr = c27722.f8461;
                    c19082 = c1908;
                    if (i12 >= jArr.length) {
                        break;
                    }
                    long j2 = jArr[i12];
                    ((List) treeMap.computeIfAbsent(Integer.valueOf((int) (j2 ^ (j2 >>> 32))), new C2769(5))).add(Long.valueOf(j2));
                    i12++;
                    c1908 = c19082;
                }
                int size = treeMap.size();
                int[] iArr = new int[size];
                Iterator it = treeMap.keySet().iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    iArr[i13] = ((Integer) it.next()).intValue();
                    i13++;
                }
                Arrays.sort(iArr);
                c8587M14211.m14166(i11);
                c8587M14211.m14166(i11);
                c8587M14211.m14179(32);
                c8587M14211.m14156(125);
                c8587M14211.m14156(131);
                c8587M14211.m14156(136);
                c8587M14211.m14170(i4);
                C8589 c858915 = new C8589();
                c85894 = c858911;
                C8589[] c8589Arr = new C8589[size];
                int i14 = i3;
                for (int i15 = 0; i15 < size; i15++) {
                    c8589Arr[i15] = new C8589();
                }
                c8587M14211.m14184(i4);
                c8587M14211.m14206(c858915, iArr, c8589Arr);
                int i16 = 0;
                while (i16 < size) {
                    c8587M14211.m14158(c8589Arr[i16]);
                    List list = (List) treeMap.get(Integer.valueOf(iArr[i16]));
                    int i17 = i16;
                    int size2 = list.size();
                    C8589[] c8589Arr2 = c8589Arr;
                    int i18 = 0;
                    while (i18 < size2) {
                        TreeMap treeMap2 = treeMap;
                        int i19 = size;
                        long jLongValue = ((Long) list.get(i18)).longValue();
                        C8589 c858916 = c858915;
                        C8589 c858917 = size2 > 1 ? new C8589() : c858916;
                        c8587M14211.m14166(i11);
                        c8587M14211.m14153(jLongValue);
                        c8587M14211.m14168();
                        c8587M14211.m14194(c858917);
                        int i20 = i11;
                        short s = c27722.f8462[Arrays.binarySearch(c27722.f8461, jLongValue)];
                        AbstractC2762 abstractC2762 = abstractC2762Arr2[s];
                        C2772 c27723 = c27722;
                        int i21 = iM36042;
                        C8589 c858918 = c858917;
                        boolean z9 = z8;
                        int i22 = i18;
                        int i23 = i14;
                        List list2 = list;
                        String str9 = str7;
                        int i24 = size2;
                        AbstractC2762[] abstractC2762Arr3 = abstractC2762Arr2;
                        int i25 = i2;
                        String str10 = str8;
                        int[] iArr2 = iArr;
                        String str11 = str6;
                        C1908 c19085 = c19082;
                        m5520(c2732, abstractC2762, z9, c19085, i23, s, true);
                        c8587M14211.m14197(c85893);
                        if (c858918 != c858916) {
                            c8587M14211.m14158(c858918);
                        }
                        int i26 = i22 + 1;
                        i14 = i23;
                        list = list2;
                        str7 = str9;
                        size2 = i24;
                        z8 = z9;
                        str6 = str11;
                        c858915 = c858916;
                        c27722 = c27723;
                        iM36042 = i21;
                        treeMap = treeMap2;
                        size = i19;
                        abstractC2762Arr2 = abstractC2762Arr3;
                        i18 = i26;
                        c19082 = c19085;
                        iArr = iArr2;
                        i11 = i20;
                        str8 = str10;
                        i2 = i25;
                    }
                    int i27 = i2;
                    c8587M14211.m14197(c85893);
                    c858915 = c858915;
                    c8589Arr = c8589Arr2;
                    treeMap = treeMap;
                    abstractC2762Arr2 = abstractC2762Arr2;
                    i16 = i17 + 1;
                    c19082 = c19082;
                    iArr = iArr;
                    i11 = i11;
                    str8 = str8;
                    i2 = i27;
                }
                c27322 = c2732;
                String str12 = str6;
                i6 = iM36042;
                int i28 = i2;
                String str13 = str7;
                String str14 = str8;
                c1908 = c19082;
                i3 = i14;
                c8587M14211.m14158(c858915);
                if ((c27322.f8331.f23100 & 9007199254740992L) == 0 && !(c27322.f8333 instanceof C2798)) {
                    C8589 c858919 = new C8589();
                    if ((j & JSONReader$Feature.SupportSmartMatch.mask) == 0) {
                        i8 = 1;
                        c8587M14211.m14182(1);
                        c8587M14211.m14166(4);
                        c8587M14211.m14186(AbstractC8591.f24015, str14, str12);
                        c8587M14211.m14193(c858919);
                    } else {
                        i8 = 1;
                    }
                    c8587M14211.m14182(0);
                    c8587M14211.m14182(i8);
                    c8587M14211.m14186(AbstractC8591.f24015, str13, "()J");
                    c8587M14211.m14183(AbstractC8591.f24012, "getFieldReaderLCase", f8314);
                    c8587M14211.m14196();
                    c8587M14211.m14180(i28);
                    c8587M14211.m14192(c858919);
                    c8587M14211.m14182(i28);
                    c8587M14211.m14182(i8);
                    c8587M14211.m14182(i3);
                    c8587M14211.m14186(AbstractC8591.f24014, "readFieldValueJSONB", f8313);
                    c8587M14211.m14197(c85893);
                    c8587M14211.m14158(c858919);
                }
                c2731 = this;
            } else {
                int i29 = i11;
                AbstractC2762[] abstractC2762Arr4 = abstractC2762Arr2;
                i6 = iM36042;
                c85894 = c858911;
                int i30 = 0;
                while (true) {
                    abstractC2762Arr = abstractC2762Arr4;
                    if (i30 >= abstractC2762Arr.length) {
                        break;
                    }
                    C8589 c858920 = new C8589();
                    AbstractC2762 abstractC27622 = abstractC2762Arr[i30];
                    long jM5774 = AbstractC2860.m5774(abstractC27622.f8428);
                    int i31 = i29;
                    c8587M14211.m14166(i31);
                    c8587M14211.m14153(jM5774);
                    c8587M14211.m14168();
                    c8587M14211.m14194(c858920);
                    abstractC2762Arr4 = abstractC2762Arr;
                    m5520(c2732, abstractC27622, z7, c1908, i3, i30, false);
                    c8587M14211.m14197(c85893);
                    c8587M14211.m14158(c858920);
                    i30++;
                    i29 = i31;
                }
                int i32 = i29;
                C8589 c858921 = new C8589();
                if ((j & JSONReader$Feature.SupportSmartMatch.mask) == 0) {
                    i7 = 1;
                    c8587M14211.m14182(1);
                    c8587M14211.m14166(4);
                    c8587M14211.m14186(AbstractC8591.f24015, "isSupportSmartMatch", "(J)Z");
                    c8587M14211.m14193(c858921);
                } else {
                    i7 = 1;
                }
                c8587M14211.m14182(i7);
                c8587M14211.m14186(AbstractC8591.f24015, str7, "()J");
                c8587M14211.m14175(i32);
                for (int i33 = 0; i33 < abstractC2762Arr.length; i33++) {
                    C8589 c858922 = new C8589();
                    AbstractC2762 abstractC27623 = abstractC2762Arr[i33];
                    long jM57742 = AbstractC2860.m5774(abstractC27623.f8428);
                    c8587M14211.m14166(i32);
                    c8587M14211.m14153(jM57742);
                    c8587M14211.m14168();
                    c8587M14211.m14194(c858922);
                    m5520(c2732, abstractC27623, z7, c1908, i3, i33, false);
                    c8587M14211.m14197(c85893);
                    c8587M14211.m14158(c858922);
                }
                c2731 = this;
                c27322 = c2732;
                c8587M14211.m14158(c858921);
            }
        }
        if (c27322.f8333 instanceof C2798) {
            i9 = 1;
            c8587M14211.m14182(1);
            c8587M14211.m14186(AbstractC8591.f24015, "skipValue", "()V");
        } else {
            i9 = 1;
            c8587M14211.m14182(0);
            c8587M14211.m14182(1);
            c8587M14211.m14182(i3);
            c8587M14211.m14166(4);
            c8587M14211.m14186(AbstractC8591.f24013, "processExtra", f8316);
        }
        c8587M14211.m14197(c85893);
        c8587M14211.m14158(c85893);
        if (!zM5533) {
            c8587M14211.m14160(i6, i9);
        }
        c8587M14211.m14197(c858910);
        c8587M14211.m14158(c85894);
        if (c27322.f8333 instanceof C2798) {
            c2731.m5526(c27322, c1908);
        } else {
            c8587M14211.m14182(i3);
        }
        c8587M14211.m14181();
        c8587M14211.m14207();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0ab4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5524(com.alibaba.fastjson2.reader.C2732 r61, boolean r62, androidx.compose.ui.platform.C1908 r63, int r64, p297.C8589 r65, p297.C8589 r66) {
        /*
            Method dump skipped, instruction units count: 2898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2731.m5524(com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, boolean, androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, int, 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲兰苏, 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲兰苏):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0339  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5525(com.alibaba.fastjson2.reader.C2732 r37, long r38) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2731.m5525(com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m5526(C2732 c2732, C1908 c1908) {
        Constructor constructor;
        Constructor constructor2;
        AbstractC2762[] abstractC2762Arr = c2732.f8326;
        String str = c2732.f8332;
        C8587 c8587 = (C8587) c1908.f5624;
        C2798 c2798 = (C2798) c2732.f8333;
        Class cls = c2732.f8330;
        int i = 0;
        if (!this.f8325.m5780(cls) && cls.getTypeParameters().length == 0 && (((constructor = c2798.f8452) == null || Modifier.isPublic(constructor.getModifiers())) && Modifier.isPublic(cls.getModifiers()) && c2798.f8651 == null && ((constructor2 = c2798.f8652) == null || Modifier.isPublic(constructor2.getModifiers())))) {
            c8587.m14174(str);
            c8587.m14196();
            StringBuilder sb = new StringBuilder("(");
            int length = abstractC2762Arr.length;
            while (i < length) {
                AbstractC2762 abstractC2762 = abstractC2762Arr[i];
                c8587.m14165(c1908.m3605(abstractC2762), abstractC2762.f8429);
                sb.append(AbstractC8591.m14218(abstractC2762.f8429));
                i++;
            }
            sb.append(")V");
            c8587.m14187(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, sb.toString());
            return;
        }
        c8587.m14182(0);
        c8587.m14190(abstractC2762Arr.length);
        c8587.m14205(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        while (i < abstractC2762Arr.length) {
            AbstractC2762 abstractC27622 = abstractC2762Arr[i];
            c8587.m14196();
            c8587.m14190(i);
            c8587.m14165(c1908.m3605(abstractC27622), abstractC27622.f8429);
            Class cls2 = abstractC27622.f8429;
            if (cls2 == Integer.TYPE) {
                c8587.m14188("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            } else if (cls2 == Long.TYPE) {
                c8587.m14188("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            } else if (cls2 == Float.TYPE) {
                c8587.m14188("java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            } else if (cls2 == Double.TYPE) {
                c8587.m14188("java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            } else if (cls2 == Boolean.TYPE) {
                c8587.m14188("java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            } else if (cls2 == Short.TYPE) {
                c8587.m14188("java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            } else if (cls2 == Byte.TYPE) {
                c8587.m14188("java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            } else if (cls2 == Character.TYPE) {
                c8587.m14188("java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            }
            c8587.m14156(83);
            i++;
        }
        c8587.m14186(AbstractC8591.f23997, "createInstance", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_DESCRIPTOR);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m5527(C8587 c8587, C2732 c2732, String str) {
        Constructor constructor = c2732.f8337;
        String str2 = c2732.f8332;
        Supplier supplier = c2732.f8333.f8449;
        Class cls = c2732.f8330;
        boolean z = Modifier.isPublic(cls == null ? 1 : cls.getModifiers()) && (cls == null || !this.f8325.m5780(cls));
        if (constructor != null && z && Modifier.isPublic(constructor.getModifiers())) {
            m5509(c8587, str2, constructor);
        } else {
            if (supplier != null) {
                c8587.m14182(0);
                c8587.m14199(str, "creator", "Ljava/util/function/Supplier;");
                c8587.m14183("java/util/function/Supplier", "get", "()Ljava/lang/Object;");
            } else {
                c8587.m14182(0);
                c8587.m14182(1);
                c8587.m14166(4);
                c8587.m14186(AbstractC8591.f24015, "features", "(J)J");
                c8587.m14186(str, "createInstance", "(J)Ljava/lang/Object;");
            }
            if (z) {
                c8587.m14178(str2);
            }
        }
        if (c2732.f8335) {
            C8589 c8589 = new C8589();
            c8587.m14166(4);
            c8587.m14153(JSONReader$Feature.InitStringFieldAsEmpty.mask);
            c8587.m14169();
            c8587.m14167();
            c8587.m14168();
            c8587.m14193(c8589);
            c8587.m14196();
            c8587.m14182(0);
            c8587.m14156(95);
            c8587.m14186(str, "initStringFieldAsEmpty", "(Ljava/lang/Object;)V");
            c8587.m14158(c8589);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2776
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C2798 mo5528(Class cls, C8365 c8365, Function function, ArrayList arrayList, String[] strArr, AbstractC2762[] abstractC2762Arr, AbstractC2762[] abstractC2762Arr2) {
        Class cls2;
        Constructor constructor;
        C2798 c2798 = new C2798(cls, c8365.f23092, c8365.f23091, c8365.f23100, function, abstractC2762Arr, abstractC2762Arr2, c8365.f23087, c8365.f23106);
        Class cls3 = c8365.f23083;
        C2864 c2864 = this.f8325;
        boolean z = cls3 == null && abstractC2762Arr2.length == 0 && ((function instanceof C2746) || (function instanceof C2744)) && ((arrayList == null || arrayList.isEmpty()) && !c2864.m5780(cls) && (c8365.f23100 & JSONReader$Feature.SupportAutoType.mask) == 0 && (((constructor = c2798.f8652) == null || constructor.getParameterCount() == abstractC2762Arr.length) && ((!(function instanceof C2744) || ((C2744) function).f8382.length == abstractC2762Arr.length) && abstractC2762Arr.length <= 64)));
        if (z) {
            for (AbstractC2762 abstractC2762 : abstractC2762Arr) {
                if (abstractC2762.mo5494() != null || abstractC2762.f8415 != null || abstractC2762.f8413 != null || (((cls2 = abstractC2762.f8429) != null && (!Modifier.isPublic(cls2.getModifiers()) || c2864.m5780(cls2))) || (((abstractC2762 instanceof C2685) && ((C2685) abstractC2762).f8158 != null) || ((abstractC2762 instanceof C2683) && ((C2683) abstractC2762).f8154 != null)))) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            return c2798;
        }
        boolean zM5780 = c2864.m5780(cls);
        C8590 c8590 = new C8590(new C2775(cls, 1));
        c8365.f23100 |= 144115188075855872L;
        C2732 c2732 = new C2732(c8365, cls, c8590, zM5780, abstractC2762Arr, null);
        c2732.f8333 = c2798;
        String str = AbstractC8591.f23997;
        m5515(abstractC2762Arr, c8590, str);
        c8590.m14213(c2732.f8339, str, new String[0]);
        C8587 c8587M14211 = c8590.m14211(abstractC2762Arr2.length <= 12 ? 32 : 128, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V");
        c8587M14211.m14182(0);
        c8587M14211.m14182(1);
        c8587M14211.m14182(2);
        c8587M14211.m14182(3);
        c8587M14211.m14166(4);
        c8587M14211.m14182(6);
        c8587M14211.m14182(7);
        c8587M14211.m14182(8);
        c8587M14211.m14182(9);
        c8587M14211.m14182(10);
        c8587M14211.m14182(11);
        c8587M14211.m14182(12);
        c8587M14211.m14187(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V");
        m5514(abstractC2762Arr, c2732.f8339, true, 9, c8587M14211, str);
        c8587M14211.m14162();
        c8587M14211.m14207();
        m5525(c2732, c8365.f23100);
        if (!c2732.m5532()) {
            m5523(c2732, c8365.f23100);
        }
        byte[] bArrM14214 = c8590.m14214();
        try {
            return (C2798) c2864.m5781(c2732.f8336, bArrM14214.length, bArrM14214).getConstructors()[0].newInstance(cls, c8365.f23092, c8365.f23091, Long.valueOf(c8365.f23100), function, arrayList, strArr, abstractC2762Arr, abstractC2762Arr2, null, null);
        } catch (Throwable th) {
            C0276.m843("create objectReader error".concat(", objectType " + cls.getTypeName()), th);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2776
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC2788 mo5529(Class cls, Type type, boolean z, C2802 c2802) {
        Constructor constructor;
        Constructor constructorM5812;
        String str;
        Class cls2;
        Method method;
        boolean zM5780 = this.f8325.m5780(cls);
        int modifiers = cls.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            return super.mo5529(cls, type, z, c2802);
        }
        C8365 c8365 = new C8365(c2802);
        CopyOnWriteArrayList copyOnWriteArrayList = c2802.f8680;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            ((C2779) copyOnWriteArrayList.get(i)).f8500.m4155(cls, c8365);
        }
        if (zM5780 || !Modifier.isPublic(modifiers)) {
            c8365.f23100 |= 18014398509481984L;
        }
        Class cls3 = c8365.f23098;
        if (cls3 != null && InterfaceC2788.class.isAssignableFrom(cls3)) {
            try {
                Constructor declaredConstructor = c8365.f23098.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (InterfaceC2788) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                C0276.m843("create deserializer error", e);
                return null;
            }
        }
        boolean z2 = (z && (cls.isInterface() || AbstractC2865.m5790(cls))) ? false : z;
        if (Enum.class.isAssignableFrom(cls) && ((method = c8365.f23107) == null || method.getParameterCount() == 1)) {
            return C2776.m5595(cls, c8365.f23107, c2802);
        }
        if (c8365.f23109 != null || c8365.f23107 != null) {
            return m5605(cls, type, c2802, c8365);
        }
        if (c8365.f23090 != null) {
            return m5611(cls, type, c2802, c8365);
        }
        if (Throwable.class.isAssignableFrom(cls) || AbstractC2865.m5800(cls)) {
            return super.mo5529(cls, type, z2, c2802);
        }
        if (cls == Class.class) {
            return C2719.f8283;
        }
        AbstractC2762[] abstractC2762ArrM5612 = m5612(cls, type, c8365, z2, c2802);
        boolean z3 = abstractC2762ArrM5612.length <= 96;
        if (!z2) {
            if (AbstractC2854.f8918 >= 9 && cls == StackTraceElement.class) {
                try {
                    return C2776.m5597(StackTraceElement.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE), "", "classLoaderName", "moduleName", "moduleVersion", "declaringClass", "methodName", "fileName", "lineNumber");
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            for (AbstractC2762 abstractC2762 : abstractC2762ArrM5612) {
                if (!abstractC2762.mo5485()) {
                    long j = abstractC2762.f8422;
                    if ((j & 562949953421312L) == 0 && (j & 2251799813685248L) == 0) {
                    }
                }
                z3 = false;
                break;
            }
        }
        if (c8365.f23083 != null) {
            z3 = false;
        }
        if (z3) {
            for (AbstractC2762 abstractC27622 : abstractC2762ArrM5612) {
                if (abstractC27622.f8415 != null || abstractC27622.f8413 != null || (((cls2 = abstractC27622.f8429) != null && !Modifier.isPublic(cls2.getModifiers())) || (((abstractC27622 instanceof C2685) && ((C2685) abstractC27622).f8158 != null) || ((abstractC27622 instanceof C2683) && ((C2683) abstractC27622).f8154 != null)))) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3 && (c8365.f23082 != null || ((str = c8365.f23096) != null && !str.isEmpty()))) {
            z3 = false;
        }
        if (!z3) {
            return super.mo5529(cls, type, z2, c2802);
        }
        if (Modifier.isInterface(modifiers) || Modifier.isAbstract(modifiers) || (constructorM5812 = AbstractC2865.m5812(cls, true)) == null) {
            constructor = null;
        } else {
            try {
                constructorM5812.setAccessible(true);
            } catch (SecurityException unused2) {
            }
            constructor = constructorM5812;
        }
        Class[] clsArr = c8365.f23087;
        if (clsArr == null || clsArr.length == 0) {
            return (z2 || constructor != null) ? m5519(cls, type, z2, zM5780, modifiers, c8365, null, abstractC2762ArrM5612, constructor) : super.mo5529(cls, type, false, c2802);
        }
        return new C2800(cls, c8365.f23092, null, JSONReader$Feature.SupportAutoType.mask, null, m5609(cls), null, clsArr, c8365.f23106, c8365.f23105, abstractC2762ArrM5612);
    }

    @Override // com.alibaba.fastjson2.reader.C2776
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2772 mo5530(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762... abstractC2762Arr) {
        if (cls == null && supplier != null && function == null) {
            for (AbstractC2762 abstractC2762 : abstractC2762Arr) {
                if (abstractC2762.mo5474() != null) {
                }
            }
            return m5519(cls, cls, false, false, 0, new C8365(AbstractC2933.m6387()), supplier, abstractC2762Arr, null);
        }
        return super.mo5530(cls, str, str2, j, jSONSchema, supplier, function, abstractC2762Arr);
    }
}
