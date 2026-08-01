package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p009.AbstractC6183;
import p291.AbstractC8494;
import p291.C8539;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2897 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final /* synthetic */ int f9161 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final byte f9164;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public String f9165;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C2894 f9166;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public IdentityHashMap f9167;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Object f9168;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f9169;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f9170;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f9171;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f9172;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final char f9174;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f9175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f9177;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2895 f9178;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final long f9163 = JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final long f9162 = (JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.NotWriteEmptyArray.mask) | JSONWriter$Feature.NotWriteDefaultValue.mask;

    public AbstractC2897(C2895 c2895, boolean z, Charset charset) {
        this.f9178 = c2895;
        this.f9171 = z;
        this.f9176 = !z && charset == StandardCharsets.UTF_8;
        this.f9177 = !z && charset == StandardCharsets.UTF_16;
        boolean z2 = (z || (c2895.f9153 & JSONWriter$Feature.UseSingleQuotes.mask) == 0) ? false : true;
        this.f9170 = z2;
        this.f9174 = z2 ? '\'' : '\"';
        long j = c2895.f9153;
        this.f9175 = (JSONWriter$Feature.LargeObject.mask & j) != 0 ? 1073741824 : 67108864;
        if ((JSONWriter$Feature.PrettyFormatWith4Space.mask & j) != 0) {
            this.f9164 = (byte) 4;
            return;
        }
        if ((JSONWriter$Feature.PrettyFormatWith2Space.mask & j) != 0) {
            this.f9164 = (byte) 2;
        } else if ((j & JSONWriter$Feature.PrettyFormat.mask) != 0) {
            this.f9164 = (byte) 1;
        } else {
            this.f9164 = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m6051(BigInteger bigInteger, long j) {
        if ((256 & j) != 0) {
            return true;
        }
        if ((j & 32) != 0) {
            return bigInteger.compareTo(AbstractC2867.f9045) < 0 || bigInteger.compareTo(AbstractC2867.f9044) > 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6052(java.math.BigDecimal r6, long r7) {
        /*
            r0 = 256(0x100, double:1.265E-321)
            long r0 = r0 & r7
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L51
            r4 = 32
            long r7 = r7 & r4
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L50
            java.lang.Class r7 = com.alibaba.fastjson2.util.AbstractC2867.f9051
            int r7 = r6.precision()
            r0 = 16
            if (r7 < r0) goto L33
            java.math.BigInteger r7 = r6.unscaledValue()
            java.math.BigInteger r0 = com.alibaba.fastjson2.util.AbstractC2867.f9045
            int r0 = r7.compareTo(r0)
            if (r0 < 0) goto L31
            java.math.BigInteger r0 = com.alibaba.fastjson2.util.AbstractC2867.f9044
            int r7 = r7.compareTo(r0)
            if (r7 > 0) goto L31
            goto L33
        L31:
            r7 = r8
            goto L34
        L33:
            r7 = r1
        L34:
            if (r7 != 0) goto L4d
            int r0 = r6.scale()
            if (r0 == 0) goto L4d
            double r2 = r6.doubleValue()     // Catch: java.lang.Exception -> L4c
            java.math.BigDecimal r7 = java.math.BigDecimal.valueOf(r2)
            int r6 = r6.compareTo(r7)
            if (r6 != 0) goto L4c
            r7 = r1
            goto L4d
        L4c:
            r7 = r8
        L4d:
            if (r7 != 0) goto L50
            goto L51
        L50:
            r1 = r8
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2897.m6052(java.math.BigDecimal, long):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m6053(long j, long j2) {
        if ((17179869440L & j2) != 0) {
            return true;
        }
        if ((j2 & 32) == 0) {
            return false;
        }
        Class cls = AbstractC2867.f9051;
        return j < -9007199254740991L || j > 9007199254740991L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static IllegalArgumentException m6054(int i) {
        return new IllegalArgumentException(AbstractC6183.m11588(i, "Only 4 digits numbers are supported. Provided: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static AbstractC2897 m6055(JSONWriter$Feature... jSONWriter$FeatureArr) {
        String str = AbstractC2933.f9289;
        C2895 c2895 = new C2895(AbstractC2933.f9294, jSONWriter$FeatureArr);
        return AbstractC2854.f8918 == 8 ? (AbstractC2854.f8917 == null || AbstractC2854.f8929 || AbstractC2854.f8932) ? new C2893(c2895) : new C2909(c2895) : (c2895.f9153 & JSONWriter$Feature.OptimizedForAscii.mask) != 0 ? new C2906(c2895) : (AbstractC2854.f8917 == null || AbstractC2854.f8926 == null || AbstractC2854.f8927 == null) ? new C2892(c2895) : new C2910(c2895);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static AbstractC2897 m6056(C2895 c2895) {
        return AbstractC2854.f8918 == 8 ? (AbstractC2854.f8917 == null || AbstractC2854.f8929 || AbstractC2854.f8932) ? new C2893(c2895) : new C2909(c2895) : (c2895.f9153 & JSONWriter$Feature.OptimizedForAscii.mask) != 0 ? new C2906(c2895) : (AbstractC2854.f8917 == null || AbstractC2854.f8926 == null || AbstractC2854.f8927 == null) ? new C2892(c2895) : new C2910(c2895);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static AbstractC2897 m6057() {
        C2895 c2895 = new C2895(AbstractC2933.f9294);
        if (AbstractC2854.f8918 == 8) {
            return (AbstractC2854.f8917 == null || AbstractC2854.f8929 || AbstractC2854.f8932) ? new C2893(c2895) : new C2909(c2895);
        }
        long j = JSONWriter$Feature.OptimizedForAscii.mask;
        return 0 != 0 ? new C2906(c2895) : (AbstractC2854.f8917 == null || AbstractC2854.f8926 == null || AbstractC2854.f8927 == null) ? new C2892(c2895) : new C2910(c2895);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6058(java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
        /*
            r6 = this;
            com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰 r0 = r6.f9178
            long r0 = r0.f9153
            long r9 = r9 | r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter$Feature.WriteClassName
            long r0 = r0.mask
            long r0 = r0 & r9
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L64
        L11:
            if (r7 != 0) goto L14
            goto L64
        L14:
            java.lang.Class r0 = r7.getClass()
            boolean r1 = r8 instanceof java.lang.Class
            if (r1 == 0) goto L1f
            java.lang.Class r8 = (java.lang.Class) r8
            goto L31
        L1f:
            boolean r1 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L30
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type r8 = r8.getRawType()
            boolean r1 = r8 instanceof java.lang.Class
            if (r1 == 0) goto L30
            java.lang.Class r8 = (java.lang.Class) r8
            goto L31
        L30:
            r8 = 0
        L31:
            if (r0 != r8) goto L34
            goto L64
        L34:
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter$Feature.NotWriteHashMapArrayListClassName
            long r4 = r1.mask
            long r4 = r4 & r9
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L55
            java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
            if (r0 != r1) goto L50
            if (r8 == 0) goto L64
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r8 == r0) goto L64
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            if (r8 == r0) goto L64
            java.lang.Class<java.util.AbstractMap> r0 = java.util.AbstractMap.class
            if (r8 != r0) goto L55
            goto L64
        L50:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            if (r0 != r8) goto L55
            goto L64
        L55:
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter$Feature.NotWriteRootClassName
            long r0 = r8.mask
            long r8 = r9 & r0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L66
            java.lang.Object r6 = r6.f9168
            if (r7 == r6) goto L64
            goto L66
        L64:
            r6 = 0
            return r6
        L66:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2897.m6058(java.lang.Object, java.lang.reflect.Type, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if ((r2.isArray() ? r2.getComponentType().equals(r10) : false) != false) goto L41;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6059(java.lang.Object r9, java.lang.reflect.Type r10) {
        /*
            r8 = this;
            com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰 r0 = r8.f9178
            long r0 = r0.f9153
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter$Feature.WriteClassName
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L7c
            if (r9 != 0) goto L14
            goto L7c
        L14:
            java.lang.Class r2 = r9.getClass()
            boolean r6 = r10 instanceof java.lang.Class
            if (r6 == 0) goto L1f
            java.lang.Class r10 = (java.lang.Class) r10
            goto L58
        L1f:
            boolean r6 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r6 == 0) goto L46
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r10 = r10.getGenericComponentType()
            boolean r6 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L33
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r10 = r10.getRawType()
        L33:
            boolean r6 = r2.isArray()
            if (r6 == 0) goto L42
            java.lang.Class r6 = r2.getComponentType()
            boolean r10 = r6.equals(r10)
            goto L43
        L42:
            r10 = r3
        L43:
            if (r10 == 0) goto L57
            goto L7c
        L46:
            boolean r6 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L57
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r10 = r10.getRawType()
            boolean r6 = r10 instanceof java.lang.Class
            if (r6 == 0) goto L57
            java.lang.Class r10 = (java.lang.Class) r10
            goto L58
        L57:
            r10 = 0
        L58:
            if (r2 != r10) goto L5b
            goto L7c
        L5b:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter$Feature.NotWriteHashMapArrayListClassName
            long r6 = r10.mask
            long r6 = r6 & r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 == 0) goto L6d
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            if (r2 == r10) goto L7c
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            if (r2 != r10) goto L6d
            goto L7c
        L6d:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter$Feature.NotWriteRootClassName
            long r6 = r10.mask
            long r0 = r0 & r6
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 == 0) goto L7a
            java.lang.Object r8 = r8.f9168
            if (r9 == r8) goto L7c
        L7a:
            r8 = 1
            return r8
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2897.m6059(java.lang.Object, java.lang.reflect.Type):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m6060(Object obj, long j) {
        Class<?> cls;
        long j2 = j | this.f9178.f9153;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9168;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean m6061(Object obj) {
        Class<?> cls;
        long j = this.f9178.f9153;
        if ((JSONWriter$Feature.WriteClassName.mask & j) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9168;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean m6062(Class cls, Object obj) {
        Class<?> cls2;
        long j = this.f9178.f9153;
        if ((JSONWriter$Feature.WriteClassName.mask & j) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return (j & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9168;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean m6063(long j, Class cls, Object obj) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f9178.f9153;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9168;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean m6064(long j, Class cls, Object obj) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f9178.f9153;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) == 0 || cls2 != HashMap.class) {
            return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9168;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public abstract void mo5960(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public abstract void mo5961(LocalDate localDate);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public abstract void mo5962(Long l);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public abstract void mo5963(long j);

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public abstract void mo5964(byte b);

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public abstract void mo5965(long[] jArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m6065() {
        if ((this.f9178.f9153 & 16777280) != 0) {
            mo5973(0);
        } else {
            mo5967();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void m6066(Class cls) {
        if ((this.f9178.f9153 & 64) == 0) {
            mo5967();
        } else if (cls == Character.class) {
            mo6017("\u0000");
        } else {
            mo6011('{', '}');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public abstract void mo5966(char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public abstract void mo5967();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public abstract void mo5968(OffsetTime offsetTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public abstract void mo5969(OffsetDateTime offsetDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public abstract void mo5970(short s);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public void mo6029(Instant instant) {
        if (instant == null) {
            mo5967();
        } else {
            mo6017(DateTimeFormatter.ISO_INSTANT.format(instant));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public abstract void mo5971(Integer num);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public abstract void mo5972(int[] iArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲 */
    public void mo6030(short[] sArr) {
        if (sArr == null) {
            mo6039();
            return;
        }
        mo5999();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                mo5982();
            }
            mo5970(sArr[i]);
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public abstract void mo5973(int i);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    public void mo6031(String str) {
        boolean z = false;
        if (this.f9172) {
            this.f9172 = false;
        } else {
            mo5982();
        }
        boolean z2 = (this.f9178.f9153 & JSONWriter$Feature.UnquoteFieldName.mask) != 0;
        if (!z2 || (str.indexOf(this.f9174) < 0 && str.indexOf(92) < 0)) {
            z = z2;
        }
        if (z) {
            mo6009(str);
        } else {
            mo6017(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public void mo6032(long j) {
        mo5963(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public abstract void mo5974(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    public void mo6033(long j, byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public abstract void mo5975(LocalDateTime localDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public abstract void mo5976(LocalTime localTime);

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public abstract void mo5977(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public abstract void mo5978(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public abstract void mo5979();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract void mo5980(char c);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public abstract void mo5981(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public abstract void mo5982();

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public abstract void mo5983(float f);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m6067(float f, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.f9171) {
            mo5983(f);
        } else if (Float.isNaN(f) || Float.isInfinite(f)) {
            mo5967();
        } else {
            mo6009(decimalFormat.format(f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public abstract void mo5984(double[] dArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public void mo6034(Enum r7) {
        if (r7 == null) {
            mo5967();
            return;
        }
        long j = this.f9178.f9153;
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & j) != 0) {
            mo6017(r7.toString());
        } else if ((j & JSONWriter$Feature.WriteEnumsUsingName.mask) != 0) {
            mo6017(r7.name());
        } else {
            mo5973(r7.ordinal());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public abstract void mo5985(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract void mo5986(float[] fArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public abstract void mo5987(BigInteger bigInteger, long j);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public abstract void mo5988(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public void mo6035(boolean[] zArr) {
        if (zArr == null) {
            mo6039();
            return;
        }
        mo5999();
        for (int i = 0; i < zArr.length; i++) {
            if (i != 0) {
                mo5982();
            }
            mo5989(zArr[i]);
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m6068() {
        if ((this.f9178.f9153 & (JSONWriter$Feature.WriteNullBooleanAsFalse.mask | 64)) != 0) {
            mo5989(false);
        } else {
            mo5967();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public void mo6036(byte[] bArr) {
        if (bArr == null) {
            mo6039();
            return;
        }
        if ((this.f9178.f9153 & JSONWriter$Feature.WriteByteArrayAsBase64.mask) != 0) {
            mo5988(bArr);
            return;
        }
        mo5999();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                mo5982();
            }
            mo5973(bArr[i]);
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public abstract void mo5989(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void m6069() {
        long j = this.f9178.f9153;
        if ((64 & j) != 0) {
            mo5991(0.0d);
        } else if ((j & 16777216) != 0) {
            mo5973(0);
        } else {
            mo5967();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public abstract void mo5990(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m6070(double d, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.f9171) {
            mo5991(d);
        } else if (Double.isNaN(d) || Double.isInfinite(d)) {
            mo5967();
        } else {
            mo6009(decimalFormat.format(d));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public abstract void mo5991(double d);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract void mo5992(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public abstract void mo5993(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo5994();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo5995();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6071(JSONWriter$Feature jSONWriter$Feature, boolean z) {
        C2895 c2895 = this.f9178;
        long j = c2895.f9153;
        if (z) {
            c2895.f9153 = jSONWriter$Feature.mask | j;
        } else {
            c2895.f9153 = (~jSONWriter$Feature.mask) & j;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m6072() {
        long j = this.f9178.f9153;
        return (JSONWriter$Feature.ReferenceDetection.mask & j) != 0 && (j & 144115188075855872L) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m6073(Object obj) {
        long j = this.f9178.f9153;
        return ((JSONWriter$Feature.ReferenceDetection.mask & j) == 0 || (j & 144115188075855872L) != 0 || obj == null || C8539.m14105(obj.getClass())) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m6074(long j) {
        return (this.f9178.f9153 & j) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m6075() {
        return (this.f9178.f9153 & JSONWriter$Feature.IgnoreErrorGetter.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m6076(JSONWriter$Feature jSONWriter$Feature) {
        return (jSONWriter$Feature.mask & this.f9178.f9153) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC8523 m6077(Class cls) {
        C2895 c2895 = this.f9178;
        return c2895.f9154.m14106(cls, cls, (c2895.f9153 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m6078(long j) {
        return this.f9178.f9153 | j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m6079() {
        return (this.f9178.f9153 & JSONWriter$Feature.BeanToArray.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC8523 m6080(Class cls, Type type) {
        C2895 c2895 = this.f9178;
        return c2895.f9154.m14106(type, cls, (c2895.f9153 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final String m6081(int i, Object obj) {
        if (m6073(obj)) {
            return m6086(i, obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m6082(Object obj) {
        C2894 c2894 = this.f9166;
        if (c2894 == null || (this.f9178.f9153 & 131072) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET) {
            return;
        }
        this.f9166 = c2894.f9149;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m6083(Object obj) {
        if (m6073(obj)) {
            m6082(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void m6084() {
        throw new JSONException("level too large : " + this.f9173);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public void mo6037(Object obj) {
        if (obj == null) {
            mo5967();
        } else {
            Class<?> cls = obj.getClass();
            this.f9178.m6026(cls, cls).mo5679(this, obj, null, null, 0L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public void mo5996(Map map) {
        if (map == null) {
            mo5967();
            return;
        }
        if (map.isEmpty()) {
            mo6011('{', '}');
            return;
        }
        C2895 c2895 = this.f9178;
        if ((c2895.f9153 & f9162) != 0) {
            c2895.m6027(map.getClass()).mo5679(this, map, null, null, 0L);
            return;
        }
        mo5997();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (c2895.f9153 & JSONWriter$Feature.WriteMapNullValue.mask) != 0) {
                if (!z) {
                    mo5982();
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    mo6017((String) key);
                } else {
                    mo6037(key);
                }
                mo5979();
                if (value == null) {
                    mo5967();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        mo6017((String) value);
                    } else if (cls == Integer.class) {
                        mo5971((Integer) value);
                    } else if (cls == Long.class) {
                        mo5962((Long) value);
                    } else if (cls == Boolean.class) {
                        mo5989(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        mo5990((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        mo5998((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        mo5996((JSONObject) value);
                    } else {
                        c2895.m6026(cls, cls).mo5679(this, value, null, null, 0L);
                    }
                }
                z = false;
            }
        }
        mo5994();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public void mo6038(long j) {
        mo6009((j & 4194368) != 0 ? "[]" : "null");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo6039() {
        mo6038(this.f9178.f9153);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public abstract void mo5997();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public abstract void mo5998(List list);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m6085(Object obj) {
        this.f9168 = obj;
        this.f9166 = C2894.f9143;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final String m6086(int i, Object obj) {
        C2894 c2894;
        C2894 c28942;
        C2894 c28943;
        C2894 c28944 = this.f9166;
        if (c28944 == null) {
            return null;
        }
        if (i == 0) {
            c2894 = c28944.f9145;
            if (c2894 == null) {
                c2894 = new C2894(c28944, i);
                c28944.f9145 = c2894;
            }
        } else if (i == 1) {
            c2894 = c28944.f9144;
            if (c2894 == null) {
                c2894 = new C2894(c28944, i);
                c28944.f9144 = c2894;
            }
        } else {
            c2894 = new C2894(c28944, i);
        }
        this.f9166 = c2894;
        if (obj == this.f9168) {
            c28943 = C2894.f9143;
        } else {
            IdentityHashMap identityHashMap = this.f9167;
            if (identityHashMap == null || (c28942 = (C2894) identityHashMap.get(obj)) == null) {
                if (this.f9167 == null) {
                    this.f9167 = new IdentityHashMap(8);
                }
                this.f9167.put(obj, this.f9166);
                return null;
            }
            c28943 = c28942;
        }
        return c28943.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public void mo6040(int i) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public abstract void mo5999();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final String m6087(Object obj, String str) {
        C2894 c2894;
        C2894 c28942;
        if (!m6073(obj)) {
            return null;
        }
        this.f9166 = new C2894(this.f9166, str);
        if (obj == this.f9168) {
            c28942 = C2894.f9143;
        } else {
            IdentityHashMap identityHashMap = this.f9167;
            if (identityHashMap == null || (c2894 = (C2894) identityHashMap.get(obj)) == null) {
                if (this.f9167 == null) {
                    this.f9167 = new IdentityHashMap(8);
                }
                this.f9167.put(obj, this.f9166);
                return null;
            }
            c28942 = c2894;
        }
        return c28942.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final String m6088(AbstractC8494 abstractC8494, Object obj) {
        C2894 c2894;
        IdentityHashMap identityHashMap;
        if (!m6073(obj)) {
            return null;
        }
        C2894 c28942 = this.f9166;
        C2894 c28943 = C2894.f9143;
        if (c28942 == c28943) {
            c2894 = abstractC8494.f23607;
        } else {
            String str = abstractC8494.f23618;
            C2894 c28944 = abstractC8494.f23597;
            if (c28944 == null) {
                c28944 = new C2894(c28942, str);
                abstractC8494.f23597 = c28944;
            } else if (c28944.f9149 != c28942) {
                c2894 = new C2894(c28942, str);
            }
            c2894 = c28944;
        }
        this.f9166 = c2894;
        if (obj == this.f9168 || ((identityHashMap = this.f9167) != null && (c28943 = (C2894) identityHashMap.get(obj)) != null)) {
            return c28943.toString();
        }
        if (this.f9167 == null) {
            this.f9167 = new IdentityHashMap(8);
        }
        this.f9167.put(obj, this.f9166);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final int m6089(int i, int i2) {
        int i3 = i2 + (i2 >> 1);
        if (i3 - i < 0) {
            i3 = i;
        }
        int i4 = this.f9175;
        if (i3 <= i4) {
            return i3;
        }
        if (i < i4) {
            return i4;
        }
        throw new JSONLargeObjectException(AbstractC6183.m11591(i, i4, "Maximum array size exceeded. Try enabling LargeObject feature instead. Requested size: ", ", max size: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public abstract void mo6001(ZonedDateTime zonedDateTime);

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public abstract void mo6002(UUID uuid);

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    public void mo6042(String str) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    public void mo6043(long j, byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public abstract void mo6008(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public abstract void mo6009(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public void mo6010(int i, char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰 */
    public void mo6011(char c, char c2) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public abstract void mo6012(char c);

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public void mo6045(byte b) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public void mo6046(short[] sArr) {
        if (sArr == null) {
            mo6039();
            return;
        }
        mo5999();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                mo5982();
            }
            mo6018(sArr[i]);
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public void mo6013(String[] strArr) {
        if (strArr == null) {
            mo6039();
            return;
        }
        mo5999();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                mo5982();
            }
            mo6017(strArr[i]);
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    public void mo6047(String str) {
        mo6017(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public abstract void mo6014(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public abstract void mo6015(int i, char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世 */
    public void mo6048() {
        long j = this.f9178.f9153;
        mo6009((8388672 & j) != 0 ? (j & 1048576) != 0 ? "''" : "\"\"" : "null");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public void mo6016(List list) {
        mo5999();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                mo5982();
            }
            mo6017((String) list.get(i));
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public abstract void mo6017(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public void mo6049(byte[] bArr) {
        mo5999();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                mo5982();
            }
            mo6023(bArr[i]);
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public void mo6050(long[] jArr) {
        if (jArr == null) {
            mo6039();
            return;
        }
        mo5999();
        for (int i = 0; i < jArr.length; i++) {
            if (i != 0) {
                mo5982();
            }
            mo6022(jArr[i]);
        }
        mo5995();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public abstract void mo6018(short s);

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public abstract void mo6019(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    public final boolean m6090(int i, Object obj) {
        String strM6081 = m6081(i, obj);
        if (strM6081 == null) {
            return false;
        }
        mo6020(strM6081);
        m6083(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public abstract void mo6020(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public abstract void mo6021(int i, char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public abstract void mo6022(long j);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public abstract void mo6023(byte b);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public abstract void mo6024(int i);
}
