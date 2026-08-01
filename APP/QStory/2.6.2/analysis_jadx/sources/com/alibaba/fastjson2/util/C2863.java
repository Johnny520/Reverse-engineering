package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.reader.AbstractC2761;
import com.alibaba.fastjson2.reader.C2670;
import com.alibaba.fastjson2.reader.C2671;
import com.alibaba.fastjson2.reader.C2672;
import com.alibaba.fastjson2.reader.C2673;
import com.alibaba.fastjson2.reader.C2674;
import com.alibaba.fastjson2.reader.C2675;
import com.alibaba.fastjson2.reader.C2677;
import com.alibaba.fastjson2.reader.C2771;
import com.alibaba.fastjson2.reader.C2784;
import com.alibaba.fastjson2.reader.C2785;
import com.alibaba.fastjson2.reader.C2786;
import com.alibaba.fastjson2.reader.C2788;
import com.alibaba.fastjson2.reader.C2789;
import com.alibaba.fastjson2.reader.InterfaceC2746;
import com.alibaba.fastjson2.reader.InterfaceC2747;
import com.alibaba.fastjson2.reader.InterfaceC2787;
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
import p291.AbstractC8502;
import p291.C8521;
import p291.C8522;
import p291.C8523;
import p291.C8524;
import p291.C8525;
import p291.C8526;
import p291.C8532;
import p291.C8533;
import p291.C8534;
import p291.C8535;
import p291.C8536;
import p291.C8537;
import p291.C8538;
import p291.InterfaceC8531;
import p296.InterfaceC8589;
import p296.InterfaceC8590;
import p296.InterfaceC8591;
import p296.InterfaceC8594;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2863 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2863 f9006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f9007 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ProtectionDomain f9008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f9009;

    static {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                contextClassLoader.loadClass(C2863.class.getName());
            } catch (ClassNotFoundException unused) {
                contextClassLoader = C2863.class.getClassLoader();
            }
        } else {
            contextClassLoader = C2863.class.getClassLoader();
        }
        f9006 = new C2863(contextClassLoader);
        Class[] clsArr = {Object.class, Type.class, Field.class, Method.class, AbstractC2859.class, AbstractC2898.class, AbstractC2761.class, InterfaceC2787.class, C2675.class, C2674.class, C2670.class, C2671.class, C2785.class, C2784.class, C2784.class, C2788.class, C2789.class, C2786.class, C2677.class, C2673.class, C2672.class, C2771.class, AbstractC2896.class, C2894.class, AbstractC8502.class, InterfaceC8589.class, InterfaceC8590.class, InterfaceC8591.class, InterfaceC8594.class, InterfaceC8531.class, C8523.class, C8522.class, C8521.class, C8537.class, C8538.class, C8534.class, C8533.class, C8536.class, C8535.class, C8526.class, C8525.class, C8524.class, C8532.class, AbstractC2853.class, AbstractC2866.class, AbstractC2865.class, PropertyNamingStrategy.class, Collection.class, Set.class, List.class, ArrayList.class, LinkedList.class, Map.class, HashMap.class, LinkedHashMap.class, EnumSet.class, Optional.class, OptionalInt.class, OptionalLong.class, Date.class, Calendar.class, ConcurrentHashMap.class, Supplier.class, Consumer.class, Exception.class, Enum.class, Class.class, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, String.class, BigInteger.class, BigDecimal.class, Instant.class, LocalTime.class, LocalDate.class, LocalDateTime.class, ZonedDateTime.class, InterfaceC2746.class, InterfaceC2747.class};
        for (int i = 0; i < 84; i++) {
            Class cls = clsArr[i];
            f9007.put(cls.getName(), cls);
        }
        String[] strArr = {"sun.misc.Unsafe", "java.sql.Timestamp", "java.sql.Date"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                f9007.put(str, Class.forName(str));
            } catch (ClassNotFoundException unused2) {
            }
        }
        f9008 = (ProtectionDomain) AccessController.doPrivileged(new C2862());
    }

    public C2863(ClassLoader classLoader) {
        super(classLoader);
        this.f9009 = new ConcurrentHashMap();
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        Class cls = (Class) f9007.get(str);
        if (cls != null) {
            return cls;
        }
        Class cls2 = (Class) this.f9009.get(str);
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
    public final boolean m5735(Class cls) {
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
    public final Class m5736(String str, int i, byte[] bArr) {
        return defineClass(str, bArr, 0, i, f9008);
    }
}
