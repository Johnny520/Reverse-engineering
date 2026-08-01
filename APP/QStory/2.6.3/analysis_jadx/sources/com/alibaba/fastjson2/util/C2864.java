package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.reader.AbstractC2762;
import com.alibaba.fastjson2.reader.C2671;
import com.alibaba.fastjson2.reader.C2672;
import com.alibaba.fastjson2.reader.C2673;
import com.alibaba.fastjson2.reader.C2674;
import com.alibaba.fastjson2.reader.C2675;
import com.alibaba.fastjson2.reader.C2676;
import com.alibaba.fastjson2.reader.C2678;
import com.alibaba.fastjson2.reader.C2772;
import com.alibaba.fastjson2.reader.C2785;
import com.alibaba.fastjson2.reader.C2786;
import com.alibaba.fastjson2.reader.C2787;
import com.alibaba.fastjson2.reader.C2789;
import com.alibaba.fastjson2.reader.C2790;
import com.alibaba.fastjson2.reader.InterfaceC2747;
import com.alibaba.fastjson2.reader.InterfaceC2748;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.ProtectionDomain;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p291.AbstractC8494;
import p291.C8513;
import p291.C8514;
import p291.C8515;
import p291.C8516;
import p291.C8517;
import p291.C8518;
import p291.C8524;
import p291.C8525;
import p291.C8526;
import p291.C8527;
import p291.C8528;
import p291.C8529;
import p291.C8530;
import p291.InterfaceC8523;
import p296.InterfaceC8581;
import p296.InterfaceC8582;
import p296.InterfaceC8583;
import p296.InterfaceC8586;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2864 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2864 f9008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f9009 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ProtectionDomain f9010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f9011;

    static {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                contextClassLoader.loadClass(C2864.class.getName());
            } catch (ClassNotFoundException unused) {
                contextClassLoader = C2864.class.getClassLoader();
            }
        } else {
            contextClassLoader = C2864.class.getClassLoader();
        }
        f9008 = new C2864(contextClassLoader);
        Class[] clsArr = {Object.class, Type.class, Field.class, Method.class, AbstractC2860.class, AbstractC2899.class, AbstractC2762.class, InterfaceC2788.class, C2676.class, C2675.class, C2671.class, C2672.class, C2786.class, C2785.class, C2785.class, C2789.class, C2790.class, C2787.class, C2678.class, C2674.class, C2673.class, C2772.class, AbstractC2897.class, C2895.class, AbstractC8494.class, InterfaceC8581.class, InterfaceC8582.class, InterfaceC8583.class, InterfaceC8586.class, InterfaceC8523.class, C8515.class, C8514.class, C8513.class, C8529.class, C8530.class, C8526.class, C8525.class, C8528.class, C8527.class, C8518.class, C8517.class, C8516.class, C8524.class, AbstractC2854.class, AbstractC2867.class, AbstractC2866.class, PropertyNamingStrategy.class, Collection.class, Set.class, List.class, ArrayList.class, LinkedList.class, Map.class, HashMap.class, LinkedHashMap.class, EnumSet.class, Optional.class, OptionalInt.class, OptionalLong.class, Date.class, Calendar.class, ConcurrentHashMap.class, Supplier.class, Consumer.class, Exception.class, Enum.class, Class.class, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, String.class, BigInteger.class, BigDecimal.class, Instant.class, LocalTime.class, LocalDate.class, LocalDateTime.class, ZonedDateTime.class, InterfaceC2747.class, InterfaceC2748.class};
        for (int i = 0; i < 84; i++) {
            Class cls = clsArr[i];
            f9009.put(cls.getName(), cls);
        }
        String[] strArr = {"sun.misc.Unsafe", "java.sql.Timestamp", "java.sql.Date"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                f9009.put(str, Class.forName(str));
            } catch (ClassNotFoundException unused2) {
            }
        }
        f9010 = (ProtectionDomain) AccessController.doPrivileged(new C2863());
    }

    public C2864(ClassLoader classLoader) {
        super(classLoader);
        this.f9011 = new ConcurrentHashMap();
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        Class cls = (Class) f9009.get(str);
        if (cls != null) {
            return cls;
        }
        Class cls2 = (Class) this.f9011.get(str);
        if (cls2 != null) {
            return cls2;
        }
        try {
            return super.loadClass(str, z);
        } catch (ClassNotFoundException e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null && contextClassLoader != this) {
                try {
                    return contextClassLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5780(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        for (?? parent = this; parent != 0; parent = parent.getParent()) {
            if (parent == classLoader) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class m5781(String str, int i, byte[] bArr) {
        return defineClass(str, bArr, 0, i, f9010);
    }
}
