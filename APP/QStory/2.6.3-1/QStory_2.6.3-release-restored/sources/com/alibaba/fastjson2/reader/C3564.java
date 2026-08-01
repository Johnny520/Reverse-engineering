package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.compose.p001ui.platform.C2743;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3697;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3897;
import io.ktor.client.plugins.api.C4718;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.TreeMap;
import java.util.UUID;
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
import p025.AbstractC7012;
import p294.C9194;
import p307.C9368;
import p311.InterfaceC9401;
import p311.InterfaceC9402;
import p311.InterfaceC9403;
import p311.InterfaceC9404;
import p311.InterfaceC9405;
import p313.AbstractC9420;
import p313.C9416;
import p313.C9418;
import p313.C9419;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3564 extends C3609 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String f8654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String f8655;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final String f8656;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String[] f8657;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final String f8658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String f8659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String f8660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String f8661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String f8662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final String f8663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String f8664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String f8666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String f8667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String f8668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String f8669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3697 f8670;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3564 f8653 = new C3564(C3697.f9353);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AtomicLong f8665 = new AtomicLong();

    static {
        StringBuilder sb = new StringBuilder("(");
        String str = AbstractC9420.f24325;
        sb.append(str);
        sb.append(")");
        String str2 = AbstractC9420.f24322;
        sb.append(str2);
        f8664 = sb.toString();
        f8668 = AbstractC7012.m12140("(", str, ")", str2);
        StringBuilder sb2 = new StringBuilder("(Ljava/lang/Class;Ljava/util/function/Supplier;");
        String str3 = AbstractC9420.f24329;
        f8669 = AbstractC0900.m711(sb2, str3, ")V");
        f8666 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;J" + AbstractC9420.f24324 + "Ljava/util/function/Supplier;Ljava/util/function/Function;" + str3 + ")V";
        f8667 = AbstractC0900.m718("(", str, "Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;");
        StringBuilder sb3 = new StringBuilder("(J)");
        sb3.append(AbstractC9420.f24330);
        f8659 = sb3.toString();
        f8658 = AbstractC0900.m718("(", str, "Ljava/lang/Object;)V");
        f8662 = AbstractC0900.m718("(J", str, "JLjava/lang/Object;)V");
        f8663 = AbstractC0900.m718("(", str, "Ljava/lang/Object;Ljava/lang/String;)V");
        f8660 = AbstractC7012.m12140("(", str, ")", str2);
        f8661 = AbstractC0900.m718("(", str, "Ljava/lang/Object;J)V");
        f8655 = AbstractC7012.m12140("(", str, "J)", str2);
        f8654 = AbstractC0900.m718("(", str, "Ljava/lang/Object;I)V");
        HashMap map = new HashMap();
        Package r1 = C3564.class.getPackage();
        f8656 = r1 != null ? r1.getName() : "";
        AbstractC9420.m14775(InterfaceC9405.class);
        int i = 13;
        map.put(Boolean.TYPE, new C4718(i));
        AbstractC9420.m14775(InterfaceC9403.class);
        map.put(Character.TYPE, new C4718(i));
        AbstractC9420.m14775(InterfaceC9404.class);
        map.put(Byte.TYPE, new C4718(i));
        AbstractC9420.m14775(InterfaceC9401.class);
        map.put(Short.TYPE, new C4718(i));
        AbstractC9420.m14775(ObjIntConsumer.class);
        map.put(Integer.TYPE, new C4718(i));
        AbstractC9420.m14775(ObjLongConsumer.class);
        map.put(Long.TYPE, new C4718(i));
        AbstractC9420.m14775(InterfaceC9402.class);
        map.put(Float.TYPE, new C4718(i));
        AbstractC9420.m14775(ObjDoubleConsumer.class);
        map.put(Double.TYPE, new C4718(i));
        AbstractC9420.m14775(BiConsumer.class);
        map.put(String.class, new C4718(i));
        AbstractC9420.m14775(BiConsumer.class);
        map.put(Integer.class, new C4718(i));
        f8657 = new String[1024];
    }

    public C3564(ClassLoader classLoader) {
        this.f8670 = classLoader instanceof C3697 ? (C3697) classLoader : new C3697(classLoader);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m6069(C9416 c9416, String str, Constructor constructor) {
        c9416.m14733(str);
        c9416.m14755();
        if (constructor.getParameterCount() == 0) {
            c9416.m14746(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
            return;
        }
        Class<?> cls = constructor.getParameterTypes()[0];
        c9416.m14715(1);
        c9416.m14746(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(" + AbstractC9420.m14777(cls) + ")V");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static void m6070(AbstractC3595 abstractC3595, String str, C2743 c2743, int i, int i2, boolean z, Class cls, Type type, long j, Type type2, String str2, C3565 c3565) {
        Class cls2;
        int iM4164;
        String str3;
        String str4;
        String str5;
        int i3;
        Type type3;
        String str6;
        String str7;
        int i4;
        String str8;
        C9418 c9418;
        AbstractC3595 abstractC35952;
        int i5;
        Type type4;
        int i6;
        C9418 c94182;
        String str9;
        String str10;
        String str11;
        C9418 c94183;
        Field field;
        boolean z2 = c2743.f5971;
        Type type5 = type2 == null ? Object.class : type2;
        Class clsM6502 = AbstractC3700.m6502(type5);
        String strM6078 = m6078(i2);
        C9416 c9416 = (C9416) c2743.f5969;
        if (c3565.f8678 instanceof C3631) {
            iM4164 = c2743.m4165(abstractC3595);
            cls2 = cls;
        } else {
            cls2 = cls;
            iM4164 = c2743.m4164(cls2);
        }
        int iM41642 = c2743.m4164(InterfaceC3621.class);
        String str12 = cls2.isInterface() ? "java/util/ArrayList" : str2;
        C9418 c94184 = new C9418();
        C9418 c94185 = new C9418();
        C9418 c94186 = new C9418();
        Type type6 = type5;
        boolean z3 = AbstractC3687.f9263 == 8 && "java/util/ArrayList".equals(str12);
        int iM41643 = c2743.m4164("ITEM_CNT");
        boolean z4 = z3;
        String str13 = "java/util/List";
        String str14 = "add";
        String str15 = "(Ljava/lang/Object;)Z";
        String str16 = f8667;
        Class cls3 = String.class;
        if (z2) {
            if (c3565.m6093()) {
                c94182 = c94185;
                str9 = "(I)V";
                str10 = str12;
                str11 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            } else {
                str9 = "(I)V";
                C9418 c94187 = new C9418();
                str11 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                c9416.m14741(0);
                str10 = str12;
                c9416.m14758(str, AbstractC3897.m7394(i2), AbstractC9420.f24330);
                c9416.m14741(1);
                c94182 = c94185;
                c9416.m14745(AbstractC9420.f24359, "checkObjectAutoType", f8660);
                c9416.m14755();
                c9416.m14739(iM41642);
                c9416.m14751(c94187);
                c9416.m14741(iM41642);
                c9416.m14741(1);
                m6071(str, c9416, i2, type);
                c9416.m14761(abstractC3595.f8773);
                c9416.m14712(j);
                c9416.m14742(AbstractC9420.f24357, "readJSONBObject", str16);
                c9416.m14737(str2);
                c9416.m14739(iM4164);
                c9416.m14756(c94184);
                c9416.m14717(c94187);
            }
            c9416.m14741(1);
            c9416.m14745(AbstractC9420.f24360, "startArray", "()I");
            c9416.m14755();
            c9416.m14729(iM41643);
            c9416.m14716(-1);
            C9418 c94188 = c94182;
            c9416.m14714(160, c94188);
            c9416.m14715(1);
            c9416.m14739(iM4164);
            c9416.m14756(c94184);
            c9416.m14717(c94188);
            if (abstractC3595.f8772 != null || (field = abstractC3595.f8769) == null) {
                c94183 = c94186;
                str3 = "readJSONBObject";
            } else {
                long jObjectFieldOffset = AbstractC3687.f9266.objectFieldOffset(field);
                c9416.m14759(AbstractC9420.f24348, "UNSAFE", "Lsun/misc/Unsafe;");
                c9416.m14741(i);
                c9416.m14712(jObjectFieldOffset);
                c9416.m14745("sun/misc/Unsafe", "getObject", "(Ljava/lang/Object;J)Ljava/lang/Object;");
                c9416.m14755();
                c9416.m14737(str2);
                c9416.m14739(iM4164);
                C9418 c94189 = new C9418();
                c9416.m14751(c94189);
                c9416.m14741(iM4164);
                c9416.m14745(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, "getClass", "()Ljava/lang/Class;");
                str3 = "readJSONBObject";
                c9416.m14759("java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
                c9416.m14745(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, "getClass", "()Ljava/lang/Class;");
                c94183 = c94186;
                c9416.m14748(c94183);
                c9416.m14717(c94189);
            }
            String str17 = str10;
            c9416.m14733(str17);
            c9416.m14755();
            if (z4) {
                c9416.m14743(iM41643);
                c9416.m14746(str17, str11, str9);
            } else {
                c9416.m14746(str17, str11, "()V");
            }
            c9416.m14739(iM4164);
            c9416.m14717(c94183);
            str4 = str16;
            i3 = iM41643;
            type3 = type6;
            str6 = "readString";
            str5 = "()Z";
        } else {
            str3 = "readJSONBObject";
            String str18 = str12;
            C9418 c941810 = new C9418();
            C9418 c941811 = new C9418();
            C9418 c941812 = new C9418();
            str4 = str16;
            c9416.m14741(1);
            String str19 = AbstractC9420.f24360;
            str5 = "()Z";
            c9416.m14745(str19, "nextIfNull", str5);
            c9416.m14753(c941812);
            c9416.m14741(1);
            c9416.m14745(str19, "nextIfArrayStart", str5);
            c9416.m14753(c941810);
            if (clsM6502 == cls3) {
                i3 = iM41643;
                c9416.m14741(1);
                c9416.m14745(str19, "isString", str5);
                c9416.m14752(c941811);
                c9416.m14733(str18);
                c9416.m14755();
                if (z4) {
                    c9416.m14716(10);
                    c9416.m14746(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
                } else {
                    c9416.m14746(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
                }
                c9416.m14739(iM4164);
                c9416.m14741(1);
                c9416.m14745(str19, "nextIfNullOrEmptyString", str5);
                c9416.m14753(c94184);
                c9416.m14741(iM4164);
                c9416.m14741(1);
                if (clsM6502 == cls3) {
                    str7 = "readString";
                    c9416.m14745(str19, str7, "()Ljava/lang/String;");
                } else {
                    str7 = "readString";
                }
                cls3 = cls3;
                c9416.m14742(str13, str14, str15);
                c9416.m14732();
                c9416.m14756(c94184);
                str13 = str13;
                str14 = str14;
                str15 = str15;
                type3 = type6;
                str6 = str7;
            } else {
                cls3 = cls3;
                i3 = iM41643;
                type3 = type6;
                str6 = "readString";
                if (type3 instanceof Class) {
                    c9416.m14741(1);
                    c9416.m14745(str19, "nextIfNullOrEmptyString", str5);
                    c9416.m14753(c941812);
                    c9416.m14733(str18);
                    c9416.m14755();
                    if (z4) {
                        c9416.m14716(10);
                        c9416.m14746(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
                    } else {
                        c9416.m14746(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
                    }
                    c9416.m14739(iM4164);
                    c9416.m14741(1);
                    c9416.m14741(iM4164);
                    c9416.m14713((Class) type3);
                    c9416.m14745(str19, "readArray", "(Ljava/util/List;Ljava/lang/reflect/Type;)V");
                    c9416.m14756(c94184);
                }
            }
            c9416.m14717(c941811);
            c9416.m14741(1);
            c9416.m14745(str19, "skipValue", "()V");
            c9416.m14717(c941812);
            c9416.m14715(1);
            c9416.m14739(iM4164);
            c9416.m14756(c94184);
            c9416.m14717(c941810);
            c9416.m14733(str18);
            c9416.m14755();
            if (z4) {
                c9416.m14716(10);
                c9416.m14746(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V");
            } else {
                c9416.m14746(str18, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
            }
            c9416.m14739(iM4164);
        }
        int iM41644 = c2743.m4164("J");
        C9418 c941813 = new C9418();
        C9418 c941814 = new C9418();
        C9418 c941815 = new C9418();
        c9416.m14715(3);
        c9416.m14729(iM41644);
        c9416.m14717(c941813);
        if (z2) {
            c9416.m14743(iM41644);
            c9416.m14743(i3);
            c9416.m14714(162, c941814);
            i4 = 1;
        } else {
            i4 = 1;
            c9416.m14741(1);
            c9416.m14745(AbstractC9420.f24360, "nextIfArrayEnd", str5);
            c9416.m14753(c941814);
        }
        if (type3 == cls3) {
            c9416.m14741(iM4164);
            c9416.m14741(i4);
            c9416.m14745(AbstractC9420.f24360, str6, "()Ljava/lang/String;");
        } else if (type3 == Integer.class) {
            c9416.m14741(iM4164);
            c9416.m14741(i4);
            c9416.m14745(AbstractC9420.f24360, "readInt32", "()Ljava/lang/Integer;");
        } else {
            if (type3 != Long.class) {
                C9418 c941816 = new C9418();
                c9416.m14741(0);
                String str20 = AbstractC9420.f24322;
                c9416.m14758(str, strM6078, str20);
                c9416.m14750(c941816);
                c9416.m14741(0);
                c9416.m14741(0);
                c9416.m14758(str, AbstractC3897.m7394(i2), AbstractC9420.f24330);
                c9416.m14741(1);
                c9416.m14745(AbstractC9420.f24359, "getItemObjectReader", f8664);
                c9416.m14730(str, strM6078, str20);
                c9416.m14717(c941816);
                if ((c3565.f8676.f23445 & 144115188075855872L) == 0) {
                    c9416.m14741(1);
                    c9416.m14741(iM4164);
                    c9416.m14743(iM41644);
                    c9416.m14745(AbstractC9420.f24360, "readReference", "(Ljava/util/List;I)Z");
                    c9416.m14753(c941815);
                }
                c9416.m14741(iM4164);
                C9418 c941817 = new C9418();
                C9418 c941818 = new C9418();
                if (z) {
                    c9416.m14741(1);
                    c9416.m14745(AbstractC9420.f24360, "isArray", str5);
                    c9416.m14752(c941817);
                    c9416.m14741(0);
                    c9416.m14758(str, strM6078, str20);
                    c9416.m14741(1);
                    i5 = i2;
                    type4 = type;
                    m6071(str, c9416, i5, type4);
                    abstractC35952 = abstractC3595;
                    c9416.m14761(abstractC35952.f8773);
                    c9416.m14725(4);
                    String str21 = AbstractC9420.f24357;
                    String str22 = z2 ? "readArrayMappingJSONBObject" : "readArrayMappingObject";
                    str8 = str4;
                    c9418 = c94184;
                    i6 = iM4164;
                    c9416.m14742(str21, str22, str8);
                    c9416.m14756(c941818);
                    c9416.m14717(c941817);
                } else {
                    str8 = str4;
                    c9418 = c94184;
                    abstractC35952 = abstractC3595;
                    i5 = i2;
                    type4 = type;
                    i6 = iM4164;
                }
                c9416.m14741(0);
                c9416.m14758(str, strM6078, str20);
                c9416.m14741(1);
                m6071(str, c9416, i5, type4);
                c9416.m14761(abstractC35952.f8773);
                c9416.m14725(4);
                c9416.m14742(AbstractC9420.f24357, z2 ? str3 : "readObject", str8);
                if (z) {
                    c9416.m14717(c941818);
                }
                c9416.m14742(str13, str14, str15);
                c9416.m14732();
                c9416.m14717(c941815);
                c9416.m14719(iM41644, 1);
                c9416.m14756(c941813);
                c9416.m14717(c941814);
                c9416.m14717(c9418);
                c9416.m14741(i6);
            }
            c9416.m14741(iM4164);
            c9416.m14741(i4);
            c9416.m14745(AbstractC9420.f24360, "readInt64", "()Ljava/lang/Long;");
        }
        c9418 = c94184;
        i6 = iM4164;
        c9416.m14742(str13, str14, str15);
        c9416.m14732();
        c9416.m14717(c941815);
        c9416.m14719(iM41644, 1);
        c9416.m14756(c941813);
        c9416.m14717(c941814);
        c9416.m14717(c9418);
        c9416.m14741(i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static void m6071(String str, C9416 c9416, int i, Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            String name = cls.getName();
            boolean zIsPublic = Modifier.isPublic(cls.getModifiers());
            boolean z = name.startsWith("java.") || cls == JSONArray.class || cls == JSONObject.class;
            if (zIsPublic && z) {
                c9416.m14713(cls);
                return;
            }
        }
        c9416.m14741(0);
        c9416.m14758(str, AbstractC3897.m7394(i), AbstractC9420.f24330);
        c9416.m14758(AbstractC9420.f24359, "fieldType", "Ljava/lang/reflect/Type;");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6072(AbstractC3595 abstractC3595, String str, C2743 c2743, int i, Type type, Class cls, long j, String str2) {
        int iMin;
        int iMax;
        C9418[] c9418Arr;
        C9416 c9416 = (C9416) c2743.f5969;
        boolean z = c2743.f5971;
        Object[] enumConstants = cls.getEnumConstants();
        TreeMap treeMap = new TreeMap();
        int i2 = 2;
        int i3 = 4;
        int i4 = 0;
        if (enumConstants != null) {
            int i5 = 0;
            iMin = 0;
            iMax = 0;
            while (i5 < enumConstants.length) {
                Enum r15 = (Enum) enumConstants[i5];
                byte[] bytes = r15.name().getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                if (i5 == 0) {
                    iMin = length;
                    iMax = iMin;
                } else {
                    iMin = Math.min(length, iMin);
                    iMax = Math.max(length, iMax);
                }
                byte[] bArr = new byte[i3];
                bArr[0] = 34;
                int i6 = i3;
                if (bytes.length == i2) {
                    System.arraycopy(bytes, 0, bArr, 1, i2);
                    bArr[3] = 34;
                } else if (bytes.length >= 3) {
                    System.arraycopy(bytes, 0, bArr, 1, 3);
                }
                int i7 = AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265);
                List arrayList = (List) treeMap.get(Integer.valueOf(i7));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    treeMap.put(Integer.valueOf(i7), arrayList);
                }
                arrayList.add(r15);
                i5++;
                i3 = i6;
                i2 = 2;
            }
        } else {
            iMin = 0;
            iMax = 0;
        }
        int i8 = i3;
        C9418 c9418 = new C9418();
        C9418 c94182 = new C9418();
        C9418 c94183 = new C9418();
        c9416.m14741(0);
        String str3 = AbstractC9420.f24322;
        c9416.m14758(str, str2, str3);
        c9416.m14750(c94183);
        c9416.m14741(0);
        c9416.m14741(0);
        c9416.m14758(str, AbstractC3897.m7394(i), AbstractC9420.f24330);
        c9416.m14741(1);
        c9416.m14745(AbstractC9420.f24359, "getObjectReader", f8668);
        c9416.m14730(str, str2, str3);
        c9416.m14717(c94183);
        c9416.m14741(0);
        c9416.m14758(str, str2, str3);
        Class<C3570> cls2 = C3570.class;
        c9416.m14764(193, AbstractC9420.m14775(cls2));
        c9416.m14752(c9418);
        if (iMin >= 2 && iMax <= 11) {
            int[] iArr = new int[treeMap.size()];
            int size = treeMap.size();
            C9418[] c9418Arr2 = new C9418[size];
            Iterator it = treeMap.keySet().iterator();
            for (int i9 = 0; i9 < size; i9++) {
                c9418Arr2[i9] = new C9418();
                iArr[i9] = ((Integer) it.next()).intValue();
            }
            c9416.m14741(1);
            c9416.m14745(AbstractC9420.f24360, "getRawInt", "()I");
            c9416.m14765(c9418, iArr, c9418Arr2);
            int i10 = 0;
            while (i10 < size) {
                c9416.m14717(c9418Arr2[i10]);
                List list = (List) treeMap.get(Integer.valueOf(iArr[i10]));
                int i11 = i4;
                while (i11 < list.size()) {
                    C9418 c94184 = i11 > 0 ? new C9418() : null;
                    Enum r18 = (Enum) list.get(i11);
                    boolean z2 = z;
                    byte[] bytes2 = r18.name().getBytes(StandardCharsets.UTF_8);
                    int length2 = bytes2.length;
                    TreeMap treeMap2 = treeMap;
                    Class<C3570> cls3 = cls2;
                    int[] iArr2 = iArr;
                    int i12 = size;
                    switch (length2) {
                        case 2:
                            c9418Arr = c9418Arr2;
                            c9416.m14741(1);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match2", "()Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                                c9416.m14717(c94184);
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 3:
                            c9418Arr = c9418Arr2;
                            c9416.m14741(1);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match3", "()Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 4:
                            c9418Arr = c9418Arr2;
                            c9416.m14741(1);
                            c9416.m14716(bytes2[3]);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match4", "(B)Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 5:
                            c9418Arr = c9418Arr2;
                            c9416.m14741(1);
                            c9416.m14716(bytes2[3]);
                            i8 = 4;
                            c9416.m14716(bytes2[4]);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match5", "(BB)Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 6:
                            c9418Arr = c9418Arr2;
                            byte b = bytes2[3];
                            byte b2 = bytes2[i8];
                            byte b3 = bytes2[5];
                            byte[] bArr2 = new byte[i8];
                            bArr2[0] = b;
                            bArr2[1] = b2;
                            bArr2[2] = b3;
                            bArr2[3] = 34;
                            int i13 = AbstractC3687.f9266.getInt(bArr2, AbstractC3687.f9265);
                            c9416.m14741(1);
                            c9416.m14716(i13);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match6", "(I)Z");
                            i8 = 4;
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 7:
                            c9418Arr = c9418Arr2;
                            int i14 = AbstractC3687.f9266.getInt(bytes2, AbstractC3687.f9265 + 3);
                            c9416.m14741(1);
                            c9416.m14716(i14);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match7", "(I)Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 8:
                            c9418Arr = c9418Arr2;
                            int i15 = AbstractC3687.f9266.getInt(bytes2, AbstractC3687.f9265 + 3);
                            c9416.m14741(1);
                            c9416.m14716(i15);
                            c9416.m14716(bytes2[7]);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match8", "(IB)Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 9:
                            c9418Arr = c9418Arr2;
                            int i16 = AbstractC3687.f9266.getInt(bytes2, AbstractC3687.f9265 + 3);
                            c9416.m14741(1);
                            c9416.m14716(i16);
                            c9416.m14716(bytes2[7]);
                            c9416.m14716(bytes2[8]);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match9", "(IBB)Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 10:
                            c9418Arr = c9418Arr2;
                            byte[] bArr3 = new byte[8];
                            System.arraycopy(bytes2, 3, bArr3, 0, 7);
                            bArr3[7] = 34;
                            long j2 = AbstractC3687.f9266.getLong(bArr3, AbstractC3687.f9265);
                            c9416.m14741(1);
                            c9416.m14712(j2);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match10", "(J)Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        case 11:
                            byte[] bArr4 = new byte[8];
                            System.arraycopy(bytes2, 3, bArr4, 0, 8);
                            c9418Arr = c9418Arr2;
                            long j3 = AbstractC3687.f9266.getLong(bArr4, AbstractC3687.f9265);
                            c9416.m14741(1);
                            c9416.m14712(j3);
                            c9416.m14745(AbstractC9420.f24360, "nextIfValue4Match11", "(J)Z");
                            c9416.m14752(c94184 == null ? c94184 : c9418);
                            c9416.m14741(0);
                            c9416.m14758(str, str2, AbstractC9420.f24322);
                            c9416.m14737(AbstractC9420.m14775(cls3));
                            c9416.m14716(r18.ordinal());
                            c9416.m14745(AbstractC9420.m14775(cls3), "getEnumByOrdinal", "(I)Ljava/lang/Enum;");
                            c9416.m14756(c94182);
                            if (c94184 == null) {
                            }
                            i11++;
                            z = z2;
                            treeMap = treeMap2;
                            cls2 = cls3;
                            iArr = iArr2;
                            size = i12;
                            c9418Arr2 = c9418Arr;
                            break;
                        default:
                            C6755.m11870(AbstractC7012.m12147(length2, "fieldNameLength "));
                            break;
                    }
                    return;
                }
                c9416.m14756(c9418);
                i10++;
                i4 = 0;
            }
        }
        boolean z3 = z;
        c9416.m14717(c9418);
        c9416.m14741(0);
        c9416.m14758(str, str2, AbstractC9420.f24322);
        c9416.m14741(1);
        m6071(str, c9416, i, type);
        c9416.m14761(abstractC3595.f8773);
        c9416.m14712(j);
        c9416.m14742(AbstractC9420.f24357, z3 ? "readJSONBObject" : "readObject", f8667);
        c9416.m14717(c94182);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m6073(AbstractC3595[] abstractC3595Arr, C2743 c2743) {
        C9416 c9416 = (C9416) c2743.f5969;
        for (AbstractC3595 abstractC3595 : abstractC3595Arr) {
            Class cls = abstractC3595.f8774;
            int iM4165 = c2743.m4165(abstractC3595);
            if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Boolean.TYPE || cls == Character.TYPE) {
                c9416.m14715(3);
                c9416.m14729(iM4165);
            } else if (cls == Long.TYPE) {
                c9416.m14726();
                c9416.m14734(iM4165);
            } else if (cls == Float.TYPE) {
                c9416.m14715(3);
                c9416.m14715(134);
                c9416.m14760(56, iM4165);
            } else if (cls == Double.TYPE) {
                c9416.m14715(3);
                c9416.m14715(135);
                c9416.m14760(57, iM4165);
            } else {
                c9416.m14715(1);
                c9416.m14739(iM4165);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m6074(AbstractC3595[] abstractC3595Arr, String str, boolean z, int i, C9416 c9416, String str2) {
        if ((str2 == AbstractC9420.f24358 || str2 == AbstractC9420.f24342) && z) {
            for (int i2 = 0; i2 < abstractC3595Arr.length; i2++) {
                c9416.m14741(0);
                c9416.m14741(i);
                c9416.m14749(i2);
                c9416.m14715(50);
                c9416.m14730(str, AbstractC3897.m7394(i2), AbstractC9420.f24330);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static void m6075(AbstractC3595[] abstractC3595Arr, C9419 c9419, String str) {
        if (str == AbstractC9420.f24358 || str == AbstractC9420.f24342) {
            for (int i = 0; i < abstractC3595Arr.length; i++) {
                c9419.m14771(AbstractC3897.m7394(i), AbstractC9420.f24330);
            }
            for (int i2 = 0; i2 < abstractC3595Arr.length; i2++) {
                c9419.m14771(m6077(i2), AbstractC9420.f24322);
            }
        }
        for (int i3 = 0; i3 < abstractC3595Arr.length; i3++) {
            if (List.class.isAssignableFrom(abstractC3595Arr[i3].f8774)) {
                c9419.m14771(m6078(i3), AbstractC9420.f24322);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m6076(String str, C2743 c2743) {
        C9416 c9416 = (C9416) c2743.f5969;
        int iM4164 = c2743.m4164("autoTypeObjectReader");
        C9418 c9418 = new C9418();
        c9416.m14741(0);
        c9416.m14741(1);
        c9416.m14725(4);
        c9416.m14745(str, "checkAutoType", f8655);
        c9416.m14755();
        c9416.m14739(iM4164);
        c9416.m14751(c9418);
        c9416.m14741(iM4164);
        c9416.m14741(1);
        c9416.m14741(2);
        c9416.m14741(3);
        c9416.m14725(4);
        c9416.m14742(AbstractC9420.f24357, "readJSONBObject", f8667);
        c9416.m14740();
        c9416.m14717(c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m6077(int i) {
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
                int iM6316 = AbstractC3682.m6316(i) + 12;
                char[] cArr = new char[iM6316];
                "objectReader".getChars(0, 12, cArr, 0);
                AbstractC3682.m6292(i, iM6316, cArr);
                return new String(cArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static String m6078(int i) {
        String[] strArr = f8657;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int iM6316 = AbstractC3682.m6316(i) + 10;
        char[] cArr = new char[iM6316];
        "itemReader".getChars(0, 10, cArr, 0);
        AbstractC3682.m6292(i, iM6316, cArr);
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
    */
    public final C3605 m6079(Class cls, Type type, boolean z, boolean z2, int i, C9194 c9194, Supplier supplier, AbstractC3595[] abstractC3595Arr, Constructor constructor) {
        String str;
        C3697 c3697;
        Supplier supplier2;
        C3565 c3565;
        long j;
        AbstractC3595[] abstractC3595Arr2;
        String str2;
        String str3;
        int i2;
        C9418[] c9418Arr;
        C9418 c9418;
        C3564 c3564 = this;
        C9419 c9419 = new C9419(new C3608(cls, 0));
        C3565 c35652 = new C3565(c9194, cls, c9419, z2, abstractC3595Arr, constructor);
        boolean z3 = abstractC3595Arr.length <= 96;
        switch (abstractC3595Arr.length) {
            case 1:
                str = AbstractC9420.f24350;
                break;
            case 2:
                str = AbstractC9420.f24349;
                break;
            case 3:
                str = AbstractC9420.f24353;
                break;
            case 4:
                str = AbstractC9420.f24354;
                break;
            case 5:
                str = AbstractC9420.f24351;
                break;
            case 6:
                str = AbstractC9420.f24352;
                break;
            case 7:
                str = AbstractC9420.f24336;
                break;
            case 8:
                str = AbstractC9420.f24335;
                break;
            case 9:
                str = AbstractC9420.f24334;
                break;
            case 10:
                str = AbstractC9420.f24333;
                break;
            case 11:
                str = AbstractC9420.f24332;
                break;
            case 12:
                str = AbstractC9420.f24331;
                break;
            default:
                str = AbstractC9420.f24358;
                break;
        }
        if (z3) {
            m6075(abstractC3595Arr, c9419, str);
        }
        String str4 = c35652.f8684;
        c9419.m14772(str4, str, new String[0]);
        C9416 c9416M14770 = c9419.m14770(abstractC3595Arr.length <= 12 ? 32 : 128, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, f8669);
        c9416M14770.m14741(0);
        c9416M14770.m14741(1);
        String str5 = c9194.f23437;
        if (str5 != null) {
            c9416M14770.m14761(str5);
        } else {
            c9416M14770.m14715(1);
        }
        c9416M14770.m14715(1);
        c9416M14770.m14712(c9194.f23445);
        c9416M14770.m14715(1);
        c9416M14770.m14741(2);
        c9416M14770.m14715(1);
        c9416M14770.m14741(3);
        c9416M14770.m14746(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, f8666);
        String str6 = str;
        m6074(abstractC3595Arr, c35652.f8684, z3, 3, c9416M14770, str6);
        c9416M14770.m14721();
        c9416M14770.m14766();
        String str7 = (z && constructor == null) ? "createInstance0" : "createInstance";
        try {
            if ((!z2 || constructor == null) && (!z || (constructor != null && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(cls.getModifiers())))) {
                if (constructor != null && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(cls.getModifiers())) {
                    C9416 c9416M147702 = c9419.m14770(32, str7, "(J)Ljava/lang/Object;");
                    m6069(c9416M147702, c35652.f8677, constructor);
                    c9416M147702.m14740();
                    c9416M147702.m14766();
                }
                C3697 c36972 = c3564.f8670;
                Supplier supplierM6166 = constructor == null ? c3564.m6166(constructor, (Modifier.isPublic(i) && !c36972.m6340(cls) && Modifier.isPublic(constructor.getModifiers())) ? false : true) : supplier;
                if (z3) {
                    c3697 = c36972;
                    supplier2 = supplierM6166;
                    c3565 = c35652;
                } else {
                    long j2 = c9194.f23445;
                    if (z) {
                        j2 |= JSONReader$Feature.FieldBased.mask;
                    }
                    boolean zM6091 = c35652.m6091();
                    boolean zM6092 = c35652.m6092();
                    long j3 = j2;
                    c3697 = c36972;
                    Supplier supplier3 = supplierM6166;
                    Supplier supplier4 = supplier3;
                    c35652.f8678 = new C3605(cls, c9194.f23437, c9194.f23436, j3, null, supplier3, null, abstractC3595Arr);
                    AbstractC3595[] abstractC3595Arr3 = c35652.f8671;
                    if (!zM6092) {
                        c3564.m6083(c35652, j3);
                        if (zM6091) {
                            c3565 = c35652;
                            j = j3;
                            abstractC3595Arr2 = abstractC3595Arr3;
                            supplier2 = supplier4;
                            str2 = str4;
                        } else {
                            boolean z4 = (JSONReader$Feature.FieldBased.mask & j3) != 0;
                            C9416 c9416M147703 = c9419.m14770(512, "readArrayMappingJSONBObject", f8667);
                            C2743 c2743 = new C2743(c9416M147703, true);
                            c9416M147703.m14741(1);
                            c9416M147703.m14725(4);
                            String str8 = AbstractC9420.f24360;
                            long j4 = j3;
                            c9416M147703.m14745(str8, "features", "(J)J");
                            c9416M147703.m14734(4);
                            int iM4164 = c2743.m4164("object");
                            int iM41642 = c2743.m4164("entryCnt");
                            if (!c35652.m6093()) {
                                m6076(str4, c2743);
                            }
                            C9418 c94182 = new C9418();
                            boolean z5 = z4;
                            c9416M147703.m14741(1);
                            c9416M147703.m14745(str8, "nextIfNull", "()Z");
                            c9416M147703.m14752(c94182);
                            c9416M147703.m14715(1);
                            c9416M147703.m14740();
                            c9416M147703.m14717(c94182);
                            c3564.m6087(c9416M147703, c35652, str4);
                            c9416M147703.m14739(iM4164);
                            C9418 c94183 = new C9418();
                            C9418 c94184 = new C9418();
                            c9416M147703.m14741(1);
                            c9416M147703.m14745(str8, "startArray", "()I");
                            c9416M147703.m14755();
                            c9416M147703.m14729(iM41642);
                            c9416M147703.m14716(abstractC3595Arr3.length);
                            c9416M147703.m14714(160, c94184);
                            C9416 c9416 = c9416M147703;
                            int i3 = 0;
                            while (i3 < abstractC3595Arr3.length) {
                                int i4 = iM4164;
                                C3565 c35653 = c35652;
                                m6080(c35653, abstractC3595Arr3[i3], z5, c2743, i4, i3, true);
                                i3++;
                                c9416 = c9416;
                                iM41642 = iM41642;
                                c94183 = c94183;
                                c94184 = c94184;
                                supplier4 = supplier4;
                                str4 = str4;
                                abstractC3595Arr3 = abstractC3595Arr3;
                                j4 = j4;
                                c35652 = c35653;
                                iM4164 = i4;
                            }
                            C9416 c94162 = c9416;
                            int i5 = iM4164;
                            C9418 c94185 = c94183;
                            abstractC3595Arr2 = abstractC3595Arr3;
                            c3565 = c35652;
                            j = j4;
                            c3564 = this;
                            supplier2 = supplier4;
                            str2 = str4;
                            c94162.m14756(c94185);
                            c94162.m14717(c94184);
                            c94162.m14741(0);
                            c94162.m14741(1);
                            c94162.m14741(i5);
                            c94162.m14743(iM41642);
                            c94162.m14745(AbstractC9420.f24358, "readArrayMappingJSONBObject0", f8654);
                            c94162.m14717(c94185);
                            c94162.m14741(i5);
                            c94162.m14740();
                            c94162.m14766();
                        }
                        c3564.m6085(c3565, j);
                        if (str6 == AbstractC9420.f24358 || str6 == AbstractC9420.f24350 || str6 == AbstractC9420.f24349 || str6 == AbstractC9420.f24353 || str6 == AbstractC9420.f24354 || str6 == AbstractC9420.f24351 || str6 == AbstractC9420.f24352 || str6 == AbstractC9420.f24336 || str6 == AbstractC9420.f24335 || str6 == AbstractC9420.f24334 || str6 == AbstractC9420.f24333 || str6 == AbstractC9420.f24332 || str6 == AbstractC9420.f24331) {
                            C3605 c3605 = c3565.f8678;
                            C9416 c9416M147704 = c9419.m14770(512, "getFieldReader", "(J)" + AbstractC9420.f24330);
                            C9418 c94186 = new C9418();
                            AbstractC3595[] abstractC3595Arr4 = abstractC3595Arr2;
                            if (abstractC3595Arr4.length > 6) {
                                TreeMap treeMap = new TreeMap();
                                int i6 = 0;
                                while (true) {
                                    long[] jArr = c3605.f8806;
                                    if (i6 < jArr.length) {
                                        long j5 = jArr[i6];
                                        ((List) treeMap.computeIfAbsent(Integer.valueOf((int) (j5 ^ (j5 >>> 32))), new C3602(6))).add(Long.valueOf(j5));
                                        i6++;
                                        abstractC3595Arr4 = abstractC3595Arr4;
                                    } else {
                                        AbstractC3595[] abstractC3595Arr5 = abstractC3595Arr4;
                                        int i7 = 32;
                                        int size = treeMap.size();
                                        int[] iArr = new int[size];
                                        Iterator it = treeMap.keySet().iterator();
                                        int i8 = 0;
                                        while (it.hasNext()) {
                                            iArr[i8] = ((Integer) it.next()).intValue();
                                            i8++;
                                        }
                                        Arrays.sort(iArr);
                                        c9416M147704.m14725(1);
                                        c9416M147704.m14725(1);
                                        c9416M147704.m14738(32);
                                        c9416M147704.m14715(125);
                                        c9416M147704.m14715(131);
                                        c9416M147704.m14715(136);
                                        c9416M147704.m14729(3);
                                        C9418 c94187 = new C9418();
                                        C9418[] c9418Arr2 = new C9418[size];
                                        for (int i9 = 0; i9 < size; i9++) {
                                            c9418Arr2[i9] = new C9418();
                                        }
                                        c9416M147704.m14743(3);
                                        c9416M147704.m14765(c94187, iArr, c9418Arr2);
                                        int i10 = 0;
                                        while (i10 < size) {
                                            c9416M147704.m14717(c9418Arr2[i10]);
                                            List list = (List) treeMap.get(Integer.valueOf(iArr[i10]));
                                            int i11 = i7;
                                            int size2 = list.size();
                                            int i12 = 0;
                                            while (i12 < size2) {
                                                int i13 = size;
                                                int[] iArr2 = iArr;
                                                long jLongValue = ((Long) list.get(i12)).longValue();
                                                TreeMap treeMap2 = treeMap;
                                                if (size2 > 1) {
                                                    c9418Arr = c9418Arr2;
                                                    c9418 = new C9418();
                                                } else {
                                                    c9418Arr = c9418Arr2;
                                                    c9418 = c94187;
                                                }
                                                c9416M147704.m14725(1);
                                                c9416M147704.m14712(jLongValue);
                                                c9416M147704.m14727();
                                                c9416M147704.m14753(c9418);
                                                short s = c3605.f8807[Arrays.binarySearch(c3605.f8806, jLongValue)];
                                                c9416M147704.m14741(0);
                                                String str9 = str2;
                                                c9416M147704.m14758(str9, AbstractC3897.m7394(s), AbstractC9420.f24330);
                                                c9416M147704.m14756(c94186);
                                                if (c9418 != c94187) {
                                                    c9416M147704.m14717(c9418);
                                                }
                                                i12++;
                                                size = i13;
                                                str2 = str9;
                                                c9418Arr2 = c9418Arr;
                                                iArr = iArr2;
                                                treeMap = treeMap2;
                                            }
                                            c9416M147704.m14756(c94187);
                                            i10++;
                                            i7 = i11;
                                            treeMap = treeMap;
                                        }
                                        i2 = i7;
                                        str3 = str2;
                                        c9416M147704.m14717(c94187);
                                        abstractC3595Arr4 = abstractC3595Arr5;
                                    }
                                }
                            } else {
                                str3 = str2;
                                i2 = 32;
                                for (int i14 = 0; i14 < abstractC3595Arr4.length; i14++) {
                                    C9418 c94188 = new C9418();
                                    C9418 c94189 = new C9418();
                                    AbstractC3595 abstractC3595 = abstractC3595Arr4[i14];
                                    String str10 = abstractC3595.f8773;
                                    long j6 = abstractC3595.f8756;
                                    c9416M147704.m14725(1);
                                    c9416M147704.m14712(j6);
                                    c9416M147704.m14727();
                                    c9416M147704.m14753(c94188);
                                    c9416M147704.m14717(c94189);
                                    c9416M147704.m14741(0);
                                    c9416M147704.m14758(str3, AbstractC3897.m7394(i14), AbstractC9420.f24330);
                                    c9416M147704.m14756(c94186);
                                    c9416M147704.m14717(c94188);
                                }
                            }
                            c9416M147704.m14715(1);
                            c9416M147704.m14740();
                            c9416M147704.m14717(c94186);
                            c9416M147704.m14740();
                            c9416M147704.m14766();
                            C3605 c36052 = c3565.f8678;
                            C9416 c9416M147705 = c9419.m14770(512, "getFieldReaderLCase", "(J)" + AbstractC9420.f24330);
                            C9418 c941810 = new C9418();
                            if (abstractC3595Arr4.length > 6) {
                                TreeMap treeMap3 = new TreeMap();
                                int i15 = 0;
                                while (true) {
                                    long[] jArr2 = c36052.f8804;
                                    if (i15 < jArr2.length) {
                                        long j7 = jArr2[i15];
                                        ((List) treeMap3.computeIfAbsent(Integer.valueOf((int) ((j7 >>> i2) ^ j7)), new C3602(7))).add(Long.valueOf(j7));
                                        i15++;
                                    } else {
                                        int size3 = treeMap3.size();
                                        int[] iArr3 = new int[size3];
                                        Iterator it2 = treeMap3.keySet().iterator();
                                        int i16 = 0;
                                        while (it2.hasNext()) {
                                            iArr3[i16] = ((Integer) it2.next()).intValue();
                                            i16++;
                                        }
                                        Arrays.sort(iArr3);
                                        c9416M147705.m14725(1);
                                        c9416M147705.m14725(1);
                                        c9416M147705.m14738(i2);
                                        c9416M147705.m14715(125);
                                        c9416M147705.m14715(131);
                                        c9416M147705.m14715(136);
                                        c9416M147705.m14729(3);
                                        C9418 c941811 = new C9418();
                                        C9418[] c9418Arr3 = new C9418[size3];
                                        for (int i17 = 0; i17 < size3; i17++) {
                                            c9418Arr3[i17] = new C9418();
                                        }
                                        c9416M147705.m14743(3);
                                        c9416M147705.m14765(c941811, iArr3, c9418Arr3);
                                        for (int i18 = 0; i18 < size3; i18++) {
                                            c9416M147705.m14717(c9418Arr3[i18]);
                                            Iterator it3 = ((List) treeMap3.get(Integer.valueOf(iArr3[i18]))).iterator();
                                            while (it3.hasNext()) {
                                                long jLongValue2 = ((Long) it3.next()).longValue();
                                                c9416M147705.m14725(1);
                                                c9416M147705.m14712(jLongValue2);
                                                c9416M147705.m14727();
                                                c9416M147705.m14753(c941811);
                                                short s2 = c36052.f8805[Arrays.binarySearch(c36052.f8804, jLongValue2)];
                                                c9416M147705.m14741(0);
                                                c9416M147705.m14758(str3, AbstractC3897.m7394(s2), AbstractC9420.f24330);
                                                c9416M147705.m14756(c941810);
                                            }
                                            c9416M147705.m14756(c941811);
                                        }
                                        c9416M147705.m14717(c941811);
                                    }
                                }
                            } else {
                                for (int i19 = 0; i19 < abstractC3595Arr4.length; i19++) {
                                    C9418 c941812 = new C9418();
                                    C9418 c941813 = new C9418();
                                    AbstractC3595 abstractC35952 = abstractC3595Arr4[i19];
                                    String str11 = abstractC35952.f8773;
                                    long j8 = abstractC35952.f8755;
                                    c9416M147705.m14725(1);
                                    c9416M147705.m14712(j8);
                                    c9416M147705.m14727();
                                    c9416M147705.m14753(c941812);
                                    c9416M147705.m14717(c941813);
                                    c9416M147705.m14741(0);
                                    c9416M147705.m14758(str3, AbstractC3897.m7394(i19), AbstractC9420.f24330);
                                    c9416M147705.m14756(c941810);
                                    c9416M147705.m14717(c941812);
                                }
                            }
                            c9416M147705.m14715(1);
                            c9416M147705.m14740();
                            c9416M147705.m14717(c941810);
                            c9416M147705.m14740();
                            c9416M147705.m14766();
                        }
                    }
                }
                byte[] bArrM14773 = c9419.m14773();
                return (C3605) c3697.m6341(c3565.f8681, bArrM14773.length, bArrM14773).getConstructors()[0].newInstance(cls, supplier2, abstractC3595Arr);
            }
            C9416 c9416M147706 = c9419.m14770(32, str7, "(J)Ljava/lang/Object;");
            c9416M147706.m14759(AbstractC9420.f24348, "UNSAFE", "Lsun/misc/Unsafe;");
            c9416M147706.m14741(0);
            c9416M147706.m14758(AbstractC9420.f24358, "objectClass", "Ljava/lang/Class;");
            c9416M147706.m14745("sun/misc/Unsafe", "allocateInstance", "(Ljava/lang/Class;)Ljava/lang/Object;");
            c9416M147706.m14740();
            c9416M147706.m14766();
            return (C3605) c3697.m6341(c3565.f8681, bArrM14773.length, bArrM14773).getConstructors()[0].newInstance(cls, supplier2, abstractC3595Arr);
        } catch (Throwable th) {
            throw new JSONException("create objectReader error".concat(type == null ? "" : ", objectType " + type.getTypeName()), th);
        }
        C3697 c369722 = c3564.f8670;
        if (constructor == null) {
        }
        if (z3) {
        }
        byte[] bArrM147732 = c9419.m14773();
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0798 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6080(C3565 c3565, AbstractC3595 abstractC3595, boolean z, C2743 c2743, int i, int i2, boolean z2) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        C9418 c9418;
        String str;
        Class<?> cls6;
        String str2;
        Class<?> cls7;
        Class cls8;
        C9418 c94182;
        String str3;
        Class cls9;
        Class cls10;
        Class cls11;
        Class cls12;
        Class cls13;
        Class cls14;
        Class cls15;
        Class cls16;
        Class cls17;
        Class cls18;
        Class cls19;
        Class cls20;
        Class cls21;
        Class cls22;
        C9416 c9416;
        Class cls23;
        Class cls24;
        C9418 c94183;
        AbstractC3595 abstractC35952;
        Class<?> cls25;
        C3697 c3697;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i3;
        Class clsM6502;
        int i4;
        String str9;
        int i5;
        String str10;
        String str11;
        int i6;
        String str12 = c3565.f8684;
        String str13 = c3565.f8677;
        boolean z3 = c2743.f5971;
        Class<?> cls26 = c3565.f8675;
        Class cls27 = abstractC3595.f8774;
        Type type = abstractC3595.f8768;
        long j = abstractC3595.f8767;
        String str14 = abstractC3595.f8771;
        Type type2 = abstractC3595.f8762;
        C9416 c94162 = (C9416) c2743.f5969;
        if ((j & JSONReader$Feature.NullOnError.mask) != 0) {
            c94162.m14741(0);
            c94162.m14758(str12, AbstractC3897.m7394(i2), AbstractC9420.f24330);
            c94162.m14741(1);
            c94162.m14741(i);
            c94162.m14745(AbstractC9420.f24359, "readFieldValue", f8658);
            return;
        }
        Field field = abstractC3595.f8769;
        Method method = abstractC3595.f8772;
        C9418 c94184 = new C9418();
        String strM14775 = AbstractC9420.m14775(cls27);
        String strM14777 = AbstractC9420.m14777(cls27);
        if (!(c3565.f8678 instanceof C3631)) {
            c94162.m14741(i);
        }
        int modifiers = ((z || method == null) && field != null) ? field.getModifiers() : 0;
        C3697 c36972 = this.f8670;
        if (z && Modifier.isPublic(cls26.getModifiers()) && Modifier.isPublic(modifiers) && !Modifier.isFinal(modifiers) && !c36972.m6340(cls26)) {
            c94162.m14737(str13);
        }
        String string = null;
        Class cls28 = Character.TYPE;
        Class cls29 = Double.TYPE;
        Class cls30 = Float.TYPE;
        Class cls31 = Long.TYPE;
        Class cls32 = Integer.TYPE;
        Class cls33 = Short.TYPE;
        Class cls34 = Byte.TYPE;
        Class cls35 = Boolean.TYPE;
        if (cls27 == cls35) {
            c94162.m14741(1);
            c94162.m14745(AbstractC9420.f24360, "readBoolValue", "()Z");
            str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
            str7 = "sun/misc/Unsafe";
            cls15 = Boolean.class;
            cls19 = cls30;
            cls20 = cls28;
            cls12 = cls33;
            cls18 = cls34;
            cls22 = Long.class;
            cls9 = String.class;
            cls10 = cls31;
            cls11 = Integer.class;
            cls23 = cls32;
            cls24 = cls29;
            str4 = "Lsun/misc/Unsafe;";
            str5 = "UNSAFE";
            c3697 = c36972;
            cls8 = List.class;
            c94182 = c94184;
            str3 = str12;
            cls25 = cls26;
            cls13 = UUID.class;
            cls14 = BigDecimal.class;
            cls21 = Double.class;
            cls16 = Float.class;
            cls17 = cls35;
        } else {
            if (cls27 == cls34) {
                cls = cls34;
                c94162.m14741(1);
                c94162.m14745(AbstractC9420.f24360, "readInt32Value", "()I");
            } else {
                cls = cls34;
                if (cls27 == cls33 || cls27 == cls32) {
                    c94162.m14741(1);
                    c94162.m14745(AbstractC9420.f24360, "readInt32Value", "()I");
                } else if (cls27 == cls31) {
                    c94162.m14741(1);
                    c94162.m14745(AbstractC9420.f24360, "readInt64Value", "()J");
                } else if (cls27 == cls30) {
                    c94162.m14741(1);
                    c94162.m14745(AbstractC9420.f24360, "readFloatValue", "()F");
                } else if (cls27 == cls29) {
                    c94162.m14741(1);
                    c94162.m14745(AbstractC9420.f24360, "readDoubleValue", "()D");
                } else {
                    if (cls27 != cls28) {
                        if (cls27 == String.class) {
                            c94162.m14741(1);
                            C9418 c94185 = new C9418();
                            cls2 = cls30;
                            cls3 = cls28;
                            c94162.m14745(AbstractC9420.f24360, "readString", "()Ljava/lang/String;");
                            c94162.m14755();
                            c94162.m14751(c94185);
                            if ("trim".equals(str14)) {
                                c94162.m14745("java/lang/String", "trim", "()Ljava/lang/String;");
                            } else if ("upper".equals(str14)) {
                                c94162.m14745("java/lang/String", "toUpperCase", "()Ljava/lang/String;");
                            }
                            c94162.m14717(c94185);
                        } else {
                            cls2 = cls30;
                            cls3 = cls28;
                            if (cls27 == Boolean.class) {
                                c94162.m14741(1);
                                c94162.m14745(AbstractC9420.f24360, "readBool", "()Ljava/lang/Boolean;");
                            } else if (cls27 == Byte.class) {
                                c94162.m14741(1);
                                c94162.m14745(AbstractC9420.f24360, "readInt8", "()Ljava/lang/Byte;");
                            } else if (cls27 == Short.class) {
                                c94162.m14741(1);
                                c94162.m14745(AbstractC9420.f24360, "readInt16", "()Ljava/lang/Short;");
                            } else if (cls27 == Integer.class) {
                                c94162.m14741(1);
                                c94162.m14745(AbstractC9420.f24360, "readInt32", "()Ljava/lang/Integer;");
                            } else if (cls27 == Long.class) {
                                c94162.m14741(1);
                                c94162.m14745(AbstractC9420.f24360, "readInt64", "()Ljava/lang/Long;");
                            } else {
                                if (cls27 == Float.class) {
                                    c94162.m14741(1);
                                    c94162.m14745(AbstractC9420.f24360, "readFloat", "()Ljava/lang/Float;");
                                    str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                    str7 = "sun/misc/Unsafe";
                                    cls15 = Boolean.class;
                                    cls16 = Float.class;
                                    cls12 = cls33;
                                    cls22 = Long.class;
                                    cls9 = String.class;
                                    cls10 = cls31;
                                    cls11 = Integer.class;
                                    cls23 = cls32;
                                    cls24 = cls29;
                                    str4 = "Lsun/misc/Unsafe;";
                                    str5 = "UNSAFE";
                                    c3697 = c36972;
                                    cls8 = List.class;
                                    c94182 = c94184;
                                    str3 = str12;
                                    cls25 = cls26;
                                    cls13 = UUID.class;
                                    cls14 = BigDecimal.class;
                                    cls21 = Double.class;
                                    cls17 = cls35;
                                    cls18 = cls;
                                    cls19 = cls2;
                                    cls20 = cls3;
                                    i3 = 95;
                                    abstractC35952 = abstractC3595;
                                    c9416 = c94162;
                                    str8 = "putObject";
                                    if (field != null) {
                                        String name = cls27.getName();
                                        if ((cls25.getModifiers() & 1) == 0 || (modifiers & 1) == 0 || (modifiers & 16) != 0 || !((C9368.m14663(cls27) || name.startsWith("java.") || cls27.getClassLoader() == C3635.f9009) && !c3697.m6340(cls25) && field.getDeclaringClass() == cls25)) {
                                            int iM4164 = c2743.m4164(cls27);
                                            if (cls27 == cls23) {
                                                c9416.m14729(iM4164);
                                                str11 = "putInt";
                                                str10 = "(Ljava/lang/Object;JI)V";
                                            } else {
                                                if (cls27 == cls10) {
                                                    c9416.m14734(iM4164);
                                                    str11 = "putLong";
                                                    str10 = "(Ljava/lang/Object;JJ)V";
                                                    i6 = 22;
                                                } else if (cls27 == cls19) {
                                                    c9416.m14760(56, iM4164);
                                                    str11 = "putFloat";
                                                    str10 = "(Ljava/lang/Object;JF)V";
                                                    i6 = 23;
                                                } else if (cls27 == cls24) {
                                                    c9416.m14760(57, iM4164);
                                                    str11 = "putDouble";
                                                    str10 = "(Ljava/lang/Object;JD)V";
                                                    i6 = 24;
                                                } else if (cls27 == cls20) {
                                                    c9416.m14729(iM4164);
                                                    str11 = "putChar";
                                                    str10 = "(Ljava/lang/Object;JC)V";
                                                } else if (cls27 == cls18) {
                                                    c9416.m14729(iM4164);
                                                    str11 = "putByte";
                                                    str10 = "(Ljava/lang/Object;JB)V";
                                                } else if (cls27 == cls12) {
                                                    c9416.m14729(iM4164);
                                                    str11 = "putShort";
                                                    str10 = "(Ljava/lang/Object;JS)V";
                                                } else if (cls27 == cls17) {
                                                    c9416.m14729(iM4164);
                                                    str11 = "putBoolean";
                                                    str10 = "(Ljava/lang/Object;JZ)V";
                                                } else {
                                                    c9416.m14739(iM4164);
                                                    str10 = str6;
                                                    str11 = str8;
                                                    i6 = 25;
                                                }
                                                c9416.m14759(AbstractC9420.f24348, str5, str4);
                                                c9416.m14715(i3);
                                                c9416.m14712(AbstractC3687.f9266.objectFieldOffset(field));
                                                c9416.m14760(i6, iM4164);
                                                c9416.m14745(str7, str11, str10);
                                            }
                                            i6 = 21;
                                            c9416.m14759(AbstractC9420.f24348, str5, str4);
                                            c9416.m14715(i3);
                                            c9416.m14712(AbstractC3687.f9266.objectFieldOffset(field));
                                            c9416.m14760(i6, iM4164);
                                            c9416.m14745(str7, str11, str10);
                                        } else {
                                            c9416.m14730(str13, field.getName(), strM14777);
                                        }
                                    } else {
                                        String str15 = str3;
                                        Class cls36 = cls24;
                                        Class cls37 = cls23;
                                        Class cls38 = cls20;
                                        Class cls39 = cls19;
                                        Class cls40 = cls10;
                                        Class cls41 = cls12;
                                        Class cls42 = cls18;
                                        Class cls43 = cls17;
                                        if (c3565.f8678 instanceof C3631) {
                                            if (!cls27.isPrimitive()) {
                                                c9416.m14737(AbstractC9420.m14775(cls27));
                                            }
                                            c9416.m14720(c2743.m4165(abstractC35952), cls27);
                                        } else if (c3565.f8672 || method == null || !c3565.f8673) {
                                            int iM41642 = c2743.m4164(cls27);
                                            if (cls27 == cls43) {
                                                c9416.m14729(iM41642);
                                                str9 = "(Ljava/lang/Object;Z)V";
                                            } else if (cls27 == cls42) {
                                                c9416.m14729(iM41642);
                                                str9 = "(Ljava/lang/Object;B)V";
                                            } else if (cls27 == cls41) {
                                                c9416.m14729(iM41642);
                                                str9 = "(Ljava/lang/Object;S)V";
                                            } else if (cls27 == cls37) {
                                                c9416.m14729(iM41642);
                                                str9 = "(Ljava/lang/Object;I)V";
                                            } else {
                                                if (cls27 == cls40) {
                                                    c9416.m14734(iM41642);
                                                    str9 = "(Ljava/lang/Object;J)V";
                                                    i5 = 22;
                                                } else if (cls27 == cls38) {
                                                    c9416.m14729(iM41642);
                                                    str9 = "(Ljava/lang/Object;C)V";
                                                } else if (cls27 == cls39) {
                                                    c9416.m14760(56, iM41642);
                                                    str9 = "(Ljava/lang/Object;F)V";
                                                    i5 = 23;
                                                } else if (cls27 == cls36) {
                                                    c9416.m14760(57, iM41642);
                                                    str9 = "(Ljava/lang/Object;D)V";
                                                    i5 = 24;
                                                } else {
                                                    c9416.m14739(iM41642);
                                                    str9 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                                    i5 = 25;
                                                }
                                                c9416.m14741(0);
                                                c9416.m14758(str15, AbstractC3897.m7394(i2), AbstractC9420.f24330);
                                                c9416.m14715(95);
                                                c9416.m14760(i5, iM41642);
                                                c9416.m14745(AbstractC9420.f24359, "accept", str9);
                                            }
                                            i5 = 21;
                                            c9416.m14741(0);
                                            c9416.m14758(str15, AbstractC3897.m7394(i2), AbstractC9420.f24330);
                                            c9416.m14715(95);
                                            c9416.m14760(i5, iM41642);
                                            c9416.m14745(AbstractC9420.f24359, "accept", str9);
                                        } else {
                                            Class<?> returnType = method.getReturnType();
                                            String name2 = method.getName();
                                            Class<?> cls44 = Void.TYPE;
                                            if (returnType == cls44) {
                                                if (cls27 == cls43) {
                                                    string = "(Z)V";
                                                } else if (cls27 == cls42) {
                                                    string = "(B)V";
                                                } else if (cls27 == cls41) {
                                                    string = "(S)V";
                                                } else if (cls27 == cls37) {
                                                    string = "(I)V";
                                                } else if (cls27 == cls40) {
                                                    string = "(J)V";
                                                } else if (cls27 == cls38) {
                                                    string = "(C)V";
                                                } else if (cls27 == cls39) {
                                                    string = "(F)V";
                                                } else if (cls27 == cls36) {
                                                    string = "(D)V";
                                                } else if (cls27 == cls15) {
                                                    string = "(Ljava/lang/Boolean;)V";
                                                } else if (cls27 == cls11) {
                                                    string = "(Ljava/lang/Integer;)V";
                                                } else if (cls27 == cls22) {
                                                    string = "(Ljava/lang/Long;)V";
                                                } else if (cls27 == cls16) {
                                                    string = "(Ljava/lang/Float;)V";
                                                } else if (cls27 == cls21) {
                                                    string = "(Ljava/lang/Double;)V";
                                                } else if (cls27 == cls14) {
                                                    string = "(Ljava/math/BigDecimal;)V";
                                                } else if (cls27 == cls9) {
                                                    string = "(Ljava/lang/String;)V";
                                                } else if (cls27 == cls13) {
                                                    string = "(Ljava/util/UUID;)V";
                                                } else if (cls27 == cls8) {
                                                    string = "(Ljava/util/List;)V";
                                                } else if (cls27 == Map.class) {
                                                    string = "(Ljava/util/Map;)V";
                                                }
                                            }
                                            if (string == null) {
                                                StringBuilder sbM12144 = AbstractC7012.m12144("(", strM14777, ")");
                                                sbM12144.append(AbstractC9420.m14777(returnType));
                                                string = sbM12144.toString();
                                            }
                                            c9416.m14745(str13, name2, string);
                                            if (returnType != cls44) {
                                                c9416.m14732();
                                            }
                                        }
                                    }
                                    c9416.m14717(c94182);
                                }
                                if (cls27 == Double.class) {
                                    c94162.m14741(1);
                                    c94162.m14745(AbstractC9420.f24360, "readDouble", "()Ljava/lang/Double;");
                                    str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                    str7 = "sun/misc/Unsafe";
                                    cls15 = Boolean.class;
                                    cls16 = Float.class;
                                    cls21 = Double.class;
                                    cls12 = cls33;
                                    cls22 = Long.class;
                                    cls9 = String.class;
                                    cls10 = cls31;
                                    cls11 = Integer.class;
                                    cls23 = cls32;
                                    cls24 = cls29;
                                    str4 = "Lsun/misc/Unsafe;";
                                    str5 = "UNSAFE";
                                    c3697 = c36972;
                                    cls8 = List.class;
                                    c94182 = c94184;
                                    str3 = str12;
                                    cls25 = cls26;
                                    cls13 = UUID.class;
                                    cls14 = BigDecimal.class;
                                } else {
                                    if (cls27 != BigDecimal.class) {
                                        if (cls27 == BigInteger.class) {
                                            c94162.m14741(1);
                                            c94162.m14745(AbstractC9420.f24360, "readBigInteger", "()Ljava/math/BigInteger;");
                                        } else if (cls27 == Number.class) {
                                            c94162.m14741(1);
                                            c94162.m14745(AbstractC9420.f24360, "readNumber", "()Ljava/lang/Number;");
                                        } else {
                                            if (cls27 == UUID.class) {
                                                c94162.m14741(1);
                                                c94162.m14745(AbstractC9420.f24360, "readUUID", "()Ljava/util/UUID;");
                                            } else if (cls27 == LocalDate.class && str14 == null) {
                                                c94162.m14741(1);
                                                c94162.m14745(AbstractC9420.f24360, "readLocalDate", "()Ljava/time/LocalDate;");
                                            } else if (cls27 == OffsetDateTime.class && str14 == null) {
                                                c94162.m14741(1);
                                                c94162.m14745(AbstractC9420.f24360, "readOffsetDateTime", "()Ljava/time/OffsetDateTime;");
                                            } else if (cls27 == Date.class && str14 == null) {
                                                c94162.m14741(1);
                                                c94162.m14745(AbstractC9420.f24360, "readDate", "()Ljava/util/Date;");
                                            } else {
                                                if (cls27 != Calendar.class || str14 != null) {
                                                    C9418 c94186 = new C9418();
                                                    boolean z4 = (c3565.f8676.f23445 & 144115188075855872L) != 0;
                                                    Integer numValueOf = !z4 ? Integer.valueOf(c2743.m4164("REFERENCE")) : null;
                                                    if (z4 || C9368.m14663(cls27)) {
                                                        cls4 = cls33;
                                                        cls5 = Long.class;
                                                        c9418 = c94184;
                                                        str = str12;
                                                        cls6 = cls26;
                                                        str2 = "()Z";
                                                    } else {
                                                        C9418 c94187 = new C9418();
                                                        Integer num = numValueOf;
                                                        C9418 c94188 = new C9418();
                                                        c94162.m14741(1);
                                                        String str16 = AbstractC9420.f24360;
                                                        cls4 = cls33;
                                                        cls5 = Long.class;
                                                        str2 = "()Z";
                                                        c94162.m14745(str16, "isReference", str2);
                                                        c94162.m14752(c94187);
                                                        c94162.m14741(1);
                                                        c94162.m14745(str16, "readReference", "()Ljava/lang/String;");
                                                        cls6 = cls26;
                                                        if (cls26 == null || cls27.isAssignableFrom(cls6)) {
                                                            c94162.m14755();
                                                            c94162.m14739(num.intValue());
                                                            c94162.m14761("..");
                                                            c94162.m14745("java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                                                            c94162.m14752(c94188);
                                                            if (cls6 == null || !cls27.isAssignableFrom(cls6)) {
                                                                i4 = i;
                                                            } else {
                                                                i4 = i;
                                                                c94162.m14741(i4);
                                                                c94162.m14756(c94186);
                                                            }
                                                            c94162.m14717(c94188);
                                                        } else {
                                                            c94162.m14739(num.intValue());
                                                            i4 = i;
                                                        }
                                                        c94162.m14741(0);
                                                        str = str12;
                                                        c94162.m14758(str, AbstractC3897.m7394(i2), AbstractC9420.f24330);
                                                        c94162.m14741(1);
                                                        c94162.m14741(i4);
                                                        c94162.m14741(num.intValue());
                                                        c94162.m14745(AbstractC9420.f24359, "addResolveTask", f8663);
                                                        c94162.m14732();
                                                        c9418 = c94184;
                                                        c94162.m14756(c9418);
                                                        c94162.m14717(c94187);
                                                    }
                                                    if (abstractC3595.f8757) {
                                                        cls7 = cls6;
                                                    } else {
                                                        C9418 c94189 = new C9418();
                                                        c94162.m14725(4);
                                                        cls7 = cls6;
                                                        c94162.m14712(JSONReader$Feature.IgnoreNoneSerializable.mask);
                                                        c94162.m14728();
                                                        c94162.m14726();
                                                        c94162.m14727();
                                                        c94162.m14752(c94189);
                                                        c94162.m14741(1);
                                                        c94162.m14745(AbstractC9420.f24360, "skipValue", "()V");
                                                        if (!(c3565.f8678 instanceof C3631)) {
                                                            c94162.m14732();
                                                        }
                                                        c94162.m14756(c9418);
                                                        c94162.m14717(c94189);
                                                    }
                                                    boolean z5 = List.class.isAssignableFrom(cls27) && abstractC3595.mo6054() == null && !cls27.getName().startsWith("com.google.common.collect.Immutable");
                                                    if (z5 && (clsM6502 = AbstractC3700.m6502(type2)) != null && (Collection.class.isAssignableFrom(clsM6502) || !Modifier.isPublic(clsM6502.getModifiers()))) {
                                                        z5 = false;
                                                    }
                                                    if (z5 && !cls27.isInterface()) {
                                                        Constructor constructorM6372 = AbstractC3698.m6372(cls27, false);
                                                        if (constructorM6372 == null || !Modifier.isPublic(constructorM6372.getModifiers())) {
                                                            z5 = false;
                                                        }
                                                    }
                                                    if (z5) {
                                                        cls8 = List.class;
                                                        c94182 = c9418;
                                                        str3 = str;
                                                        cls9 = String.class;
                                                        cls10 = cls31;
                                                        cls11 = Integer.class;
                                                        cls12 = cls4;
                                                        cls13 = UUID.class;
                                                        cls14 = BigDecimal.class;
                                                        cls15 = Boolean.class;
                                                        cls16 = Float.class;
                                                        cls17 = cls35;
                                                        cls18 = cls;
                                                        cls19 = cls2;
                                                        cls20 = cls3;
                                                        cls21 = Double.class;
                                                        cls22 = cls5;
                                                        abstractC35952 = abstractC3595;
                                                        cls23 = cls32;
                                                        cls24 = cls29;
                                                        c9416 = c94162;
                                                        m6070(abstractC35952, str3, c2743, i, i2, z2, cls27, type, j, type2, strM14775, c3565);
                                                        str7 = "sun/misc/Unsafe";
                                                        cls27 = cls27;
                                                        c94183 = c94186;
                                                        str8 = "putObject";
                                                        str4 = "Lsun/misc/Unsafe;";
                                                        str5 = "UNSAFE";
                                                        cls25 = cls7;
                                                        c3697 = c36972;
                                                        i3 = 95;
                                                        str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                                    } else {
                                                        cls8 = List.class;
                                                        c94182 = c9418;
                                                        str3 = str;
                                                        cls9 = String.class;
                                                        cls10 = cls31;
                                                        cls11 = Integer.class;
                                                        cls12 = cls4;
                                                        cls13 = UUID.class;
                                                        cls14 = BigDecimal.class;
                                                        cls15 = Boolean.class;
                                                        cls16 = Float.class;
                                                        cls17 = cls35;
                                                        cls18 = cls;
                                                        cls19 = cls2;
                                                        cls20 = cls3;
                                                        cls21 = Double.class;
                                                        cls22 = cls5;
                                                        c9416 = c94162;
                                                        cls23 = cls32;
                                                        cls24 = cls29;
                                                        String strM6077 = m6077(i2);
                                                        C9418 c941810 = new C9418();
                                                        c9416.m14741(1);
                                                        String str17 = AbstractC9420.f24360;
                                                        c9416.m14745(str17, "nextIfNull", str2);
                                                        c9416.m14752(c941810);
                                                        if (cls27 == Optional.class) {
                                                            c9416.m14747("java/util/Optional", "empty", "()Ljava/util/Optional;");
                                                        } else if (cls27 == OptionalInt.class) {
                                                            c9416.m14747("java/util/OptionalInt", "empty", "()Ljava/util/OptionalInt;");
                                                        } else if (cls27 == OptionalLong.class) {
                                                            c9416.m14747("java/util/OptionalLong", "empty", "()Ljava/util/OptionalLong;");
                                                        } else if (cls27 == OptionalDouble.class) {
                                                            c9416.m14747("java/util/OptionalDouble", "empty", "()Ljava/util/OptionalDouble;");
                                                        } else {
                                                            c9416.m14715(1);
                                                        }
                                                        c94183 = c94186;
                                                        c9416.m14756(c94183);
                                                        c9416.m14717(c941810);
                                                        if (cls27 == String[].class) {
                                                            c9416.m14741(1);
                                                            c9416.m14745(str17, "readStringArray", "()[Ljava/lang/String;");
                                                        } else if (cls27 == int[].class) {
                                                            c9416.m14741(1);
                                                            c9416.m14745(str17, "readInt32ValueArray", "()[I");
                                                        } else {
                                                            if (cls27 != long[].class) {
                                                                if (Enum.class.isAssignableFrom(cls27) && (!z3)) {
                                                                    abstractC35952 = abstractC3595;
                                                                    m6072(abstractC35952, str3, c2743, i2, type, cls27, j, strM6077);
                                                                } else {
                                                                    abstractC35952 = abstractC3595;
                                                                    C9418 c941811 = new C9418();
                                                                    c9416.m14741(0);
                                                                    String str18 = AbstractC9420.f24322;
                                                                    c9416.m14758(str3, strM6077, str18);
                                                                    c9416.m14750(c941811);
                                                                    c9416.m14741(0);
                                                                    c9416.m14741(0);
                                                                    c9416.m14758(str3, AbstractC3897.m7394(i2), AbstractC9420.f24330);
                                                                    c9416.m14741(1);
                                                                    c9416.m14745(AbstractC9420.f24359, "getObjectReader", f8668);
                                                                    c9416.m14730(str3, strM6077, str18);
                                                                    c9416.m14717(c941811);
                                                                    c9416.m14741(0);
                                                                    c9416.m14758(str3, strM6077, str18);
                                                                    c9416.m14741(1);
                                                                    m6071(str3, c9416, i2, type);
                                                                    c9416.m14761(abstractC35952.f8773);
                                                                    c9416.m14712(j);
                                                                    c9416.m14742(AbstractC9420.f24357, z3 ? "readJSONBObject" : "readObject", f8667);
                                                                }
                                                                if (method == null) {
                                                                    if ((cls7 == null || Modifier.isPublic(cls7.getModifiers())) && Modifier.isPublic(modifiers) && !Modifier.isFinal(modifiers)) {
                                                                        cls25 = cls7;
                                                                        c3697 = c36972;
                                                                        if (!c3697.m6340(cls25)) {
                                                                        }
                                                                    } else {
                                                                        cls25 = cls7;
                                                                        c3697 = c36972;
                                                                    }
                                                                    if (abstractC35952.f8764) {
                                                                        str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                                                        str7 = "sun/misc/Unsafe";
                                                                        str8 = "putObject";
                                                                        str4 = "Lsun/misc/Unsafe;";
                                                                        str5 = "UNSAFE";
                                                                        i3 = 95;
                                                                    } else {
                                                                        try {
                                                                            long jObjectFieldOffset = AbstractC3687.f9266.objectFieldOffset(cls27.getDeclaredField("this$0"));
                                                                            C9418 c941812 = new C9418();
                                                                            c9416.m14755();
                                                                            c9416.m14751(c941812);
                                                                            c9416.m14755();
                                                                            str4 = "Lsun/misc/Unsafe;";
                                                                            str5 = "UNSAFE";
                                                                            try {
                                                                                c9416.m14759(AbstractC9420.f24348, str5, str4);
                                                                                i3 = 95;
                                                                                try {
                                                                                    c9416.m14715(95);
                                                                                    c9416.m14712(jObjectFieldOffset);
                                                                                    c9416.m14741(i);
                                                                                    str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                                                                    str7 = "sun/misc/Unsafe";
                                                                                    str8 = "putObject";
                                                                                    try {
                                                                                        c9416.m14745(str7, str8, str6);
                                                                                        c9416.m14717(c941812);
                                                                                    } catch (NoSuchFieldException unused) {
                                                                                    }
                                                                                } catch (NoSuchFieldException unused2) {
                                                                                    str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                                                                    str7 = "sun/misc/Unsafe";
                                                                                    str8 = "putObject";
                                                                                }
                                                                            } catch (NoSuchFieldException unused3) {
                                                                                str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                                                                str7 = "sun/misc/Unsafe";
                                                                                str8 = "putObject";
                                                                                i3 = 95;
                                                                            }
                                                                        } catch (NoSuchFieldException unused4) {
                                                                            str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                                                            str7 = "sun/misc/Unsafe";
                                                                            str8 = "putObject";
                                                                            str4 = "Lsun/misc/Unsafe;";
                                                                            str5 = "UNSAFE";
                                                                        }
                                                                    }
                                                                    if (field != null) {
                                                                    }
                                                                    c9416.m14717(c94182);
                                                                }
                                                                cls25 = cls7;
                                                                c3697 = c36972;
                                                                c9416.m14737(strM14775);
                                                                if (abstractC35952.f8764) {
                                                                }
                                                                if (field != null) {
                                                                }
                                                                c9416.m14717(c94182);
                                                            }
                                                            c9416.m14741(1);
                                                            c9416.m14745(str17, "readInt64ValueArray", "()[J");
                                                        }
                                                        str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                                        abstractC35952 = abstractC3595;
                                                        str7 = "sun/misc/Unsafe";
                                                        str8 = "putObject";
                                                        str4 = "Lsun/misc/Unsafe;";
                                                        str5 = "UNSAFE";
                                                        cls25 = cls7;
                                                        c3697 = c36972;
                                                        i3 = 95;
                                                    }
                                                    c9416.m14717(c94183);
                                                    if (field != null) {
                                                    }
                                                    c9416.m14717(c94182);
                                                }
                                                c94162.m14741(1);
                                                c94162.m14745(AbstractC9420.f24360, "readCalendar", "()Ljava/util/Calendar;");
                                            }
                                            str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                            str7 = "sun/misc/Unsafe";
                                            cls13 = UUID.class;
                                            cls16 = Float.class;
                                            cls21 = Double.class;
                                            cls12 = cls33;
                                            cls22 = Long.class;
                                            cls9 = String.class;
                                            cls10 = cls31;
                                            cls11 = Integer.class;
                                            cls23 = cls32;
                                            cls24 = cls29;
                                            str4 = "Lsun/misc/Unsafe;";
                                            str5 = "UNSAFE";
                                            c3697 = c36972;
                                            cls8 = List.class;
                                            c94182 = c94184;
                                            str3 = str12;
                                            cls25 = cls26;
                                            cls14 = BigDecimal.class;
                                        }
                                        str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                        abstractC35952 = abstractC3595;
                                        str7 = "sun/misc/Unsafe";
                                        cls16 = Float.class;
                                        cls21 = Double.class;
                                        cls12 = cls33;
                                        cls22 = Long.class;
                                        cls9 = String.class;
                                        cls10 = cls31;
                                        cls11 = Integer.class;
                                        cls23 = cls32;
                                        cls24 = cls29;
                                        str4 = "Lsun/misc/Unsafe;";
                                        str5 = "UNSAFE";
                                        c3697 = c36972;
                                        cls8 = List.class;
                                        c94182 = c94184;
                                        str3 = str12;
                                        cls25 = cls26;
                                        cls13 = UUID.class;
                                        cls14 = BigDecimal.class;
                                        cls15 = Boolean.class;
                                        cls17 = cls35;
                                        cls18 = cls;
                                        cls19 = cls2;
                                        cls20 = cls3;
                                        i3 = 95;
                                        c9416 = c94162;
                                        str8 = "putObject";
                                        if (field != null) {
                                        }
                                        c9416.m14717(c94182);
                                    }
                                    c94162.m14741(1);
                                    c94162.m14745(AbstractC9420.f24360, "readBigDecimal", "()Ljava/math/BigDecimal;");
                                    str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                                    str7 = "sun/misc/Unsafe";
                                    cls14 = BigDecimal.class;
                                    cls16 = Float.class;
                                    cls21 = Double.class;
                                    cls12 = cls33;
                                    cls22 = Long.class;
                                    cls9 = String.class;
                                    cls10 = cls31;
                                    cls11 = Integer.class;
                                    cls23 = cls32;
                                    cls24 = cls29;
                                    str4 = "Lsun/misc/Unsafe;";
                                    str5 = "UNSAFE";
                                    c3697 = c36972;
                                    cls8 = List.class;
                                    c94182 = c94184;
                                    str3 = str12;
                                    cls25 = cls26;
                                    cls13 = UUID.class;
                                    cls15 = Boolean.class;
                                }
                                cls17 = cls35;
                                cls18 = cls;
                                cls19 = cls2;
                                cls20 = cls3;
                            }
                        }
                        str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
                        str7 = "sun/misc/Unsafe";
                        cls15 = Boolean.class;
                        cls12 = cls33;
                        cls22 = Long.class;
                        cls9 = String.class;
                        cls10 = cls31;
                        cls11 = Integer.class;
                        cls23 = cls32;
                        cls24 = cls29;
                        str4 = "Lsun/misc/Unsafe;";
                        str5 = "UNSAFE";
                        c3697 = c36972;
                        cls8 = List.class;
                        c94182 = c94184;
                        str3 = str12;
                        cls25 = cls26;
                        cls13 = UUID.class;
                        cls14 = BigDecimal.class;
                        cls21 = Double.class;
                        cls16 = Float.class;
                        cls17 = cls35;
                        cls18 = cls;
                        cls19 = cls2;
                        cls20 = cls3;
                        i3 = 95;
                        abstractC35952 = abstractC3595;
                        c9416 = c94162;
                        str8 = "putObject";
                        if (field != null) {
                        }
                        c9416.m14717(c94182);
                    }
                    c94162.m14741(1);
                    c94162.m14745(AbstractC9420.f24360, "readCharValue", "()C");
                }
            }
            str6 = "(Ljava/lang/Object;JLjava/lang/Object;)V";
            str7 = "sun/misc/Unsafe";
            cls15 = Boolean.class;
            cls19 = cls30;
            cls20 = cls28;
            cls12 = cls33;
            cls22 = Long.class;
            cls9 = String.class;
            cls10 = cls31;
            cls11 = Integer.class;
            cls23 = cls32;
            cls24 = cls29;
            str4 = "Lsun/misc/Unsafe;";
            str5 = "UNSAFE";
            c3697 = c36972;
            cls8 = List.class;
            c94182 = c94184;
            str3 = str12;
            cls25 = cls26;
            cls13 = UUID.class;
            cls14 = BigDecimal.class;
            cls21 = Double.class;
            cls16 = Float.class;
            cls17 = cls35;
            cls18 = cls;
        }
        i3 = 95;
        abstractC35952 = abstractC3595;
        c9416 = c94162;
        str8 = "putObject";
        if (field != null) {
        }
        c9416.m14717(c94182);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m6081(C3565 c3565, C2743 c2743, int i, boolean z, int i2, C9418 c9418) {
        AbstractC3595[] abstractC3595Arr = c3565.f8671;
        C9416 c9416 = (C9416) c2743.f5969;
        c9416.m14741(0);
        c9416.m14725(i);
        c9416.m14745(AbstractC9420.f24358, "getFieldOrdinal", "(J)I");
        C9418 c94182 = new C9418();
        C9418[] c9418Arr = new C9418[abstractC3595Arr.length];
        int[] iArr = new int[abstractC3595Arr.length];
        for (int i3 = 0; i3 < abstractC3595Arr.length; i3++) {
            c9418Arr[i3] = new C9418();
            iArr[i3] = i3;
        }
        c9416.m14765(c94182, iArr, c9418Arr);
        for (int i4 = 0; i4 < abstractC3595Arr.length; i4++) {
            c9416.m14717(c9418Arr[i4]);
            m6080(c3565, abstractC3595Arr[i4], z, c2743, i2, i4, false);
            c9416.m14756(c9418);
        }
        c9416.m14717(c94182);
        c9416.m14741(1);
        c9416.m14745(AbstractC9420.f24360, "skipValue", "()V");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m6082(C3565 c3565, boolean z, C2743 c2743, int i, C9418 c9418, C9418 c94182) {
        String str;
        C2743 c27432 = c2743;
        C3565 c35652 = c3565;
        AbstractC3595[] abstractC3595Arr = c35652.f8671;
        int iM4163 = c27432.m4163("RAW_LONG");
        C9416 c9416 = (C9416) c27432.f5969;
        c9416.m14741(1);
        c9416.m14745(AbstractC9420.f24360, "getRawLong", "()J");
        c9416.m14715(92);
        c9416.m14734(iM4163);
        c9416.m14726();
        c9416.m14727();
        c9416.m14752(c94182);
        int i2 = 0;
        int i3 = 0;
        while (i3 < abstractC3595Arr.length) {
            C9418 c94183 = new C9418();
            AbstractC3595 abstractC3595 = abstractC3595Arr[i3];
            byte[] bytes = abstractC3595.f8773.getBytes(StandardCharsets.UTF_8);
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
                C6755.m11870(AbstractC7012.m12147(length, "length "));
                return;
            } else {
                bArr[i2] = 34;
                System.arraycopy(bytes, i2, bArr, 1, 7);
                str = "nextIfName8Match2";
            }
            long j = AbstractC3687.f9266.getLong(bArr, AbstractC3687.f9265);
            c9416.m14725(iM4163);
            c9416.m14712(j);
            c9416.m14727();
            c9416.m14753(c94183);
            c9416.m14741(1);
            c9416.m14745(AbstractC9420.f24360, str, "()Z");
            c9416.m14752(c94182);
            m6080(c35652, abstractC3595, z, c27432, i, i3, false);
            c9416.m14756(c9418);
            c9416.m14717(c94183);
            i3++;
            c35652 = c3565;
            c27432 = c2743;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m6083(C3565 c3565, long j) {
        int i;
        String str;
        C2743 c2743;
        C9418 c9418;
        int i2;
        boolean z;
        C9418 c94182;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        C9418 c94183;
        int i6;
        C9418 c94184;
        AbstractC3595[] abstractC3595Arr;
        int i7;
        C3564 c3564;
        C3565 c35652;
        C2743 c27432;
        int i8;
        int i9;
        String str2 = c3565.f8684;
        AbstractC3595[] abstractC3595Arr2 = c3565.f8671;
        Class cls = c3565.f8675;
        boolean z5 = (j & JSONReader$Feature.FieldBased.mask) != 0;
        C3605 c3605 = c3565.f8678;
        C9419 c9419 = c3565.f8674;
        String str3 = f8667;
        C9416 c9416M14770 = c9419.m14770(2048, "readJSONBObject", str3);
        boolean zM6091 = c3565.m6091();
        boolean zM6093 = c3565.m6093();
        boolean z6 = z5;
        C2743 c27433 = new C2743(c9416M14770, true);
        c9416M14770.m14741(1);
        c9416M14770.m14725(4);
        String str4 = AbstractC9420.f24360;
        c9416M14770.m14745(str4, "features", "(J)J");
        c9416M14770.m14734(4);
        int iM4164 = c27433.m4164("object");
        int iM41642 = c27433.m4164("I");
        int iM4163 = c27433.m4163("hashCode64");
        int iM41643 = c27433.m4164("hashCode32");
        int iM41644 = c27433.m4164("fieldReader");
        if (!zM6093) {
            m6076(str2, c27433);
        }
        C9418 c94185 = new C9418();
        c9416M14770.m14741(1);
        c9416M14770.m14745(str4, "nextIfNull", "()Z");
        c9416M14770.m14752(c94185);
        c9416M14770.m14715(1);
        c9416M14770.m14740();
        c9416M14770.m14717(c94185);
        if (cls != null && !Serializable.class.isAssignableFrom(cls)) {
            c9416M14770.m14741(1);
            c9416M14770.m14741(0);
            c9416M14770.m14758(str2, "objectClass", "Ljava/lang/Class;");
            c9416M14770.m14745(str4, "errorOnNoneSerializable", "(Ljava/lang/Class;)V");
        }
        if (!zM6091) {
            C9418 c94186 = new C9418();
            C9418 c94187 = new C9418();
            c9416M14770.m14741(1);
            c9416M14770.m14745(str4, "isArray", "()Z");
            c9416M14770.m14752(c94186);
            c9416M14770.m14741(1);
            c9416M14770.m14745(str4, "isSupportBeanArray", "()Z");
            c9416M14770.m14752(c94187);
            c9416M14770.m14741(0);
            c9416M14770.m14741(1);
            c9416M14770.m14741(2);
            c9416M14770.m14741(3);
            c9416M14770.m14725(4);
            c9416M14770.m14745(str2, "readArrayMappingObject", str3);
            c9416M14770.m14740();
            c9416M14770.m14717(c94187);
            c9416M14770.m14717(c94186);
        }
        if (c3565.f8678 instanceof C3631) {
            C9418 c94188 = new C9418();
            C9418 c94189 = new C9418();
            c9416M14770.m14741(1);
            c9416M14770.m14745(str4, "hasAutoTypeBeforeHandler", "()Z");
            c9416M14770.m14753(c94188);
            c9416M14770.m14725(4);
            i = iM4163;
            str = str4;
            c9416M14770.m14712(JSONReader$Feature.SupportSmartMatch.mask | JSONReader$Feature.SupportAutoType.mask);
            c9416M14770.m14728();
            c9416M14770.m14726();
            c9416M14770.m14727();
            c9416M14770.m14752(c94189);
            c9416M14770.m14717(c94188);
            c9416M14770.m14741(0);
            c9416M14770.m14741(1);
            c9416M14770.m14741(2);
            c9416M14770.m14741(3);
            c9416M14770.m14725(4);
            c9416M14770.m14746(AbstractC9420.f24342, "readJSONBObject", str3);
            c9416M14770.m14740();
            c9416M14770.m14717(c94189);
            m6073(abstractC3595Arr2, c27433);
        } else {
            i = iM4163;
            str = str4;
            m6087(c9416M14770, c3565, str2);
            c9416M14770.m14739(iM4164);
        }
        c9416M14770.m14741(1);
        String str5 = str;
        c9416M14770.m14745(str5, "nextIfObjectStart", "()Z");
        c9416M14770.m14732();
        C9418 c941810 = new C9418();
        C9418 c941811 = new C9418();
        C9418 c941812 = new C9418();
        if (!zM6093) {
            c9416M14770.m14715(3);
            c9416M14770.m14729(iM41642);
        }
        c9416M14770.m14717(c941810);
        C9418 c941813 = new C9418();
        c9416M14770.m14741(1);
        c9416M14770.m14745(str5, "nextIfObjectEnd", "()Z");
        c9416M14770.m14753(c941811);
        if (c3565.f8679 < 2 || c3565.f8683 > 43) {
            c2743 = c27433;
            c9418 = c941813;
            i2 = iM41644;
            z = z6;
            c94182 = c941812;
            i3 = iM4164;
            i4 = iM41643;
            z2 = false;
        } else {
            i4 = iM41643;
            i2 = iM41644;
            m6084(c3565, z6, c27433, iM4164, c941812, c941813);
            c9418 = c941813;
            c94182 = c941812;
            i3 = iM4164;
            c2743 = c27433;
            z = z6;
            z2 = true;
        }
        c9416M14770.m14717(c9418);
        c9416M14770.m14741(1);
        c9416M14770.m14745(str5, "readFieldNameHashCode", "()J");
        c9416M14770.m14715(92);
        int i10 = i;
        c9416M14770.m14734(i10);
        c9416M14770.m14726();
        c9416M14770.m14727();
        c9416M14770.m14752(c94182);
        if (zM6093 || (c3565.f8678 instanceof C3631)) {
            i5 = i10;
            z3 = z2;
            z4 = z;
        } else {
            C9418 c941814 = new C9418();
            c9416M14770.m14725(i10);
            z3 = z2;
            c9416M14770.m14741(0);
            z4 = z;
            c9416M14770.m14758(str2, "typeKeyHashCode", "J");
            c9416M14770.m14727();
            c9416M14770.m14753(c941814);
            c9416M14770.m14725(i10);
            c9416M14770.m14726();
            c9416M14770.m14727();
            c9416M14770.m14752(c941814);
            c9416M14770.m14741(0);
            c9416M14770.m14741(1);
            i5 = i10;
            c9416M14770.m14745(str2, "autoType", AbstractC0900.m711(new StringBuilder("("), AbstractC9420.f24325, ")Ljava/lang/Object;"));
            c9416M14770.m14739(i3);
            c9416M14770.m14756(c941811);
            c9416M14770.m14717(c941814);
        }
        if (z3) {
            if (c3565.f8678 instanceof C3631) {
                C2743 c27434 = c2743;
                m6081(c3565, c27434, i5, z4, i3, c94182);
                c2743 = c27434;
                c94183 = c94182;
            } else {
                c94183 = c94182;
                c9416M14770.m14741(0);
                c9416M14770.m14725(i5);
                c9416M14770.m14741(1);
                c9416M14770.m14725(4);
                c9416M14770.m14741(i3);
                c9416M14770.m14745(AbstractC9420.f24358, "readFieldValue", f8662);
            }
            c9416M14770.m14756(c94183);
            c3564 = this;
            c35652 = c3565;
            i6 = iM41642;
            c94184 = c941811;
        } else {
            c94183 = c94182;
            boolean z7 = z4;
            int i11 = i5;
            String str6 = "(J)Z";
            String str7 = "getNameHashCodeLCase";
            if (abstractC3595Arr2.length > 6) {
                TreeMap treeMap = new TreeMap();
                boolean z8 = z7;
                String str8 = "isSupportSmartMatch";
                C3605 c36052 = c3605;
                int i12 = 0;
                while (true) {
                    long[] jArr = c36052.f8806;
                    c27432 = c2743;
                    if (i12 >= jArr.length) {
                        break;
                    }
                    long j2 = jArr[i12];
                    ((List) treeMap.computeIfAbsent(Integer.valueOf((int) (j2 ^ (j2 >>> 32))), new C3602(5))).add(Long.valueOf(j2));
                    i12++;
                    c2743 = c27432;
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
                c9416M14770.m14725(i11);
                c9416M14770.m14725(i11);
                c9416M14770.m14738(32);
                c9416M14770.m14715(125);
                c9416M14770.m14715(131);
                c9416M14770.m14715(136);
                c9416M14770.m14729(i4);
                C9418 c941815 = new C9418();
                c94184 = c941811;
                C9418[] c9418Arr = new C9418[size];
                int i14 = i3;
                for (int i15 = 0; i15 < size; i15++) {
                    c9418Arr[i15] = new C9418();
                }
                c9416M14770.m14743(i4);
                c9416M14770.m14765(c941815, iArr, c9418Arr);
                int i16 = 0;
                while (i16 < size) {
                    c9416M14770.m14717(c9418Arr[i16]);
                    List list = (List) treeMap.get(Integer.valueOf(iArr[i16]));
                    int i17 = i16;
                    int size2 = list.size();
                    C9418[] c9418Arr2 = c9418Arr;
                    int i18 = 0;
                    while (i18 < size2) {
                        TreeMap treeMap2 = treeMap;
                        int i19 = size;
                        long jLongValue = ((Long) list.get(i18)).longValue();
                        C9418 c941816 = c941815;
                        C9418 c941817 = size2 > 1 ? new C9418() : c941816;
                        c9416M14770.m14725(i11);
                        c9416M14770.m14712(jLongValue);
                        c9416M14770.m14727();
                        c9416M14770.m14753(c941817);
                        int i20 = i11;
                        short s = c36052.f8807[Arrays.binarySearch(c36052.f8806, jLongValue)];
                        AbstractC3595 abstractC3595 = abstractC3595Arr2[s];
                        C3605 c36053 = c36052;
                        int i21 = iM41642;
                        C9418 c941818 = c941817;
                        boolean z9 = z8;
                        int i22 = i18;
                        int i23 = i14;
                        List list2 = list;
                        String str9 = str7;
                        int i24 = size2;
                        AbstractC3595[] abstractC3595Arr3 = abstractC3595Arr2;
                        int i25 = i2;
                        String str10 = str8;
                        int[] iArr2 = iArr;
                        String str11 = str6;
                        C2743 c27435 = c27432;
                        m6080(c3565, abstractC3595, z9, c27435, i23, s, true);
                        c9416M14770.m14756(c94183);
                        if (c941818 != c941816) {
                            c9416M14770.m14717(c941818);
                        }
                        int i26 = i22 + 1;
                        i14 = i23;
                        list = list2;
                        str7 = str9;
                        size2 = i24;
                        z8 = z9;
                        str6 = str11;
                        c941815 = c941816;
                        c36052 = c36053;
                        iM41642 = i21;
                        treeMap = treeMap2;
                        size = i19;
                        abstractC3595Arr2 = abstractC3595Arr3;
                        i18 = i26;
                        c27432 = c27435;
                        iArr = iArr2;
                        i11 = i20;
                        str8 = str10;
                        i2 = i25;
                    }
                    int i27 = i2;
                    c9416M14770.m14756(c94183);
                    c941815 = c941815;
                    c9418Arr = c9418Arr2;
                    treeMap = treeMap;
                    abstractC3595Arr2 = abstractC3595Arr2;
                    i16 = i17 + 1;
                    c27432 = c27432;
                    iArr = iArr;
                    i11 = i11;
                    str8 = str8;
                    i2 = i27;
                }
                c35652 = c3565;
                String str12 = str6;
                i6 = iM41642;
                int i28 = i2;
                String str13 = str7;
                String str14 = str8;
                c2743 = c27432;
                i3 = i14;
                c9416M14770.m14717(c941815);
                if ((c35652.f8676.f23445 & 9007199254740992L) == 0 && !(c35652.f8678 instanceof C3631)) {
                    C9418 c941819 = new C9418();
                    if ((j & JSONReader$Feature.SupportSmartMatch.mask) == 0) {
                        i8 = 1;
                        c9416M14770.m14741(1);
                        c9416M14770.m14725(4);
                        c9416M14770.m14745(AbstractC9420.f24360, str14, str12);
                        c9416M14770.m14752(c941819);
                    } else {
                        i8 = 1;
                    }
                    c9416M14770.m14741(0);
                    c9416M14770.m14741(i8);
                    c9416M14770.m14745(AbstractC9420.f24360, str13, "()J");
                    c9416M14770.m14742(AbstractC9420.f24357, "getFieldReaderLCase", f8659);
                    c9416M14770.m14755();
                    c9416M14770.m14739(i28);
                    c9416M14770.m14751(c941819);
                    c9416M14770.m14741(i28);
                    c9416M14770.m14741(i8);
                    c9416M14770.m14741(i3);
                    c9416M14770.m14745(AbstractC9420.f24359, "readFieldValueJSONB", f8658);
                    c9416M14770.m14756(c94183);
                    c9416M14770.m14717(c941819);
                }
                c3564 = this;
            } else {
                int i29 = i11;
                AbstractC3595[] abstractC3595Arr4 = abstractC3595Arr2;
                i6 = iM41642;
                c94184 = c941811;
                int i30 = 0;
                while (true) {
                    abstractC3595Arr = abstractC3595Arr4;
                    if (i30 >= abstractC3595Arr.length) {
                        break;
                    }
                    C9418 c941820 = new C9418();
                    AbstractC3595 abstractC35952 = abstractC3595Arr[i30];
                    long jM6334 = AbstractC3693.m6334(abstractC35952.f8773);
                    int i31 = i29;
                    c9416M14770.m14725(i31);
                    c9416M14770.m14712(jM6334);
                    c9416M14770.m14727();
                    c9416M14770.m14753(c941820);
                    abstractC3595Arr4 = abstractC3595Arr;
                    m6080(c3565, abstractC35952, z7, c2743, i3, i30, false);
                    c9416M14770.m14756(c94183);
                    c9416M14770.m14717(c941820);
                    i30++;
                    i29 = i31;
                }
                int i32 = i29;
                C9418 c941821 = new C9418();
                if ((j & JSONReader$Feature.SupportSmartMatch.mask) == 0) {
                    i7 = 1;
                    c9416M14770.m14741(1);
                    c9416M14770.m14725(4);
                    c9416M14770.m14745(AbstractC9420.f24360, "isSupportSmartMatch", "(J)Z");
                    c9416M14770.m14752(c941821);
                } else {
                    i7 = 1;
                }
                c9416M14770.m14741(i7);
                c9416M14770.m14745(AbstractC9420.f24360, str7, "()J");
                c9416M14770.m14734(i32);
                for (int i33 = 0; i33 < abstractC3595Arr.length; i33++) {
                    C9418 c941822 = new C9418();
                    AbstractC3595 abstractC35953 = abstractC3595Arr[i33];
                    long jM63342 = AbstractC3693.m6334(abstractC35953.f8773);
                    c9416M14770.m14725(i32);
                    c9416M14770.m14712(jM63342);
                    c9416M14770.m14727();
                    c9416M14770.m14753(c941822);
                    m6080(c3565, abstractC35953, z7, c2743, i3, i33, false);
                    c9416M14770.m14756(c94183);
                    c9416M14770.m14717(c941822);
                }
                c3564 = this;
                c35652 = c3565;
                c9416M14770.m14717(c941821);
            }
        }
        if (c35652.f8678 instanceof C3631) {
            i9 = 1;
            c9416M14770.m14741(1);
            c9416M14770.m14745(AbstractC9420.f24360, "skipValue", "()V");
        } else {
            i9 = 1;
            c9416M14770.m14741(0);
            c9416M14770.m14741(1);
            c9416M14770.m14741(i3);
            c9416M14770.m14725(4);
            c9416M14770.m14745(AbstractC9420.f24358, "processExtra", f8661);
        }
        c9416M14770.m14756(c94183);
        c9416M14770.m14717(c94183);
        if (!zM6093) {
            c9416M14770.m14719(i6, i9);
        }
        c9416M14770.m14756(c941810);
        c9416M14770.m14717(c94184);
        if (c35652.f8678 instanceof C3631) {
            c3564.m6086(c35652, c2743);
        } else {
            c9416M14770.m14741(i3);
        }
        c9416M14770.m14740();
        c9416M14770.m14766();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0ab4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6084(C3565 c3565, boolean z, C2743 c2743, int i, C9418 c9418, C9418 c94182) {
        boolean z2;
        C9418 c94183;
        boolean z3;
        int i2;
        AbstractC3595[] abstractC3595Arr = c3565.f8671;
        boolean z4 = c2743.f5971;
        C9416 c9416 = (C9416) c2743.f5969;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        TreeMap treeMap = new TreeMap();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            z2 = true;
            if (i4 >= abstractC3595Arr.length) {
                break;
            }
            AbstractC3595 abstractC3595 = abstractC3595Arr[i4];
            identityHashMap.put(abstractC3595, Integer.valueOf(i4));
            byte[] bArr = new byte[4];
            if (z4) {
                byte[] bArrM6915 = InterfaceC3745.m6915(abstractC3595.f8773);
                System.arraycopy(bArrM6915, 0, bArr, 0, Math.min(4, bArrM6915.length));
            } else {
                byte[] bytes = abstractC3595.f8773.getBytes(StandardCharsets.UTF_8);
                bArr[0] = 34;
                if (bytes.length == 2) {
                    System.arraycopy(bytes, 0, bArr, 1, 2);
                    bArr[3] = 34;
                } else {
                    System.arraycopy(bytes, 0, bArr, 1, 3);
                }
            }
            int i5 = AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265);
            List arrayList = (List) treeMap.get(Integer.valueOf(i5));
            if (arrayList == null) {
                arrayList = new ArrayList();
                treeMap.put(Integer.valueOf(i5), arrayList);
            }
            arrayList.add(abstractC3595);
            i4++;
        }
        C9418 c94184 = new C9418();
        int[] iArr = new int[treeMap.size()];
        int size = treeMap.size();
        C9418[] c9418Arr = new C9418[size];
        Iterator it = treeMap.keySet().iterator();
        for (int i6 = 0; i6 < size; i6++) {
            c9418Arr[i6] = new C9418();
            iArr[i6] = ((Integer) it.next()).intValue();
        }
        c9416.m14741(1);
        int i7 = 3;
        c9416.m14745(AbstractC9420.f24360, "getRawInt", "()I");
        c9416.m14765(c94184, iArr, c9418Arr);
        int i8 = 0;
        while (i8 < size) {
            c9416.m14717(c9418Arr[i8]);
            List list = (List) treeMap.get(Integer.valueOf(iArr[i8]));
            int i9 = i3;
            while (i9 < list.size()) {
                int i10 = i9 + 1;
                C9418 c94185 = i10 != list.size() ? new C9418() : null;
                AbstractC3595 abstractC35952 = (AbstractC3595) list.get(i9);
                int iIntValue = ((Integer) identityHashMap.get(abstractC35952)).intValue();
                C9418 c94186 = c94184;
                byte[] bytes2 = abstractC35952.f8773.getBytes(StandardCharsets.UTF_8);
                int length = bytes2.length;
                int[] iArr2 = iArr;
                int i11 = size;
                C9418[] c9418Arr2 = c9418Arr;
                boolean z5 = z4;
                IdentityHashMap identityHashMap2 = identityHashMap;
                TreeMap treeMap2 = treeMap;
                int i12 = i8;
                List list2 = list;
                switch (length) {
                    case 2:
                        c94183 = c94185;
                        z3 = true;
                        i2 = 0;
                        c9416.m14741(1);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match2", "()Z");
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                            c9416.m14717(c94183);
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 3:
                        c94183 = c94185;
                        z3 = true;
                        i2 = 0;
                        c9416.m14741(1);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match3", "()Z");
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 4:
                        c94183 = c94185;
                        z3 = true;
                        i2 = 0;
                        c9416.m14741(1);
                        i7 = 3;
                        c9416.m14749(bytes2[3]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match4", "(B)Z");
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 5:
                        c94183 = c94185;
                        z3 = true;
                        byte b = bytes2[i7];
                        byte b2 = bytes2[4];
                        byte[] bArr2 = new byte[4];
                        i2 = 0;
                        bArr2[0] = b;
                        bArr2[1] = b2;
                        bArr2[2] = 34;
                        bArr2[i7] = 58;
                        int i13 = AbstractC3687.f9266.getInt(bArr2, AbstractC3687.f9265);
                        if (z5) {
                            i13 &= Opcodes.MAX_VALUE;
                        }
                        c9416.m14741(1);
                        c9416.m14749(i13);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match5", "(I)Z");
                        i7 = 3;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 6:
                        c94183 = c94185;
                        byte b3 = bytes2[i7];
                        byte b4 = bytes2[4];
                        byte b5 = bytes2[5];
                        byte[] bArr3 = new byte[4];
                        bArr3[0] = b3;
                        z3 = true;
                        bArr3[1] = b4;
                        bArr3[2] = b5;
                        bArr3[i7] = 34;
                        int i14 = AbstractC3687.f9266.getInt(bArr3, AbstractC3687.f9265);
                        if (z5) {
                            i14 &= 16777215;
                        }
                        c9416.m14741(1);
                        c9416.m14749(i14);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match6", "(I)Z");
                        i7 = 3;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 7:
                        c94183 = c94185;
                        int i15 = AbstractC3687.f9266.getInt(bytes2, AbstractC3687.f9265 + 3);
                        c9416.m14741(1);
                        c9416.m14749(i15);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match7", "(I)Z");
                        z3 = true;
                        i7 = 3;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 8:
                        c94183 = c94185;
                        int i16 = AbstractC3687.f9266.getInt(bytes2, AbstractC3687.f9265 + 3);
                        c9416.m14741(1);
                        c9416.m14749(i16);
                        c9416.m14749(bytes2[7]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match8", "(IB)Z");
                        z3 = true;
                        i7 = 3;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 9:
                        c94183 = c94185;
                        byte[] bArr4 = new byte[8];
                        System.arraycopy(bytes2, 3, bArr4, 0, 6);
                        bArr4[6] = 34;
                        bArr4[7] = 58;
                        long j = AbstractC3687.f9266.getLong(bArr4, AbstractC3687.f9265);
                        if (z5) {
                            j &= 281474976710655L;
                        }
                        z3 = true;
                        c9416.m14741(1);
                        c9416.m14712(j);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match9", "(J)Z");
                        i7 = 3;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 10:
                        c94183 = c94185;
                        byte[] bArr5 = new byte[8];
                        System.arraycopy(bytes2, i7, bArr5, 0, 7);
                        bArr5[7] = 34;
                        long j2 = AbstractC3687.f9266.getLong(bArr5, AbstractC3687.f9265);
                        if (z5) {
                            j2 &= 72057594037927935L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j2);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match10", "(J)Z");
                        z3 = true;
                        i7 = 3;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 11:
                        c94183 = c94185;
                        long j3 = AbstractC3687.f9266.getLong(bytes2, AbstractC3687.f9265 + 3);
                        c9416.m14741(1);
                        c9416.m14712(j3);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match11", "(J)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 12:
                        c94183 = c94185;
                        long j4 = AbstractC3687.f9266.getLong(bytes2, AbstractC3687.f9265 + 3);
                        c9416.m14741(1);
                        c9416.m14712(j4);
                        c9416.m14749(bytes2[11]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match12", "(JB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 13:
                        c94183 = c94185;
                        Unsafe unsafe = AbstractC3687.f9266;
                        long j5 = AbstractC3687.f9265;
                        long j6 = unsafe.getLong(bytes2, j5 + 3);
                        byte b6 = bytes2[11];
                        byte b7 = bytes2[12];
                        byte[] bArr6 = new byte[4];
                        bArr6[0] = b6;
                        bArr6[1] = b7;
                        bArr6[2] = 34;
                        bArr6[i7] = 58;
                        int i17 = unsafe.getInt(bArr6, j5);
                        if (z5) {
                            i17 &= Opcodes.MAX_VALUE;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j6);
                        c9416.m14749(i17);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match13", "(JI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 14:
                        c94183 = c94185;
                        Unsafe unsafe2 = AbstractC3687.f9266;
                        long j7 = AbstractC3687.f9265;
                        long j8 = unsafe2.getLong(bytes2, j7 + 3);
                        byte b8 = bytes2[11];
                        byte b9 = bytes2[12];
                        byte b10 = bytes2[13];
                        byte[] bArr7 = new byte[4];
                        bArr7[0] = b8;
                        bArr7[1] = b9;
                        bArr7[2] = b10;
                        bArr7[i7] = 34;
                        int i18 = unsafe2.getInt(bArr7, j7);
                        if (z5) {
                            i18 &= 16777215;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j8);
                        c9416.m14749(i18);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match14", "(JI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 15:
                        c94183 = c94185;
                        Unsafe unsafe3 = AbstractC3687.f9266;
                        long j9 = AbstractC3687.f9265;
                        long j10 = unsafe3.getLong(bytes2, j9 + 3);
                        int i19 = unsafe3.getInt(bytes2, j9 + 11);
                        c9416.m14741(1);
                        c9416.m14712(j10);
                        c9416.m14749(i19);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match15", "(JI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 16:
                        c94183 = c94185;
                        Unsafe unsafe4 = AbstractC3687.f9266;
                        long j11 = AbstractC3687.f9265;
                        long j12 = unsafe4.getLong(bytes2, j11 + 3);
                        int i20 = unsafe4.getInt(bytes2, j11 + 11);
                        c9416.m14741(1);
                        c9416.m14712(j12);
                        c9416.m14749(i20);
                        c9416.m14716(bytes2[15]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match16", "(JIB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 17:
                        c94183 = c94185;
                        Unsafe unsafe5 = AbstractC3687.f9266;
                        long j13 = AbstractC3687.f9265;
                        long j14 = unsafe5.getLong(bytes2, j13 + 3);
                        byte[] bArr8 = new byte[8];
                        System.arraycopy(bytes2, 11, bArr8, 0, 6);
                        bArr8[6] = 34;
                        bArr8[7] = 58;
                        long j15 = unsafe5.getLong(bArr8, j13);
                        if (z5) {
                            j15 &= 281474976710655L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j14);
                        c9416.m14712(j15);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match17", "(JJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 18:
                        c94183 = c94185;
                        Unsafe unsafe6 = AbstractC3687.f9266;
                        long j16 = AbstractC3687.f9265;
                        long j17 = unsafe6.getLong(bytes2, j16 + 3);
                        byte[] bArr9 = new byte[8];
                        System.arraycopy(bytes2, 11, bArr9, 0, 7);
                        bArr9[7] = 34;
                        long j18 = unsafe6.getLong(bArr9, j16);
                        if (z5) {
                            j18 &= 72057594037927935L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j17);
                        c9416.m14712(j18);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match18", "(JJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 19:
                        c94183 = c94185;
                        Unsafe unsafe7 = AbstractC3687.f9266;
                        long j19 = AbstractC3687.f9265;
                        long j20 = unsafe7.getLong(bytes2, j19 + 3);
                        long j21 = unsafe7.getLong(bytes2, j19 + 11);
                        c9416.m14741(1);
                        c9416.m14712(j20);
                        c9416.m14712(j21);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match19", "(JJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 20:
                        c94183 = c94185;
                        Unsafe unsafe8 = AbstractC3687.f9266;
                        long j22 = AbstractC3687.f9265;
                        long j23 = unsafe8.getLong(bytes2, j22 + 3);
                        long j24 = unsafe8.getLong(bytes2, j22 + 11);
                        c9416.m14741(1);
                        c9416.m14712(j23);
                        c9416.m14712(j24);
                        c9416.m14749(bytes2[19]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match20", "(JJB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 21:
                        c94183 = c94185;
                        Unsafe unsafe9 = AbstractC3687.f9266;
                        long j25 = AbstractC3687.f9265;
                        long j26 = unsafe9.getLong(bytes2, j25 + 3);
                        long j27 = unsafe9.getLong(bytes2, j25 + 11);
                        byte b11 = bytes2[19];
                        byte b12 = bytes2[20];
                        byte[] bArr10 = new byte[4];
                        bArr10[0] = b11;
                        bArr10[1] = b12;
                        bArr10[2] = 34;
                        bArr10[i7] = 58;
                        int i21 = unsafe9.getInt(bArr10, j25);
                        if (z5) {
                            i21 &= Opcodes.MAX_VALUE;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j26);
                        c9416.m14712(j27);
                        c9416.m14749(i21);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match21", "(JJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 22:
                        c94183 = c94185;
                        Unsafe unsafe10 = AbstractC3687.f9266;
                        long j28 = AbstractC3687.f9265;
                        long j29 = unsafe10.getLong(bytes2, j28 + 3);
                        long j30 = unsafe10.getLong(bytes2, j28 + 11);
                        byte b13 = bytes2[19];
                        byte b14 = bytes2[20];
                        byte b15 = bytes2[21];
                        byte[] bArr11 = new byte[4];
                        bArr11[0] = b13;
                        bArr11[1] = b14;
                        bArr11[2] = b15;
                        bArr11[i7] = 34;
                        int i22 = unsafe10.getInt(bArr11, j28);
                        if (z5) {
                            i22 &= 16777215;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j29);
                        c9416.m14712(j30);
                        c9416.m14749(i22);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match22", "(JJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 23:
                        c94183 = c94185;
                        Unsafe unsafe11 = AbstractC3687.f9266;
                        long j31 = AbstractC3687.f9265;
                        long j32 = unsafe11.getLong(bytes2, j31 + 3);
                        long j33 = unsafe11.getLong(bytes2, j31 + 11);
                        int i23 = unsafe11.getInt(bytes2, j31 + 19);
                        c9416.m14741(1);
                        c9416.m14712(j32);
                        c9416.m14712(j33);
                        c9416.m14749(i23);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match23", "(JJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 24:
                        c94183 = c94185;
                        Unsafe unsafe12 = AbstractC3687.f9266;
                        long j34 = AbstractC3687.f9265;
                        long j35 = unsafe12.getLong(bytes2, j34 + 3);
                        long j36 = unsafe12.getLong(bytes2, j34 + 11);
                        int i24 = unsafe12.getInt(bytes2, j34 + 19);
                        c9416.m14741(1);
                        c9416.m14712(j35);
                        c9416.m14712(j36);
                        c9416.m14749(i24);
                        c9416.m14716(bytes2[23]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match24", "(JJIB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 25:
                        c94183 = c94185;
                        Unsafe unsafe13 = AbstractC3687.f9266;
                        long j37 = AbstractC3687.f9265;
                        long j38 = unsafe13.getLong(bytes2, j37 + 3);
                        long j39 = unsafe13.getLong(bytes2, j37 + 11);
                        byte[] bArr12 = new byte[8];
                        System.arraycopy(bytes2, 19, bArr12, 0, 6);
                        bArr12[6] = 34;
                        bArr12[7] = 58;
                        long j40 = unsafe13.getLong(bArr12, j37);
                        if (z5) {
                            j40 &= 281474976710655L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j38);
                        c9416.m14712(j39);
                        c9416.m14712(j40);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match25", "(JJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 26:
                        c94183 = c94185;
                        Unsafe unsafe14 = AbstractC3687.f9266;
                        long j41 = AbstractC3687.f9265;
                        long j42 = unsafe14.getLong(bytes2, j41 + 3);
                        long j43 = unsafe14.getLong(bytes2, j41 + 11);
                        byte[] bArr13 = new byte[8];
                        System.arraycopy(bytes2, 19, bArr13, 0, 7);
                        bArr13[7] = 34;
                        long j44 = unsafe14.getLong(bArr13, j41);
                        if (z5) {
                            j44 &= 72057594037927935L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j42);
                        c9416.m14712(j43);
                        c9416.m14712(j44);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match26", "(JJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 27:
                        c94183 = c94185;
                        Unsafe unsafe15 = AbstractC3687.f9266;
                        long j45 = AbstractC3687.f9265;
                        long j46 = unsafe15.getLong(bytes2, j45 + 3);
                        long j47 = unsafe15.getLong(bytes2, j45 + 11);
                        long j48 = unsafe15.getLong(bytes2, j45 + 19);
                        c9416.m14741(1);
                        c9416.m14712(j46);
                        c9416.m14712(j47);
                        c9416.m14712(j48);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match27", "(JJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 28:
                        c94183 = c94185;
                        Unsafe unsafe16 = AbstractC3687.f9266;
                        long j49 = AbstractC3687.f9265;
                        long j50 = unsafe16.getLong(bytes2, j49 + 3);
                        long j51 = unsafe16.getLong(bytes2, j49 + 11);
                        long j52 = unsafe16.getLong(bytes2, j49 + 19);
                        c9416.m14741(1);
                        c9416.m14712(j50);
                        c9416.m14712(j51);
                        c9416.m14712(j52);
                        c9416.m14716(bytes2[27]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match28", "(JJJB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 29:
                        c94183 = c94185;
                        Unsafe unsafe17 = AbstractC3687.f9266;
                        long j53 = AbstractC3687.f9265;
                        long j54 = unsafe17.getLong(bytes2, j53 + 3);
                        long j55 = unsafe17.getLong(bytes2, j53 + 11);
                        long j56 = unsafe17.getLong(bytes2, j53 + 19);
                        byte b16 = bytes2[27];
                        byte b17 = bytes2[28];
                        byte[] bArr14 = new byte[4];
                        bArr14[0] = b16;
                        bArr14[1] = b17;
                        bArr14[2] = 34;
                        bArr14[i7] = 58;
                        int i25 = unsafe17.getInt(bArr14, j53);
                        if (z5) {
                            i25 &= Opcodes.MAX_VALUE;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j54);
                        c9416.m14712(j55);
                        c9416.m14712(j56);
                        c9416.m14749(i25);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match29", "(JJJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 30:
                        c94183 = c94185;
                        Unsafe unsafe18 = AbstractC3687.f9266;
                        long j57 = AbstractC3687.f9265;
                        long j58 = unsafe18.getLong(bytes2, j57 + 3);
                        long j59 = unsafe18.getLong(bytes2, j57 + 11);
                        long j60 = unsafe18.getLong(bytes2, j57 + 19);
                        byte b18 = bytes2[27];
                        byte b19 = bytes2[28];
                        byte b20 = bytes2[29];
                        byte[] bArr15 = new byte[4];
                        bArr15[0] = b18;
                        bArr15[1] = b19;
                        bArr15[2] = b20;
                        bArr15[i7] = 34;
                        int i26 = unsafe18.getInt(bArr15, j57);
                        if (z5) {
                            i26 &= 16777215;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j58);
                        c9416.m14712(j59);
                        c9416.m14712(j60);
                        c9416.m14749(i26);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match30", "(JJJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 31:
                        c94183 = c94185;
                        Unsafe unsafe19 = AbstractC3687.f9266;
                        long j61 = AbstractC3687.f9265;
                        long j62 = unsafe19.getLong(bytes2, j61 + 3);
                        long j63 = unsafe19.getLong(bytes2, j61 + 11);
                        long j64 = unsafe19.getLong(bytes2, j61 + 19);
                        int i27 = unsafe19.getInt(bytes2, j61 + 27);
                        c9416.m14741(1);
                        c9416.m14712(j62);
                        c9416.m14712(j63);
                        c9416.m14712(j64);
                        c9416.m14749(i27);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match31", "(JJJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 32:
                        c94183 = c94185;
                        Unsafe unsafe20 = AbstractC3687.f9266;
                        long j65 = AbstractC3687.f9265;
                        long j66 = unsafe20.getLong(bytes2, j65 + 3);
                        long j67 = unsafe20.getLong(bytes2, j65 + 11);
                        long j68 = unsafe20.getLong(bytes2, j65 + 19);
                        int i28 = unsafe20.getInt(bytes2, j65 + 27);
                        c9416.m14741(1);
                        c9416.m14712(j66);
                        c9416.m14712(j67);
                        c9416.m14712(j68);
                        c9416.m14716(i28);
                        c9416.m14749(bytes2[31]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match32", "(JJJIB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 33:
                        c94183 = c94185;
                        Unsafe unsafe21 = AbstractC3687.f9266;
                        long j69 = AbstractC3687.f9265;
                        long j70 = unsafe21.getLong(bytes2, j69 + 3);
                        long j71 = unsafe21.getLong(bytes2, j69 + 11);
                        long j72 = unsafe21.getLong(bytes2, j69 + 19);
                        byte[] bArr16 = new byte[8];
                        System.arraycopy(bytes2, 27, bArr16, 0, 6);
                        bArr16[6] = 34;
                        bArr16[7] = 58;
                        long j73 = unsafe21.getLong(bArr16, j69);
                        if (z5) {
                            j73 &= 281474976710655L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j70);
                        c9416.m14712(j71);
                        c9416.m14712(j72);
                        c9416.m14712(j73);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match33", "(JJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 34:
                        c94183 = c94185;
                        Unsafe unsafe22 = AbstractC3687.f9266;
                        long j74 = AbstractC3687.f9265;
                        long j75 = unsafe22.getLong(bytes2, j74 + 3);
                        long j76 = unsafe22.getLong(bytes2, j74 + 11);
                        long j77 = unsafe22.getLong(bytes2, j74 + 19);
                        byte[] bArr17 = new byte[8];
                        System.arraycopy(bytes2, 27, bArr17, 0, 7);
                        bArr17[7] = 34;
                        long j78 = unsafe22.getLong(bArr17, j74);
                        if (z5) {
                            j78 &= 72057594037927935L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j75);
                        c9416.m14712(j76);
                        c9416.m14712(j77);
                        c9416.m14712(j78);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match34", "(JJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 35:
                        c94183 = c94185;
                        Unsafe unsafe23 = AbstractC3687.f9266;
                        long j79 = AbstractC3687.f9265;
                        long j80 = unsafe23.getLong(bytes2, j79 + 3);
                        long j81 = unsafe23.getLong(bytes2, j79 + 11);
                        long j82 = unsafe23.getLong(bytes2, j79 + 19);
                        long j83 = unsafe23.getLong(bytes2, j79 + 27);
                        c9416.m14741(1);
                        c9416.m14712(j80);
                        c9416.m14712(j81);
                        c9416.m14712(j82);
                        c9416.m14712(j83);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match35", "(JJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 36:
                        c94183 = c94185;
                        Unsafe unsafe24 = AbstractC3687.f9266;
                        long j84 = AbstractC3687.f9265;
                        long j85 = unsafe24.getLong(bytes2, j84 + 3);
                        long j86 = unsafe24.getLong(bytes2, j84 + 11);
                        long j87 = unsafe24.getLong(bytes2, j84 + 19);
                        long j88 = unsafe24.getLong(bytes2, j84 + 27);
                        c9416.m14741(1);
                        c9416.m14712(j85);
                        c9416.m14712(j86);
                        c9416.m14712(j87);
                        c9416.m14712(j88);
                        c9416.m14749(bytes2[35]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match36", "(JJJJB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 37:
                        c94183 = c94185;
                        Unsafe unsafe25 = AbstractC3687.f9266;
                        long j89 = AbstractC3687.f9265;
                        long j90 = unsafe25.getLong(bytes2, j89 + 3);
                        long j91 = unsafe25.getLong(bytes2, j89 + 11);
                        long j92 = unsafe25.getLong(bytes2, j89 + 19);
                        long j93 = unsafe25.getLong(bytes2, j89 + 27);
                        byte b21 = bytes2[35];
                        byte b22 = bytes2[36];
                        byte[] bArr18 = new byte[4];
                        bArr18[0] = b21;
                        bArr18[1] = b22;
                        bArr18[2] = 34;
                        bArr18[i7] = 58;
                        int i29 = unsafe25.getInt(bArr18, j89);
                        if (z5) {
                            i29 &= Opcodes.MAX_VALUE;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j90);
                        c9416.m14712(j91);
                        c9416.m14712(j92);
                        c9416.m14712(j93);
                        c9416.m14749(i29);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match37", "(JJJJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 38:
                        c94183 = c94185;
                        Unsafe unsafe26 = AbstractC3687.f9266;
                        long j94 = AbstractC3687.f9265;
                        long j95 = unsafe26.getLong(bytes2, j94 + 3);
                        long j96 = unsafe26.getLong(bytes2, j94 + 11);
                        long j97 = unsafe26.getLong(bytes2, j94 + 19);
                        long j98 = unsafe26.getLong(bytes2, j94 + 27);
                        byte b23 = bytes2[35];
                        byte b24 = bytes2[36];
                        byte b25 = bytes2[37];
                        byte[] bArr19 = new byte[4];
                        bArr19[0] = b23;
                        bArr19[1] = b24;
                        bArr19[2] = b25;
                        bArr19[i7] = 34;
                        int i30 = unsafe26.getInt(bArr19, j94);
                        if (z5) {
                            i30 &= 16777215;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j95);
                        c9416.m14712(j96);
                        c9416.m14712(j97);
                        c9416.m14712(j98);
                        c9416.m14749(i30);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match38", "(JJJJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 39:
                        c94183 = c94185;
                        Unsafe unsafe27 = AbstractC3687.f9266;
                        long j99 = AbstractC3687.f9265;
                        long j100 = unsafe27.getLong(bytes2, j99 + 3);
                        long j101 = unsafe27.getLong(bytes2, j99 + 11);
                        long j102 = unsafe27.getLong(bytes2, j99 + 19);
                        long j103 = unsafe27.getLong(bytes2, j99 + 27);
                        int i31 = unsafe27.getInt(bytes2, j99 + 35);
                        c9416.m14741(1);
                        c9416.m14712(j100);
                        c9416.m14712(j101);
                        c9416.m14712(j102);
                        c9416.m14712(j103);
                        c9416.m14749(i31);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match39", "(JJJJI)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 40:
                        c94183 = c94185;
                        Unsafe unsafe28 = AbstractC3687.f9266;
                        long j104 = AbstractC3687.f9265;
                        long j105 = unsafe28.getLong(bytes2, j104 + 3);
                        long j106 = unsafe28.getLong(bytes2, j104 + 11);
                        long j107 = unsafe28.getLong(bytes2, j104 + 19);
                        long j108 = unsafe28.getLong(bytes2, j104 + 27);
                        int i32 = unsafe28.getInt(bytes2, j104 + 35);
                        c9416.m14741(1);
                        c9416.m14712(j105);
                        c9416.m14712(j106);
                        c9416.m14712(j107);
                        c9416.m14712(j108);
                        c9416.m14749(i32);
                        c9416.m14749(bytes2[39]);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match40", "(JJJJIB)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 41:
                        c94183 = c94185;
                        Unsafe unsafe29 = AbstractC3687.f9266;
                        long j109 = AbstractC3687.f9265;
                        long j110 = unsafe29.getLong(bytes2, j109 + 3);
                        long j111 = unsafe29.getLong(bytes2, j109 + 11);
                        long j112 = unsafe29.getLong(bytes2, j109 + 19);
                        long j113 = unsafe29.getLong(bytes2, j109 + 27);
                        byte[] bArr20 = new byte[8];
                        System.arraycopy(bytes2, 35, bArr20, 0, 6);
                        bArr20[6] = 34;
                        bArr20[7] = 58;
                        long j114 = unsafe29.getLong(bArr20, j109);
                        if (z5) {
                            j114 &= 281474976710655L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j110);
                        c9416.m14712(j111);
                        c9416.m14712(j112);
                        c9416.m14712(j113);
                        c9416.m14712(j114);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match41", "(JJJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z6222222222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z6222222222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 42:
                        c94183 = c94185;
                        Unsafe unsafe30 = AbstractC3687.f9266;
                        long j115 = AbstractC3687.f9265;
                        long j116 = unsafe30.getLong(bytes2, j115 + 3);
                        long j117 = unsafe30.getLong(bytes2, j115 + 11);
                        long j118 = unsafe30.getLong(bytes2, j115 + 19);
                        long j119 = unsafe30.getLong(bytes2, j115 + 27);
                        byte[] bArr21 = new byte[8];
                        System.arraycopy(bytes2, 35, bArr21, 0, 7);
                        bArr21[7] = 34;
                        long j120 = unsafe30.getLong(bArr21, j115);
                        if (z5) {
                            j120 &= 72057594037927935L;
                        }
                        c9416.m14741(1);
                        c9416.m14712(j116);
                        c9416.m14712(j117);
                        c9416.m14712(j118);
                        c9416.m14712(j119);
                        c9416.m14712(j120);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match42", "(JJJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z62222222222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z62222222222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    case 43:
                        Unsafe unsafe31 = AbstractC3687.f9266;
                        long j121 = AbstractC3687.f9265;
                        long j122 = unsafe31.getLong(bytes2, j121 + 3);
                        long j123 = unsafe31.getLong(bytes2, j121 + 11);
                        long j124 = unsafe31.getLong(bytes2, j121 + 19);
                        long j125 = unsafe31.getLong(bytes2, j121 + 27);
                        c94183 = c94185;
                        long j126 = unsafe31.getLong(bytes2, j121 + 35);
                        c9416.m14741(1);
                        c9416.m14712(j122);
                        c9416.m14712(j123);
                        c9416.m14712(j124);
                        c9416.m14712(j125);
                        c9416.m14712(j126);
                        c9416.m14745(AbstractC9420.f24360, "nextIfName4Match43", "(JJJJJ)Z");
                        z3 = true;
                        i2 = 0;
                        c9416.m14752(c94183 == null ? c94183 : c94182);
                        boolean z622222222222222222222222222222222222222222 = z3;
                        m6080(c3565, abstractC35952, z, c2743, i, iIntValue, false);
                        c9416.m14756(c9418);
                        if (c94183 == null) {
                        }
                        c94184 = c94186;
                        i3 = i2;
                        z2 = z622222222222222222222222222222222222222222;
                        iArr = iArr2;
                        size = i11;
                        c9418Arr = c9418Arr2;
                        z4 = z5;
                        identityHashMap = identityHashMap2;
                        treeMap = treeMap2;
                        i8 = i12;
                        i9 = i10;
                        list = list2;
                        break;
                    default:
                        C6755.m11870(AbstractC7012.m12147(length, "fieldNameLength "));
                        break;
                }
                return;
            }
            boolean z7 = z4;
            C9418 c94187 = c94184;
            c9416.m14756(c94187);
            i8++;
            c94184 = c94187;
            z4 = z7;
        }
        c9416.m14717(c94184);
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
    */
    public final void m6085(C3565 c3565, long j) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        AbstractC3595[] abstractC3595Arr;
        int i6;
        int i7;
        String str;
        AbstractC3595[] abstractC3595Arr2;
        C9418 c9418;
        int i8;
        C9418 c94182;
        boolean z3;
        C9418 c94183;
        int i9;
        C3565 c35652;
        boolean z4;
        boolean z5;
        C2743 c2743;
        C9418 c94184;
        C2743 c27432;
        boolean z6;
        C9418 c94185;
        C9418 c94186;
        int i10;
        C3564 c3564;
        int i11;
        AbstractC3595[] abstractC3595Arr3 = c3565.f8671;
        int i12 = c3565.f8683;
        String str2 = c3565.f8684;
        boolean z7 = (j & JSONReader$Feature.FieldBased.mask) != 0;
        C9419 c9419 = c3565.f8674;
        String str3 = f8667;
        C9416 c9416M14770 = c9419.m14770(2048, "readObject", str3);
        C2743 c27433 = new C2743(c9416M14770, false);
        int iM4164 = c27433.m4164("object");
        int iM41642 = c27433.m4164("I");
        int iM4163 = c27433.m4163("hashCode64");
        int iM41643 = c27433.m4164("hashCode32");
        int iM41644 = c27433.m4164("fieldReader");
        boolean zM6091 = c3565.m6091();
        boolean zM6093 = c3565.m6093();
        boolean zM6092 = c3565.m6092();
        boolean z8 = (c3565.f8676.f23445 & 9007199254740992L) != 0;
        if (zM6092) {
            z = z7;
            i = iM41643;
            z2 = z8;
            i2 = 1;
            i3 = 4;
        } else {
            C9418 c94187 = new C9418();
            z = z7;
            c9416M14770.m14741(1);
            z2 = z8;
            i = iM41643;
            c9416M14770.m14758(AbstractC9420.f24360, "jsonb", "Z");
            c9416M14770.m14752(c94187);
            c9416M14770.m14741(0);
            i2 = 1;
            c9416M14770.m14741(1);
            c9416M14770.m14741(2);
            c9416M14770.m14741(3);
            i3 = 4;
            c9416M14770.m14725(4);
            c9416M14770.m14745(str2, "readJSONBObject", str3);
            c9416M14770.m14740();
            c9416M14770.m14717(c94187);
        }
        c9416M14770.m14741(i2);
        c9416M14770.m14725(i3);
        String str4 = AbstractC9420.f24360;
        c9416M14770.m14745(str4, "features", "(J)J");
        c9416M14770.m14734(i3);
        if (z2 && zM6091) {
            i5 = i12;
            abstractC3595Arr = abstractC3595Arr3;
            i4 = iM4163;
        } else {
            C9418 c94188 = new C9418();
            i4 = iM4163;
            c9416M14770.m14741(1);
            c9416M14770.m14745(str4, "isArray", "()Z");
            c9416M14770.m14752(c94188);
            if (zM6091) {
                i5 = i12;
                abstractC3595Arr = abstractC3595Arr3;
                i6 = 0;
            } else {
                C9418 c94189 = new C9418();
                i5 = i12;
                abstractC3595Arr = abstractC3595Arr3;
                if ((j & JSONReader$Feature.SupportArrayToBean.mask) == 0) {
                    i7 = 1;
                    c9416M14770.m14741(1);
                    c9416M14770.m14725(4);
                    c9416M14770.m14745(str4, "isSupportBeanArray", "(J)Z");
                    c9416M14770.m14752(c94189);
                } else {
                    i7 = 1;
                }
                i6 = 0;
                c9416M14770.m14741(0);
                c9416M14770.m14741(i7);
                c9416M14770.m14741(2);
                c9416M14770.m14741(3);
                c9416M14770.m14725(4);
                c9416M14770.m14745(str2, "readArrayMappingObject", str3);
                c9416M14770.m14740();
                c9416M14770.m14717(c94189);
            }
            c9416M14770.m14741(i6);
            c9416M14770.m14741(1);
            c9416M14770.m14741(2);
            c9416M14770.m14741(3);
            c9416M14770.m14725(4);
            c9416M14770.m14745(str2, "processObjectInputSingleItemArray", str3);
            c9416M14770.m14740();
            c9416M14770.m14717(c94188);
        }
        C9418 c941810 = new C9418();
        C9418 c941811 = new C9418();
        c9416M14770.m14741(1);
        c9416M14770.m14745(str4, "nextIfObjectStart", "()Z");
        c9416M14770.m14753(c941811);
        c9416M14770.m14741(1);
        c9416M14770.m14745(str4, "nextIfNullOrEmptyString", "()Z");
        c9416M14770.m14752(c941811);
        c9416M14770.m14715(1);
        c9416M14770.m14740();
        c9416M14770.m14717(c941811);
        if (c3565.f8678 instanceof C3631) {
            C9418 c941812 = new C9418();
            C9418 c941813 = new C9418();
            c9416M14770.m14741(1);
            c9416M14770.m14745(str4, "hasAutoTypeBeforeHandler", "()Z");
            c9416M14770.m14753(c941812);
            c9416M14770.m14725(4);
            str = "(J)Z";
            c9416M14770.m14712(JSONReader$Feature.SupportSmartMatch.mask | JSONReader$Feature.SupportAutoType.mask);
            c9416M14770.m14728();
            c9416M14770.m14726();
            c9416M14770.m14727();
            c9416M14770.m14752(c941813);
            c9416M14770.m14717(c941812);
            c9416M14770.m14741(0);
            c9416M14770.m14741(1);
            c9416M14770.m14741(2);
            c9416M14770.m14741(3);
            c9416M14770.m14725(4);
            c9416M14770.m14746(AbstractC9420.f24342, "readObject", str3);
            c9416M14770.m14740();
            c9416M14770.m14717(c941813);
            abstractC3595Arr2 = abstractC3595Arr;
            m6073(abstractC3595Arr2, c27433);
        } else {
            str = "(J)Z";
            abstractC3595Arr2 = abstractC3595Arr;
            m6087(c9416M14770, c3565, str2);
            c9416M14770.m14739(iM4164);
        }
        C9418 c941814 = new C9418();
        C9418 c941815 = new C9418();
        C9418 c941816 = new C9418();
        if (!zM6093) {
            c9416M14770.m14715(3);
            c9416M14770.m14729(iM41642);
        }
        c9416M14770.m14717(c941814);
        C9418 c941817 = new C9418();
        c9416M14770.m14741(1);
        c9416M14770.m14745(str4, "nextIfObjectEnd", "()Z");
        c9416M14770.m14753(c941815);
        int i13 = c3565.f8679;
        if (i13 >= 5) {
            c9418 = c941810;
            i8 = i5;
            if (i8 <= 7) {
                z5 = z;
                m6082(c3565, z5, c27433, iM4164, c941816, c941817);
                c94182 = c941817;
                c94183 = c941816;
                i9 = iM4164;
                c27433 = c27433;
                c35652 = c3565;
            }
            z3 = z5;
            z4 = true;
            c9416M14770.m14717(c94182);
            c9416M14770.m14741(1);
            c9416M14770.m14745(str4, "readFieldNameHashCode", "()J");
            c9416M14770.m14715(92);
            int i14 = i4;
            c9416M14770.m14734(i14);
            boolean z9 = z3;
            c9416M14770.m14712(-1L);
            c9416M14770.m14727();
            c9416M14770.m14752(c941815);
            if (zM6093 || (c35652.f8678 instanceof C3631)) {
                c2743 = c27433;
            } else {
                C9418 c941818 = new C9418();
                c9416M14770.m14743(iM41642);
                c9416M14770.m14753(c941818);
                c9416M14770.m14725(i14);
                c2743 = c27433;
                c9416M14770.m14712(InterfaceC3621.f8931);
                c9416M14770.m14727();
                c9416M14770.m14753(c941818);
                if ((j & JSONReader$Feature.SupportAutoType.mask) == 0) {
                    c9416M14770.m14741(1);
                    c9416M14770.m14725(4);
                    c9416M14770.m14745(str4, "isSupportAutoTypeOrHandler", str);
                    c9416M14770.m14752(c941818);
                }
                c9416M14770.m14741(0);
                c9416M14770.m14741(1);
                c9416M14770.m14741(0);
                c9416M14770.m14758(str2, "objectClass", "Ljava/lang/Class;");
                c9416M14770.m14725(4);
                c9416M14770.m14745(AbstractC9420.f24358, "autoType", "(" + AbstractC9420.m14777(AbstractC3732.class) + "Ljava/lang/Class;J)Ljava/lang/Object;");
                c9416M14770.m14740();
                c9416M14770.m14717(c941818);
            }
            if (z4) {
                if (c35652.f8678 instanceof C3631) {
                    C2743 c27434 = c2743;
                    m6081(c35652, c27434, i14, z9, i9, c94183);
                    c27432 = c27434;
                    c94184 = c94183;
                } else {
                    c94184 = c94183;
                    c27432 = c2743;
                    c9416M14770.m14741(0);
                    c9416M14770.m14725(i14);
                    c9416M14770.m14741(1);
                    c9416M14770.m14725(4);
                    c9416M14770.m14741(i9);
                    c9416M14770.m14745(AbstractC9420.f24358, "readFieldValue", f8662);
                }
                c9416M14770.m14756(c94184);
                c3564 = this;
                z6 = z4;
                c94185 = c941814;
                c94186 = c941815;
                i10 = iM41642;
            } else {
                c94184 = c94183;
                c27432 = c2743;
                if (abstractC3595Arr2.length > 6) {
                    TreeMap treeMap = new TreeMap();
                    C2743 c27435 = c27432;
                    int i15 = 0;
                    while (true) {
                        long[] jArr = c35652.f8678.f8806;
                        i11 = i9;
                        if (i15 >= jArr.length) {
                            break;
                        }
                        long j2 = jArr[i15];
                        ((List) treeMap.computeIfAbsent(Integer.valueOf((int) (j2 ^ (j2 >>> 32))), new C3602(8))).add(Long.valueOf(j2));
                        i15++;
                        i9 = i11;
                    }
                    int size = treeMap.size();
                    int[] iArr = new int[size];
                    Iterator it = treeMap.keySet().iterator();
                    int i16 = 0;
                    while (it.hasNext()) {
                        iArr[i16] = ((Integer) it.next()).intValue();
                        i16++;
                    }
                    Arrays.sort(iArr);
                    c9416M14770.m14725(i14);
                    c9416M14770.m14725(i14);
                    c9416M14770.m14738(32);
                    c9416M14770.m14715(125);
                    c9416M14770.m14715(131);
                    c9416M14770.m14715(136);
                    int i17 = i;
                    c9416M14770.m14729(i17);
                    String str5 = "()J";
                    C9418 c941819 = new C9418();
                    z6 = z4;
                    C9418[] c9418Arr = new C9418[size];
                    String str6 = "getNameHashCodeLCase";
                    for (int i18 = 0; i18 < size; i18++) {
                        c9418Arr[i18] = new C9418();
                    }
                    c9416M14770.m14743(i17);
                    c9416M14770.m14765(c941819, iArr, c9418Arr);
                    int i19 = 0;
                    while (i19 < size) {
                        c9416M14770.m14717(c9418Arr[i19]);
                        List list = (List) treeMap.get(Integer.valueOf(iArr[i19]));
                        C9418 c941820 = c941819;
                        int size2 = list.size();
                        C9418[] c9418Arr2 = c9418Arr;
                        int i20 = 0;
                        while (i20 < size2) {
                            TreeMap treeMap2 = treeMap;
                            int i21 = size;
                            long jLongValue = ((Long) list.get(i20)).longValue();
                            int i22 = i19;
                            C9418 c941821 = size2 > 1 ? new C9418() : c941820;
                            c9416M14770.m14725(i14);
                            c9416M14770.m14712(jLongValue);
                            c9416M14770.m14727();
                            c9416M14770.m14753(c941821);
                            int i23 = i14;
                            short s = c35652.f8678.f8807[Arrays.binarySearch(c35652.f8678.f8806, jLongValue)];
                            int i24 = size2;
                            C9418 c941822 = c941814;
                            C9418 c941823 = c941821;
                            C2743 c27436 = c27435;
                            int[] iArr2 = iArr;
                            int i25 = i11;
                            C9418 c941824 = c941815;
                            C9418 c941825 = c941820;
                            int i26 = iM41642;
                            String str7 = str6;
                            int i27 = i20;
                            String str8 = str5;
                            boolean z10 = z9;
                            List list2 = list;
                            m6080(c35652, abstractC3595Arr2[s], z10, c27436, i25, s, false);
                            c9416M14770.m14756(c94184);
                            if (c941823 != c941825) {
                                c9416M14770.m14717(c941823);
                            }
                            list = list2;
                            size2 = i24;
                            c941814 = c941822;
                            treeMap = treeMap2;
                            z9 = z10;
                            str5 = str8;
                            str6 = str7;
                            iM41642 = i26;
                            size = i21;
                            i20 = i27 + 1;
                            c941820 = c941825;
                            c941815 = c941824;
                            i14 = i23;
                            i11 = i25;
                            iArr = iArr2;
                            c27435 = c27436;
                            i19 = i22;
                        }
                        int i28 = i19;
                        C2743 c27437 = c27435;
                        int[] iArr3 = iArr;
                        int i29 = i11;
                        c9416M14770.m14756(c94184);
                        c941819 = c941820;
                        c941815 = c941815;
                        c9418Arr = c9418Arr2;
                        size = size;
                        i11 = i29;
                        str6 = str6;
                        iArr = iArr3;
                        iM41642 = iM41642;
                        c27435 = c27437;
                        i19 = i28 + 1;
                        i14 = i14;
                    }
                    i10 = iM41642;
                    c27432 = c27435;
                    i9 = i11;
                    String str9 = str5;
                    String str10 = str6;
                    c94185 = c941814;
                    c94186 = c941815;
                    c9416M14770.m14717(c941819);
                    if (!z2 && !(c35652.f8678 instanceof C3631)) {
                        C9418 c941826 = new C9418();
                        JSONReader$Feature jSONReader$Feature = JSONReader$Feature.SupportSmartMatch;
                        if ((j & jSONReader$Feature.mask) == 0) {
                            c9416M14770.m14725(4);
                            c9416M14770.m14712(jSONReader$Feature.mask);
                            c9416M14770.m14728();
                            c9416M14770.m14726();
                            c9416M14770.m14727();
                            c9416M14770.m14752(c941826);
                        }
                        c9416M14770.m14741(0);
                        c9416M14770.m14741(1);
                        c9416M14770.m14745(AbstractC9420.f24360, str10, str9);
                        c9416M14770.m14742(AbstractC9420.f24357, "getFieldReaderLCase", f8659);
                        c9416M14770.m14755();
                        c9416M14770.m14739(iM41644);
                        c9416M14770.m14751(c941826);
                        c9416M14770.m14741(iM41644);
                        c9416M14770.m14741(1);
                        c9416M14770.m14741(i9);
                        c9416M14770.m14745(AbstractC9420.f24359, "readFieldValue", f8658);
                        c9416M14770.m14756(c94184);
                        c9416M14770.m14717(c941826);
                    }
                    c3564 = this;
                } else {
                    z6 = z4;
                    c94185 = c941814;
                    c94186 = c941815;
                    i10 = iM41642;
                    boolean z11 = z9;
                    int i30 = 0;
                    while (i30 < abstractC3595Arr2.length) {
                        C9418 c941827 = new C9418();
                        C9418 c941828 = new C9418();
                        AbstractC3595 abstractC3595 = abstractC3595Arr2[i30];
                        String str11 = abstractC3595.f8773;
                        boolean z12 = z11;
                        long j3 = abstractC3595.f8756;
                        c9416M14770.m14725(i14);
                        c9416M14770.m14712(j3);
                        c9416M14770.m14727();
                        c9416M14770.m14753(c941827);
                        c9416M14770.m14717(c941828);
                        c27432 = c27432;
                        z11 = z12;
                        m6080(c35652, abstractC3595, z11, c27432, i9, i30, false);
                        c9416M14770.m14756(c94184);
                        c9416M14770.m14717(c941827);
                        i30++;
                        c35652 = c3565;
                    }
                    C9418 c941829 = new C9418();
                    if (!z2) {
                        JSONReader$Feature jSONReader$Feature2 = JSONReader$Feature.SupportSmartMatch;
                        if ((j & jSONReader$Feature2.mask) == 0) {
                            c9416M14770.m14725(4);
                            c9416M14770.m14712(jSONReader$Feature2.mask);
                            c9416M14770.m14728();
                            c9416M14770.m14726();
                            c9416M14770.m14727();
                            c9416M14770.m14752(c941829);
                        }
                        c9416M14770.m14741(1);
                        c9416M14770.m14745(AbstractC9420.f24360, "getNameHashCodeLCase", "()J");
                        c9416M14770.m14734(i14);
                        int i31 = 0;
                        while (i31 < abstractC3595Arr2.length) {
                            C9418 c941830 = new C9418();
                            C9418 c941831 = new C9418();
                            AbstractC3595 abstractC35952 = abstractC3595Arr2[i31];
                            String str12 = abstractC35952.f8773;
                            boolean z13 = z11;
                            C2743 c27438 = c27432;
                            long j4 = abstractC35952.f8756;
                            int i32 = i9;
                            int i33 = i31;
                            long j5 = abstractC35952.f8755;
                            c9416M14770.m14725(i14);
                            c9416M14770.m14712(j4);
                            c9416M14770.m14727();
                            c9416M14770.m14752(c941831);
                            if (j5 != j4) {
                                c9416M14770.m14725(i14);
                                c9416M14770.m14712(j5);
                                c9416M14770.m14727();
                                c9416M14770.m14753(c941830);
                            } else {
                                c9416M14770.m14756(c941830);
                            }
                            c9416M14770.m14717(c941831);
                            i9 = i32;
                            c27432 = c27438;
                            z11 = z13;
                            m6080(c3565, abstractC35952, z11, c27432, i9, i33, false);
                            c9416M14770.m14756(c94184);
                            c9416M14770.m14717(c941830);
                            i31 = i33 + 1;
                        }
                    }
                    c3564 = this;
                    c35652 = c3565;
                    c9416M14770.m14717(c941829);
                }
            }
            if (!z6) {
                if (c35652.f8678 instanceof C3631) {
                    c9416M14770.m14741(1);
                    c9416M14770.m14745(AbstractC9420.f24360, "skipValue", "()V");
                } else {
                    c9416M14770.m14741(0);
                    c9416M14770.m14741(1);
                    c9416M14770.m14741(i9);
                    c9416M14770.m14725(4);
                    c9416M14770.m14745(AbstractC9420.f24358, "processExtra", f8661);
                }
                c9416M14770.m14756(c94184);
            }
            c9416M14770.m14717(c94184);
            if (!zM6093) {
                c9416M14770.m14719(i10, 1);
            }
            c9416M14770.m14756(c94185);
            c9416M14770.m14717(c94186);
            c9416M14770.m14717(c9418);
            if (c35652.f8678 instanceof C3631) {
                c3564.m6086(c35652, c27432);
            } else {
                c9416M14770.m14741(i9);
            }
            c9416M14770.m14740();
            c9416M14770.m14766();
        }
        c9418 = c941810;
        i8 = i5;
        c94182 = c941817;
        z3 = z;
        c94183 = c941816;
        i9 = iM4164;
        if (i13 < 2 || i8 > 43) {
            c35652 = c3565;
            z4 = false;
            c9416M14770.m14717(c94182);
            c9416M14770.m14741(1);
            c9416M14770.m14745(str4, "readFieldNameHashCode", "()J");
            c9416M14770.m14715(92);
            int i142 = i4;
            c9416M14770.m14734(i142);
            boolean z92 = z3;
            c9416M14770.m14712(-1L);
            c9416M14770.m14727();
            c9416M14770.m14752(c941815);
            if (zM6093) {
                c2743 = c27433;
            }
            if (z4) {
            }
            if (!z6) {
            }
            c9416M14770.m14717(c94184);
            if (!zM6093) {
            }
            c9416M14770.m14756(c94185);
            c9416M14770.m14717(c94186);
            c9416M14770.m14717(c9418);
            if (c35652.f8678 instanceof C3631) {
            }
            c9416M14770.m14740();
            c9416M14770.m14766();
        }
        c35652 = c3565;
        z5 = z3;
        m6084(c35652, z5, c27433, i9, c94183, c94182);
        c94182 = c94182;
        c94183 = c94183;
        i9 = i9;
        c27433 = c27433;
        z3 = z5;
        z4 = true;
        c9416M14770.m14717(c94182);
        c9416M14770.m14741(1);
        c9416M14770.m14745(str4, "readFieldNameHashCode", "()J");
        c9416M14770.m14715(92);
        int i1422 = i4;
        c9416M14770.m14734(i1422);
        boolean z922 = z3;
        c9416M14770.m14712(-1L);
        c9416M14770.m14727();
        c9416M14770.m14752(c941815);
        if (zM6093) {
        }
        if (z4) {
        }
        if (!z6) {
        }
        c9416M14770.m14717(c94184);
        if (!zM6093) {
        }
        c9416M14770.m14756(c94185);
        c9416M14770.m14717(c94186);
        c9416M14770.m14717(c9418);
        if (c35652.f8678 instanceof C3631) {
        }
        c9416M14770.m14740();
        c9416M14770.m14766();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m6086(C3565 c3565, C2743 c2743) {
        Constructor constructor;
        Constructor constructor2;
        AbstractC3595[] abstractC3595Arr = c3565.f8671;
        String str = c3565.f8677;
        C9416 c9416 = (C9416) c2743.f5969;
        C3631 c3631 = (C3631) c3565.f8678;
        Class cls = c3565.f8675;
        int i = 0;
        if (!this.f8670.m6340(cls) && cls.getTypeParameters().length == 0 && (((constructor = c3631.f8797) == null || Modifier.isPublic(constructor.getModifiers())) && Modifier.isPublic(cls.getModifiers()) && c3631.f8996 == null && ((constructor2 = c3631.f8997) == null || Modifier.isPublic(constructor2.getModifiers())))) {
            c9416.m14733(str);
            c9416.m14755();
            StringBuilder sb = new StringBuilder("(");
            int length = abstractC3595Arr.length;
            while (i < length) {
                AbstractC3595 abstractC3595 = abstractC3595Arr[i];
                c9416.m14724(c2743.m4165(abstractC3595), abstractC3595.f8774);
                sb.append(AbstractC9420.m14777(abstractC3595.f8774));
                i++;
            }
            sb.append(")V");
            c9416.m14746(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, sb.toString());
            return;
        }
        c9416.m14741(0);
        c9416.m14749(abstractC3595Arr.length);
        c9416.m14764(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        while (i < abstractC3595Arr.length) {
            AbstractC3595 abstractC35952 = abstractC3595Arr[i];
            c9416.m14755();
            c9416.m14749(i);
            c9416.m14724(c2743.m4165(abstractC35952), abstractC35952.f8774);
            Class cls2 = abstractC35952.f8774;
            if (cls2 == Integer.TYPE) {
                c9416.m14747("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            } else if (cls2 == Long.TYPE) {
                c9416.m14747("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            } else if (cls2 == Float.TYPE) {
                c9416.m14747("java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            } else if (cls2 == Double.TYPE) {
                c9416.m14747("java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            } else if (cls2 == Boolean.TYPE) {
                c9416.m14747("java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            } else if (cls2 == Short.TYPE) {
                c9416.m14747("java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            } else if (cls2 == Byte.TYPE) {
                c9416.m14747("java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            } else if (cls2 == Character.TYPE) {
                c9416.m14747("java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            }
            c9416.m14715(83);
            i++;
        }
        c9416.m14745(AbstractC9420.f24342, "createInstance", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_DESCRIPTOR);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m6087(C9416 c9416, C3565 c3565, String str) {
        Constructor constructor = c3565.f8682;
        String str2 = c3565.f8677;
        Supplier supplier = c3565.f8678.f8794;
        Class cls = c3565.f8675;
        boolean z = Modifier.isPublic(cls == null ? 1 : cls.getModifiers()) && (cls == null || !this.f8670.m6340(cls));
        if (constructor != null && z && Modifier.isPublic(constructor.getModifiers())) {
            m6069(c9416, str2, constructor);
        } else {
            if (supplier != null) {
                c9416.m14741(0);
                c9416.m14758(str, "creator", "Ljava/util/function/Supplier;");
                c9416.m14742("java/util/function/Supplier", "get", "()Ljava/lang/Object;");
            } else {
                c9416.m14741(0);
                c9416.m14741(1);
                c9416.m14725(4);
                c9416.m14745(AbstractC9420.f24360, "features", "(J)J");
                c9416.m14745(str, "createInstance", "(J)Ljava/lang/Object;");
            }
            if (z) {
                c9416.m14737(str2);
            }
        }
        if (c3565.f8680) {
            C9418 c9418 = new C9418();
            c9416.m14725(4);
            c9416.m14712(JSONReader$Feature.InitStringFieldAsEmpty.mask);
            c9416.m14728();
            c9416.m14726();
            c9416.m14727();
            c9416.m14752(c9418);
            c9416.m14755();
            c9416.m14741(0);
            c9416.m14715(95);
            c9416.m14745(str, "initStringFieldAsEmpty", "(Ljava/lang/Object;)V");
            c9416.m14717(c9418);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3609
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C3631 mo6088(Class cls, C9194 c9194, Function function, ArrayList arrayList, String[] strArr, AbstractC3595[] abstractC3595Arr, AbstractC3595[] abstractC3595Arr2) {
        Class cls2;
        Constructor constructor;
        C3631 c3631 = new C3631(cls, c9194.f23437, c9194.f23436, c9194.f23445, function, abstractC3595Arr, abstractC3595Arr2, c9194.f23432, c9194.f23451);
        Class cls3 = c9194.f23428;
        C3697 c3697 = this.f8670;
        boolean z = cls3 == null && abstractC3595Arr2.length == 0 && ((function instanceof C3579) || (function instanceof C3577)) && ((arrayList == null || arrayList.isEmpty()) && !c3697.m6340(cls) && (c9194.f23445 & JSONReader$Feature.SupportAutoType.mask) == 0 && (((constructor = c3631.f8997) == null || constructor.getParameterCount() == abstractC3595Arr.length) && ((!(function instanceof C3577) || ((C3577) function).f8727.length == abstractC3595Arr.length) && abstractC3595Arr.length <= 64)));
        if (z) {
            for (AbstractC3595 abstractC3595 : abstractC3595Arr) {
                if (abstractC3595.mo6054() != null || abstractC3595.f8760 != null || abstractC3595.f8758 != null || (((cls2 = abstractC3595.f8774) != null && (!Modifier.isPublic(cls2.getModifiers()) || c3697.m6340(cls2))) || (((abstractC3595 instanceof C3518) && ((C3518) abstractC3595).f8503 != null) || ((abstractC3595 instanceof C3516) && ((C3516) abstractC3595).f8499 != null)))) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            return c3631;
        }
        boolean zM6340 = c3697.m6340(cls);
        C9419 c9419 = new C9419(new C3608(cls, 1));
        c9194.f23445 |= 144115188075855872L;
        C3565 c3565 = new C3565(c9194, cls, c9419, zM6340, abstractC3595Arr, null);
        c3565.f8678 = c3631;
        String str = AbstractC9420.f24342;
        m6075(abstractC3595Arr, c9419, str);
        c9419.m14772(c3565.f8684, str, new String[0]);
        C9416 c9416M14770 = c9419.m14770(abstractC3595Arr2.length <= 12 ? 32 : 128, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V");
        c9416M14770.m14741(0);
        c9416M14770.m14741(1);
        c9416M14770.m14741(2);
        c9416M14770.m14741(3);
        c9416M14770.m14725(4);
        c9416M14770.m14741(6);
        c9416M14770.m14741(7);
        c9416M14770.m14741(8);
        c9416M14770.m14741(9);
        c9416M14770.m14741(10);
        c9416M14770.m14741(11);
        c9416M14770.m14741(12);
        c9416M14770.m14746(str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;Ljava/util/List;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V");
        m6074(abstractC3595Arr, c3565.f8684, true, 9, c9416M14770, str);
        c9416M14770.m14721();
        c9416M14770.m14766();
        m6085(c3565, c9194.f23445);
        if (!c3565.m6092()) {
            m6083(c3565, c9194.f23445);
        }
        byte[] bArrM14773 = c9419.m14773();
        try {
            return (C3631) c3697.m6341(c3565.f8681, bArrM14773.length, bArrM14773).getConstructors()[0].newInstance(cls, c9194.f23437, c9194.f23436, Long.valueOf(c9194.f23445), function, arrayList, strArr, abstractC3595Arr, abstractC3595Arr2, null, null);
        } catch (Throwable th) {
            C1123.m1403("create objectReader error".concat(", objectType " + cls.getTypeName()), th);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3609
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC3621 mo6089(Class cls, Type type, boolean z, C3635 c3635) {
        Constructor constructor;
        Constructor constructorM6372;
        String str;
        Class cls2;
        Method method;
        boolean zM6340 = this.f8670.m6340(cls);
        int modifiers = cls.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            return super.mo6089(cls, type, z, c3635);
        }
        C9194 c9194 = new C9194(c3635);
        CopyOnWriteArrayList copyOnWriteArrayList = c3635.f9025;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            ((C3612) copyOnWriteArrayList.get(i)).f8845.m4715(cls, c9194);
        }
        if (zM6340 || !Modifier.isPublic(modifiers)) {
            c9194.f23445 |= 18014398509481984L;
        }
        Class cls3 = c9194.f23443;
        if (cls3 != null && InterfaceC3621.class.isAssignableFrom(cls3)) {
            try {
                Constructor declaredConstructor = c9194.f23443.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (InterfaceC3621) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                C1123.m1403("create deserializer error", e);
                return null;
            }
        }
        boolean z2 = (z && (cls.isInterface() || AbstractC3698.m6350(cls))) ? false : z;
        if (Enum.class.isAssignableFrom(cls) && ((method = c9194.f23452) == null || method.getParameterCount() == 1)) {
            return C3609.m6155(cls, c9194.f23452, c3635);
        }
        if (c9194.f23454 != null || c9194.f23452 != null) {
            return m6165(cls, type, c3635, c9194);
        }
        if (c9194.f23435 != null) {
            return m6171(cls, type, c3635, c9194);
        }
        if (Throwable.class.isAssignableFrom(cls) || AbstractC3698.m6360(cls)) {
            return super.mo6089(cls, type, z2, c3635);
        }
        if (cls == Class.class) {
            return C3552.f8628;
        }
        AbstractC3595[] abstractC3595ArrM6172 = m6172(cls, type, c9194, z2, c3635);
        boolean z3 = abstractC3595ArrM6172.length <= 96;
        if (!z2) {
            if (AbstractC3687.f9263 >= 9 && cls == StackTraceElement.class) {
                try {
                    return C3609.m6157(StackTraceElement.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE), "", "classLoaderName", "moduleName", "moduleVersion", "declaringClass", "methodName", "fileName", "lineNumber");
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            for (AbstractC3595 abstractC3595 : abstractC3595ArrM6172) {
                if (!abstractC3595.mo6045()) {
                    long j = abstractC3595.f8767;
                    if ((j & 562949953421312L) == 0 && (j & 2251799813685248L) == 0) {
                    }
                }
                z3 = false;
                break;
            }
        }
        if (c9194.f23428 != null) {
            z3 = false;
        }
        if (z3) {
            for (AbstractC3595 abstractC35952 : abstractC3595ArrM6172) {
                if (abstractC35952.f8760 != null || abstractC35952.f8758 != null || (((cls2 = abstractC35952.f8774) != null && !Modifier.isPublic(cls2.getModifiers())) || (((abstractC35952 instanceof C3518) && ((C3518) abstractC35952).f8503 != null) || ((abstractC35952 instanceof C3516) && ((C3516) abstractC35952).f8499 != null)))) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3 && (c9194.f23427 != null || ((str = c9194.f23441) != null && !str.isEmpty()))) {
            z3 = false;
        }
        if (!z3) {
            return super.mo6089(cls, type, z2, c3635);
        }
        if (Modifier.isInterface(modifiers) || Modifier.isAbstract(modifiers) || (constructorM6372 = AbstractC3698.m6372(cls, true)) == null) {
            constructor = null;
        } else {
            try {
                constructorM6372.setAccessible(true);
            } catch (SecurityException unused2) {
            }
            constructor = constructorM6372;
        }
        Class[] clsArr = c9194.f23432;
        if (clsArr == null || clsArr.length == 0) {
            return (z2 || constructor != null) ? m6079(cls, type, z2, zM6340, modifiers, c9194, null, abstractC3595ArrM6172, constructor) : super.mo6089(cls, type, false, c3635);
        }
        return new C3633(cls, c9194.f23437, null, JSONReader$Feature.SupportAutoType.mask, null, m6169(cls), null, clsArr, c9194.f23451, c9194.f23450, abstractC3595ArrM6172);
    }

    @Override // com.alibaba.fastjson2.reader.C3609
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3605 mo6090(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC3595... abstractC3595Arr) {
        if (cls == null && supplier != null && function == null) {
            for (AbstractC3595 abstractC3595 : abstractC3595Arr) {
                if (abstractC3595.mo6034() != null) {
                }
            }
            return m6079(cls, cls, false, false, 0, new C9194(AbstractC3766.m6947()), supplier, abstractC3595Arr, null);
        }
        return super.mo6090(cls, str, str2, j, jSONSchema, supplier, function, abstractC3595Arr);
    }
}
