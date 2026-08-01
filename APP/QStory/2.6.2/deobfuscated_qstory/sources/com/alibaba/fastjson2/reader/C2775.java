package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.bytebuddy.description.method.ParameterDescription;
import p007.AbstractC6136;
import p278.C8362;
import p278.C8364;
import p295.InterfaceC8580;
import p295.InterfaceC8581;
import p295.InterfaceC8582;
import p295.InterfaceC8583;
import p295.InterfaceC8584;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2775 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f8473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2775 f8474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f8475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f8476 = new AtomicInteger();

    static {
        f8475 = (AbstractC2853.f8927 || AbstractC2853.f8926) ? false : true;
        f8474 = new C2775();
        HashMap map = new HashMap();
        f8473 = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new C2772(cls, InterfaceC8584.class));
        Class cls2 = Byte.TYPE;
        map.put(cls2, new C2772(cls2, InterfaceC8583.class));
        Class cls3 = Short.TYPE;
        map.put(cls3, new C2772(cls3, InterfaceC8580.class));
        Class cls4 = Integer.TYPE;
        map.put(cls4, new C2772(cls4, ObjIntConsumer.class));
        Class cls5 = Long.TYPE;
        map.put(cls5, new C2772(cls5, ObjLongConsumer.class));
        Class cls6 = Character.TYPE;
        map.put(cls6, new C2772(cls6, InterfaceC8582.class));
        Class cls7 = Float.TYPE;
        map.put(cls7, new C2772(cls7, InterfaceC8581.class));
        Class cls8 = Double.TYPE;
        map.put(cls8, new C2772(cls8, ObjDoubleConsumer.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static AbstractC2761[] m5543(LinkedHashMap linkedHashMap) {
        AbstractC2761[] abstractC2761Arr = new AbstractC2761[linkedHashMap.values().stream().mapToInt(new C2773(0)).sum()];
        ((List) linkedHashMap.values().stream().flatMap(new C2768(4)).collect(Collectors.toList())).toArray(abstractC2761Arr);
        Arrays.sort(abstractC2761Arr);
        return abstractC2761Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5544(java.util.LinkedHashMap r5, java.lang.String r6, com.alibaba.fastjson2.reader.AbstractC2761 r7, java.lang.Class r8) {
        /*
            java.lang.Object r0 = r5.get(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L14
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r7)
            r5.put(r6, r8)
            return
        L14:
            boolean r5 = r7.mo5440()
            java.lang.reflect.Method r6 = r7.f8425
            java.lang.reflect.Field r1 = r7.f8422
            if (r5 != 0) goto La3
            r5 = 0
        L1f:
            int r2 = r0.size()
            if (r5 >= r2) goto L76
            java.lang.Object r2 = r0.get(r5)
            com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰 r2 = (com.alibaba.fastjson2.reader.AbstractC2761) r2
            java.lang.reflect.Field r3 = r2.f8422
            if (r3 == 0) goto L4d
            java.lang.String r3 = r3.getName()
            if (r1 == 0) goto L40
            java.lang.String r4 = r1.getName()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L40
            goto L77
        L40:
            if (r6 == 0) goto L4d
            java.lang.String r4 = com.alibaba.fastjson2.reader.AbstractC2761.m5525(r7)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4d
            goto L77
        L4d:
            java.lang.reflect.Method r3 = r2.f8425
            if (r3 == 0) goto L73
            java.lang.String r3 = com.alibaba.fastjson2.reader.AbstractC2761.m5525(r2)
            if (r6 == 0) goto L64
            java.lang.String r4 = com.alibaba.fastjson2.reader.AbstractC2761.m5525(r7)
            if (r3 == 0) goto L64
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L64
            goto L77
        L64:
            if (r1 == 0) goto L73
            if (r3 == 0) goto L73
            java.lang.String r4 = r1.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L73
            goto L77
        L73:
            int r5 = r5 + 1
            goto L1f
        L76:
            r2 = 0
        L77:
            if (r2 == 0) goto La0
            int r5 = r2.compareTo(r7)
            if (r5 > 0) goto L98
            java.lang.reflect.Field r5 = r2.f8422
            if (r5 == 0) goto L89
            java.lang.Class r5 = r5.getDeclaringClass()
            if (r5 == r8) goto La3
        L89:
            java.lang.reflect.Method r5 = r2.f8425
            if (r5 == 0) goto L98
            java.lang.Class r5 = r5.getDeclaringClass()
            boolean r5 = r5.isAssignableFrom(r8)
            if (r5 == 0) goto L98
            goto La3
        L98:
            int r5 = r0.indexOf(r2)
            r0.set(r5, r7)
            return
        La0:
            r0.add(r7)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5544(java.util.LinkedHashMap, java.lang.String, com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, java.lang.Class):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m5545(java.lang.Class r7, java.lang.reflect.Method r8, java.lang.Class r9) {
        /*
            java.lang.invoke.MethodHandles$Lookup r0 = com.alibaba.fastjson2.util.AbstractC2853.m5723(r7)
            java.lang.Class r1 = r8.getReturnType()
            java.util.HashMap r2 = com.alibaba.fastjson2.reader.C2775.f8473
            java.lang.Object r2 = r2.get(r9)
            com.alibaba.fastjson2.reader.飘花落叶言子苏兰世哲楪 r2 = (com.alibaba.fastjson2.reader.C2772) r2
            java.lang.Class r3 = java.lang.Void.TYPE
            r6 = 0
            if (r2 == 0) goto L20
            java.lang.invoke.MethodType r4 = r2.f8469
            java.lang.invoke.MethodType r5 = r2.f8467
            if (r1 != r3) goto L1e
            java.lang.invoke.MethodType r2 = r2.f8468
            goto L25
        L1e:
            r2 = r6
            goto L25
        L20:
            java.lang.invoke.MethodType r4 = com.alibaba.fastjson2.util.AbstractC2866.f9060
            java.lang.invoke.MethodType r5 = com.alibaba.fastjson2.util.AbstractC2866.f9056
            goto L1e
        L25:
            if (r2 != 0) goto L2b
            java.lang.invoke.MethodType r2 = java.lang.invoke.MethodType.methodType(r1, r9)
        L2b:
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.invoke.MethodHandle r8 = r0.findVirtual(r7, r8, r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L4f
            java.lang.invoke.MethodType r7 = java.lang.invoke.MethodType.methodType(r3, r7, r9)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "accept"
            r3 = r4
            r2 = r5
            r5 = r7
            r4 = r8
            java.lang.invoke.CallSite r7 = java.lang.invoke.LambdaMetafactory.metafactory(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.invoke.MethodHandle r7 = r7.getTarget()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r7 = (java.lang.Object) r7.invoke()     // Catch: java.lang.Throwable -> L4f
            return r7
        L4f:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "create fieldReader error"
            androidx.collection.C0276.m842(r8, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5545(java.lang.Class, java.lang.reflect.Method, java.lang.Class):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.InterfaceC2787 m5546(com.alibaba.fastjson2.reader.C2801 r6, java.lang.reflect.Type r7, java.lang.Class r8, p278.C8362 r9) {
        /*
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r0 = r9.m13849()
            if (r0 != 0) goto L56
            java.lang.Class r1 = r9.f23065
            if (r1 != 0) goto Le
            java.lang.Class r1 = r9.f23066
            if (r1 == 0) goto L56
        Le:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L56
            java.lang.Class r1 = r9.f23065
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L2a
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L2a
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r1 = (com.alibaba.fastjson2.reader.InterfaceC2787) r1     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            java.lang.Class r4 = r9.f23066
            if (r4 == 0) goto L3d
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L3d
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r2 = r4.newInstance(r3)     // Catch: java.lang.Exception -> L3d
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r2 = (com.alibaba.fastjson2.reader.InterfaceC2787) r2     // Catch: java.lang.Exception -> L3d
            r3 = r2
        L3d:
            if (r1 != 0) goto L41
            if (r3 == 0) goto L56
        L41:
            long r4 = r9.f23046
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r7 = com.alibaba.fastjson2.reader.C2713.m5463(r7, r8, r4)
            boolean r9 = r7 instanceof com.alibaba.fastjson2.reader.C2714
            if (r9 == 0) goto L56
            com.alibaba.fastjson2.reader.飘花落叶言子兰苏哲世楪 r7 = (com.alibaba.fastjson2.reader.C2714) r7
            if (r1 == 0) goto L51
            r7.f8274 = r1
        L51:
            if (r3 == 0) goto L55
            r7.f8273 = r3
        L55:
            return r7
        L56:
            if (r0 != 0) goto L93
            java.lang.Class r7 = java.lang.Long.TYPE
            r9 = 0
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r8 == r7) goto L8a
            if (r8 != r1) goto L62
            goto L8a
        L62:
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            if (r8 != r7) goto L6f
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5588(r7, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子哲楪兰世苏 r7 = com.alibaba.fastjson2.reader.C2732.f8338
            if (r6 == r7) goto L93
            goto L88
        L6f:
            java.lang.Class<java.math.BigInteger> r7 = java.math.BigInteger.class
            if (r8 != r7) goto L7c
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5588(r7, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪苏世 r7 = com.alibaba.fastjson2.reader.C2703.f8205
            if (r6 == r7) goto L93
            goto L88
        L7c:
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            if (r8 != r7) goto L93
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5588(r7, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子哲苏楪世兰 r7 = com.alibaba.fastjson2.reader.C2740.f8376
            if (r6 == r7) goto L93
        L88:
            r0 = r6
            goto L93
        L8a:
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5588(r1, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪苏世 r7 = com.alibaba.fastjson2.reader.C2703.f8219
            if (r6 == r7) goto L93
            goto L88
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5546(com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, java.lang.reflect.Type, java.lang.Class, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m5547(Class cls, Type type, String str, String[] strArr, C8362 c8362, Field field, LinkedHashMap linkedHashMap, C2801 c2801) {
        String strM5781;
        String[] strArr2;
        int i;
        int i2;
        String str2;
        c2801.m5577(c8362, cls, field);
        if (!c8362.f23045 || ((c8362.f23046 & 562949953421312L) != 0 && Map.class.isAssignableFrom(field.getType()))) {
            String str3 = c8362.f23050;
            if (str3 == null || str3.isEmpty()) {
                String name = field.getName();
                strM5781 = str != null ? AbstractC2864.m5781(name, str) : name;
            } else {
                strM5781 = c8362.f23050;
            }
            if (strArr != null && strArr.length > 0) {
                int i3 = 0;
                while (true) {
                    if (i3 < strArr.length) {
                        if (strM5781.equals(strArr[i3])) {
                            c8362.f23047 = i3;
                            break;
                        }
                        i3++;
                    } else if (c8362.f23047 == 0) {
                        c8362.f23047 = strArr.length;
                    }
                }
            }
            Type genericType = field.getGenericType();
            Class<?> type2 = field.getType();
            InterfaceC2787 interfaceC2787M5546 = m5546(c2801, genericType, type2, c8362);
            String str4 = c8362.f23058;
            if (c8362.f23052 && str4 == null) {
                str4 = "{\"required\":true}";
            }
            String str5 = str4;
            String str6 = strM5781;
            String str7 = str6;
            m5544(linkedHashMap, str7, m5549(cls, type, str6, c8362.f23047, c8362.f23046, c8362.f23049, c8362.f23057, c8362.f23060, str5, genericType, type2, field, interfaceC2787M5546, c8362.f23051, c8362.m13850()), cls);
            C8362 c83622 = c8362;
            String[] strArr3 = c83622.f23062;
            if (strArr3 != null) {
                int length = strArr3.length;
                int i4 = 0;
                while (i4 < length) {
                    String str8 = strArr3[i4];
                    if (str7.equals(str8)) {
                        str2 = str7;
                        strArr2 = strArr3;
                        i = length;
                        i2 = i4;
                    } else {
                        strArr2 = strArr3;
                        i = length;
                        i2 = i4;
                        str2 = str7;
                        m5544(linkedHashMap, str8, m5549(cls, type, str8, 0, c83622.f23046, null, c83622.f23057, c83622.f23060, str5, genericType, field.getType(), field, null, null, null), cls);
                    }
                    i4 = i2 + 1;
                    c83622 = c8362;
                    str7 = str2;
                    strArr3 = strArr2;
                    length = i;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.AbstractC2761 m5548(java.lang.Class r17, java.lang.reflect.Type r18, java.lang.String r19, java.lang.reflect.Type r20, java.lang.Class r21, int r22, long r23, java.lang.String r25, java.util.Locale r26, java.lang.Object r27, com.alibaba.fastjson2.schema.JSONSchema r28, java.lang.reflect.Method r29, java.util.function.BiConsumer r30, com.alibaba.fastjson2.reader.InterfaceC2787 r31) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5548(java.lang.Class, java.lang.reflect.Type, java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Method, java.util.function.BiConsumer, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.AbstractC2761 m5549(java.lang.Class r16, java.lang.reflect.Type r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.util.Locale r23, java.lang.Object r24, java.lang.String r25, java.lang.reflect.Type r26, java.lang.Class r27, java.lang.reflect.Field r28, com.alibaba.fastjson2.reader.InterfaceC2787 r29, java.lang.String r30, java.util.function.BiConsumer r31) {
        /*
            Method dump skipped, instruction units count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5549(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Field, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世, java.lang.String, java.util.function.BiConsumer):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2736 m5550(Class cls, Method method, C2801 c2801) throws NoSuchMethodException {
        Class clsMo5581;
        C8362 c8362 = new C8362();
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; enumArr != null && i < enumArr.length; i++) {
            Enum r4 = enumArr[i];
            String strName = r4.name();
            linkedHashMap.put(Long.valueOf(AbstractC2859.m5729(strName)), r4);
            try {
                c8362.m13848();
                c2801.m5577(c8362, cls, cls.getField(strName));
                String str = c8362.f23050;
                if (str != null && !str.isEmpty() && !str.equals(strName)) {
                    linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2859.m5729(str)), r4);
                }
                String[] strArr = c8362.f23062;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2 != null && !str2.isEmpty()) {
                            linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2859.m5729(str2)), r4);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (int i2 = 0; enumArr != null && i2 < enumArr.length; i2++) {
            Enum r3 = enumArr[i2];
            String strName2 = r3.name();
            linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2859.m5728(strName2)), r3);
            String string = r3.toString();
            if (!strName2.equals(string)) {
                linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2859.m5728(string)), r3);
            }
        }
        int size = linkedHashMap.size();
        long[] jArr = new long[size];
        Iterator it = linkedHashMap.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        Arrays.sort(jArr);
        Member memberM5772 = AbstractC2864.m5772(cls, c2801);
        if (memberM5772 == null && c2801.f8678.size() > 0 && (clsMo5581 = c2801.mo5581(cls)) != null) {
            Member memberM57722 = AbstractC2864.m5772(clsMo5581, c2801);
            if (memberM57722 instanceof Field) {
                try {
                    memberM5772 = cls.getField(((Field) memberM57722).getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused2) {
                }
            } else if (memberM57722 instanceof Method) {
                memberM5772 = cls.getMethod(((Method) memberM57722).getName(), null);
            }
        }
        Member member = memberM5772;
        Enum[] enumArr2 = new Enum[size];
        for (int i4 = 0; i4 < size; i4++) {
            enumArr2[i4] = (Enum) linkedHashMap.get(Long.valueOf(jArr[i4]));
        }
        return new C2736(cls, method, member, enumArr2, enumArr, jArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Function m5551(Method method) {
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(method.getDeclaringClass());
        try {
            MethodHandle methodHandleFindVirtual = lookupM5723.findVirtual(method.getDeclaringClass(), method.getName(), MethodType.methodType(method.getReturnType()));
            MethodType methodTypeType = methodHandleFindVirtual.type();
            return (Function) (Object) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9062, methodTypeType.erase(), methodHandleFindVirtual, methodTypeType).getTarget().invoke();
        } catch (Throwable th) {
            C0276.m842("create fieldReader error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C2797 m5552(Constructor constructor, String... strArr) {
        constructor.setAccessible(true);
        C2745 c2745 = new C2745(null, constructor, null, null, null, strArr);
        Class declaringClass = constructor.getDeclaringClass();
        return new C2797(declaringClass, null, null, 0L, c2745, m5556(AbstractC2932.m6329(), declaringClass, declaringClass, constructor, constructor.getParameters(), strArr), null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.AbstractC2761 m5553(java.lang.Class r19, java.lang.reflect.Type r20, java.lang.String r21, int r22, long r23, java.lang.String r25, java.util.Locale r26, java.lang.Object r27, java.lang.String r28, java.lang.reflect.Type r29, java.lang.Class r30, java.lang.reflect.Method r31, com.alibaba.fastjson2.reader.InterfaceC2787 r32, java.lang.String r33, java.util.function.BiConsumer r34) {
        /*
            Method dump skipped, instruction units count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5553(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世, java.lang.String, java.util.function.BiConsumer):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.AbstractC2761 m5554(java.lang.Class r15, java.lang.reflect.Type r16, java.lang.String r17, int r18, long r19, java.lang.String r21, java.util.Locale r22, java.lang.Object r23, java.lang.String r24, java.lang.reflect.Type r25, java.lang.Class r26, java.lang.reflect.Method r27, com.alibaba.fastjson2.reader.InterfaceC2787 r28) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5554(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.C2691 m5555(java.lang.Class r17, java.lang.reflect.Type r18, java.lang.String r19, int r20, long r21, java.lang.String r23, java.util.Locale r24, java.lang.String r25, java.lang.reflect.Type r26, java.lang.Class r27, java.lang.String r28, java.lang.Class r29, com.alibaba.fastjson2.reader.InterfaceC2787 r30) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5555(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.String, java.lang.Class, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):com.alibaba.fastjson2.reader.飘花落叶言子世苏哲楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC2761[] m5556(C2801 c2801, Class cls, Type type, Constructor constructor, Parameter[] parameterArr, String... strArr) {
        Class<?> cls2;
        String str;
        int i;
        int i2;
        Field fieldM5768;
        Class<?> declaringClass = constructor != null ? constructor.getDeclaringClass() : null;
        ArrayList arrayList = new ArrayList(parameterArr.length);
        int i3 = 0;
        int i4 = 0;
        while (i4 < parameterArr.length) {
            C8362 c8362 = new C8362();
            Parameter parameter = parameterArr[i4];
            String name = i4 < strArr.length ? strArr[i4] : parameter.getName();
            if (constructor != null) {
                cls2 = declaringClass;
                c2801.m5578(c8362, cls2, constructor, i4, parameter);
            } else {
                cls2 = declaringClass;
            }
            if (constructor != null && (fieldM5768 = AbstractC2864.m5768(cls2, name)) != null) {
                c2801.m5577(c8362, cls2, fieldM5768);
            }
            String str2 = c8362.f23050;
            String strM11556 = (str2 == null || str2.isEmpty()) ? name : c8362.f23050;
            if (strM11556 == null) {
                strM11556 = AbstractC6136.m11556(i4, ParameterDescription.NAME_PREFIX);
            }
            if (name == null) {
                name = AbstractC6136.m11556(i4, ParameterDescription.NAME_PREFIX);
            }
            String str3 = name;
            InterfaceC2787 interfaceC2787M5546 = m5546(c2801, parameter.getParameterizedType(), parameter.getType(), c8362);
            Type parameterizedType = parameter.getParameterizedType();
            Type[] typeArr = AbstractC2864.f9015;
            Type typeM5739 = AbstractC2864.m5739(type, cls, parameterizedType, new HashMap());
            Type type2 = typeM5739 != null ? typeM5739 : parameterizedType;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            String str4 = strM11556;
            declaringClass = cls2;
            String str5 = str4;
            arrayList2.add(m5555(null, null, str4, i4, c8362.f23046, c8362.f23049, c8362.f23057, c8362.f23060, type2, parameter.getType(), str3, declaringClass, interfaceC2787M5546));
            String[] strArr2 = c8362.f23062;
            if (strArr2 != null) {
                int length = strArr2.length;
                int i6 = i5;
                while (i6 < length) {
                    int i7 = i6;
                    String str6 = strArr2[i7];
                    if (str5.equals(str6)) {
                        str = str5;
                        i = length;
                        i2 = i7;
                    } else {
                        str = str5;
                        i = length;
                        i2 = i7;
                        arrayList2.add(m5555(null, null, str6, i4, c8362.f23046, c8362.f23049, c8362.f23057, c8362.f23060, type2, parameter.getType(), str3, declaringClass, interfaceC2787M5546));
                    }
                    i6 = i2 + 1;
                    str5 = str;
                    length = i;
                }
            }
            i4++;
            arrayList = arrayList2;
            i3 = 0;
        }
        return (AbstractC2761[]) arrayList.toArray(new AbstractC2761[i3]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Function m5557(Method method, Class cls) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) cls);
            return (Function) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9062, AbstractC2866.f9058, lookupM5723.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8476.incrementAndGet();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5558(java.lang.Class r22, java.lang.reflect.Type r23, java.lang.String r24, java.lang.String[] r25, p278.C8364 r26, p278.C8362 r27, java.lang.reflect.Method r28, java.util.LinkedHashMap r29, com.alibaba.fastjson2.reader.C2801 r30) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5558(java.lang.Class, java.lang.reflect.Type, java.lang.String, java.lang.String[], 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰, java.lang.reflect.Method, java.util.LinkedHashMap, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Function m5559(Constructor constructor) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9062, AbstractC2866.f9058, lookupM5723.findConstructor(declaringClass, AbstractC2866.f9037), MethodType.methodType(declaringClass, (Class<?>) String.class)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8476.incrementAndGet();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.alibaba.fastjson2.schema.JSONSchema] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.function.Function] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.reader.InterfaceC2787 m5560(java.lang.Class r28, java.lang.reflect.Type r29, com.alibaba.fastjson2.reader.C2801 r30, p278.C8364 r31) {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5560(java.lang.Class, java.lang.reflect.Type, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Supplier m5561(Constructor constructor, boolean z) {
        if (z & f8475) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            try {
                if (constructor.getParameterCount() == 0) {
                    MethodHandle methodHandleFindConstructor = lookupM5723.findConstructor(declaringClass, AbstractC2866.f9052);
                    MethodType methodType = AbstractC2866.f9063;
                    MethodType methodType2 = AbstractC2866.f9061;
                    return (Supplier) LambdaMetafactory.metafactory(lookupM5723, "get", methodType, methodType2, methodHandleFindConstructor, methodType2).getTarget().invokeExact();
                }
            } catch (Throwable unused) {
                this.f8476.incrementAndGet();
            }
        }
        return new C2744(constructor);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Function m5562(Constructor constructor, Class cls) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9062, AbstractC2866.f9058, lookupM5723.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, (Class<?>) cls)), MethodType.methodType(declaringClass, (Class<?>) cls)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8476.incrementAndGet();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Function m5563(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) String.class);
            return (Function) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9062, AbstractC2866.f9058, lookupM5723.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8476.incrementAndGet();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Supplier m5564(Class cls) {
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return m5561(declaredConstructor, true);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            C0276.m842("get constructor error, class ".concat(cls.getName()), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C2797 mo5483(Class cls, C8364 c8364, Function function, ArrayList arrayList, String[] strArr, AbstractC2761[] abstractC2761Arr, AbstractC2761[] abstractC2761Arr2) {
        return new C2797(cls, c8364.f23093, c8364.f23092, c8364.f23101, function, abstractC2761Arr, abstractC2761Arr2, c8364.f23088, c8364.f23107);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final IntFunction m5565(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) Integer.TYPE);
            return (IntFunction) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9064, AbstractC2866.f9036, lookupM5723.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8476.incrementAndGet();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.reader.InterfaceC2787 m5566(final java.lang.Class r14, final java.lang.reflect.Type r15, final com.alibaba.fastjson2.reader.C2801 r16, final p278.C8364 r17) {
        /*
            r13 = this;
            r7 = r17
            java.lang.reflect.Method r0 = r7.f23090
            r11 = 1
            if (r0 == 0) goto L1d
            java.util.function.Function r0 = m5551(r0)     // Catch: java.lang.Throwable -> Lc
            goto L1b
        Lc:
            java.util.concurrent.atomic.AtomicInteger r1 = r13.f8476
            r1.incrementAndGet()
            r0.setAccessible(r11)
            bsh.飘花落叶言子苏楪哲世兰 r1 = new bsh.飘花落叶言子苏楪哲世兰
            r2 = 3
            r1.<init>(r0, r2)
            r0 = r1
        L1b:
            r12 = r0
            goto L1f
        L1d:
            r0 = 0
            goto L1b
        L1f:
            java.lang.Class r2 = r7.f23091
            java.lang.String r0 = r7.f23089
            if (r0 == 0) goto L2e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2c
            goto L2e
        L2c:
            r5 = r0
            goto L31
        L2e:
            java.lang.String r0 = "with"
            goto L2c
        L31:
            int r8 = r5.length()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r6 = r2
            飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰 r2 = new 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰
            r2.<init>()
            com.alibaba.fastjson2.reader.飘花落叶言子苏兰楪哲世 r0 = new com.alibaba.fastjson2.reader.飘花落叶言子苏兰楪哲世
            r1 = r13
            r4 = r14
            r10 = r15
            r3 = r16
            r0.<init>(r1)
            boolean r14 = com.alibaba.fastjson2.util.AbstractC2864.m5756(r6)
            if (r14 == 0) goto L51
            goto Lb0
        L51:
            java.util.concurrent.ConcurrentHashMap r14 = com.alibaba.fastjson2.util.AbstractC2864.f9011
            java.lang.Object r15 = r14.get(r6)
            java.lang.reflect.Method[] r15 = (java.lang.reflect.Method[]) r15
            if (r15 != 0) goto L62
            java.lang.reflect.Method[] r15 = com.alibaba.fastjson2.util.AbstractC2864.m5751(r6)
            r14.putIfAbsent(r6, r15)
        L62:
            int r14 = r15.length
            r2 = 0
        L64:
            if (r2 >= r14) goto Lb0
            r3 = r15[r2]
            int r4 = r3.getParameterCount()
            if (r4 != 0) goto L95
            r3.getName()
            java.lang.Class r5 = r3.getReturnType()
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r7 = java.util.concurrent.atomic.AtomicInteger.class
            if (r5 == r7) goto L91
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r7 = java.util.concurrent.atomic.AtomicLong.class
            if (r5 == r7) goto L91
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r7 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r5 == r7) goto L91
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r7 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r5 == r7) goto L91
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r7 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r5 == r7) goto L91
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            boolean r5 = r7.isAssignableFrom(r5)
            if (r5 == 0) goto L95
        L91:
            r0.accept(r3)
            goto Lad
        L95:
            if (r4 == r11) goto L98
            goto Lad
        L98:
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto La3
            goto Lad
        La3:
            java.lang.String r4 = r3.getName()
            r4.getClass()
            r0.accept(r3)
        Lad:
            int r2 = r2 + 1
            goto L64
        Lb0:
            java.util.function.Supplier r8 = r13.m5564(r6)
            com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰[] r10 = m5543(r9)
            r7 = 0
            r4 = 0
            r3 = 0
            r2 = r6
            r5 = 0
            r1 = r13
            r9 = r12
            com.alibaba.fastjson2.reader.飘花落叶言子苏世楪哲兰 r13 = r1.mo5485(r2, r3, r4, r5, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5566(java.lang.Class, java.lang.reflect.Type, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f6  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.alibaba.fastjson2.schema.JSONSchema] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Class[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.function.BiFunction] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alibaba.fastjson2.reader.InterfaceC2787 mo5484(java.lang.Class r30, java.lang.reflect.Type r31, boolean r32, com.alibaba.fastjson2.reader.C2801 r33) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.mo5484(java.lang.Class, java.lang.reflect.Type, boolean, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public C2771 mo5485(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761... abstractC2761Arr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new C2771(cls, str, null, j, jSONSchema, supplier, function, abstractC2761Arr);
            }
        }
        if (str2 != null) {
            return new C2798(cls, str, str2, j, jSONSchema, supplier, function, abstractC2761Arr);
        }
        switch (abstractC2761Arr.length) {
            case 1:
                return new C2675(cls, j, jSONSchema, supplier, function, abstractC2761Arr[0]);
            case 2:
                return new C2674(cls, j, jSONSchema, supplier, function, abstractC2761Arr[0], abstractC2761Arr[1]);
            case 3:
                return new C2670(cls, supplier, j, jSONSchema, function, abstractC2761Arr[0], abstractC2761Arr[1], abstractC2761Arr[2]);
            case 4:
                return new C2671(cls, j, jSONSchema, supplier, function, abstractC2761Arr[0], abstractC2761Arr[1], abstractC2761Arr[2], abstractC2761Arr[3]);
            case 5:
                return new C2785(cls, supplier, j, jSONSchema, function, abstractC2761Arr[0], abstractC2761Arr[1], abstractC2761Arr[2], abstractC2761Arr[3], abstractC2761Arr[4]);
            case 6:
                return new C2784(cls, supplier, j, jSONSchema, function, abstractC2761Arr[0], abstractC2761Arr[1], abstractC2761Arr[2], abstractC2761Arr[3], abstractC2761Arr[4], abstractC2761Arr[5]);
            case 7:
                return new C2788(cls, j, jSONSchema, supplier, function, abstractC2761Arr);
            case 8:
                return new C2789(cls, j, jSONSchema, supplier, function, abstractC2761Arr);
            case 9:
                return new C2786(cls, j, jSONSchema, supplier, function, abstractC2761Arr);
            case 10:
                return new C2677(cls, j, jSONSchema, supplier, function, abstractC2761Arr);
            case 11:
                return new C2673(cls, j, jSONSchema, supplier, function, abstractC2761Arr);
            case 12:
                return new C2672(cls, j, jSONSchema, supplier, function, abstractC2761Arr);
            default:
                return new C2771(cls, str, null, j, jSONSchema, supplier, function, abstractC2761Arr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r5.f23094 != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.reader.AbstractC2761[] m5567(java.lang.Class r34, final java.lang.reflect.Type r35, p278.C8364 r36, boolean r37, final com.alibaba.fastjson2.reader.C2801 r38) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2775.m5567(java.lang.Class, java.lang.reflect.Type, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, boolean, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰[]");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final IntFunction m5568(Constructor constructor) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
        try {
            return (IntFunction) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9064, AbstractC2866.f9036, lookupM5723.findConstructor(declaringClass, AbstractC2866.f9053), MethodType.methodType(declaringClass, (Class<?>) Integer.TYPE)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8476.incrementAndGet();
            return null;
        }
    }
}
