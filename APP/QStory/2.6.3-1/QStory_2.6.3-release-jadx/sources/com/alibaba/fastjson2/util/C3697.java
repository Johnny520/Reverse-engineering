package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.reader.AbstractC3595;
import com.alibaba.fastjson2.reader.C3504;
import com.alibaba.fastjson2.reader.C3505;
import com.alibaba.fastjson2.reader.C3506;
import com.alibaba.fastjson2.reader.C3507;
import com.alibaba.fastjson2.reader.C3508;
import com.alibaba.fastjson2.reader.C3509;
import com.alibaba.fastjson2.reader.C3511;
import com.alibaba.fastjson2.reader.C3605;
import com.alibaba.fastjson2.reader.C3618;
import com.alibaba.fastjson2.reader.C3619;
import com.alibaba.fastjson2.reader.C3620;
import com.alibaba.fastjson2.reader.C3622;
import com.alibaba.fastjson2.reader.C3623;
import com.alibaba.fastjson2.reader.InterfaceC3580;
import com.alibaba.fastjson2.reader.InterfaceC3581;
import com.alibaba.fastjson2.reader.InterfaceC3621;
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
import p307.AbstractC9323;
import p307.C9342;
import p307.C9343;
import p307.C9344;
import p307.C9345;
import p307.C9346;
import p307.C9347;
import p307.C9353;
import p307.C9354;
import p307.C9355;
import p307.C9356;
import p307.C9357;
import p307.C9358;
import p307.C9359;
import p307.InterfaceC9352;
import p312.InterfaceC9410;
import p312.InterfaceC9411;
import p312.InterfaceC9412;
import p312.InterfaceC9415;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3697 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3697 f9353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f9354 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ProtectionDomain f9355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f9356;

    static {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                contextClassLoader.loadClass(C3697.class.getName());
            } catch (ClassNotFoundException unused) {
                contextClassLoader = C3697.class.getClassLoader();
            }
        } else {
            contextClassLoader = C3697.class.getClassLoader();
        }
        f9353 = new C3697(contextClassLoader);
        Class[] clsArr = {Object.class, Type.class, Field.class, Method.class, AbstractC3693.class, AbstractC3732.class, AbstractC3595.class, InterfaceC3621.class, C3509.class, C3508.class, C3504.class, C3505.class, C3619.class, C3618.class, C3618.class, C3622.class, C3623.class, C3620.class, C3511.class, C3507.class, C3506.class, C3605.class, AbstractC3730.class, C3728.class, AbstractC9323.class, InterfaceC9410.class, InterfaceC9411.class, InterfaceC9412.class, InterfaceC9415.class, InterfaceC9352.class, C9344.class, C9343.class, C9342.class, C9358.class, C9359.class, C9355.class, C9354.class, C9357.class, C9356.class, C9347.class, C9346.class, C9345.class, C9353.class, AbstractC3687.class, AbstractC3700.class, AbstractC3699.class, PropertyNamingStrategy.class, Collection.class, Set.class, List.class, ArrayList.class, LinkedList.class, Map.class, HashMap.class, LinkedHashMap.class, EnumSet.class, Optional.class, OptionalInt.class, OptionalLong.class, Date.class, Calendar.class, ConcurrentHashMap.class, Supplier.class, Consumer.class, Exception.class, Enum.class, Class.class, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, String.class, BigInteger.class, BigDecimal.class, Instant.class, LocalTime.class, LocalDate.class, LocalDateTime.class, ZonedDateTime.class, InterfaceC3580.class, InterfaceC3581.class};
        for (int i = 0; i < 84; i++) {
            Class cls = clsArr[i];
            f9354.put(cls.getName(), cls);
        }
        String[] strArr = {"sun.misc.Unsafe", "java.sql.Timestamp", "java.sql.Date"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            try {
                f9354.put(str, Class.forName(str));
            } catch (ClassNotFoundException unused2) {
            }
        }
        f9355 = (ProtectionDomain) AccessController.doPrivileged(new C3696());
    }

    public C3697(ClassLoader classLoader) {
        super(classLoader);
        this.f9356 = new ConcurrentHashMap();
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        Class cls = (Class) f9354.get(str);
        if (cls != null) {
            return cls;
        }
        Class cls2 = (Class) this.f9356.get(str);
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
    public final boolean m6340(Class cls) {
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
    public final Class m6341(String str, int i, byte[] bArr) {
        return defineClass(str, bArr, 0, i, f9355);
    }
}
