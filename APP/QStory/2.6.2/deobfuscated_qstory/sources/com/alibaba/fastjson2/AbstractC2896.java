package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;
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
import p007.AbstractC6136;
import p291.AbstractC8502;
import p291.C8547;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2896 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final /* synthetic */ int f9159 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final byte f9162;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public String f9163;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C2893 f9164;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public IdentityHashMap f9165;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Object f9166;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f9167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f9168;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f9169;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f9170;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9171;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final char f9172;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f9173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f9175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2894 f9176;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final long f9161 = JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final long f9160 = (JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.NotWriteEmptyArray.mask) | JSONWriter$Feature.NotWriteDefaultValue.mask;

    public AbstractC2896(C2894 c2894, boolean z, Charset charset) {
        this.f9176 = c2894;
        this.f9169 = z;
        this.f9174 = !z && charset == StandardCharsets.UTF_8;
        this.f9175 = !z && charset == StandardCharsets.UTF_16;
        boolean z2 = (z || (c2894.f9151 & JSONWriter$Feature.UseSingleQuotes.mask) == 0) ? false : true;
        this.f9168 = z2;
        this.f9172 = z2 ? '\'' : '\"';
        long j = c2894.f9151;
        this.f9173 = (JSONWriter$Feature.LargeObject.mask & j) != 0 ? 1073741824 : 67108864;
        if ((JSONWriter$Feature.PrettyFormatWith4Space.mask & j) != 0) {
            this.f9162 = (byte) 4;
            return;
        }
        if ((JSONWriter$Feature.PrettyFormatWith2Space.mask & j) != 0) {
            this.f9162 = (byte) 2;
        } else if ((j & JSONWriter$Feature.PrettyFormat.mask) != 0) {
            this.f9162 = (byte) 1;
        } else {
            this.f9162 = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m6006(BigInteger bigInteger, long j) {
        if ((256 & j) != 0) {
            return true;
        }
        if ((j & 32) != 0) {
            return bigInteger.compareTo(AbstractC2866.f9043) < 0 || bigInteger.compareTo(AbstractC2866.f9042) > 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6007(java.math.BigDecimal r6, long r7) {
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
            java.lang.Class r7 = com.alibaba.fastjson2.util.AbstractC2866.f9049
            int r7 = r6.precision()
            r0 = 16
            if (r7 < r0) goto L33
            java.math.BigInteger r7 = r6.unscaledValue()
            java.math.BigInteger r0 = com.alibaba.fastjson2.util.AbstractC2866.f9043
            int r0 = r7.compareTo(r0)
            if (r0 < 0) goto L31
            java.math.BigInteger r0 = com.alibaba.fastjson2.util.AbstractC2866.f9042
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2896.m6007(java.math.BigDecimal, long):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m6008(long j, long j2) {
        if ((17179869440L & j2) != 0) {
            return true;
        }
        if ((j2 & 32) == 0) {
            return false;
        }
        Class cls = AbstractC2866.f9049;
        return j < -9007199254740991L || j > 9007199254740991L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static IllegalArgumentException m6009(int i) {
        return new IllegalArgumentException(AbstractC6136.m11556(i, "Only 4 digits numbers are supported. Provided: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static AbstractC2896 m6010(JSONWriter$Feature... jSONWriter$FeatureArr) {
        String str = AbstractC2932.f9287;
        C2894 c2894 = new C2894(AbstractC2932.f9292, jSONWriter$FeatureArr);
        return AbstractC2853.f8916 == 8 ? (AbstractC2853.f8915 == null || AbstractC2853.f8927 || AbstractC2853.f8930) ? new C2892(c2894) : new C2908(c2894) : (c2894.f9151 & JSONWriter$Feature.OptimizedForAscii.mask) != 0 ? new C2905(c2894) : (AbstractC2853.f8915 == null || AbstractC2853.f8924 == null || AbstractC2853.f8925 == null) ? new C2891(c2894) : new C2909(c2894);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static AbstractC2896 m6011(C2894 c2894) {
        return AbstractC2853.f8916 == 8 ? (AbstractC2853.f8915 == null || AbstractC2853.f8927 || AbstractC2853.f8930) ? new C2892(c2894) : new C2908(c2894) : (c2894.f9151 & JSONWriter$Feature.OptimizedForAscii.mask) != 0 ? new C2905(c2894) : (AbstractC2853.f8915 == null || AbstractC2853.f8924 == null || AbstractC2853.f8925 == null) ? new C2891(c2894) : new C2909(c2894);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static AbstractC2896 m6012() {
        C2894 c2894 = new C2894(AbstractC2932.f9292);
        if (AbstractC2853.f8916 == 8) {
            return (AbstractC2853.f8915 == null || AbstractC2853.f8927 || AbstractC2853.f8930) ? new C2892(c2894) : new C2908(c2894);
        }
        long j = JSONWriter$Feature.OptimizedForAscii.mask;
        return 0 != 0 ? new C2905(c2894) : (AbstractC2853.f8915 == null || AbstractC2853.f8924 == null || AbstractC2853.f8925 == null) ? new C2891(c2894) : new C2909(c2894);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean m6013(Object obj, long j) {
        Class<?> cls;
        long j2 = j | this.f9176.f9151;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9166;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if ((r2.isArray() ? r2.getComponentType().equals(r10) : false) != false) goto L41;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6014(java.lang.Object r9, java.lang.reflect.Type r10) {
        /*
            r8 = this;
            com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰 r0 = r8.f9176
            long r0 = r0.f9151
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
            java.lang.Object r8 = r8.f9166
            if (r9 == r8) goto L7c
        L7a:
            r8 = 1
            return r8
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2896.m6014(java.lang.Object, java.lang.reflect.Type):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m6015(Object obj) {
        Class<?> cls;
        long j = this.f9176.f9151;
        if ((JSONWriter$Feature.WriteClassName.mask & j) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9166;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean m6016(Class cls, Object obj) {
        Class<?> cls2;
        long j = this.f9176.f9151;
        if ((JSONWriter$Feature.WriteClassName.mask & j) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return (j & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9166;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean m6017(long j, Class cls, Object obj) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f9176.f9151;
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
        return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9166;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m6018(long j, Class cls, Object obj) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f9176.f9151;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) == 0 || cls2 != HashMap.class) {
            return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9166;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public abstract void mo5915(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public abstract void mo5916(LocalDate localDate);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public abstract void mo5917(Long l);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public abstract void mo5918(long j);

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public abstract void mo5919(byte b);

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public abstract void mo5920(long[] jArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m6019() {
        if ((this.f9176.f9151 & 16777280) != 0) {
            mo5928(0);
        } else {
            mo5922();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void m6020(Class cls) {
        if ((this.f9176.f9151 & 64) == 0) {
            mo5922();
        } else if (cls == Character.class) {
            mo5972("\u0000");
        } else {
            mo5966('{', '}');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public abstract void mo5921(char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public abstract void mo5922();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public abstract void mo5923(OffsetTime offsetTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public abstract void mo5924(OffsetDateTime offsetDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public abstract void mo5925(short s);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public void mo5984(Instant instant) {
        if (instant == null) {
            mo5922();
        } else {
            mo5972(DateTimeFormatter.ISO_INSTANT.format(instant));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public abstract void mo5926(Integer num);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public abstract void mo5927(int[] iArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲 */
    public void mo5985(short[] sArr) {
        if (sArr == null) {
            mo5994();
            return;
        }
        mo5954();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5925(sArr[i]);
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public abstract void mo5928(int i);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    public void mo5986(String str) {
        boolean z = false;
        if (this.f9170) {
            this.f9170 = false;
        } else {
            mo5937();
        }
        boolean z2 = (this.f9176.f9151 & JSONWriter$Feature.UnquoteFieldName.mask) != 0;
        if (!z2 || (str.indexOf(this.f9172) < 0 && str.indexOf(92) < 0)) {
            z = z2;
        }
        if (z) {
            mo5964(str);
        } else {
            mo5972(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public void mo5987(long j) {
        mo5918(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public abstract void mo5929(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    public void mo5988(long j, byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public abstract void mo5930(LocalDateTime localDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public abstract void mo5931(LocalTime localTime);

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public abstract void mo5932(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public abstract void mo5933(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public abstract void mo5934();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract void mo5935(char c);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public abstract void mo5936(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public abstract void mo5937();

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public abstract void mo5938(float f);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m6021(float f, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.f9169) {
            mo5938(f);
        } else if (Float.isNaN(f) || Float.isInfinite(f)) {
            mo5922();
        } else {
            mo5964(decimalFormat.format(f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public abstract void mo5939(double[] dArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public void mo5989(Enum r7) {
        if (r7 == null) {
            mo5922();
            return;
        }
        long j = this.f9176.f9151;
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & j) != 0) {
            mo5972(r7.toString());
        } else if ((j & JSONWriter$Feature.WriteEnumsUsingName.mask) != 0) {
            mo5972(r7.name());
        } else {
            mo5928(r7.ordinal());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public abstract void mo5940(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract void mo5941(float[] fArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public abstract void mo5942(BigInteger bigInteger, long j);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public abstract void mo5943(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public void mo5990(boolean[] zArr) {
        if (zArr == null) {
            mo5994();
            return;
        }
        mo5954();
        for (int i = 0; i < zArr.length; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5944(zArr[i]);
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m6022() {
        if ((this.f9176.f9151 & (JSONWriter$Feature.WriteNullBooleanAsFalse.mask | 64)) != 0) {
            mo5944(false);
        } else {
            mo5922();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public void mo5991(byte[] bArr) {
        if (bArr == null) {
            mo5994();
            return;
        }
        if ((this.f9176.f9151 & JSONWriter$Feature.WriteByteArrayAsBase64.mask) != 0) {
            mo5943(bArr);
            return;
        }
        mo5954();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5928(bArr[i]);
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public abstract void mo5944(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void m6023() {
        long j = this.f9176.f9151;
        if ((64 & j) != 0) {
            mo5946(0.0d);
        } else if ((j & 16777216) != 0) {
            mo5928(0);
        } else {
            mo5922();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public abstract void mo5945(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m6024(double d, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.f9169) {
            mo5946(d);
        } else if (Double.isNaN(d) || Double.isInfinite(d)) {
            mo5922();
        } else {
            mo5964(decimalFormat.format(d));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public abstract void mo5946(double d);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract void mo5947(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public abstract void mo5948(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo5949();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo5950();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6025(JSONWriter$Feature jSONWriter$Feature, boolean z) {
        C2894 c2894 = this.f9176;
        long j = c2894.f9151;
        if (z) {
            c2894.f9151 = jSONWriter$Feature.mask | j;
        } else {
            c2894.f9151 = (~jSONWriter$Feature.mask) & j;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m6026() {
        return (this.f9176.f9151 & JSONWriter$Feature.IgnoreErrorGetter.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m6027(Object obj) {
        long j = this.f9176.f9151;
        return ((JSONWriter$Feature.ReferenceDetection.mask & j) == 0 || (j & 144115188075855872L) != 0 || obj == null || C8547.m14086(obj.getClass())) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m6028() {
        long j = this.f9176.f9151;
        return (JSONWriter$Feature.ReferenceDetection.mask & j) != 0 && (j & 144115188075855872L) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m6029(long j) {
        return (this.f9176.f9151 & j) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m6030(JSONWriter$Feature jSONWriter$Feature) {
        return (jSONWriter$Feature.mask & this.f9176.f9151) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC8531 m6031(Class cls) {
        C2894 c2894 = this.f9176;
        return c2894.f9152.m14087(cls, cls, (c2894.f9151 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m6032(long j) {
        return this.f9176.f9151 | j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m6033() {
        return (this.f9176.f9151 & JSONWriter$Feature.BeanToArray.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC8531 m6034(Class cls, Type type) {
        C2894 c2894 = this.f9176;
        return c2894.f9152.m14087(type, cls, (c2894.f9151 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final String m6035(int i, Object obj) {
        if (m6027(obj)) {
            return m6040(i, obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m6036(Object obj) {
        C2893 c2893 = this.f9164;
        if (c2893 == null || (this.f9176.f9151 & 131072) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET) {
            return;
        }
        this.f9164 = c2893.f9147;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m6037(Object obj) {
        if (m6027(obj)) {
            m6036(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void m6038() {
        throw new JSONException("level too large : " + this.f9171);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public void mo5992(Object obj) {
        if (obj == null) {
            mo5922();
        } else {
            Class<?> cls = obj.getClass();
            this.f9176.m5981(cls, cls).mo5634(this, obj, null, null, 0L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public void mo5951(Map map) {
        if (map == null) {
            mo5922();
            return;
        }
        if (map.isEmpty()) {
            mo5966('{', '}');
            return;
        }
        C2894 c2894 = this.f9176;
        if ((c2894.f9151 & f9160) != 0) {
            c2894.m5982(map.getClass()).mo5634(this, map, null, null, 0L);
            return;
        }
        mo5952();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (c2894.f9151 & JSONWriter$Feature.WriteMapNullValue.mask) != 0) {
                if (!z) {
                    mo5937();
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    mo5972((String) key);
                } else {
                    mo5992(key);
                }
                mo5934();
                if (value == null) {
                    mo5922();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        mo5972((String) value);
                    } else if (cls == Integer.class) {
                        mo5926((Integer) value);
                    } else if (cls == Long.class) {
                        mo5917((Long) value);
                    } else if (cls == Boolean.class) {
                        mo5944(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        mo5945((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        mo5953((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        mo5951((JSONObject) value);
                    } else {
                        c2894.m5981(cls, cls).mo5634(this, value, null, null, 0L);
                    }
                }
                z = false;
            }
        }
        mo5949();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public void mo5993(long j) {
        mo5964((j & 4194368) != 0 ? "[]" : "null");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo5994() {
        mo5993(this.f9176.f9151);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public abstract void mo5952();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public abstract void mo5953(List list);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m6039(Object obj) {
        this.f9166 = obj;
        this.f9164 = C2893.f9141;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final String m6040(int i, Object obj) {
        C2893 c2893;
        C2893 c28932;
        C2893 c28933;
        C2893 c28934 = this.f9164;
        if (c28934 == null) {
            return null;
        }
        if (i == 0) {
            c2893 = c28934.f9143;
            if (c2893 == null) {
                c2893 = new C2893(c28934, i);
                c28934.f9143 = c2893;
            }
        } else if (i == 1) {
            c2893 = c28934.f9142;
            if (c2893 == null) {
                c2893 = new C2893(c28934, i);
                c28934.f9142 = c2893;
            }
        } else {
            c2893 = new C2893(c28934, i);
        }
        this.f9164 = c2893;
        if (obj == this.f9166) {
            c28933 = C2893.f9141;
        } else {
            IdentityHashMap identityHashMap = this.f9165;
            if (identityHashMap == null || (c28932 = (C2893) identityHashMap.get(obj)) == null) {
                if (this.f9165 == null) {
                    this.f9165 = new IdentityHashMap(8);
                }
                this.f9165.put(obj, this.f9164);
                return null;
            }
            c28933 = c28932;
        }
        return c28933.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public void mo5995(int i) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public abstract void mo5954();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final String m6041(Object obj, String str) {
        C2893 c2893;
        C2893 c28932;
        if (!m6027(obj)) {
            return null;
        }
        this.f9164 = new C2893(this.f9164, str);
        if (obj == this.f9166) {
            c28932 = C2893.f9141;
        } else {
            IdentityHashMap identityHashMap = this.f9165;
            if (identityHashMap == null || (c2893 = (C2893) identityHashMap.get(obj)) == null) {
                if (this.f9165 == null) {
                    this.f9165 = new IdentityHashMap(8);
                }
                this.f9165.put(obj, this.f9164);
                return null;
            }
            c28932 = c2893;
        }
        return c28932.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final String m6042(AbstractC8502 abstractC8502, Object obj) {
        C2893 c2893;
        IdentityHashMap identityHashMap;
        if (!m6027(obj)) {
            return null;
        }
        C2893 c28932 = this.f9164;
        C2893 c28933 = C2893.f9141;
        if (c28932 == c28933) {
            c2893 = abstractC8502.f23616;
        } else {
            String str = abstractC8502.f23627;
            C2893 c28934 = abstractC8502.f23606;
            if (c28934 == null) {
                c28934 = new C2893(c28932, str);
                abstractC8502.f23606 = c28934;
            } else if (c28934.f9147 != c28932) {
                c2893 = new C2893(c28932, str);
            }
            c2893 = c28934;
        }
        this.f9164 = c2893;
        if (obj == this.f9166 || ((identityHashMap = this.f9165) != null && (c28933 = (C2893) identityHashMap.get(obj)) != null)) {
            return c28933.toString();
        }
        if (this.f9165 == null) {
            this.f9165 = new IdentityHashMap(8);
        }
        this.f9165.put(obj, this.f9164);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6043(java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
        /*
            r6 = this;
            com.alibaba.fastjson2.飘花落叶言子哲世楪苏兰 r0 = r6.f9176
            long r0 = r0.f9151
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
            java.lang.Object r6 = r6.f9166
            if (r7 == r6) goto L64
            goto L66
        L64:
            r6 = 0
            return r6
        L66:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2896.m6043(java.lang.Object, java.lang.reflect.Type, long):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final int m6044(int i, int i2) {
        int i3 = i2 + (i2 >> 1);
        if (i3 - i < 0) {
            i3 = i;
        }
        int i4 = this.f9173;
        if (i3 <= i4) {
            return i3;
        }
        if (i < i4) {
            return i4;
        }
        throw new JSONLargeObjectException(AbstractC6136.m11559(i, i4, "Maximum array size exceeded. Try enabling LargeObject feature instead. Requested size: ", ", max size: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public abstract void mo5956(ZonedDateTime zonedDateTime);

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public abstract void mo5957(UUID uuid);

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    public void mo5997(String str) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    public void mo5998(long j, byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public abstract void mo5963(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public abstract void mo5964(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public void mo5965(int i, char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰 */
    public void mo5966(char c, char c2) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public abstract void mo5967(char c);

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public void mo6000(byte b) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public void mo6001(short[] sArr) {
        if (sArr == null) {
            mo5994();
            return;
        }
        mo5954();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5973(sArr[i]);
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public void mo5968(String[] strArr) {
        if (strArr == null) {
            mo5994();
            return;
        }
        mo5954();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5972(strArr[i]);
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    public void mo6002(String str) {
        mo5972(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public abstract void mo5969(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public abstract void mo5970(int i, char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世 */
    public void mo6003() {
        long j = this.f9176.f9151;
        mo5964((8388672 & j) != 0 ? (j & 1048576) != 0 ? "''" : "\"\"" : "null");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public void mo5971(List list) {
        mo5954();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5972((String) list.get(i));
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public abstract void mo5972(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public void mo6004(byte[] bArr) {
        mo5954();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5978(bArr[i]);
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public void mo6005(long[] jArr) {
        if (jArr == null) {
            mo5994();
            return;
        }
        mo5954();
        for (int i = 0; i < jArr.length; i++) {
            if (i != 0) {
                mo5937();
            }
            mo5977(jArr[i]);
        }
        mo5950();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public abstract void mo5973(short s);

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public abstract void mo5974(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    public final boolean m6045(int i, Object obj) {
        String strM6035 = m6035(i, obj);
        if (strM6035 == null) {
            return false;
        }
        mo5975(strM6035);
        m6037(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public abstract void mo5975(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public abstract void mo5976(int i, char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public abstract void mo5977(long j);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public abstract void mo5978(byte b);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public abstract void mo5979(int i);
}
