package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
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
import p009.AbstractC6183;
import p278.C8363;
import p278.C8365;
import p295.InterfaceC8572;
import p295.InterfaceC8573;
import p295.InterfaceC8574;
import p295.InterfaceC8575;
import p295.InterfaceC8576;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2776 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f8475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2776 f8476;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f8477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f8478 = new AtomicInteger();

    static {
        f8477 = (AbstractC2854.f8929 || AbstractC2854.f8928) ? false : true;
        f8476 = new C2776();
        HashMap map = new HashMap();
        f8475 = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new C2773(cls, InterfaceC8576.class));
        Class cls2 = Byte.TYPE;
        map.put(cls2, new C2773(cls2, InterfaceC8575.class));
        Class cls3 = Short.TYPE;
        map.put(cls3, new C2773(cls3, InterfaceC8572.class));
        Class cls4 = Integer.TYPE;
        map.put(cls4, new C2773(cls4, ObjIntConsumer.class));
        Class cls5 = Long.TYPE;
        map.put(cls5, new C2773(cls5, ObjLongConsumer.class));
        Class cls6 = Character.TYPE;
        map.put(cls6, new C2773(cls6, InterfaceC8574.class));
        Class cls7 = Float.TYPE;
        map.put(cls7, new C2773(cls7, InterfaceC8573.class));
        Class cls8 = Double.TYPE;
        map.put(cls8, new C2773(cls8, ObjDoubleConsumer.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static AbstractC2762[] m5588(LinkedHashMap linkedHashMap) {
        AbstractC2762[] abstractC2762Arr = new AbstractC2762[linkedHashMap.values().stream().mapToInt(new C2774(0)).sum()];
        ((List) linkedHashMap.values().stream().flatMap(new C2769(4)).collect(Collectors.toList())).toArray(abstractC2762Arr);
        Arrays.sort(abstractC2762Arr);
        return abstractC2762Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5589(java.util.LinkedHashMap r5, java.lang.String r6, com.alibaba.fastjson2.reader.AbstractC2762 r7, java.lang.Class r8) {
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
            boolean r5 = r7.mo5485()
            java.lang.reflect.Method r6 = r7.f8427
            java.lang.reflect.Field r1 = r7.f8424
            if (r5 != 0) goto La3
            r5 = 0
        L1f:
            int r2 = r0.size()
            if (r5 >= r2) goto L76
            java.lang.Object r2 = r0.get(r5)
            com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰 r2 = (com.alibaba.fastjson2.reader.AbstractC2762) r2
            java.lang.reflect.Field r3 = r2.f8424
            if (r3 == 0) goto L4d
            java.lang.String r3 = r3.getName()
            if (r1 == 0) goto L40
            java.lang.String r4 = r1.getName()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L40
            goto L77
        L40:
            if (r6 == 0) goto L4d
            java.lang.String r4 = com.alibaba.fastjson2.reader.AbstractC2762.m5570(r7)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4d
            goto L77
        L4d:
            java.lang.reflect.Method r3 = r2.f8427
            if (r3 == 0) goto L73
            java.lang.String r3 = com.alibaba.fastjson2.reader.AbstractC2762.m5570(r2)
            if (r6 == 0) goto L64
            java.lang.String r4 = com.alibaba.fastjson2.reader.AbstractC2762.m5570(r7)
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
            java.lang.reflect.Field r5 = r2.f8424
            if (r5 == 0) goto L89
            java.lang.Class r5 = r5.getDeclaringClass()
            if (r5 == r8) goto La3
        L89:
            java.lang.reflect.Method r5 = r2.f8427
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5589(java.util.LinkedHashMap, java.lang.String, com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰, java.lang.Class):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m5590(java.lang.Class r7, java.lang.reflect.Method r8, java.lang.Class r9) {
        /*
            java.lang.invoke.MethodHandles$Lookup r0 = com.alibaba.fastjson2.util.AbstractC2854.m5768(r7)
            java.lang.Class r1 = r8.getReturnType()
            java.util.HashMap r2 = com.alibaba.fastjson2.reader.C2776.f8475
            java.lang.Object r2 = r2.get(r9)
            com.alibaba.fastjson2.reader.飘花落叶言子苏兰世哲楪 r2 = (com.alibaba.fastjson2.reader.C2773) r2
            java.lang.Class r3 = java.lang.Void.TYPE
            r6 = 0
            if (r2 == 0) goto L20
            java.lang.invoke.MethodType r4 = r2.f8471
            java.lang.invoke.MethodType r5 = r2.f8469
            if (r1 != r3) goto L1e
            java.lang.invoke.MethodType r2 = r2.f8470
            goto L25
        L1e:
            r2 = r6
            goto L25
        L20:
            java.lang.invoke.MethodType r4 = com.alibaba.fastjson2.util.AbstractC2867.f9062
            java.lang.invoke.MethodType r5 = com.alibaba.fastjson2.util.AbstractC2867.f9058
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
            androidx.collection.C0276.m843(r8, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5590(java.lang.Class, java.lang.reflect.Method, java.lang.Class):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.InterfaceC2788 m5591(com.alibaba.fastjson2.reader.C2802 r6, java.lang.reflect.Type r7, java.lang.Class r8, p278.C8363 r9) {
        /*
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r0 = r9.m13866()
            if (r0 != 0) goto L56
            java.lang.Class r1 = r9.f23064
            if (r1 != 0) goto Le
            java.lang.Class r1 = r9.f23065
            if (r1 == 0) goto L56
        Le:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L56
            java.lang.Class r1 = r9.f23064
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L2a
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L2a
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r1 = (com.alibaba.fastjson2.reader.InterfaceC2788) r1     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            java.lang.Class r4 = r9.f23065
            if (r4 == 0) goto L3d
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L3d
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r2 = r4.newInstance(r3)     // Catch: java.lang.Exception -> L3d
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r2 = (com.alibaba.fastjson2.reader.InterfaceC2788) r2     // Catch: java.lang.Exception -> L3d
            r3 = r2
        L3d:
            if (r1 != 0) goto L41
            if (r3 == 0) goto L56
        L41:
            long r4 = r9.f23045
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r7 = com.alibaba.fastjson2.reader.C2714.m5508(r7, r8, r4)
            boolean r9 = r7 instanceof com.alibaba.fastjson2.reader.C2715
            if (r9 == 0) goto L56
            com.alibaba.fastjson2.reader.飘花落叶言子兰苏哲世楪 r7 = (com.alibaba.fastjson2.reader.C2715) r7
            if (r1 == 0) goto L51
            r7.f8276 = r1
        L51:
            if (r3 == 0) goto L55
            r7.f8275 = r3
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
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5633(r7, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子哲楪兰世苏 r7 = com.alibaba.fastjson2.reader.C2733.f8340
            if (r6 == r7) goto L93
            goto L88
        L6f:
            java.lang.Class<java.math.BigInteger> r7 = java.math.BigInteger.class
            if (r8 != r7) goto L7c
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5633(r7, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪苏世 r7 = com.alibaba.fastjson2.reader.C2704.f8207
            if (r6 == r7) goto L93
            goto L88
        L7c:
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            if (r8 != r7) goto L93
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5633(r7, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子哲苏楪世兰 r7 = com.alibaba.fastjson2.reader.C2741.f8378
            if (r6 == r7) goto L93
        L88:
            r0 = r6
            goto L93
        L8a:
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r6 = r6.m5633(r1, r9)
            com.alibaba.fastjson2.reader.飘花落叶言子兰哲楪苏世 r7 = com.alibaba.fastjson2.reader.C2704.f8221
            if (r6 == r7) goto L93
            goto L88
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5591(com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, java.lang.reflect.Type, java.lang.Class, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m5592(Class cls, Type type, String str, String[] strArr, C8363 c8363, Field field, LinkedHashMap linkedHashMap, C2802 c2802) {
        String strM5826;
        String[] strArr2;
        int i;
        int i2;
        String str2;
        c2802.m5622(c8363, cls, field);
        if (!c8363.f23044 || ((c8363.f23045 & 562949953421312L) != 0 && Map.class.isAssignableFrom(field.getType()))) {
            String str3 = c8363.f23049;
            if (str3 == null || str3.isEmpty()) {
                String name = field.getName();
                strM5826 = str != null ? AbstractC2865.m5826(name, str) : name;
            } else {
                strM5826 = c8363.f23049;
            }
            if (strArr != null && strArr.length > 0) {
                int i3 = 0;
                while (true) {
                    if (i3 < strArr.length) {
                        if (strM5826.equals(strArr[i3])) {
                            c8363.f23046 = i3;
                            break;
                        }
                        i3++;
                    } else if (c8363.f23046 == 0) {
                        c8363.f23046 = strArr.length;
                    }
                }
            }
            Type genericType = field.getGenericType();
            Class<?> type2 = field.getType();
            InterfaceC2788 interfaceC2788M5591 = m5591(c2802, genericType, type2, c8363);
            String str4 = c8363.f23057;
            if (c8363.f23051 && str4 == null) {
                str4 = "{\"required\":true}";
            }
            String str5 = str4;
            String str6 = strM5826;
            String str7 = str6;
            m5589(linkedHashMap, str7, m5594(cls, type, str6, c8363.f23046, c8363.f23045, c8363.f23048, c8363.f23056, c8363.f23059, str5, genericType, type2, field, interfaceC2788M5591, c8363.f23050, c8363.m13867()), cls);
            C8363 c83632 = c8363;
            String[] strArr3 = c83632.f23061;
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
                        m5589(linkedHashMap, str8, m5594(cls, type, str8, 0, c83632.f23045, null, c83632.f23056, c83632.f23059, str5, genericType, field.getType(), field, null, null, null), cls);
                    }
                    i4 = i2 + 1;
                    c83632 = c8363;
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
    public static com.alibaba.fastjson2.reader.AbstractC2762 m5593(java.lang.Class r17, java.lang.reflect.Type r18, java.lang.String r19, java.lang.reflect.Type r20, java.lang.Class r21, int r22, long r23, java.lang.String r25, java.util.Locale r26, java.lang.Object r27, com.alibaba.fastjson2.schema.JSONSchema r28, java.lang.reflect.Method r29, java.util.function.BiConsumer r30, com.alibaba.fastjson2.reader.InterfaceC2788 r31) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5593(java.lang.Class, java.lang.reflect.Type, java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Method, java.util.function.BiConsumer, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.AbstractC2762 m5594(java.lang.Class r16, java.lang.reflect.Type r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.util.Locale r23, java.lang.Object r24, java.lang.String r25, java.lang.reflect.Type r26, java.lang.Class r27, java.lang.reflect.Field r28, com.alibaba.fastjson2.reader.InterfaceC2788 r29, java.lang.String r30, java.util.function.BiConsumer r31) {
        /*
            Method dump skipped, instruction units count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5594(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Field, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世, java.lang.String, java.util.function.BiConsumer):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2737 m5595(Class cls, Method method, C2802 c2802) throws NoSuchMethodException {
        Class clsMo5626;
        C8363 c8363 = new C8363();
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; enumArr != null && i < enumArr.length; i++) {
            Enum r4 = enumArr[i];
            String strName = r4.name();
            linkedHashMap.put(Long.valueOf(AbstractC2860.m5774(strName)), r4);
            try {
                c8363.m13865();
                c2802.m5622(c8363, cls, cls.getField(strName));
                String str = c8363.f23049;
                if (str != null && !str.isEmpty() && !str.equals(strName)) {
                    linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2860.m5774(str)), r4);
                }
                String[] strArr = c8363.f23061;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2 != null && !str2.isEmpty()) {
                            linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2860.m5774(str2)), r4);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (int i2 = 0; enumArr != null && i2 < enumArr.length; i2++) {
            Enum r3 = enumArr[i2];
            String strName2 = r3.name();
            linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2860.m5773(strName2)), r3);
            String string = r3.toString();
            if (!strName2.equals(string)) {
                linkedHashMap.putIfAbsent(Long.valueOf(AbstractC2860.m5773(string)), r3);
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
        Member memberM5817 = AbstractC2865.m5817(cls, c2802);
        if (memberM5817 == null && c2802.f8680.size() > 0 && (clsMo5626 = c2802.mo5626(cls)) != null) {
            Member memberM58172 = AbstractC2865.m5817(clsMo5626, c2802);
            if (memberM58172 instanceof Field) {
                try {
                    memberM5817 = cls.getField(((Field) memberM58172).getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused2) {
                }
            } else if (memberM58172 instanceof Method) {
                memberM5817 = cls.getMethod(((Method) memberM58172).getName(), null);
            }
        }
        Member member = memberM5817;
        Enum[] enumArr2 = new Enum[size];
        for (int i4 = 0; i4 < size; i4++) {
            enumArr2[i4] = (Enum) linkedHashMap.get(Long.valueOf(jArr[i4]));
        }
        return new C2737(cls, method, member, enumArr2, enumArr, jArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Function m5596(Method method) {
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(method.getDeclaringClass());
        try {
            MethodHandle methodHandleFindVirtual = lookupM5768.findVirtual(method.getDeclaringClass(), method.getName(), MethodType.methodType(method.getReturnType()));
            MethodType methodTypeType = methodHandleFindVirtual.type();
            return (Function) (Object) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9064, methodTypeType.erase(), methodHandleFindVirtual, methodTypeType).getTarget().invoke();
        } catch (Throwable th) {
            C0276.m843("create fieldReader error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C2798 m5597(Constructor constructor, String... strArr) {
        constructor.setAccessible(true);
        C2746 c2746 = new C2746(null, constructor, null, null, null, strArr);
        Class declaringClass = constructor.getDeclaringClass();
        return new C2798(declaringClass, null, null, 0L, c2746, m5601(AbstractC2933.m6387(), declaringClass, declaringClass, constructor, constructor.getParameters(), strArr), null, null, null);
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
    public static com.alibaba.fastjson2.reader.AbstractC2762 m5598(java.lang.Class r19, java.lang.reflect.Type r20, java.lang.String r21, int r22, long r23, java.lang.String r25, java.util.Locale r26, java.lang.Object r27, java.lang.String r28, java.lang.reflect.Type r29, java.lang.Class r30, java.lang.reflect.Method r31, com.alibaba.fastjson2.reader.InterfaceC2788 r32, java.lang.String r33, java.util.function.BiConsumer r34) {
        /*
            Method dump skipped, instruction units count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5598(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世, java.lang.String, java.util.function.BiConsumer):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.AbstractC2762 m5599(java.lang.Class r15, java.lang.reflect.Type r16, java.lang.String r17, int r18, long r19, java.lang.String r21, java.util.Locale r22, java.lang.Object r23, java.lang.String r24, java.lang.reflect.Type r25, java.lang.Class r26, java.lang.reflect.Method r27, com.alibaba.fastjson2.reader.InterfaceC2788 r28) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5599(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.C2692 m5600(java.lang.Class r17, java.lang.reflect.Type r18, java.lang.String r19, int r20, long r21, java.lang.String r23, java.util.Locale r24, java.lang.String r25, java.lang.reflect.Type r26, java.lang.Class r27, java.lang.String r28, java.lang.Class r29, com.alibaba.fastjson2.reader.InterfaceC2788 r30) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5600(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.String, java.lang.Class, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):com.alibaba.fastjson2.reader.飘花落叶言子世苏哲楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC2762[] m5601(C2802 c2802, Class cls, Type type, Constructor constructor, Parameter[] parameterArr, String... strArr) {
        Class<?> cls2;
        String str;
        int i;
        int i2;
        Field fieldM5813;
        Class<?> declaringClass = constructor != null ? constructor.getDeclaringClass() : null;
        ArrayList arrayList = new ArrayList(parameterArr.length);
        int i3 = 0;
        int i4 = 0;
        while (i4 < parameterArr.length) {
            C8363 c8363 = new C8363();
            Parameter parameter = parameterArr[i4];
            String name = i4 < strArr.length ? strArr[i4] : parameter.getName();
            if (constructor != null) {
                cls2 = declaringClass;
                c2802.m5623(c8363, cls2, constructor, i4, parameter);
            } else {
                cls2 = declaringClass;
            }
            if (constructor != null && (fieldM5813 = AbstractC2865.m5813(cls2, name)) != null) {
                c2802.m5622(c8363, cls2, fieldM5813);
            }
            String str2 = c8363.f23049;
            String strM11588 = (str2 == null || str2.isEmpty()) ? name : c8363.f23049;
            if (strM11588 == null) {
                strM11588 = AbstractC6183.m11588(i4, ParameterDescription.NAME_PREFIX);
            }
            if (name == null) {
                name = AbstractC6183.m11588(i4, ParameterDescription.NAME_PREFIX);
            }
            String str3 = name;
            InterfaceC2788 interfaceC2788M5591 = m5591(c2802, parameter.getParameterizedType(), parameter.getType(), c8363);
            Type parameterizedType = parameter.getParameterizedType();
            Type[] typeArr = AbstractC2865.f9017;
            Type typeM5784 = AbstractC2865.m5784(type, cls, parameterizedType, new HashMap());
            Type type2 = typeM5784 != null ? typeM5784 : parameterizedType;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            String str4 = strM11588;
            declaringClass = cls2;
            String str5 = str4;
            arrayList2.add(m5600(null, null, str4, i4, c8363.f23045, c8363.f23048, c8363.f23056, c8363.f23059, type2, parameter.getType(), str3, declaringClass, interfaceC2788M5591));
            String[] strArr2 = c8363.f23061;
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
                        arrayList2.add(m5600(null, null, str6, i4, c8363.f23045, c8363.f23048, c8363.f23056, c8363.f23059, type2, parameter.getType(), str3, declaringClass, interfaceC2788M5591));
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
        return (AbstractC2762[]) arrayList.toArray(new AbstractC2762[i3]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Function m5602(Method method, Class cls) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) cls);
            return (Function) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9064, AbstractC2867.f9060, lookupM5768.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8478.incrementAndGet();
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
    public final void m5603(java.lang.Class r22, java.lang.reflect.Type r23, java.lang.String r24, java.lang.String[] r25, p278.C8365 r26, p278.C8363 r27, java.lang.reflect.Method r28, java.util.LinkedHashMap r29, com.alibaba.fastjson2.reader.C2802 r30) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5603(java.lang.Class, java.lang.reflect.Type, java.lang.String, java.lang.String[], 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰, java.lang.reflect.Method, java.util.LinkedHashMap, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Function m5604(Constructor constructor) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9064, AbstractC2867.f9060, lookupM5768.findConstructor(declaringClass, AbstractC2867.f9039), MethodType.methodType(declaringClass, (Class<?>) String.class)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8478.incrementAndGet();
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
    public final com.alibaba.fastjson2.reader.InterfaceC2788 m5605(java.lang.Class r28, java.lang.reflect.Type r29, com.alibaba.fastjson2.reader.C2802 r30, p278.C8365 r31) {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5605(java.lang.Class, java.lang.reflect.Type, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Supplier m5606(Constructor constructor, boolean z) {
        if (z & f8477) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(declaringClass);
            try {
                if (constructor.getParameterCount() == 0) {
                    MethodHandle methodHandleFindConstructor = lookupM5768.findConstructor(declaringClass, AbstractC2867.f9054);
                    MethodType methodType = AbstractC2867.f9065;
                    MethodType methodType2 = AbstractC2867.f9063;
                    return (Supplier) LambdaMetafactory.metafactory(lookupM5768, "get", methodType, methodType2, methodHandleFindConstructor, methodType2).getTarget().invokeExact();
                }
            } catch (Throwable unused) {
                this.f8478.incrementAndGet();
            }
        }
        return new C2745(constructor);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Function m5607(Constructor constructor, Class cls) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9064, AbstractC2867.f9060, lookupM5768.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, (Class<?>) cls)), MethodType.methodType(declaringClass, (Class<?>) cls)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8478.incrementAndGet();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Function m5608(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) String.class);
            return (Function) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9064, AbstractC2867.f9060, lookupM5768.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8478.incrementAndGet();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Supplier m5609(Class cls) {
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return m5606(declaredConstructor, true);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            C0276.m843("get constructor error, class ".concat(cls.getName()), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C2798 mo5528(Class cls, C8365 c8365, Function function, ArrayList arrayList, String[] strArr, AbstractC2762[] abstractC2762Arr, AbstractC2762[] abstractC2762Arr2) {
        return new C2798(cls, c8365.f23092, c8365.f23091, c8365.f23100, function, abstractC2762Arr, abstractC2762Arr2, c8365.f23087, c8365.f23106);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final IntFunction m5610(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) Integer.TYPE);
            return (IntFunction) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9066, AbstractC2867.f9038, lookupM5768.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8478.incrementAndGet();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.reader.InterfaceC2788 m5611(final java.lang.Class r14, final java.lang.reflect.Type r15, final com.alibaba.fastjson2.reader.C2802 r16, final p278.C8365 r17) {
        /*
            r13 = this;
            r7 = r17
            java.lang.reflect.Method r0 = r7.f23089
            r11 = 1
            if (r0 == 0) goto L1d
            java.util.function.Function r0 = m5596(r0)     // Catch: java.lang.Throwable -> Lc
            goto L1b
        Lc:
            java.util.concurrent.atomic.AtomicInteger r1 = r13.f8478
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
            java.lang.Class r2 = r7.f23090
            java.lang.String r0 = r7.f23088
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
            boolean r14 = com.alibaba.fastjson2.util.AbstractC2865.m5801(r6)
            if (r14 == 0) goto L51
            goto Lb0
        L51:
            java.util.concurrent.ConcurrentHashMap r14 = com.alibaba.fastjson2.util.AbstractC2865.f9013
            java.lang.Object r15 = r14.get(r6)
            java.lang.reflect.Method[] r15 = (java.lang.reflect.Method[]) r15
            if (r15 != 0) goto L62
            java.lang.reflect.Method[] r15 = com.alibaba.fastjson2.util.AbstractC2865.m5796(r6)
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
            java.util.function.Supplier r8 = r13.m5609(r6)
            com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰[] r10 = m5588(r9)
            r7 = 0
            r4 = 0
            r3 = 0
            r2 = r6
            r5 = 0
            r1 = r13
            r9 = r12
            com.alibaba.fastjson2.reader.飘花落叶言子苏世楪哲兰 r13 = r1.mo5530(r2, r3, r4, r5, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5611(java.lang.Class, java.lang.reflect.Type, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
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
    public com.alibaba.fastjson2.reader.InterfaceC2788 mo5529(java.lang.Class r30, java.lang.reflect.Type r31, boolean r32, com.alibaba.fastjson2.reader.C2802 r33) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.mo5529(java.lang.Class, java.lang.reflect.Type, boolean, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public C2772 mo5530(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762... abstractC2762Arr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new C2772(cls, str, null, j, jSONSchema, supplier, function, abstractC2762Arr);
            }
        }
        if (str2 != null) {
            return new C2799(cls, str, str2, j, jSONSchema, supplier, function, abstractC2762Arr);
        }
        switch (abstractC2762Arr.length) {
            case 1:
                return new C2676(cls, j, jSONSchema, supplier, function, abstractC2762Arr[0]);
            case 2:
                return new C2675(cls, j, jSONSchema, supplier, function, abstractC2762Arr[0], abstractC2762Arr[1]);
            case 3:
                return new C2671(cls, supplier, j, jSONSchema, function, abstractC2762Arr[0], abstractC2762Arr[1], abstractC2762Arr[2]);
            case 4:
                return new C2672(cls, j, jSONSchema, supplier, function, abstractC2762Arr[0], abstractC2762Arr[1], abstractC2762Arr[2], abstractC2762Arr[3]);
            case 5:
                return new C2786(cls, supplier, j, jSONSchema, function, abstractC2762Arr[0], abstractC2762Arr[1], abstractC2762Arr[2], abstractC2762Arr[3], abstractC2762Arr[4]);
            case 6:
                return new C2785(cls, supplier, j, jSONSchema, function, abstractC2762Arr[0], abstractC2762Arr[1], abstractC2762Arr[2], abstractC2762Arr[3], abstractC2762Arr[4], abstractC2762Arr[5]);
            case 7:
                return new C2789(cls, j, jSONSchema, supplier, function, abstractC2762Arr);
            case 8:
                return new C2790(cls, j, jSONSchema, supplier, function, abstractC2762Arr);
            case 9:
                return new C2787(cls, j, jSONSchema, supplier, function, abstractC2762Arr);
            case 10:
                return new C2678(cls, j, jSONSchema, supplier, function, abstractC2762Arr);
            case 11:
                return new C2674(cls, j, jSONSchema, supplier, function, abstractC2762Arr);
            case 12:
                return new C2673(cls, j, jSONSchema, supplier, function, abstractC2762Arr);
            default:
                return new C2772(cls, str, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r5.f23093 != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.reader.AbstractC2762[] m5612(java.lang.Class r34, final java.lang.reflect.Type r35, p278.C8365 r36, boolean r37, final com.alibaba.fastjson2.reader.C2802 r38) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2776.m5612(java.lang.Class, java.lang.reflect.Type, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, boolean, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世):com.alibaba.fastjson2.reader.飘花落叶言子楪苏世哲兰[]");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final IntFunction m5613(Constructor constructor) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(declaringClass);
        try {
            return (IntFunction) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9066, AbstractC2867.f9038, lookupM5768.findConstructor(declaringClass, AbstractC2867.f9055), MethodType.methodType(declaringClass, (Class<?>) Integer.TYPE)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8478.incrementAndGet();
            return null;
        }
    }
}
