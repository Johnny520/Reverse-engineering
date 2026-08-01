package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.ui.platform.C1908;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.C2863;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.client.plugins.api.C3885;
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
import p007.AbstractC6136;
import p278.C8364;
import p295.InterfaceC8580;
import p295.InterfaceC8581;
import p295.InterfaceC8582;
import p295.InterfaceC8583;
import p295.InterfaceC8584;
import p297.AbstractC8599;
import p297.C8595;
import p297.C8597;
import p297.C8598;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2730 extends C2775 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String f8307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String f8308;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final String f8309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String[] f8310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String f8311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String f8312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String f8313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String f8314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String f8315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final String f8316;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String f8317;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String f8319;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String f8320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String f8321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String f8322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2863 f8323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2730 f8306 = new C2730(C2863.f9006);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AtomicLong f8318 = new AtomicLong();

    static {
        StringBuilder sb = new StringBuilder("(");
        String str = AbstractC8599.f23989;
        sb.append(str);
        sb.append(")");
        String str2 = AbstractC8599.f23986;
        sb.append(str2);
        f8317 = sb.toString();
        f8321 = AbstractC6136.m11548("(", str, ")", str2);
        StringBuilder sb2 = new StringBuilder("(Ljava/lang/Class;Ljava/util/function/Supplier;");
        String str3 = AbstractC8599.f23993;
        f8322 = AbstractC0053.m146(sb2, str3, ")V");
        f8319 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;J" + AbstractC8599.f23988 + "Ljava/util/function/Supplier;Ljava/util/function/Function;" + str3 + ")V";
        f8320 = AbstractC0053.m156("(", str, "Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;");
        StringBuilder sb3 = new StringBuilder("(J)");
        sb3.append(AbstractC8599.f23994);
        f8312 = sb3.toString();
        f8311 = AbstractC0053.m156("(", str, "Ljava/lang/Object;)V");
        f8315 = AbstractC0053.m156("(J", str, "JLjava/lang/Object;)V");
        f8316 = AbstractC0053.m156("(", str, "Ljava/lang/Object;Ljava/lang/String;)V");
        f8313 = AbstractC6136.m11548("(", str, ")", str2);
        f8314 = AbstractC0053.m156("(", str, "Ljava/lang/Object;J)V");
        f8308 = AbstractC6136.m11548("(", str, "J)", str2);
        f8307 = AbstractC0053.m156("(", str, "Ljava/lang/Object;I)V");
        HashMap map = new HashMap();
        Package r1 = C2730.class.getPackage();
        f8309 = r1 != null ? r1.getName() : "";
        AbstractC8599.m14197(InterfaceC8584.class);
        map.put(Boolean.TYPE, new C3885(13));
        AbstractC8599.m14197(InterfaceC8582.class);
        map.put(Character.TYPE, new C3885(13));
        AbstractC8599.m14197(InterfaceC8583.class);
        map.put(Byte.TYPE, new C3885(13));
        AbstractC8599.m14197(InterfaceC8580.class);
        map.put(Short.TYPE, new C3885(13));
        AbstractC8599.m14197(ObjIntConsumer.class);
        map.put(Integer.TYPE, new C3885(13));
        AbstractC8599.m14197(ObjLongConsumer.class);
        map.put(Long.TYPE, new C3885(13));
        AbstractC8599.m14197(InterfaceC8581.class);
        map.put(Float.TYPE, new C3885(13));
        AbstractC8599.m14197(ObjDoubleConsumer.class);
        map.put(Double.TYPE, new C3885(13));
        AbstractC8599.m14197(BiConsumer.class);
        map.put(String.class, new C3885(13));
        AbstractC8599.m14197(BiConsumer.class);
        map.put(Integer.class, new C3885(13));
        f8310 = new String[1024];
    }

    public C2730(ClassLoader classLoader) {
        this.f8323 = classLoader instanceof C2863 ? (C2863) classLoader : new C2863(classLoader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m5464(C8595 c8595, String str, Constructor constructor) {
        c8595.m14155(str);
        c8595.m14177();
        if (constructor.getParameterCount() == 0) {
            c8595.m14168(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
            return;
        }
        Class<?> cls = constructor.getParameterTypes()[0];
        c8595.m14137(1);
        c8595.m14168(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(" + AbstractC8599.m14199(cls) + ")V");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static void m5465(AbstractC2761 abstractC2761, String str, C1908 c1908, int i, int i2, boolean z, Class cls, Type type, long j, Type type2, String str2, C2731 c2731) {
        Class cls2;
        int iM3594;
        String str3;
        String str4;
        String str5;
        int i3;
        Type type3;
        String str6;
        String str7;
        int i4;
        String str8;
        C8597 c8597;
        AbstractC2761 abstractC27612;
        int i5;
        Type type4;
        int i6;
        C8597 c85972;
        String str9;
        String str10;
        String str11;
        C8597 c85973;
        Field field;
        boolean z2 = c1908.f5625;
        Type type5 = type2 == null ? Object.class : type2;
        Class clsM5897 = AbstractC2866.m5897(type5);
        String strM5473 = m5473(i2);
        C8595 c8595 = (C8595) c1908.f5623;
        if (c2731.f8331 instanceof C2797) {
            iM3594 = c1908.m3595(abstractC2761);
            cls2 = cls;
        } else {
            cls2 = cls;
            iM3594 = c1908.m3594(cls2);
        }
        int iM35942 = c1908.m3594(InterfaceC2787.class);
        String str12 = cls2.isInterface() ? "java/util/ArrayList" : str2;
        C8597 c85974 = new C8597();
        C8597 c85975 = new C8597();
        C8597 c85976 = new C8597();
        Type type6 = type5;
        boolean z3 = AbstractC2853.f8916 == 8 && "java/util/ArrayList".equals(str12);
        int iM35943 = c1908.m3594("ITEM_CNT");
        boolean z4 = z3;
        String str13 = "java/util/List";
        String str14 = "add";
        String str15 = "(Ljava/lang/Object;)Z";
        String str16 = f8320;
        Class cls3 = String.class;
        if (z2) {
            if (c2731.m5488()) {
                c85972 = c85975;
                str9 = "(I)V";
                str10 = str12;
                str11 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            } else {
                str9 = "(I)V";
                C8597 c85977 = new C8597();
                str11 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                c8595.m14163(0);
                str10 = str12;
                c8595.m14180(str, AbstractC3932.m8319(i2), AbstractC8599.f23994);
                c8595.m14163(1);
                c85972 = c85975;
                c8595.m14167(AbstractC8599.f24023, "checkObjectAutoType", f8313);
                c8595.m14177();
                c8595.m14161(iM35942);
                c8595.m14173(c85977);
                c8595.m14163(iM35942);
                c8595.m14163(1);
                m5466(str, c8595, i2, type);
                c8595.m14183(abstractC2761.f8426);
                c8595.m14134(j);
                c8595.m14164(AbstractC8599.f24021, "readJSONBObject", str16);
                c8595.m14159(str2);
                c8595.m14161(iM3594);
                c8595.m14178(c85974);
                c8595.m14139(c85977);
            }
            c8595.m14163(1);
            c8595.m14167(AbstractC8599.f24024, "startArray", "()I");
            c8595.m14177();
            c8595.m14151(iM35943);
            c8595.m14138(-1);
            C8597 c85978 = c85972;
            c8595.m14136(160, c85978);
            c8595.m14137(1);
            c8595.m14161(iM3594);
            c8595.m14178(c85974);
            c8595.m14139(c85978);
            if (abstractC2761.f8425 != null || (field = abstractC2761.f8422) == null) {
                c85973 = c85976;
                str3 = "readJSONBObject";
            } else {
                long jObjectFieldOffset = AbstractC2853.f8919.objectFieldOffset(field);
                c8595.m14181(AbstractC8599.f24012, "UNSAFE", "Lsun/misc/Unsafe;");
                c8595.m14163(i);
                c8595.m14134(jObjectFieldOffset);
                c8595.m14167("sun/misc/Unsafe", "getObject", "(Ljava/lang/Object;J)Ljava/lang/Object;");
                c8595.m14177();
                c8595.m14159(str2);
                c8595.m14161(iM3594);
                C8597 c85979 = new C8597();
                c8595.m14173(c85979);
                c8595.m14163(iM3594);
                c8595.m14167(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, "getClass", "()Ljava/lang/Class;");
                str3 = "readJSONBObject";
                c8595.m14181("java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
                c8595.m14167(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, "getClass", "()Ljava/lang/Class;");
                c85973 = c85976;
                c8595.m14170(c85973);
                c8595.m14139(c85979);
            }
            String str17 = str10;
            c8595.m14155(str17);
            c8595.m14177();
            if (z4) {
                c8595.m14165(iM35943);
                c8595.m14168(str17, str11, str9);
            } else {
                c8595.m14168(str17, str11, "()V");
            }
            c8595.m14161(iM3594);
            c8595.m14139(c85973);
            str4 = str16;
            i3 = iM35943;
            type3 = type6;
            str6 = "readString";
            str5 = "()Z";
        } else {
            str3 = "readJSONBObject";
            String str18 = str12;
            C8597 c859710 = new C8597();
            C8597 c859711 = new C8597();
            C8597 c859712 = new C8597();
            str4 = str16;
            c8595.m14163(1);
            String str19 = AbstractC8599.f24024;
            str5 = "()Z";
            c8595.m14167(str19, "nextIfNull", str5);
            c8595.m14175(c859712);
            c8595.m14163(1);
            c8595.m14167(str19, "nextIfArrayStart", str5);
            c8595.m14175(c859710);
            if (clsM5897 == cls3) {
                i3 = iM35943;
                c8595.m14163(1);
                c8595.m14167(str19, "isString", str5);
                c8595.m14174(c859711);
                c8595.m14155(str18);
                c8595.m14177();
                if (z4) {
                    c8595.m14138(10);
                    c8595.m14168(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
                } else {
                    c8595.m14168(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
                }
                c8595.m14161(iM3594);
                c8595.m14163(1);
                c8595.m14167(str19, "nextIfNullOrEmptyString", str5);
                c8595.m14175(c85974);
                c8595.m14163(iM3594);
                c8595.m14163(1);
                if (clsM5897 == cls3) {
                    str7 = "readString";
                    c8595.m14167(str19, str7, "()Ljava/lang/String;");
                } else {
                    str7 = "readString";
                }
                cls3 = cls3;
                c8595.m14164(str13, str14, str15);
                c8595.m14154();
                c8595.m14178(c85974);
                str13 = str13;
                str14 = str14;
                str15 = str15;
                type3 = type6;
                str6 = str7;
            } else {
                cls3 = cls3;
                i3 = iM35943;
                type3 = type6;
                str6 = "readString";
                if (type3 instanceof Class) {
                    c8595.m14163(1);
                    c8595.m14167(str19, "nextIfNullOrEmptyString", str5);
                    c8595.m14175(c859712);
                    c8595.m14155(str18);
                    c8595.m14177();
                    if (z4) {
                        c8595.m14138(10);
                        c8595.m14168(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
                    } else {
                        c8595.m14168(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
                    }
                    c8595.m14161(iM3594);
                    c8595.m14163(1);
                    c8595.m14163(iM3594);
                    c8595.m14135((Class) type3);
                    c8595.m14167(str19, "readArray", "(Ljava/util/List;Ljava/lang/reflect/Type;)V");
                    c8595.m14178(c85974);
                }
            }
            c8595.m14139(c859711);
            c8595.m14163(1);
            c8595.m14167(str19, "skipValue", "()V");
            c8595.m14139(c859712);
            c8595.m14137(1);
            c8595.m14161(iM3594);
            c8595.m14178(c85974);
            c8595.m14139(c859710);
            c8595.m14155(str18);
            c8595.m14177();
            if (z4) {
                c8595.m14138(10);
                c8595.m14168(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
            } else {
                c8595.m14168(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
            }
            c8595.m14161(iM3594);
        }
        int iM35944 = c1908.m3594("J");
        C8597 c859713 = new C8597();
        C8597 c859714 = new C8597();
        C8597 c859715 = new C8597();
        c8595.m14137(3);
        c8595.m14151(iM35944);
        c8595.m14139(c859713);
        if (z2) {
            c8595.m14165(iM35944);
            c8595.m14165(i3);
            c8595.m14136(162, c859714);
            i4 = 1;
        } else {
            i4 = 1;
            c8595.m14163(1);
            c8595.m14167(AbstractC8599.f24024, "nextIfArrayEnd", str5);
            c8595.m14175(c859714);
        }
        if (type3 == cls3) {
            c8595.m14163(iM3594);
            c8595.m14163(i4);
            c8595.m14167(AbstractC8599.f24024, str6, "()Ljava/lang/String;");
        } else if (type3 == Integer.class) {
            c8595.m14163(iM3594);
            c8595.m14163(i4);
            c8595.m14167(AbstractC8599.f24024, "readInt32", "()Ljava/lang/Integer;");
        } else {
            if (type3 != Long.class) {
                C8597 c859716 = new C8597();
                c8595.m14163(0);
                String str20 = AbstractC8599.f23986;
                c8595.m14180(str, strM5473, str20);
                c8595.m14172(c859716);
                c8595.m14163(0);
                c8595.m14163(0);
                c8595.m14180(str, AbstractC3932.m8319(i2), AbstractC8599.f23994);
                c8595.m14163(1);
                c8595.m14167(AbstractC8599.f24023, "getItemObjectReader", f8317);
                c8595.m14152(str, strM5473, str20);
                c8595.m14139(c859716);
                if ((c2731.f8329.f23101 & 144115188075855872L) == 0) {
                    c8595.m14163(1);
                    c8595.m14163(iM3594);
                    c8595.m14165(iM35944);
                    c8595.m14167(AbstractC8599.f24024, "readReference", "(Ljava/util/List;I)Z");
                    c8595.m14175(c859715);
                }
                c8595.m14163(iM3594);
                C8597 c859717 = new C8597();
                C8597 c859718 = new C8597();
                if (z) {
                    c8595.m14163(1);
                    c8595.m14167(AbstractC8599.f24024, "isArray", str5);
                    c8595.m14174(c859717);
                    c8595.m14163(0);
                    c8595.m14180(str, strM5473, str20);
                    c8595.m14163(1);
                    i5 = i2;
                    type4 = type;
                    m5466(str, c8595, i5, type4);
                    abstractC27612 = abstractC2761;
                    c8595.m14183(abstractC27612.f8426);
                    c8595.m14147(4);
                    String str21 = AbstractC8599.f24021;
                    String str22 = z2 ? "readArrayMappingJSONBObject" : "readArrayMappingObject";
                    str8 = str4;
                    c8597 = c85974;
                    i6 = iM3594;
                    c8595.m14164(str21, str22, str8);
                    c8595.m14178(c859718);
                    c8595.m14139(c859717);
                } else {
                    str8 = str4;
                    c8597 = c85974;
                    abstractC27612 = abstractC2761;
                    i5 = i2;
                    type4 = type;
                    i6 = iM3594;
                }
                c8595.m14163(0);
                c8595.m14180(str, strM5473, str20);
                c8595.m14163(1);
                m5466(str, c8595, i5, type4);
                c8595.m14183(abstractC27612.f8426);
                c8595.m14147(4);
                c8595.m14164(AbstractC8599.f24021, z2 ? str3 : "readObject", str8);
                if (z) {
                    c8595.m14139(c859718);
                }
                c8595.m14164(str13, str14, str15);
                c8595.m14154();
                c8595.m14139(c859715);
                c8595.m14141(iM35944, 1);
                c8595.m14178(c859713);
                c8595.m14139(c859714);
                c8595.m14139(c8597);
                c8595.m14163(i6);
            }
            c8595.m14163(iM3594);
            c8595.m14163(i4);
            c8595.m14167(AbstractC8599.f24024, "readInt64", "()Ljava/lang/Long;");
        }
        c8597 = c85974;
        i6 = iM3594;
        c8595.m14164(str13, str14, str15);
        c8595.m14154();
        c8595.m14139(c859715);
        c8595.m14141(iM35944, 1);
        c8595.m14178(c859713);
        c8595.m14139(c859714);
        c8595.m14139(c8597);
        c8595.m14163(i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static void m5466(String str, C8595 c8595, int i, Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            String name = cls.getName();
            boolean zIsPublic = Modifier.isPublic(cls.getModifiers());
            boolean z = name.startsWith("java.") || cls == JSONArray.class || cls == JSONObject.class;
            if (zIsPublic && z) {
                c8595.m14135(cls);
                return;
            }
        }
        c8595.m14163(0);
        c8595.m14180(str, AbstractC3932.m8319(i), AbstractC8599.f23994);
        c8595.m14180(AbstractC8599.f24023, "fieldType", "Ljava/lang/reflect/Type;");
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
    public static void m5467(com.alibaba.fastjson2.reader.AbstractC2761 r29, java.lang.String r30, androidx.compose.ui.platform.C1908 r31, int r32, java.lang.reflect.Type r33, java.lang.Class r34, long r35, java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2730.m5467(com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, java.lang.String, androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, int, java.lang.reflect.Type, java.lang.Class, long, java.lang.String):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m5468(AbstractC2761[] abstractC2761Arr, C1908 c1908) {
        C8595 c8595 = (C8595) c1908.f5623;
        for (AbstractC2761 abstractC2761 : abstractC2761Arr) {
            Class cls = abstractC2761.f8427;
            int iM3595 = c1908.m3595(abstractC2761);
            if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Boolean.TYPE || cls == Character.TYPE) {
                c8595.m14137(3);
                c8595.m14151(iM3595);
            } else if (cls == Long.TYPE) {
                c8595.m14148();
                c8595.m14156(iM3595);
            } else if (cls == Float.TYPE) {
                c8595.m14137(3);
                c8595.m14137(134);
                c8595.m14182(56, iM3595);
            } else if (cls == Double.TYPE) {
                c8595.m14137(3);
                c8595.m14137(135);
                c8595.m14182(57, iM3595);
            } else {
                c8595.m14137(1);
                c8595.m14161(iM3595);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m5469(AbstractC2761[] abstractC2761Arr, String str, boolean z, int i, C8595 c8595, String str2) {
        if ((str2 == AbstractC8599.f24022 || str2 == AbstractC8599.f24006) && z) {
            for (int i2 = 0; i2 < abstractC2761Arr.length; i2++) {
                c8595.m14163(0);
                c8595.m14163(i);
                c8595.m14171(i2);
                c8595.m14137(50);
                c8595.m14152(str, AbstractC3932.m8319(i2), AbstractC8599.f23994);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static void m5470(AbstractC2761[] abstractC2761Arr, C8598 c8598, String str) {
        if (str == AbstractC8599.f24022 || str == AbstractC8599.f24006) {
            for (int i = 0; i < abstractC2761Arr.length; i++) {
                c8598.m14193(AbstractC3932.m8319(i), AbstractC8599.f23994);
            }
            for (int i2 = 0; i2 < abstractC2761Arr.length; i2++) {
                c8598.m14193(m5472(i2), AbstractC8599.f23986);
            }
        }
        for (int i3 = 0; i3 < abstractC2761Arr.length; i3++) {
            if (List.class.isAssignableFrom(abstractC2761Arr[i3].f8427)) {
                c8598.m14193(m5473(i3), AbstractC8599.f23986);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m5471(String str, C1908 c1908) {
        C8595 c8595 = (C8595) c1908.f5623;
        int iM3594 = c1908.m3594("autoTypeObjectReader");
        C8597 c8597 = new C8597();
        c8595.m14163(0);
        c8595.m14163(1);
        c8595.m14147(4);
        c8595.m14167(str, "checkAutoType", f8308);
        c8595.m14177();
        c8595.m14161(iM3594);
        c8595.m14173(c8597);
        c8595.m14163(iM3594);
        c8595.m14163(1);
        c8595.m14163(2);
        c8595.m14163(3);
        c8595.m14147(4);
        c8595.m14164(AbstractC8599.f24021, "readJSONBObject", f8320);
        c8595.m14162();
        c8595.m14139(c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m5472(int i) {
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
                int iM5711 = AbstractC2848.m5711(i) + 12;
                char[] cArr = new char[iM5711];
                "objectReader".getChars(0, 12, cArr, 0);
                AbstractC2848.m5687(i, iM5711, cArr);
                return new String(cArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static String m5473(int i) {
        String[] strArr = f8310;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int iM5711 = AbstractC2848.m5711(i) + 10;
        char[] cArr = new char[iM5711];
        "itemReader".getChars(0, 10, cArr, 0);
        AbstractC2848.m5687(i, iM5711, cArr);
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
    public final com.alibaba.fastjson2.reader.C2771 m5474(java.lang.Class r31, java.lang.reflect.Type r32, boolean r33, boolean r34, int r35, p278.C8364 r36, java.util.function.Supplier r37, com.alibaba.fastjson2.reader.AbstractC2761[] r38, java.lang.reflect.Constructor r39) {
        /*
            Method dump skipped, instruction units count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2730.m5474(java.lang.Class, java.lang.reflect.Type, boolean, boolean, int, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, java.util.function.Supplier, com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰[], java.lang.reflect.Constructor):com.alibaba.fastjson2.reader.飘花落叶言子苏世楪哲兰");
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
    public final void m5475(com.alibaba.fastjson2.reader.C2731 r69, com.alibaba.fastjson2.reader.AbstractC2761 r70, boolean r71, androidx.compose.ui.platform.C1908 r72, int r73, int r74, boolean r75) {
        /*
            Method dump skipped, instruction units count: 2611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2730.m5475(com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, boolean, androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, int, int, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m5476(C2731 c2731, C1908 c1908, int i, boolean z, int i2, C8597 c8597) {
        AbstractC2761[] abstractC2761Arr = c2731.f8324;
        C8595 c8595 = (C8595) c1908.f5623;
        c8595.m14163(0);
        c8595.m14147(i);
        c8595.m14167(AbstractC8599.f24022, "getFieldOrdinal", "(J)I");
        C8597 c85972 = new C8597();
        C8597[] c8597Arr = new C8597[abstractC2761Arr.length];
        int[] iArr = new int[abstractC2761Arr.length];
        for (int i3 = 0; i3 < abstractC2761Arr.length; i3++) {
            c8597Arr[i3] = new C8597();
            iArr[i3] = i3;
        }
        c8595.m14187(c85972, iArr, c8597Arr);
        for (int i4 = 0; i4 < abstractC2761Arr.length; i4++) {
            c8595.m14139(c8597Arr[i4]);
            m5475(c2731, abstractC2761Arr[i4], z, c1908, i2, i4, false);
            c8595.m14178(c8597);
        }
        c8595.m14139(c85972);
        c8595.m14163(1);
        c8595.m14167(AbstractC8599.f24024, "skipValue", "()V");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m5477(C2731 c2731, boolean z, C1908 c1908, int i, C8597 c8597, C8597 c85972) {
        String str;
        C1908 c19082 = c1908;
        C2731 c27312 = c2731;
        AbstractC2761[] abstractC2761Arr = c27312.f8324;
        int iM3593 = c19082.m3593("RAW_LONG");
        C8595 c8595 = (C8595) c19082.f5623;
        c8595.m14163(1);
        c8595.m14167(AbstractC8599.f24024, "getRawLong", "()J");
        c8595.m14137(92);
        c8595.m14156(iM3593);
        c8595.m14148();
        c8595.m14149();
        c8595.m14174(c85972);
        int i2 = 0;
        int i3 = 0;
        while (i3 < abstractC2761Arr.length) {
            C8597 c85973 = new C8597();
            AbstractC2761 abstractC2761 = abstractC2761Arr[i3];
            byte[] bytes = abstractC2761.f8426.getBytes(StandardCharsets.UTF_8);
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
                C5919.m11250(AbstractC6136.m11556(length, "length "));
                return;
            } else {
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 7);
                str = "nextIfName8Match2";
            }
            long j = AbstractC2853.f8919.getLong(bArr, AbstractC2853.f8918);
            c8595.m14147(iM3593);
            c8595.m14134(j);
            c8595.m14149();
            c8595.m14175(c85973);
            c8595.m14163(1);
            c8595.m14167(AbstractC8599.f24024, str, "()Z");
            c8595.m14174(c85972);
            m5475(c27312, abstractC2761, z, c19082, i, i3, false);
            c8595.m14178(c8597);
            c8595.m14139(c85973);
            i3++;
            c27312 = c2731;
            c19082 = c1908;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m5478(C2731 c2731, long j) {
        int i;
        String str;
        C1908 c1908;
        C8597 c8597;
        int i2;
        boolean z;
        C8597 c85972;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        C8597 c85973;
        int i6;
        C8597 c85974;
        AbstractC2761[] abstractC2761Arr;
        int i7;
        C2730 c2730;
        C2731 c27312;
        C1908 c19082;
        int i8;
        int i9;
        String str2 = c2731.f8337;
        AbstractC2761[] abstractC2761Arr2 = c2731.f8324;
        Class cls = c2731.f8328;
        boolean z5 = (j & JSONReader$Feature.FieldBased.mask) != 0;
        C2771 c2771 = c2731.f8331;
        C8598 c8598 = c2731.f8327;
        String str3 = f8320;
        C8595 c8595M14192 = c8598.m14192(2048, "readJSONBObject", str3);
        boolean zM5486 = c2731.m5486();
        boolean zM5488 = c2731.m5488();
        boolean z6 = z5;
        C1908 c19083 = new C1908(c8595M14192, true);
        c8595M14192.m14163(1);
        c8595M14192.m14147(4);
        String str4 = AbstractC8599.f24024;
        c8595M14192.m14167(str4, "features", "(J)J");
        c8595M14192.m14156(4);
        int iM3594 = c19083.m3594("object");
        int iM35942 = c19083.m3594("I");
        int iM3593 = c19083.m3593("hashCode64");
        int iM35943 = c19083.m3594("hashCode32");
        int iM35944 = c19083.m3594("fieldReader");
        if (!zM5488) {
            m5471(str2, c19083);
        }
        C8597 c85975 = new C8597();
        c8595M14192.m14163(1);
        c8595M14192.m14167(str4, "nextIfNull", "()Z");
        c8595M14192.m14174(c85975);
        c8595M14192.m14137(1);
        c8595M14192.m14162();
        c8595M14192.m14139(c85975);
        if (cls != null && !Serializable.class.isAssignableFrom(cls)) {
            c8595M14192.m14163(1);
            c8595M14192.m14163(0);
            c8595M14192.m14180(str2, "objectClass", "Ljava/lang/Class;");
            c8595M14192.m14167(str4, "errorOnNoneSerializable", "(Ljava/lang/Class;)V");
        }
        if (!zM5486) {
            C8597 c85976 = new C8597();
            C8597 c85977 = new C8597();
            c8595M14192.m14163(1);
            c8595M14192.m14167(str4, "isArray", "()Z");
            c8595M14192.m14174(c85976);
            c8595M14192.m14163(1);
            c8595M14192.m14167(str4, "isSupportBeanArray", "()Z");
            c8595M14192.m14174(c85977);
            c8595M14192.m14163(0);
            c8595M14192.m14163(1);
            c8595M14192.m14163(2);
            c8595M14192.m14163(3);
            c8595M14192.m14147(4);
            c8595M14192.m14167(str2, "readArrayMappingObject", str3);
            c8595M14192.m14162();
            c8595M14192.m14139(c85977);
            c8595M14192.m14139(c85976);
        }
        if (c2731.f8331 instanceof C2797) {
            C8597 c85978 = new C8597();
            C8597 c85979 = new C8597();
            c8595M14192.m14163(1);
            c8595M14192.m14167(str4, "hasAutoTypeBeforeHandler", "()Z");
            c8595M14192.m14175(c85978);
            c8595M14192.m14147(4);
            i = iM3593;
            str = str4;
            c8595M14192.m14134(JSONReader$Feature.SupportSmartMatch.mask | JSONReader$Feature.SupportAutoType.mask);
            c8595M14192.m14150();
            c8595M14192.m14148();
            c8595M14192.m14149();
            c8595M14192.m14174(c85979);
            c8595M14192.m14139(c85978);
            c8595M14192.m14163(0);
            c8595M14192.m14163(1);
            c8595M14192.m14163(2);
            c8595M14192.m14163(3);
            c8595M14192.m14147(4);
            c8595M14192.m14168(AbstractC8599.f24006, "readJSONBObject", str3);
            c8595M14192.m14162();
            c8595M14192.m14139(c85979);
            m5468(abstractC2761Arr2, c19083);
        } else {
            i = iM3593;
            str = str4;
            m5482(c8595M14192, c2731, str2);
            c8595M14192.m14161(iM3594);
        }
        c8595M14192.m14163(1);
        String str5 = str;
        c8595M14192.m14167(str5, "nextIfObjectStart", "()Z");
        c8595M14192.m14154();
        C8597 c859710 = new C8597();
        C8597 c859711 = new C8597();
        C8597 c859712 = new C8597();
        if (!zM5488) {
            c8595M14192.m14137(3);
            c8595M14192.m14151(iM35942);
        }
        c8595M14192.m14139(c859710);
        C8597 c859713 = new C8597();
        c8595M14192.m14163(1);
        c8595M14192.m14167(str5, "nextIfObjectEnd", "()Z");
        c8595M14192.m14175(c859711);
        if (c2731.f8332 < 2 || c2731.f8336 > 43) {
            c1908 = c19083;
            c8597 = c859713;
            i2 = iM35944;
            z = z6;
            c85972 = c859712;
            i3 = iM3594;
            i4 = iM35943;
            z2 = false;
        } else {
            i4 = iM35943;
            i2 = iM35944;
            m5479(c2731, z6, c19083, iM3594, c859712, c859713);
            c8597 = c859713;
            c85972 = c859712;
            i3 = iM3594;
            c1908 = c19083;
            z = z6;
            z2 = true;
        }
        c8595M14192.m14139(c8597);
        c8595M14192.m14163(1);
        c8595M14192.m14167(str5, "readFieldNameHashCode", "()J");
        c8595M14192.m14137(92);
        int i10 = i;
        c8595M14192.m14156(i10);
        c8595M14192.m14148();
        c8595M14192.m14149();
        c8595M14192.m14174(c85972);
        if (zM5488 || (c2731.f8331 instanceof C2797)) {
            i5 = i10;
            z3 = z2;
            z4 = z;
        } else {
            C8597 c859714 = new C8597();
            c8595M14192.m14147(i10);
            z3 = z2;
            c8595M14192.m14163(0);
            z4 = z;
            c8595M14192.m14180(str2, "typeKeyHashCode", "J");
            c8595M14192.m14149();
            c8595M14192.m14175(c859714);
            c8595M14192.m14147(i10);
            c8595M14192.m14148();
            c8595M14192.m14149();
            c8595M14192.m14174(c859714);
            c8595M14192.m14163(0);
            c8595M14192.m14163(1);
            i5 = i10;
            c8595M14192.m14167(str2, "autoType", AbstractC0053.m146(new StringBuilder("("), AbstractC8599.f23989, ")Ljava/lang/Object;"));
            c8595M14192.m14161(i3);
            c8595M14192.m14178(c859711);
            c8595M14192.m14139(c859714);
        }
        if (z3) {
            if (c2731.f8331 instanceof C2797) {
                C1908 c19084 = c1908;
                m5476(c2731, c19084, i5, z4, i3, c85972);
                c1908 = c19084;
                c85973 = c85972;
            } else {
                c85973 = c85972;
                c8595M14192.m14163(0);
                c8595M14192.m14147(i5);
                c8595M14192.m14163(1);
                c8595M14192.m14147(4);
                c8595M14192.m14163(i3);
                c8595M14192.m14167(AbstractC8599.f24022, "readFieldValue", f8315);
            }
            c8595M14192.m14178(c85973);
            c2730 = this;
            c27312 = c2731;
            i6 = iM35942;
            c85974 = c859711;
        } else {
            c85973 = c85972;
            boolean z7 = z4;
            int i11 = i5;
            String str6 = "(J)Z";
            String str7 = "getNameHashCodeLCase";
            if (abstractC2761Arr2.length > 6) {
                TreeMap treeMap = new TreeMap();
                boolean z8 = z7;
                String str8 = "isSupportSmartMatch";
                C2771 c27712 = c2771;
                int i12 = 0;
                while (true) {
                    long[] jArr = c27712.f8459;
                    c19082 = c1908;
                    if (i12 >= jArr.length) {
                        break;
                    }
                    long j2 = jArr[i12];
                    ((List) treeMap.computeIfAbsent(Integer.valueOf((int) (j2 ^ (j2 >>> 32))), new C2768(5))).add(Long.valueOf(j2));
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
                c8595M14192.m14147(i11);
                c8595M14192.m14147(i11);
                c8595M14192.m14160(32);
                c8595M14192.m14137(125);
                c8595M14192.m14137(131);
                c8595M14192.m14137(136);
                c8595M14192.m14151(i4);
                C8597 c859715 = new C8597();
                c85974 = c859711;
                C8597[] c8597Arr = new C8597[size];
                int i14 = i3;
                for (int i15 = 0; i15 < size; i15++) {
                    c8597Arr[i15] = new C8597();
                }
                c8595M14192.m14165(i4);
                c8595M14192.m14187(c859715, iArr, c8597Arr);
                int i16 = 0;
                while (i16 < size) {
                    c8595M14192.m14139(c8597Arr[i16]);
                    List list = (List) treeMap.get(Integer.valueOf(iArr[i16]));
                    int i17 = i16;
                    int size2 = list.size();
                    C8597[] c8597Arr2 = c8597Arr;
                    int i18 = 0;
                    while (i18 < size2) {
                        TreeMap treeMap2 = treeMap;
                        int i19 = size;
                        long jLongValue = ((Long) list.get(i18)).longValue();
                        C8597 c859716 = c859715;
                        C8597 c859717 = size2 > 1 ? new C8597() : c859716;
                        c8595M14192.m14147(i11);
                        c8595M14192.m14134(jLongValue);
                        c8595M14192.m14149();
                        c8595M14192.m14175(c859717);
                        int i20 = i11;
                        short s = c27712.f8460[Arrays.binarySearch(c27712.f8459, jLongValue)];
                        AbstractC2761 abstractC2761 = abstractC2761Arr2[s];
                        C2771 c27713 = c27712;
                        int i21 = iM35942;
                        C8597 c859718 = c859717;
                        boolean z9 = z8;
                        int i22 = i18;
                        int i23 = i14;
                        List list2 = list;
                        String str9 = str7;
                        int i24 = size2;
                        AbstractC2761[] abstractC2761Arr3 = abstractC2761Arr2;
                        int i25 = i2;
                        String str10 = str8;
                        int[] iArr2 = iArr;
                        String str11 = str6;
                        C1908 c19085 = c19082;
                        m5475(c2731, abstractC2761, z9, c19085, i23, s, true);
                        c8595M14192.m14178(c85973);
                        if (c859718 != c859716) {
                            c8595M14192.m14139(c859718);
                        }
                        int i26 = i22 + 1;
                        i14 = i23;
                        list = list2;
                        str7 = str9;
                        size2 = i24;
                        z8 = z9;
                        str6 = str11;
                        c859715 = c859716;
                        c27712 = c27713;
                        iM35942 = i21;
                        treeMap = treeMap2;
                        size = i19;
                        abstractC2761Arr2 = abstractC2761Arr3;
                        i18 = i26;
                        c19082 = c19085;
                        iArr = iArr2;
                        i11 = i20;
                        str8 = str10;
                        i2 = i25;
                    }
                    int i27 = i2;
                    c8595M14192.m14178(c85973);
                    c859715 = c859715;
                    c8597Arr = c8597Arr2;
                    treeMap = treeMap;
                    abstractC2761Arr2 = abstractC2761Arr2;
                    i16 = i17 + 1;
                    c19082 = c19082;
                    iArr = iArr;
                    i11 = i11;
                    str8 = str8;
                    i2 = i27;
                }
                c27312 = c2731;
                String str12 = str6;
                i6 = iM35942;
                int i28 = i2;
                String str13 = str7;
                String str14 = str8;
                c1908 = c19082;
                i3 = i14;
                c8595M14192.m14139(c859715);
                if ((c27312.f8329.f23101 & 9007199254740992L) == 0 && !(c27312.f8331 instanceof C2797)) {
                    C8597 c859719 = new C8597();
                    if ((j & JSONReader$Feature.SupportSmartMatch.mask) == 0) {
                        i8 = 1;
                        c8595M14192.m14163(1);
                        c8595M14192.m14147(4);
                        c8595M14192.m14167(AbstractC8599.f24024, str14, str12);
                        c8595M14192.m14174(c859719);
                    } else {
                        i8 = 1;
                    }
                    c8595M14192.m14163(0);
                    c8595M14192.m14163(i8);
                    c8595M14192.m14167(AbstractC8599.f24024, str13, "()J");
                    c8595M14192.m14164(AbstractC8599.f24021, "getFieldReaderLCase", f8312);
                    c8595M14192.m14177();
                    c8595M14192.m14161(i28);
                    c8595M14192.m14173(c859719);
                    c8595M14192.m14163(i28);
                    c8595M14192.m14163(i8);
                    c8595M14192.m14163(i3);
                    c8595M14192.m14167(AbstractC8599.f24023, "readFieldValueJSONB", f8311);
                    c8595M14192.m14178(c85973);
                    c8595M14192.m14139(c859719);
                }
                c2730 = this;
            } else {
                int i29 = i11;
                AbstractC2761[] abstractC2761Arr4 = abstractC2761Arr2;
                i6 = iM35942;
                c85974 = c859711;
                int i30 = 0;
                while (true) {
                    abstractC2761Arr = abstractC2761Arr4;
                    if (i30 >= abstractC2761Arr.length) {
                        break;
                    }
                    C8597 c859720 = new C8597();
                    AbstractC2761 abstractC27612 = abstractC2761Arr[i30];
                    long jM5729 = AbstractC2859.m5729(abstractC27612.f8426);
                    int i31 = i29;
                    c8595M14192.m14147(i31);
                    c8595M14192.m14134(jM5729);
                    c8595M14192.m14149();
                    c8595M14192.m14175(c859720);
                    abstractC2761Arr4 = abstractC2761Arr;
                    m5475(c2731, abstractC27612, z7, c1908, i3, i30, false);
                    c8595M14192.m14178(c85973);
                    c8595M14192.m14139(c859720);
                    i30++;
                    i29 = i31;
                }
                int i32 = i29;
                C8597 c859721 = new C8597();
                if ((j & JSONReader$Feature.SupportSmartMatch.mask) == 0) {
                    i7 = 1;
                    c8595M14192.m14163(1);
                    c8595M14192.m14147(4);
                    c8595M14192.m14167(AbstractC8599.f24024, "isSupportSmartMatch", "(J)Z");
                    c8595M14192.m14174(c859721);
                } else {
                    i7 = 1;
                }
                c8595M14192.m14163(i7);
                c8595M14192.m14167(AbstractC8599.f24024, str7, "()J");
                c8595M14192.m14156(i32);
                for (int i33 = 0; i33 < abstractC2761Arr.length; i33++) {
                    C8597 c859722 = new C8597();
                    AbstractC2761 abstractC27613 = abstractC2761Arr[i33];
                    long jM57292 = AbstractC2859.m5729(abstractC27613.f8426);
                    c8595M14192.m14147(i32);
                    c8595M14192.m14134(jM57292);
                    c8595M14192.m14149();
                    c8595M14192.m14175(c859722);
                    m5475(c2731, abstractC27613, z7, c1908, i3, i33, false);
                    c8595M14192.m14178(c85973);
                    c8595M14192.m14139(c859722);
                }
                c2730 = this;
                c27312 = c2731;
                c8595M14192.m14139(c859721);
            }
        }
        if (c27312.f8331 instanceof C2797) {
            i9 = 1;
            c8595M14192.m14163(1);
            c8595M14192.m14167(AbstractC8599.f24024, "skipValue", "()V");
        } else {
            i9 = 1;
            c8595M14192.m14163(0);
            c8595M14192.m14163(1);
            c8595M14192.m14163(i3);
            c8595M14192.m14147(4);
            c8595M14192.m14167(AbstractC8599.f24022, "processExtra", f8314);
        }
        c8595M14192.m14178(c85973);
        c8595M14192.m14139(c85973);
        if (!zM5488) {
            c8595M14192.m14141(i6, i9);
        }
        c8595M14192.m14178(c859710);
        c8595M14192.m14139(c85974);
        if (c27312.f8331 instanceof C2797) {
            c2730.m5481(c27312, c1908);
        } else {
            c8595M14192.m14163(i3);
        }
        c8595M14192.m14162();
        c8595M14192.m14188();
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
    public final void m5479(com.alibaba.fastjson2.reader.C2731 r61, boolean r62, androidx.compose.ui.platform.C1908 r63, int r64, p297.C8597 r65, p297.C8597 r66) {
        /*
            Method dump skipped, instruction units count: 2898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2730.m5479(com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, boolean, androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, int, 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲兰苏, 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲兰苏):void");
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
    public final void m5480(com.alibaba.fastjson2.reader.C2731 r37, long r38) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2730.m5480(com.alibaba.fastjson2.reader.飘花落叶言子哲楪世苏兰, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m5481(C2731 c2731, C1908 c1908) {
        Constructor constructor;
        Constructor constructor2;
        AbstractC2761[] abstractC2761Arr = c2731.f8324;
        String str = c2731.f8330;
        C8595 c8595 = (C8595) c1908.f5623;
        C2797 c2797 = (C2797) c2731.f8331;
        Class cls = c2731.f8328;
        int i = 0;
        if (!this.f8323.m5735(cls) && cls.getTypeParameters().length == 0 && (((constructor = c2797.f8450) == null || Modifier.isPublic(constructor.getModifiers())) && Modifier.isPublic(cls.getModifiers()) && c2797.f8649 == null && ((constructor2 = c2797.f8650) == null || Modifier.isPublic(constructor2.getModifiers())))) {
            c8595.m14155(str);
            c8595.m14177();
            StringBuilder sb = new StringBuilder("(");
            int length = abstractC2761Arr.length;
            while (i < length) {
                AbstractC2761 abstractC2761 = abstractC2761Arr[i];
                c8595.m14146(c1908.m3595(abstractC2761), abstractC2761.f8427);
                sb.append(AbstractC8599.m14199(abstractC2761.f8427));
                i++;
            }
            sb.append(")V");
            c8595.m14168(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, sb.toString());
            return;
        }
        c8595.m14163(0);
        c8595.m14171(abstractC2761Arr.length);
        c8595.m14186(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        while (i < abstractC2761Arr.length) {
            AbstractC2761 abstractC27612 = abstractC2761Arr[i];
            c8595.m14177();
            c8595.m14171(i);
            c8595.m14146(c1908.m3595(abstractC27612), abstractC27612.f8427);
            Class cls2 = abstractC27612.f8427;
            if (cls2 == Integer.TYPE) {
                c8595.m14169("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            } else if (cls2 == Long.TYPE) {
                c8595.m14169("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            } else if (cls2 == Float.TYPE) {
                c8595.m14169("java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            } else if (cls2 == Double.TYPE) {
                c8595.m14169("java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            } else if (cls2 == Boolean.TYPE) {
                c8595.m14169("java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            } else if (cls2 == Short.TYPE) {
                c8595.m14169("java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            } else if (cls2 == Byte.TYPE) {
                c8595.m14169("java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            } else if (cls2 == Character.TYPE) {
                c8595.m14169("java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            }
            c8595.m14137(83);
            i++;
        }
        c8595.m14167(AbstractC8599.f24006, "createInstance", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_DESCRIPTOR);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m5482(C8595 c8595, C2731 c2731, String str) {
        Constructor constructor = c2731.f8335;
        String str2 = c2731.f8330;
        Supplier supplier = c2731.f8331.f8447;
        Class cls = c2731.f8328;
        boolean z = Modifier.isPublic(cls == null ? 1 : cls.getModifiers()) && (cls == null || !this.f8323.m5735(cls));
        if (constructor != null && z && Modifier.isPublic(constructor.getModifiers())) {
            m5464(c8595, str2, constructor);
        } else {
            if (supplier != null) {
                c8595.m14163(0);
                c8595.m14180(str, "creator", "Ljava/util/function/Supplier;");
                c8595.m14164("java/util/function/Supplier", "get", "()Ljava/lang/Object;");
            } else {
                c8595.m14163(0);
                c8595.m14163(1);
                c8595.m14147(4);
                c8595.m14167(AbstractC8599.f24024, "features", "(J)J");
                c8595.m14167(str, "createInstance", "(J)Ljava/lang/Object;");
            }
            if (z) {
                c8595.m14159(str2);
            }
        }
        if (c2731.f8333) {
            C8597 c8597 = new C8597();
            c8595.m14147(4);
            c8595.m14134(JSONReader$Feature.InitStringFieldAsEmpty.mask);
            c8595.m14150();
            c8595.m14148();
            c8595.m14149();
            c8595.m14174(c8597);
            c8595.m14177();
            c8595.m14163(0);
            c8595.m14137(95);
            c8595.m14167(str, "initStringFieldAsEmpty", "(Ljava/lang/Object;)V");
            c8595.m14139(c8597);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2775
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C2797 mo5483(Class cls, C8364 c8364, Function function, ArrayList arrayList, String[] strArr, AbstractC2761[] abstractC2761Arr, AbstractC2761[] abstractC2761Arr2) {
        Class cls2;
        Constructor constructor;
        C2797 c2797 = new C2797(cls, c8364.f23093, c8364.f23092, c8364.f23101, function, abstractC2761Arr, abstractC2761Arr2, c8364.f23088, c8364.f23107);
        Class cls3 = c8364.f23084;
        C2863 c2863 = this.f8323;
        boolean z = cls3 == null && abstractC2761Arr2.length == 0 && ((function instanceof C2745) || (function instanceof C2743)) && ((arrayList == null || arrayList.isEmpty()) && !c2863.m5735(cls) && (c8364.f23101 & JSONReader$Feature.SupportAutoType.mask) == 0 && (((constructor = c2797.f8650) == null || constructor.getParameterCount() == abstractC2761Arr.length) && ((!(function instanceof C2743) || ((C2743) function).f8380.length == abstractC2761Arr.length) && abstractC2761Arr.length <= 64)));
        if (z) {
            for (AbstractC2761 abstractC2761 : abstractC2761Arr) {
                if (abstractC2761.mo5449() != null || abstractC2761.f8413 != null || abstractC2761.f8411 != null || (((cls2 = abstractC2761.f8427) != null && (!Modifier.isPublic(cls2.getModifiers()) || c2863.m5735(cls2))) || (((abstractC2761 instanceof C2684) && ((C2684) abstractC2761).f8156 != null) || ((abstractC2761 instanceof C2682) && ((C2682) abstractC2761).f8152 != null)))) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            return c2797;
        }
        boolean zM5735 = c2863.m5735(cls);
        C8598 c8598 = new C8598(new C2774(cls, 1));
        c8364.f23101 |= 144115188075855872L;
        C2731 c2731 = new C2731(c8364, cls, c8598, zM5735, abstractC2761Arr, null);
        c2731.f8331 = c2797;
        String str = AbstractC8599.f24006;
        m5470(abstractC2761Arr, c8598, str);
        c8598.m14194(c2731.f8337, str, new String[0]);
        C8595 c8595M14192 = c8598.m14192(abstractC2761Arr2.length <= 12 ? 32 : 128, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V");
        c8595M14192.m14163(0);
        c8595M14192.m14163(1);
        c8595M14192.m14163(2);
        c8595M14192.m14163(3);
        c8595M14192.m14147(4);
        c8595M14192.m14163(6);
        c8595M14192.m14163(7);
        c8595M14192.m14163(8);
        c8595M14192.m14163(9);
        c8595M14192.m14163(10);
        c8595M14192.m14163(11);
        c8595M14192.m14163(12);
        c8595M14192.m14168(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V");
        m5469(abstractC2761Arr, c2731.f8337, true, 9, c8595M14192, str);
        c8595M14192.m14143();
        c8595M14192.m14188();
        m5480(c2731, c8364.f23101);
        if (!c2731.m5487()) {
            m5478(c2731, c8364.f23101);
        }
        byte[] bArrM14195 = c8598.m14195();
        try {
            return (C2797) c2863.m5736(c2731.f8334, bArrM14195.length, bArrM14195).getConstructors()[0].newInstance(cls, c8364.f23093, c8364.f23092, Long.valueOf(c8364.f23101), function, arrayList, strArr, abstractC2761Arr, abstractC2761Arr2, null, null);
        } catch (Throwable th) {
            C0276.m842("create objectReader error".concat(", objectType " + cls.getTypeName()), th);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2775
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC2787 mo5484(Class cls, Type type, boolean z, C2801 c2801) {
        Constructor constructor;
        Constructor constructorM5767;
        String str;
        Class cls2;
        Method method;
        boolean zM5735 = this.f8323.m5735(cls);
        int modifiers = cls.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            return super.mo5484(cls, type, z, c2801);
        }
        C8364 c8364 = new C8364(c2801);
        CopyOnWriteArrayList copyOnWriteArrayList = c2801.f8678;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            ((C2778) copyOnWriteArrayList.get(i)).f8498.m4145(cls, c8364);
        }
        if (zM5735 || !Modifier.isPublic(modifiers)) {
            c8364.f23101 |= 18014398509481984L;
        }
        Class cls3 = c8364.f23099;
        if (cls3 != null && InterfaceC2787.class.isAssignableFrom(cls3)) {
            try {
                Constructor declaredConstructor = c8364.f23099.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (InterfaceC2787) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                C0276.m842("create deserializer error", e);
                return null;
            }
        }
        boolean z2 = (z && (cls.isInterface() || AbstractC2864.m5745(cls))) ? false : z;
        if (Enum.class.isAssignableFrom(cls) && ((method = c8364.f23108) == null || method.getParameterCount() == 1)) {
            return C2775.m5550(cls, c8364.f23108, c2801);
        }
        if (c8364.f23110 != null || c8364.f23108 != null) {
            return m5560(cls, type, c2801, c8364);
        }
        if (c8364.f23091 != null) {
            return m5566(cls, type, c2801, c8364);
        }
        if (Throwable.class.isAssignableFrom(cls) || AbstractC2864.m5755(cls)) {
            return super.mo5484(cls, type, z2, c2801);
        }
        if (cls == Class.class) {
            return C2718.f8281;
        }
        AbstractC2761[] abstractC2761ArrM5567 = m5567(cls, type, c8364, z2, c2801);
        boolean z3 = abstractC2761ArrM5567.length <= 96;
        if (!z2) {
            if (AbstractC2853.f8916 >= 9 && cls == StackTraceElement.class) {
                try {
                    return C2775.m5552(StackTraceElement.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE), "", "classLoaderName", "moduleName", "moduleVersion", "declaringClass", "methodName", "fileName", "lineNumber");
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            for (AbstractC2761 abstractC2761 : abstractC2761ArrM5567) {
                if (!abstractC2761.mo5440()) {
                    long j = abstractC2761.f8420;
                    if ((j & 562949953421312L) == 0 && (j & 2251799813685248L) == 0) {
                    }
                }
                z3 = false;
                break;
            }
        }
        if (c8364.f23084 != null) {
            z3 = false;
        }
        if (z3) {
            for (AbstractC2761 abstractC27612 : abstractC2761ArrM5567) {
                if (abstractC27612.f8413 != null || abstractC27612.f8411 != null || (((cls2 = abstractC27612.f8427) != null && !Modifier.isPublic(cls2.getModifiers())) || (((abstractC27612 instanceof C2684) && ((C2684) abstractC27612).f8156 != null) || ((abstractC27612 instanceof C2682) && ((C2682) abstractC27612).f8152 != null)))) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3 && (c8364.f23083 != null || ((str = c8364.f23097) != null && !str.isEmpty()))) {
            z3 = false;
        }
        if (!z3) {
            return super.mo5484(cls, type, z2, c2801);
        }
        if (Modifier.isInterface(modifiers) || Modifier.isAbstract(modifiers) || (constructorM5767 = AbstractC2864.m5767(cls, true)) == null) {
            constructor = null;
        } else {
            try {
                constructorM5767.setAccessible(true);
            } catch (SecurityException unused2) {
            }
            constructor = constructorM5767;
        }
        Class[] clsArr = c8364.f23088;
        if (clsArr == null || clsArr.length == 0) {
            return (z2 || constructor != null) ? m5474(cls, type, z2, zM5735, modifiers, c8364, null, abstractC2761ArrM5567, constructor) : super.mo5484(cls, type, false, c2801);
        }
        return new C2799(cls, c8364.f23093, null, JSONReader$Feature.SupportAutoType.mask, null, m5564(cls), null, clsArr, c8364.f23107, c8364.f23106, abstractC2761ArrM5567);
    }

    @Override // com.alibaba.fastjson2.reader.C2775
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2771 mo5485(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761... abstractC2761Arr) {
        if (cls == null && supplier != null && function == null) {
            for (AbstractC2761 abstractC2761 : abstractC2761Arr) {
                if (abstractC2761.mo5429() != null) {
                }
            }
            return m5474(cls, cls, false, false, 0, new C8364(AbstractC2932.m6329()), supplier, abstractC2761Arr, null);
        }
        return super.mo5485(cls, str, str2, j, jSONSchema, supplier, function, abstractC2761Arr);
    }
}
